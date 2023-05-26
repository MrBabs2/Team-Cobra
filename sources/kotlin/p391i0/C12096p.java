package kotlin.p391i0;

import java.util.Iterator;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.p258c0.C10190a;
import kotlin.p215c0.p216c.C9113l;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u0003B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J3\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\t0\u0003\"\u0004\b\u0002\u0010\t2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\u000b0\u0006H\u0000¢\u0006\u0002\b\fJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo16641d2 = {"Lkotlin/sequences/TransformingSequence;", "T", "R", "Lkotlin/sequences/Sequence;", "sequence", "transformer", "Lkotlin/Function1;", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "flatten", "E", "iterator", "", "flatten$kotlin_stdlib", "kotlin-stdlib"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: kotlin.i0.p */
/* compiled from: Sequences.kt */
public final class C12096p<T, R> implements C12079h<R> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C12079h<T> f31862a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C9113l<T, R> f31863b;

    /* renamed from: kotlin.i0.p$a */
    /* compiled from: Sequences.kt */
    public static final class C12097a implements Iterator<R>, C10190a {

        /* renamed from: f */
        private final Iterator<T> f31864f;

        /* renamed from: g */
        final /* synthetic */ C12096p f31865g;

        C12097a(C12096p pVar) {
            this.f31865g = pVar;
            this.f31864f = pVar.f31862a.iterator();
        }

        public boolean hasNext() {
            return this.f31864f.hasNext();
        }

        public R next() {
            return this.f31865g.f31863b.invoke(this.f31864f.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C12096p(C12079h<? extends T> hVar, C9113l<? super T, ? extends R> lVar) {
        C10202j.m34178b(hVar, "sequence");
        C10202j.m34178b(lVar, "transformer");
        this.f31862a = hVar;
        this.f31863b = lVar;
    }

    public Iterator<R> iterator() {
        return new C12097a(this);
    }

    /* renamed from: a */
    public final <E> C12079h<E> mo38720a(C9113l<? super R, ? extends Iterator<? extends E>> lVar) {
        C10202j.m34178b(lVar, "iterator");
        return new C12075f(this.f31862a, this.f31863b, lVar);
    }
}
