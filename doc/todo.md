#Todo

2021-07-11 13:17:07,781 ERROR [io.qua.ver.htt.run.QuarkusErrorHandler] (executor-thread-0) HTTP Request to /Patient/1 failed, error id: 5e093d66-ae61-4a00-b4b0-f01dd841834a-1: com.oracle.svm.core.jdk.UnsupportedFeatureError: Proxy class defined by interfaces [interface javax.ws.rs.core.HttpHeaders] not found. Generating proxy classes at runtime is not supported. Proxy classes need to be defined at image build time by specifying the list of interfaces that they implement. To define proxy classes use -H:DynamicProxyConfigurationFiles=<comma-separated-config-files> and -H:DynamicProxyConfigurationResources=<comma-separated-config-resources> options.
at com.oracle.svm.core.util.VMError.unsupportedFeature(VMError.java:87)
at com.oracle.svm.reflect.proxy.DynamicProxySupport.getProxyClass(DynamicProxySupport.java:113)
at java.lang.reflect.Proxy.getProxyConstructor(Proxy.java:66)
at java.lang.reflect.Proxy.newProxyInstance(Proxy.java:1006)
