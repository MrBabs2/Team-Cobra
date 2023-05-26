package p050l.p066e;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: l.e.g */
/* compiled from: SimpleArrayMap */
public class C4881g<K, V> {

    /* renamed from: i */
    static Object[] f8380i;

    /* renamed from: j */
    static int f8381j;

    /* renamed from: k */
    static Object[] f8382k;

    /* renamed from: l */
    static int f8383l;

    /* renamed from: f */
    int[] f8384f;

    /* renamed from: g */
    Object[] f8385g;

    /* renamed from: h */
    int f8386h;

    public C4881g() {
        this.f8384f = C4872c.f8349a;
        this.f8385g = C4872c.f8351c;
        this.f8386h = 0;
    }

    /* renamed from: a */
    private static int m8230a(int[] iArr, int i, int i2) {
        try {
            return C4872c.m8187a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: e */
    private void m8232e(int i) {
        Class<C4881g> cls = C4881g.class;
        if (i == 8) {
            synchronized (cls) {
                if (f8382k != null) {
                    Object[] objArr = f8382k;
                    this.f8385g = objArr;
                    f8382k = (Object[]) objArr[0];
                    this.f8384f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f8383l--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                if (f8380i != null) {
                    Object[] objArr2 = f8380i;
                    this.f8385g = objArr2;
                    f8380i = (Object[]) objArr2[0];
                    this.f8384f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f8381j--;
                    return;
                }
            }
        }
        this.f8384f = new int[i];
        this.f8385g = new Object[(i << 1)];
    }

    /* renamed from: b */
    public int mo17021b(Object obj) {
        return obj == null ? mo17016a() : mo17017a(obj, obj.hashCode());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo17023c(Object obj) {
        int i = this.f8386h * 2;
        Object[] objArr = this.f8385g;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public void clear() {
        int i = this.f8386h;
        if (i > 0) {
            int[] iArr = this.f8384f;
            Object[] objArr = this.f8385g;
            this.f8384f = C4872c.f8349a;
            this.f8385g = C4872c.f8351c;
            this.f8386h = 0;
            m8231a(iArr, objArr, i);
        }
        if (this.f8386h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return mo17021b(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return mo17023c(obj) >= 0;
    }

    /* renamed from: d */
    public V mo17028d(int i) {
        return this.f8385g[(i << 1) + 1];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4881g) {
            C4881g gVar = (C4881g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f8386h) {
                try {
                    Object b = mo17022b(i);
                    Object d = mo17028d(i);
                    Object obj2 = gVar.get(b);
                    if (d == null) {
                        if (obj2 != null || !gVar.containsKey(b)) {
                            return false;
                        }
                    } else if (!d.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f8386h) {
                try {
                    Object b2 = mo17022b(i2);
                    Object d2 = mo17028d(i2);
                    Object obj3 = map.get(b2);
                    if (d2 == null) {
                        if (obj3 != null || !map.containsKey(b2)) {
                            return false;
                        }
                    } else if (!d2.equals(obj3)) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public V getOrDefault(Object obj, V v) {
        int b = mo17021b(obj);
        return b >= 0 ? this.f8385g[(b << 1) + 1] : v;
    }

    public int hashCode() {
        int[] iArr = this.f8384f;
        Object[] objArr = this.f8385g;
        int i = this.f8386h;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public boolean isEmpty() {
        return this.f8386h <= 0;
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f8386h;
        if (k == null) {
            i2 = mo17016a();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = mo17017a((Object) k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.f8385g;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = i2 ^ -1;
        if (i3 >= this.f8384f.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.f8384f;
            Object[] objArr = this.f8385g;
            m8232e(i6);
            if (i3 == this.f8386h) {
                int[] iArr2 = this.f8384f;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f8385g, 0, objArr.length);
                }
                m8231a(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f8384f;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr2 = this.f8385g;
            System.arraycopy(objArr2, i5 << 1, objArr2, i7 << 1, (this.f8386h - i5) << 1);
        }
        int i8 = this.f8386h;
        if (i3 == i8) {
            int[] iArr4 = this.f8384f;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr3 = this.f8385g;
                int i9 = i5 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.f8386h = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public V remove(Object obj) {
        int b = mo17021b(obj);
        if (b >= 0) {
            return mo17024c(b);
        }
        return null;
    }

    public V replace(K k, V v) {
        int b = mo17021b((Object) k);
        if (b >= 0) {
            return mo17018a(b, v);
        }
        return null;
    }

    public int size() {
        return this.f8386h;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8386h * 28);
        sb.append('{');
        for (int i = 0; i < this.f8386h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object b = mo17022b(i);
            if (b != this) {
                sb.append(b);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object d = mo17028d(i);
            if (d != this) {
                sb.append(d);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: b */
    public K mo17022b(int i) {
        return this.f8385g[i << 1];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo17017a(Object obj, int i) {
        int i2 = this.f8386h;
        if (i2 == 0) {
            return -1;
        }
        int a = m8230a(this.f8384f, i2, i);
        if (a < 0 || obj.equals(this.f8385g[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f8384f[i3] == i) {
            if (obj.equals(this.f8385g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f8384f[i4] == i) {
            if (obj.equals(this.f8385g[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    public boolean remove(Object obj, Object obj2) {
        int b = mo17021b(obj);
        if (b < 0) {
            return false;
        }
        Object d = mo17028d(b);
        if (obj2 != d && (obj2 == null || !obj2.equals(d))) {
            return false;
        }
        mo17024c(b);
        return true;
    }

    public boolean replace(K k, V v, V v2) {
        int b = mo17021b((Object) k);
        if (b < 0) {
            return false;
        }
        V d = mo17028d(b);
        if (d != v && (v == null || !v.equals(d))) {
            return false;
        }
        mo17018a(b, v2);
        return true;
    }

    public C4881g(int i) {
        if (i == 0) {
            this.f8384f = C4872c.f8349a;
            this.f8385g = C4872c.f8351c;
        } else {
            m8232e(i);
        }
        this.f8386h = 0;
    }

    /* renamed from: c */
    public V mo17024c(int i) {
        V[] vArr = this.f8385g;
        int i2 = i << 1;
        V v = vArr[i2 + 1];
        int i3 = this.f8386h;
        int i4 = 0;
        if (i3 <= 1) {
            m8231a(this.f8384f, (Object[]) vArr, i3);
            this.f8384f = C4872c.f8349a;
            this.f8385g = C4872c.f8351c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f8384f;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int[] iArr2 = this.f8384f;
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr2, i7, iArr2, i, i8);
                    Object[] objArr = this.f8385g;
                    System.arraycopy(objArr, i7 << 1, objArr, i2, i8 << 1);
                }
                Object[] objArr2 = this.f8385g;
                int i9 = i5 << 1;
                objArr2[i9] = null;
                objArr2[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                int[] iArr3 = this.f8384f;
                Object[] objArr3 = this.f8385g;
                m8232e(i6);
                if (i3 == this.f8386h) {
                    if (i > 0) {
                        System.arraycopy(iArr3, 0, this.f8384f, 0, i);
                        System.arraycopy(objArr3, 0, this.f8385g, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr3, i10, this.f8384f, i, i11);
                        System.arraycopy(objArr3, i10 << 1, this.f8385g, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.f8386h) {
            this.f8386h = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public C4881g(C4881g<K, V> gVar) {
        this();
        if (gVar != null) {
            mo17020a(gVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo17016a() {
        int i = this.f8386h;
        if (i == 0) {
            return -1;
        }
        int a = m8230a(this.f8384f, i, 0);
        if (a < 0 || this.f8385g[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f8384f[i2] == 0) {
            if (this.f8385g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f8384f[i3] == 0) {
            if (this.f8385g[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    /* renamed from: a */
    private static void m8231a(int[] iArr, Object[] objArr, int i) {
        Class<C4881g> cls = C4881g.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f8383l < 10) {
                    objArr[0] = f8382k;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f8382k = objArr;
                    f8383l++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f8381j < 10) {
                    objArr[0] = f8380i;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f8380i = objArr;
                    f8381j++;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo17019a(int i) {
        int i2 = this.f8386h;
        int[] iArr = this.f8384f;
        if (iArr.length < i) {
            Object[] objArr = this.f8385g;
            m8232e(i);
            if (this.f8386h > 0) {
                System.arraycopy(iArr, 0, this.f8384f, 0, i2);
                System.arraycopy(objArr, 0, this.f8385g, 0, i2 << 1);
            }
            m8231a(iArr, objArr, i2);
        }
        if (this.f8386h != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    public V mo17018a(int i, V v) {
        int i2 = (i << 1) + 1;
        V[] vArr = this.f8385g;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    /* renamed from: a */
    public void mo17020a(C4881g<? extends K, ? extends V> gVar) {
        int i = gVar.f8386h;
        mo17019a(this.f8386h + i);
        if (this.f8386h != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(gVar.mo17022b(i2), gVar.mo17028d(i2));
            }
        } else if (i > 0) {
            System.arraycopy(gVar.f8384f, 0, this.f8384f, 0, i);
            System.arraycopy(gVar.f8385g, 0, this.f8385g, 0, i << 1);
            this.f8386h = i;
        }
    }
}
