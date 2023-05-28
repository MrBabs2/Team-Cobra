package p120q.p326a.p329d0.p345j;

/* renamed from: q.a.d0.j.o */
/* compiled from: OpenHashSet */
public final class C11443o<T> {

    /* renamed from: a */
    final float f30628a;

    /* renamed from: b */
    int f30629b;

    /* renamed from: c */
    int f30630c;

    /* renamed from: d */
    int f30631d;

    /* renamed from: e */
    T[] f30632e;

    public C11443o() {
        this(16, 0.75f);
    }

    /* renamed from: a */
    static int m37489a(int i) {
        int i2 = i * -1640531527;
        return i2 ^ (i2 >>> 16);
    }

    /* renamed from: a */
    public boolean mo37179a(T t) {
        T t2;
        T[] tArr = this.f30632e;
        int i = this.f30629b;
        int a = m37489a(t.hashCode()) & i;
        T t3 = tArr[a];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                a = (a + 1) & i;
                t2 = tArr[a];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[a] = t;
        int i2 = this.f30630c + 1;
        this.f30630c = i2;
        if (i2 >= this.f30631d) {
            mo37181b();
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo37182b(T t) {
        T t2;
        T[] tArr = this.f30632e;
        int i = this.f30629b;
        int a = m37489a(t.hashCode()) & i;
        T t3 = tArr[a];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return mo37178a(a, tArr, i);
        }
        do {
            a = (a + 1) & i;
            t2 = tArr[a];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return mo37178a(a, tArr, i);
    }

    /* renamed from: c */
    public int mo37183c() {
        return this.f30630c;
    }

    public C11443o(int i, float f) {
        this.f30628a = f;
        int a = C11444p.m37496a(i);
        this.f30629b = a - 1;
        this.f30631d = (int) (f * ((float) a));
        this.f30632e = new Object[a];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo37181b() {
        T[] tArr = this.f30632e;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = new Object[i];
        int i3 = this.f30630c;
        while (true) {
            int i4 = i3 - 1;
            if (i3 != 0) {
                do {
                    length--;
                } while (tArr[length] == null);
                int a = m37489a(tArr[length].hashCode()) & i2;
                if (tArr2[a] != null) {
                    do {
                        a = (a + 1) & i2;
                    } while (tArr2[a] != null);
                }
                tArr2[a] = tArr[length];
                i3 = i4;
            } else {
                this.f30629b = i2;
                this.f30631d = (int) (((float) i) * this.f30628a);
                this.f30632e = tArr2;
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo37178a(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.f30630c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int a = m37489a(t.hashCode()) & i2;
                if (i <= i3) {
                    if (i >= a || a > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else {
                    if (i >= a && a > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }

    /* renamed from: a */
    public Object[] mo37180a() {
        return this.f30632e;
    }
}
