package androidx.work.impl;

import androidx.lifecycle.C0529p;
import androidx.work.C0964l;
import androidx.work.impl.utils.p013j.C0955c;

/* renamed from: androidx.work.impl.b */
/* compiled from: OperationImpl */
public class C0839b implements C0964l {

    /* renamed from: c */
    private final C0529p<C0964l.C0966b> f3003c = new C0529p<>();

    /* renamed from: d */
    private final C0955c<C0964l.C0966b.C0969c> f3004d = C0955c.m4117d();

    public C0839b() {
        mo4737a(C0964l.f3321b);
    }

    /* renamed from: a */
    public void mo4737a(C0964l.C0966b bVar) {
        this.f3003c.mo3002a(bVar);
        if (bVar instanceof C0964l.C0966b.C0969c) {
            this.f3004d.mo4938a((C0964l.C0966b.C0969c) bVar);
        } else if (bVar instanceof C0964l.C0966b.C0967a) {
            this.f3004d.mo4939a(((C0964l.C0966b.C0967a) bVar).mo4973a());
        }
    }
}
