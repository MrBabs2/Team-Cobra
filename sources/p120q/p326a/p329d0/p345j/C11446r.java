package p120q.p326a.p329d0.p345j;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: q.a.d0.j.r */
/* compiled from: VolatileSizeArrayList */
public final class C11446r<T> extends AtomicInteger implements List<T>, RandomAccess {

    /* renamed from: f */
    final ArrayList<T> f30633f = new ArrayList<>();

    public boolean add(T t) {
        boolean add = this.f30633f.add(t);
        lazySet(this.f30633f.size());
        return add;
    }

    public boolean addAll(Collection<? extends T> collection) {
        boolean addAll = this.f30633f.addAll(collection);
        lazySet(this.f30633f.size());
        return addAll;
    }

    public void clear() {
        this.f30633f.clear();
        lazySet(0);
    }

    public boolean contains(Object obj) {
        return this.f30633f.contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return this.f30633f.containsAll(collection);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C11446r) {
            return this.f30633f.equals(((C11446r) obj).f30633f);
        }
        return this.f30633f.equals(obj);
    }

    public T get(int i) {
        return this.f30633f.get(i);
    }

    public int hashCode() {
        return this.f30633f.hashCode();
    }

    public int indexOf(Object obj) {
        return this.f30633f.indexOf(obj);
    }

    public boolean isEmpty() {
        return get() == 0;
    }

    public Iterator<T> iterator() {
        return this.f30633f.iterator();
    }

    public int lastIndexOf(Object obj) {
        return this.f30633f.lastIndexOf(obj);
    }

    public ListIterator<T> listIterator() {
        return this.f30633f.listIterator();
    }

    public boolean remove(Object obj) {
        boolean remove = this.f30633f.remove(obj);
        lazySet(this.f30633f.size());
        return remove;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean removeAll = this.f30633f.removeAll(collection);
        lazySet(this.f30633f.size());
        return removeAll;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean retainAll = this.f30633f.retainAll(collection);
        lazySet(this.f30633f.size());
        return retainAll;
    }

    public T set(int i, T t) {
        return this.f30633f.set(i, t);
    }

    public int size() {
        return get();
    }

    public List<T> subList(int i, int i2) {
        return this.f30633f.subList(i, i2);
    }

    public Object[] toArray() {
        return this.f30633f.toArray();
    }

    public String toString() {
        return this.f30633f.toString();
    }

    public ListIterator<T> listIterator(int i) {
        return this.f30633f.listIterator(i);
    }

    public <E> E[] toArray(E[] eArr) {
        return this.f30633f.toArray(eArr);
    }

    public void add(int i, T t) {
        this.f30633f.add(i, t);
        lazySet(this.f30633f.size());
    }

    public boolean addAll(int i, Collection<? extends T> collection) {
        boolean addAll = this.f30633f.addAll(i, collection);
        lazySet(this.f30633f.size());
        return addAll;
    }

    public T remove(int i) {
        T remove = this.f30633f.remove(i);
        lazySet(this.f30633f.size());
        return remove;
    }
}
