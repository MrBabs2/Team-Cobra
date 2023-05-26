package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0;

import java.util.Iterator;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9512a;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9517d;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p236y.C9646c;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11812d;
import kotlin.p215c0.p216c.C9113l;
import kotlin.p391i0.C12079h;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10243c;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;

/* renamed from: kotlin.h0.u.e.k0.c.a.a0.e */
/* compiled from: LazyJavaAnnotations.kt */
public final class C9417e implements C10249g {

    /* renamed from: f */
    private final C11812d<C9512a, C10243c> f26182f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C9422h f26183g;

    /* renamed from: h */
    private final C9517d f26184h;

    /* renamed from: kotlin.h0.u.e.k0.c.a.a0.e$a */
    /* compiled from: LazyJavaAnnotations.kt */
    static final class C9418a extends C10203k implements C9113l<C9512a, C10243c> {

        /* renamed from: f */
        final /* synthetic */ C9417e f26185f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9418a(C9417e eVar) {
            super(1);
            this.f26185f = eVar;
        }

        /* renamed from: a */
        public final C10243c invoke(C9512a aVar) {
            C10202j.m34178b(aVar, "annotation");
            return C9646c.f26565j.mo34198a(aVar, this.f26185f.f26183g);
        }
    }

    public C9417e(C9422h hVar, C9517d dVar) {
        C10202j.m34178b(hVar, "c");
        C10202j.m34178b(dVar, "annotationOwner");
        this.f26183g = hVar;
        this.f26184h = dVar;
        this.f26182f = hVar.mo33892a().mo33880r().mo38406b(new C9418a(this));
    }

    /* renamed from: b */
    public boolean mo33886b(C9934b bVar) {
        C10202j.m34178b(bVar, "fqName");
        return C10249g.C10252b.m34290b(this, bVar);
    }

    public boolean isEmpty() {
        return this.f26184h.getAnnotations().isEmpty() && !this.f26184h.mo34029h();
    }

    public Iterator<C10243c> iterator() {
        C12079h<C10243c> d = C12090n.m39926d(C10539w.m35782b(this.f26184h.getAnnotations()), this.f26182f);
        C9646c cVar = C9646c.f26565j;
        C9934b bVar = C9333g.f25907k.f25974t;
        C10202j.m34174a((Object) bVar, "KotlinBuiltIns.FQ_NAMES.deprecated");
        return C12090n.m39927e(C12090n.m39920a(d, cVar.mo34199a(bVar, this.f26184h, this.f26183g))).iterator();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r0 = r3.f26182f.invoke(r0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10243c mo33885a(kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b r4) {
        /*
            r3 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.C10202j.m34178b(r4, r0)
            kotlin.h0.u.e.k0.c.a.c0.d r0 = r3.f26184h
            kotlin.h0.u.e.k0.c.a.c0.a r0 = r0.mo34027a(r4)
            if (r0 == 0) goto L_0x0018
            kotlin.h0.u.e.k0.j.d<kotlin.h0.u.e.k0.c.a.c0.a, kotlin.reflect.jvm.internal.impl.descriptors.b1.c> r1 = r3.f26182f
            java.lang.Object r0 = r1.invoke(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.b1.c r0 = (kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10243c) r0
            if (r0 == 0) goto L_0x0018
            goto L_0x0022
        L_0x0018:
            kotlin.h0.u.e.k0.c.a.y.c r0 = kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p236y.C9646c.f26565j
            kotlin.h0.u.e.k0.c.a.c0.d r1 = r3.f26184h
            kotlin.h0.u.e.k0.c.a.a0.h r2 = r3.f26183g
            kotlin.reflect.jvm.internal.impl.descriptors.b1.c r0 = r0.mo34199a(r4, r1, r2)
        L_0x0022:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.C9417e.mo33885a(kotlin.h0.u.e.k0.e.b):kotlin.reflect.jvm.internal.impl.descriptors.b1.c");
    }
}
