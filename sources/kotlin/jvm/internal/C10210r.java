package kotlin.jvm.internal;

import kotlin.p045h0.C9156e;

/* renamed from: kotlin.jvm.internal.r */
/* compiled from: PropertyReference0Impl */
public class C10210r extends C10209q {

    /* renamed from: f */
    private final C9156e f27847f;

    /* renamed from: g */
    private final String f27848g;

    /* renamed from: h */
    private final String f27849h;

    public C10210r(C9156e eVar, String str, String str2) {
        this.f27847f = eVar;
        this.f27848g = str;
        this.f27849h = str2;
    }

    public Object get() {
        return getGetter().call(new Object[0]);
    }

    public String getName() {
        return this.f27848g;
    }

    public C9156e getOwner() {
        return this.f27847f;
    }

    public String getSignature() {
        return this.f27849h;
    }
}
