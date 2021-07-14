package org.goafabric.fhir.crossfunctional;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public class BaseUrlBean {
    final String baseUrl;

    final Boolean multiTenancyEnabled;

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
