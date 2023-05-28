package kotlin.p220g0;

import kotlin.C4789l;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0014B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0002J\u0013\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, mo16641d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/IntProgression;", "Lkotlin/ranges/ClosedRange;", "", "start", "endInclusive", "(II)V", "getEndInclusive", "()Ljava/lang/Integer;", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: kotlin.g0.c */
/* compiled from: Ranges.kt */
public final class C9146c extends C9143a {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C9146c f25688j = new C9146c(1, 0);

    /* renamed from: k */
    public static final C9147a f25689k = new C9147a((DefaultConstructorMarker) null);

    /* renamed from: kotlin.g0.c$a */
    /* compiled from: Ranges.kt */
    public static final class C9147a {
        private C9147a() {
        }

        /* renamed from: a */
        public final C9146c mo33497a() {
            return C9146c.f25688j;
        }

        public /* synthetic */ C9147a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C9146c(int i, int i2) {
        super(i, i2, 1);
    }

    /* renamed from: b */
    public Integer mo33494b() {
        return Integer.valueOf(getLast());
    }

    /* renamed from: c */
    public Integer mo33495c() {
        return Integer.valueOf(getFirst());
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9146c) {
            if (!isEmpty() || !((C9146c) obj).isEmpty()) {
                C9146c cVar = (C9146c) obj;
                if (!(getFirst() == cVar.getFirst() && getLast() == cVar.getLast())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public boolean mo33496h(int i) {
        return getFirst() <= i && i <= getLast();
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getFirst() * 31) + getLast();
    }

    public boolean isEmpty() {
        return getFirst() > getLast();
    }

    public String toString() {
        return getFirst() + ".." + getLast();
    }
}
