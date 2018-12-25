package StructruralDesignPatterns.Proxy.DynamicProxy;

import java.lang.reflect.Proxy;

class Logging {

    @SuppressWarnings("unchecked")
    static <T> T withLogging(T target) {
        return (T) Proxy.newProxyInstance(
                Human.class.getClassLoader(),
                new Class<?>[]{Human.class},
                new LoggingHandler(target));
    }
}