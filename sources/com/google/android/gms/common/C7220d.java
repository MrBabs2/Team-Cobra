package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.d */
abstract class C7220d extends C7218b {

    /* renamed from: h */
    private static final WeakReference<byte[]> f14022h = new WeakReference<>((Object) null);

    /* renamed from: g */
    private WeakReference<byte[]> f14023g = f14022h;

    C7220d(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H0 */
    public abstract byte[] mo25218H0();

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public final byte[] mo25214Z() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f14023g.get();
            if (bArr == null) {
                bArr = mo25218H0();
                this.f14023g = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }
}
