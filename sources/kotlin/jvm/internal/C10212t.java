package kotlin.jvm.internal;

import kotlin.p045h0.C9156e;

/* renamed from: kotlin.jvm.internal.t */
/* compiled from: PropertyReference1Impl */
public class C10212t extends C10211s {

    /* renamed from: f */
    private final C9156e f27850f;

    /* renamed from: g */
    private final String f27851g;

    /* renamed from: h */
    private final String f27852h;

    public C10212t(C9156e eVar, String str, String str2) {
        this.f27850f = eVar;
        this.f27851g = str;
        this.f27852h = str2;
    }

    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public String getName() {
        return this.f27851g;
    }

    public C9156e getOwner() {
        return this.f27850f;
    }

    public String getSignature() {
        return this.f27852h;
    }
}
