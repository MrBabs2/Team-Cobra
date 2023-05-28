package com.google.zxing.p203k.p204b;

/* renamed from: com.google.zxing.k.b.b */
/* compiled from: Mode */
public enum C8873b {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);
    

    /* renamed from: f */
    private final int[] f25193f;

    /* renamed from: g */
    private final int f25194g;

    private C8873b(int[] iArr, int i) {
        this.f25193f = iArr;
        this.f25194g = i;
    }

    /* renamed from: a */
    public int mo32664a(C8874c cVar) {
        int c = cVar.mo32668c();
        return this.f25193f[c <= 9 ? 0 : c <= 26 ? (char) 1 : 2];
    }

    /* renamed from: a */
    public int mo32663a() {
        return this.f25194g;
    }
}
