package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import kotlin.C10219k;
import kotlin.C9134f;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.C9405a;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9538x;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9554g;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9555h;
import kotlin.p215c0.p216c.C9102a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10347g;
import kotlin.reflect.jvm.internal.impl.descriptors.C10359m;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10243c;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;
import kotlin.reflect.jvm.internal.impl.utils.C12162h;

/* renamed from: kotlin.h0.u.e.k0.c.a.a0.a */
/* compiled from: context.kt */
public final class C9409a {

    /* renamed from: kotlin.h0.u.e.k0.c.a.a0.a$a */
    /* compiled from: context.kt */
    static final class C9410a extends C10203k implements C9102a<C9416d> {

        /* renamed from: f */
        final /* synthetic */ C9422h f26155f;

        /* renamed from: g */
        final /* synthetic */ C10347g f26156g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9410a(C9422h hVar, C10347g gVar) {
            super(0);
            this.f26155f = hVar;
            this.f26156g = gVar;
        }

        public final C9416d invoke() {
            return C9409a.m30472a(this.f26155f, this.f26156g.getAnnotations());
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.c.a.a0.a$b */
    /* compiled from: context.kt */
    static final class C9411b extends C10203k implements C9102a<C9416d> {

        /* renamed from: f */
        final /* synthetic */ C9422h f26157f;

        /* renamed from: g */
        final /* synthetic */ C10249g f26158g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9411b(C9422h hVar, C10249g gVar) {
            super(0);
            this.f26157f = hVar;
            this.f26158g = gVar;
        }

        public final C9416d invoke() {
            return C9409a.m30472a(this.f26157f, this.f26158g);
        }
    }

    /* renamed from: a */
    public static final C9422h m30474a(C9422h hVar, C9428m mVar) {
        C10202j.m34178b(hVar, "$this$child");
        C10202j.m34178b(mVar, "typeParameterResolver");
        return new C9422h(hVar.mo33892a(), mVar, hVar.mo33894c());
    }

    /* renamed from: b */
    public static final C9422h m30481b(C9422h hVar, C10249g gVar) {
        C10202j.m34178b(hVar, "$this$copyWithNewDefaultTypeQualifiers");
        C10202j.m34178b(gVar, "additionalAnnotations");
        return gVar.isEmpty() ? hVar : new C9422h(hVar.mo33892a(), hVar.mo33897f(), C10181i.m34135a(C10219k.NONE, new C9411b(hVar, gVar)));
    }

    /* renamed from: a */
    public static final C9416d m30472a(C9422h hVar, C10249g gVar) {
        EnumMap enumMap;
        EnumMap<C9405a.C9406a, C9555h> a;
        C10202j.m34178b(hVar, "$this$computeNewDefaultTypeQualifiers");
        C10202j.m34178b(gVar, "additionalAnnotations");
        if (hVar.mo33892a().mo33863a().mo33854a()) {
            return hVar.mo33893b();
        }
        ArrayList<C9426k> arrayList = new ArrayList<>();
        Iterator it = gVar.iterator();
        while (it.hasNext()) {
            C9426k a2 = m30480a(hVar, (C10243c) it.next());
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        if (arrayList.isEmpty()) {
            return hVar.mo33893b();
        }
        C9416d b = hVar.mo33893b();
        if (b == null || (a = b.mo33883a()) == null) {
            enumMap = new EnumMap(C9405a.C9406a.class);
        } else {
            enumMap = new EnumMap(a);
        }
        boolean z = false;
        for (C9426k kVar : arrayList) {
            C9555h a3 = kVar.mo33902a();
            for (C9405a.C9406a put : kVar.mo33903b()) {
                enumMap.put(put, a3);
                z = true;
            }
        }
        return !z ? hVar.mo33893b() : new C9416d(enumMap);
    }

    /* renamed from: a */
    private static final C9426k m30480a(C9422h hVar, C10243c cVar) {
        C9555h a;
        C9555h a2;
        C9405a a3 = hVar.mo33892a().mo33863a();
        C9426k c = a3.mo33856c(cVar);
        if (c != null) {
            return c;
        }
        C9405a.C9407b e = a3.mo33858e(cVar);
        if (e != null) {
            C10243c a4 = e.mo33859a();
            List<C9405a.C9406a> b = e.mo33860b();
            C12162h b2 = a3.mo33855b(cVar);
            if (b2 == null) {
                b2 = a3.mo33853a(a4);
            }
            if (!(b2.mo38770d() || (a = hVar.mo33892a().mo33877o().mo34137a(a4)) == null || (a2 = C9555h.m30903a(a, (C9554g) null, b2.mo38771e(), 1, (Object) null)) == null)) {
                return new C9426k(a2, b);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final C9422h m30473a(C9422h hVar, C9412b bVar) {
        C10202j.m34178b(hVar, "$this$replaceComponents");
        C10202j.m34178b(bVar, "components");
        return new C9422h(bVar, hVar.mo33897f(), hVar.mo33894c());
    }

    /* renamed from: a */
    private static final C9422h m30479a(C9422h hVar, C10359m mVar, C9538x xVar, int i, C9134f<C9416d> fVar) {
        C9428m mVar2;
        C9412b a = hVar.mo33892a();
        if (xVar != null) {
            mVar2 = new C9423i(hVar, mVar, xVar, i);
        } else {
            mVar2 = hVar.mo33897f();
        }
        return new C9422h(a, mVar2, fVar);
    }

    /* renamed from: a */
    public static /* synthetic */ C9422h m30478a(C9422h hVar, C10359m mVar, C9538x xVar, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m30477a(hVar, mVar, xVar, i);
    }

    /* renamed from: a */
    public static final C9422h m30477a(C9422h hVar, C10359m mVar, C9538x xVar, int i) {
        C10202j.m34178b(hVar, "$this$childForMethod");
        C10202j.m34178b(mVar, "containingDeclaration");
        C10202j.m34178b(xVar, "typeParameterOwner");
        return m30479a(hVar, mVar, xVar, i, hVar.mo33894c());
    }

    /* renamed from: a */
    public static /* synthetic */ C9422h m30476a(C9422h hVar, C10347g gVar, C9538x xVar, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            xVar = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m30475a(hVar, gVar, xVar, i);
    }

    /* renamed from: a */
    public static final C9422h m30475a(C9422h hVar, C10347g gVar, C9538x xVar, int i) {
        C10202j.m34178b(hVar, "$this$childForClassOrPackage");
        C10202j.m34178b(gVar, "containingDeclaration");
        return m30479a(hVar, gVar, xVar, i, C10181i.m34135a(C10219k.NONE, new C9410a(hVar, gVar)));
    }
}
