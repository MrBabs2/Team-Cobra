package kotlin.p392j0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C10221n;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.p258c0.C10190a;
import kotlin.p215c0.p216c.C9117p;
import kotlin.p220g0.C9146c;
import kotlin.p391i0.C12079h;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012:\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\t¢\u0006\u0002\b\u000e¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0002RB\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\t¢\u0006\u0002\b\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo16641d2 = {"Lkotlin/text/DelimitedRangesSequence;", "Lkotlin/sequences/Sequence;", "Lkotlin/ranges/IntRange;", "input", "", "startIndex", "", "limit", "getNextMatch", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "currentIndex", "Lkotlin/Pair;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/CharSequence;IILkotlin/jvm/functions/Function2;)V", "iterator", "", "kotlin-stdlib"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: kotlin.j0.d */
/* compiled from: Strings.kt */
final class C12101d implements C12079h<C9146c> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final CharSequence f31870a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f31871b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f31872c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C9117p<CharSequence, Integer, C10221n<Integer, Integer>> f31873d;

    /* renamed from: kotlin.j0.d$a */
    /* compiled from: Strings.kt */
    public static final class C12102a implements Iterator<C9146c>, C10190a {

        /* renamed from: f */
        private int f31874f = -1;

        /* renamed from: g */
        private int f31875g;

        /* renamed from: h */
        private int f31876h;

        /* renamed from: i */
        private C9146c f31877i;

        /* renamed from: j */
        private int f31878j;

        /* renamed from: k */
        final /* synthetic */ C12101d f31879k;

        C12102a(C12101d dVar) {
            this.f31879k = dVar;
            int a = C9150f.m29848a(dVar.f31871b, 0, dVar.f31870a.length());
            this.f31875g = a;
            this.f31876h = a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
            if (r0 < kotlin.p392j0.C12101d.m39948c(r6.f31879k)) goto L_0x0023;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m39950a() {
            /*
                r6 = this;
                int r0 = r6.f31876h
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r6.f31874f = r1
                r0 = 0
                r6.f31877i = r0
                goto L_0x009e
            L_0x000c:
                kotlin.j0.d r0 = r6.f31879k
                int r0 = r0.f31872c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0023
                int r0 = r6.f31878j
                int r0 = r0 + r3
                r6.f31878j = r0
                kotlin.j0.d r4 = r6.f31879k
                int r4 = r4.f31872c
                if (r0 >= r4) goto L_0x0031
            L_0x0023:
                int r0 = r6.f31876h
                kotlin.j0.d r4 = r6.f31879k
                java.lang.CharSequence r4 = r4.f31870a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0047
            L_0x0031:
                int r0 = r6.f31875g
                kotlin.g0.c r1 = new kotlin.g0.c
                kotlin.j0.d r4 = r6.f31879k
                java.lang.CharSequence r4 = r4.f31870a
                int r4 = kotlin.p392j0.C12131w.m40105c(r4)
                r1.<init>(r0, r4)
                r6.f31877i = r1
                r6.f31876h = r2
                goto L_0x009c
            L_0x0047:
                kotlin.j0.d r0 = r6.f31879k
                kotlin.c0.c.p r0 = r0.f31873d
                kotlin.j0.d r4 = r6.f31879k
                java.lang.CharSequence r4 = r4.f31870a
                int r5 = r6.f31876h
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                kotlin.n r0 = (kotlin.C10221n) r0
                if (r0 != 0) goto L_0x0077
                int r0 = r6.f31875g
                kotlin.g0.c r1 = new kotlin.g0.c
                kotlin.j0.d r4 = r6.f31879k
                java.lang.CharSequence r4 = r4.f31870a
                int r4 = kotlin.p392j0.C12131w.m40105c(r4)
                r1.<init>(r0, r4)
                r6.f31877i = r1
                r6.f31876h = r2
                goto L_0x009c
            L_0x0077:
                java.lang.Object r2 = r0.mo35389a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.mo35390b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f31875g
                kotlin.g0.c r4 = kotlin.p220g0.C9150f.m29854d(r4, r2)
                r6.f31877i = r4
                int r2 = r2 + r0
                r6.f31875g = r2
                if (r0 != 0) goto L_0x0099
                r1 = 1
            L_0x0099:
                int r2 = r2 + r1
                r6.f31876h = r2
            L_0x009c:
                r6.f31874f = r3
            L_0x009e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p392j0.C12101d.C12102a.m39950a():void");
        }

        public boolean hasNext() {
            if (this.f31874f == -1) {
                m39950a();
            }
            return this.f31874f == 1;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public C9146c next() {
            if (this.f31874f == -1) {
                m39950a();
            }
            if (this.f31874f != 0) {
                C9146c cVar = this.f31877i;
                if (cVar != null) {
                    this.f31877i = null;
                    this.f31874f = -1;
                    return cVar;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            throw new NoSuchElementException();
        }
    }

    public C12101d(CharSequence charSequence, int i, int i2, C9117p<? super CharSequence, ? super Integer, C10221n<Integer, Integer>> pVar) {
        C10202j.m34178b(charSequence, "input");
        C10202j.m34178b(pVar, "getNextMatch");
        this.f31870a = charSequence;
        this.f31871b = i;
        this.f31872c = i2;
        this.f31873d = pVar;
    }

    public Iterator<C9146c> iterator() {
        return new C12102a(this);
    }
}
