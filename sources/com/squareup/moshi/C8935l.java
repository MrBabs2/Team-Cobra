package com.squareup.moshi;

import java.io.IOException;
import p015cm.aptoide.p016pt.account.AdultContentAnalytics;
import p413s.C12909g;

/* renamed from: com.squareup.moshi.l */
/* compiled from: JsonUtf8Writer */
final class C8935l extends C8939o {

    /* renamed from: r */
    private static final String[] f25377r = new String[128];

    /* renamed from: o */
    private final C12909g f25378o;

    /* renamed from: p */
    private String f25379p = ":";

    /* renamed from: q */
    private String f25380q;

    static {
        for (int i = 0; i <= 31; i++) {
            f25377r[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f25377r;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    C8935l(C12909g gVar) {
        if (gVar != null) {
            this.f25378o = gVar;
            mo32912a(6);
            return;
        }
        throw new NullPointerException("sink == null");
    }

    /* renamed from: v */
    private void m29394v() throws IOException {
        int t = mo32921t();
        if (t == 5) {
            this.f25378o.writeByte(44);
        } else if (t != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m29396x();
        mo32914b(4);
    }

    /* renamed from: w */
    private void m29395w() throws IOException {
        int t = mo32921t();
        int i = 7;
        if (t != 1) {
            if (t != 2) {
                if (t == 4) {
                    i = 5;
                    this.f25378o.mo41155b(this.f25379p);
                } else if (t == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                } else if (t != 6) {
                    if (t != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    } else if (!this.f25393k) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                }
                mo32914b(i);
            }
            this.f25378o.writeByte(44);
        }
        m29396x();
        i = 2;
        mo32914b(i);
    }

    /* renamed from: x */
    private void m29396x() throws IOException {
        if (this.f25392j != null) {
            this.f25378o.writeByte(10);
            int i = this.f25388f;
            for (int i2 = 1; i2 < i; i2++) {
                this.f25378o.mo41155b(this.f25392j);
            }
        }
    }

    /* renamed from: y */
    private void m29397y() throws IOException {
        if (this.f25380q != null) {
            m29394v();
            m29392a(this.f25378o, this.f25380q);
            this.f25380q = null;
        }
    }

    /* renamed from: a */
    public C8939o mo32889a() throws IOException {
        if (!this.f25395m) {
            m29397y();
            m29393b(1, 2, '[');
            return this;
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + getPath());
    }

    /* renamed from: b */
    public C8939o mo32893b() throws IOException {
        if (!this.f25395m) {
            m29397y();
            m29393b(3, 5, '{');
            return this;
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + getPath());
    }

    /* renamed from: c */
    public C8939o mo32894c(boolean z) throws IOException {
        if (!this.f25395m) {
            m29397y();
            m29395w();
            this.f25378o.mo41155b(z ? "true" : AdultContentAnalytics.UNLOCK);
            int[] iArr = this.f25391i;
            int i = this.f25388f - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + getPath());
    }

    public void close() throws IOException {
        this.f25378o.close();
        int i = this.f25388f;
        if (i > 1 || (i == 1 && this.f25389g[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f25388f = 0;
    }

    /* renamed from: d */
    public void mo32897d(String str) {
        super.mo32897d(str);
        this.f25379p = !str.isEmpty() ? ": " : ":";
    }

    /* renamed from: e */
    public C8939o mo32898e(String str) throws IOException {
        if (str == null) {
            mo32902q();
            return this;
        } else if (this.f25395m) {
            mo32892a(str);
            return this;
        } else {
            m29397y();
            m29395w();
            m29392a(this.f25378o, str);
            int[] iArr = this.f25391i;
            int i = this.f25388f - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }

    public void flush() throws IOException {
        if (this.f25388f != 0) {
            this.f25378o.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: i */
    public C8939o mo32900i() throws IOException {
        m29391a(1, 2, ']');
        return this;
    }

    /* renamed from: l */
    public C8939o mo32901l() throws IOException {
        this.f25395m = false;
        m29391a(3, 5, '}');
        return this;
    }

    /* renamed from: q */
    public C8939o mo32902q() throws IOException {
        if (!this.f25395m) {
            if (this.f25380q != null) {
                if (this.f25394l) {
                    m29397y();
                } else {
                    this.f25380q = null;
                    return this;
                }
            }
            m29395w();
            this.f25378o.mo41155b("null");
            int[] iArr = this.f25391i;
            int i = this.f25388f - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        throw new IllegalStateException("null cannot be used as a map key in JSON at path " + getPath());
    }

    /* renamed from: d */
    public C8939o mo32896d(long j) throws IOException {
        if (this.f25395m) {
            mo32892a(Long.toString(j));
            return this;
        }
        m29397y();
        m29395w();
        this.f25378o.mo41155b(Long.toString(j));
        int[] iArr = this.f25391i;
        int i = this.f25388f - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: a */
    private C8939o m29391a(int i, int i2, char c) throws IOException {
        int t = mo32921t();
        if (t != i2 && t != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f25380q == null) {
            int i3 = this.f25388f;
            int i4 = this.f25396n;
            if (i3 == (i4 ^ -1)) {
                this.f25396n = i4 ^ -1;
                return this;
            }
            int i5 = i3 - 1;
            this.f25388f = i5;
            this.f25390h[i5] = null;
            int[] iArr = this.f25391i;
            int i6 = i5 - 1;
            iArr[i6] = iArr[i6] + 1;
            if (t == i2) {
                m29396x();
            }
            this.f25378o.writeByte(c);
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.f25380q);
        }
    }

    /* renamed from: b */
    private C8939o m29393b(int i, int i2, char c) throws IOException {
        int i3 = this.f25388f;
        if (i3 == this.f25396n) {
            int[] iArr = this.f25389g;
            if (iArr[i3 - 1] == i || iArr[i3 - 1] == i2) {
                this.f25396n ^= -1;
                return this;
            }
        }
        m29395w();
        mo32916d();
        mo32912a(i);
        this.f25391i[this.f25388f - 1] = 0;
        this.f25378o.writeByte(c);
        return this;
    }

    /* renamed from: a */
    public C8939o mo32892a(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f25388f != 0) {
            int t = mo32921t();
            if ((t == 3 || t == 5) && this.f25380q == null) {
                this.f25380q = str;
                this.f25390h[this.f25388f - 1] = str;
                this.f25395m = false;
                return this;
            }
            throw new IllegalStateException("Nesting problem.");
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: a */
    public C8939o mo32890a(double d) throws IOException {
        if (!this.f25393k && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        } else if (this.f25395m) {
            mo32892a(Double.toString(d));
            return this;
        } else {
            m29397y();
            m29395w();
            this.f25378o.mo41155b(Double.toString(d));
            int[] iArr = this.f25391i;
            int i = this.f25388f - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }

    /* renamed from: a */
    public C8939o mo32891a(Number number) throws IOException {
        if (number == null) {
            mo32902q();
            return this;
        }
        String obj = number.toString();
        if (!this.f25393k && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        } else if (this.f25395m) {
            mo32892a(obj);
            return this;
        } else {
            m29397y();
            m29395w();
            this.f25378o.mo41155b(obj);
            int[] iArr = this.f25391i;
            int i = this.f25388f - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }

    /* renamed from: a */
    static void m29392a(C12909g gVar, String str) throws IOException {
        String str2;
        String[] strArr = f25377r;
        gVar.writeByte(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                gVar.mo41142a(str, i, i2);
            }
            gVar.mo41155b(str2);
            i = i2 + 1;
        }
        if (i < length) {
            gVar.mo41142a(str, i, length);
        }
        gVar.writeByte(34);
    }
}
