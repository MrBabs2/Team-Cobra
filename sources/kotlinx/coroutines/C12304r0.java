package kotlinx.coroutines;

import kotlin.C10222o;
import kotlin.C10225p;
import kotlin.C10483v;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.p042a0.C9064d;
import kotlin.p042a0.C9069g;
import kotlin.p042a0.p043j.p044a.C9085d;
import kotlinx.coroutines.p393g2.C12229n;
import kotlinx.coroutines.p393g2.C12234s;
import kotlinx.coroutines.p396j2.C12269i;
import kotlinx.coroutines.p396j2.C12270j;

/* renamed from: kotlinx.coroutines.r0 */
/* compiled from: DispatchedTask.kt */
public abstract class C12304r0<T> extends C12269i {

    /* renamed from: h */
    public int f32124h;

    public C12304r0(int i) {
        this.f32124h = i;
    }

    /* renamed from: a */
    public final Throwable mo39031a(Object obj) {
        if (!(obj instanceof C12303r)) {
            obj = null;
        }
        C12303r rVar = (C12303r) obj;
        if (rVar != null) {
            return rVar.f32123a;
        }
        return null;
    }

    /* renamed from: a */
    public abstract C9064d<T> mo38927a();

    /* renamed from: a */
    public void mo38928a(Object obj, Throwable th) {
    }

    /* renamed from: b */
    public abstract Object mo38930b();

    /* renamed from: b */
    public <T> T mo38931b(Object obj) {
        return obj;
    }

    public final void run() {
        Object obj;
        C9069g context;
        Object b;
        Object obj2;
        C12270j jVar = this.f32078g;
        try {
            C9064d a = mo38927a();
            if (a != null) {
                C12290o0 o0Var = (C12290o0) a;
                C9064d<T> dVar = o0Var.f32104m;
                context = dVar.getContext();
                Object b2 = mo38930b();
                b = C12234s.m40334b(context, o0Var.f32102k);
                Throwable a2 = mo39031a(b2);
                C12277k1 k1Var = C12307s0.m40637a(this.f32124h) ? (C12277k1) context.get(C12277k1.f32093e) : null;
                if (a2 == null && k1Var != null && !k1Var.mo38813b()) {
                    Throwable d = k1Var.mo38984d();
                    mo38928a(b2, d);
                    C10222o.C10223a aVar = C10222o.f27863f;
                    if (C12248i0.m40399d()) {
                        if (dVar instanceof C9085d) {
                            d = C12229n.m40317b(d, (C9085d) dVar);
                        }
                    }
                    Object a3 = C10225p.m34213a(d);
                    C10222o.m34210a(a3);
                    dVar.resumeWith(a3);
                } else if (a2 != null) {
                    C10222o.C10223a aVar2 = C10222o.f27863f;
                    Object a4 = C10225p.m34213a(a2);
                    C10222o.m34210a(a4);
                    dVar.resumeWith(a4);
                } else {
                    Object b3 = mo38931b(b2);
                    C10222o.C10223a aVar3 = C10222o.f27863f;
                    C10222o.m34210a(b3);
                    dVar.resumeWith(b3);
                }
                C10483v vVar = C10483v.f28357a;
                C12234s.m40333a(context, b);
                try {
                    C10222o.C10223a aVar4 = C10222o.f27863f;
                    jVar.mo38964a();
                    obj2 = C10483v.f28357a;
                    C10222o.m34210a(obj2);
                } catch (Throwable th) {
                    C10222o.C10223a aVar5 = C10222o.f27863f;
                    obj2 = C10225p.m34213a(th);
                    C10222o.m34210a(obj2);
                }
                mo39032a((Throwable) null, C10222o.m34211b(obj2));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.DispatchedContinuation<T>");
        } catch (Throwable th2) {
            try {
                C10222o.C10223a aVar6 = C10222o.f27863f;
                jVar.mo38964a();
                obj = C10483v.f28357a;
                C10222o.m34210a(obj);
            } catch (Throwable th3) {
                C10222o.C10223a aVar7 = C10222o.f27863f;
                obj = C10225p.m34213a(th3);
                C10222o.m34210a(obj);
            }
            mo39032a(th2, C10222o.m34211b(obj));
        }
    }

    /* renamed from: a */
    public final void mo39032a(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                C9099c.m29803a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            String str = "Fatal exception in coroutines machinery for " + this + ". " + "Please read KDoc to 'handleFatalException' method and report this incident to maintainers";
            if (th != null) {
                C12175a0.m40204a(mo38927a().getContext(), (Throwable) new C12243h0(str, th));
                return;
            }
            C10202j.m34172a();
            throw null;
        }
    }
}
