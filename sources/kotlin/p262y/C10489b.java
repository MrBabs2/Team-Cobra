package kotlin.p262y;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.p258c0.C10190a;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\b\b'\u0018\u0000 \u001c*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0004\u001c\u001d\u001e\u001fB\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0016\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0006H¦\u0002¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0006H\u0016J\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0002J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0016R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006 "}, mo16641d2 = {"Lkotlin/collections/AbstractList;", "E", "Lkotlin/collections/AbstractCollection;", "", "()V", "size", "", "getSize", "()I", "equals", "", "other", "", "get", "index", "(I)Ljava/lang/Object;", "hashCode", "indexOf", "element", "(Ljava/lang/Object;)I", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "Companion", "IteratorImpl", "ListIteratorImpl", "SubList", "kotlin-stdlib"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: kotlin.y.b */
/* compiled from: AbstractList.kt */
public abstract class C10489b<E> extends C10486a<E> implements List<E>, C10190a {

    /* renamed from: f */
    public static final C10490a f28363f = new C10490a((DefaultConstructorMarker) null);

    /* renamed from: kotlin.y.b$a */
    /* compiled from: AbstractList.kt */
    public static final class C10490a {
        private C10490a() {
        }

        /* renamed from: a */
        public final void mo35943a(int i, int i2) {
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        /* renamed from: b */
        public final void mo35946b(int i, int i2) {
            if (i < 0 || i > i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        public /* synthetic */ C10490a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo35944a(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
            } else if (i > i2) {
                throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
            }
        }

        /* renamed from: a */
        public final int mo35942a(Collection<?> collection) {
            C10202j.m34178b(collection, "c");
            Iterator<?> it = collection.iterator();
            int i = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i = (i * 31) + (next != null ? next.hashCode() : 0);
            }
            return i;
        }

        /* renamed from: a */
        public final boolean mo35945a(Collection<?> collection, Collection<?> collection2) {
            C10202j.m34178b(collection, "c");
            C10202j.m34178b(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            for (Object a : collection) {
                if (!C10202j.m34176a((Object) a, (Object) it.next())) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: kotlin.y.b$b */
    /* compiled from: AbstractList.kt */
    private class C10491b implements Iterator<E>, C10190a {

        /* renamed from: f */
        private int f28364f;

        public C10491b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final int mo35947a() {
            return this.f28364f;
        }

        public boolean hasNext() {
            return this.f28364f < C10489b.this.size();
        }

        public E next() {
            if (hasNext()) {
                C10489b bVar = C10489b.this;
                int i = this.f28364f;
                this.f28364f = i + 1;
                return bVar.get(i);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo35948a(int i) {
            this.f28364f = i;
        }
    }

    /* renamed from: kotlin.y.b$c */
    /* compiled from: AbstractList.kt */
    private class C10492c extends C10489b<E>.C0980b implements ListIterator<E>, C10190a {
        public C10492c(int i) {
            super();
            C10489b.f28363f.mo35946b(i, C10489b.this.size());
            mo35948a(i);
        }

        public void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasPrevious() {
            return mo35947a() > 0;
        }

        public int nextIndex() {
            return mo35947a();
        }

        public E previous() {
            if (hasPrevious()) {
                C10489b bVar = C10489b.this;
                mo35948a(mo35947a() - 1);
                return bVar.get(mo35947a());
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return mo35947a() - 1;
        }

        public void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: kotlin.y.b$d */
    /* compiled from: AbstractList.kt */
    private static final class C10493d<E> extends C10489b<E> implements RandomAccess {

        /* renamed from: g */
        private int f28367g;

        /* renamed from: h */
        private final C10489b<E> f28368h;

        /* renamed from: i */
        private final int f28369i;

        public C10493d(C10489b<? extends E> bVar, int i, int i2) {
            C10202j.m34178b(bVar, "list");
            this.f28368h = bVar;
            this.f28369i = i;
            C10489b.f28363f.mo35944a(i, i2, bVar.size());
            this.f28367g = i2 - this.f28369i;
        }

        /* renamed from: a */
        public int mo35897a() {
            return this.f28367g;
        }

        public E get(int i) {
            C10489b.f28363f.mo35943a(i, this.f28367g);
            return this.f28368h.get(this.f28369i + i);
        }
    }

    protected C10489b() {
    }

    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return f28363f.mo35945a((Collection<?>) this, (Collection<?>) (Collection) obj);
    }

    public abstract E get(int i);

    public int hashCode() {
        return f28363f.mo35942a(this);
    }

    public int indexOf(Object obj) {
        int i = 0;
        for (Object a : this) {
            if (C10202j.m34176a(a, obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public Iterator<E> iterator() {
        return new C10491b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C10202j.m34176a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new C10492c(0);
    }

    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i, int i2) {
        return new C10493d(this, i, i2);
    }

    public ListIterator<E> listIterator(int i) {
        return new C10492c(i);
    }
}
