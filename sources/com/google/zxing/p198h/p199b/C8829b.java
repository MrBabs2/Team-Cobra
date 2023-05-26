package com.google.zxing.p198h.p199b;

/* renamed from: com.google.zxing.h.b.b */
/* compiled from: Base256Encoder */
final class C8829b implements C8834g {
    C8829b() {
    }

    /* renamed from: a */
    public int mo32610a() {
        return 5;
    }

    /* renamed from: a */
    public void mo32609a(C8835h hVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(0);
        while (true) {
            if (!hVar.mo32633h()) {
                break;
            }
            sb.append(hVar.mo32627c());
            hVar.f25099f++;
            if (C8837j.m28879a(hVar.mo32629d(), hVar.f25099f, mo32610a()) != mo32610a()) {
                hVar.mo32626b(0);
                break;
            }
        }
        int length = sb.length() - 1;
        int a = hVar.mo32619a() + length + 1;
        hVar.mo32628c(a);
        boolean z = hVar.mo32632g().mo32637a() - a > 0;
        if (hVar.mo32633h() || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                sb.setCharAt(0, (char) ((length / 250) + 249));
                sb.insert(1, (char) (length % 250));
            } else {
                throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
            }
        }
        int length2 = sb.length();
        for (int i = 0; i < length2; i++) {
            hVar.mo32620a(m28827a(sb.charAt(i), hVar.mo32619a() + 1));
        }
    }

    /* renamed from: a */
    private static char m28827a(char c, int i) {
        int i2 = c + ((i * 149) % 255) + 1;
        return i2 <= 255 ? (char) i2 : (char) (i2 - 256);
    }
}
