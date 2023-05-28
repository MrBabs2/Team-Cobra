package kotlin.p220g0;

import kotlin.C4789l;
import kotlin.jvm.internal.p258c0.C10190a;
import kotlin.p212b0.C9096c;
import kotlin.p262y.C10507e0;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\t\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0007\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, mo16641d2 = {"Lkotlin/ranges/IntProgression;", "", "", "start", "endInclusive", "step", "(III)V", "first", "getFirst", "()I", "last", "getLast", "getStep", "equals", "", "other", "", "hashCode", "isEmpty", "iterator", "Lkotlin/collections/IntIterator;", "toString", "", "Companion", "kotlin-stdlib"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: kotlin.g0.a */
/* compiled from: Progressions.kt */
public class C9143a implements Iterable<Integer>, C10190a {

    /* renamed from: i */
    public static final C9144a f25680i = new C9144a((DefaultConstructorMarker) null);

    /* renamed from: f */
    private final int f25681f;

    /* renamed from: g */
    private final int f25682g;

    /* renamed from: h */
    private final int f25683h;

    /* renamed from: kotlin.g0.a$a */
    /* compiled from: Progressions.kt */
    public static final class C9144a {
        private C9144a() {
        }

        /* renamed from: a */
        public final C9143a mo33491a(int i, int i2, int i3) {
            return new C9143a(i, i2, i3);
        }

        public /* synthetic */ C9144a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C9143a(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f25681f = i;
            this.f25682g = C9096c.m29801b(i, i2, i3);
            this.f25683h = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    /* renamed from: a */
    public final int mo33483a() {
        return this.f25683h;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9143a) {
            if (!isEmpty() || !((C9143a) obj).isEmpty()) {
                C9143a aVar = (C9143a) obj;
                if (!(this.f25681f == aVar.f25681f && this.f25682g == aVar.f25682g && this.f25683h == aVar.f25683h)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int getFirst() {
        return this.f25681f;
    }

    public final int getLast() {
        return this.f25682g;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f25681f * 31) + this.f25682g) * 31) + this.f25683h;
    }

    public boolean isEmpty() {
        if (this.f25683h > 0) {
            if (this.f25681f > this.f25682g) {
                return true;
            }
        } else if (this.f25681f < this.f25682g) {
            return true;
        }
        return false;
    }

    public String toString() {
        int i;
        StringBuilder sb;
        if (this.f25683h > 0) {
            sb = new StringBuilder();
            sb.append(this.f25681f);
            sb.append("..");
            sb.append(this.f25682g);
            sb.append(" step ");
            i = this.f25683h;
        } else {
            sb = new StringBuilder();
            sb.append(this.f25681f);
            sb.append(" downTo ");
            sb.append(this.f25682g);
            sb.append(" step ");
            i = -this.f25683h;
        }
        sb.append(i);
        return sb.toString();
    }

    public C10507e0 iterator() {
        return new C9145b(this.f25681f, this.f25682g, this.f25683h);
    }
}
