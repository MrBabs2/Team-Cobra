package kotlin.p045h0.p046u.p047e;

import java.lang.reflect.Method;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p390m0.C12029b;
import kotlin.p215c0.p216c.C9113l;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo16641d2 = {"signature", "", "Ljava/lang/reflect/Method;", "getSignature", "(Ljava/lang/reflect/Method;)Ljava/lang/String;", "kotlin-reflection"}, mo16642k = 2, mo16643mv = {1, 1, 15})
/* renamed from: kotlin.h0.u.e.e0 */
/* compiled from: RuntimeTypeMapper.kt */
public final class C9216e0 {

    /* renamed from: kotlin.h0.u.e.e0$a */
    /* compiled from: RuntimeTypeMapper.kt */
    static final class C9217a extends C10203k implements C9113l<Class<?>, String> {

        /* renamed from: f */
        public static final C9217a f25750f = new C9217a();

        C9217a() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(Class<?> cls) {
            C10202j.m34174a((Object) cls, "it");
            return C12029b.m39749c(cls);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final String m29954b(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class[] parameterTypes = method.getParameterTypes();
        C10202j.m34174a((Object) parameterTypes, "parameterTypes");
        sb.append(C10519k.m35615a(parameterTypes, "", "(", ")", 0, (CharSequence) null, C9217a.f25750f, 24, (Object) null));
        Class<?> returnType = method.getReturnType();
        C10202j.m34174a((Object) returnType, "returnType");
        sb.append(C12029b.m39749c(returnType));
        return sb.toString();
    }
}
