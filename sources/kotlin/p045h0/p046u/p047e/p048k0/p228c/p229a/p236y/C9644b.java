package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p236y;

import java.util.Map;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.C10211s;
import kotlin.jvm.internal.C10212t;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9168l;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.C9422h;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9515b;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p237z.C9675i;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10037g;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11814f;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11816h;
import kotlin.p045h0.p046u.p047e.p048k0.p380k.C11901j0;
import kotlin.p215c0.p216c.C9102a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10243c;

/* renamed from: kotlin.h0.u.e.k0.c.a.y.b */
/* compiled from: JavaAnnotationMapper.kt */
public class C9644b implements C10243c, C9675i {

    /* renamed from: f */
    static final /* synthetic */ C9168l[] f26548f = {C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a(C9644b.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};

    /* renamed from: a */
    private final C10362n0 f26549a;

    /* renamed from: b */
    private final C11814f f26550b;

    /* renamed from: c */
    private final C9515b f26551c;

    /* renamed from: d */
    private final boolean f26552d;

    /* renamed from: e */
    private final C9934b f26553e;

    /* renamed from: kotlin.h0.u.e.k0.c.a.y.b$a */
    /* compiled from: JavaAnnotationMapper.kt */
    static final class C9645a extends C10203k implements C9102a<C11901j0> {

        /* renamed from: f */
        final /* synthetic */ C9644b f26554f;

        /* renamed from: g */
        final /* synthetic */ C9422h f26555g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9645a(C9644b bVar, C9422h hVar) {
            super(0);
            this.f26554f = bVar;
            this.f26555g = hVar;
        }

        public final C11901j0 invoke() {
            C10342e a = this.f26555g.mo33895d().mo35561l().mo33701a(this.f26554f.mo33922c());
            C10202j.m34174a((Object) a, "c.module.builtIns.getBuiltInClassByFqName(fqName)");
            return a.mo35445o();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003a, code lost:
        r2 = r3.mo34021A();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9644b(kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.C9422h r2, kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9512a r3, kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b r4) {
        /*
            r1 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.C10202j.m34178b(r2, r0)
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.C10202j.m34178b(r4, r0)
            r1.<init>()
            r1.f26553e = r4
            if (r3 == 0) goto L_0x0020
            kotlin.h0.u.e.k0.c.a.a0.b r4 = r2.mo33892a()
            kotlin.h0.u.e.k0.c.a.b0.b r4 = r4.mo33879q()
            kotlin.h0.u.e.k0.c.a.b0.a r4 = r4.mo33680a(r3)
            if (r4 == 0) goto L_0x0020
            goto L_0x0027
        L_0x0020:
            kotlin.reflect.jvm.internal.impl.descriptors.n0 r4 = kotlin.reflect.jvm.internal.impl.descriptors.C10362n0.f28175a
            java.lang.String r0 = "SourceElement.NO_SOURCE"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r4, (java.lang.String) r0)
        L_0x0027:
            r1.f26549a = r4
            kotlin.h0.u.e.k0.j.i r4 = r2.mo33896e()
            kotlin.h0.u.e.k0.c.a.y.b$a r0 = new kotlin.h0.u.e.k0.c.a.y.b$a
            r0.<init>(r1, r2)
            kotlin.h0.u.e.k0.j.f r2 = r4.mo38401a(r0)
            r1.f26550b = r2
            if (r3 == 0) goto L_0x0047
            java.util.Collection r2 = r3.mo34021A()
            if (r2 == 0) goto L_0x0047
            java.lang.Object r2 = kotlin.p262y.C10539w.m35802f(r2)
            kotlin.h0.u.e.k0.c.a.c0.b r2 = (kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9515b) r2
            goto L_0x0048
        L_0x0047:
            r2 = 0
        L_0x0048:
            r1.f26551c = r2
            r2 = 1
            if (r3 == 0) goto L_0x0054
            boolean r3 = r3.mo34023e()
            if (r3 != r2) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r2 = 0
        L_0x0055:
            r1.f26552d = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p236y.C9644b.<init>(kotlin.h0.u.e.k0.c.a.a0.h, kotlin.h0.u.e.k0.c.a.c0.a, kotlin.h0.u.e.k0.e.b):void");
    }

    /* renamed from: a */
    public Map<C9939f, C10037g<?>> mo33921a() {
        return C10518j0.m35601a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C9515b mo34196b() {
        return this.f26551c;
    }

    /* renamed from: c */
    public C9934b mo33922c() {
        return this.f26553e;
    }

    /* renamed from: e */
    public boolean mo33923e() {
        return this.f26552d;
    }

    public C11901j0 getType() {
        return (C11901j0) C11816h.m38876a(this.f26550b, (Object) this, (C9168l<?>) f26548f[0]);
    }

    /* renamed from: p */
    public C10362n0 mo33925p() {
        return this.f26549a;
    }
}
