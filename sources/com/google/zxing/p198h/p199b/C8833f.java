package com.google.zxing.p198h.p199b;

/* renamed from: com.google.zxing.h.b.f */
/* compiled from: EdifactEncoder */
final class C8833f implements C8834g {
    C8833f() {
    }

    /* renamed from: a */
    public int mo32618a() {
        return 4;
    }

    /* renamed from: a */
    public void mo32609a(C8835h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.mo32633h()) {
                break;
            }
            m28850a(hVar.mo32627c(), sb);
            hVar.f25099f++;
            if (sb.length() >= 4) {
                hVar.mo32624a(m28849a((CharSequence) sb, 0));
                sb.delete(0, 4);
                if (C8837j.m28879a(hVar.mo32629d(), hVar.f25099f, mo32618a()) != mo32618a()) {
                    hVar.mo32626b(0);
                    break;
                }
            }
        }
        sb.append(31);
        m28851a(hVar, (CharSequence) sb);
    }

    /* renamed from: a */
    private static void m28851a(C8835h hVar, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length != 0) {
                boolean z = true;
                if (length == 1) {
                    hVar.mo32636k();
                    int a = hVar.mo32632g().mo32637a() - hVar.mo32619a();
                    int f = hVar.mo32631f();
                    if (f > a) {
                        hVar.mo32628c(hVar.mo32619a() + 1);
                        a = hVar.mo32632g().mo32637a() - hVar.mo32619a();
                    }
                    if (f <= a && a <= 2) {
                        hVar.mo32626b(0);
                        return;
                    }
                }
                if (length <= 4) {
                    int i = length - 1;
                    String a2 = m28849a(charSequence, 0);
                    if (!(!hVar.mo32633h()) || i > 2) {
                        z = false;
                    }
                    if (i <= 2) {
                        hVar.mo32628c(hVar.mo32619a() + i);
                        if (hVar.mo32632g().mo32637a() - hVar.mo32619a() >= 3) {
                            hVar.mo32628c(hVar.mo32619a() + a2.length());
                            z = false;
                        }
                    }
                    if (z) {
                        hVar.mo32635j();
                        hVar.f25099f -= i;
                    } else {
                        hVar.mo32624a(a2);
                    }
                    hVar.mo32626b(0);
                    return;
                }
                throw new IllegalStateException("Count must not exceed 4");
            }
        } finally {
            hVar.mo32626b(0);
        }
    }

    /* renamed from: a */
    private static void m28850a(char c, StringBuilder sb) {
        if (c >= ' ' && c <= '?') {
            sb.append(c);
        } else if (c < '@' || c > '^') {
            C8837j.m28883a(c);
            throw null;
        } else {
            sb.append((char) (c - '@'));
        }
    }

    /* renamed from: a */
    private static String m28849a(CharSequence charSequence, int i) {
        int length = charSequence.length() - i;
        if (length != 0) {
            char charAt = charSequence.charAt(i);
            char c = 0;
            char charAt2 = length >= 2 ? charSequence.charAt(i + 1) : 0;
            char charAt3 = length >= 3 ? charSequence.charAt(i + 2) : 0;
            if (length >= 4) {
                c = charSequence.charAt(i + 3);
            }
            int i2 = (charAt << 18) + (charAt2 << 12) + (charAt3 << 6) + c;
            char c2 = (char) ((i2 >> 8) & 255);
            char c3 = (char) (i2 & 255);
            StringBuilder sb = new StringBuilder(3);
            sb.append((char) ((i2 >> 16) & 255));
            if (length >= 2) {
                sb.append(c2);
            }
            if (length >= 3) {
                sb.append(c3);
            }
            return sb.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }
}
