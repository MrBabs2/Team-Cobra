package p120q.p121b.p367q;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/* renamed from: q.b.q.a */
/* compiled from: CircularFifoQueue */
public class C11589a<E> extends AbstractCollection<E> implements Queue<E>, Serializable {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public transient E[] f30925f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public transient int f30926g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public transient int f30927h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public transient boolean f30928i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final int f30929j;

    /* renamed from: q.b.q.a$a */
    /* compiled from: CircularFifoQueue */
    class C11590a implements Iterator<E> {

        /* renamed from: f */
        private int f30930f = C11589a.this.f30926g;

        /* renamed from: g */
        private int f30931g = -1;

        /* renamed from: h */
        private boolean f30932h = C11589a.this.f30928i;

        C11590a() {
        }

        public boolean hasNext() {
            return this.f30932h || this.f30930f != C11589a.this.f30927h;
        }

        public E next() {
            if (hasNext()) {
                this.f30932h = false;
                int i = this.f30930f;
                this.f30931g = i;
                this.f30930f = C11589a.this.m37909i(i);
                return C11589a.this.f30925f[this.f30931g];
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            int i = this.f30931g;
            if (i == -1) {
                throw new IllegalStateException();
            } else if (i == C11589a.this.f30926g) {
                C11589a.this.remove();
                this.f30931g = -1;
            } else {
                int i2 = this.f30931g + 1;
                if (C11589a.this.f30926g >= this.f30931g || i2 >= C11589a.this.f30927h) {
                    while (i2 != C11589a.this.f30927h) {
                        if (i2 >= C11589a.this.f30929j) {
                            C11589a.this.f30925f[i2 - 1] = C11589a.this.f30925f[0];
                            i2 = 0;
                        } else {
                            C11589a.this.f30925f[C11589a.this.m37908h(i2)] = C11589a.this.f30925f[i2];
                            i2 = C11589a.this.m37909i(i2);
                        }
                    }
                } else {
                    System.arraycopy(C11589a.this.f30925f, i2, C11589a.this.f30925f, this.f30931g, C11589a.this.f30927h - i2);
                }
                this.f30931g = -1;
                C11589a aVar = C11589a.this;
                int unused = aVar.f30927h = aVar.m37908h(aVar.f30927h);
                C11589a.this.f30925f[C11589a.this.f30927h] = null;
                boolean unused2 = C11589a.this.f30928i = false;
                this.f30930f = C11589a.this.m37908h(this.f30930f);
            }
        }
    }

    public C11589a() {
        this(32);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public int m37908h(int i) {
        int i2 = i - 1;
        return i2 < 0 ? this.f30929j - 1 : i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public int m37909i(int i) {
        int i2 = i + 1;
        if (i2 >= this.f30929j) {
            return 0;
        }
        return i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f30925f = new Object[this.f30929j];
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            this.f30925f[i] = objectInputStream.readObject();
        }
        this.f30926g = 0;
        boolean z = readInt == this.f30929j;
        this.f30928i = z;
        if (z) {
            this.f30927h = 0;
        } else {
            this.f30927h = readInt;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    public boolean add(E e) {
        if (e != null) {
            if (mo37827a()) {
                remove();
            }
            E[] eArr = this.f30925f;
            int i = this.f30927h;
            int i2 = i + 1;
            this.f30927h = i2;
            eArr[i] = e;
            if (i2 >= this.f30929j) {
                this.f30927h = 0;
            }
            if (this.f30927h == this.f30926g) {
                this.f30928i = true;
            }
            return true;
        }
        throw new NullPointerException("Attempted to add null object to queue");
    }

    public void clear() {
        this.f30928i = false;
        this.f30926g = 0;
        this.f30927h = 0;
        Arrays.fill(this.f30925f, (Object) null);
    }

    public E element() {
        if (!isEmpty()) {
            return peek();
        }
        throw new NoSuchElementException("queue is empty");
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Iterator<E> iterator() {
        return new C11590a();
    }

    public boolean offer(E e) {
        return add(e);
    }

    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return this.f30925f[this.f30926g];
    }

    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    public E remove() {
        if (!isEmpty()) {
            E[] eArr = this.f30925f;
            int i = this.f30926g;
            E e = eArr[i];
            if (e != null) {
                int i2 = i + 1;
                this.f30926g = i2;
                eArr[i] = null;
                if (i2 >= this.f30929j) {
                    this.f30926g = 0;
                }
                this.f30928i = false;
            }
            return e;
        }
        throw new NoSuchElementException("queue is empty");
    }

    public int size() {
        int i = this.f30927h;
        int i2 = this.f30926g;
        if (i < i2) {
            return (this.f30929j - i2) + i;
        }
        if (i != i2) {
            return i - i2;
        }
        if (this.f30928i) {
            return this.f30929j;
        }
        return 0;
    }

    public C11589a(int i) {
        this.f30926g = 0;
        this.f30927h = 0;
        this.f30928i = false;
        if (i > 0) {
            E[] eArr = new Object[i];
            this.f30925f = eArr;
            this.f30929j = eArr.length;
            return;
        }
        throw new IllegalArgumentException("The size must be greater than 0");
    }

    /* renamed from: a */
    public boolean mo37827a() {
        return size() == this.f30929j;
    }
}
