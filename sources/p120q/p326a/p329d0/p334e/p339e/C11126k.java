package p120q.p326a.p329d0.p334e.p339e;

import p120q.p326a.C11488s;
import p120q.p326a.p328c0.C10847a;
import p120q.p326a.p328c0.C10853g;
import p120q.p326a.p329d0.p331b.C10872a;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p333d.C10933o;
import p120q.p326a.p329d0.p345j.C11430e;
import p120q.p326a.p329d0.p345j.C11431f;
import p120q.p326a.p329d0.p345j.C11435j;

/* renamed from: q.a.d0.e.e.k */
/* compiled from: ObservableBlockingSubscribe */
public final class C11126k {
    /* JADX WARNING: Removed duplicated region for block: B:3:0x0017  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> void m37065a(p120q.p326a.C11488s<? extends T> r3, p120q.p326a.C11490u<? super T> r4) {
        /*
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            q.a.d0.d.h r1 = new q.a.d0.d.h
            r1.<init>(r0)
            r4.onSubscribe(r1)
            r3.subscribe(r1)
        L_0x0010:
            boolean r3 = r1.isDisposed()
            if (r3 == 0) goto L_0x0017
            goto L_0x003a
        L_0x0017:
            java.lang.Object r3 = r0.poll()
            if (r3 != 0) goto L_0x002a
            java.lang.Object r3 = r0.take()     // Catch:{ InterruptedException -> 0x0022 }
            goto L_0x002a
        L_0x0022:
            r3 = move-exception
            r1.dispose()
            r4.onError(r3)
            return
        L_0x002a:
            boolean r2 = r1.isDisposed()
            if (r2 != 0) goto L_0x003a
            java.lang.Object r2 = p120q.p326a.p329d0.p333d.C10926h.f28985g
            if (r3 == r2) goto L_0x003a
            boolean r3 = p120q.p326a.p329d0.p345j.C11439m.m37480b(r3, r4)
            if (r3 == 0) goto L_0x0010
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p120q.p326a.p329d0.p334e.p339e.C11126k.m37065a(q.a.s, q.a.u):void");
    }

    /* renamed from: a */
    public static <T> void m37063a(C11488s<? extends T> sVar) {
        C11431f fVar = new C11431f();
        C10933o oVar = new C10933o(C10872a.m36821d(), fVar, fVar, C10872a.m36821d());
        sVar.subscribe(oVar);
        C11430e.m37454a(fVar, oVar);
        Throwable th = fVar.f30614f;
        if (th != null) {
            throw C11435j.m37463a(th);
        }
    }

    /* renamed from: a */
    public static <T> void m37064a(C11488s<? extends T> sVar, C10853g<? super T> gVar, C10853g<? super Throwable> gVar2, C10847a aVar) {
        C10910b.m36861a(gVar, "onNext is null");
        C10910b.m36861a(gVar2, "onError is null");
        C10910b.m36861a(aVar, "onComplete is null");
        m37065a(sVar, new C10933o(gVar, gVar2, aVar, C10872a.m36821d()));
    }
}
