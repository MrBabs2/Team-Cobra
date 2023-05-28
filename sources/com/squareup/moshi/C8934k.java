package com.squareup.moshi;

import com.squareup.moshi.C8930i;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;
import p015cm.aptoide.p016pt.account.AdultContentAnalytics;
import p413s.C12905f;
import p413s.C12910h;
import p413s.C12911i;

/* renamed from: com.squareup.moshi.k */
/* compiled from: JsonUtf8Reader */
final class C8934k extends C8930i {

    /* renamed from: r */
    private static final C12911i f25366r = C12911i.m41633d("'\\");

    /* renamed from: s */
    private static final C12911i f25367s = C12911i.m41633d("\"\\");

    /* renamed from: t */
    private static final C12911i f25368t = C12911i.m41633d("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: u */
    private static final C12911i f25369u = C12911i.m41633d("\n\r");

    /* renamed from: v */
    private static final C12911i f25370v = C12911i.m41633d("*/");

    /* renamed from: l */
    private final C12910h f25371l;

    /* renamed from: m */
    private final C12905f f25372m;

    /* renamed from: n */
    private int f25373n = 0;

    /* renamed from: o */
    private long f25374o;

    /* renamed from: p */
    private int f25375p;

    /* renamed from: q */
    private String f25376q;

    C8934k(C12910h hVar) {
        if (hVar != null) {
            this.f25371l = hVar;
            this.f25372m = hVar.getBuffer();
            mo32865a(6);
            return;
        }
        throw new NullPointerException("source == null");
    }

    /* renamed from: B */
    private void m29359B() throws IOException {
        if (!this.f25351j) {
            mo32863a("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    /* renamed from: C */
    private int m29360C() throws IOException {
        int[] iArr = this.f25348g;
        int i = this.f25347f;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int c = m29371c(true);
            this.f25372m.readByte();
            if (c != 44) {
                if (c == 59) {
                    m29359B();
                } else if (c == 93) {
                    this.f25373n = 4;
                    return 4;
                } else {
                    mo32863a("Unterminated array");
                    throw null;
                }
            }
        } else if (i2 == 3 || i2 == 5) {
            this.f25348g[this.f25347f - 1] = 4;
            if (i2 == 5) {
                int c2 = m29371c(true);
                this.f25372m.readByte();
                if (c2 != 44) {
                    if (c2 == 59) {
                        m29359B();
                    } else if (c2 == 125) {
                        this.f25373n = 2;
                        return 2;
                    } else {
                        mo32863a("Unterminated object");
                        throw null;
                    }
                }
            }
            int c3 = m29371c(true);
            if (c3 == 34) {
                this.f25372m.readByte();
                this.f25373n = 13;
                return 13;
            } else if (c3 == 39) {
                this.f25372m.readByte();
                m29359B();
                this.f25373n = 12;
                return 12;
            } else if (c3 != 125) {
                m29359B();
                if (m29370b((int) (char) c3)) {
                    this.f25373n = 14;
                    return 14;
                }
                mo32863a("Expected name");
                throw null;
            } else if (i2 != 5) {
                this.f25372m.readByte();
                this.f25373n = 2;
                return 2;
            } else {
                mo32863a("Expected name");
                throw null;
            }
        } else if (i2 == 4) {
            iArr[i - 1] = 5;
            int c4 = m29371c(true);
            this.f25372m.readByte();
            if (c4 != 58) {
                if (c4 == 61) {
                    m29359B();
                    if (this.f25371l.request(1) && this.f25372m.mo41163d(0) == 62) {
                        this.f25372m.readByte();
                    }
                } else {
                    mo32863a("Expected ':'");
                    throw null;
                }
            }
        } else if (i2 == 6) {
            iArr[i - 1] = 7;
        } else if (i2 == 7) {
            if (m29371c(false) == -1) {
                this.f25373n = 18;
                return 18;
            }
            m29359B();
        } else if (i2 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int c5 = m29371c(true);
        if (c5 == 34) {
            this.f25372m.readByte();
            this.f25373n = 9;
            return 9;
        } else if (c5 != 39) {
            if (!(c5 == 44 || c5 == 59)) {
                if (c5 == 91) {
                    this.f25372m.readByte();
                    this.f25373n = 3;
                    return 3;
                } else if (c5 != 93) {
                    if (c5 != 123) {
                        int E = m29362E();
                        if (E != 0) {
                            return E;
                        }
                        int F = m29363F();
                        if (F != 0) {
                            return F;
                        }
                        if (m29370b((int) this.f25372m.mo41163d(0))) {
                            m29359B();
                            this.f25373n = 10;
                            return 10;
                        }
                        mo32863a("Expected value");
                        throw null;
                    }
                    this.f25372m.readByte();
                    this.f25373n = 1;
                    return 1;
                } else if (i2 == 1) {
                    this.f25372m.readByte();
                    this.f25373n = 4;
                    return 4;
                }
            }
            if (i2 == 1 || i2 == 2) {
                m29359B();
                this.f25373n = 7;
                return 7;
            }
            mo32863a("Unexpected value");
            throw null;
        } else {
            m29359B();
            this.f25372m.readByte();
            this.f25373n = 8;
            return 8;
        }
    }

    /* renamed from: D */
    private String m29361D() throws IOException {
        long b = this.f25371l.mo41152b(f25368t);
        return b != -1 ? this.f25372m.mo41168g(b) : this.f25372m.mo41186q();
    }

    /* renamed from: E */
    private int m29362E() throws IOException {
        String str;
        String str2;
        int i;
        byte d = this.f25372m.mo41163d(0);
        if (d == 116 || d == 84) {
            i = 5;
            str2 = "true";
            str = "TRUE";
        } else if (d == 102 || d == 70) {
            i = 6;
            str2 = AdultContentAnalytics.UNLOCK;
            str = "FALSE";
        } else if (d != 110 && d != 78) {
            return 0;
        } else {
            i = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.f25371l.request((long) i3)) {
                return 0;
            }
            byte d2 = this.f25372m.mo41163d((long) i2);
            if (d2 != str2.charAt(i2) && d2 != str.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.f25371l.request((long) (length + 1)) && m29370b((int) this.f25372m.mo41163d((long) length))) {
            return 0;
        }
        this.f25372m.skip((long) length);
        this.f25373n = i;
        return i;
    }

    /* renamed from: F */
    private int m29363F() throws IOException {
        byte d;
        boolean z = true;
        int i = 0;
        long j = 0;
        int i2 = 0;
        char c = 0;
        boolean z2 = true;
        boolean z3 = false;
        while (true) {
            int i3 = i2 + 1;
            if (!this.f25371l.request((long) i3)) {
                break;
            }
            d = this.f25372m.mo41163d((long) i2);
            if (d != 43) {
                if (d != 69 && d != 101) {
                    if (d != 45) {
                        if (d != 46) {
                            if (d >= 48 && d <= 57) {
                                if (c == z || c == 0) {
                                    j = (long) (-(d - 48));
                                    i = 0;
                                    c = 2;
                                } else {
                                    if (c == 2) {
                                        if (j == 0) {
                                            return i;
                                        }
                                        long j2 = (10 * j) - ((long) (d - 48));
                                        z2 &= j > -922337203685477580L || (j == -922337203685477580L && j2 < j);
                                        j = j2;
                                    } else if (c == 3) {
                                        i = 0;
                                        c = 4;
                                    } else if (c == 5 || c == 6) {
                                        i = 0;
                                        c = 7;
                                    }
                                    i = 0;
                                }
                            }
                        } else if (c != 2) {
                            return i;
                        } else {
                            c = 3;
                        }
                    } else if (c == 0) {
                        c = 1;
                        z3 = true;
                    } else if (c != 5) {
                        return i;
                    }
                    i2 = i3;
                    z = true;
                } else if (c != 2 && c != 4) {
                    return i;
                } else {
                    c = 5;
                    i2 = i3;
                    z = true;
                }
            } else if (c != 5) {
                return i;
            }
            c = 6;
            i2 = i3;
            z = true;
        }
        if (m29370b((int) d)) {
            return 0;
        }
        if (c == 2 && z2 && ((j != Long.MIN_VALUE || z3) && (j != 0 || !z3))) {
            if (!z3) {
                j = -j;
            }
            this.f25374o = j;
            this.f25372m.skip((long) i2);
            this.f25373n = 16;
            return 16;
        } else if (c != 2 && c != 4 && c != 7) {
            return 0;
        } else {
            this.f25375p = i2;
            this.f25373n = 17;
            return 17;
        }
    }

    /* renamed from: G */
    private char m29364G() throws IOException {
        int i;
        int i2;
        if (this.f25371l.request(1)) {
            byte readByte = this.f25372m.readByte();
            if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
                return (char) readByte;
            }
            if (readByte == 98) {
                return 8;
            }
            if (readByte == 102) {
                return 12;
            }
            if (readByte == 110) {
                return 10;
            }
            if (readByte == 114) {
                return 13;
            }
            if (readByte == 116) {
                return 9;
            }
            if (readByte != 117) {
                if (this.f25351j) {
                    return (char) readByte;
                }
                mo32863a("Invalid escape sequence: \\" + ((char) readByte));
                throw null;
            } else if (this.f25371l.request(4)) {
                char c = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    byte d = this.f25372m.mo41163d((long) i3);
                    char c2 = (char) (c << 4);
                    if (d < 48 || d > 57) {
                        if (d >= 97 && d <= 102) {
                            i = d - 97;
                        } else if (d < 65 || d > 70) {
                            mo32863a("\\u" + this.f25372m.mo41168g(4));
                            throw null;
                        } else {
                            i = d - 65;
                        }
                        i2 = i + 10;
                    } else {
                        i2 = d - 48;
                    }
                    c = (char) (c2 + i2);
                }
                this.f25372m.skip(4);
                return c;
            } else {
                throw new EOFException("Unterminated escape sequence at path " + getPath());
            }
        } else {
            mo32863a("Unterminated escape sequence");
            throw null;
        }
    }

    /* renamed from: H */
    private boolean m29365H() throws IOException {
        long a = this.f25371l.mo41136a(f25370v);
        boolean z = a != -1;
        C12905f fVar = this.f25372m;
        fVar.skip(z ? a + ((long) f25370v.mo41239s()) : fVar.size());
        return z;
    }

    /* renamed from: I */
    private void m29366I() throws IOException {
        long b = this.f25371l.mo41152b(f25369u);
        C12905f fVar = this.f25372m;
        fVar.skip(b != -1 ? b + 1 : fVar.size());
    }

    /* renamed from: J */
    private void m29367J() throws IOException {
        long b = this.f25371l.mo41152b(f25368t);
        C12905f fVar = this.f25372m;
        if (b == -1) {
            b = fVar.size();
        }
        fVar.skip(b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r6.f25372m.skip((long) (r3 - 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r1 != 47) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r6.f25371l.request(2) != false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        m29359B();
        r3 = r6.f25372m.mo41163d(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r3 == 42) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r3 == 47) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        r6.f25372m.readByte();
        r6.f25372m.readByte();
        m29366I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        r6.f25372m.readByte();
        r6.f25372m.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        if (m29365H() == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006d, code lost:
        mo32863a("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        if (r1 != 35) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        m29359B();
        m29366I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007f, code lost:
        return r1;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m29371c(boolean r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
        L_0x0001:
            r1 = 0
        L_0x0002:
            s.h r2 = r6.f25371l
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.request(r4)
            if (r2 == 0) goto L_0x0082
            s.f r2 = r6.f25372m
            long r4 = (long) r1
            byte r1 = r2.mo41163d(r4)
            r2 = 10
            if (r1 == r2) goto L_0x0080
            r2 = 32
            if (r1 == r2) goto L_0x0080
            r2 = 13
            if (r1 == r2) goto L_0x0080
            r2 = 9
            if (r1 != r2) goto L_0x0025
            goto L_0x0080
        L_0x0025:
            s.f r2 = r6.f25372m
            int r3 = r3 + -1
            long r3 = (long) r3
            r2.skip(r3)
            r2 = 47
            if (r1 != r2) goto L_0x0074
            s.h r3 = r6.f25371l
            r4 = 2
            boolean r3 = r3.request(r4)
            if (r3 != 0) goto L_0x003c
            return r1
        L_0x003c:
            r6.m29359B()
            s.f r3 = r6.f25372m
            r4 = 1
            byte r3 = r3.mo41163d(r4)
            r4 = 42
            if (r3 == r4) goto L_0x005c
            if (r3 == r2) goto L_0x004e
            return r1
        L_0x004e:
            s.f r1 = r6.f25372m
            r1.readByte()
            s.f r1 = r6.f25372m
            r1.readByte()
            r6.m29366I()
            goto L_0x0001
        L_0x005c:
            s.f r1 = r6.f25372m
            r1.readByte()
            s.f r1 = r6.f25372m
            r1.readByte()
            boolean r1 = r6.m29365H()
            if (r1 == 0) goto L_0x006d
            goto L_0x0001
        L_0x006d:
            java.lang.String r7 = "Unterminated comment"
            r6.mo32863a((java.lang.String) r7)
            r7 = 0
            throw r7
        L_0x0074:
            r2 = 35
            if (r1 != r2) goto L_0x007f
            r6.m29359B()
            r6.m29366I()
            goto L_0x0001
        L_0x007f:
            return r1
        L_0x0080:
            r1 = r3
            goto L_0x0002
        L_0x0082:
            if (r7 != 0) goto L_0x0086
            r7 = -1
            return r7
        L_0x0086:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            goto L_0x008f
        L_0x008e:
            throw r7
        L_0x008f:
            goto L_0x008e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C8934k.m29371c(boolean):int");
    }

    /* renamed from: e */
    private void m29373e(C12911i iVar) throws IOException {
        while (true) {
            long b = this.f25371l.mo41152b(iVar);
            if (b == -1) {
                mo32863a("Unterminated string");
                throw null;
            } else if (this.f25372m.mo41163d(b) == 92) {
                this.f25372m.skip(b + 1);
                m29364G();
            } else {
                this.f25372m.skip(b + 1);
                return;
            }
        }
    }

    /* renamed from: A */
    public String mo32886A() throws IOException {
        String str;
        int i = this.f25373n;
        if (i == 0) {
            i = m29360C();
        }
        if (i == 14) {
            str = m29361D();
        } else if (i == 13) {
            str = m29372d(f25367s);
        } else if (i == 12) {
            str = m29372d(f25366r);
        } else if (i == 15) {
            str = this.f25376q;
        } else {
            throw new JsonDataException("Expected a name but was " + peek() + " at path " + getPath());
        }
        this.f25373n = 0;
        this.f25349h[this.f25347f - 1] = str;
        return str;
    }

    /* renamed from: a */
    public void mo32864a() throws IOException {
        int i = this.f25373n;
        if (i == 0) {
            i = m29360C();
        }
        if (i == 3) {
            mo32865a(1);
            this.f25350i[this.f25347f - 1] = 0;
            this.f25373n = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_ARRAY but was " + peek() + " at path " + getPath());
    }

    /* renamed from: b */
    public void mo32868b() throws IOException {
        int i = this.f25373n;
        if (i == 0) {
            i = m29360C();
        }
        if (i == 1) {
            mo32865a(3);
            this.f25373n = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_OBJECT but was " + peek() + " at path " + getPath());
    }

    public void close() throws IOException {
        this.f25373n = 0;
        this.f25348g[0] = 8;
        this.f25347f = 1;
        this.f25372m.mo41157b();
        this.f25371l.close();
    }

    /* renamed from: d */
    public void mo32870d() throws IOException {
        int i = this.f25373n;
        if (i == 0) {
            i = m29360C();
        }
        if (i == 4) {
            int i2 = this.f25347f - 1;
            this.f25347f = i2;
            int[] iArr = this.f25350i;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f25373n = 0;
            return;
        }
        throw new JsonDataException("Expected END_ARRAY but was " + peek() + " at path " + getPath());
    }

    /* renamed from: i */
    public void mo32872i() throws IOException {
        int i = this.f25373n;
        if (i == 0) {
            i = m29360C();
        }
        if (i == 2) {
            int i2 = this.f25347f - 1;
            this.f25347f = i2;
            this.f25349h[i2] = null;
            int[] iArr = this.f25350i;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f25373n = 0;
            return;
        }
        throw new JsonDataException("Expected END_OBJECT but was " + peek() + " at path " + getPath());
    }

    /* renamed from: m */
    public boolean mo32874m() throws IOException {
        int i = this.f25373n;
        if (i == 0) {
            i = m29360C();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    /* renamed from: p */
    public boolean mo32876p() throws IOException {
        int i = this.f25373n;
        if (i == 0) {
            i = m29360C();
        }
        if (i == 5) {
            this.f25373n = 0;
            int[] iArr = this.f25350i;
            int i2 = this.f25347f - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f25373n = 0;
            int[] iArr2 = this.f25350i;
            int i3 = this.f25347f - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new JsonDataException("Expected a boolean but was " + peek() + " at path " + getPath());
        }
    }

    public C8930i.C8932b peek() throws IOException {
        int i = this.f25373n;
        if (i == 0) {
            i = m29360C();
        }
        switch (i) {
            case 1:
                return C8930i.C8932b.BEGIN_OBJECT;
            case 2:
                return C8930i.C8932b.END_OBJECT;
            case 3:
                return C8930i.C8932b.BEGIN_ARRAY;
            case 4:
                return C8930i.C8932b.END_ARRAY;
            case 5:
            case 6:
                return C8930i.C8932b.BOOLEAN;
            case 7:
                return C8930i.C8932b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return C8930i.C8932b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return C8930i.C8932b.NAME;
            case 16:
            case 17:
                return C8930i.C8932b.NUMBER;
            case 18:
                return C8930i.C8932b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: q */
    public double mo32878q() throws IOException {
        int i = this.f25373n;
        if (i == 0) {
            i = m29360C();
        }
        if (i == 16) {
            this.f25373n = 0;
            int[] iArr = this.f25350i;
            int i2 = this.f25347f - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f25374o;
        }
        if (i == 17) {
            this.f25376q = this.f25372m.mo41168g((long) this.f25375p);
        } else if (i == 9) {
            this.f25376q = m29372d(f25367s);
        } else if (i == 8) {
            this.f25376q = m29372d(f25366r);
        } else if (i == 10) {
            this.f25376q = m29361D();
        } else if (i != 11) {
            throw new JsonDataException("Expected a double but was " + peek() + " at path " + getPath());
        }
        this.f25373n = 11;
        try {
            double parseDouble = Double.parseDouble(this.f25376q);
            if (this.f25351j || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
                this.f25376q = null;
                this.f25373n = 0;
                int[] iArr2 = this.f25350i;
                int i3 = this.f25347f - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseDouble;
            }
            throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.f25376q + " at path " + getPath());
        }
    }

    /* renamed from: t */
    public int mo32879t() throws IOException {
        String str;
        int i = this.f25373n;
        if (i == 0) {
            i = m29360C();
        }
        if (i == 16) {
            long j = this.f25374o;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f25373n = 0;
                int[] iArr = this.f25350i;
                int i3 = this.f25347f - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new JsonDataException("Expected an int but was " + this.f25374o + " at path " + getPath());
        }
        if (i == 17) {
            this.f25376q = this.f25372m.mo41168g((long) this.f25375p);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                str = m29372d(f25367s);
            } else {
                str = m29372d(f25366r);
            }
            this.f25376q = str;
            try {
                int parseInt = Integer.parseInt(str);
                this.f25373n = 0;
                int[] iArr2 = this.f25350i;
                int i4 = this.f25347f - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            throw new JsonDataException("Expected an int but was " + peek() + " at path " + getPath());
        }
        this.f25373n = 11;
        try {
            double parseDouble = Double.parseDouble(this.f25376q);
            int i5 = (int) parseDouble;
            if (((double) i5) == parseDouble) {
                this.f25376q = null;
                this.f25373n = 0;
                int[] iArr3 = this.f25350i;
                int i6 = this.f25347f - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new JsonDataException("Expected an int but was " + this.f25376q + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.f25376q + " at path " + getPath());
        }
    }

    public String toString() {
        return "JsonReader(" + this.f25371l + ")";
    }

    /* renamed from: u */
    public long mo32880u() throws IOException {
        String str;
        int i = this.f25373n;
        if (i == 0) {
            i = m29360C();
        }
        if (i == 16) {
            this.f25373n = 0;
            int[] iArr = this.f25350i;
            int i2 = this.f25347f - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f25374o;
        }
        if (i == 17) {
            this.f25376q = this.f25372m.mo41168g((long) this.f25375p);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                str = m29372d(f25367s);
            } else {
                str = m29372d(f25366r);
            }
            this.f25376q = str;
            try {
                long parseLong = Long.parseLong(str);
                this.f25373n = 0;
                int[] iArr2 = this.f25350i;
                int i3 = this.f25347f - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            throw new JsonDataException("Expected a long but was " + peek() + " at path " + getPath());
        }
        this.f25373n = 11;
        try {
            long longValueExact = new BigDecimal(this.f25376q).longValueExact();
            this.f25376q = null;
            this.f25373n = 0;
            int[] iArr3 = this.f25350i;
            int i4 = this.f25347f - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return longValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw new JsonDataException("Expected a long but was " + this.f25376q + " at path " + getPath());
        }
    }

    /* renamed from: v */
    public <T> T mo32881v() throws IOException {
        int i = this.f25373n;
        if (i == 0) {
            i = m29360C();
        }
        if (i == 7) {
            this.f25373n = 0;
            int[] iArr = this.f25350i;
            int i2 = this.f25347f - 1;
            iArr[i2] = iArr[i2] + 1;
            return null;
        }
        throw new JsonDataException("Expected null but was " + peek() + " at path " + getPath());
    }

    /* renamed from: w */
    public String mo32882w() throws IOException {
        String str;
        int i = this.f25373n;
        if (i == 0) {
            i = m29360C();
        }
        if (i == 10) {
            str = m29361D();
        } else if (i == 9) {
            str = m29372d(f25367s);
        } else if (i == 8) {
            str = m29372d(f25366r);
        } else if (i == 11) {
            str = this.f25376q;
            this.f25376q = null;
        } else if (i == 16) {
            str = Long.toString(this.f25374o);
        } else if (i == 17) {
            str = this.f25372m.mo41168g((long) this.f25375p);
        } else {
            throw new JsonDataException("Expected a string but was " + peek() + " at path " + getPath());
        }
        this.f25373n = 0;
        int[] iArr = this.f25350i;
        int i2 = this.f25347f - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo32883x() throws IOException {
        if (mo32874m()) {
            this.f25376q = mo32886A();
            this.f25373n = 11;
        }
    }

    /* renamed from: y */
    public void mo32884y() throws IOException {
        if (!this.f25352k) {
            int i = this.f25373n;
            if (i == 0) {
                i = m29360C();
            }
            if (i == 14) {
                m29367J();
            } else if (i == 13) {
                m29373e(f25367s);
            } else if (i == 12) {
                m29373e(f25366r);
            } else if (i != 15) {
                throw new JsonDataException("Expected a name but was " + peek() + " at path " + getPath());
            }
            this.f25373n = 0;
            this.f25349h[this.f25347f - 1] = "null";
            return;
        }
        C8930i.C8932b peek = peek();
        mo32886A();
        throw new JsonDataException("Cannot skip unexpected " + peek + " at " + getPath());
    }

    /* renamed from: z */
    public void mo32885z() throws IOException {
        if (!this.f25352k) {
            int i = 0;
            do {
                int i2 = this.f25373n;
                if (i2 == 0) {
                    i2 = m29360C();
                }
                if (i2 == 3) {
                    mo32865a(1);
                } else if (i2 == 1) {
                    mo32865a(3);
                } else {
                    if (i2 == 4) {
                        i--;
                        if (i >= 0) {
                            this.f25347f--;
                        } else {
                            throw new JsonDataException("Expected a value but was " + peek() + " at path " + getPath());
                        }
                    } else if (i2 == 2) {
                        i--;
                        if (i >= 0) {
                            this.f25347f--;
                        } else {
                            throw new JsonDataException("Expected a value but was " + peek() + " at path " + getPath());
                        }
                    } else if (i2 == 14 || i2 == 10) {
                        m29367J();
                    } else if (i2 == 9 || i2 == 13) {
                        m29373e(f25367s);
                    } else if (i2 == 8 || i2 == 12) {
                        m29373e(f25366r);
                    } else if (i2 == 17) {
                        this.f25372m.skip((long) this.f25375p);
                    } else if (i2 == 18) {
                        throw new JsonDataException("Expected a value but was " + peek() + " at path " + getPath());
                    }
                    this.f25373n = 0;
                }
                i++;
                this.f25373n = 0;
            } while (i != 0);
            int[] iArr = this.f25350i;
            int i3 = this.f25347f;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f25349h[i3 - 1] = "null";
            return;
        }
        throw new JsonDataException("Cannot skip unexpected " + peek() + " at " + getPath());
    }

    /* renamed from: b */
    private boolean m29370b(int i) throws IOException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (!(i == 47 || i == 61)) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m29359B();
        return false;
    }

    /* renamed from: d */
    private String m29372d(C12911i iVar) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long b = this.f25371l.mo41152b(iVar);
            if (b == -1) {
                mo32863a("Unterminated string");
                throw null;
            } else if (this.f25372m.mo41163d(b) == 92) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.f25372m.mo41168g(b));
                this.f25372m.readByte();
                sb.append(m29364G());
            } else if (sb == null) {
                String g = this.f25372m.mo41168g(b);
                this.f25372m.readByte();
                return g;
            } else {
                sb.append(this.f25372m.mo41168g(b));
                this.f25372m.readByte();
                return sb.toString();
            }
        }
    }

    /* renamed from: a */
    public int mo32861a(C8930i.C8931a aVar) throws IOException {
        int i = this.f25373n;
        if (i == 0) {
            i = m29360C();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return m29368a(this.f25376q, aVar);
        }
        int a = this.f25371l.mo41132a(aVar.f25354b);
        if (a != -1) {
            this.f25373n = 0;
            this.f25349h[this.f25347f - 1] = aVar.f25353a[a];
            return a;
        }
        String str = this.f25349h[this.f25347f - 1];
        String A = mo32886A();
        int a2 = m29368a(A, aVar);
        if (a2 == -1) {
            this.f25373n = 15;
            this.f25376q = A;
            this.f25349h[this.f25347f - 1] = str;
        }
        return a2;
    }

    /* renamed from: b */
    public int mo32867b(C8930i.C8931a aVar) throws IOException {
        int i = this.f25373n;
        if (i == 0) {
            i = m29360C();
        }
        if (i < 8 || i > 11) {
            return -1;
        }
        if (i == 11) {
            return m29369b(this.f25376q, aVar);
        }
        int a = this.f25371l.mo41132a(aVar.f25354b);
        if (a != -1) {
            this.f25373n = 0;
            int[] iArr = this.f25350i;
            int i2 = this.f25347f - 1;
            iArr[i2] = iArr[i2] + 1;
            return a;
        }
        String w = mo32882w();
        int b = m29369b(w, aVar);
        if (b == -1) {
            this.f25373n = 11;
            this.f25376q = w;
            int[] iArr2 = this.f25350i;
            int i3 = this.f25347f - 1;
            iArr2[i3] = iArr2[i3] - 1;
        }
        return b;
    }

    /* renamed from: b */
    private int m29369b(String str, C8930i.C8931a aVar) {
        int length = aVar.f25353a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.f25353a[i])) {
                this.f25373n = 0;
                int[] iArr = this.f25350i;
                int i2 = this.f25347f - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private int m29368a(String str, C8930i.C8931a aVar) {
        int length = aVar.f25353a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.f25353a[i])) {
                this.f25373n = 0;
                this.f25349h[this.f25347f - 1] = str;
                return i;
            }
        }
        return -1;
    }
}
