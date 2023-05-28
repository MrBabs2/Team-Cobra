package kotlin.p042a0.p043j.p044a;

import java.io.Serializable;
import kotlin.C10222o;
import kotlin.C10225p;
import kotlin.C10483v;
import kotlin.jvm.internal.C10202j;
import kotlin.p042a0.C9064d;

/* renamed from: kotlin.a0.j.a.a */
/* compiled from: ContinuationImpl.kt */
public abstract class C9082a implements C9064d<Object>, C9085d, Serializable {
    private final C9064d<Object> completion;

    public C9082a(C9064d<Object> dVar) {
        this.completion = dVar;
    }

    public C9064d<C10483v> create(C9064d<?> dVar) {
        C10202j.m34178b(dVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public C9085d getCallerFrame() {
        C9064d<Object> dVar = this.completion;
        if (!(dVar instanceof C9085d)) {
            dVar = null;
        }
        return (C9085d) dVar;
    }

    public final C9064d<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return C9086f.m29789c(this);
    }

    /* access modifiers changed from: protected */
    public abstract Object invokeSuspend(Object obj);

    /* access modifiers changed from: protected */
    public void releaseIntercepted() {
    }

    public final void resumeWith(Object obj) {
        C9082a aVar = this;
        while (true) {
            C9087g.m29791b(aVar);
            C9064d dVar = aVar.completion;
            if (dVar != null) {
                try {
                    obj = aVar.invokeSuspend(obj);
                    if (obj != C9081d.m29785a()) {
                        C10222o.C10223a aVar2 = C10222o.f27863f;
                        C10222o.m34210a(obj);
                        aVar.releaseIntercepted();
                        if (dVar instanceof C9082a) {
                            aVar = (C9082a) dVar;
                        } else {
                            dVar.resumeWith(obj);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    C10222o.C10223a aVar3 = C10222o.f27863f;
                    obj = C10225p.m34213a(th);
                    C10222o.m34210a(obj);
                }
            } else {
                C10202j.m34172a();
                throw null;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public C9064d<C10483v> create(Object obj, C9064d<?> dVar) {
        C10202j.m34178b(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
