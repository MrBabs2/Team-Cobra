package kotlin.p391i0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.p258c0.C10190a;
import kotlin.p215c0.p216c.C9113l;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00030\u0004BA\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\tH\u0002R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t0\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo16641d2 = {"Lkotlin/sequences/FlatteningSequence;", "T", "R", "E", "Lkotlin/sequences/Sequence;", "sequence", "transformer", "Lkotlin/Function1;", "iterator", "", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: kotlin.i0.f */
/* compiled from: Sequences.kt */
public final class C12075f<T, R, E> implements C12079h<E> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C12079h<T> f31837a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C9113l<T, R> f31838b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C9113l<R, Iterator<E>> f31839c;

    /* renamed from: kotlin.i0.f$a */
    /* compiled from: Sequences.kt */
    public static final class C12076a implements Iterator<E>, C10190a {

        /* renamed from: f */
        private final Iterator<T> f31840f;

        /* renamed from: g */
        private Iterator<? extends E> f31841g;

        /* renamed from: h */
        final /* synthetic */ C12075f f31842h;

        C12076a(C12075f fVar) {
            this.f31842h = fVar;
            this.f31840f = fVar.f31837a.iterator();
        }

        /* renamed from: a */
        private final boolean m39881a() {
            Iterator<? extends E> it = this.f31841g;
            if (it != null && !it.hasNext()) {
                this.f31841g = null;
            }
            while (true) {
                if (this.f31841g == null) {
                    if (this.f31840f.hasNext()) {
                        Iterator<? extends E> it2 = (Iterator) this.f31842h.f31839c.invoke(this.f31842h.f31838b.invoke(this.f31840f.next()));
                        if (it2.hasNext()) {
                            this.f31841g = it2;
                            break;
                        }
                    } else {
                        return false;
                    }
                } else {
                    break;
                }
            }
            return true;
        }

        public boolean hasNext() {
            return m39881a();
        }

        public E next() {
            if (m39881a()) {
                Iterator<? extends E> it = this.f31841g;
                if (it != null) {
                    return it.next();
                }
                C10202j.m34172a();
                throw null;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C12075f(C12079h<? extends T> hVar, C9113l<? super T, ? extends R> lVar, C9113l<? super R, ? extends Iterator<? extends E>> lVar2) {
        C10202j.m34178b(hVar, "sequence");
        C10202j.m34178b(lVar, "transformer");
        C10202j.m34178b(lVar2, "iterator");
        this.f31837a = hVar;
        this.f31838b = lVar;
        this.f31839c = lVar2;
    }

    public Iterator<E> iterator() {
        return new C12076a(this);
    }
}
