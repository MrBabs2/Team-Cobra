package com.google.zxing.p198h.p199b;

/* renamed from: com.google.zxing.h.b.a */
/* compiled from: ASCIIEncoder */
final class C8828a implements C8834g {
    C8828a() {
    }

    /* renamed from: a */
    public int mo32608a() {
        return 0;
    }

    /* renamed from: a */
    public void mo32609a(C8835h hVar) {
        if (C8837j.m28878a((CharSequence) hVar.mo32629d(), hVar.f25099f) >= 2) {
            hVar.mo32620a(m28824a(hVar.mo32629d().charAt(hVar.f25099f), hVar.mo32629d().charAt(hVar.f25099f + 1)));
            hVar.f25099f += 2;
            return;
        }
        char c = hVar.mo32627c();
        int a = C8837j.m28879a(hVar.mo32629d(), hVar.f25099f, mo32608a());
        if (a != mo32608a()) {
            if (a == 1) {
                hVar.mo32620a(230);
                hVar.mo32626b(1);
            } else if (a == 2) {
                hVar.mo32620a(239);
                hVar.mo32626b(2);
            } else if (a == 3) {
                hVar.mo32620a(238);
                hVar.mo32626b(3);
            } else if (a == 4) {
                hVar.mo32620a(240);
                hVar.mo32626b(4);
            } else if (a == 5) {
                hVar.mo32620a(231);
                hVar.mo32626b(5);
            } else {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(a)));
            }
        } else if (C8837j.m28885c(c)) {
            hVar.mo32620a(235);
            hVar.mo32620a((char) ((c - 128) + 1));
            hVar.f25099f++;
        } else {
            hVar.mo32620a((char) (c + 1));
            hVar.f25099f++;
        }
    }

    /* renamed from: a */
    private static char m28824a(char c, char c2) {
        if (C8837j.m28884b(c) && C8837j.m28884b(c2)) {
            return (char) (((c - '0') * 10) + (c2 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c + c2);
    }
}
