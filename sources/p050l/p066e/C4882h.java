package p050l.p066e;

/* renamed from: l.e.h */
/* compiled from: SparseArrayCompat */
public class C4882h<E> implements Cloneable {

    /* renamed from: j */
    private static final Object f8387j = new Object();

    /* renamed from: f */
    private boolean f8388f;

    /* renamed from: g */
    private int[] f8389g;

    /* renamed from: h */
    private Object[] f8390h;

    /* renamed from: i */
    private int f8391i;

    public C4882h() {
        this(10);
    }

    /* renamed from: e */
    private void m8243e() {
        int i = this.f8391i;
        int[] iArr = this.f8389g;
        Object[] objArr = this.f8390h;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f8387j) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f8388f = false;
        this.f8391i = i2;
    }

    /* renamed from: a */
    public E mo17043a(int i) {
        return mo17046b(i, (Object) null);
    }

    /* renamed from: b */
    public E mo17046b(int i, E e) {
        int a = C4872c.m8187a(this.f8389g, this.f8391i, i);
        if (a >= 0) {
            E[] eArr = this.f8390h;
            if (eArr[a] != f8387j) {
                return eArr[a];
            }
        }
        return e;
    }

    /* renamed from: c */
    public void mo17050c(int i, E e) {
        int a = C4872c.m8187a(this.f8389g, this.f8391i, i);
        if (a >= 0) {
            this.f8390h[a] = e;
            return;
        }
        int i2 = a ^ -1;
        if (i2 < this.f8391i) {
            Object[] objArr = this.f8390h;
            if (objArr[i2] == f8387j) {
                this.f8389g[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f8388f && this.f8391i >= this.f8389g.length) {
            m8243e();
            i2 = C4872c.m8187a(this.f8389g, this.f8391i, i) ^ -1;
        }
        int i3 = this.f8391i;
        if (i3 >= this.f8389g.length) {
            int b = C4872c.m8190b(i3 + 1);
            int[] iArr = new int[b];
            Object[] objArr2 = new Object[b];
            int[] iArr2 = this.f8389g;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f8390h;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f8389g = iArr;
            this.f8390h = objArr2;
        }
        int i4 = this.f8391i;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.f8389g;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            Object[] objArr4 = this.f8390h;
            System.arraycopy(objArr4, i2, objArr4, i5, this.f8391i - i2);
        }
        this.f8389g[i2] = i;
        this.f8390h[i2] = e;
        this.f8391i++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.f8390h;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo17052d(int r4) {
        /*
            r3 = this;
            int[] r0 = r3.f8389g
            int r1 = r3.f8391i
            int r4 = p050l.p066e.C4872c.m8187a((int[]) r0, (int) r1, (int) r4)
            if (r4 < 0) goto L_0x0017
            java.lang.Object[] r0 = r3.f8390h
            r1 = r0[r4]
            java.lang.Object r2 = f8387j
            if (r1 == r2) goto L_0x0017
            r0[r4] = r2
            r4 = 1
            r3.f8388f = r4
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p050l.p066e.C4882h.mo17052d(int):void");
    }

    public String toString() {
        if (mo17048c() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8391i * 28);
        sb.append('{');
        for (int i = 0; i < this.f8391i; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo17049c(i));
            sb.append('=');
            Object e = mo17053e(i);
            if (e != this) {
                sb.append(e);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C4882h(int i) {
        this.f8388f = false;
        if (i == 0) {
            this.f8389g = C4872c.f8349a;
            this.f8390h = C4872c.f8351c;
            return;
        }
        int b = C4872c.m8190b(i);
        this.f8389g = new int[b];
        this.f8390h = new Object[b];
    }

    /* renamed from: a */
    public int mo17042a(E e) {
        if (this.f8388f) {
            m8243e();
        }
        for (int i = 0; i < this.f8391i; i++) {
            if (this.f8390h[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public C4882h<E> clone() {
        try {
            C4882h<E> hVar = (C4882h) super.clone();
            hVar.f8389g = (int[]) this.f8389g.clone();
            hVar.f8390h = (Object[]) this.f8390h.clone();
            return hVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public int mo17045b(int i) {
        if (this.f8388f) {
            m8243e();
        }
        return C4872c.m8187a(this.f8389g, this.f8391i, i);
    }

    /* renamed from: a */
    public void mo17044a(int i, E e) {
        int i2 = this.f8391i;
        if (i2 == 0 || i > this.f8389g[i2 - 1]) {
            if (this.f8388f && this.f8391i >= this.f8389g.length) {
                m8243e();
            }
            int i3 = this.f8391i;
            if (i3 >= this.f8389g.length) {
                int b = C4872c.m8190b(i3 + 1);
                int[] iArr = new int[b];
                Object[] objArr = new Object[b];
                int[] iArr2 = this.f8389g;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f8390h;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f8389g = iArr;
                this.f8390h = objArr;
            }
            this.f8389g[i3] = i;
            this.f8390h[i3] = e;
            this.f8391i = i3 + 1;
            return;
        }
        mo17050c(i, e);
    }

    /* renamed from: b */
    public void mo17047b() {
        int i = this.f8391i;
        Object[] objArr = this.f8390h;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f8391i = 0;
        this.f8388f = false;
    }

    /* renamed from: e */
    public E mo17053e(int i) {
        if (this.f8388f) {
            m8243e();
        }
        return this.f8390h[i];
    }

    /* renamed from: c */
    public int mo17048c() {
        if (this.f8388f) {
            m8243e();
        }
        return this.f8391i;
    }

    /* renamed from: c */
    public int mo17049c(int i) {
        if (this.f8388f) {
            m8243e();
        }
        return this.f8389g[i];
    }
}
