package kotlin.p391i0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.p258c0.C10190a;
import kotlin.p215c0.p216c.C9113l;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\u0010\bJ\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, mo16641d2 = {"Lkotlin/sequences/FilteringSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "sendWhen", "", "predicate", "Lkotlin/Function1;", "(Lkotlin/sequences/Sequence;ZLkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: kotlin.i0.e */
/* compiled from: Sequences.kt */
public final class C12073e<T> implements C12079h<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C12079h<T> f31830a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final boolean f31831b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C9113l<T, Boolean> f31832c;

    /* renamed from: kotlin.i0.e$a */
    /* compiled from: Sequences.kt */
    public static final class C12074a implements Iterator<T>, C10190a {

        /* renamed from: f */
        private final Iterator<T> f31833f;

        /* renamed from: g */
        private int f31834g = -1;

        /* renamed from: h */
        private T f31835h;

        /* renamed from: i */
        final /* synthetic */ C12073e f31836i;

        C12074a(C12073e eVar) {
            this.f31836i = eVar;
            this.f31833f = eVar.f31830a.iterator();
        }

        /* renamed from: a */
        private final void m39877a() {
            while (this.f31833f.hasNext()) {
                T next = this.f31833f.next();
                if (((Boolean) this.f31836i.f31832c.invoke(next)).booleanValue() == this.f31836i.f31831b) {
                    this.f31835h = next;
                    this.f31834g = 1;
                    return;
                }
            }
            this.f31834g = 0;
        }

        public boolean hasNext() {
            if (this.f31834g == -1) {
                m39877a();
            }
            return this.f31834g == 1;
        }

        public T next() {
            if (this.f31834g == -1) {
                m39877a();
            }
            if (this.f31834g != 0) {
                T t = this.f31835h;
                this.f31835h = null;
                this.f31834g = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C12073e(C12079h<? extends T> hVar, boolean z, C9113l<? super T, Boolean> lVar) {
        C10202j.m34178b(hVar, "sequence");
        C10202j.m34178b(lVar, "predicate");
        this.f31830a = hVar;
        this.f31831b = z;
        this.f31832c = lVar;
    }

    public Iterator<T> iterator() {
        return new C12074a(this);
    }
}
