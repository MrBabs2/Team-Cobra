package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C10483v;
import kotlin.jvm.internal.C10202j;
import kotlin.p042a0.C9064d;
import kotlin.p042a0.C9069g;
import kotlin.p042a0.p043j.p044a.C9085d;
import kotlinx.coroutines.p393g2.C12230o;
import kotlinx.coroutines.p393g2.C12234s;

/* renamed from: kotlinx.coroutines.o0 */
/* compiled from: DispatchedContinuation.kt */
public final class C12290o0<T> extends C12304r0<T> implements C9085d, C9064d<T> {

    /* renamed from: n */
    private static final AtomicReferenceFieldUpdater f32099n = AtomicReferenceFieldUpdater.newUpdater(C12290o0.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: i */
    public Object f32100i = C12295p0.f32110a;

    /* renamed from: j */
    private final C9085d f32101j;

    /* renamed from: k */
    public final Object f32102k;

    /* renamed from: l */
    public final C12324y f32103l;

    /* renamed from: m */
    public final C9064d<T> f32104m;

    public C12290o0(C12324y yVar, C9064d<? super T> dVar) {
        super(0);
        this.f32103l = yVar;
        this.f32104m = dVar;
        C9064d<T> dVar2 = this.f32104m;
        this.f32101j = (C9085d) (!(dVar2 instanceof C9085d) ? null : dVar2);
        this.f32102k = C12234s.m40332a(getContext());
        this._reusableCancellableContinuation = null;
    }

    /* renamed from: a */
    public C9064d<T> mo38927a() {
        return this;
    }

    /* renamed from: a */
    public final boolean mo38993a(C12247i<?> iVar) {
        Object obj = this._reusableCancellableContinuation;
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof C12247i) || obj == iVar) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public Object mo38930b() {
        Object obj = this.f32100i;
        if (C12248i0.m40396a()) {
            if (!(obj != C12295p0.f32110a)) {
                throw new AssertionError();
            }
        }
        this.f32100i = C12295p0.f32110a;
        return obj;
    }

    /* renamed from: c */
    public final C12247i<?> mo38994c() {
        Object obj = this._reusableCancellableContinuation;
        if (!(obj instanceof C12247i)) {
            obj = null;
        }
        return (C12247i) obj;
    }

    public C9085d getCallerFrame() {
        return this.f32101j;
    }

    public C9069g getContext() {
        return this.f32104m.getContext();
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public void resumeWith(Object obj) {
        C9069g context;
        Object b;
        C9069g context2 = this.f32104m.getContext();
        Object a = C12306s.m40631a(obj);
        if (this.f32103l.mo38846b(context2)) {
            this.f32100i = a;
            this.f32124h = 0;
            this.f32103l.mo38845a(context2, this);
            return;
        }
        C12322x0 a2 = C12335z1.f32157b.mo39062a();
        if (a2.mo39044o()) {
            this.f32100i = a;
            this.f32124h = 0;
            a2.mo39040a((C12304r0<?>) this);
            return;
        }
        a2.mo39042b(true);
        try {
            context = getContext();
            b = C12234s.m40334b(context, this.f32102k);
            this.f32104m.resumeWith(obj);
            C10483v vVar = C10483v.f28357a;
            C12234s.m40333a(context, b);
            do {
            } while (a2.mo39046q());
        } catch (Throwable th) {
            try {
                mo39032a(th, (Throwable) null);
            } catch (Throwable th2) {
                a2.mo39041a(true);
                throw th2;
            }
        }
        a2.mo39041a(true);
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f32103l + ", " + C12256j0.m40410a((C9064d<?>) this.f32104m) + ']';
    }

    /* renamed from: a */
    public final Throwable mo38991a(C12242h<?> hVar) {
        C12230o oVar;
        do {
            Object obj = this._reusableCancellableContinuation;
            oVar = C12295p0.f32111b;
            if (obj != oVar) {
                if (obj == null) {
                    return null;
                }
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                } else if (f32099n.compareAndSet(this, obj, (Object) null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        } while (!f32099n.compareAndSet(this, oVar, hVar));
        return null;
    }

    /* renamed from: a */
    public final boolean mo38992a(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (C10202j.m34176a(obj, (Object) C12295p0.f32111b)) {
                if (f32099n.compareAndSet(this, C12295p0.f32111b, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (f32099n.compareAndSet(this, obj, (Object) null)) {
                    return false;
                }
            }
        }
    }
}
