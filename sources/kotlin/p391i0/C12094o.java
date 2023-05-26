package kotlin.p391i0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.p258c0.C10190a;
import kotlin.p215c0.p216c.C9113l;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, mo16641d2 = {"Lkotlin/sequences/TakeWhileSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "predicate", "Lkotlin/Function1;", "", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: kotlin.i0.o */
/* compiled from: Sequences.kt */
public final class C12094o<T> implements C12079h<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C12079h<T> f31856a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C9113l<T, Boolean> f31857b;

    /* renamed from: kotlin.i0.o$a */
    /* compiled from: Sequences.kt */
    public static final class C12095a implements Iterator<T>, C10190a {

        /* renamed from: f */
        private final Iterator<T> f31858f;

        /* renamed from: g */
        private int f31859g = -1;

        /* renamed from: h */
        private T f31860h;

        /* renamed from: i */
        final /* synthetic */ C12094o f31861i;

        C12095a(C12094o oVar) {
            this.f31861i = oVar;
            this.f31858f = oVar.f31856a.iterator();
        }

        /* renamed from: a */
        private final void m39936a() {
            if (this.f31858f.hasNext()) {
                T next = this.f31858f.next();
                if (((Boolean) this.f31861i.f31857b.invoke(next)).booleanValue()) {
                    this.f31859g = 1;
                    this.f31860h = next;
                    return;
                }
            }
            this.f31859g = 0;
        }

        public boolean hasNext() {
            if (this.f31859g == -1) {
                m39936a();
            }
            return this.f31859g == 1;
        }

        public T next() {
            if (this.f31859g == -1) {
                m39936a();
            }
            if (this.f31859g != 0) {
                T t = this.f31860h;
                this.f31860h = null;
                this.f31859g = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C12094o(C12079h<? extends T> hVar, C9113l<? super T, Boolean> lVar) {
        C10202j.m34178b(hVar, "sequence");
        C10202j.m34178b(lVar, "predicate");
        this.f31856a = hVar;
        this.f31857b = lVar;
    }

    public Iterator<T> iterator() {
        return new C12095a(this);
    }
}
