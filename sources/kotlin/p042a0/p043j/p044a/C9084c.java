package kotlin.p042a0.p043j.p044a;

import kotlin.jvm.internal.C10202j;
import kotlin.p042a0.C9064d;
import kotlin.p042a0.C9065e;
import kotlin.p042a0.C9069g;

/* renamed from: kotlin.a0.j.a.c */
/* compiled from: ContinuationImpl.kt */
public abstract class C9084c extends C9082a {
    private final C9069g _context;
    private transient C9064d<Object> intercepted;

    public C9084c(C9064d<Object> dVar, C9069g gVar) {
        super(dVar);
        this._context = gVar;
    }

    public C9069g getContext() {
        C9069g gVar = this._context;
        if (gVar != null) {
            return gVar;
        }
        C10202j.m34172a();
        throw null;
    }

    public final C9064d<Object> intercepted() {
        C9064d<Object> dVar = this.intercepted;
        if (dVar == null) {
            C9065e eVar = (C9065e) getContext().get(C9065e.f25651b);
            if (eVar == null || (dVar = eVar.mo33455b(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    public void releaseIntercepted() {
        C9064d<Object> dVar = this.intercepted;
        if (!(dVar == null || dVar == this)) {
            C9069g.C9072b bVar = getContext().get(C9065e.f25651b);
            if (bVar != null) {
                ((C9065e) bVar).mo33454a(dVar);
            } else {
                C10202j.m34172a();
                throw null;
            }
        }
        this.intercepted = C9083b.f25663f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C9084c(C9064d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
