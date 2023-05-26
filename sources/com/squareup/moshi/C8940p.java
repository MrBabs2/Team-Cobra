package com.squareup.moshi;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: com.squareup.moshi.p */
/* compiled from: LinkedHashTreeMap */
final class C8940p<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: n */
    private static final Comparator<Comparable> f25397n = new C8941a();

    /* renamed from: f */
    Comparator<? super K> f25398f;

    /* renamed from: g */
    C8949g<K, V>[] f25399g;

    /* renamed from: h */
    final C8949g<K, V> f25400h;

    /* renamed from: i */
    int f25401i;

    /* renamed from: j */
    int f25402j;

    /* renamed from: k */
    int f25403k;

    /* renamed from: l */
    private C8940p<K, V>.C4753d f25404l;

    /* renamed from: m */
    private C8940p<K, V>.C4754e f25405m;

    /* renamed from: com.squareup.moshi.p$a */
    /* compiled from: LinkedHashTreeMap */
    class C8941a implements Comparator<Comparable> {
        C8941a() {
        }

        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: com.squareup.moshi.p$d */
    /* compiled from: LinkedHashTreeMap */
    final class C8944d extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: com.squareup.moshi.p$d$a */
        /* compiled from: LinkedHashTreeMap */
        class C8945a extends C8940p<K, V>.C4755f<Map.Entry<K, V>> {
            C8945a(C8944d dVar) {
                super();
            }

            public Map.Entry<K, V> next() {
                return mo32955a();
            }
        }

        C8944d() {
        }

        public void clear() {
            C8940p.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C8940p.this.mo32924a((Map.Entry<?, ?>) (Map.Entry) obj) != null;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C8945a(this);
        }

        public boolean remove(Object obj) {
            C8949g a;
            if (!(obj instanceof Map.Entry) || (a = C8940p.this.mo32924a((Map.Entry<?, ?>) (Map.Entry) obj)) == null) {
                return false;
            }
            C8940p.this.mo32925a(a, true);
            return true;
        }

        public int size() {
            return C8940p.this.f25401i;
        }
    }

    /* renamed from: com.squareup.moshi.p$e */
    /* compiled from: LinkedHashTreeMap */
    final class C8946e extends AbstractSet<K> {

        /* renamed from: com.squareup.moshi.p$e$a */
        /* compiled from: LinkedHashTreeMap */
        class C8947a extends C8940p<K, V>.C4755f<K> {
            C8947a(C8946e eVar) {
                super();
            }

            public K next() {
                return mo32955a().f25422k;
            }
        }

        C8946e() {
        }

        public void clear() {
            C8940p.this.clear();
        }

        public boolean contains(Object obj) {
            return C8940p.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new C8947a(this);
        }

        public boolean remove(Object obj) {
            return C8940p.this.mo32927c(obj) != null;
        }

        public int size() {
            return C8940p.this.f25401i;
        }
    }

    /* renamed from: com.squareup.moshi.p$f */
    /* compiled from: LinkedHashTreeMap */
    abstract class C8948f<T> implements Iterator<T> {

        /* renamed from: f */
        C8949g<K, V> f25413f;

        /* renamed from: g */
        C8949g<K, V> f25414g = null;

        /* renamed from: h */
        int f25415h;

        C8948f() {
            C8940p pVar = C8940p.this;
            this.f25413f = pVar.f25400h.f25420i;
            this.f25415h = pVar.f25402j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C8949g<K, V> mo32955a() {
            C8949g<K, V> gVar = this.f25413f;
            C8940p pVar = C8940p.this;
            if (gVar == pVar.f25400h) {
                throw new NoSuchElementException();
            } else if (pVar.f25402j == this.f25415h) {
                this.f25413f = gVar.f25420i;
                this.f25414g = gVar;
                return gVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f25413f != C8940p.this.f25400h;
        }

        public final void remove() {
            C8949g<K, V> gVar = this.f25414g;
            if (gVar != null) {
                C8940p.this.mo32925a(gVar, true);
                this.f25414g = null;
                this.f25415h = C8940p.this.f25402j;
                return;
            }
            throw new IllegalStateException();
        }
    }

    static {
        Class<C8940p> cls = C8940p.class;
    }

    C8940p() {
        this((Comparator) null);
    }

    /* renamed from: a */
    private static int m29467a(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C8949g<K, V> mo32923a(K k, boolean z) {
        int i;
        C8949g<K, V> gVar;
        C8949g<K, V> gVar2;
        int i2;
        Comparator<? super K> comparator = this.f25398f;
        C8949g<K, V>[] gVarArr = this.f25399g;
        int a = m29467a(k.hashCode());
        int length = (gVarArr.length - 1) & a;
        C8949g<K, V> gVar3 = gVarArr[length];
        if (gVar3 != null) {
            Comparable comparable = comparator == f25397n ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    i2 = comparable.compareTo(gVar3.f25422k);
                } else {
                    i2 = comparator.compare(k, gVar3.f25422k);
                }
                if (i2 == 0) {
                    return gVar3;
                }
                C8949g<K, V> gVar4 = i2 < 0 ? gVar3.f25418g : gVar3.f25419h;
                if (gVar4 == null) {
                    gVar = gVar3;
                    i = i2;
                    break;
                }
                gVar3 = gVar4;
            }
        } else {
            gVar = gVar3;
            i = 0;
        }
        if (!z) {
            return null;
        }
        C8949g<K, V> gVar5 = this.f25400h;
        if (gVar != null) {
            gVar2 = new C8949g<>(gVar, k, a, gVar5, gVar5.f25421j);
            if (i < 0) {
                gVar.f25418g = gVar2;
            } else {
                gVar.f25419h = gVar2;
            }
            m29474b(gVar, true);
        } else if (comparator != f25397n || (k instanceof Comparable)) {
            gVar2 = new C8949g<>(gVar, k, a, gVar5, gVar5.f25421j);
            gVarArr[length] = gVar2;
        } else {
            throw new ClassCastException(k.getClass().getName() + " is not Comparable");
        }
        int i3 = this.f25401i;
        this.f25401i = i3 + 1;
        if (i3 > this.f25403k) {
            m29468a();
        }
        this.f25402j++;
        return gVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C8949g<K, V> mo32926b(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return mo32923a(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C8949g<K, V> mo32927c(Object obj) {
        C8949g<K, V> b = mo32926b(obj);
        if (b != null) {
            mo32925a(b, true);
        }
        return b;
    }

    public void clear() {
        Arrays.fill(this.f25399g, (Object) null);
        this.f25401i = 0;
        this.f25402j++;
        C8949g<K, V> gVar = this.f25400h;
        C8949g<K, V> gVar2 = gVar.f25420i;
        while (gVar2 != gVar) {
            C8949g<K, V> gVar3 = gVar2.f25420i;
            gVar2.f25421j = null;
            gVar2.f25420i = null;
            gVar2 = gVar3;
        }
        gVar.f25421j = gVar;
        gVar.f25420i = gVar;
    }

    public boolean containsKey(Object obj) {
        return mo32926b(obj) != null;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        C8940p<K, V>.C4753d dVar = this.f25404l;
        if (dVar != null) {
            return dVar;
        }
        C8940p<K, V>.C4753d dVar2 = new C8944d();
        this.f25404l = dVar2;
        return dVar2;
    }

    public V get(Object obj) {
        C8949g b = mo32926b(obj);
        if (b != null) {
            return b.f25424m;
        }
        return null;
    }

    public Set<K> keySet() {
        C8940p<K, V>.C4754e eVar = this.f25405m;
        if (eVar != null) {
            return eVar;
        }
        C8940p<K, V>.C4754e eVar2 = new C8946e();
        this.f25405m = eVar2;
        return eVar2;
    }

    public V put(K k, V v) {
        if (k != null) {
            C8949g a = mo32923a(k, true);
            V v2 = a.f25424m;
            a.f25424m = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    public V remove(Object obj) {
        C8949g c = mo32927c(obj);
        if (c != null) {
            return c.f25424m;
        }
        return null;
    }

    public int size() {
        return this.f25401i;
    }

    C8940p(Comparator<? super K> comparator) {
        this.f25401i = 0;
        this.f25402j = 0;
        this.f25398f = comparator == null ? f25397n : comparator;
        this.f25400h = new C8949g<>();
        C8949g<K, V>[] gVarArr = new C8949g[16];
        this.f25399g = gVarArr;
        this.f25403k = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    /* renamed from: b */
    private void m29474b(C8949g<K, V> gVar, boolean z) {
        while (gVar != null) {
            C8949g<K, V> gVar2 = gVar.f25418g;
            C8949g<K, V> gVar3 = gVar.f25419h;
            int i = 0;
            int i2 = gVar2 != null ? gVar2.f25425n : 0;
            int i3 = gVar3 != null ? gVar3.f25425n : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C8949g<K, V> gVar4 = gVar3.f25418g;
                C8949g<K, V> gVar5 = gVar3.f25419h;
                int i5 = gVar5 != null ? gVar5.f25425n : 0;
                if (gVar4 != null) {
                    i = gVar4.f25425n;
                }
                int i6 = i - i5;
                if (i6 == -1 || (i6 == 0 && !z)) {
                    m29469a(gVar);
                } else {
                    m29473b(gVar3);
                    m29469a(gVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                C8949g<K, V> gVar6 = gVar2.f25418g;
                C8949g<K, V> gVar7 = gVar2.f25419h;
                int i7 = gVar7 != null ? gVar7.f25425n : 0;
                if (gVar6 != null) {
                    i = gVar6.f25425n;
                }
                int i8 = i - i7;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    m29473b(gVar);
                } else {
                    m29469a(gVar2);
                    m29473b(gVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                gVar.f25425n = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                gVar.f25425n = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            gVar = gVar.f25417f;
        }
    }

    /* renamed from: com.squareup.moshi.p$c */
    /* compiled from: LinkedHashTreeMap */
    static class C8943c<K, V> {

        /* renamed from: a */
        private C8949g<K, V> f25410a;

        C8943c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo32942a(C8949g<K, V> gVar) {
            C8949g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.f25417f = gVar2;
                gVar2 = gVar;
                gVar = gVar.f25418g;
            }
            this.f25410a = gVar2;
        }

        /* renamed from: a */
        public C8949g<K, V> mo32941a() {
            C8949g<K, V> gVar = this.f25410a;
            if (gVar == null) {
                return null;
            }
            C8949g<K, V> gVar2 = gVar.f25417f;
            gVar.f25417f = null;
            C8949g<K, V> gVar3 = gVar.f25419h;
            while (true) {
                C8949g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                C8949g<K, V> gVar5 = gVar4;
                if (gVar2 != null) {
                    gVar2.f25417f = gVar5;
                    gVar3 = gVar2.f25418g;
                } else {
                    this.f25410a = gVar5;
                    return gVar;
                }
            }
        }
    }

    /* renamed from: com.squareup.moshi.p$g */
    /* compiled from: LinkedHashTreeMap */
    static final class C8949g<K, V> implements Map.Entry<K, V> {

        /* renamed from: f */
        C8949g<K, V> f25417f;

        /* renamed from: g */
        C8949g<K, V> f25418g;

        /* renamed from: h */
        C8949g<K, V> f25419h;

        /* renamed from: i */
        C8949g<K, V> f25420i;

        /* renamed from: j */
        C8949g<K, V> f25421j;

        /* renamed from: k */
        final K f25422k;

        /* renamed from: l */
        final int f25423l;

        /* renamed from: m */
        V f25424m;

        /* renamed from: n */
        int f25425n;

        C8949g() {
            this.f25422k = null;
            this.f25423l = -1;
            this.f25421j = this;
            this.f25420i = this;
        }

        /* renamed from: a */
        public C8949g<K, V> mo32958a() {
            C8949g<K, V> gVar = this;
            for (C8949g<K, V> gVar2 = this.f25418g; gVar2 != null; gVar2 = gVar2.f25418g) {
                gVar = gVar2;
            }
            return gVar;
        }

        /* renamed from: b */
        public C8949g<K, V> mo32959b() {
            C8949g<K, V> gVar = this;
            for (C8949g<K, V> gVar2 = this.f25419h; gVar2 != null; gVar2 = gVar2.f25419h) {
                gVar = gVar2;
            }
            return gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x0032
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f25422k
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x0032
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0032
            L_0x001c:
                V r0 = r3.f25424m
                if (r0 != 0) goto L_0x0027
                java.lang.Object r4 = r4.getValue()
                if (r4 != 0) goto L_0x0032
                goto L_0x0031
            L_0x0027:
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x0032
            L_0x0031:
                r1 = 1
            L_0x0032:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C8940p.C8949g.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.f25422k;
        }

        public V getValue() {
            return this.f25424m;
        }

        public int hashCode() {
            K k = this.f25422k;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f25424m;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            V v2 = this.f25424m;
            this.f25424m = v;
            return v2;
        }

        public String toString() {
            return this.f25422k + "=" + this.f25424m;
        }

        C8949g(C8949g<K, V> gVar, K k, int i, C8949g<K, V> gVar2, C8949g<K, V> gVar3) {
            this.f25417f = gVar;
            this.f25422k = k;
            this.f25423l = i;
            this.f25425n = 1;
            this.f25420i = gVar2;
            this.f25421j = gVar3;
            gVar3.f25420i = this;
            gVar2.f25421j = this;
        }
    }

    /* renamed from: com.squareup.moshi.p$b */
    /* compiled from: LinkedHashTreeMap */
    static final class C8942b<K, V> {

        /* renamed from: a */
        private C8949g<K, V> f25406a;

        /* renamed from: b */
        private int f25407b;

        /* renamed from: c */
        private int f25408c;

        /* renamed from: d */
        private int f25409d;

        C8942b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo32939a(int i) {
            this.f25407b = ((Integer.highestOneBit(i) * 2) - 1) - i;
            this.f25409d = 0;
            this.f25408c = 0;
            this.f25406a = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo32940a(C8949g<K, V> gVar) {
            gVar.f25419h = null;
            gVar.f25417f = null;
            gVar.f25418g = null;
            gVar.f25425n = 1;
            int i = this.f25407b;
            if (i > 0) {
                int i2 = this.f25409d;
                if ((i2 & 1) == 0) {
                    this.f25409d = i2 + 1;
                    this.f25407b = i - 1;
                    this.f25408c++;
                }
            }
            gVar.f25417f = this.f25406a;
            this.f25406a = gVar;
            int i3 = this.f25409d + 1;
            this.f25409d = i3;
            int i4 = this.f25407b;
            if (i4 > 0 && (i3 & 1) == 0) {
                this.f25409d = i3 + 1;
                this.f25407b = i4 - 1;
                this.f25408c++;
            }
            int i5 = 4;
            while (true) {
                int i6 = i5 - 1;
                if ((this.f25409d & i6) == i6) {
                    int i7 = this.f25408c;
                    if (i7 == 0) {
                        C8949g<K, V> gVar2 = this.f25406a;
                        C8949g<K, V> gVar3 = gVar2.f25417f;
                        C8949g<K, V> gVar4 = gVar3.f25417f;
                        gVar3.f25417f = gVar4.f25417f;
                        this.f25406a = gVar3;
                        gVar3.f25418g = gVar4;
                        gVar3.f25419h = gVar2;
                        gVar3.f25425n = gVar2.f25425n + 1;
                        gVar4.f25417f = gVar3;
                        gVar2.f25417f = gVar3;
                    } else if (i7 == 1) {
                        C8949g<K, V> gVar5 = this.f25406a;
                        C8949g<K, V> gVar6 = gVar5.f25417f;
                        this.f25406a = gVar6;
                        gVar6.f25419h = gVar5;
                        gVar6.f25425n = gVar5.f25425n + 1;
                        gVar5.f25417f = gVar6;
                        this.f25408c = 0;
                    } else if (i7 == 2) {
                        this.f25408c = 0;
                    }
                    i5 *= 2;
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C8949g<K, V> mo32938a() {
            C8949g<K, V> gVar = this.f25406a;
            if (gVar.f25417f == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: b */
    private void m29473b(C8949g<K, V> gVar) {
        C8949g<K, V> gVar2 = gVar.f25418g;
        C8949g<K, V> gVar3 = gVar.f25419h;
        C8949g<K, V> gVar4 = gVar2.f25418g;
        C8949g<K, V> gVar5 = gVar2.f25419h;
        gVar.f25418g = gVar5;
        if (gVar5 != null) {
            gVar5.f25417f = gVar;
        }
        m29470a(gVar, gVar2);
        gVar2.f25419h = gVar;
        gVar.f25417f = gVar2;
        int i = 0;
        int max = Math.max(gVar3 != null ? gVar3.f25425n : 0, gVar5 != null ? gVar5.f25425n : 0) + 1;
        gVar.f25425n = max;
        if (gVar4 != null) {
            i = gVar4.f25425n;
        }
        gVar2.f25425n = Math.max(max, i) + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C8949g<K, V> mo32924a(Map.Entry<?, ?> entry) {
        C8949g<K, V> b = mo32926b((Object) entry.getKey());
        if (b != null && m29471a((Object) b.f25424m, (Object) entry.getValue())) {
            return b;
        }
        return null;
    }

    /* renamed from: a */
    private boolean m29471a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32925a(C8949g<K, V> gVar, boolean z) {
        int i;
        if (z) {
            C8949g<K, V> gVar2 = gVar.f25421j;
            gVar2.f25420i = gVar.f25420i;
            gVar.f25420i.f25421j = gVar2;
            gVar.f25421j = null;
            gVar.f25420i = null;
        }
        C8949g<K, V> gVar3 = gVar.f25418g;
        C8949g<K, V> gVar4 = gVar.f25419h;
        C8949g<K, V> gVar5 = gVar.f25417f;
        int i2 = 0;
        if (gVar3 == null || gVar4 == null) {
            if (gVar3 != null) {
                m29470a(gVar, gVar3);
                gVar.f25418g = null;
            } else if (gVar4 != null) {
                m29470a(gVar, gVar4);
                gVar.f25419h = null;
            } else {
                m29470a(gVar, (C8949g<K, V>) null);
            }
            m29474b(gVar5, false);
            this.f25401i--;
            this.f25402j++;
            return;
        }
        C8949g<K, V> b = gVar3.f25425n > gVar4.f25425n ? gVar3.mo32959b() : gVar4.mo32958a();
        mo32925a(b, false);
        C8949g<K, V> gVar6 = gVar.f25418g;
        if (gVar6 != null) {
            i = gVar6.f25425n;
            b.f25418g = gVar6;
            gVar6.f25417f = b;
            gVar.f25418g = null;
        } else {
            i = 0;
        }
        C8949g<K, V> gVar7 = gVar.f25419h;
        if (gVar7 != null) {
            i2 = gVar7.f25425n;
            b.f25419h = gVar7;
            gVar7.f25417f = b;
            gVar.f25419h = null;
        }
        b.f25425n = Math.max(i, i2) + 1;
        m29470a(gVar, b);
    }

    /* renamed from: a */
    private void m29470a(C8949g<K, V> gVar, C8949g<K, V> gVar2) {
        C8949g<K, V> gVar3 = gVar.f25417f;
        gVar.f25417f = null;
        if (gVar2 != null) {
            gVar2.f25417f = gVar3;
        }
        if (gVar3 == null) {
            int i = gVar.f25423l;
            C8949g<K, V>[] gVarArr = this.f25399g;
            gVarArr[i & (gVarArr.length - 1)] = gVar2;
        } else if (gVar3.f25418g == gVar) {
            gVar3.f25418g = gVar2;
        } else {
            gVar3.f25419h = gVar2;
        }
    }

    /* renamed from: a */
    private void m29469a(C8949g<K, V> gVar) {
        C8949g<K, V> gVar2 = gVar.f25418g;
        C8949g<K, V> gVar3 = gVar.f25419h;
        C8949g<K, V> gVar4 = gVar3.f25418g;
        C8949g<K, V> gVar5 = gVar3.f25419h;
        gVar.f25419h = gVar4;
        if (gVar4 != null) {
            gVar4.f25417f = gVar;
        }
        m29470a(gVar, gVar3);
        gVar3.f25418g = gVar;
        gVar.f25417f = gVar3;
        int i = 0;
        int max = Math.max(gVar2 != null ? gVar2.f25425n : 0, gVar4 != null ? gVar4.f25425n : 0) + 1;
        gVar.f25425n = max;
        if (gVar5 != null) {
            i = gVar5.f25425n;
        }
        gVar3.f25425n = Math.max(max, i) + 1;
    }

    /* renamed from: a */
    private void m29468a() {
        C8949g<K, V>[] a = m29472a(this.f25399g);
        this.f25399g = a;
        this.f25403k = (a.length / 2) + (a.length / 4);
    }

    /* renamed from: a */
    static <K, V> C8949g<K, V>[] m29472a(C8949g<K, V>[] gVarArr) {
        int length = gVarArr.length;
        C8949g<K, V>[] gVarArr2 = new C8949g[(length * 2)];
        C8943c cVar = new C8943c();
        C8942b bVar = new C8942b();
        C8942b bVar2 = new C8942b();
        for (int i = 0; i < length; i++) {
            C8949g<K, V> gVar = gVarArr[i];
            if (gVar != null) {
                cVar.mo32942a(gVar);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    C8949g a = cVar.mo32941a();
                    if (a == null) {
                        break;
                    } else if ((a.f25423l & length) == 0) {
                        i2++;
                    } else {
                        i3++;
                    }
                }
                bVar.mo32939a(i2);
                bVar2.mo32939a(i3);
                cVar.mo32942a(gVar);
                while (true) {
                    C8949g a2 = cVar.mo32941a();
                    if (a2 == null) {
                        break;
                    } else if ((a2.f25423l & length) == 0) {
                        bVar.mo32940a(a2);
                    } else {
                        bVar2.mo32940a(a2);
                    }
                }
                C8949g<K, V> gVar2 = null;
                gVarArr2[i] = i2 > 0 ? bVar.mo32938a() : null;
                int i4 = i + length;
                if (i3 > 0) {
                    gVar2 = bVar2.mo32938a();
                }
                gVarArr2[i4] = gVar2;
            }
        }
        return gVarArr2;
    }
}
