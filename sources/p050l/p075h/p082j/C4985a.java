package p050l.p075h.p082j;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* renamed from: l.h.j.a */
/* compiled from: BidiFormatter */
public final class C4985a {

    /* renamed from: d */
    static final C4992d f8819d = C4993e.f8851c;

    /* renamed from: e */
    private static final String f8820e = Character.toString(8206);

    /* renamed from: f */
    private static final String f8821f = Character.toString(8207);

    /* renamed from: g */
    static final C4985a f8822g = new C4985a(false, 2, f8819d);

    /* renamed from: h */
    static final C4985a f8823h = new C4985a(true, 2, f8819d);

    /* renamed from: a */
    private final boolean f8824a;

    /* renamed from: b */
    private final int f8825b;

    /* renamed from: c */
    private final C4992d f8826c;

    /* renamed from: l.h.j.a$a */
    /* compiled from: BidiFormatter */
    public static final class C4986a {

        /* renamed from: a */
        private boolean f8827a;

        /* renamed from: b */
        private int f8828b;

        /* renamed from: c */
        private C4992d f8829c;

        public C4986a() {
            m8848b(C4985a.m8837a(Locale.getDefault()));
        }

        /* renamed from: a */
        private static C4985a m8847a(boolean z) {
            return z ? C4985a.f8823h : C4985a.f8822g;
        }

        /* renamed from: b */
        private void m8848b(boolean z) {
            this.f8827a = z;
            this.f8829c = C4985a.f8819d;
            this.f8828b = 2;
        }

        /* renamed from: a */
        public C4985a mo17417a() {
            if (this.f8828b == 2 && this.f8829c == C4985a.f8819d) {
                return m8847a(this.f8827a);
            }
            return new C4985a(this.f8827a, this.f8828b, this.f8829c);
        }
    }

    /* renamed from: l.h.j.a$b */
    /* compiled from: BidiFormatter */
    private static class C4987b {

        /* renamed from: f */
        private static final byte[] f8830f = new byte[1792];

        /* renamed from: a */
        private final CharSequence f8831a;

        /* renamed from: b */
        private final boolean f8832b;

        /* renamed from: c */
        private final int f8833c;

        /* renamed from: d */
        private int f8834d;

        /* renamed from: e */
        private char f8835e;

        static {
            for (int i = 0; i < 1792; i++) {
                f8830f[i] = Character.getDirectionality(i);
            }
        }

        C4987b(CharSequence charSequence, boolean z) {
            this.f8831a = charSequence;
            this.f8832b = z;
            this.f8833c = charSequence.length();
        }

        /* renamed from: a */
        private static byte m8850a(char c) {
            return c < 1792 ? f8830f[c] : Character.getDirectionality(c);
        }

        /* renamed from: e */
        private byte m8851e() {
            char charAt;
            int i = this.f8834d;
            do {
                int i2 = this.f8834d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f8831a;
                int i3 = i2 - 1;
                this.f8834d = i3;
                charAt = charSequence.charAt(i3);
                this.f8835e = charAt;
                if (charAt == '&') {
                    return 12;
                }
            } while (charAt != ';');
            this.f8834d = i;
            this.f8835e = ';';
            return 13;
        }

        /* renamed from: f */
        private byte m8852f() {
            char charAt;
            do {
                int i = this.f8834d;
                if (i >= this.f8833c) {
                    return 12;
                }
                CharSequence charSequence = this.f8831a;
                this.f8834d = i + 1;
                charAt = charSequence.charAt(i);
                this.f8835e = charAt;
            } while (charAt != ';');
            return 12;
        }

        /* renamed from: g */
        private byte m8853g() {
            char charAt;
            int i = this.f8834d;
            while (true) {
                int i2 = this.f8834d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f8831a;
                int i3 = i2 - 1;
                this.f8834d = i3;
                char charAt2 = charSequence.charAt(i3);
                this.f8835e = charAt2;
                if (charAt2 == '<') {
                    return 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    char c = this.f8835e;
                    do {
                        int i4 = this.f8834d;
                        if (i4 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f8831a;
                        int i5 = i4 - 1;
                        this.f8834d = i5;
                        charAt = charSequence2.charAt(i5);
                        this.f8835e = charAt;
                    } while (charAt != c);
                }
            }
            this.f8834d = i;
            this.f8835e = '>';
            return 13;
        }

        /* renamed from: h */
        private byte m8854h() {
            char charAt;
            int i = this.f8834d;
            while (true) {
                int i2 = this.f8834d;
                if (i2 < this.f8833c) {
                    CharSequence charSequence = this.f8831a;
                    this.f8834d = i2 + 1;
                    char charAt2 = charSequence.charAt(i2);
                    this.f8835e = charAt2;
                    if (charAt2 == '>') {
                        return 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        char c = this.f8835e;
                        do {
                            int i3 = this.f8834d;
                            if (i3 >= this.f8833c) {
                                break;
                            }
                            CharSequence charSequence2 = this.f8831a;
                            this.f8834d = i3 + 1;
                            charAt = charSequence2.charAt(i3);
                            this.f8835e = charAt;
                        } while (charAt != c);
                    }
                } else {
                    this.f8834d = i;
                    this.f8835e = '<';
                    return 13;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public byte mo17419b() {
            char charAt = this.f8831a.charAt(this.f8834d);
            this.f8835e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f8831a, this.f8834d);
                this.f8834d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f8834d++;
            byte a = m8850a(this.f8835e);
            if (!this.f8832b) {
                return a;
            }
            char c = this.f8835e;
            if (c == '<') {
                return m8854h();
            }
            return c == '&' ? m8852f() : a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo17420c() {
            this.f8834d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f8834d < this.f8833c && i == 0) {
                byte b = mo17419b();
                if (b != 0) {
                    if (b == 1 || b == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (b != 9) {
                        switch (b) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f8834d > 0) {
                switch (mo17418a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
            r1 = r1 - 1;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo17421d() {
            /*
                r7 = this;
                int r0 = r7.f8833c
                r7.f8834d = r0
                r0 = 0
                r1 = 0
                r2 = 0
            L_0x0007:
                int r3 = r7.f8834d
                if (r3 <= 0) goto L_0x003b
                byte r3 = r7.mo17418a()
                r4 = -1
                if (r3 == 0) goto L_0x0034
                r5 = 1
                if (r3 == r5) goto L_0x002e
                r6 = 2
                if (r3 == r6) goto L_0x002e
                r6 = 9
                if (r3 == r6) goto L_0x0007
                switch(r3) {
                    case 14: goto L_0x0028;
                    case 15: goto L_0x0028;
                    case 16: goto L_0x0025;
                    case 17: goto L_0x0025;
                    case 18: goto L_0x0022;
                    default: goto L_0x001f;
                }
            L_0x001f:
                if (r2 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0022:
                int r1 = r1 + 1
                goto L_0x0007
            L_0x0025:
                if (r2 != r1) goto L_0x002b
                return r5
            L_0x0028:
                if (r2 != r1) goto L_0x002b
                return r4
            L_0x002b:
                int r1 = r1 + -1
                goto L_0x0007
            L_0x002e:
                if (r1 != 0) goto L_0x0031
                return r5
            L_0x0031:
                if (r2 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0034:
                if (r1 != 0) goto L_0x0037
                return r4
            L_0x0037:
                if (r2 != 0) goto L_0x0007
            L_0x0039:
                r2 = r1
                goto L_0x0007
            L_0x003b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p050l.p075h.p082j.C4985a.C4987b.mo17421d():int");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public byte mo17418a() {
            char charAt = this.f8831a.charAt(this.f8834d - 1);
            this.f8835e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f8831a, this.f8834d);
                this.f8834d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f8834d--;
            byte a = m8850a(this.f8835e);
            if (!this.f8832b) {
                return a;
            }
            char c = this.f8835e;
            if (c == '>') {
                return m8853g();
            }
            return c == ';' ? m8851e() : a;
        }
    }

    C4985a(boolean z, int i, C4992d dVar) {
        this.f8824a = z;
        this.f8825b = i;
        this.f8826c = dVar;
    }

    /* renamed from: b */
    public static C4985a m8840b() {
        return new C4986a().mo17417a();
    }

    /* renamed from: c */
    private static int m8841c(CharSequence charSequence) {
        return new C4987b(charSequence, false).mo17421d();
    }

    /* renamed from: a */
    public boolean mo17416a() {
        return (this.f8825b & 2) != 0;
    }

    /* renamed from: a */
    private String m8836a(CharSequence charSequence, C4992d dVar) {
        boolean a = dVar.mo17447a(charSequence, 0, charSequence.length());
        if (!this.f8824a && (a || m8841c(charSequence) == 1)) {
            return f8820e;
        }
        if (this.f8824a) {
            return (!a || m8841c(charSequence) == -1) ? f8821f : "";
        }
        return "";
    }

    /* renamed from: b */
    private String m8839b(CharSequence charSequence, C4992d dVar) {
        boolean a = dVar.mo17447a(charSequence, 0, charSequence.length());
        if (!this.f8824a && (a || m8838b(charSequence) == 1)) {
            return f8820e;
        }
        if (this.f8824a) {
            return (!a || m8838b(charSequence) == -1) ? f8821f : "";
        }
        return "";
    }

    /* renamed from: b */
    private static int m8838b(CharSequence charSequence) {
        return new C4987b(charSequence, false).mo17420c();
    }

    /* renamed from: a */
    public String mo17415a(String str, C4992d dVar, boolean z) {
        if (str == null) {
            return null;
        }
        return mo17413a((CharSequence) str, dVar, z).toString();
    }

    /* renamed from: a */
    public CharSequence mo17413a(CharSequence charSequence, C4992d dVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean a = dVar.mo17447a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (mo17416a() && z) {
            spannableStringBuilder.append(m8839b(charSequence, a ? C4993e.f8850b : C4993e.f8849a));
        }
        if (a != this.f8824a) {
            spannableStringBuilder.append(a ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append(m8836a(charSequence, a ? C4993e.f8850b : C4993e.f8849a));
        }
        return spannableStringBuilder;
    }

    /* renamed from: a */
    public String mo17414a(String str) {
        return mo17415a(str, this.f8826c, true);
    }

    /* renamed from: a */
    public CharSequence mo17412a(CharSequence charSequence) {
        return mo17413a(charSequence, this.f8826c, true);
    }

    /* renamed from: a */
    static boolean m8837a(Locale locale) {
        return C5000f.m8885b(locale) == 1;
    }
}
