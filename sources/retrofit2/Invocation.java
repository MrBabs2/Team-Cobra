package retrofit2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Invocation {
    private final List<?> arguments;
    private final Method method;

    Invocation(Method method2, List<?> list) {
        this.method = method2;
        this.arguments = Collections.unmodifiableList(list);
    }

    /* renamed from: of */
    public static Invocation m40905of(Method method2, List<?> list) {
        C4758i.m7802a(method2, "method == null");
        C4758i.m7802a(list, "arguments == null");
        return new Invocation(method2, new ArrayList(list));
    }

    public List<?> arguments() {
        return this.arguments;
    }

    public Method method() {
        return this.method;
    }

    public String toString() {
        return String.format("%s.%s() %s", new Object[]{this.method.getDeclaringClass().getName(), this.method.getName(), this.arguments});
    }
}
