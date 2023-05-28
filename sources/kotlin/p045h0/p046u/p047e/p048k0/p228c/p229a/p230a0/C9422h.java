package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0;

import kotlin.C9134f;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10211s;
import kotlin.jvm.internal.C10212t;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9168l;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.p232o.C9493c;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11817i;
import kotlin.reflect.jvm.internal.impl.descriptors.C10393y;

/* renamed from: kotlin.h0.u.e.k0.c.a.a0.h */
/* compiled from: context.kt */
public final class C9422h {

    /* renamed from: f */
    static final /* synthetic */ C9168l[] f26190f = {C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a(C9422h.class), "defaultTypeQualifiers", "getDefaultTypeQualifiers()Lorg/jetbrains/kotlin/load/java/lazy/JavaTypeQualifiersByElementType;"))};

    /* renamed from: a */
    private final C9134f f26191a;

    /* renamed from: b */
    private final C9493c f26192b;

    /* renamed from: c */
    private final C9412b f26193c;

    /* renamed from: d */
    private final C9428m f26194d;

    /* renamed from: e */
    private final C9134f<C9416d> f26195e;

    public C9422h(C9412b bVar, C9428m mVar, C9134f<C9416d> fVar) {
        C10202j.m34178b(bVar, "components");
        C10202j.m34178b(mVar, "typeParameterResolver");
        C10202j.m34178b(fVar, "delegateForDefaultTypeQualifiers");
        this.f26193c = bVar;
        this.f26194d = mVar;
        this.f26195e = fVar;
        this.f26191a = fVar;
        this.f26192b = new C9493c(this, mVar);
    }

    /* renamed from: a */
    public final C9412b mo33892a() {
        return this.f26193c;
    }

    /* renamed from: b */
    public final C9416d mo33893b() {
        C9134f fVar = this.f26191a;
        C9168l lVar = f26190f[0];
        return (C9416d) fVar.getValue();
    }

    /* renamed from: c */
    public final C9134f<C9416d> mo33894c() {
        return this.f26195e;
    }

    /* renamed from: d */
    public final C10393y mo33895d() {
        return this.f26193c.mo33872j();
    }

    /* renamed from: e */
    public final C11817i mo33896e() {
        return this.f26193c.mo33880r();
    }

    /* renamed from: f */
    public final C9428m mo33897f() {
        return this.f26194d;
    }

    /* renamed from: g */
    public final C9493c mo33898g() {
        return this.f26192b;
    }
}
