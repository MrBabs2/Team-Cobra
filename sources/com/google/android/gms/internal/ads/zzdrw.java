package com.google.android.gms.internal.ads;

import java.io.IOException;

public class zzdrw {

    /* renamed from: a */
    protected volatile int f21655a = -1;

    /* renamed from: a */
    public final int mo29209a() {
        int c = mo29200c();
        this.f21655a = c;
        return c;
    }

    /* renamed from: a */
    public void mo29198a(zzdrp zzdrp) throws IOException {
    }

    /* renamed from: b */
    public zzdrw clone() throws CloneNotSupportedException {
        return (zzdrw) super.clone();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo29200c() {
        return 0;
    }

    public String toString() {
        return zzdrx.m24146a(this);
    }

    /* renamed from: a */
    public static final byte[] m24141a(zzdrw zzdrw) {
        int a = zzdrw.mo29209a();
        byte[] bArr = new byte[a];
        try {
            zzdrp a2 = zzdrp.m24115a(bArr, 0, a);
            zzdrw.mo29198a(a2);
            a2.mo29189a();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }
}
