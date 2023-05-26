package kotlin.reflect.jvm.internal.impl.utils;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* renamed from: kotlin.reflect.jvm.internal.impl.utils.i */
/* compiled from: SmartList */
public class C12164i<E> extends AbstractList<E> implements RandomAccess {

    /* renamed from: f */
    private int f31929f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Object f31930g;

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.i$b */
    /* compiled from: SmartList */
    private static class C12166b<T> implements Iterator<T> {

        /* renamed from: f */
        private static final C12166b f31931f = new C12166b();

        private C12166b() {
        }

        /* renamed from: a */
        public static <T> C12166b<T> m40176a() {
            return f31931f;
        }

        public boolean hasNext() {
            return false;
        }

        public T next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new IllegalStateException();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.i$c */
    /* compiled from: SmartList */
    private class C12167c extends C12168d<E> {

        /* renamed from: g */
        private final int f31932g;

        public C12167c() {
            super();
            this.f31932g = C12164i.this.modCount;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo38784a() {
            if (C12164i.this.modCount != this.f31932g) {
                throw new ConcurrentModificationException("ModCount: " + C12164i.this.modCount + "; expected: " + this.f31932g);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public E mo38785b() {
            return C12164i.this.f31930g;
        }

        public void remove() {
            mo38784a();
            C12164i.this.clear();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.i$d */
    /* compiled from: SmartList */
    private static abstract class C12168d<T> implements Iterator<T> {

        /* renamed from: f */
        private boolean f31934f;

        private C12168d() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo38784a();

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract T mo38785b();

        public final boolean hasNext() {
            return !this.f31934f;
        }

        public final T next() {
            if (!this.f31934f) {
                this.f31934f = true;
                mo38784a();
                return mo38785b();
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: h */
    private static /* synthetic */ void m40175h(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? 2 : 3)];
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i == 2 || i == 3) {
            objArr[1] = "iterator";
        } else if (i == 5 || i == 6 || i == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public boolean add(E e) {
        int i = this.f31929f;
        if (i == 0) {
            this.f31930g = e;
        } else if (i == 1) {
            this.f31930g = new Object[]{this.f31930g, e};
        } else {
            Object[] objArr = (Object[]) this.f31930g;
            int length = objArr.length;
            if (i >= length) {
                int i2 = ((length * 3) / 2) + 1;
                int i3 = i + 1;
                if (i2 < i3) {
                    i2 = i3;
                }
                Object[] objArr2 = new Object[i2];
                this.f31930g = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f31929f] = e;
        }
        this.f31929f++;
        this.modCount++;
        return true;
    }

    public void clear() {
        this.f31930g = null;
        this.f31929f = 0;
        this.modCount++;
    }

    public E get(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f31929f)) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f31929f);
        } else if (i2 == 1) {
            return this.f31930g;
        } else {
            return ((Object[]) this.f31930g)[i];
        }
    }

    public Iterator<E> iterator() {
        int i = this.f31929f;
        if (i == 0) {
            C12166b a = C12166b.m40176a();
            if (a != null) {
                return a;
            }
            m40175h(2);
            throw null;
        } else if (i == 1) {
            return new C12167c();
        } else {
            Iterator<E> it = super.iterator();
            if (it != null) {
                return it;
            }
            m40175h(3);
            throw null;
        }
    }

    public E remove(int i) {
        int i2;
        E e;
        if (i < 0 || i >= (i2 = this.f31929f)) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f31929f);
        }
        if (i2 == 1) {
            e = this.f31930g;
            this.f31930g = null;
        } else {
            E[] eArr = (Object[]) this.f31930g;
            E e2 = eArr[i];
            if (i2 == 2) {
                this.f31930g = eArr[1 - i];
            } else {
                int i3 = (i2 - i) - 1;
                if (i3 > 0) {
                    System.arraycopy(eArr, i + 1, eArr, i, i3);
                }
                eArr[this.f31929f - 1] = null;
            }
            e = e2;
        }
        this.f31929f--;
        this.modCount++;
        return e;
    }

    public E set(int i, E e) {
        int i2;
        if (i < 0 || i >= (i2 = this.f31929f)) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f31929f);
        } else if (i2 == 1) {
            E e2 = this.f31930g;
            this.f31930g = e;
            return e2;
        } else {
            E[] eArr = (Object[]) this.f31930g;
            E e3 = eArr[i];
            eArr[i] = e;
            return e3;
        }
    }

    public int size() {
        return this.f31929f;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr != null) {
            int length = tArr.length;
            int i = this.f31929f;
            if (i == 1) {
                if (length != 0) {
                    tArr[0] = this.f31930g;
                } else {
                    T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1);
                    tArr2[0] = this.f31930g;
                    if (tArr2 != null) {
                        return tArr2;
                    }
                    m40175h(5);
                    throw null;
                }
            } else if (length < i) {
                T[] copyOf = Arrays.copyOf((Object[]) this.f31930g, i, tArr.getClass());
                if (copyOf != null) {
                    return copyOf;
                }
                m40175h(6);
                throw null;
            } else if (i != 0) {
                System.arraycopy(this.f31930g, 0, tArr, 0, i);
            }
            int i2 = this.f31929f;
            if (length > i2) {
                tArr[i2] = null;
            }
            if (tArr != null) {
                return tArr;
            }
            m40175h(7);
            throw null;
        }
        m40175h(4);
        throw null;
    }

    public void add(int i, E e) {
        int i2;
        if (i < 0 || i > (i2 = this.f31929f)) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.f31929f);
        }
        if (i2 == 0) {
            this.f31930g = e;
        } else if (i2 == 1 && i == 0) {
            this.f31930g = new Object[]{e, this.f31930g};
        } else {
            int i3 = this.f31929f;
            Object[] objArr = new Object[(i3 + 1)];
            if (i3 == 1) {
                objArr[0] = this.f31930g;
            } else {
                Object[] objArr2 = (Object[]) this.f31930g;
                System.arraycopy(objArr2, 0, objArr, 0, i);
                System.arraycopy(objArr2, i, objArr, i + 1, this.f31929f - i);
            }
            objArr[i] = e;
            this.f31930g = objArr;
        }
        this.f31929f++;
        this.modCount++;
    }
}
