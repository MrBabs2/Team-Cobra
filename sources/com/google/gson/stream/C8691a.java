package com.google.gson.stream;

import com.google.gson.p191t.C8717e;
import com.google.gson.p191t.p192l.C8744e;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import p015cm.aptoide.p016pt.account.AdultContentAnalytics;

/* renamed from: com.google.gson.stream.a */
/* compiled from: JsonReader */
public class C8691a implements Closeable {

    /* renamed from: u */
    private static final char[] f24753u = ")]}'\n".toCharArray();

    /* renamed from: f */
    private final Reader f24754f;

    /* renamed from: g */
    private boolean f24755g = false;

    /* renamed from: h */
    private final char[] f24756h = new char[1024];

    /* renamed from: i */
    private int f24757i = 0;

    /* renamed from: j */
    private int f24758j = 0;

    /* renamed from: k */
    private int f24759k = 0;

    /* renamed from: l */
    private int f24760l = 0;

    /* renamed from: m */
    int f24761m = 0;

    /* renamed from: n */
    private long f24762n;

    /* renamed from: o */
    private int f24763o;

    /* renamed from: p */
    private String f24764p;

    /* renamed from: q */
    private int[] f24765q;

    /* renamed from: r */
    private int f24766r;

    /* renamed from: s */
    private String[] f24767s;

    /* renamed from: t */
    private int[] f24768t;

    /* renamed from: com.google.gson.stream.a$a */
    /* compiled from: JsonReader */
    static class C8692a extends C8717e {
        C8692a() {
        }

        /* renamed from: a */
        public void mo32380a(C8691a aVar) throws IOException {
            if (aVar instanceof C8744e) {
                ((C8744e) aVar).mo32478A();
                return;
            }
            int i = aVar.f24761m;
            if (i == 0) {
                i = aVar.mo32363d();
            }
            if (i == 13) {
                aVar.f24761m = 9;
            } else if (i == 12) {
                aVar.f24761m = 8;
            } else if (i == 14) {
                aVar.f24761m = 10;
            } else {
                throw new IllegalStateException("Expected a name but was " + aVar.peek() + aVar.mo32369p());
            }
        }
    }

    static {
        C8717e.f24821a = new C8692a();
    }

    public C8691a(Reader reader) {
        int[] iArr = new int[32];
        this.f24765q = iArr;
        this.f24766r = 0;
        this.f24766r = 0 + 1;
        iArr[0] = 6;
        this.f24767s = new String[32];
        this.f24768t = new int[32];
        if (reader != null) {
            this.f24754f = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    /* renamed from: A */
    private void mo32478A() throws IOException {
        if (!this.f24755g) {
            m28387d("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    /* renamed from: B */
    private void m28373B() throws IOException {
        m28383b(true);
        int i = this.f24757i - 1;
        this.f24757i = i;
        char[] cArr = f24753u;
        if (i + cArr.length <= this.f24758j || m28381a(cArr.length)) {
            int i2 = 0;
            while (true) {
                char[] cArr2 = f24753u;
                if (i2 >= cArr2.length) {
                    this.f24757i += cArr2.length;
                    return;
                } else if (this.f24756h[this.f24757i + i2] == cArr2[i2]) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        mo32478A();
     */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m28374C() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = 0
        L_0x0003:
            int r3 = r6.f24757i
            int r4 = r3 + r2
            int r5 = r6.f24758j
            if (r4 >= r5) goto L_0x004e
            char[] r4 = r6.f24756h
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005c
            r4 = 10
            if (r3 == r4) goto L_0x005c
            r4 = 12
            if (r3 == r4) goto L_0x005c
            r4 = 13
            if (r3 == r4) goto L_0x005c
            r4 = 32
            if (r3 == r4) goto L_0x005c
            r4 = 35
            if (r3 == r4) goto L_0x004a
            r4 = 44
            if (r3 == r4) goto L_0x005c
            r4 = 47
            if (r3 == r4) goto L_0x004a
            r4 = 61
            if (r3 == r4) goto L_0x004a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 58
            if (r3 == r4) goto L_0x005c
            r4 = 59
            if (r3 == r4) goto L_0x004a
            switch(r3) {
                case 91: goto L_0x005c;
                case 92: goto L_0x004a;
                case 93: goto L_0x005c;
                default: goto L_0x0047;
            }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x004a:
            r6.mo32478A()
            goto L_0x005c
        L_0x004e:
            char[] r3 = r6.f24756h
            int r3 = r3.length
            if (r2 >= r3) goto L_0x005e
            int r3 = r2 + 1
            boolean r3 = r6.m28381a((int) r3)
            if (r3 == 0) goto L_0x005c
            goto L_0x0003
        L_0x005c:
            r0 = r2
            goto L_0x007e
        L_0x005e:
            if (r1 != 0) goto L_0x006b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L_0x006b:
            char[] r3 = r6.f24756h
            int r4 = r6.f24757i
            r1.append(r3, r4, r2)
            int r3 = r6.f24757i
            int r3 = r3 + r2
            r6.f24757i = r3
            r2 = 1
            boolean r2 = r6.m28381a((int) r2)
            if (r2 != 0) goto L_0x0002
        L_0x007e:
            if (r1 != 0) goto L_0x008a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f24756h
            int r3 = r6.f24757i
            r1.<init>(r2, r3, r0)
            goto L_0x0095
        L_0x008a:
            char[] r2 = r6.f24756h
            int r3 = r6.f24757i
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L_0x0095:
            int r2 = r6.f24757i
            int r2 = r2 + r0
            r6.f24757i = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.C8691a.m28374C():java.lang.String");
    }

    /* renamed from: D */
    private int m28375D() throws IOException {
        String str;
        String str2;
        int i;
        char c = this.f24756h[this.f24757i];
        if (c == 't' || c == 'T') {
            i = 5;
            str2 = "true";
            str = "TRUE";
        } else if (c == 'f' || c == 'F') {
            i = 6;
            str2 = AdultContentAnalytics.UNLOCK;
            str = "FALSE";
        } else if (c != 'n' && c != 'N') {
            return 0;
        } else {
            i = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.f24757i + i2 >= this.f24758j && !m28381a(i2 + 1)) {
                return 0;
            }
            char c2 = this.f24756h[this.f24757i + i2];
            if (c2 != str2.charAt(i2) && c2 != str.charAt(i2)) {
                return 0;
            }
        }
        if ((this.f24757i + length < this.f24758j || m28381a(length + 1)) && m28380a(this.f24756h[this.f24757i + length])) {
            return 0;
        }
        this.f24757i += length;
        this.f24761m = i;
        return i;
    }

    /* renamed from: E */
    private int m28376E() throws IOException {
        char c;
        char[] cArr = this.f24756h;
        int i = this.f24757i;
        int i2 = this.f24758j;
        int i3 = 0;
        int i4 = 0;
        char c2 = 0;
        boolean z = true;
        long j = 0;
        boolean z2 = false;
        while (true) {
            if (i + i4 == i2) {
                if (i4 == cArr.length) {
                    return i3;
                }
                if (!m28381a(i4 + 1)) {
                    break;
                }
                i = this.f24757i;
                i2 = this.f24758j;
            }
            c = cArr[i + i4];
            if (c == '+') {
                i3 = 0;
                if (c2 != 5) {
                    return 0;
                }
            } else if (c == 'E' || c == 'e') {
                i3 = 0;
                if (c2 != 2 && c2 != 4) {
                    return 0;
                }
                c2 = 5;
                i4++;
            } else {
                if (c == '-') {
                    i3 = 0;
                    if (c2 == 0) {
                        c2 = 1;
                        z2 = true;
                    } else if (c2 != 5) {
                        return 0;
                    }
                } else if (c == '.') {
                    i3 = 0;
                    if (c2 != 2) {
                        return 0;
                    }
                    c2 = 3;
                } else if (c >= '0' && c <= '9') {
                    if (c2 == 1 || c2 == 0) {
                        j = (long) (-(c - '0'));
                        i3 = 0;
                        c2 = 2;
                    } else {
                        if (c2 == 2) {
                            if (j == 0) {
                                return 0;
                            }
                            long j2 = (10 * j) - ((long) (c - '0'));
                            z &= j > -922337203685477580L || (j == -922337203685477580L && j2 < j);
                            j = j2;
                        } else if (c2 == 3) {
                            i3 = 0;
                            c2 = 4;
                        } else if (c2 == 5 || c2 == 6) {
                            i3 = 0;
                            c2 = 7;
                        }
                        i3 = 0;
                    }
                }
                i4++;
            }
            c2 = 6;
            i4++;
        }
        if (m28380a(c)) {
            return 0;
        }
        if (c2 == 2 && z && ((j != Long.MIN_VALUE || z2) && (j != 0 || !z2))) {
            if (!z2) {
                j = -j;
            }
            this.f24762n = j;
            this.f24757i += i4;
            this.f24761m = 15;
            return 15;
        } else if (c2 != 2 && c2 != 4 && c2 != 7) {
            return 0;
        } else {
            this.f24763o = i4;
            this.f24761m = 16;
            return 16;
        }
    }

    /* renamed from: F */
    private char m28377F() throws IOException {
        int i;
        int i2;
        if (this.f24757i != this.f24758j || m28381a(1)) {
            char[] cArr = this.f24756h;
            int i3 = this.f24757i;
            int i4 = i3 + 1;
            this.f24757i = i4;
            char c = cArr[i3];
            if (c == 10) {
                this.f24759k++;
                this.f24760l = i4;
            } else if (!(c == '\"' || c == '\'' || c == '/' || c == '\\')) {
                if (c == 'b') {
                    return 8;
                }
                if (c == 'f') {
                    return 12;
                }
                if (c == 'n') {
                    return 10;
                }
                if (c == 'r') {
                    return 13;
                }
                if (c == 't') {
                    return 9;
                }
                if (c != 'u') {
                    m28387d("Invalid escape sequence");
                    throw null;
                } else if (i4 + 4 <= this.f24758j || m28381a(4)) {
                    char c2 = 0;
                    int i5 = this.f24757i;
                    int i6 = i5 + 4;
                    while (i5 < i6) {
                        char c3 = this.f24756h[i5];
                        char c4 = (char) (c2 << 4);
                        if (c3 < '0' || c3 > '9') {
                            if (c3 >= 'a' && c3 <= 'f') {
                                i = c3 - 'a';
                            } else if (c3 < 'A' || c3 > 'F') {
                                throw new NumberFormatException("\\u" + new String(this.f24756h, this.f24757i, 4));
                            } else {
                                i = c3 - 'A';
                            }
                            i2 = i + 10;
                        } else {
                            i2 = c3 - '0';
                        }
                        c2 = (char) (c4 + i2);
                        i5++;
                    }
                    this.f24757i += 4;
                    return c2;
                } else {
                    m28387d("Unterminated escape sequence");
                    throw null;
                }
            }
            return c;
        }
        m28387d("Unterminated escape sequence");
        throw null;
    }

    /* renamed from: G */
    private void m28378G() throws IOException {
        char c;
        do {
            if (this.f24757i < this.f24758j || m28381a(1)) {
                char[] cArr = this.f24756h;
                int i = this.f24757i;
                int i2 = i + 1;
                this.f24757i = i2;
                c = cArr[i];
                if (c == 10) {
                    this.f24759k++;
                    this.f24760l = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != 13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        mo32478A();
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m28379H() throws java.io.IOException {
        /*
            r4 = this;
        L_0x0000:
            r0 = 0
        L_0x0001:
            int r1 = r4.f24757i
            int r2 = r1 + r0
            int r3 = r4.f24758j
            if (r2 >= r3) goto L_0x0051
            char[] r2 = r4.f24756h
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L_0x004b
            r2 = 10
            if (r1 == r2) goto L_0x004b
            r2 = 12
            if (r1 == r2) goto L_0x004b
            r2 = 13
            if (r1 == r2) goto L_0x004b
            r2 = 32
            if (r1 == r2) goto L_0x004b
            r2 = 35
            if (r1 == r2) goto L_0x0048
            r2 = 44
            if (r1 == r2) goto L_0x004b
            r2 = 47
            if (r1 == r2) goto L_0x0048
            r2 = 61
            if (r1 == r2) goto L_0x0048
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 58
            if (r1 == r2) goto L_0x004b
            r2 = 59
            if (r1 == r2) goto L_0x0048
            switch(r1) {
                case 91: goto L_0x004b;
                case 92: goto L_0x0048;
                case 93: goto L_0x004b;
                default: goto L_0x0045;
            }
        L_0x0045:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0048:
            r4.mo32478A()
        L_0x004b:
            int r1 = r4.f24757i
            int r1 = r1 + r0
            r4.f24757i = r1
            return
        L_0x0051:
            int r1 = r1 + r0
            r4.f24757i = r1
            r0 = 1
            boolean r0 = r4.m28381a((int) r0)
            if (r0 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.C8691a.m28379H():void");
    }

    /* renamed from: c */
    private void m28386c(char c) throws IOException {
        char[] cArr = this.f24756h;
        do {
            int i = this.f24757i;
            int i2 = this.f24758j;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.f24757i = i3;
                    return;
                } else if (c2 == '\\') {
                    this.f24757i = i3;
                    m28377F();
                    i = this.f24757i;
                    i2 = this.f24758j;
                } else {
                    if (c2 == 10) {
                        this.f24759k++;
                        this.f24760l = i3;
                    }
                    i = i3;
                }
            }
            this.f24757i = i;
        } while (m28381a(1));
        m28387d("Unterminated string");
        throw null;
    }

    /* renamed from: a */
    public final void mo32360a(boolean z) {
        this.f24755g = z;
    }

    /* renamed from: b */
    public void mo32361b() throws IOException {
        int i = this.f24761m;
        if (i == 0) {
            i = mo32363d();
        }
        if (i == 1) {
            m28385b(3);
            this.f24761m = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + peek() + mo32369p());
    }

    public void close() throws IOException {
        this.f24761m = 0;
        this.f24765q[0] = 8;
        this.f24766r = 1;
        this.f24754f.close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo32363d() throws IOException {
        int b;
        int[] iArr = this.f24765q;
        int i = this.f24766r;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int b2 = m28383b(true);
            if (b2 != 44) {
                if (b2 == 59) {
                    mo32478A();
                } else if (b2 == 93) {
                    this.f24761m = 4;
                    return 4;
                } else {
                    m28387d("Unterminated array");
                    throw null;
                }
            }
        } else if (i2 == 3 || i2 == 5) {
            this.f24765q[this.f24766r - 1] = 4;
            if (i2 == 5 && (b = m28383b(true)) != 44) {
                if (b == 59) {
                    mo32478A();
                } else if (b == 125) {
                    this.f24761m = 2;
                    return 2;
                } else {
                    m28387d("Unterminated object");
                    throw null;
                }
            }
            int b3 = m28383b(true);
            if (b3 == 34) {
                this.f24761m = 13;
                return 13;
            } else if (b3 == 39) {
                mo32478A();
                this.f24761m = 12;
                return 12;
            } else if (b3 != 125) {
                mo32478A();
                this.f24757i--;
                if (m28380a((char) b3)) {
                    this.f24761m = 14;
                    return 14;
                }
                m28387d("Expected name");
                throw null;
            } else if (i2 != 5) {
                this.f24761m = 2;
                return 2;
            } else {
                m28387d("Expected name");
                throw null;
            }
        } else if (i2 == 4) {
            iArr[i - 1] = 5;
            int b4 = m28383b(true);
            if (b4 != 58) {
                if (b4 == 61) {
                    mo32478A();
                    if (this.f24757i < this.f24758j || m28381a(1)) {
                        char[] cArr = this.f24756h;
                        int i3 = this.f24757i;
                        if (cArr[i3] == '>') {
                            this.f24757i = i3 + 1;
                        }
                    }
                } else {
                    m28387d("Expected ':'");
                    throw null;
                }
            }
        } else if (i2 == 6) {
            if (this.f24755g) {
                m28373B();
            }
            this.f24765q[this.f24766r - 1] = 7;
        } else if (i2 == 7) {
            if (m28383b(false) == -1) {
                this.f24761m = 17;
                return 17;
            }
            mo32478A();
            this.f24757i--;
        } else if (i2 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int b5 = m28383b(true);
        if (b5 == 34) {
            this.f24761m = 9;
            return 9;
        } else if (b5 != 39) {
            if (!(b5 == 44 || b5 == 59)) {
                if (b5 == 91) {
                    this.f24761m = 3;
                    return 3;
                } else if (b5 != 93) {
                    if (b5 != 123) {
                        this.f24757i--;
                        int D = m28375D();
                        if (D != 0) {
                            return D;
                        }
                        int E = m28376E();
                        if (E != 0) {
                            return E;
                        }
                        if (m28380a(this.f24756h[this.f24757i])) {
                            mo32478A();
                            this.f24761m = 10;
                            return 10;
                        }
                        m28387d("Expected value");
                        throw null;
                    }
                    this.f24761m = 1;
                    return 1;
                } else if (i2 == 1) {
                    this.f24761m = 4;
                    return 4;
                }
            }
            if (i2 == 1 || i2 == 2) {
                mo32478A();
                this.f24757i--;
                this.f24761m = 7;
                return 7;
            }
            m28387d("Unexpected value");
            throw null;
        } else {
            mo32478A();
            this.f24761m = 8;
            return 8;
        }
    }

    public String getPath() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = this.f24766r;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f24765q[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.f24768t[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String[] strArr = this.f24767s;
                if (strArr[i2] != null) {
                    sb.append(strArr[i2]);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: i */
    public void mo32365i() throws IOException {
        int i = this.f24761m;
        if (i == 0) {
            i = mo32363d();
        }
        if (i == 4) {
            int i2 = this.f24766r - 1;
            this.f24766r = i2;
            int[] iArr = this.f24768t;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f24761m = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + peek() + mo32369p());
    }

    /* renamed from: l */
    public void mo32366l() throws IOException {
        int i = this.f24761m;
        if (i == 0) {
            i = mo32363d();
        }
        if (i == 2) {
            int i2 = this.f24766r - 1;
            this.f24766r = i2;
            this.f24767s[i2] = null;
            int[] iArr = this.f24768t;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f24761m = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + peek() + mo32369p());
    }

    /* renamed from: m */
    public boolean mo32367m() throws IOException {
        int i = this.f24761m;
        if (i == 0) {
            i = mo32363d();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    /* renamed from: o */
    public final boolean mo32368o() {
        return this.f24755g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public String mo32369p() {
        return " at line " + (this.f24759k + 1) + " column " + ((this.f24757i - this.f24760l) + 1) + " path " + getPath();
    }

    public C8693b peek() throws IOException {
        int i = this.f24761m;
        if (i == 0) {
            i = mo32363d();
        }
        switch (i) {
            case 1:
                return C8693b.BEGIN_OBJECT;
            case 2:
                return C8693b.END_OBJECT;
            case 3:
                return C8693b.BEGIN_ARRAY;
            case 4:
                return C8693b.END_ARRAY;
            case 5:
            case 6:
                return C8693b.BOOLEAN;
            case 7:
                return C8693b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return C8693b.STRING;
            case 12:
            case 13:
            case 14:
                return C8693b.NAME;
            case 15:
            case 16:
                return C8693b.NUMBER;
            case 17:
                return C8693b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: q */
    public boolean mo32371q() throws IOException {
        int i = this.f24761m;
        if (i == 0) {
            i = mo32363d();
        }
        if (i == 5) {
            this.f24761m = 0;
            int[] iArr = this.f24768t;
            int i2 = this.f24766r - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f24761m = 0;
            int[] iArr2 = this.f24768t;
            int i3 = this.f24766r - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + peek() + mo32369p());
        }
    }

    /* renamed from: t */
    public double mo32372t() throws IOException {
        int i = this.f24761m;
        if (i == 0) {
            i = mo32363d();
        }
        if (i == 15) {
            this.f24761m = 0;
            int[] iArr = this.f24768t;
            int i2 = this.f24766r - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f24762n;
        }
        if (i == 16) {
            this.f24764p = new String(this.f24756h, this.f24757i, this.f24763o);
            this.f24757i += this.f24763o;
        } else if (i == 8 || i == 9) {
            this.f24764p = m28384b(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.f24764p = m28374C();
        } else if (i != 11) {
            throw new IllegalStateException("Expected a double but was " + peek() + mo32369p());
        }
        this.f24761m = 11;
        double parseDouble = Double.parseDouble(this.f24764p);
        if (this.f24755g || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f24764p = null;
            this.f24761m = 0;
            int[] iArr2 = this.f24768t;
            int i3 = this.f24766r - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        }
        throw new MalformedJsonException("JSON forbids NaN and infinities: " + parseDouble + mo32369p());
    }

    public String toString() {
        return getClass().getSimpleName() + mo32369p();
    }

    /* renamed from: u */
    public int mo32374u() throws IOException {
        int i = this.f24761m;
        if (i == 0) {
            i = mo32363d();
        }
        if (i == 15) {
            long j = this.f24762n;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f24761m = 0;
                int[] iArr = this.f24768t;
                int i3 = this.f24766r - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.f24762n + mo32369p());
        }
        if (i == 16) {
            this.f24764p = new String(this.f24756h, this.f24757i, this.f24763o);
            this.f24757i += this.f24763o;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.f24764p = m28374C();
            } else {
                this.f24764p = m28384b(i == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.f24764p);
                this.f24761m = 0;
                int[] iArr2 = this.f24768t;
                int i4 = this.f24766r - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected an int but was " + peek() + mo32369p());
        }
        this.f24761m = 11;
        double parseDouble = Double.parseDouble(this.f24764p);
        int i5 = (int) parseDouble;
        if (((double) i5) == parseDouble) {
            this.f24764p = null;
            this.f24761m = 0;
            int[] iArr3 = this.f24768t;
            int i6 = this.f24766r - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.f24764p + mo32369p());
    }

    /* renamed from: v */
    public long mo32375v() throws IOException {
        int i = this.f24761m;
        if (i == 0) {
            i = mo32363d();
        }
        if (i == 15) {
            this.f24761m = 0;
            int[] iArr = this.f24768t;
            int i2 = this.f24766r - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f24762n;
        }
        if (i == 16) {
            this.f24764p = new String(this.f24756h, this.f24757i, this.f24763o);
            this.f24757i += this.f24763o;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.f24764p = m28374C();
            } else {
                this.f24764p = m28384b(i == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.f24764p);
                this.f24761m = 0;
                int[] iArr2 = this.f24768t;
                int i3 = this.f24766r - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected a long but was " + peek() + mo32369p());
        }
        this.f24761m = 11;
        double parseDouble = Double.parseDouble(this.f24764p);
        long j = (long) parseDouble;
        if (((double) j) == parseDouble) {
            this.f24764p = null;
            this.f24761m = 0;
            int[] iArr3 = this.f24768t;
            int i4 = this.f24766r - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        throw new NumberFormatException("Expected a long but was " + this.f24764p + mo32369p());
    }

    /* renamed from: w */
    public String mo32376w() throws IOException {
        String str;
        int i = this.f24761m;
        if (i == 0) {
            i = mo32363d();
        }
        if (i == 14) {
            str = m28374C();
        } else if (i == 12) {
            str = m28384b('\'');
        } else if (i == 13) {
            str = m28384b('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + peek() + mo32369p());
        }
        this.f24761m = 0;
        this.f24767s[this.f24766r - 1] = str;
        return str;
    }

    /* renamed from: x */
    public void mo32377x() throws IOException {
        int i = this.f24761m;
        if (i == 0) {
            i = mo32363d();
        }
        if (i == 7) {
            this.f24761m = 0;
            int[] iArr = this.f24768t;
            int i2 = this.f24766r - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + peek() + mo32369p());
    }

    /* renamed from: y */
    public String mo32378y() throws IOException {
        String str;
        int i = this.f24761m;
        if (i == 0) {
            i = mo32363d();
        }
        if (i == 10) {
            str = m28374C();
        } else if (i == 8) {
            str = m28384b('\'');
        } else if (i == 9) {
            str = m28384b('\"');
        } else if (i == 11) {
            str = this.f24764p;
            this.f24764p = null;
        } else if (i == 15) {
            str = Long.toString(this.f24762n);
        } else if (i == 16) {
            str = new String(this.f24756h, this.f24757i, this.f24763o);
            this.f24757i += this.f24763o;
        } else {
            throw new IllegalStateException("Expected a string but was " + peek() + mo32369p());
        }
        this.f24761m = 0;
        int[] iArr = this.f24768t;
        int i2 = this.f24766r - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: z */
    public void mo32379z() throws IOException {
        int i = 0;
        do {
            int i2 = this.f24761m;
            if (i2 == 0) {
                i2 = mo32363d();
            }
            if (i2 == 3) {
                m28385b(1);
            } else if (i2 == 1) {
                m28385b(3);
            } else {
                if (i2 == 4) {
                    this.f24766r--;
                } else if (i2 == 2) {
                    this.f24766r--;
                } else if (i2 == 14 || i2 == 10) {
                    m28379H();
                    this.f24761m = 0;
                } else if (i2 == 8 || i2 == 12) {
                    m28386c('\'');
                    this.f24761m = 0;
                } else if (i2 == 9 || i2 == 13) {
                    m28386c('\"');
                    this.f24761m = 0;
                } else {
                    if (i2 == 16) {
                        this.f24757i += this.f24763o;
                    }
                    this.f24761m = 0;
                }
                i--;
                this.f24761m = 0;
            }
            i++;
            this.f24761m = 0;
        } while (i != 0);
        int[] iArr = this.f24768t;
        int i3 = this.f24766r;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f24767s[i3 - 1] = "null";
    }

    /* renamed from: a */
    public void mo32359a() throws IOException {
        int i = this.f24761m;
        if (i == 0) {
            i = mo32363d();
        }
        if (i == 3) {
            m28385b(1);
            this.f24768t[this.f24766r - 1] = 0;
            this.f24761m = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + peek() + mo32369p());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        if (r2 != null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005f, code lost:
        r2 = new java.lang.StringBuilder(java.lang.Math.max((r3 - r4) * 2, 16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006d, code lost:
        r2.append(r0, r4, r3 - r4);
        r10.f24757i = r3;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m28384b(char r11) throws java.io.IOException {
        /*
            r10 = this;
            char[] r0 = r10.f24756h
            r1 = 0
            r2 = r1
        L_0x0004:
            int r3 = r10.f24757i
            int r4 = r10.f24758j
        L_0x0008:
            r5 = r4
            r4 = r3
        L_0x000a:
            r6 = 16
            r7 = 1
            if (r3 >= r5) goto L_0x005d
            int r8 = r3 + 1
            char r3 = r0[r3]
            if (r3 != r11) goto L_0x0029
            r10.f24757i = r8
            int r8 = r8 - r4
            int r8 = r8 - r7
            if (r2 != 0) goto L_0x0021
            java.lang.String r11 = new java.lang.String
            r11.<init>(r0, r4, r8)
            return r11
        L_0x0021:
            r2.append(r0, r4, r8)
            java.lang.String r11 = r2.toString()
            return r11
        L_0x0029:
            r9 = 92
            if (r3 != r9) goto L_0x0050
            r10.f24757i = r8
            int r8 = r8 - r4
            int r8 = r8 - r7
            if (r2 != 0) goto L_0x0041
            int r2 = r8 + 1
            int r2 = r2 * 2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = java.lang.Math.max(r2, r6)
            r3.<init>(r2)
            r2 = r3
        L_0x0041:
            r2.append(r0, r4, r8)
            char r3 = r10.m28377F()
            r2.append(r3)
            int r3 = r10.f24757i
            int r4 = r10.f24758j
            goto L_0x0008
        L_0x0050:
            r6 = 10
            if (r3 != r6) goto L_0x005b
            int r3 = r10.f24759k
            int r3 = r3 + r7
            r10.f24759k = r3
            r10.f24760l = r8
        L_0x005b:
            r3 = r8
            goto L_0x000a
        L_0x005d:
            if (r2 != 0) goto L_0x006d
            int r2 = r3 - r4
            int r2 = r2 * 2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r2 = java.lang.Math.max(r2, r6)
            r5.<init>(r2)
            r2 = r5
        L_0x006d:
            int r5 = r3 - r4
            r2.append(r0, r4, r5)
            r10.f24757i = r3
            boolean r3 = r10.m28381a((int) r7)
            if (r3 == 0) goto L_0x007b
            goto L_0x0004
        L_0x007b:
            java.lang.String r11 = "Unterminated string"
            r10.m28387d(r11)
            goto L_0x0082
        L_0x0081:
            throw r1
        L_0x0082:
            goto L_0x0081
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.C8691a.m28384b(char):java.lang.String");
    }

    /* renamed from: a */
    private boolean m28380a(char c) throws IOException {
        if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (!(c == '/' || c == '=')) {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        mo32478A();
        return false;
    }

    /* renamed from: a */
    private boolean m28381a(int i) throws IOException {
        int i2;
        char[] cArr = this.f24756h;
        int i3 = this.f24760l;
        int i4 = this.f24757i;
        this.f24760l = i3 - i4;
        int i5 = this.f24758j;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.f24758j = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.f24758j = 0;
        }
        this.f24757i = 0;
        do {
            Reader reader = this.f24754f;
            int i7 = this.f24758j;
            int read = reader.read(cArr, i7, cArr.length - i7);
            if (read == -1) {
                return false;
            }
            int i8 = this.f24758j + read;
            this.f24758j = i8;
            if (this.f24759k == 0 && (i2 = this.f24760l) == 0 && i8 > 0 && cArr[0] == 65279) {
                this.f24757i++;
                this.f24760l = i2 + 1;
                i++;
            }
        } while (this.f24758j < i);
        return true;
    }

    /* renamed from: a */
    private boolean m28382a(String str) throws IOException {
        int length = str.length();
        while (true) {
            int i = 0;
            if (this.f24757i + length > this.f24758j && !m28381a(length)) {
                return false;
            }
            char[] cArr = this.f24756h;
            int i2 = this.f24757i;
            if (cArr[i2] == 10) {
                this.f24759k++;
                this.f24760l = i2 + 1;
            } else {
                while (i < length) {
                    if (this.f24756h[this.f24757i + i] == str.charAt(i)) {
                        i++;
                    }
                }
                return true;
            }
            this.f24757i++;
        }
    }

    /* renamed from: b */
    private void m28385b(int i) {
        int i2 = this.f24766r;
        int[] iArr = this.f24765q;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(i2 * 2)];
            int[] iArr3 = new int[(i2 * 2)];
            String[] strArr = new String[(i2 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f24768t, 0, iArr3, 0, this.f24766r);
            System.arraycopy(this.f24767s, 0, strArr, 0, this.f24766r);
            this.f24765q = iArr2;
            this.f24768t = iArr3;
            this.f24767s = strArr;
        }
        int[] iArr4 = this.f24765q;
        int i3 = this.f24766r;
        this.f24766r = i3 + 1;
        iArr4[i3] = i;
    }

    /* renamed from: b */
    private int m28383b(boolean z) throws IOException {
        char[] cArr = this.f24756h;
        int i = this.f24757i;
        int i2 = this.f24758j;
        while (true) {
            if (i == i2) {
                this.f24757i = i;
                if (m28381a(1)) {
                    i = this.f24757i;
                    i2 = this.f24758j;
                } else if (!z) {
                    return -1;
                } else {
                    throw new EOFException("End of input" + mo32369p());
                }
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == 10) {
                this.f24759k++;
                this.f24760l = i3;
            } else if (!(c == ' ' || c == 13 || c == 9)) {
                if (c == '/') {
                    this.f24757i = i3;
                    if (i3 == i2) {
                        this.f24757i = i3 - 1;
                        boolean a = m28381a(2);
                        this.f24757i++;
                        if (!a) {
                            return c;
                        }
                    }
                    mo32478A();
                    int i4 = this.f24757i;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f24757i = i4 + 1;
                        if (m28382a("*/")) {
                            i = this.f24757i + 2;
                            i2 = this.f24758j;
                        } else {
                            m28387d("Unterminated comment");
                            throw null;
                        }
                    } else if (c2 != '/') {
                        return c;
                    } else {
                        this.f24757i = i4 + 1;
                        m28378G();
                        i = this.f24757i;
                        i2 = this.f24758j;
                    }
                } else if (c == '#') {
                    this.f24757i = i3;
                    mo32478A();
                    m28378G();
                    i = this.f24757i;
                    i2 = this.f24758j;
                } else {
                    this.f24757i = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    /* renamed from: d */
    private IOException m28387d(String str) throws IOException {
        throw new MalformedJsonException(str + mo32369p());
    }
}
