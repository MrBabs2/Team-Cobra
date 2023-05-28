package com.google.gson.p191t.p192l;

import com.google.gson.C8676g;
import com.google.gson.C8679j;
import com.google.gson.C8680k;
import com.google.gson.C8681l;
import com.google.gson.C8682m;
import com.google.gson.stream.C8694c;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.gson.t.l.f */
/* compiled from: JsonTreeWriter */
public final class C8746f extends C8694c {

    /* renamed from: t */
    private static final Writer f24869t = new C8747a();

    /* renamed from: u */
    private static final C8682m f24870u = new C8682m("closed");

    /* renamed from: q */
    private final List<C8679j> f24871q = new ArrayList();

    /* renamed from: r */
    private String f24872r;

    /* renamed from: s */
    private C8679j f24873s = C8680k.f24745a;

    /* renamed from: com.google.gson.t.l.f$a */
    /* compiled from: JsonTreeWriter */
    static class C8747a extends Writer {
        C8747a() {
        }

        public void close() throws IOException {
            throw new AssertionError();
        }

        public void flush() throws IOException {
            throw new AssertionError();
        }

        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public C8746f() {
        super(f24869t);
    }

    /* renamed from: a */
    private void m28549a(C8679j jVar) {
        if (this.f24872r != null) {
            if (!jVar.mo32332f() || mo32397l()) {
                ((C8681l) peek()).mo32338a(this.f24872r, jVar);
            }
            this.f24872r = null;
        } else if (this.f24871q.isEmpty()) {
            this.f24873s = jVar;
        } else {
            C8679j peek = peek();
            if (peek instanceof C8676g) {
                ((C8676g) peek).mo32323a(jVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    private C8679j peek() {
        List<C8679j> list = this.f24871q;
        return list.get(list.size() - 1);
    }

    /* renamed from: b */
    public C8694c mo32386b() throws IOException {
        C8681l lVar = new C8681l();
        m28549a((C8679j) lVar);
        this.f24871q.add(lVar);
        return this;
    }

    public void close() throws IOException {
        if (this.f24871q.isEmpty()) {
            this.f24871q.add(f24870u);
            return;
        }
        throw new IOException("Incomplete document");
    }

    /* renamed from: d */
    public C8694c mo32390d() throws IOException {
        if (this.f24871q.isEmpty() || this.f24872r != null) {
            throw new IllegalStateException();
        } else if (peek() instanceof C8676g) {
            List<C8679j> list = this.f24871q;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: e */
    public C8694c mo32394e(String str) throws IOException {
        if (str == null) {
            mo32400p();
            return this;
        }
        m28549a((C8679j) new C8682m(str));
        return this;
    }

    public void flush() throws IOException {
    }

    /* renamed from: i */
    public C8694c mo32396i() throws IOException {
        if (this.f24871q.isEmpty() || this.f24872r != null) {
            throw new IllegalStateException();
        } else if (peek() instanceof C8681l) {
            List<C8679j> list = this.f24871q;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: p */
    public C8694c mo32400p() throws IOException {
        m28549a((C8679j) C8680k.f24745a);
        return this;
    }

    /* renamed from: q */
    public C8679j mo32481q() {
        if (this.f24871q.isEmpty()) {
            return this.f24873s;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f24871q);
    }

    /* renamed from: d */
    public C8694c mo32392d(boolean z) throws IOException {
        m28549a((C8679j) new C8682m(Boolean.valueOf(z)));
        return this;
    }

    /* renamed from: d */
    public C8694c mo32391d(long j) throws IOException {
        m28549a((C8679j) new C8682m((Number) Long.valueOf(j)));
        return this;
    }

    /* renamed from: a */
    public C8694c mo32381a() throws IOException {
        C8676g gVar = new C8676g();
        m28549a((C8679j) gVar);
        this.f24871q.add(gVar);
        return this;
    }

    /* renamed from: a */
    public C8694c mo32384a(String str) throws IOException {
        if (this.f24871q.isEmpty() || this.f24872r != null) {
            throw new IllegalStateException();
        } else if (peek() instanceof C8681l) {
            this.f24872r = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public C8694c mo32382a(Boolean bool) throws IOException {
        if (bool == null) {
            mo32400p();
            return this;
        }
        m28549a((C8679j) new C8682m(bool));
        return this;
    }

    /* renamed from: a */
    public C8694c mo32383a(Number number) throws IOException {
        if (number == null) {
            mo32400p();
            return this;
        }
        if (!mo32399o()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        m28549a((C8679j) new C8682m(number));
        return this;
    }
}
