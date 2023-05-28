package p050l.p066e;

/* renamed from: l.e.d */
/* compiled from: LongSparseArray */
public class C4873d<E> implements Cloneable {

    /* renamed from: j */
    private static final Object f8352j = new Object();

    /* renamed from: f */
    private boolean f8353f;

    /* renamed from: g */
    private long[] f8354g;

    /* renamed from: h */
    private Object[] f8355h;

    /* renamed from: i */
    private int f8356i;

    public C4873d() {
        this(10);
    }

    /* renamed from: e */
    private void m8192e() {
        int i = this.f8356i;
        long[] jArr = this.f8354g;
        Object[] objArr = this.f8355h;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f8352j) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f8353f = false;
        this.f8356i = i2;
    }

    /* renamed from: a */
    public E mo16936a(long j) {
        return mo16939b(j, (Object) null);
    }

    /* renamed from: b */
    public E mo16939b(long j, E e) {
        int a = C4872c.m8188a(this.f8354g, this.f8356i, j);
        if (a >= 0) {
            E[] eArr = this.f8355h;
            if (eArr[a] != f8352j) {
                return eArr[a];
            }
        }
        return e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.f8355h;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16944c(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.f8354g
            int r1 = r2.f8356i
            int r3 = p050l.p066e.C4872c.m8188a((long[]) r0, (int) r1, (long) r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.f8355h
            r0 = r4[r3]
            java.lang.Object r1 = f8352j
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.f8353f = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p050l.p066e.C4873d.mo16944c(long):void");
    }

    public String toString() {
        if (mo16942c() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8356i * 28);
        sb.append('{');
        for (int i = 0; i < this.f8356i; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo16935a(i));
            sb.append('=');
            Object c = mo16943c(i);
            if (c != this) {
                sb.append(c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C4873d(int i) {
        this.f8353f = false;
        if (i == 0) {
            this.f8354g = C4872c.f8350b;
            this.f8355h = C4872c.f8351c;
            return;
        }
        int c = C4872c.m8191c(i);
        this.f8354g = new long[c];
        this.f8355h = new Object[c];
    }

    /* renamed from: a */
    public long mo16935a(int i) {
        if (this.f8353f) {
            m8192e();
        }
        return this.f8354g[i];
    }

    public C4873d<E> clone() {
        try {
            C4873d<E> dVar = (C4873d) super.clone();
            dVar.f8354g = (long[]) this.f8354g.clone();
            dVar.f8355h = (Object[]) this.f8355h.clone();
            return dVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public void mo16941b(int i) {
        Object[] objArr = this.f8355h;
        Object obj = objArr[i];
        Object obj2 = f8352j;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f8353f = true;
        }
    }

    /* renamed from: a */
    public void mo16937a(long j, E e) {
        int i = this.f8356i;
        if (i == 0 || j > this.f8354g[i - 1]) {
            if (this.f8353f && this.f8356i >= this.f8354g.length) {
                m8192e();
            }
            int i2 = this.f8356i;
            if (i2 >= this.f8354g.length) {
                int c = C4872c.m8191c(i2 + 1);
                long[] jArr = new long[c];
                Object[] objArr = new Object[c];
                long[] jArr2 = this.f8354g;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f8355h;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f8354g = jArr;
                this.f8355h = objArr;
            }
            this.f8354g[i2] = j;
            this.f8355h[i2] = e;
            this.f8356i = i2 + 1;
            return;
        }
        mo16945c(j, e);
    }

    /* renamed from: c */
    public void mo16945c(long j, E e) {
        int a = C4872c.m8188a(this.f8354g, this.f8356i, j);
        if (a >= 0) {
            this.f8355h[a] = e;
            return;
        }
        int i = a ^ -1;
        if (i < this.f8356i) {
            Object[] objArr = this.f8355h;
            if (objArr[i] == f8352j) {
                this.f8354g[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f8353f && this.f8356i >= this.f8354g.length) {
            m8192e();
            i = C4872c.m8188a(this.f8354g, this.f8356i, j) ^ -1;
        }
        int i2 = this.f8356i;
        if (i2 >= this.f8354g.length) {
            int c = C4872c.m8191c(i2 + 1);
            long[] jArr = new long[c];
            Object[] objArr2 = new Object[c];
            long[] jArr2 = this.f8354g;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f8355h;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f8354g = jArr;
            this.f8355h = objArr2;
        }
        int i3 = this.f8356i;
        if (i3 - i != 0) {
            long[] jArr3 = this.f8354g;
            int i4 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
            Object[] objArr4 = this.f8355h;
            System.arraycopy(objArr4, i, objArr4, i4, this.f8356i - i);
        }
        this.f8354g[i] = j;
        this.f8355h[i] = e;
        this.f8356i++;
    }

    /* renamed from: b */
    public int mo16938b(long j) {
        if (this.f8353f) {
            m8192e();
        }
        return C4872c.m8188a(this.f8354g, this.f8356i, j);
    }

    /* renamed from: b */
    public void mo16940b() {
        int i = this.f8356i;
        Object[] objArr = this.f8355h;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f8356i = 0;
        this.f8353f = false;
    }

    /* renamed from: c */
    public int mo16942c() {
        if (this.f8353f) {
            m8192e();
        }
        return this.f8356i;
    }

    /* renamed from: c */
    public E mo16943c(int i) {
        if (this.f8353f) {
            m8192e();
        }
        return this.f8355h[i];
    }
}
