package com.google.zxing.p198h.p199b;

/* renamed from: com.google.zxing.h.b.c */
/* compiled from: C40Encoder */
class C8830c implements C8834g {
    C8830c() {
    }

    /* renamed from: b */
    static void m28832b(C8835h hVar, StringBuilder sb) {
        hVar.mo32624a(m28831a((CharSequence) sb, 0));
        sb.delete(0, 3);
    }

    /* renamed from: a */
    public int mo32611a() {
        return 1;
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
            int a = mo32612a(c, sb);
            int a2 = hVar.mo32619a() + ((sb.length() / 3) << 1);
            hVar.mo32628c(a2);
            int a3 = hVar.mo32632g().mo32637a() - a2;
            if (hVar.mo32633h()) {
                if (sb.length() % 3 == 0 && C8837j.m28879a(hVar.mo32629d(), hVar.f25099f, mo32611a()) != mo32611a()) {
                    hVar.mo32626b(0);
                    break;
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (a3 < 2 || a3 > 2)) {
                    a = m28830a(hVar, sb, sb2, a);
                }
                while (sb.length() % 3 == 1 && ((a <= 3 && a3 != 1) || a > 3)) {
                    a = m28830a(hVar, sb, sb2, a);
                }
            }
        }
        mo32613a(hVar, sb);
    }

    /* renamed from: a */
    private int m28830a(C8835h hVar, StringBuilder sb, StringBuilder sb2, int i) {
        int length = sb.length();
        sb.delete(length - i, length);
        hVar.f25099f--;
        int a = mo32612a(hVar.mo32627c(), sb2);
        hVar.mo32635j();
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32613a(C8835h hVar, StringBuilder sb) {
        int length = sb.length() % 3;
        int a = hVar.mo32619a() + ((sb.length() / 3) << 1);
        hVar.mo32628c(a);
        int a2 = hVar.mo32632g().mo32637a() - a;
        if (length == 2) {
            sb.append(0);
            while (sb.length() >= 3) {
                m28832b(hVar, sb);
            }
            if (hVar.mo32633h()) {
                hVar.mo32620a(254);
            }
        } else if (a2 == 1 && length == 1) {
            while (sb.length() >= 3) {
                m28832b(hVar, sb);
            }
            if (hVar.mo32633h()) {
                hVar.mo32620a(254);
            }
            hVar.f25099f--;
        } else if (length == 0) {
            while (sb.length() >= 3) {
                m28832b(hVar, sb);
            }
            if (a2 > 0 || hVar.mo32633h()) {
                hVar.mo32620a(254);
            }
        } else {
            throw new IllegalStateException("Unexpected case. Please report!");
        }
        hVar.mo32626b(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo32612a(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append(3);
            return 1;
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
            return 1;
        } else if (c >= 'A' && c <= 'Z') {
            sb.append((char) ((c - 'A') + 14));
            return 1;
        } else if (c < ' ') {
            sb.append(0);
            sb.append(c);
            return 2;
        } else if (c >= '!' && c <= '/') {
            sb.append(1);
            sb.append((char) (c - '!'));
            return 2;
        } else if (c >= ':' && c <= '@') {
            sb.append(1);
            sb.append((char) ((c - ':') + 15));
            return 2;
        } else if (c >= '[' && c <= '_') {
            sb.append(1);
            sb.append((char) ((c - '[') + 22));
            return 2;
        } else if (c < '`' || c > 127) {
            sb.append("\u0001\u001e");
            return mo32612a((char) (c - 128), sb) + 2;
        } else {
            sb.append(2);
            sb.append((char) (c - '`'));
            return 2;
        }
    }

    /* renamed from: a */
    private static String m28831a(CharSequence charSequence, int i) {
        int charAt = (charSequence.charAt(i) * 1600) + (charSequence.charAt(i + 1) * '(') + charSequence.charAt(i + 2) + 1;
        return new String(new char[]{(char) (charAt / 256), (char) (charAt % 256)});
    }
}
