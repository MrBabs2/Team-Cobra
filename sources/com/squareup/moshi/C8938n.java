package com.squareup.moshi;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.squareup.moshi.n */
/* compiled from: JsonValueWriter */
final class C8938n extends C8939o {

    /* renamed from: o */
    Object[] f25386o = new Object[32];

    /* renamed from: p */
    private String f25387p;

    C8938n() {
        mo32912a(6);
    }

    /* renamed from: a */
    public C8939o mo32889a() throws IOException {
        if (!this.f25395m) {
            int i = this.f25388f;
            int i2 = this.f25396n;
            if (i == i2 && this.f25389g[i - 1] == 1) {
                this.f25396n = i2 ^ -1;
                return this;
            }
            mo32916d();
            ArrayList arrayList = new ArrayList();
            m29431a((Object) arrayList);
            Object[] objArr = this.f25386o;
            int i3 = this.f25388f;
            objArr[i3] = arrayList;
            this.f25391i[i3] = 0;
            mo32912a(1);
            return this;
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + getPath());
    }

    /* renamed from: b */
    public C8939o mo32893b() throws IOException {
        if (!this.f25395m) {
            int i = this.f25388f;
            int i2 = this.f25396n;
            if (i == i2 && this.f25389g[i - 1] == 3) {
                this.f25396n = i2 ^ -1;
                return this;
            }
            mo32916d();
            C8940p pVar = new C8940p();
            m29431a((Object) pVar);
            this.f25386o[this.f25388f] = pVar;
            mo32912a(3);
            return this;
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + getPath());
    }

    /* renamed from: c */
    public C8939o mo32894c(boolean z) throws IOException {
        if (!this.f25395m) {
            m29431a((Object) Boolean.valueOf(z));
            int[] iArr = this.f25391i;
            int i = this.f25388f - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + getPath());
    }

    public void close() throws IOException {
        int i = this.f25388f;
        if (i > 1 || (i == 1 && this.f25389g[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f25388f = 0;
    }

    /* renamed from: d */
    public C8939o mo32896d(long j) throws IOException {
        if (this.f25395m) {
            mo32892a(Long.toString(j));
            return this;
        }
        m29431a((Object) Long.valueOf(j));
        int[] iArr = this.f25391i;
        int i = this.f25388f - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    /* renamed from: e */
    public C8939o mo32898e(String str) throws IOException {
        if (this.f25395m) {
            mo32892a(str);
            return this;
        }
        m29431a((Object) str);
        int[] iArr = this.f25391i;
        int i = this.f25388f - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    public void flush() throws IOException {
        if (this.f25388f == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: i */
    public C8939o mo32900i() throws IOException {
        if (mo32921t() == 1) {
            int i = this.f25388f;
            int i2 = this.f25396n;
            if (i == (i2 ^ -1)) {
                this.f25396n = i2 ^ -1;
                return this;
            }
            int i3 = i - 1;
            this.f25388f = i3;
            this.f25386o[i3] = null;
            int[] iArr = this.f25391i;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    /* renamed from: l */
    public C8939o mo32901l() throws IOException {
        if (mo32921t() != 3) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f25387p == null) {
            int i = this.f25388f;
            int i2 = this.f25396n;
            if (i == (i2 ^ -1)) {
                this.f25396n = i2 ^ -1;
                return this;
            }
            this.f25395m = false;
            int i3 = i - 1;
            this.f25388f = i3;
            this.f25386o[i3] = null;
            this.f25390h[i3] = null;
            int[] iArr = this.f25391i;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            return this;
        } else {
            throw new IllegalStateException("Dangling name: " + this.f25387p);
        }
    }

    /* renamed from: q */
    public C8939o mo32902q() throws IOException {
        if (!this.f25395m) {
            m29431a((Object) null);
            int[] iArr = this.f25391i;
            int i = this.f25388f - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
        throw new IllegalStateException("null cannot be used as a map key in JSON at path " + getPath());
    }

    /* renamed from: v */
    public Object mo32911v() {
        int i = this.f25388f;
        if (i <= 1 && (i != 1 || this.f25389g[i - 1] == 7)) {
            return this.f25386o[0];
        }
        throw new IllegalStateException("Incomplete document");
    }

    /* renamed from: a */
    public C8939o mo32892a(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f25388f == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        } else if (mo32921t() == 3 && this.f25387p == null) {
            this.f25387p = str;
            this.f25390h[this.f25388f - 1] = str;
            this.f25395m = false;
            return this;
        } else {
            throw new IllegalStateException("Nesting problem.");
        }
    }

    /* renamed from: a */
    public C8939o mo32890a(double d) throws IOException {
        if (!this.f25393k && (Double.isNaN(d) || d == Double.NEGATIVE_INFINITY || d == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        } else if (this.f25395m) {
            mo32892a(Double.toString(d));
            return this;
        } else {
            m29431a((Object) Double.valueOf(d));
            int[] iArr = this.f25391i;
            int i = this.f25388f - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }

    /* renamed from: a */
    public C8939o mo32891a(Number number) throws IOException {
        BigDecimal bigDecimal;
        if ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) {
            mo32896d(number.longValue());
            return this;
        } else if ((number instanceof Float) || (number instanceof Double)) {
            mo32890a(number.doubleValue());
            return this;
        } else if (number == null) {
            mo32902q();
            return this;
        } else {
            if (number instanceof BigDecimal) {
                bigDecimal = (BigDecimal) number;
            } else {
                bigDecimal = new BigDecimal(number.toString());
            }
            if (this.f25395m) {
                mo32892a(bigDecimal.toString());
                return this;
            }
            m29431a((Object) bigDecimal);
            int[] iArr = this.f25391i;
            int i = this.f25388f - 1;
            iArr[i] = iArr[i] + 1;
            return this;
        }
    }

    /* renamed from: a */
    private C8938n m29431a(Object obj) {
        Object put;
        int t = mo32921t();
        int i = this.f25388f;
        if (i == 1) {
            if (t == 6) {
                this.f25389g[i - 1] = 7;
                this.f25386o[i - 1] = obj;
            } else {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
        } else if (t != 3 || this.f25387p == null) {
            if (t == 1) {
                ((List) this.f25386o[this.f25388f - 1]).add(obj);
            } else if (t == 9) {
                throw new IllegalStateException("Sink from valueSink() was not closed");
            } else {
                throw new IllegalStateException("Nesting problem.");
            }
        } else if ((obj != null || this.f25394l) && (put = ((Map) this.f25386o[this.f25388f - 1]).put(this.f25387p, obj)) != null) {
            throw new IllegalArgumentException("Map key '" + this.f25387p + "' has multiple values at path " + getPath() + ": " + put + " and " + obj);
        } else {
            this.f25387p = null;
        }
        return this;
    }
}
