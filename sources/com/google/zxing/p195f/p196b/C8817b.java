package com.google.zxing.p195f.p196b;

import com.google.zxing.p197g.C8824a;

/* renamed from: com.google.zxing.f.b.b */
/* compiled from: BinaryShiftToken */
final class C8817b extends C8823g {

    /* renamed from: c */
    private final short f25035c;

    /* renamed from: d */
    private final short f25036d;

    C8817b(C8823g gVar, int i, int i2) {
        super(gVar);
        this.f25035c = (short) i;
        this.f25036d = (short) i2;
    }

    /* renamed from: a */
    public void mo32565a(C8824a aVar, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.f25036d;
            if (i < s) {
                if (i == 0 || (i == 31 && s <= 62)) {
                    aVar.mo32584a(31, 5);
                    short s2 = this.f25036d;
                    if (s2 > 62) {
                        aVar.mo32584a(s2 - 31, 16);
                    } else if (i == 0) {
                        aVar.mo32584a(Math.min(s2, 31), 5);
                    } else {
                        aVar.mo32584a(s2 - 31, 5);
                    }
                }
                aVar.mo32584a(bArr[this.f25035c + i], 8);
                i++;
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(this.f25035c);
        sb.append("::");
        sb.append((this.f25035c + this.f25036d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
