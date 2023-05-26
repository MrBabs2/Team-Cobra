package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p255q.p256n.C10116e;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.a1 */
/* compiled from: Visibility.kt */
public abstract class C10237a1 {

    /* renamed from: a */
    private final String f27882a;

    /* renamed from: b */
    private final boolean f27883b;

    protected C10237a1(String str, boolean z) {
        C10202j.m34178b(str, "name");
        this.f27882a = str;
        this.f27883b = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Integer mo34180a(C10237a1 a1Var) {
        C10202j.m34178b(a1Var, "visibility");
        return C10397z0.m35092b(this, a1Var);
    }

    /* renamed from: a */
    public abstract boolean mo34182a(C10116e eVar, C10369q qVar, C10359m mVar);

    /* renamed from: b */
    public final boolean mo35419b() {
        return this.f27883b;
    }

    /* renamed from: c */
    public C10237a1 mo34183c() {
        return this;
    }

    public final String toString() {
        return mo34181a();
    }

    /* renamed from: a */
    public String mo34181a() {
        return this.f27882a;
    }
}
