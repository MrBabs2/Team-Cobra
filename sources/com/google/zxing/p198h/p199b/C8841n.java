package com.google.zxing.p198h.p199b;

/* renamed from: com.google.zxing.h.b.n */
/* compiled from: X12Encoder */
final class C8841n extends C8830c {
    C8841n() {
    }

    /* renamed from: a */
    public int mo32611a() {
        return 3;
    }

    /* renamed from: a */
    public void mo32609a(C8835h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.mo32633h()) {
                break;
            }
            char c = hVar.mo32627c();
            hVar.f25099f++;
            mo32612a(c, sb);
            if (sb.length() % 3 == 0) {
                C8830c.m28832b(hVar, sb);
                if (C8837j.m28879a(hVar.mo32629d(), hVar.f25099f, mo32611a()) != mo32611a()) {
                    hVar.mo32626b(0);
                    break;
                }
            }
        }
        mo32613a(hVar, sb);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo32612a(char c, StringBuilder sb) {
        if (c == 13) {
            sb.append(0);
        } else if (c == ' ') {
            sb.append(3);
        } else if (c == '*') {
            sb.append(1);
        } else if (c == '>') {
            sb.append(2);
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
        } else if (c < 'A' || c > 'Z') {
            C8837j.m28883a(c);
            throw null;
        } else {
            sb.append((char) ((c - 'A') + 14));
        }
        return 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32613a(C8835h hVar, StringBuilder sb) {
        hVar.mo32636k();
        int a = hVar.mo32632g().mo32637a() - hVar.mo32619a();
        hVar.f25099f -= sb.length();
        if (hVar.mo32631f() > 1 || a > 1 || hVar.mo32631f() != a) {
            hVar.mo32620a(254);
        }
        if (hVar.mo32630e() < 0) {
            hVar.mo32626b(0);
        }
    }
}
