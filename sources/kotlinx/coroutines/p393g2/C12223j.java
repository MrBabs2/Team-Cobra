package kotlinx.coroutines.p393g2;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C4789l;
import kotlinx.coroutines.C12248i0;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0016\b\u0000\u0018\u0000 /*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002/0B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000e2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0013J-\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001b\"\u0004\b\u0001\u0010\u00182\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\"\u0010#J3\u0010&\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u000e2\u0006\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003H\u0002¢\u0006\u0004\b&\u0010'R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010(R\u0013\u0010)\u001a\u00020\u00058F@\u0006¢\u0006\u0006\u001a\u0004\b)\u0010\u0013R\u0016\u0010*\u001a\u00020\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010(R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010+R\u0013\u0010.\u001a\u00020\u00038F@\u0006¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00061"}, mo16641d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "", "E", "", "capacity", "", "singleConsumer", "<init>", "(IZ)V", "element", "addLast", "(Ljava/lang/Object;)I", "", "state", "Lkotlinx/coroutines/internal/Core;", "allocateNextCopy", "(J)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "allocateOrGetNextCopy", "close", "()Z", "index", "fillPlaceholder", "(ILjava/lang/Object;)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "isClosed", "R", "Lkotlin/Function1;", "transform", "", "map", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "markFrozen", "()J", "next", "()Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "removeFirstOrNull", "()Ljava/lang/Object;", "oldHead", "newHead", "removeSlowPath", "(II)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "I", "isEmpty", "mask", "Z", "getSize", "()I", "size", "Companion", "Placeholder", "kotlinx-coroutines-core"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.g2.j */
/* compiled from: LockFreeTaskQueue.kt */
public final class C12223j<E> {

    /* renamed from: e */
    private static final AtomicReferenceFieldUpdater f31992e;

    /* renamed from: f */
    private static final AtomicLongFieldUpdater f31993f;

    /* renamed from: g */
    public static final C12230o f31994g = new C12230o("REMOVE_FROZEN");

    /* renamed from: h */
    public static final C12224a f31995h = new C12224a((DefaultConstructorMarker) null);
    private volatile Object _next = null;
    private volatile long _state = 0;

    /* renamed from: a */
    private final int f31996a;

    /* renamed from: b */
    private AtomicReferenceArray f31997b = new AtomicReferenceArray(this.f31998c);

    /* renamed from: c */
    private final int f31998c;

    /* renamed from: d */
    private final boolean f31999d;

    /* renamed from: kotlinx.coroutines.g2.j$a */
    /* compiled from: LockFreeTaskQueue.kt */
    public static final class C12224a {
        private C12224a() {
        }

        /* renamed from: a */
        public final int mo38893a(long j) {
            return (j & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* renamed from: a */
        public final long mo38894a(long j, int i) {
            return mo38895a(j, 1073741823) | (((long) i) << 0);
        }

        /* renamed from: a */
        public final long mo38895a(long j, long j2) {
            return j & (j2 ^ -1);
        }

        /* renamed from: b */
        public final long mo38896b(long j, int i) {
            return mo38895a(j, 1152921503533105152L) | (((long) i) << 30);
        }

        public /* synthetic */ C12224a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: kotlinx.coroutines.g2.j$b */
    /* compiled from: LockFreeTaskQueue.kt */
    public static final class C12225b {

        /* renamed from: a */
        public final int f32000a;

        public C12225b(int i) {
            this.f32000a = i;
        }
    }

    static {
        Class<C12223j> cls = C12223j.class;
        f31992e = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f31993f = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public C12223j(int i, boolean z) {
        this.f31998c = i;
        this.f31999d = z;
        boolean z2 = true;
        this.f31996a = i - 1;
        if (this.f31996a <= 1073741823) {
            if (!((this.f31998c & this.f31996a) != 0 ? false : z2)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: a */
    private final C12223j<E> m40287a(int i, E e) {
        Object obj = this.f31997b.get(this.f31996a & i);
        if (!(obj instanceof C12225b) || ((C12225b) obj).f32000a != i) {
            return null;
        }
        this.f31997b.set(i & this.f31996a, e);
        return this;
    }

    /* renamed from: f */
    private final long m40290f() {
        long j;
        long j2;
        do {
            j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!f31993f.compareAndSet(this, j, j2));
        return j2;
    }

    /* renamed from: b */
    public final int mo38889b() {
        long j = this._state;
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0)));
    }

    /* renamed from: c */
    public final boolean mo38890c() {
        long j = this._state;
        return ((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* renamed from: d */
    public final C12223j<E> mo38891d() {
        return m40289b(m40290f());
    }

    /* renamed from: e */
    public final Object mo38892e() {
        while (true) {
            long j = this._state;
            if ((1152921504606846976L & j) != 0) {
                return f31994g;
            }
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f31996a;
            if ((i2 & i3) == (i & i3)) {
                return null;
            }
            Object obj = this.f31997b.get(i3 & i);
            if (obj == null) {
                if (this.f31999d) {
                    return null;
                }
            } else if (obj instanceof C12225b) {
                return null;
            } else {
                int i4 = (i + 1) & 1073741823;
                if (f31993f.compareAndSet(this, j, f31995h.mo38894a(j, i4))) {
                    this.f31997b.set(this.f31996a & i, (Object) null);
                    return obj;
                } else if (this.f31999d) {
                    C12223j jVar = this;
                    do {
                        jVar = jVar.m40286a(i, i4);
                    } while (jVar != null);
                    return obj;
                }
            }
        }
    }

    /* renamed from: b */
    private final C12223j<E> m40289b(long j) {
        while (true) {
            C12223j<E> jVar = (C12223j) this._next;
            if (jVar != null) {
                return jVar;
            }
            f31992e.compareAndSet(this, (Object) null, m40288a(j));
        }
    }

    /* renamed from: a */
    private final C12223j<E> m40288a(long j) {
        C12223j<E> jVar = new C12223j<>(this.f31998c * 2, this.f31999d);
        int i = (int) ((1073741823 & j) >> 0);
        int i2 = (int) ((1152921503533105152L & j) >> 30);
        while (true) {
            int i3 = this.f31996a;
            if ((i & i3) != (i2 & i3)) {
                Object obj = this.f31997b.get(i3 & i);
                if (obj == null) {
                    obj = new C12225b(i);
                }
                jVar.f31997b.set(jVar.f31996a & i, obj);
                i++;
            } else {
                jVar._state = f31995h.mo38895a(j, 1152921504606846976L);
                return jVar;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo38888a() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f31993f.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0068 A[LOOP:1: B:19:0x0068->B:22:0x007a, LOOP_START, PHI: r0 
      PHI: (r0v15 kotlinx.coroutines.g2.j) = (r0v14 kotlinx.coroutines.g2.j), (r0v17 kotlinx.coroutines.g2.j) binds: [B:18:0x0060, B:22:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo38887a(E r13) {
        /*
            r12 = this;
        L_0x0000:
            long r2 = r12._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0012
            kotlinx.coroutines.g2.j$a r13 = f31995h
            int r13 = r13.mo38893a(r2)
            return r13
        L_0x0012:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r2
            r8 = 0
            long r0 = r0 >> r8
            int r1 = (int) r0
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r0 = 30
            long r4 = r4 >> r0
            int r9 = (int) r4
            int r10 = r12.f31996a
            int r0 = r9 + 2
            r0 = r0 & r10
            r4 = r1 & r10
            r5 = 1
            if (r0 != r4) goto L_0x002e
            return r5
        L_0x002e:
            boolean r0 = r12.f31999d
            r4 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 != 0) goto L_0x004d
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.f31997b
            r11 = r9 & r10
            java.lang.Object r0 = r0.get(r11)
            if (r0 == 0) goto L_0x004d
            int r0 = r12.f31998c
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 < r2) goto L_0x004c
            int r9 = r9 - r1
            r1 = r9 & r4
            int r0 = r0 >> 1
            if (r1 <= r0) goto L_0x0000
        L_0x004c:
            return r5
        L_0x004d:
            int r0 = r9 + 1
            r0 = r0 & r4
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = f31993f
            kotlinx.coroutines.g2.j$a r4 = f31995h
            long r4 = r4.mo38896b(r2, r0)
            r0 = r1
            r1 = r12
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.f31997b
            r1 = r9 & r10
            r0.set(r1, r13)
            r0 = r12
        L_0x0068:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0072
            goto L_0x007d
        L_0x0072:
            kotlinx.coroutines.g2.j r0 = r0.mo38891d()
            kotlinx.coroutines.g2.j r0 = r0.m40287a((int) r9, r13)
            if (r0 == 0) goto L_0x007d
            goto L_0x0068
        L_0x007d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p393g2.C12223j.mo38887a(java.lang.Object):int");
    }

    /* renamed from: a */
    private final C12223j<E> m40286a(int i, int i2) {
        long j;
        int i3;
        do {
            j = this._state;
            boolean z = false;
            i3 = (int) ((1073741823 & j) >> 0);
            if (C12248i0.m40396a()) {
                if (i3 == i) {
                    z = true;
                }
                if (!z) {
                    throw new AssertionError();
                }
            }
            if ((1152921504606846976L & j) != 0) {
                return mo38891d();
            }
        } while (!f31993f.compareAndSet(this, j, f31995h.mo38894a(j, i2)));
        this.f31997b.set(this.f31996a & i3, (Object) null);
        return null;
    }
}
