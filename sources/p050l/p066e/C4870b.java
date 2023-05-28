package p050l.p066e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: l.e.b */
/* compiled from: ArraySet */
public final class C4870b<E> implements Collection<E>, Set<E> {

    /* renamed from: j */
    private static final int[] f8338j = new int[0];

    /* renamed from: k */
    private static final Object[] f8339k = new Object[0];

    /* renamed from: l */
    private static Object[] f8340l;

    /* renamed from: m */
    private static int f8341m;

    /* renamed from: n */
    private static Object[] f8342n;

    /* renamed from: o */
    private static int f8343o;

    /* renamed from: f */
    private int[] f8344f;

    /* renamed from: g */
    Object[] f8345g;

    /* renamed from: h */
    int f8346h;

    /* renamed from: i */
    private C4875f<E, E> f8347i;

    /* renamed from: l.e.b$a */
    /* compiled from: ArraySet */
    class C4871a extends C4875f<E, E> {
        C4871a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Object mo16907a(int i, int i2) {
            return C4870b.this.f8345g[i];
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public int mo16912b(Object obj) {
            return C4870b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo16914c() {
            return C4870b.this.f8346h;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo16906a(Object obj) {
            return C4870b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Map<E, E> mo16913b() {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo16911a(E e, E e2) {
            C4870b.this.add(e);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public E mo16908a(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo16910a(int i) {
            C4870b.this.mo16923i(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo16909a() {
            C4870b.this.clear();
        }
    }

    public C4870b() {
        this(0);
    }

    /* renamed from: a */
    private int m8169a(Object obj, int i) {
        int i2 = this.f8346h;
        if (i2 == 0) {
            return -1;
        }
        int a = C4872c.m8187a(this.f8344f, i2, i);
        if (a < 0 || obj.equals(this.f8345g[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f8344f[i3] == i) {
            if (obj.equals(this.f8345g[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f8344f[i4] == i) {
            if (obj.equals(this.f8345g[i4])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    /* renamed from: b */
    private int m8172b() {
        int i = this.f8346h;
        if (i == 0) {
            return -1;
        }
        int a = C4872c.m8187a(this.f8344f, i, 0);
        if (a < 0 || this.f8345g[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f8344f[i2] == 0) {
            if (this.f8345g[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f8344f[i3] == 0) {
            if (this.f8345g[i3] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    /* renamed from: k */
    private void m8173k(int i) {
        if (i == 8) {
            synchronized (C4870b.class) {
                if (f8342n != null) {
                    Object[] objArr = f8342n;
                    this.f8345g = objArr;
                    f8342n = (Object[]) objArr[0];
                    this.f8344f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f8343o--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C4870b.class) {
                if (f8340l != null) {
                    Object[] objArr2 = f8340l;
                    this.f8345g = objArr2;
                    f8340l = (Object[]) objArr2[0];
                    this.f8344f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f8341m--;
                    return;
                }
            }
        }
        this.f8344f = new int[i];
        this.f8345g = new Object[i];
    }

    public boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = m8172b();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = m8169a(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = i2 ^ -1;
        int i4 = this.f8346h;
        if (i4 >= this.f8344f.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            int[] iArr = this.f8344f;
            Object[] objArr = this.f8345g;
            m8173k(i5);
            int[] iArr2 = this.f8344f;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f8345g, 0, objArr.length);
            }
            m8171a(iArr, objArr, this.f8346h);
        }
        int i6 = this.f8346h;
        if (i3 < i6) {
            int[] iArr3 = this.f8344f;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f8345g;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f8346h - i3);
        }
        this.f8344f[i3] = i;
        this.f8345g[i3] = e;
        this.f8346h++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo16921h(this.f8346h + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public void clear() {
        int i = this.f8346h;
        if (i != 0) {
            m8171a(this.f8344f, this.f8345g, i);
            this.f8344f = f8338j;
            this.f8345g = f8339k;
            this.f8346h = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f8346h) {
                try {
                    if (!set.contains(mo16927j(i))) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public void mo16921h(int i) {
        int[] iArr = this.f8344f;
        if (iArr.length < i) {
            Object[] objArr = this.f8345g;
            m8173k(i);
            int i2 = this.f8346h;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f8344f, 0, i2);
                System.arraycopy(objArr, 0, this.f8345g, 0, this.f8346h);
            }
            m8171a(iArr, objArr, this.f8346h);
        }
    }

    public int hashCode() {
        int[] iArr = this.f8344f;
        int i = this.f8346h;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    /* renamed from: i */
    public E mo16923i(int i) {
        E[] eArr = this.f8345g;
        E e = eArr[i];
        int i2 = this.f8346h;
        if (i2 <= 1) {
            m8171a(this.f8344f, eArr, i2);
            this.f8344f = f8338j;
            this.f8345g = f8339k;
            this.f8346h = 0;
        } else {
            int[] iArr = this.f8344f;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i4 = this.f8346h - 1;
                this.f8346h = i4;
                if (i < i4) {
                    int[] iArr2 = this.f8344f;
                    int i5 = i + 1;
                    System.arraycopy(iArr2, i5, iArr2, i, i4 - i);
                    Object[] objArr = this.f8345g;
                    System.arraycopy(objArr, i5, objArr, i, this.f8346h - i);
                }
                this.f8345g[this.f8346h] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                int[] iArr3 = this.f8344f;
                Object[] objArr2 = this.f8345g;
                m8173k(i3);
                this.f8346h--;
                if (i > 0) {
                    System.arraycopy(iArr3, 0, this.f8344f, 0, i);
                    System.arraycopy(objArr2, 0, this.f8345g, 0, i);
                }
                int i6 = this.f8346h;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr3, i7, this.f8344f, i, i6 - i);
                    System.arraycopy(objArr2, i7, this.f8345g, i, this.f8346h - i);
                }
            }
        }
        return e;
    }

    public int indexOf(Object obj) {
        return obj == null ? m8172b() : m8169a(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f8346h <= 0;
    }

    public Iterator<E> iterator() {
        return m8170a().mo16958e().iterator();
    }

    /* renamed from: j */
    public E mo16927j(int i) {
        return this.f8345g[i];
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        mo16923i(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f8346h - 1; i >= 0; i--) {
            if (!collection.contains(this.f8345g[i])) {
                mo16923i(i);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f8346h;
    }

    public Object[] toArray() {
        int i = this.f8346h;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f8345g, 0, objArr, 0, i);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8346h * 14);
        sb.append('{');
        for (int i = 0; i < this.f8346h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object j = mo16927j(i);
            if (j != this) {
                sb.append(j);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C4870b(int i) {
        if (i == 0) {
            this.f8344f = f8338j;
            this.f8345g = f8339k;
        } else {
            m8173k(i);
        }
        this.f8346h = 0;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f8346h) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f8346h);
        }
        System.arraycopy(this.f8345g, 0, tArr, 0, this.f8346h);
        int length = tArr.length;
        int i = this.f8346h;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    /* renamed from: a */
    private static void m8171a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C4870b.class) {
                if (f8343o < 10) {
                    objArr[0] = f8342n;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f8342n = objArr;
                    f8343o++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C4870b.class) {
                if (f8341m < 10) {
                    objArr[0] = f8340l;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f8340l = objArr;
                    f8341m++;
                }
            }
        }
    }

    /* renamed from: a */
    private C4875f<E, E> m8170a() {
        if (this.f8347i == null) {
            this.f8347i = new C4871a();
        }
        return this.f8347i;
    }
}
