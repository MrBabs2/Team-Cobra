package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p236y;

import java.util.List;
import java.util.Map;
import kotlin.C10481t;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.C10211s;
import kotlin.jvm.internal.C10212t;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9168l;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9515b;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9518e;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9526m;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10037g;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11814f;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11816h;
import kotlin.p215c0.p216c.C9102a;

/* renamed from: kotlin.h0.u.e.k0.c.a.y.i */
/* compiled from: JavaAnnotationMapper.kt */
public final class C9657i extends C9644b {

    /* renamed from: h */
    static final /* synthetic */ C9168l[] f26578h = {C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a(C9657i.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g */
    private final C11814f f26579g;

    /* renamed from: kotlin.h0.u.e.k0.c.a.y.i$a */
    /* compiled from: JavaAnnotationMapper.kt */
    static final class C9658a extends C10203k implements C9102a<Map<C9939f, ? extends C10037g<?>>> {

        /* renamed from: f */
        final /* synthetic */ C9657i f26580f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9658a(C9657i iVar) {
            super(0);
            this.f26580f = iVar;
        }

        public final Map<C9939f, C10037g<?>> invoke() {
            C10037g<?> gVar;
            C9515b b = this.f26580f.mo34196b();
            Map<K, V> map = null;
            if (b instanceof C9518e) {
                gVar = C9647d.f26568c.mo34203a((List<? extends C9515b>) ((C9518e) this.f26580f.mo34196b()).mo34030e());
            } else {
                gVar = b instanceof C9526m ? C9647d.f26568c.mo34203a((List<? extends C9515b>) C10527n.m35729a(this.f26580f.mo34196b())) : null;
            }
            if (gVar != null) {
                map = C10515i0.m35584a(C10481t.m35502a(C9646c.f26565j.mo34201c(), gVar));
            }
            return map != null ? map : C10518j0.m35601a();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9657i(kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9512a r3, kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.C9422h r4) {
        /*
            r2 = this;
            java.lang.String r0 = "annotation"
            kotlin.jvm.internal.C10202j.m34178b(r3, r0)
            java.lang.String r0 = "c"
            kotlin.jvm.internal.C10202j.m34178b(r4, r0)
            kotlin.h0.u.e.k0.a.g$e r0 = kotlin.p045h0.p046u.p047e.p048k0.p223a.C9333g.f25907k
            kotlin.h0.u.e.k0.e.b r0 = r0.f25980z
            java.lang.String r1 = "KotlinBuiltIns.FQ_NAMES.target"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r0, (java.lang.String) r1)
            r2.<init>(r4, r3, r0)
            kotlin.h0.u.e.k0.j.i r3 = r4.mo33896e()
            kotlin.h0.u.e.k0.c.a.y.i$a r4 = new kotlin.h0.u.e.k0.c.a.y.i$a
            r4.<init>(r2)
            kotlin.h0.u.e.k0.j.f r3 = r3.mo38401a(r4)
            r2.f26579g = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p236y.C9657i.<init>(kotlin.h0.u.e.k0.c.a.c0.a, kotlin.h0.u.e.k0.c.a.a0.h):void");
    }

    /* renamed from: a */
    public Map<C9939f, C10037g<?>> mo33921a() {
        return (Map) C11816h.m38876a(this.f26579g, (Object) this, (C9168l<?>) f26578h[0]);
    }
}
