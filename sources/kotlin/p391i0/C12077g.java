package kotlin.p391i0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.p258c0.C10190a;
import kotlin.p215c0.p216c.C9102a;
import kotlin.p215c0.p216c.C9113l;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007¢\u0006\u0002\u0010\bJ\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo16641d2 = {"Lkotlin/sequences/GeneratorSequence;", "T", "", "Lkotlin/sequences/Sequence;", "getInitialValue", "Lkotlin/Function0;", "getNextValue", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: kotlin.i0.g */
/* compiled from: Sequences.kt */
final class C12077g<T> implements C12079h<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C9102a<T> f31843a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C9113l<T, T> f31844b;

    /* renamed from: kotlin.i0.g$a */
    /* compiled from: Sequences.kt */
    public static final class C12078a implements Iterator<T>, C10190a {

        /* renamed from: f */
        private T f31845f;

        /* renamed from: g */
        private int f31846g = -2;

        /* renamed from: h */
        final /* synthetic */ C12077g f31847h;

        C12078a(C12077g gVar) {
            this.f31847h = gVar;
        }

        /* renamed from: a */
        private final void m39884a() {
            T t;
            if (this.f31846g == -2) {
                t = this.f31847h.f31843a.invoke();
            } else {
                C9113l b = this.f31847h.f31844b;
                T t2 = this.f31845f;
                if (t2 != null) {
                    t = b.invoke(t2);
                } else {
                    C10202j.m34172a();
                    throw null;
                }
            }
            this.f31845f = t;
            this.f31846g = t == null ? 0 : 1;
        }

        public boolean hasNext() {
            if (this.f31846g < 0) {
                m39884a();
            }
            return this.f31846g == 1;
        }

        public T next() {
            if (this.f31846g < 0) {
                m39884a();
            }
            if (this.f31846g != 0) {
                T t = this.f31845f;
                if (t != null) {
                    this.f31846g = -1;
                    return t;
                }
                throw new TypeCastException("null cannot be cast to non-null type T");
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C12077g(C9102a<? extends T> aVar, C9113l<? super T, ? extends T> lVar) {
        C10202j.m34178b(aVar, "getInitialValue");
        C10202j.m34178b(lVar, "getNextValue");
        this.f31843a = aVar;
        this.f31844b = lVar;
    }

    public Iterator<T> iterator() {
        return new C12078a(this);
    }
}
