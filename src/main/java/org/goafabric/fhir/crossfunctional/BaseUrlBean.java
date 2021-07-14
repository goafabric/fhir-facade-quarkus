package org.goafabric.fhir.crossfunctional;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class BaseUrlBean {
    @ConfigProperty(name = "adapter.personservice.url")
    String baseUrl;

    @ConfigProperty(name = "multi.tenancy.enabled", defaultValue = "false")
    Boolean multiTenancyEnabled;

    public String getUrl() {
        return multiTenancyEnabled
                ? baseUrl.replaceAll("%TENANT_ID%", TenantIdInterceptor.getTenantId())
                : baseUrl;
    }

    public String getCBName() {
        final String tenantId = multiTenancyEnabled ? TenantIdInterceptor.getTenantId() : "none";
        return "personservice-tenant-" + tenantId;
    }
}
