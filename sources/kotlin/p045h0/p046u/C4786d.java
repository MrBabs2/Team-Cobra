package kotlin.p045h0.p046u;

import kotlin.C10221n;
import kotlin.C4789l;
import kotlin.C9125d;
import kotlin.jvm.internal.C10200h;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9156e;
import kotlin.p045h0.C9157f;
import kotlin.p045h0.p046u.p047e.C9183a;
import kotlin.p045h0.p046u.p047e.C9244g0;
import kotlin.p045h0.p046u.p047e.C9301j;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11786x;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9821n0;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9836r;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p242x0.C9880h;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g.C9923f;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g.C9925g;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g.C9928i;
import kotlin.p215c0.p216c.C9117p;
import kotlin.reflect.jvm.internal.impl.descriptors.C10360m0;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003¨\u0006\u0004"}, mo16641d2 = {"reflect", "Lkotlin/reflect/KFunction;", "R", "Lkotlin/Function;", "kotlin-reflection"}, mo16642k = 2, mo16643mv = {1, 1, 15})
/* renamed from: kotlin.h0.u.d */
/* compiled from: reflectLambda.kt */
public final class C4786d {

    /* renamed from: kotlin.h0.u.d$a */
    /* compiled from: reflectLambda.kt */
    static final /* synthetic */ class C4787a extends C10200h implements C9117p<C11786x, C9836r, C10360m0> {

        /* renamed from: g */
        public static final C4787a f8124g = new C4787a();

        C4787a() {
            super(2);
        }

        /* renamed from: a */
        public final C10360m0 invoke(C11786x xVar, C9836r rVar) {
            C10202j.m34178b(xVar, "p1");
            C10202j.m34178b(rVar, "p2");
            return xVar.mo38394a(rVar);
        }

        public final String getName() {
            return "loadFunction";
        }

        public final C9156e getOwner() {
            return C10216x.m34186a(C11786x.class);
        }

        public final String getSignature() {
            return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
        }
    }

    /* renamed from: a */
    public static final <R> C9157f<R> m7910a(C9125d<? extends R> dVar) {
        C10202j.m34178b(dVar, "$this$reflect");
        C4789l lVar = (C4789l) dVar.getClass().getAnnotation(C4789l.class);
        if (lVar != null) {
            String[] d1 = lVar.mo16640d1();
            boolean z = true;
            if (d1.length == 0) {
                d1 = null;
            }
            if (d1 != null) {
                C10221n<C9925g, C9836r> b = C9928i.m33161b(d1, lVar.mo16641d2());
                C9925g a = b.mo35389a();
                C9836r b2 = b.mo35390b();
                int[] mv = lVar.mo16643mv();
                if ((lVar.mo16645xi() & 8) == 0) {
                    z = false;
                }
                C9923f fVar = new C9923f(mv, z);
                Class<?> cls = dVar.getClass();
                C9821n0 v = b2.mo34748v();
                C10202j.m34174a((Object) v, "proto.typeTable");
                C10360m0 m0Var = (C10360m0) C9244g0.m30003a(cls, b2, a, new C9880h(v), fVar, C4787a.f8124g);
                if (m0Var != null) {
                    return new C9301j(C9183a.f25707i, m0Var);
                }
            }
        }
        return null;
    }
}
