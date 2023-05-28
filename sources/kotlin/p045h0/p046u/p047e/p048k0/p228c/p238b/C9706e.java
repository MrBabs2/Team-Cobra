package kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b;

import java.util.List;
import java.util.Set;
import kotlin.C10221n;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11758h;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11767l;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.C11781t;
import kotlin.p045h0.p046u.p047e.p048k0.p049i.p376b.p378g0.C11751i;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.p239a0.C9688a;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9775f;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9856v;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g.C9923f;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g.C9925g;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g.C9928i;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.C10096h;
import kotlin.p215c0.p216c.C9102a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10240b0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: kotlin.h0.u.e.k0.c.b.e */
/* compiled from: DeserializedDescriptorResolver.kt */
public final class C9706e {

    /* renamed from: b */
    private static final Set<C9688a.C9689a> f26681b = C10528n0.m35731a(C9688a.C9689a.CLASS);

    /* renamed from: c */
    private static final Set<C9688a.C9689a> f26682c = C10530o0.m35749b(C9688a.C9689a.FILE_FACADE, C9688a.C9689a.MULTIFILE_CLASS_PART);

    /* renamed from: d */
    private static final C9923f f26683d = new C9923f(1, 1, 2);

    /* renamed from: e */
    private static final C9923f f26684e = new C9923f(1, 1, 11);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C9923f f26685f = new C9923f(1, 1, 13);

    /* renamed from: g */
    public static final C9707a f26686g = new C9707a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public C11767l f26687a;

    /* renamed from: kotlin.h0.u.e.k0.c.b.e$a */
    /* compiled from: DeserializedDescriptorResolver.kt */
    public static final class C9707a {
        private C9707a() {
        }

        /* renamed from: a */
        public final C9923f mo34288a() {
            return C9706e.f26685f;
        }

        public /* synthetic */ C9707a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.c.b.e$b */
    /* compiled from: DeserializedDescriptorResolver.kt */
    static final class C9708b extends C10203k implements C9102a<List<? extends C9939f>> {

        /* renamed from: f */
        public static final C9708b f26688f = new C9708b();

        C9708b() {
            super(0);
        }

        public final List<C9939f> invoke() {
            return C10529o.m35736a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final boolean m31317c() {
        C11767l lVar = this.f26687a;
        if (lVar != null) {
            return lVar.mo38357e().mo38370a();
        }
        C10202j.m34181d("components");
        throw null;
    }

    /* renamed from: d */
    private final boolean m31318d(C9724o oVar) {
        C11767l lVar = this.f26687a;
        if (lVar != null) {
            return !lVar.mo38357e().mo38370a() && oVar.mo33661a().mo34266h() && C10202j.m34176a((Object) oVar.mo33661a().mo34262d(), (Object) f26684e);
        }
        C10202j.m34181d("components");
        throw null;
    }

    /* renamed from: e */
    private final boolean m31319e(C9724o oVar) {
        C11767l lVar = this.f26687a;
        if (lVar != null) {
            return (lVar.mo38357e().mo38371b() && (oVar.mo33661a().mo34266h() || C10202j.m34176a((Object) oVar.mo33661a().mo34262d(), (Object) f26683d))) || m31318d(oVar);
        }
        C10202j.m34181d("components");
        throw null;
    }

    /* renamed from: c */
    private final C11781t<C9923f> m31316c(C9724o oVar) {
        if (m31317c() || oVar.mo33661a().mo34262d().mo34934d()) {
            return null;
        }
        return new C11781t<>(oVar.mo33661a().mo34262d(), C9923f.f27380g, oVar.getLocation(), oVar.mo33665d());
    }

    /* renamed from: a */
    public final C11767l mo34285a() {
        C11767l lVar = this.f26687a;
        if (lVar != null) {
            return lVar;
        }
        C10202j.m34181d("components");
        throw null;
    }

    /* renamed from: b */
    public final C10342e mo34287b(C9724o oVar) {
        C10202j.m34178b(oVar, "kotlinClass");
        C11758h a = mo34284a(oVar);
        if (a == null) {
            return null;
        }
        C11767l lVar = this.f26687a;
        if (lVar != null) {
            return lVar.mo38356d().mo38342a(oVar.mo33665d(), a);
        }
        C10202j.m34181d("components");
        throw null;
    }

    /* renamed from: a */
    public final void mo34286a(C9705d dVar) {
        C10202j.m34178b(dVar, "components");
        this.f26687a = dVar.mo34282a();
    }

    /* renamed from: a */
    public final C11758h mo34284a(C9724o oVar) {
        String[] g;
        C10221n<C9925g, C9775f> nVar;
        C10202j.m34178b(oVar, "kotlinClass");
        String[] a = m31314a(oVar, (Set<? extends C9688a.C9689a>) f26681b);
        if (a == null || (g = oVar.mo33661a().mo34265g()) == null) {
            return null;
        }
        try {
            nVar = C9928i.m33158a(a, g);
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalStateException("Could not read data from " + oVar.getLocation(), e);
        } catch (Throwable th) {
            if (m31317c() || oVar.mo33661a().mo34262d().mo34934d()) {
                throw th;
            }
            nVar = null;
        }
        if (nVar == null) {
            return null;
        }
        return new C11758h(nVar.mo35389a(), nVar.mo35390b(), oVar.mo33661a().mo34262d(), new C9731q(oVar, m31316c(oVar), m31319e(oVar)));
    }

    /* renamed from: a */
    public final C10096h mo34283a(C10240b0 b0Var, C9724o oVar) {
        String[] g;
        C10221n<C9925g, C9856v> nVar;
        C10202j.m34178b(b0Var, "descriptor");
        C10202j.m34178b(oVar, "kotlinClass");
        String[] a = m31314a(oVar, (Set<? extends C9688a.C9689a>) f26682c);
        if (a == null || (g = oVar.mo33661a().mo34265g()) == null) {
            return null;
        }
        try {
            nVar = C9928i.m33162c(a, g);
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalStateException("Could not read data from " + oVar.getLocation(), e);
        } catch (Throwable th) {
            if (m31317c() || oVar.mo33661a().mo34262d().mo34934d()) {
                throw th;
            }
            nVar = null;
        }
        if (nVar == null) {
            return null;
        }
        C9925g a2 = nVar.mo35389a();
        C9856v b = nVar.mo35390b();
        C9712i iVar = new C9712i(oVar, b, a2, m31316c(oVar), m31319e(oVar));
        C9923f d = oVar.mo33661a().mo34262d();
        C11767l lVar = this.f26687a;
        if (lVar != null) {
            return new C11751i(b0Var, b, a2, d, iVar, lVar, C9708b.f26688f);
        }
        C10202j.m34181d("components");
        throw null;
    }

    /* renamed from: a */
    private final String[] m31314a(C9724o oVar, Set<? extends C9688a.C9689a> set) {
        C9688a a = oVar.mo33661a();
        String[] a2 = a.mo34259a();
        if (a2 == null) {
            a2 = a.mo34260b();
        }
        if (a2 == null) {
            return null;
        }
        if (!set.contains(a.mo34261c())) {
            a2 = null;
        }
        return a2;
    }
}
