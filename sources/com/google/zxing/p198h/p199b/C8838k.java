package com.google.zxing.p198h.p199b;

import com.google.zxing.C8807b;

/* renamed from: com.google.zxing.h.b.k */
/* compiled from: SymbolInfo */
public class C8838k {

    /* renamed from: i */
    private static C8838k[] f25107i = {new C8838k(false, 3, 5, 8, 8, 1), new C8838k(false, 5, 7, 10, 10, 1), new C8838k(true, 5, 7, 16, 6, 1), new C8838k(false, 8, 10, 12, 12, 1), new C8838k(true, 10, 11, 14, 6, 2), new C8838k(false, 12, 12, 14, 14, 1), new C8838k(true, 16, 14, 24, 10, 1), new C8838k(false, 18, 14, 16, 16, 1), new C8838k(false, 22, 18, 18, 18, 1), new C8838k(true, 22, 18, 16, 10, 2), new C8838k(false, 30, 20, 20, 20, 1), new C8838k(true, 32, 24, 16, 14, 2), new C8838k(false, 36, 24, 22, 22, 1), new C8838k(false, 44, 28, 24, 24, 1), new C8838k(true, 49, 28, 22, 14, 2), new C8838k(false, 62, 36, 14, 14, 4), new C8838k(false, 86, 42, 16, 16, 4), new C8838k(false, 114, 48, 18, 18, 4), new C8838k(false, 144, 56, 20, 20, 4), new C8838k(false, 174, 68, 22, 22, 4), new C8838k(false, 204, 84, 24, 24, 4, 102, 42), new C8838k(false, 280, 112, 14, 14, 16, 140, 56), new C8838k(false, 368, 144, 16, 16, 16, 92, 36), new C8838k(false, 456, 192, 18, 18, 16, 114, 48), new C8838k(false, 576, 224, 20, 20, 16, 144, 56), new C8838k(false, 696, 272, 22, 22, 16, 174, 68), new C8838k(false, 816, 336, 24, 24, 16, 136, 56), new C8838k(false, 1050, 408, 18, 18, 36, 175, 68), new C8838k(false, 1304, 496, 20, 20, 36, 163, 62), new C8831d()};

    /* renamed from: a */
    private final boolean f25108a;

    /* renamed from: b */
    private final int f25109b;

    /* renamed from: c */
    private final int f25110c;

    /* renamed from: d */
    public final int f25111d;

    /* renamed from: e */
    public final int f25112e;

    /* renamed from: f */
    private final int f25113f;

    /* renamed from: g */
    private final int f25114g;

    /* renamed from: h */
    private final int f25115h;

    public C8838k(boolean z, int i, int i2, int i3, int i4, int i5) {
        this(z, i, i2, i3, i4, i5, i, i2);
    }

    /* renamed from: a */
    public static C8838k m28892a(int i, C8839l lVar, C8807b bVar, C8807b bVar2, boolean z) {
        for (C8838k kVar : f25107i) {
            if ((lVar != C8839l.FORCE_SQUARE || !kVar.f25108a) && ((lVar != C8839l.FORCE_RECTANGLE || kVar.f25108a) && ((bVar == null || (kVar.mo32643g() >= bVar.mo32536b() && kVar.mo32642f() >= bVar.mo32535a())) && ((bVar2 == null || (kVar.mo32643g() <= bVar2.mo32536b() && kVar.mo32642f() <= bVar2.mo32535a())) && i <= kVar.f25109b)))) {
                return kVar;
            }
        }
        if (!z) {
            return null;
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i)));
    }

    /* renamed from: h */
    private int m28893h() {
        int i = this.f25113f;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (!(i == 2 || i == 4)) {
                if (i == 16) {
                    return 4;
                }
                if (i == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i2;
    }

    /* renamed from: i */
    private int m28894i() {
        int i = this.f25113f;
        if (i == 1 || i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    /* renamed from: b */
    public final int mo32638b() {
        return this.f25110c;
    }

    /* renamed from: c */
    public int mo32615c() {
        return this.f25109b / this.f25114g;
    }

    /* renamed from: d */
    public final int mo32640d() {
        return m28894i() * this.f25112e;
    }

    /* renamed from: e */
    public final int mo32641e() {
        return m28893h() * this.f25111d;
    }

    /* renamed from: f */
    public final int mo32642f() {
        return mo32640d() + (m28894i() << 1);
    }

    /* renamed from: g */
    public final int mo32643g() {
        return mo32641e() + (m28893h() << 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f25108a ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        sb.append(this.f25111d);
        sb.append('x');
        sb.append(this.f25112e);
        sb.append(", symbol size ");
        sb.append(mo32643g());
        sb.append('x');
        sb.append(mo32642f());
        sb.append(", symbol data size ");
        sb.append(mo32641e());
        sb.append('x');
        sb.append(mo32640d());
        sb.append(", codewords ");
        sb.append(this.f25109b);
        sb.append('+');
        sb.append(this.f25110c);
        return sb.toString();
    }

    C8838k(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f25108a = z;
        this.f25109b = i;
        this.f25110c = i2;
        this.f25111d = i3;
        this.f25112e = i4;
        this.f25113f = i5;
        this.f25114g = i6;
        this.f25115h = i7;
    }

    /* renamed from: b */
    public final int mo32639b(int i) {
        return this.f25115h;
    }

    /* renamed from: a */
    public final int mo32637a() {
        return this.f25109b;
    }

    /* renamed from: a */
    public int mo32614a(int i) {
        return this.f25114g;
    }
}
