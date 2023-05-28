package com.google.zxing.p203k.p204b;

import okhttp3.internal.p398ws.WebSocketProtocol;

/* renamed from: com.google.zxing.k.b.c */
/* compiled from: Version */
public final class C8874c {

    /* renamed from: d */
    private static final C8874c[] f25195d = m28990d();

    /* renamed from: a */
    private final int f25196a;

    /* renamed from: b */
    private final C8876b[] f25197b;

    /* renamed from: c */
    private final int f25198c;

    /* renamed from: com.google.zxing.k.b.c$a */
    /* compiled from: Version */
    public static final class C8875a {

        /* renamed from: a */
        private final int f25199a;

        /* renamed from: b */
        private final int f25200b;

        C8875a(int i, int i2) {
            this.f25199a = i;
            this.f25200b = i2;
        }

        /* renamed from: a */
        public int mo32670a() {
            return this.f25199a;
        }

        /* renamed from: b */
        public int mo32671b() {
            return this.f25200b;
        }
    }

    /* renamed from: com.google.zxing.k.b.c$b */
    /* compiled from: Version */
    public static final class C8876b {

        /* renamed from: a */
        private final int f25201a;

        /* renamed from: b */
        private final C8875a[] f25202b;

        C8876b(int i, C8875a... aVarArr) {
            this.f25201a = i;
            this.f25202b = aVarArr;
        }

        /* renamed from: a */
        public C8875a[] mo32672a() {
            return this.f25202b;
        }

        /* renamed from: b */
        public int mo32673b() {
            return this.f25201a;
        }

        /* renamed from: c */
        public int mo32674c() {
            int i = 0;
            for (C8875a a : this.f25202b) {
                i += a.mo32670a();
            }
            return i;
        }

        /* renamed from: d */
        public int mo32675d() {
            return this.f25201a * mo32674c();
        }
    }

    private C8874c(int i, int[] iArr, C8876b... bVarArr) {
        this.f25196a = i;
        this.f25197b = bVarArr;
        int b = bVarArr[0].mo32673b();
        int i2 = 0;
        for (C8875a aVar : bVarArr[0].mo32672a()) {
            i2 += aVar.mo32670a() * (aVar.mo32671b() + b);
        }
        this.f25198c = i2;
    }

    /* renamed from: d */
    private static C8874c[] m28990d() {
        return new C8874c[]{new C8874c(1, new int[0], new C8876b(7, new C8875a(1, 19)), new C8876b(10, new C8875a(1, 16)), new C8876b(13, new C8875a(1, 13)), new C8876b(17, new C8875a(1, 9))), new C8874c(2, new int[]{6, 18}, new C8876b(10, new C8875a(1, 34)), new C8876b(16, new C8875a(1, 28)), new C8876b(22, new C8875a(1, 22)), new C8876b(28, new C8875a(1, 16))), new C8874c(3, new int[]{6, 22}, new C8876b(15, new C8875a(1, 55)), new C8876b(26, new C8875a(1, 44)), new C8876b(18, new C8875a(2, 17)), new C8876b(22, new C8875a(2, 13))), new C8874c(4, new int[]{6, 26}, new C8876b(20, new C8875a(1, 80)), new C8876b(18, new C8875a(2, 32)), new C8876b(26, new C8875a(2, 24)), new C8876b(16, new C8875a(4, 9))), new C8874c(5, new int[]{6, 30}, new C8876b(26, new C8875a(1, 108)), new C8876b(24, new C8875a(2, 43)), new C8876b(18, new C8875a(2, 15), new C8875a(2, 16)), new C8876b(22, new C8875a(2, 11), new C8875a(2, 12))), new C8874c(6, new int[]{6, 34}, new C8876b(18, new C8875a(2, 68)), new C8876b(16, new C8875a(4, 27)), new C8876b(24, new C8875a(4, 19)), new C8876b(28, new C8875a(4, 15))), new C8874c(7, new int[]{6, 22, 38}, new C8876b(20, new C8875a(2, 78)), new C8876b(18, new C8875a(4, 31)), new C8876b(18, new C8875a(2, 14), new C8875a(4, 15)), new C8876b(26, new C8875a(4, 13), new C8875a(1, 14))), new C8874c(8, new int[]{6, 24, 42}, new C8876b(24, new C8875a(2, 97)), new C8876b(22, new C8875a(2, 38), new C8875a(2, 39)), new C8876b(22, new C8875a(4, 18), new C8875a(2, 19)), new C8876b(26, new C8875a(4, 14), new C8875a(2, 15))), new C8874c(9, new int[]{6, 26, 46}, new C8876b(30, new C8875a(2, 116)), new C8876b(22, new C8875a(3, 36), new C8875a(2, 37)), new C8876b(20, new C8875a(4, 16), new C8875a(4, 17)), new C8876b(24, new C8875a(4, 12), new C8875a(4, 13))), new C8874c(10, new int[]{6, 28, 50}, new C8876b(18, new C8875a(2, 68), new C8875a(2, 69)), new C8876b(26, new C8875a(4, 43), new C8875a(1, 44)), new C8876b(24, new C8875a(6, 19), new C8875a(2, 20)), new C8876b(28, new C8875a(6, 15), new C8875a(2, 16))), new C8874c(11, new int[]{6, 30, 54}, new C8876b(20, new C8875a(4, 81)), new C8876b(30, new C8875a(1, 50), new C8875a(4, 51)), new C8876b(28, new C8875a(4, 22), new C8875a(4, 23)), new C8876b(24, new C8875a(3, 12), new C8875a(8, 13))), new C8874c(12, new int[]{6, 32, 58}, new C8876b(24, new C8875a(2, 92), new C8875a(2, 93)), new C8876b(22, new C8875a(6, 36), new C8875a(2, 37)), new C8876b(26, new C8875a(4, 20), new C8875a(6, 21)), new C8876b(28, new C8875a(7, 14), new C8875a(4, 15))), new C8874c(13, new int[]{6, 34, 62}, new C8876b(26, new C8875a(4, 107)), new C8876b(22, new C8875a(8, 37), new C8875a(1, 38)), new C8876b(24, new C8875a(8, 20), new C8875a(4, 21)), new C8876b(22, new C8875a(12, 11), new C8875a(4, 12))), new C8874c(14, new int[]{6, 26, 46, 66}, new C8876b(30, new C8875a(3, 115), new C8875a(1, 116)), new C8876b(24, new C8875a(4, 40), new C8875a(5, 41)), new C8876b(20, new C8875a(11, 16), new C8875a(5, 17)), new C8876b(24, new C8875a(11, 12), new C8875a(5, 13))), new C8874c(15, new int[]{6, 26, 48, 70}, new C8876b(22, new C8875a(5, 87), new C8875a(1, 88)), new C8876b(24, new C8875a(5, 41), new C8875a(5, 42)), new C8876b(30, new C8875a(5, 24), new C8875a(7, 25)), new C8876b(24, new C8875a(11, 12), new C8875a(7, 13))), new C8874c(16, new int[]{6, 26, 50, 74}, new C8876b(24, new C8875a(5, 98), new C8875a(1, 99)), new C8876b(28, new C8875a(7, 45), new C8875a(3, 46)), new C8876b(24, new C8875a(15, 19), new C8875a(2, 20)), new C8876b(30, new C8875a(3, 15), new C8875a(13, 16))), new C8874c(17, new int[]{6, 30, 54, 78}, new C8876b(28, new C8875a(1, 107), new C8875a(5, 108)), new C8876b(28, new C8875a(10, 46), new C8875a(1, 47)), new C8876b(28, new C8875a(1, 22), new C8875a(15, 23)), new C8876b(28, new C8875a(2, 14), new C8875a(17, 15))), new C8874c(18, new int[]{6, 30, 56, 82}, new C8876b(30, new C8875a(5, 120), new C8875a(1, 121)), new C8876b(26, new C8875a(9, 43), new C8875a(4, 44)), new C8876b(28, new C8875a(17, 22), new C8875a(1, 23)), new C8876b(28, new C8875a(2, 14), new C8875a(19, 15))), new C8874c(19, new int[]{6, 30, 58, 86}, new C8876b(28, new C8875a(3, 113), new C8875a(4, 114)), new C8876b(26, new C8875a(3, 44), new C8875a(11, 45)), new C8876b(26, new C8875a(17, 21), new C8875a(4, 22)), new C8876b(26, new C8875a(9, 13), new C8875a(16, 14))), new C8874c(20, new int[]{6, 34, 62, 90}, new C8876b(28, new C8875a(3, 107), new C8875a(5, 108)), new C8876b(26, new C8875a(3, 41), new C8875a(13, 42)), new C8876b(30, new C8875a(15, 24), new C8875a(5, 25)), new C8876b(28, new C8875a(15, 15), new C8875a(10, 16))), new C8874c(21, new int[]{6, 28, 50, 72, 94}, new C8876b(28, new C8875a(4, 116), new C8875a(4, 117)), new C8876b(26, new C8875a(17, 42)), new C8876b(28, new C8875a(17, 22), new C8875a(6, 23)), new C8876b(30, new C8875a(19, 16), new C8875a(6, 17))), new C8874c(22, new int[]{6, 26, 50, 74, 98}, new C8876b(28, new C8875a(2, 111), new C8875a(7, 112)), new C8876b(28, new C8875a(17, 46)), new C8876b(30, new C8875a(7, 24), new C8875a(16, 25)), new C8876b(24, new C8875a(34, 13))), new C8874c(23, new int[]{6, 30, 54, 78, 102}, new C8876b(30, new C8875a(4, 121), new C8875a(5, 122)), new C8876b(28, new C8875a(4, 47), new C8875a(14, 48)), new C8876b(30, new C8875a(11, 24), new C8875a(14, 25)), new C8876b(30, new C8875a(16, 15), new C8875a(14, 16))), new C8874c(24, new int[]{6, 28, 54, 80, 106}, new C8876b(30, new C8875a(6, 117), new C8875a(4, 118)), new C8876b(28, new C8875a(6, 45), new C8875a(14, 46)), new C8876b(30, new C8875a(11, 24), new C8875a(16, 25)), new C8876b(30, new C8875a(30, 16), new C8875a(2, 17))), new C8874c(25, new int[]{6, 32, 58, 84, 110}, new C8876b(26, new C8875a(8, 106), new C8875a(4, 107)), new C8876b(28, new C8875a(8, 47), new C8875a(13, 48)), new C8876b(30, new C8875a(7, 24), new C8875a(22, 25)), new C8876b(30, new C8875a(22, 15), new C8875a(13, 16))), new C8874c(26, new int[]{6, 30, 58, 86, 114}, new C8876b(28, new C8875a(10, 114), new C8875a(2, 115)), new C8876b(28, new C8875a(19, 46), new C8875a(4, 47)), new C8876b(28, new C8875a(28, 22), new C8875a(6, 23)), new C8876b(30, new C8875a(33, 16), new C8875a(4, 17))), new C8874c(27, new int[]{6, 34, 62, 90, 118}, new C8876b(30, new C8875a(8, 122), new C8875a(4, 123)), new C8876b(28, new C8875a(22, 45), new C8875a(3, 46)), new C8876b(30, new C8875a(8, 23), new C8875a(26, 24)), new C8876b(30, new C8875a(12, 15), new C8875a(28, 16))), new C8874c(28, new int[]{6, 26, 50, 74, 98, 122}, new C8876b(30, new C8875a(3, 117), new C8875a(10, 118)), new C8876b(28, new C8875a(3, 45), new C8875a(23, 46)), new C8876b(30, new C8875a(4, 24), new C8875a(31, 25)), new C8876b(30, new C8875a(11, 15), new C8875a(31, 16))), new C8874c(29, new int[]{6, 30, 54, 78, 102, WebSocketProtocol.PAYLOAD_SHORT}, new C8876b(30, new C8875a(7, 116), new C8875a(7, 117)), new C8876b(28, new C8875a(21, 45), new C8875a(7, 46)), new C8876b(30, new C8875a(1, 23), new C8875a(37, 24)), new C8876b(30, new C8875a(19, 15), new C8875a(26, 16))), new C8874c(30, new int[]{6, 26, 52, 78, 104, 130}, new C8876b(30, new C8875a(5, 115), new C8875a(10, 116)), new C8876b(28, new C8875a(19, 47), new C8875a(10, 48)), new C8876b(30, new C8875a(15, 24), new C8875a(25, 25)), new C8876b(30, new C8875a(23, 15), new C8875a(25, 16))), new C8874c(31, new int[]{6, 30, 56, 82, 108, 134}, new C8876b(30, new C8875a(13, 115), new C8875a(3, 116)), new C8876b(28, new C8875a(2, 46), new C8875a(29, 47)), new C8876b(30, new C8875a(42, 24), new C8875a(1, 25)), new C8876b(30, new C8875a(23, 15), new C8875a(28, 16))), new C8874c(32, new int[]{6, 34, 60, 86, 112, 138}, new C8876b(30, new C8875a(17, 115)), new C8876b(28, new C8875a(10, 46), new C8875a(23, 47)), new C8876b(30, new C8875a(10, 24), new C8875a(35, 25)), new C8876b(30, new C8875a(19, 15), new C8875a(35, 16))), new C8874c(33, new int[]{6, 30, 58, 86, 114, 142}, new C8876b(30, new C8875a(17, 115), new C8875a(1, 116)), new C8876b(28, new C8875a(14, 46), new C8875a(21, 47)), new C8876b(30, new C8875a(29, 24), new C8875a(19, 25)), new C8876b(30, new C8875a(11, 15), new C8875a(46, 16))), new C8874c(34, new int[]{6, 34, 62, 90, 118, 146}, new C8876b(30, new C8875a(13, 115), new C8875a(6, 116)), new C8876b(28, new C8875a(14, 46), new C8875a(23, 47)), new C8876b(30, new C8875a(44, 24), new C8875a(7, 25)), new C8876b(30, new C8875a(59, 16), new C8875a(1, 17))), new C8874c(35, new int[]{6, 30, 54, 78, 102, WebSocketProtocol.PAYLOAD_SHORT, 150}, new C8876b(30, new C8875a(12, 121), new C8875a(7, 122)), new C8876b(28, new C8875a(12, 47), new C8875a(26, 48)), new C8876b(30, new C8875a(39, 24), new C8875a(14, 25)), new C8876b(30, new C8875a(22, 15), new C8875a(41, 16))), new C8874c(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new C8876b(30, new C8875a(6, 121), new C8875a(14, 122)), new C8876b(28, new C8875a(6, 47), new C8875a(34, 48)), new C8876b(30, new C8875a(46, 24), new C8875a(10, 25)), new C8876b(30, new C8875a(2, 15), new C8875a(64, 16))), new C8874c(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new C8876b(30, new C8875a(17, 122), new C8875a(4, 123)), new C8876b(28, new C8875a(29, 46), new C8875a(14, 47)), new C8876b(30, new C8875a(49, 24), new C8875a(10, 25)), new C8876b(30, new C8875a(24, 15), new C8875a(46, 16))), new C8874c(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new C8876b(30, new C8875a(4, 122), new C8875a(18, 123)), new C8876b(28, new C8875a(13, 46), new C8875a(32, 47)), new C8876b(30, new C8875a(48, 24), new C8875a(14, 25)), new C8876b(30, new C8875a(42, 15), new C8875a(32, 16))), new C8874c(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new C8876b(30, new C8875a(20, 117), new C8875a(4, 118)), new C8876b(28, new C8875a(40, 47), new C8875a(7, 48)), new C8876b(30, new C8875a(43, 24), new C8875a(22, 25)), new C8876b(30, new C8875a(10, 15), new C8875a(67, 16))), new C8874c(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new C8876b(30, new C8875a(19, 118), new C8875a(6, 119)), new C8876b(28, new C8875a(18, 47), new C8875a(31, 48)), new C8876b(30, new C8875a(34, 24), new C8875a(34, 25)), new C8876b(30, new C8875a(20, 15), new C8875a(61, 16)))};
    }

    /* renamed from: a */
    public int mo32665a() {
        return (this.f25196a * 4) + 17;
    }

    /* renamed from: b */
    public int mo32667b() {
        return this.f25198c;
    }

    /* renamed from: c */
    public int mo32668c() {
        return this.f25196a;
    }

    public String toString() {
        return String.valueOf(this.f25196a);
    }

    /* renamed from: a */
    public C8876b mo32666a(C8872a aVar) {
        return this.f25197b[aVar.ordinal()];
    }

    /* renamed from: a */
    public static C8874c m28989a(int i) {
        if (i > 0 && i <= 40) {
            return f25195d[i - 1];
        }
        throw new IllegalArgumentException();
    }
}
