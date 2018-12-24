package BehavioralDesignPatterns.NullObject.DynamicNullObject;

import java.lang.reflect.Proxy;

public final class NullLog implements Log {

    @Override
    public void info(String msg) {

    }

    @Override
    public void warn(String msg) {

    }

    @SuppressWarnings("unchecked")
    <T> T nullObject() {
        return (T) Proxy.newProxyInstance(Log.class.getClassLoader(), new Class<?>[]{Log.class},
                (proxy, method, args) -> {
                    if (method.getReturnType().equals(Void.TYPE))
                        return null;
                    else
                        return method.getReturnType().getConstructor().newInstance();
                });
    }
}