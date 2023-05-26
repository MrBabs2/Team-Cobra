package com.airbnb.epoxy;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: com.airbnb.epoxy.c0 */
/* compiled from: ModelList */
class C5576c0 extends ArrayList<C5631s<?>> {

    /* renamed from: f */
    private boolean f9847f;

    /* renamed from: g */
    private C5580d f9848g;

    /* renamed from: com.airbnb.epoxy.c0$b */
    /* compiled from: ModelList */
    private class C5578b implements Iterator<C5631s<?>> {

        /* renamed from: f */
        int f9849f;

        /* renamed from: g */
        int f9850g;

        /* renamed from: h */
        int f9851h;

        private C5578b() {
            this.f9850g = -1;
            this.f9851h = C5576c0.this.modCount;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo19148a() {
            if (C5576c0.this.modCount != this.f9851h) {
                throw new ConcurrentModificationException();
            }
        }

        public boolean hasNext() {
            return this.f9849f != C5576c0.this.size();
        }

        public void remove() {
            if (this.f9850g >= 0) {
                mo19148a();
                try {
                    C5576c0.this.remove(this.f9850g);
                    this.f9849f = this.f9850g;
                    this.f9850g = -1;
                    this.f9851h = C5576c0.this.modCount;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ConcurrentModificationException();
                }
            } else {
                throw new IllegalStateException();
            }
        }

        public C5631s<?> next() {
            mo19148a();
            int i = this.f9849f;
            this.f9849f = i + 1;
            this.f9850g = i;
            return (C5631s) C5576c0.this.get(i);
        }
    }

    /* renamed from: com.airbnb.epoxy.c0$c */
    /* compiled from: ModelList */
    private class C5579c extends C5578b implements ListIterator<C5631s<?>> {
        C5579c(int i) {
            super();
            this.f9849f = i;
        }

        /* renamed from: a */
        public void add(C5631s<?> sVar) {
            mo19148a();
            try {
                int i = this.f9849f;
                C5576c0.this.add(i, sVar);
                this.f9849f = i + 1;
                this.f9850g = -1;
                this.f9851h = C5576c0.this.modCount;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }

        /* renamed from: b */
        public void set(C5631s<?> sVar) {
            if (this.f9850g >= 0) {
                mo19148a();
                try {
                    C5576c0.this.set(this.f9850g, sVar);
                } catch (IndexOutOfBoundsException unused) {
                    throw new ConcurrentModificationException();
                }
            } else {
                throw new IllegalStateException();
            }
        }

        public boolean hasPrevious() {
            return this.f9849f != 0;
        }

        public int nextIndex() {
            return this.f9849f;
        }

        public int previousIndex() {
            return this.f9849f - 1;
        }

        public C5631s<?> previous() {
            mo19148a();
            int i = this.f9849f - 1;
            if (i >= 0) {
                this.f9849f = i;
                this.f9850g = i;
                return (C5631s) C5576c0.this.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: com.airbnb.epoxy.c0$d */
    /* compiled from: ModelList */
    interface C5580d {
        /* renamed from: a */
        void mo19160a(int i, int i2);

        /* renamed from: b */
        void mo19161b(int i, int i2);
    }

    /* renamed from: com.airbnb.epoxy.c0$e */
    /* compiled from: ModelList */
    private static class C5581e extends AbstractList<C5631s<?>> {

        /* renamed from: f */
        private final C5576c0 f9854f;

        /* renamed from: g */
        private int f9855g;

        /* renamed from: h */
        private int f9856h;

        /* renamed from: com.airbnb.epoxy.c0$e$a */
        /* compiled from: ModelList */
        private static final class C5582a implements ListIterator<C5631s<?>> {

            /* renamed from: f */
            private final C5581e f9857f;

            /* renamed from: g */
            private final ListIterator<C5631s<?>> f9858g;

            /* renamed from: h */
            private int f9859h;

            /* renamed from: i */
            private int f9860i;

            C5582a(ListIterator<C5631s<?>> listIterator, C5581e eVar, int i, int i2) {
                this.f9858g = listIterator;
                this.f9857f = eVar;
                this.f9859h = i;
                this.f9860i = i + i2;
            }

            /* renamed from: a */
            public void add(C5631s<?> sVar) {
                this.f9858g.add(sVar);
                this.f9857f.mo19163a(true);
                this.f9860i++;
            }

            /* renamed from: b */
            public void set(C5631s<?> sVar) {
                this.f9858g.set(sVar);
            }

            public boolean hasNext() {
                return this.f9858g.nextIndex() < this.f9860i;
            }

            public boolean hasPrevious() {
                return this.f9858g.previousIndex() >= this.f9859h;
            }

            public int nextIndex() {
                return this.f9858g.nextIndex() - this.f9859h;
            }

            public int previousIndex() {
                int previousIndex = this.f9858g.previousIndex();
                int i = this.f9859h;
                if (previousIndex >= i) {
                    return previousIndex - i;
                }
                return -1;
            }

            public void remove() {
                this.f9858g.remove();
                this.f9857f.mo19163a(false);
                this.f9860i--;
            }

            public C5631s<?> next() {
                if (this.f9858g.nextIndex() < this.f9860i) {
                    return this.f9858g.next();
                }
                throw new NoSuchElementException();
            }

            public C5631s<?> previous() {
                if (this.f9858g.previousIndex() >= this.f9859h) {
                    return this.f9858g.previous();
                }
                throw new NoSuchElementException();
            }
        }

        C5581e(C5576c0 c0Var, int i, int i2) {
            this.f9854f = c0Var;
            this.modCount = c0Var.modCount;
            this.f9855g = i;
            this.f9856h = i2 - i;
        }

        /* renamed from: a */
        public void add(int i, C5631s<?> sVar) {
            if (this.modCount != this.f9854f.modCount) {
                throw new ConcurrentModificationException();
            } else if (i < 0 || i > this.f9856h) {
                throw new IndexOutOfBoundsException();
            } else {
                this.f9854f.add(i + this.f9855g, sVar);
                this.f9856h++;
                this.modCount = this.f9854f.modCount;
            }
        }

        public boolean addAll(int i, Collection<? extends C5631s<?>> collection) {
            if (this.modCount != this.f9854f.modCount) {
                throw new ConcurrentModificationException();
            } else if (i < 0 || i > this.f9856h) {
                throw new IndexOutOfBoundsException();
            } else {
                boolean addAll = this.f9854f.addAll(i + this.f9855g, collection);
                if (addAll) {
                    this.f9856h += collection.size();
                    this.modCount = this.f9854f.modCount;
                }
                return addAll;
            }
        }

        /* renamed from: b */
        public C5631s<?> set(int i, C5631s<?> sVar) {
            if (this.modCount != this.f9854f.modCount) {
                throw new ConcurrentModificationException();
            } else if (i >= 0 && i < this.f9856h) {
                return this.f9854f.set(i + this.f9855g, sVar);
            } else {
                throw new IndexOutOfBoundsException();
            }
        }

        public Iterator<C5631s<?>> iterator() {
            return listIterator(0);
        }

        public ListIterator<C5631s<?>> listIterator(int i) {
            if (this.modCount != this.f9854f.modCount) {
                throw new ConcurrentModificationException();
            } else if (i >= 0 && i <= this.f9856h) {
                return new C5582a(this.f9854f.listIterator(i + this.f9855g), this, this.f9855g, this.f9856h);
            } else {
                throw new IndexOutOfBoundsException();
            }
        }

        /* access modifiers changed from: protected */
        public void removeRange(int i, int i2) {
            if (i == i2) {
                return;
            }
            if (this.modCount == this.f9854f.modCount) {
                C5576c0 c0Var = this.f9854f;
                int i3 = this.f9855g;
                c0Var.removeRange(i + i3, i3 + i2);
                this.f9856h -= i2 - i;
                this.modCount = this.f9854f.modCount;
                return;
            }
            throw new ConcurrentModificationException();
        }

        public int size() {
            if (this.modCount == this.f9854f.modCount) {
                return this.f9856h;
            }
            throw new ConcurrentModificationException();
        }

        public C5631s<?> get(int i) {
            if (this.modCount != this.f9854f.modCount) {
                throw new ConcurrentModificationException();
            } else if (i >= 0 && i < this.f9856h) {
                return (C5631s) this.f9854f.get(i + this.f9855g);
            } else {
                throw new IndexOutOfBoundsException();
            }
        }

        public C5631s<?> remove(int i) {
            if (this.modCount != this.f9854f.modCount) {
                throw new ConcurrentModificationException();
            } else if (i < 0 || i >= this.f9856h) {
                throw new IndexOutOfBoundsException();
            } else {
                C5631s<?> remove = this.f9854f.remove(i + this.f9855g);
                this.f9856h--;
                this.modCount = this.f9854f.modCount;
                return remove;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo19163a(boolean z) {
            if (z) {
                this.f9856h++;
            } else {
                this.f9856h--;
            }
            this.modCount = this.f9854f.modCount;
        }

        public boolean addAll(Collection<? extends C5631s<?>> collection) {
            if (this.modCount == this.f9854f.modCount) {
                boolean addAll = this.f9854f.addAll(this.f9855g + this.f9856h, collection);
                if (addAll) {
                    this.f9856h += collection.size();
                    this.modCount = this.f9854f.modCount;
                }
                return addAll;
            }
            throw new ConcurrentModificationException();
        }
    }

    C5576c0(int i) {
        super(i);
    }

    public boolean addAll(Collection<? extends C5631s<?>> collection) {
        m10558a(size(), collection.size());
        return super.addAll(collection);
    }

    public void clear() {
        if (!isEmpty()) {
            m10560b(0, size());
            super.clear();
        }
    }

    public Iterator<C5631s<?>> iterator() {
        return new C5578b();
    }

    public ListIterator<C5631s<?>> listIterator() {
        return new C5579c(0);
    }

    public boolean removeAll(Collection<?> collection) {
        Iterator<C5631s<?>> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i, int i2) {
        if (i != i2) {
            m10560b(i, i2 - i);
            super.removeRange(i, i2);
        }
    }

    public boolean retainAll(Collection<?> collection) {
        Iterator<C5631s<?>> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public List<C5631s<?>> subList(int i, int i2) {
        if (i < 0 || i2 > size()) {
            throw new IndexOutOfBoundsException();
        } else if (i <= i2) {
            return new C5581e(this, i, i2);
        } else {
            throw new IllegalArgumentException();
        }
    }

    C5576c0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo19128a(C5580d dVar) {
        this.f9848g = dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo19135b() {
        if (!this.f9847f) {
            this.f9847f = true;
            return;
        }
        throw new IllegalStateException("Notifications already paused");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo19136c() {
        if (this.f9847f) {
            this.f9847f = false;
            return;
        }
        throw new IllegalStateException("Notifications already resumed");
    }

    public ListIterator<C5631s<?>> listIterator(int i) {
        return new C5579c(i);
    }

    public C5631s<?> remove(int i) {
        m10560b(i, 1);
        return (C5631s) super.remove(i);
    }

    /* renamed from: a */
    private void m10558a(int i, int i2) {
        C5580d dVar;
        if (!this.f9847f && (dVar = this.f9848g) != null) {
            dVar.mo19160a(i, i2);
            throw null;
        }
    }

    public boolean addAll(int i, Collection<? extends C5631s<?>> collection) {
        m10558a(i, collection.size());
        return super.addAll(i, collection);
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        m10560b(indexOf, 1);
        super.remove(indexOf);
        return true;
    }

    /* renamed from: b */
    private void m10560b(int i, int i2) {
        C5580d dVar;
        if (!this.f9847f && (dVar = this.f9848g) != null) {
            dVar.mo19161b(i, i2);
            throw null;
        }
    }

    /* renamed from: a */
    public boolean add(C5631s<?> sVar) {
        m10558a(size(), 1);
        return super.add(sVar);
    }

    /* renamed from: a */
    public void add(int i, C5631s<?> sVar) {
        m10558a(i, 1);
        super.add(i, sVar);
    }

    /* renamed from: b */
    public C5631s<?> set(int i, C5631s<?> sVar) {
        C5631s<?> sVar2 = (C5631s) super.set(i, sVar);
        if (sVar2.mo19311id() != sVar.mo19311id()) {
            m10560b(i, 1);
            m10558a(i, 1);
        }
        return sVar2;
    }
}
