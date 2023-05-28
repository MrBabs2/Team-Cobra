package kotlinx.coroutines.p393g2;

import java.lang.Comparable;
import java.util.Arrays;
import kotlin.jvm.internal.C10202j;
import kotlinx.coroutines.C12248i0;
import kotlinx.coroutines.p393g2.C12240u;

/* renamed from: kotlinx.coroutines.g2.t */
/* compiled from: ThreadSafeHeap.kt */
public class C12239t<T extends C12240u & Comparable<? super T>> {
    private volatile int _size = 0;

    /* renamed from: a */
    private T[] f32015a;

    /* renamed from: d */
    private final void m40342d(int i) {
        while (i > 0) {
            T[] tArr = this.f32015a;
            if (tArr != null) {
                int i2 = (i - 1) / 2;
                T t = tArr[i2];
                if (t != null) {
                    Comparable comparable = (Comparable) t;
                    T t2 = tArr[i];
                    if (t2 == null) {
                        C10202j.m34172a();
                        throw null;
                    } else if (comparable.compareTo(t2) > 0) {
                        m40339a(i, i2);
                        i = i2;
                    } else {
                        return;
                    }
                } else {
                    C10202j.m34172a();
                    throw null;
                }
            } else {
                C10202j.m34172a();
                throw null;
            }
        }
    }

    /* renamed from: f */
    private final T[] m40343f() {
        T[] tArr = this.f32015a;
        if (tArr == null) {
            T[] tArr2 = new C12240u[4];
            this.f32015a = tArr2;
            return tArr2;
        } else if (mo38910b() < tArr.length) {
            return tArr;
        } else {
            T[] copyOf = Arrays.copyOf(tArr, mo38910b() * 2);
            C10202j.m34174a((Object) copyOf, "java.util.Arrays.copyOf(this, newSize)");
            T[] tArr3 = (C12240u[]) copyOf;
            this.f32015a = tArr3;
            return tArr3;
        }
    }

    /* renamed from: a */
    public final T mo38907a() {
        T[] tArr = this.f32015a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: b */
    public final int mo38910b() {
        return this._size;
    }

    /* renamed from: c */
    public final boolean mo38912c() {
        return mo38910b() == 0;
    }

    /* renamed from: e */
    public final T mo38914e() {
        T a;
        synchronized (this) {
            a = mo38910b() > 0 ? mo38908a(0) : null;
        }
        return a;
    }

    /* renamed from: b */
    private final void m40340b(int i) {
        this._size = i;
    }

    /* renamed from: c */
    private final void m40341c(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 < mo38910b()) {
                T[] tArr = this.f32015a;
                if (tArr != null) {
                    int i3 = i2 + 1;
                    if (i3 < mo38910b()) {
                        T t = tArr[i3];
                        if (t != null) {
                            Comparable comparable = (Comparable) t;
                            T t2 = tArr[i2];
                            if (t2 == null) {
                                C10202j.m34172a();
                                throw null;
                            } else if (comparable.compareTo(t2) < 0) {
                                i2 = i3;
                            }
                        } else {
                            C10202j.m34172a();
                            throw null;
                        }
                    }
                    T t3 = tArr[i];
                    if (t3 != null) {
                        Comparable comparable2 = (Comparable) t3;
                        T t4 = tArr[i2];
                        if (t4 == null) {
                            C10202j.m34172a();
                            throw null;
                        } else if (comparable2.compareTo(t4) > 0) {
                            m40339a(i, i2);
                            i = i2;
                        } else {
                            return;
                        }
                    } else {
                        C10202j.m34172a();
                        throw null;
                    }
                } else {
                    C10202j.m34172a();
                    throw null;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final T mo38908a(int i) {
        boolean z = false;
        if (C12248i0.m40396a()) {
            if (!(mo38910b() > 0)) {
                throw new AssertionError();
            }
        }
        T[] tArr = this.f32015a;
        if (tArr != null) {
            m40340b(mo38910b() - 1);
            if (i < mo38910b()) {
                m40339a(i, mo38910b());
                int i2 = (i - 1) / 2;
                if (i > 0) {
                    T t = tArr[i];
                    if (t != null) {
                        Comparable comparable = (Comparable) t;
                        T t2 = tArr[i2];
                        if (t2 == null) {
                            C10202j.m34172a();
                            throw null;
                        } else if (comparable.compareTo(t2) < 0) {
                            m40339a(i, i2);
                            m40342d(i2);
                        }
                    } else {
                        C10202j.m34172a();
                        throw null;
                    }
                }
                m40341c(i);
            }
            T t3 = tArr[mo38910b()];
            if (t3 != null) {
                if (C12248i0.m40396a()) {
                    if (t3.mo38915a() == this) {
                        z = true;
                    }
                    if (!z) {
                        throw new AssertionError();
                    }
                }
                t3.mo38917a((C12239t<?>) null);
                t3.mo38916a(-1);
                tArr[mo38910b()] = null;
                return t3;
            }
            C10202j.m34172a();
            throw null;
        }
        C10202j.m34172a();
        throw null;
    }

    /* renamed from: b */
    public final boolean mo38911b(T t) {
        boolean z;
        synchronized (this) {
            z = true;
            boolean z2 = false;
            if (t.mo38915a() == null) {
                z = false;
            } else {
                int e = t.mo38918e();
                if (C12248i0.m40396a()) {
                    if (e >= 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        throw new AssertionError();
                    }
                }
                mo38908a(e);
            }
        }
        return z;
    }

    /* renamed from: d */
    public final T mo38913d() {
        T a;
        synchronized (this) {
            a = mo38907a();
        }
        return a;
    }

    /* renamed from: a */
    public final void mo38909a(T t) {
        if (C12248i0.m40396a()) {
            if (!(t.mo38915a() == null)) {
                throw new AssertionError();
            }
        }
        t.mo38917a((C12239t<?>) this);
        C12240u[] f = m40343f();
        int b = mo38910b();
        m40340b(b + 1);
        f[b] = t;
        t.mo38916a(b);
        m40342d(b);
    }

    /* renamed from: a */
    private final void m40339a(int i, int i2) {
        T[] tArr = this.f32015a;
        if (tArr != null) {
            T t = tArr[i2];
            if (t != null) {
                T t2 = tArr[i];
                if (t2 != null) {
                    tArr[i] = t;
                    tArr[i2] = t2;
                    t.mo38916a(i);
                    t2.mo38916a(i2);
                    return;
                }
                C10202j.m34172a();
                throw null;
            }
            C10202j.m34172a();
            throw null;
        }
        C10202j.m34172a();
        throw null;
    }
}
