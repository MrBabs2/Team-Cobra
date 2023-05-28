package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.u */
/* compiled from: UnmodifiableLazyStringList */
public class C10468u extends AbstractList<String> implements RandomAccess, C10445m {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C10445m f28315f;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.u$a */
    /* compiled from: UnmodifiableLazyStringList */
    class C10469a implements ListIterator<String> {

        /* renamed from: f */
        ListIterator<String> f28316f = C10468u.this.f28315f.listIterator(this.f28317g);

        /* renamed from: g */
        final /* synthetic */ int f28317g;

        C10469a(int i) {
            this.f28317g = i;
        }

        /* renamed from: a */
        public void mo35870a(String str) {
            throw new UnsupportedOperationException();
        }

        public /* bridge */ /* synthetic */ void add(Object obj) {
            mo35870a((String) obj);
            throw null;
        }

        /* renamed from: b */
        public void mo35872b(String str) {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f28316f.hasNext();
        }

        public boolean hasPrevious() {
            return this.f28316f.hasPrevious();
        }

        public int nextIndex() {
            return this.f28316f.nextIndex();
        }

        public int previousIndex() {
            return this.f28316f.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* bridge */ /* synthetic */ void set(Object obj) {
            mo35872b((String) obj);
            throw null;
        }

        public String next() {
            return this.f28316f.next();
        }

        public String previous() {
            return this.f28316f.previous();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.u$b */
    /* compiled from: UnmodifiableLazyStringList */
    class C10470b implements Iterator<String> {

        /* renamed from: f */
        Iterator<String> f28319f = C10468u.this.f28315f.iterator();

        C10470b() {
        }

        public boolean hasNext() {
            return this.f28319f.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public String next() {
            return this.f28319f.next();
        }
    }

    public C10468u(C10445m mVar) {
        this.f28315f = mVar;
    }

    /* renamed from: B */
    public C10445m mo35796B() {
        return this;
    }

    /* renamed from: e */
    public C10417d mo35804e(int i) {
        return this.f28315f.mo35804e(i);
    }

    public Iterator<String> iterator() {
        return new C10470b();
    }

    public ListIterator<String> listIterator(int i) {
        return new C10469a(i);
    }

    /* renamed from: r */
    public List<?> mo35806r() {
        return this.f28315f.mo35806r();
    }

    public int size() {
        return this.f28315f.size();
    }

    /* renamed from: a */
    public void mo35798a(C10417d dVar) {
        throw new UnsupportedOperationException();
    }

    public String get(int i) {
        return (String) this.f28315f.get(i);
    }
}
