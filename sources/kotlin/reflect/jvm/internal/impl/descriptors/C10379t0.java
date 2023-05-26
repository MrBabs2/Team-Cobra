package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C10485x;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.C9999c;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11824b0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11953s0;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11958u;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11965u0;
import kotlin.p215c0.p216c.C9113l;
import kotlin.p391i0.C12079h;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t0 */
/* compiled from: typeParameterUtils.kt */
public final class C10379t0 {

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t0$a */
    /* compiled from: typeParameterUtils.kt */
    static final class C10380a extends C10203k implements C9113l<C10359m, Boolean> {

        /* renamed from: f */
        public static final C10380a f28180f = new C10380a();

        C10380a() {
            super(1);
        }

        /* renamed from: a */
        public final boolean mo35611a(C10359m mVar) {
            C10202j.m34178b(mVar, "it");
            return mVar instanceof C10230a;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo35611a((C10359m) obj));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.t0$b */
    /* compiled from: typeParameterUtils.kt */
    static final class C10381b extends C10203k implements C9113l<C10359m, C12079h<? extends C10375s0>> {

        /* renamed from: f */
        public static final C10381b f28181f = new C10381b();

        C10381b() {
            super(1);
        }

        /* renamed from: a */
        public final C12079h<C10375s0> invoke(C10359m mVar) {
            C10202j.m34178b(mVar, "it");
            List<C10375s0> typeParameters = ((C10230a) mVar).getTypeParameters();
            C10202j.m34174a((Object) typeParameters, "(it as CallableDescriptor).typeParameters");
            return C10539w.m35782b(typeParameters);
        }
    }

    /* renamed from: a */
    public static final List<C10375s0> m35021a(C10351i iVar) {
        List<C10375s0> list;
        C10359m mVar;
        C11953s0 h;
        C10202j.m34178b(iVar, "$this$computeConstructorTypeParameters");
        List<C10375s0> s = iVar.mo33776s();
        C10202j.m34174a((Object) s, "declaredTypeParameters");
        if (!iVar.mo33770k() && !(iVar.mo33762b() instanceof C10230a)) {
            return s;
        }
        List<R> g = C12090n.m39931g(C12090n.m39924c(C12090n.m39930f(C10071a.m33898f(iVar), C10380a.f28180f), C10381b.f28181f));
        Iterator<C10359m> it = C10071a.m33898f(iVar).iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                mVar = null;
                break;
            }
            mVar = it.next();
            if (mVar instanceof C10342e) {
                break;
            }
        }
        C10342e eVar = (C10342e) mVar;
        if (!(eVar == null || (h = eVar.mo33766h()) == null)) {
            list = h.getParameters();
        }
        if (list == null) {
            list = C10529o.m35736a();
        }
        if (!g.isEmpty() || !list.isEmpty()) {
            List<T> d = C10539w.m35796d(g, list);
            ArrayList arrayList = new ArrayList(C10531p.m35750a(d, 10));
            for (T t : d) {
                C10202j.m34174a((Object) t, "it");
                arrayList.add(m35022a((C10375s0) t, (C10359m) iVar, s.size()));
            }
            return C10539w.m35796d(s, arrayList);
        }
        List<C10375s0> s2 = iVar.mo33776s();
        C10202j.m34174a((Object) s2, "declaredTypeParameters");
        return s2;
    }

    /* renamed from: a */
    private static final C10264c m35022a(C10375s0 s0Var, C10359m mVar, int i) {
        return new C10264c(s0Var, mVar, i);
    }

    /* renamed from: a */
    public static final C10348g0 m35023a(C11824b0 b0Var) {
        C10202j.m34178b(b0Var, "$this$buildPossiblyInnerType");
        C10349h b = b0Var.mo35227v0().mo33781b();
        if (!(b instanceof C10351i)) {
            b = null;
        }
        return m35024a(b0Var, (C10351i) b, 0);
    }

    /* renamed from: a */
    private static final C10348g0 m35024a(C11824b0 b0Var, C10351i iVar, int i) {
        C10351i iVar2 = null;
        if (iVar == null || C11958u.m39553a((C10359m) iVar)) {
            return null;
        }
        int size = iVar.mo33776s().size() + i;
        if (!iVar.mo33770k()) {
            boolean z = size == b0Var.mo35226u0().size() || C9999c.m33693r(iVar);
            if (!C10485x.f28360a || z) {
                return new C10348g0(iVar, b0Var.mo35226u0().subList(i, b0Var.mo35226u0().size()), (C10348g0) null);
            }
            throw new AssertionError((b0Var.mo35226u0().size() - size) + " trailing arguments were found in " + b0Var + " type");
        }
        List<C11965u0> subList = b0Var.mo35226u0().subList(i, size);
        C10359m b = iVar.mo33762b();
        if (b instanceof C10351i) {
            iVar2 = b;
        }
        return new C10348g0(iVar, subList, m35024a(b0Var, iVar2, size));
    }
}
