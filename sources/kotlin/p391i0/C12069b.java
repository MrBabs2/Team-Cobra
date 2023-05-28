package kotlin.p391i0;

import java.util.Iterator;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.p258c0.C10190a;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo16641d2 = {"Lkotlin/sequences/DropSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", "count", "", "(Lkotlin/sequences/Sequence;I)V", "drop", "n", "iterator", "", "take", "kotlin-stdlib"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: kotlin.i0.b */
/* compiled from: Sequences.kt */
public final class C12069b<T> implements C12079h<T>, C12071c<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C12079h<T> f31825a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f31826b;

    /* renamed from: kotlin.i0.b$a */
    /* compiled from: Sequences.kt */
    public static final class C12070a implements Iterator<T>, C10190a {

        /* renamed from: f */
        private final Iterator<T> f31827f;

        /* renamed from: g */
        private int f31828g;

        C12070a(C12069b bVar) {
            this.f31827f = bVar.f31825a.iterator();
            this.f31828g = bVar.f31826b;
        }

        /* renamed from: a */
        private final void m39870a() {
            while (this.f31828g > 0 && this.f31827f.hasNext()) {
                this.f31827f.next();
                this.f31828g--;
            }
        }

        public boolean hasNext() {
            m39870a();
            return this.f31827f.hasNext();
        }

        public T next() {
            m39870a();
            return this.f31827f.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C12069b(C12079h<? extends T> hVar, int i) {
        C10202j.m34178b(hVar, "sequence");
        this.f31825a = hVar;
        this.f31826b = i;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + this.f31826b + '.').toString());
        }
    }

    public Iterator<T> iterator() {
        return new C12070a(this);
    }

    /* renamed from: a */
    public C12079h<T> mo38701a(int i) {
        int i2 = this.f31826b + i;
        return i2 < 0 ? new C12069b(this, i) : new C12069b(this.f31825a, i2);
    }
}
