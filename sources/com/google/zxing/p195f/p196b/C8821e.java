package com.google.zxing.p195f.p196b;

import com.google.zxing.p197g.C8824a;

/* renamed from: com.google.zxing.f.b.e */
/* compiled from: SimpleToken */
final class C8821e extends C8823g {

    /* renamed from: c */
    private final short f25043c;

    /* renamed from: d */
    private final short f25044d;

    C8821e(C8823g gVar, int i, int i2) {
        super(gVar);
        this.f25043c = (short) i;
        this.f25044d = (short) i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32565a(C8824a aVar, byte[] bArr) {
        aVar.mo32584a(this.f25043c, this.f25044d);
    }

    public String toString() {
        short s = this.f25043c;
        short s2 = this.f25044d;
        short s3 = (s & ((1 << s2) - 1)) | (1 << s2);
        return "<" + Integer.toBinaryString(s3 | (1 << this.f25044d)).substring(1) + '>';
    }
}
