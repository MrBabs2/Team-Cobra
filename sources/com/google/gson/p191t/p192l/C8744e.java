package com.google.gson.p191t.p192l;

import com.google.gson.C8676g;
import com.google.gson.C8680k;
import com.google.gson.C8681l;
import com.google.gson.C8682m;
import com.google.gson.stream.C8691a;
import com.google.gson.stream.C8693b;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.gson.t.l.e */
/* compiled from: JsonTreeReader */
public final class C8744e extends C8691a {

    /* renamed from: z */
    private static final Object f24864z = new Object();

    /* renamed from: v */
    private Object[] f24865v;

    /* renamed from: w */
    private int f24866w;

    /* renamed from: x */
    private String[] f24867x;

    /* renamed from: y */
    private int[] f24868y;

    /* renamed from: com.google.gson.t.l.e$a */
    /* compiled from: JsonTreeReader */
    static class C8745a extends Reader {
        C8745a() {
        }

        public void close() throws IOException {
            throw new AssertionError();
        }

        public int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }
    }

    static {
        new C8745a();
    }

    /* renamed from: B */
    private Object m28530B() {
        return this.f24865v[this.f24866w - 1];
    }

    /* renamed from: C */
    private Object m28531C() {
        Object[] objArr = this.f24865v;
        int i = this.f24866w - 1;
        this.f24866w = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* renamed from: p */
    private String m28534p() {
        return " at path " + getPath();
    }

    /* renamed from: A */
    public void mo32478A() throws IOException {
        m28532a(C8693b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m28530B()).next();
        m28533a(entry.getValue());
        m28533a((Object) new C8682m((String) entry.getKey()));
    }

    /* renamed from: a */
    public void mo32359a() throws IOException {
        m28532a(C8693b.BEGIN_ARRAY);
        m28533a((Object) ((C8676g) m28530B()).iterator());
        this.f24868y[this.f24866w - 1] = 0;
    }

    /* renamed from: b */
    public void mo32361b() throws IOException {
        m28532a(C8693b.BEGIN_OBJECT);
        m28533a((Object) ((C8681l) m28530B()).mo32341j().iterator());
    }

    public void close() throws IOException {
        this.f24865v = new Object[]{f24864z};
        this.f24866w = 1;
    }

    public String getPath() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (i < this.f24866w) {
            Object[] objArr = this.f24865v;
            if (objArr[i] instanceof C8676g) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.f24868y[i]);
                    sb.append(']');
                }
            } else if (objArr[i] instanceof C8681l) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.f24867x;
                    if (strArr[i] != null) {
                        sb.append(strArr[i]);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    /* renamed from: i */
    public void mo32365i() throws IOException {
        m28532a(C8693b.END_ARRAY);
        m28531C();
        m28531C();
        int i = this.f24866w;
        if (i > 0) {
            int[] iArr = this.f24868y;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: l */
    public void mo32366l() throws IOException {
        m28532a(C8693b.END_OBJECT);
        m28531C();
        m28531C();
        int i = this.f24866w;
        if (i > 0) {
            int[] iArr = this.f24868y;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: m */
    public boolean mo32367m() throws IOException {
        C8693b peek = peek();
        return (peek == C8693b.END_OBJECT || peek == C8693b.END_ARRAY) ? false : true;
    }

    public C8693b peek() throws IOException {
        if (this.f24866w == 0) {
            return C8693b.END_DOCUMENT;
        }
        Object B = m28530B();
        if (B instanceof Iterator) {
            boolean z = this.f24865v[this.f24866w - 2] instanceof C8681l;
            Iterator it = (Iterator) B;
            if (!it.hasNext()) {
                return z ? C8693b.END_OBJECT : C8693b.END_ARRAY;
            }
            if (z) {
                return C8693b.NAME;
            }
            m28533a(it.next());
            return peek();
        } else if (B instanceof C8681l) {
            return C8693b.BEGIN_OBJECT;
        } else {
            if (B instanceof C8676g) {
                return C8693b.BEGIN_ARRAY;
            }
            if (B instanceof C8682m) {
                C8682m mVar = (C8682m) B;
                if (mVar.mo32354y()) {
                    return C8693b.STRING;
                }
                if (mVar.mo32352v()) {
                    return C8693b.BOOLEAN;
                }
                if (mVar.mo32353x()) {
                    return C8693b.NUMBER;
                }
                throw new AssertionError();
            } else if (B instanceof C8680k) {
                return C8693b.NULL;
            } else {
                if (B == f24864z) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    /* renamed from: q */
    public boolean mo32371q() throws IOException {
        m28532a(C8693b.BOOLEAN);
        boolean j = ((C8682m) m28531C()).mo32345j();
        int i = this.f24866w;
        if (i > 0) {
            int[] iArr = this.f24868y;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return j;
    }

    /* renamed from: t */
    public double mo32372t() throws IOException {
        C8693b peek = peek();
        if (peek == C8693b.NUMBER || peek == C8693b.STRING) {
            double n = ((C8682m) m28530B()).mo32347n();
            if (mo32368o() || (!Double.isNaN(n) && !Double.isInfinite(n))) {
                m28531C();
                int i = this.f24866w;
                if (i > 0) {
                    int[] iArr = this.f24868y;
                    int i2 = i - 1;
                    iArr[i2] = iArr[i2] + 1;
                }
                return n;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + n);
        }
        throw new IllegalStateException("Expected " + C8693b.NUMBER + " but was " + peek + m28534p());
    }

    public String toString() {
        return C8744e.class.getSimpleName();
    }

    /* renamed from: u */
    public int mo32374u() throws IOException {
        C8693b peek = peek();
        if (peek == C8693b.NUMBER || peek == C8693b.STRING) {
            int o = ((C8682m) m28530B()).mo32348o();
            m28531C();
            int i = this.f24866w;
            if (i > 0) {
                int[] iArr = this.f24868y;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return o;
        }
        throw new IllegalStateException("Expected " + C8693b.NUMBER + " but was " + peek + m28534p());
    }

    /* renamed from: v */
    public long mo32375v() throws IOException {
        C8693b peek = peek();
        if (peek == C8693b.NUMBER || peek == C8693b.STRING) {
            long p = ((C8682m) m28530B()).mo32349p();
            m28531C();
            int i = this.f24866w;
            if (i > 0) {
                int[] iArr = this.f24868y;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return p;
        }
        throw new IllegalStateException("Expected " + C8693b.NUMBER + " but was " + peek + m28534p());
    }

    /* renamed from: w */
    public String mo32376w() throws IOException {
        m28532a(C8693b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m28530B()).next();
        String str = (String) entry.getKey();
        this.f24867x[this.f24866w - 1] = str;
        m28533a(entry.getValue());
        return str;
    }

    /* renamed from: x */
    public void mo32377x() throws IOException {
        m28532a(C8693b.NULL);
        m28531C();
        int i = this.f24866w;
        if (i > 0) {
            int[] iArr = this.f24868y;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: y */
    public String mo32378y() throws IOException {
        C8693b peek = peek();
        if (peek == C8693b.STRING || peek == C8693b.NUMBER) {
            String u = ((C8682m) m28531C()).mo32351u();
            int i = this.f24866w;
            if (i > 0) {
                int[] iArr = this.f24868y;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return u;
        }
        throw new IllegalStateException("Expected " + C8693b.STRING + " but was " + peek + m28534p());
    }

    /* renamed from: z */
    public void mo32379z() throws IOException {
        if (peek() == C8693b.NAME) {
            mo32376w();
            this.f24867x[this.f24866w - 2] = "null";
        } else {
            m28531C();
            int i = this.f24866w;
            if (i > 0) {
                this.f24867x[i - 1] = "null";
            }
        }
        int i2 = this.f24866w;
        if (i2 > 0) {
            int[] iArr = this.f24868y;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    /* renamed from: a */
    private void m28532a(C8693b bVar) throws IOException {
        if (peek() != bVar) {
            throw new IllegalStateException("Expected " + bVar + " but was " + peek() + m28534p());
        }
    }

    /* renamed from: a */
    private void m28533a(Object obj) {
        int i = this.f24866w;
        Object[] objArr = this.f24865v;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[(i * 2)];
            int[] iArr = new int[(i * 2)];
            String[] strArr = new String[(i * 2)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f24868y, 0, iArr, 0, this.f24866w);
            System.arraycopy(this.f24867x, 0, strArr, 0, this.f24866w);
            this.f24865v = objArr2;
            this.f24868y = iArr;
            this.f24867x = strArr;
        }
        Object[] objArr3 = this.f24865v;
        int i2 = this.f24866w;
        this.f24866w = i2 + 1;
        objArr3[i2] = obj;
    }
}
