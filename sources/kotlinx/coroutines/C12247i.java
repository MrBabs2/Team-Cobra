package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C10483v;
import kotlin.p042a0.C9064d;
import kotlin.p042a0.C9069g;
import kotlin.p042a0.p043j.p044a.C9085d;
import kotlin.p215c0.p216c.C9113l;
import kotlinx.coroutines.C12277k1;
import kotlinx.coroutines.p393g2.C12229n;

/* renamed from: kotlinx.coroutines.i */
/* compiled from: CancellableContinuationImpl.kt */
public class C12247i<T> extends C12304r0<T> implements C12242h<T>, C9085d {

    /* renamed from: k */
    private static final AtomicIntegerFieldUpdater f32020k = AtomicIntegerFieldUpdater.newUpdater(C12247i.class, "_decision");

    /* renamed from: l */
    private static final AtomicReferenceFieldUpdater f32021l = AtomicReferenceFieldUpdater.newUpdater(C12247i.class, Object.class, "_state");
    private volatile int _decision = 0;
    private volatile Object _parentHandle = null;
    private volatile Object _state = C12178b.f31947f;

    /* renamed from: i */
    private final C9069g f32022i;

    /* renamed from: j */
    private final C9064d<T> f32023j;

    public C12247i(C9064d<? super T> dVar, int i) {
        super(i);
        this.f32023j = dVar;
        this.f32022i = dVar.getContext();
    }

    /* renamed from: c */
    private final boolean m40373c(Throwable th) {
        if (this.f32124h != 0) {
            return false;
        }
        C9064d<T> dVar = this.f32023j;
        if (!(dVar instanceof C12290o0)) {
            dVar = null;
        }
        C12290o0 o0Var = (C12290o0) dVar;
        if (o0Var != null) {
            return o0Var.mo38992a(th);
        }
        return false;
    }

    /* renamed from: i */
    private final boolean m40374i() {
        Throwable a;
        boolean g = mo38937g();
        if (this.f32124h != 0) {
            return g;
        }
        C9064d<T> dVar = this.f32023j;
        if (!(dVar instanceof C12290o0)) {
            dVar = null;
        }
        C12290o0 o0Var = (C12290o0) dVar;
        if (o0Var == null || (a = o0Var.mo38991a((C12242h<?>) this)) == null) {
            return g;
        }
        if (!g) {
            mo38929a(a);
        }
        return true;
    }

    /* renamed from: j */
    private final void m40375j() {
        if (!m40377l()) {
            mo38933c();
        }
    }

    /* renamed from: k */
    private final C12313u0 m40376k() {
        return (C12313u0) this._parentHandle;
    }

    /* renamed from: l */
    private final boolean m40377l() {
        C9064d<T> dVar = this.f32023j;
        return (dVar instanceof C12290o0) && ((C12290o0) dVar).mo38993a((C12247i<?>) this);
    }

    /* renamed from: m */
    private final void m40378m() {
        C12277k1 k1Var;
        if (!m40374i() && m40376k() == null && (k1Var = (C12277k1) this.f32023j.getContext().get(C12277k1.f32093e)) != null) {
            k1Var.start();
            C12313u0 a = C12277k1.C12278a.m40495a(k1Var, true, false, new C12280l(k1Var, this), 2, (Object) null);
            m40370a(a);
            if (mo38937g() && !m40377l()) {
                a.dispose();
                m40370a((C12313u0) C12314u1.f32138f);
            }
        }
    }

    /* renamed from: n */
    private final boolean m40379n() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f32020k.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: o */
    private final boolean m40380o() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f32020k.compareAndSet(this, 0, 1));
        return true;
    }

    /* renamed from: a */
    public final C9064d<T> mo38927a() {
        return this.f32023j;
    }

    /* renamed from: b */
    public Object mo38930b() {
        return mo38935e();
    }

    /* renamed from: d */
    public final Object mo38934d() {
        C12277k1 k1Var;
        m40378m();
        if (m40380o()) {
            return C9081d.m29785a();
        }
        Object e = mo38935e();
        if (e instanceof C12303r) {
            Throwable th = ((C12303r) e).f32123a;
            if (C12248i0.m40399d()) {
                th = C12229n.m40317b(th, this);
            }
            throw th;
        } else if (this.f32124h != 1 || (k1Var = (C12277k1) getContext().get(C12277k1.f32093e)) == null || k1Var.mo38813b()) {
            return mo38931b(e);
        } else {
            Throwable d = k1Var.mo38984d();
            mo38928a(e, d);
            if (C12248i0.m40399d()) {
                d = C12229n.m40317b(d, this);
            }
            throw d;
        }
    }

    /* renamed from: e */
    public final Object mo38935e() {
        return this._state;
    }

    /* renamed from: f */
    public void mo38936f() {
        m40378m();
    }

    /* renamed from: g */
    public boolean mo38937g() {
        return !(mo38935e() instanceof C12317v1);
    }

    public C9085d getCallerFrame() {
        C9064d<T> dVar = this.f32023j;
        if (!(dVar instanceof C9085d)) {
            dVar = null;
        }
        return (C9085d) dVar;
    }

    public C9069g getContext() {
        return this.f32022i;
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public String mo38938h() {
        return "CancellableContinuation";
    }

    public void resumeWith(Object obj) {
        m40367a(C12306s.m40633a(obj, (C12242h<?>) this), this.f32124h);
    }

    public String toString() {
        return mo38938h() + '(' + C12256j0.m40410a((C9064d<?>) this.f32023j) + "){" + mo38935e() + "}@" + C12256j0.m40411b(this);
    }

    /* renamed from: a */
    private final void m40370a(C12313u0 u0Var) {
        this._parentHandle = u0Var;
    }

    /* renamed from: b */
    public final void mo38932b(Throwable th) {
        if (!m40373c(th)) {
            mo38929a(th);
            m40375j();
        }
    }

    /* renamed from: a */
    public void mo38928a(Object obj, Throwable th) {
        if (obj instanceof C12312u) {
            try {
                ((C12312u) obj).f32137b.invoke(th);
            } catch (Throwable th2) {
                C9069g context = getContext();
                C12175a0.m40204a(context, (Throwable) new CompletionHandlerException("Exception in cancellation handler for " + this, th2));
            }
        }
    }

    /* renamed from: c */
    private final void m40372c(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    /* renamed from: b */
    private final C12199f m40371b(C9113l<? super Throwable, C10483v> lVar) {
        return lVar instanceof C12199f ? (C12199f) lVar : new C12244h1(lVar);
    }

    /* renamed from: c */
    public final void mo38933c() {
        C12313u0 k = m40376k();
        if (k != null) {
            k.dispose();
        }
        m40370a((C12313u0) C12314u1.f32138f);
    }

    /* renamed from: b */
    public <T> T mo38931b(Object obj) {
        if (obj instanceof C12309t) {
            return ((C12309t) obj).f32133a;
        }
        return obj instanceof C12312u ? ((C12312u) obj).f32136a : obj;
    }

    /* renamed from: a */
    public Throwable mo38926a(C12277k1 k1Var) {
        return k1Var.mo38984d();
    }

    /* renamed from: a */
    private final void m40369a(C9113l<? super Throwable, C10483v> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    /* renamed from: a */
    private final void m40368a(int i) {
        if (!m40379n()) {
            C12307s0.m40635a(this, i);
        }
    }

    /* renamed from: a */
    public void mo38924a(C12324y yVar, T t) {
        C9064d<T> dVar = this.f32023j;
        C12324y yVar2 = null;
        if (!(dVar instanceof C12290o0)) {
            dVar = null;
        }
        C12290o0 o0Var = (C12290o0) dVar;
        if (o0Var != null) {
            yVar2 = o0Var.f32103l;
        }
        m40367a((Object) t, yVar2 == yVar ? 2 : this.f32124h);
    }

    /* renamed from: a */
    public boolean mo38929a(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof C12317v1)) {
                return false;
            }
            z = obj instanceof C12199f;
        } while (!f32021l.compareAndSet(this, obj, new C12275k(this, th, z)));
        if (z) {
            try {
                ((C12199f) obj).mo38853a(th);
            } catch (Throwable th2) {
                C9069g context = getContext();
                C12175a0.m40204a(context, (Throwable) new CompletionHandlerException("Exception in cancellation handler for " + this, th2));
            }
        }
        m40375j();
        m40368a(0);
        return true;
    }

    /* renamed from: a */
    public void mo38923a(C9113l<? super Throwable, C10483v> lVar) {
        Object obj;
        Throwable th = null;
        C12199f fVar = null;
        do {
            obj = this._state;
            if (obj instanceof C12178b) {
                if (fVar == null) {
                    fVar = m40371b(lVar);
                }
            } else if (obj instanceof C12199f) {
                m40369a(lVar, obj);
                throw null;
            } else if (!(obj instanceof C12275k)) {
                return;
            } else {
                if (((C12275k) obj).mo39029b()) {
                    try {
                        if (!(obj instanceof C12303r)) {
                            obj = null;
                        }
                        C12303r rVar = (C12303r) obj;
                        if (rVar != null) {
                            th = rVar.f32123a;
                        }
                        lVar.invoke(th);
                        return;
                    } catch (Throwable th2) {
                        C12175a0.m40204a(getContext(), (Throwable) new CompletionHandlerException("Exception in cancellation handler for " + this, th2));
                        return;
                    }
                } else {
                    m40369a(lVar, obj);
                    throw null;
                }
            }
        } while (!f32021l.compareAndSet(this, obj, fVar));
    }

    /* renamed from: a */
    private final C12275k m40367a(Object obj, int i) {
        Object obj2;
        do {
            obj2 = this._state;
            if (!(obj2 instanceof C12317v1)) {
                if (obj2 instanceof C12275k) {
                    C12275k kVar = (C12275k) obj2;
                    if (kVar.mo38978c()) {
                        return kVar;
                    }
                }
                m40372c(obj);
                throw null;
            }
        } while (!f32021l.compareAndSet(this, obj2, obj));
        m40375j();
        m40368a(i);
        return null;
    }
}
