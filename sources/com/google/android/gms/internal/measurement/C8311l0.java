package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.l0 */
final class C8311l0 {

    /* renamed from: a */
    private final zztv f23282a;

    /* renamed from: b */
    private final byte[] f23283b;

    private C8311l0(int i) {
        byte[] bArr = new byte[i];
        this.f23283b = bArr;
        this.f23282a = zztv.m26537a(bArr);
    }

    /* renamed from: a */
    public final zzte mo30189a() {
        if (this.f23282a.mo30380a() == 0) {
            return new C8321n0(this.f23283b);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    /* renamed from: b */
    public final zztv mo30190b() {
        return this.f23282a;
    }

    /* synthetic */ C8311l0(int i, C8286g0 g0Var) {
        this(i);
    }
}
