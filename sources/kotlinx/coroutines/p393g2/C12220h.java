package kotlinx.coroutines.p393g2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\f\b\u0017\u0018\u00002\u00020C:\u0005JKLMNB\u0007¢\u0006\u0004\b\u0001\u0010\u0002J\u0019\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u0003¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000b\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\u000e\b\u0004\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\b¢\u0006\u0004\b\u000b\u0010\fJ4\u0010\u000f\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\u0016\u0010\u000e\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0003\u0012\u0004\u0012\u00020\t0\rH\b¢\u0006\u0004\b\u000f\u0010\u0010JD\u0010\u0011\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\u0016\u0010\u000e\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0003\u0012\u0004\u0012\u00020\t0\r2\u000e\b\u0004\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\b¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u0003H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u001a\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d\"\f\b\u0000\u0010\u001c*\u00060\u0000j\u0002`\u00032\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\f\u0012\b\u0012\u00060\u0000j\u0002`\u00030 ¢\u0006\u0004\b!\u0010\"J \u0010$\u001a\u00060\u0000j\u0002`\u00032\n\u0010#\u001a\u00060\u0000j\u0002`\u0003H\u0010¢\u0006\u0004\b$\u0010%J\u001b\u0010&\u001a\u00020\u00052\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u0003H\u0002¢\u0006\u0004\b&\u0010\u0007J\r\u0010'\u001a\u00020\u0005¢\u0006\u0004\b'\u0010\u0002J\u000f\u0010(\u001a\u00020\u0005H\u0001¢\u0006\u0004\b(\u0010\u0002J,\u0010*\u001a\u00020)2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\u000e\b\u0004\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\b¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0003H\u0014¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\tH\u0016¢\u0006\u0004\b.\u0010/J.\u00100\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u001c\u0018\u00012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\rH\b¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b2\u0010-J\u0017\u00103\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0003H\u0001¢\u0006\u0004\b3\u0010-J\u000f\u00105\u001a\u000204H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J/\u0010<\u001a\u00020;2\n\u0010\u0004\u001a\u00060\u0000j\u0002`\u00032\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u00032\u0006\u0010:\u001a\u00020)H\u0001¢\u0006\u0004\b<\u0010=J'\u0010A\u001a\u00020\u00052\n\u0010>\u001a\u00060\u0000j\u0002`\u00032\n\u0010\u0013\u001a\u00060\u0000j\u0002`\u0003H\u0000¢\u0006\u0004\b?\u0010@R\u0016\u0010B\u001a\u00020\t8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\bB\u0010/R\u0013\u0010\u0013\u001a\u00020C8F@\u0006¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0017\u0010G\u001a\u00060\u0000j\u0002`\u00038F@\u0006¢\u0006\u0006\u001a\u0004\bF\u0010-R\u0017\u0010I\u001a\u00060\u0000j\u0002`\u00038F@\u0006¢\u0006\u0006\u001a\u0004\bH\u0010-¨\u0006O"}, mo16641d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "<init>", "()V", "Lkotlinx/coroutines/internal/Node;", "node", "", "addLast", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "Lkotlin/Function0;", "", "condition", "addLastIf", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function0;)Z", "Lkotlin/Function1;", "predicate", "addLastIfPrev", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function1;)Z", "addLastIfPrevAndIf", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Z", "next", "addNext", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Z", "addOneIfEmpty", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Z", "Lkotlinx/coroutines/internal/OpDescriptor;", "op", "correctPrev", "(Lkotlinx/coroutines/internal/OpDescriptor;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "T", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "describeAddLast", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "describeRemoveFirst", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "current", "findPrevNonRemoved", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "finishAdd", "helpRemove", "helpRemovePrev", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "makeCondAddOp", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "nextIfRemoved", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "remove", "()Z", "removeFirstIfIsInstanceOfOrPeekIf", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "removeFirstOrNull", "removeOrNext", "Lkotlinx/coroutines/internal/Removed;", "removed", "()Lkotlinx/coroutines/internal/Removed;", "", "toString", "()Ljava/lang/String;", "condAdd", "", "tryCondAddNext", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;)I", "prev", "validateNode$kotlinx_coroutines_core", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "validateNode", "isRemoved", "", "getNext", "()Ljava/lang/Object;", "getNextNode", "nextNode", "getPrevNode", "prevNode", "AbstractAtomicDesc", "AddLastDesc", "CondAddOp", "PrepareOp", "RemoveFirstDesc", "kotlinx-coroutines-core"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: kotlinx.coroutines.g2.h */
/* compiled from: LockFreeLinkedList.kt */
public class C12220h {

    /* renamed from: f */
    static final AtomicReferenceFieldUpdater f31986f;

    /* renamed from: g */
    static final AtomicReferenceFieldUpdater f31987g;

    /* renamed from: h */
    private static final AtomicReferenceFieldUpdater f31988h;
    volatile Object _next = this;
    volatile Object _prev = this;
    private volatile Object _removedRef = null;

    /* renamed from: kotlinx.coroutines.g2.h$a */
    /* compiled from: LockFreeLinkedList.kt */
    public static abstract class C12221a extends C12208c<C12220h> {

        /* renamed from: b */
        public C12220h f31989b;

        /* renamed from: c */
        public final C12220h f31990c;

        public C12221a(C12220h hVar) {
            this.f31990c = hVar;
        }

        /* renamed from: a */
        public void mo38861a(C12220h hVar, Object obj) {
            boolean z = obj == null;
            C12220h hVar2 = z ? this.f31990c : this.f31989b;
            if (hVar2 != null && C12220h.f31986f.compareAndSet(hVar, this, hVar2) && z) {
                C12220h hVar3 = this.f31990c;
                C12220h hVar4 = this.f31989b;
                if (hVar4 != null) {
                    hVar3.m40270c(hVar4);
                } else {
                    C10202j.m34172a();
                    throw null;
                }
            }
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C12220h> cls2 = C12220h.class;
        f31986f = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f31987g = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        f31988h = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    /* renamed from: b */
    private final C12220h m40269b(C12220h hVar) {
        while (hVar.mo38873g()) {
            hVar = (C12220h) hVar._prev;
        }
        return hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m40270c(C12220h hVar) {
        C12220h hVar2;
        do {
            hVar2 = (C12220h) hVar._prev;
            if (mo38877d() != hVar) {
                return;
            }
        } while (!f31987g.compareAndSet(hVar, hVar2, this));
        if (mo38873g()) {
            hVar.m40267a((C12226k) null);
        }
    }

    /* renamed from: j */
    private final C12227l m40271j() {
        C12227l lVar = (C12227l) this._removedRef;
        if (lVar != null) {
            return lVar;
        }
        C12227l lVar2 = new C12227l(this);
        f31988h.lazySet(this, lVar2);
        return lVar2;
    }

    /* renamed from: d */
    public final Object mo38877d() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof C12226k)) {
                return obj;
            }
            ((C12226k) obj).mo38859a((Object) this);
        }
    }

    /* renamed from: e */
    public final C12220h mo38878e() {
        return C12219g.m40266a(mo38877d());
    }

    /* renamed from: f */
    public final C12220h mo38879f() {
        C12220h a = m40267a((C12226k) null);
        return a != null ? a : m40269b((C12220h) this._prev);
    }

    /* renamed from: g */
    public boolean mo38873g() {
        return mo38877d() instanceof C12227l;
    }

    /* renamed from: h */
    public boolean mo38874h() {
        return mo38880i() == null;
    }

    /* renamed from: i */
    public final C12220h mo38880i() {
        Object d;
        C12220h hVar;
        do {
            d = mo38877d();
            if (d instanceof C12227l) {
                return ((C12227l) d).f32001a;
            }
            if (d == this) {
                return (C12220h) d;
            }
            if (d != null) {
                hVar = (C12220h) d;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (!f31986f.compareAndSet(this, d, hVar.m40271j()));
        hVar.m40267a((C12226k) null);
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this));
    }

    /* renamed from: a */
    public final boolean mo38876a(C12220h hVar) {
        f31987g.lazySet(hVar, this);
        f31986f.lazySet(hVar, this);
        while (mo38877d() == this) {
            if (f31986f.compareAndSet(this, this, hVar)) {
                hVar.m40270c(this);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final int mo38875a(C12220h hVar, C12220h hVar2, C12221a aVar) {
        f31987g.lazySet(hVar, this);
        f31986f.lazySet(hVar, hVar2);
        aVar.f31989b = hVar2;
        if (!f31986f.compareAndSet(this, hVar2, aVar)) {
            return 0;
        }
        return aVar.mo38859a(this) == null ? 1 : 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (f31986f.compareAndSet(r3, r2, ((kotlinx.coroutines.p393g2.C12227l) r4).f32001a) != false) goto L_0x004b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlinx.coroutines.p393g2.C12220h m40267a(kotlinx.coroutines.p393g2.C12226k r7) {
        /*
            r6 = this;
        L_0x0000:
            java.lang.Object r0 = r6._prev
            kotlinx.coroutines.g2.h r0 = (kotlinx.coroutines.p393g2.C12220h) r0
            r1 = 0
            r2 = r0
        L_0x0006:
            r3 = r1
        L_0x0007:
            java.lang.Object r4 = r2._next
            if (r4 != r6) goto L_0x0018
            if (r0 != r2) goto L_0x000e
            return r2
        L_0x000e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f31987g
            boolean r0 = r1.compareAndSet(r6, r0, r2)
            if (r0 != 0) goto L_0x0017
            goto L_0x0000
        L_0x0017:
            return r2
        L_0x0018:
            boolean r5 = r6.mo38873g()
            if (r5 == 0) goto L_0x001f
            return r1
        L_0x001f:
            if (r4 != r7) goto L_0x0022
            return r2
        L_0x0022:
            boolean r5 = r4 instanceof kotlinx.coroutines.p393g2.C12226k
            if (r5 == 0) goto L_0x0038
            if (r7 == 0) goto L_0x0032
            r0 = r4
            kotlinx.coroutines.g2.k r0 = (kotlinx.coroutines.p393g2.C12226k) r0
            boolean r0 = r7.mo38897a((kotlinx.coroutines.p393g2.C12226k) r0)
            if (r0 == 0) goto L_0x0032
            return r1
        L_0x0032:
            kotlinx.coroutines.g2.k r4 = (kotlinx.coroutines.p393g2.C12226k) r4
            r4.mo38859a((java.lang.Object) r2)
            goto L_0x0000
        L_0x0038:
            boolean r5 = r4 instanceof kotlinx.coroutines.p393g2.C12227l
            if (r5 == 0) goto L_0x0052
            if (r3 == 0) goto L_0x004d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f31986f
            kotlinx.coroutines.g2.l r4 = (kotlinx.coroutines.p393g2.C12227l) r4
            kotlinx.coroutines.g2.h r4 = r4.f32001a
            boolean r2 = r5.compareAndSet(r3, r2, r4)
            if (r2 != 0) goto L_0x004b
            goto L_0x0000
        L_0x004b:
            r2 = r3
            goto L_0x0006
        L_0x004d:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.g2.h r2 = (kotlinx.coroutines.p393g2.C12220h) r2
            goto L_0x0007
        L_0x0052:
            if (r4 == 0) goto L_0x0059
            kotlinx.coroutines.g2.h r4 = (kotlinx.coroutines.p393g2.C12220h) r4
            r3 = r2
            r2 = r4
            goto L_0x0007
        L_0x0059:
            kotlin.TypeCastException r7 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"
            r7.<init>(r0)
            goto L_0x0062
        L_0x0061:
            throw r7
        L_0x0062:
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p393g2.C12220h.m40267a(kotlinx.coroutines.g2.k):kotlinx.coroutines.g2.h");
    }
}
