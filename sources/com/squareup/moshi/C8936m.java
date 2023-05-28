package com.squareup.moshi;

import com.squareup.moshi.C8930i;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.squareup.moshi.m */
/* compiled from: JsonValueReader */
final class C8936m extends C8930i {

    /* renamed from: m */
    private static final Object f25381m = new Object();

    /* renamed from: l */
    private Object[] f25382l;

    /* renamed from: com.squareup.moshi.m$a */
    /* compiled from: JsonValueReader */
    static final class C8937a implements Iterator<Object>, Cloneable {

        /* renamed from: f */
        final C8930i.C8932b f25383f;

        /* renamed from: g */
        final Object[] f25384g;

        /* renamed from: h */
        int f25385h;

        C8937a(C8930i.C8932b bVar, Object[] objArr, int i) {
            this.f25383f = bVar;
            this.f25384g = objArr;
            this.f25385h = i;
        }

        public boolean hasNext() {
            return this.f25385h < this.f25384g.length;
        }

        public Object next() {
            Object[] objArr = this.f25384g;
            int i = this.f25385h;
            this.f25385h = i + 1;
            return objArr[i];
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: protected */
        public C8937a clone() {
            return new C8937a(this.f25383f, this.f25384g, this.f25385h);
        }
    }

    C8936m(Object obj) {
        int[] iArr = this.f25348g;
        int i = this.f25347f;
        iArr[i] = 7;
        Object[] objArr = new Object[32];
        this.f25382l = objArr;
        this.f25347f = i + 1;
        objArr[i] = obj;
    }

    /* renamed from: B */
    private void m29410B() {
        int i = this.f25347f - 1;
        this.f25347f = i;
        Object[] objArr = this.f25382l;
        objArr[i] = null;
        this.f25348g[i] = 0;
        if (i > 0) {
            int[] iArr = this.f25350i;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
            Object obj = objArr[i - 1];
            if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                if (it.hasNext()) {
                    m29413a(it.next());
                }
            }
        }
    }

    /* renamed from: A */
    public String mo32903A() throws IOException {
        Map.Entry entry = (Map.Entry) m29411a(Map.Entry.class, C8930i.C8932b.NAME);
        String a = m29412a((Map.Entry<?, ?>) entry);
        this.f25382l[this.f25347f - 1] = entry.getValue();
        this.f25349h[this.f25347f - 2] = a;
        return a;
    }

    /* renamed from: a */
    public void mo32864a() throws IOException {
        List list = (List) m29411a(List.class, C8930i.C8932b.BEGIN_ARRAY);
        C8937a aVar = new C8937a(C8930i.C8932b.END_ARRAY, list.toArray(new Object[list.size()]), 0);
        Object[] objArr = this.f25382l;
        int i = this.f25347f;
        objArr[i - 1] = aVar;
        this.f25348g[i - 1] = 1;
        this.f25350i[i - 1] = 0;
        if (aVar.hasNext()) {
            m29413a(aVar.next());
        }
    }

    /* renamed from: b */
    public void mo32868b() throws IOException {
        Map map = (Map) m29411a(Map.class, C8930i.C8932b.BEGIN_OBJECT);
        C8937a aVar = new C8937a(C8930i.C8932b.END_OBJECT, map.entrySet().toArray(new Object[map.size()]), 0);
        Object[] objArr = this.f25382l;
        int i = this.f25347f;
        objArr[i - 1] = aVar;
        this.f25348g[i - 1] = 3;
        if (aVar.hasNext()) {
            m29413a(aVar.next());
        }
    }

    public void close() throws IOException {
        Arrays.fill(this.f25382l, 0, this.f25347f, (Object) null);
        this.f25382l[0] = f25381m;
        this.f25348g[0] = 8;
        this.f25347f = 1;
    }

    /* renamed from: d */
    public void mo32870d() throws IOException {
        C8937a aVar = (C8937a) m29411a(C8937a.class, C8930i.C8932b.END_ARRAY);
        if (aVar.f25383f != C8930i.C8932b.END_ARRAY || aVar.hasNext()) {
            throw mo32862a(aVar, C8930i.C8932b.END_ARRAY);
        }
        m29410B();
    }

    /* renamed from: i */
    public void mo32872i() throws IOException {
        C8937a aVar = (C8937a) m29411a(C8937a.class, C8930i.C8932b.END_OBJECT);
        if (aVar.f25383f != C8930i.C8932b.END_OBJECT || aVar.hasNext()) {
            throw mo32862a(aVar, C8930i.C8932b.END_OBJECT);
        }
        this.f25349h[this.f25347f - 1] = null;
        m29410B();
    }

    /* renamed from: m */
    public boolean mo32874m() throws IOException {
        int i = this.f25347f;
        if (i == 0) {
            return false;
        }
        Object obj = this.f25382l[i - 1];
        if (!(obj instanceof Iterator) || ((Iterator) obj).hasNext()) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public boolean mo32876p() throws IOException {
        m29410B();
        return ((Boolean) m29411a(Boolean.class, C8930i.C8932b.BOOLEAN)).booleanValue();
    }

    public C8930i.C8932b peek() throws IOException {
        int i = this.f25347f;
        if (i == 0) {
            return C8930i.C8932b.END_DOCUMENT;
        }
        Object obj = this.f25382l[i - 1];
        if (obj instanceof C8937a) {
            return ((C8937a) obj).f25383f;
        }
        if (obj instanceof List) {
            return C8930i.C8932b.BEGIN_ARRAY;
        }
        if (obj instanceof Map) {
            return C8930i.C8932b.BEGIN_OBJECT;
        }
        if (obj instanceof Map.Entry) {
            return C8930i.C8932b.NAME;
        }
        if (obj instanceof String) {
            return C8930i.C8932b.STRING;
        }
        if (obj instanceof Boolean) {
            return C8930i.C8932b.BOOLEAN;
        }
        if (obj instanceof Number) {
            return C8930i.C8932b.NUMBER;
        }
        if (obj == null) {
            return C8930i.C8932b.NULL;
        }
        if (obj == f25381m) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw mo32862a(obj, "a JSON value");
    }

    /* renamed from: q */
    public double mo32878q() throws IOException {
        double d;
        Object a = m29411a(Object.class, C8930i.C8932b.NUMBER);
        if (a instanceof Number) {
            d = ((Number) a).doubleValue();
        } else if (a instanceof String) {
            try {
                d = Double.parseDouble((String) a);
            } catch (NumberFormatException unused) {
                throw mo32862a(a, C8930i.C8932b.NUMBER);
            }
        } else {
            throw mo32862a(a, C8930i.C8932b.NUMBER);
        }
        if (this.f25351j || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            m29410B();
            return d;
        }
        throw new JsonEncodingException("JSON forbids NaN and infinities: " + d + " at path " + getPath());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        throw mo32862a(r0, com.squareup.moshi.C8930i.C8932b.NUMBER);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r0 = new java.math.BigDecimal((java.lang.String) r0).intValueExact();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001f */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo32879t() throws java.io.IOException {
        /*
            r3 = this;
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            com.squareup.moshi.i$b r1 = com.squareup.moshi.C8930i.C8932b.NUMBER
            java.lang.Object r0 = r3.m29411a(r0, r1)
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L_0x0013
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            goto L_0x002b
        L_0x0013:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x0036
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NumberFormatException -> 0x001f }
            int r0 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x001f }
            goto L_0x002b
        L_0x001f:
            java.math.BigDecimal r1 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x002f }
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ NumberFormatException -> 0x002f }
            r1.<init>(r2)     // Catch:{ NumberFormatException -> 0x002f }
            int r0 = r1.intValueExact()     // Catch:{ NumberFormatException -> 0x002f }
        L_0x002b:
            r3.m29410B()
            return r0
        L_0x002f:
            com.squareup.moshi.i$b r1 = com.squareup.moshi.C8930i.C8932b.NUMBER
            com.squareup.moshi.JsonDataException r0 = r3.mo32862a(r0, r1)
            throw r0
        L_0x0036:
            com.squareup.moshi.i$b r1 = com.squareup.moshi.C8930i.C8932b.NUMBER
            com.squareup.moshi.JsonDataException r0 = r3.mo32862a(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C8936m.mo32879t():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        throw mo32862a(r0, com.squareup.moshi.C8930i.C8932b.NUMBER);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r0 = new java.math.BigDecimal((java.lang.String) r0).longValueExact();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001f */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo32880u() throws java.io.IOException {
        /*
            r3 = this;
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            com.squareup.moshi.i$b r1 = com.squareup.moshi.C8930i.C8932b.NUMBER
            java.lang.Object r0 = r3.m29411a(r0, r1)
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L_0x0013
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            goto L_0x002b
        L_0x0013:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x0036
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NumberFormatException -> 0x001f }
            long r0 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x001f }
            goto L_0x002b
        L_0x001f:
            java.math.BigDecimal r1 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x002f }
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ NumberFormatException -> 0x002f }
            r1.<init>(r2)     // Catch:{ NumberFormatException -> 0x002f }
            long r0 = r1.longValueExact()     // Catch:{ NumberFormatException -> 0x002f }
        L_0x002b:
            r3.m29410B()
            return r0
        L_0x002f:
            com.squareup.moshi.i$b r1 = com.squareup.moshi.C8930i.C8932b.NUMBER
            com.squareup.moshi.JsonDataException r0 = r3.mo32862a(r0, r1)
            throw r0
        L_0x0036:
            com.squareup.moshi.i$b r1 = com.squareup.moshi.C8930i.C8932b.NUMBER
            com.squareup.moshi.JsonDataException r0 = r3.mo32862a(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C8936m.mo32880u():long");
    }

    /* renamed from: v */
    public <T> T mo32881v() throws IOException {
        m29411a(Void.class, C8930i.C8932b.NULL);
        m29410B();
        return null;
    }

    /* renamed from: w */
    public String mo32882w() throws IOException {
        int i = this.f25347f;
        String str = i != 0 ? this.f25382l[i - 1] : null;
        if (str instanceof String) {
            m29410B();
            return str;
        } else if (str instanceof Number) {
            m29410B();
            return str.toString();
        } else if (str == f25381m) {
            throw new IllegalStateException("JsonReader is closed");
        } else {
            throw mo32862a(str, C8930i.C8932b.STRING);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo32883x() throws IOException {
        if (mo32874m()) {
            m29413a((Object) mo32903A());
        }
    }

    /* renamed from: y */
    public void mo32884y() throws IOException {
        if (!this.f25352k) {
            this.f25382l[this.f25347f - 1] = ((Map.Entry) m29411a(Map.Entry.class, C8930i.C8932b.NAME)).getValue();
            this.f25349h[this.f25347f - 2] = "null";
            return;
        }
        C8930i.C8932b peek = peek();
        mo32903A();
        throw new JsonDataException("Cannot skip unexpected " + peek + " at " + getPath());
    }

    /* renamed from: z */
    public void mo32885z() throws IOException {
        if (!this.f25352k) {
            int i = this.f25347f;
            if (i > 1) {
                this.f25349h[i - 2] = "null";
            }
            int i2 = this.f25347f;
            Object obj = i2 != 0 ? this.f25382l[i2 - 1] : null;
            if (obj instanceof C8937a) {
                throw new JsonDataException("Expected a value but was " + peek() + " at path " + getPath());
            } else if (obj instanceof Map.Entry) {
                Object[] objArr = this.f25382l;
                int i3 = this.f25347f;
                objArr[i3 - 1] = ((Map.Entry) objArr[i3 - 1]).getValue();
            } else if (this.f25347f > 0) {
                m29410B();
            } else {
                throw new JsonDataException("Expected a value but was " + peek() + " at path " + getPath());
            }
        } else {
            throw new JsonDataException("Cannot skip unexpected " + peek() + " at " + getPath());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo32867b(com.squareup.moshi.C8930i.C8931a r6) throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.f25347f
            if (r0 == 0) goto L_0x000b
            java.lang.Object[] r1 = r5.f25382l
            int r0 = r0 + -1
            r0 = r1[r0]
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            boolean r1 = r0 instanceof java.lang.String
            r2 = -1
            if (r1 != 0) goto L_0x001e
            java.lang.Object r6 = f25381m
            if (r0 == r6) goto L_0x0016
            return r2
        L_0x0016:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "JsonReader is closed"
            r6.<init>(r0)
            throw r6
        L_0x001e:
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            java.lang.String[] r3 = r6.f25353a
            int r3 = r3.length
        L_0x0024:
            if (r1 >= r3) goto L_0x0037
            java.lang.String[] r4 = r6.f25353a
            r4 = r4[r1]
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r5.m29410B()
            return r1
        L_0x0034:
            int r1 = r1 + 1
            goto L_0x0024
        L_0x0037:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C8936m.mo32867b(com.squareup.moshi.i$a):int");
    }

    /* renamed from: a */
    public int mo32861a(C8930i.C8931a aVar) throws IOException {
        Map.Entry entry = (Map.Entry) m29411a(Map.Entry.class, C8930i.C8932b.NAME);
        String a = m29412a((Map.Entry<?, ?>) entry);
        int length = aVar.f25353a.length;
        for (int i = 0; i < length; i++) {
            if (aVar.f25353a[i].equals(a)) {
                this.f25382l[this.f25347f - 1] = entry.getValue();
                this.f25349h[this.f25347f - 2] = a;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private void m29413a(Object obj) {
        int i = this.f25347f;
        if (i == this.f25382l.length) {
            if (i != 256) {
                int[] iArr = this.f25348g;
                this.f25348g = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f25349h;
                this.f25349h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f25350i;
                this.f25350i = Arrays.copyOf(iArr2, iArr2.length * 2);
                Object[] objArr = this.f25382l;
                this.f25382l = Arrays.copyOf(objArr, objArr.length * 2);
            } else {
                throw new JsonDataException("Nesting too deep at " + getPath());
            }
        }
        Object[] objArr2 = this.f25382l;
        int i2 = this.f25347f;
        this.f25347f = i2 + 1;
        objArr2[i2] = obj;
    }

    /* renamed from: a */
    private <T> T m29411a(Class<T> cls, C8930i.C8932b bVar) throws IOException {
        int i = this.f25347f;
        Object obj = i != 0 ? this.f25382l[i - 1] : null;
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        if (obj == null && bVar == C8930i.C8932b.NULL) {
            return null;
        }
        if (obj == f25381m) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw mo32862a(obj, bVar);
    }

    /* renamed from: a */
    private String m29412a(Map.Entry<?, ?> entry) {
        Object key = entry.getKey();
        if (key instanceof String) {
            return (String) key;
        }
        throw mo32862a(key, C8930i.C8932b.NAME);
    }
}
