package kotlin.jvm.internal;

import kotlin.p045h0.C9156e;

/* renamed from: kotlin.jvm.internal.n */
/* compiled from: MutablePropertyReference1Impl */
public class C10206n extends C10205m {

    /* renamed from: f */
    private final C9156e f27843f;

    /* renamed from: g */
    private final String f27844g;

    /* renamed from: h */
    private final String f27845h;

    public C10206n(C9156e eVar, String str, String str2) {
        this.f27843f = eVar;
        this.f27844g = str;
        this.f27845h = str2;
    }

    /* renamed from: a */
    public void mo33515a(Object obj, Object obj2) {
        getSetter().call(obj, obj2);
    }

    public Object get(Object obj) {
        return getGetter().call(obj);
    }

    public String getName() {
        return this.f27844g;
    }

    public C9156e getOwner() {
        return this.f27843f;
    }

    public String getSignature() {
        return this.f27845h;
    }
}
