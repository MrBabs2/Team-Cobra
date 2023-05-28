package p112n.p312h.p313a;

import p112n.p312h.p313a.p315c0.C10741b;
import p112n.p312h.p313a.p315c0.C10743c;
import p112n.p312h.p313a.p315c0.C10744d;

/* renamed from: n.h.a.e */
/* compiled from: FileDownloadConnectListener */
public abstract class C10753e extends C10744d {

    /* renamed from: a */
    private C10741b.C10742a f28819a;

    /* renamed from: a */
    public abstract void mo36491a();

    /* renamed from: a */
    public boolean mo36466a(C10743c cVar) {
        if (!(cVar instanceof C10741b)) {
            return false;
        }
        C10741b.C10742a b = ((C10741b) cVar).mo36464b();
        this.f28819a = b;
        if (b == C10741b.C10742a.connected) {
            mo36491a();
            return false;
        }
        mo36492b();
        return false;
    }

    /* renamed from: b */
    public abstract void mo36492b();

    /* renamed from: c */
    public C10741b.C10742a mo36493c() {
        return this.f28819a;
    }
}
