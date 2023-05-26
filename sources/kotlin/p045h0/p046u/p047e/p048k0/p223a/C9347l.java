package kotlin.p045h0.p046u.p047e.p048k0.p223a;

import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;

/* renamed from: kotlin.h0.u.e.k0.a.l */
/* compiled from: UnsignedType.kt */
public enum C9347l {
    ;
    

    /* renamed from: f */
    private final C9939f f26012f;

    /* renamed from: g */
    private final C9933a f26013g;

    /* renamed from: h */
    private final C9933a f26014h;

    private C9347l(C9933a aVar) {
        this.f26014h = aVar;
        C9939f f = aVar.mo34989f();
        C10202j.m34174a((Object) f, "classId.shortClassName");
        this.f26012f = f;
        C9934b d = this.f26014h.mo34986d();
        this.f26013g = new C9933a(d, C9939f.m33302b(this.f26012f.mo35021a() + "Array"));
    }

    /* renamed from: a */
    public final C9933a mo33739a() {
        return this.f26013g;
    }

    /* renamed from: d */
    public final C9933a mo33740d() {
        return this.f26014h;
    }

    /* renamed from: e */
    public final C9939f mo33741e() {
        return this.f26012f;
    }
}
