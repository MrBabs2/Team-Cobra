package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p236y;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.Map;
import kotlin.C10221n;
import kotlin.C10481t;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.C9422h;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.p231n.C9437e;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9512a;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9517d;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10243c;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;

/* renamed from: kotlin.h0.u.e.k0.c.a.y.c */
/* compiled from: JavaAnnotationMapper.kt */
public final class C9646c {

    /* renamed from: a */
    private static final C9934b f26556a = new C9934b(Target.class.getCanonicalName());

    /* renamed from: b */
    private static final C9934b f26557b = new C9934b(Retention.class.getCanonicalName());

    /* renamed from: c */
    private static final C9934b f26558c = new C9934b(Deprecated.class.getCanonicalName());

    /* renamed from: d */
    private static final C9934b f26559d = new C9934b(Documented.class.getCanonicalName());

    /* renamed from: e */
    private static final C9934b f26560e = new C9934b("java.lang.annotation.Repeatable");

    /* renamed from: f */
    private static final C9939f f26561f;

    /* renamed from: g */
    private static final C9939f f26562g;

    /* renamed from: h */
    private static final C9939f f26563h;

    /* renamed from: i */
    private static final Map<C9934b, C9934b> f26564i = C10518j0.m35604a((C10221n<? extends K, ? extends V>[]) new C10221n[]{C10481t.m35502a(C9333g.f25907k.f25980z, f26556a), C10481t.m35502a(C9333g.f25907k.f25920C, f26557b), C10481t.m35502a(C9333g.f25907k.f25921D, f26560e), C10481t.m35502a(C9333g.f25907k.f25922E, f26559d)});

    /* renamed from: j */
    public static final C9646c f26565j = new C9646c();

    static {
        C9939f b = C9939f.m33302b("message");
        C10202j.m34174a((Object) b, "Name.identifier(\"message\")");
        f26561f = b;
        C9939f b2 = C9939f.m33302b("allowedTargets");
        C10202j.m34174a((Object) b2, "Name.identifier(\"allowedTargets\")");
        f26562g = b2;
        C9939f b3 = C9939f.m33302b(DonationsAnalytics.VALUE);
        C10202j.m34174a((Object) b3, "Name.identifier(\"value\")");
        f26563h = b3;
        Map<K, V> unused = C10518j0.m35604a((C10221n<? extends K, ? extends V>[]) new C10221n[]{C10481t.m35502a(f26556a, C9333g.f25907k.f25980z), C10481t.m35502a(f26557b, C9333g.f25907k.f25920C), C10481t.m35502a(f26558c, C9333g.f25907k.f25974t), C10481t.m35502a(f26560e, C9333g.f25907k.f25921D), C10481t.m35502a(f26559d, C9333g.f25907k.f25922E)});
    }

    private C9646c() {
    }

    /* renamed from: a */
    public final C9939f mo34197a() {
        return f26561f;
    }

    /* renamed from: b */
    public final C9939f mo34200b() {
        return f26563h;
    }

    /* renamed from: c */
    public final C9939f mo34201c() {
        return f26562g;
    }

    /* renamed from: a */
    public final C10243c mo34198a(C9512a aVar, C9422h hVar) {
        C10202j.m34178b(aVar, "annotation");
        C10202j.m34178b(hVar, "c");
        C9933a d = aVar.mo34022d();
        if (C10202j.m34176a((Object) d, (Object) C9933a.m33260a(f26556a))) {
            return new C9657i(aVar, hVar);
        }
        if (C10202j.m34176a((Object) d, (Object) C9933a.m33260a(f26557b))) {
            return new C9655h(aVar, hVar);
        }
        if (C10202j.m34176a((Object) d, (Object) C9933a.m33260a(f26560e))) {
            C9934b bVar = C9333g.f25907k.f25921D;
            C10202j.m34174a((Object) bVar, "KotlinBuiltIns.FQ_NAMES.repeatable");
            return new C9644b(hVar, aVar, bVar);
        } else if (C10202j.m34176a((Object) d, (Object) C9933a.m33260a(f26559d))) {
            C9934b bVar2 = C9333g.f25907k.f25922E;
            C10202j.m34174a((Object) bVar2, "KotlinBuiltIns.FQ_NAMES.mustBeDocumented");
            return new C9644b(hVar, aVar, bVar2);
        } else if (C10202j.m34176a((Object) d, (Object) C9933a.m33260a(f26558c))) {
            return null;
        } else {
            return new C9437e(hVar, aVar);
        }
    }

    /* renamed from: a */
    public final C10243c mo34199a(C9934b bVar, C9517d dVar, C9422h hVar) {
        C9512a a;
        C9512a a2;
        C10202j.m34178b(bVar, "kotlinName");
        C10202j.m34178b(dVar, "annotationOwner");
        C10202j.m34178b(hVar, "c");
        if (C10202j.m34176a((Object) bVar, (Object) C9333g.f25907k.f25974t) && ((a2 = dVar.mo34027a(f26558c)) != null || dVar.mo34029h())) {
            return new C9649e(a2, hVar);
        }
        C9934b bVar2 = f26564i.get(bVar);
        if (bVar2 == null || (a = dVar.mo34027a(bVar2)) == null) {
            return null;
        }
        return f26565j.mo34198a(a, hVar);
    }
}
