package com.google.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import p015cm.aptoide.p016pt.account.AdultContentAnalytics;

/* renamed from: com.google.gson.stream.c */
/* compiled from: JsonWriter */
public class C8694c implements Closeable, Flushable {

    /* renamed from: o */
    private static final String[] f24780o = new String[128];

    /* renamed from: p */
    private static final String[] f24781p;

    /* renamed from: f */
    private final Writer f24782f;

    /* renamed from: g */
    private int[] f24783g = new int[32];

    /* renamed from: h */
    private int f24784h = 0;

    /* renamed from: i */
    private String f24785i;

    /* renamed from: j */
    private String f24786j;

    /* renamed from: k */
    private boolean f24787k;

    /* renamed from: l */
    private boolean f24788l;

    /* renamed from: m */
    private String f24789m;

    /* renamed from: n */
    private boolean f24790n;

    static {
        for (int i = 0; i <= 31; i++) {
            f24780o[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f24780o;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f24781p = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C8694c(Writer writer) {
        m28408a(6);
        this.f24786j = ":";
        this.f24790n = true;
        if (writer != null) {
            this.f24782f = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    /* renamed from: f */
    private void m28410f(String str) throws IOException {
        String str2;
        String[] strArr = this.f24788l ? f24781p : f24780o;
        this.f24782f.write("\"");
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
                this.f24782f.write(str, i, i2 - i);
            }
            this.f24782f.write(str2);
            i = i2 + 1;
        }
        if (i < length) {
            this.f24782f.write(str, i, length - i);
        }
        this.f24782f.write("\"");
    }

    private int peek() {
        int i = this.f24784h;
        if (i != 0) {
            return this.f24783g[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: q */
    private void mo32481q() throws IOException {
        int peek = peek();
        if (peek == 5) {
            this.f24782f.write(44);
        } else if (peek != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m28413u();
        m28409b(4);
    }

    /* renamed from: t */
    private void m28412t() throws IOException {
        int peek = peek();
        if (peek == 1) {
            m28409b(2);
            m28413u();
        } else if (peek == 2) {
            this.f24782f.append(',');
            m28413u();
        } else if (peek != 4) {
            if (peek != 6) {
                if (peek != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f24787k) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            m28409b(7);
        } else {
            this.f24782f.append(this.f24786j);
            m28409b(5);
        }
    }

    /* renamed from: u */
    private void m28413u() throws IOException {
        if (this.f24785i != null) {
            this.f24782f.write("\n");
            int i = this.f24784h;
            for (int i2 = 1; i2 < i; i2++) {
                this.f24782f.write(this.f24785i);
            }
        }
    }

    /* renamed from: v */
    private void m28414v() throws IOException {
        if (this.f24789m != null) {
            mo32481q();
            m28410f(this.f24789m);
            this.f24789m = null;
        }
    }

    /* renamed from: a */
    public final void mo32385a(boolean z) {
        this.f24788l = z;
    }

    /* renamed from: b */
    public final void mo32387b(boolean z) {
        this.f24787k = z;
    }

    /* renamed from: c */
    public final void mo32388c(boolean z) {
        this.f24790n = z;
    }

    public void close() throws IOException {
        this.f24782f.close();
        int i = this.f24784h;
        if (i > 1 || (i == 1 && this.f24783g[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f24784h = 0;
    }

    /* renamed from: d */
    public final void mo32393d(String str) {
        if (str.length() == 0) {
            this.f24785i = null;
            this.f24786j = ":";
            return;
        }
        this.f24785i = str;
        this.f24786j = ": ";
    }

    /* renamed from: e */
    public C8694c mo32394e(String str) throws IOException {
        if (str == null) {
            return mo32400p();
        }
        m28414v();
        m28412t();
        m28410f(str);
        return this;
    }

    public void flush() throws IOException {
        if (this.f24784h != 0) {
            this.f24782f.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: i */
    public C8694c mo32396i() throws IOException {
        m28406a(3, 5, "}");
        return this;
    }

    /* renamed from: l */
    public final boolean mo32397l() {
        return this.f24790n;
    }

    /* renamed from: m */
    public final boolean mo32398m() {
        return this.f24788l;
    }

    /* renamed from: o */
    public boolean mo32399o() {
        return this.f24787k;
    }

    /* renamed from: p */
    public C8694c mo32400p() throws IOException {
        if (this.f24789m != null) {
            if (this.f24790n) {
                m28414v();
            } else {
                this.f24789m = null;
                return this;
            }
        }
        m28412t();
        this.f24782f.write("null");
        return this;
    }

    /* renamed from: a */
    public C8694c mo32381a() throws IOException {
        m28414v();
        m28407a(1, "[");
        return this;
    }

    /* renamed from: b */
    public C8694c mo32386b() throws IOException {
        m28414v();
        m28407a(3, "{");
        return this;
    }

    /* renamed from: a */
    private C8694c m28407a(int i, String str) throws IOException {
        m28412t();
        m28408a(i);
        this.f24782f.write(str);
        return this;
    }

    /* renamed from: b */
    private void m28409b(int i) {
        this.f24783g[this.f24784h - 1] = i;
    }

    /* renamed from: d */
    public C8694c mo32390d() throws IOException {
        m28406a(1, 2, "]");
        return this;
    }

    /* renamed from: a */
    private C8694c m28406a(int i, int i2, String str) throws IOException {
        int peek = peek();
        if (peek != i2 && peek != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f24789m == null) {
            this.f24784h--;
            if (peek == i2) {
                m28413u();
            }
            this.f24782f.write(str);
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.f24789m);
        }
    }

    /* renamed from: d */
    public C8694c mo32392d(boolean z) throws IOException {
        m28414v();
        m28412t();
        this.f24782f.write(z ? "true" : AdultContentAnalytics.UNLOCK);
        return this;
    }

    /* renamed from: d */
    public C8694c mo32391d(long j) throws IOException {
        m28414v();
        m28412t();
        this.f24782f.write(Long.toString(j));
        return this;
    }

    /* renamed from: a */
    private void m28408a(int i) {
        int i2 = this.f24784h;
        int[] iArr = this.f24783g;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(i2 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f24783g = iArr2;
        }
        int[] iArr3 = this.f24783g;
        int i3 = this.f24784h;
        this.f24784h = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: a */
    public C8694c mo32384a(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f24789m != null) {
            throw new IllegalStateException();
        } else if (this.f24784h != 0) {
            this.f24789m = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: a */
    public C8694c mo32382a(Boolean bool) throws IOException {
        if (bool == null) {
            return mo32400p();
        }
        m28414v();
        m28412t();
        this.f24782f.write(bool.booleanValue() ? "true" : AdultContentAnalytics.UNLOCK);
        return this;
    }

    /* renamed from: a */
    public C8694c mo32383a(Number number) throws IOException {
        if (number == null) {
            return mo32400p();
        }
        m28414v();
        String obj = number.toString();
        if (this.f24787k || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            m28412t();
            this.f24782f.append(obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }
}
