package kotlin.p045h0.p046u.p047e.p222j0;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p390m0.C12029b;

/* renamed from: kotlin.h0.u.e.j0.m */
/* compiled from: ReflectKotlinClass.kt */
final class C9320m {

    /* renamed from: a */
    public static final C9320m f25888a = new C9320m();

    private C9320m() {
    }

    /* renamed from: a */
    public final String mo33685a(Method method) {
        C10202j.m34178b(method, "method");
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (Class cls : method.getParameterTypes()) {
            C10202j.m34174a((Object) cls, "parameterType");
            sb.append(C12029b.m39749c(cls));
        }
        sb.append(")");
        Class<?> returnType = method.getReturnType();
        C10202j.m34174a((Object) returnType, "method.returnType");
        sb.append(C12029b.m39749c(returnType));
        String sb2 = sb.toString();
        C10202j.m34174a((Object) sb2, "sb.toString()");
        return sb2;
    }

    /* renamed from: a */
    public final String mo33683a(Constructor<?> constructor) {
        C10202j.m34178b(constructor, "constructor");
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (Class cls : constructor.getParameterTypes()) {
            C10202j.m34174a((Object) cls, "parameterType");
            sb.append(C12029b.m39749c(cls));
        }
        sb.append(")V");
        String sb2 = sb.toString();
        C10202j.m34174a((Object) sb2, "sb.toString()");
        return sb2;
    }

    /* renamed from: a */
    public final String mo33684a(Field field) {
        C10202j.m34178b(field, "field");
        Class<?> type = field.getType();
        C10202j.m34174a((Object) type, "field.type");
        return C12029b.m39749c(type);
    }
}
