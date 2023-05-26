package kotlin.p212b0;

import java.lang.reflect.Method;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.p219f0.C9136b;
import kotlin.p219f0.C9138c;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0011"}, mo16641d2 = {"Lkotlin/internal/PlatformImplementations;", "", "()V", "addSuppressed", "", "cause", "", "exception", "defaultPlatformRandom", "Lkotlin/random/Random;", "getMatchResultNamedGroup", "Lkotlin/text/MatchGroup;", "matchResult", "Ljava/util/regex/MatchResult;", "name", "", "ReflectAddSuppressedMethod", "kotlin-stdlib"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: kotlin.b0.a */
/* compiled from: PlatformImplementations.kt */
public class C9093a {

    /* renamed from: kotlin.b0.a$a */
    /* compiled from: PlatformImplementations.kt */
    private static final class C9094a {

        /* renamed from: a */
        public static final Method f25670a;

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0047 A[EDGE_INSN: B:13:0x0047->B:11:0x0047 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0043 A[LOOP:0: B:1:0x0013->B:9:0x0043, LOOP_END] */
        static {
            /*
                kotlin.b0.a$a r0 = new kotlin.b0.a$a
                r0.<init>()
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableClass.methods"
                kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r1, (java.lang.String) r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            L_0x0013:
                if (r4 >= r2) goto L_0x0046
                r5 = r1[r4]
                java.lang.String r6 = "it"
                kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r5, (java.lang.String) r6)
                java.lang.String r6 = r5.getName()
                java.lang.String r7 = "addSuppressed"
                boolean r6 = kotlin.jvm.internal.C10202j.m34176a((java.lang.Object) r6, (java.lang.Object) r7)
                if (r6 == 0) goto L_0x003f
                java.lang.Class[] r6 = r5.getParameterTypes()
                java.lang.String r7 = "it.parameterTypes"
                kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r6, (java.lang.String) r7)
                java.lang.Object r6 = kotlin.p262y.C10519k.m35652j(r6)
                java.lang.Class r6 = (java.lang.Class) r6
                boolean r6 = kotlin.jvm.internal.C10202j.m34176a((java.lang.Object) r6, (java.lang.Object) r0)
                if (r6 == 0) goto L_0x003f
                r6 = 1
                goto L_0x0040
            L_0x003f:
                r6 = 0
            L_0x0040:
                if (r6 == 0) goto L_0x0043
                goto L_0x0047
            L_0x0043:
                int r4 = r4 + 1
                goto L_0x0013
            L_0x0046:
                r5 = 0
            L_0x0047:
                f25670a = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p212b0.C9093a.C9094a.<clinit>():void");
        }

        private C9094a() {
        }
    }

    /* renamed from: a */
    public void mo33470a(Throwable th, Throwable th2) {
        C10202j.m34178b(th, "cause");
        C10202j.m34178b(th2, "exception");
        Method method = C9094a.f25670a;
        if (method != null) {
            method.invoke(th, new Object[]{th2});
        }
    }

    /* renamed from: a */
    public C9138c mo33469a() {
        return new C9136b();
    }
}
