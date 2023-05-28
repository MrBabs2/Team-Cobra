package p120q.p326a.p329d0.p345j;

import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p332c.C10917f;
import p120q.p326a.p329d0.p332c.C10918g;
import p120q.p326a.p329d0.p341f.C11384b;
import p120q.p326a.p329d0.p341f.C11385c;

/* renamed from: q.a.d0.j.q */
/* compiled from: QueueDrainHelper */
public final class C11445q {
    /* renamed from: a */
    public static <T, U> void m37498a(C10917f<T> fVar, C11490u<? super U> uVar, boolean z, C10842c cVar, C11442n<T, U> nVar) {
        int i = 1;
        while (!m37499a(nVar.mo36732a(), fVar.isEmpty(), uVar, z, fVar, cVar, nVar)) {
            while (true) {
                boolean a = nVar.mo36732a();
                T poll = fVar.poll();
                boolean z2 = poll == null;
                if (!m37499a(a, z2, uVar, z, fVar, cVar, nVar)) {
                    if (z2) {
                        i = nVar.mo36729a(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        nVar.mo36731a(uVar, poll);
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static <T, U> boolean m37499a(boolean z, boolean z2, C11490u<?> uVar, boolean z3, C10918g<?> gVar, C10842c cVar, C11442n<T, U> nVar) {
        if (nVar.mo36734b()) {
            gVar.clear();
            cVar.dispose();
            return true;
        } else if (!z) {
            return false;
        } else {
            if (!z3) {
                Throwable c = nVar.mo36735c();
                if (c != null) {
                    gVar.clear();
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    uVar.onError(c);
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    uVar.onComplete();
                    return true;
                }
            } else if (!z2) {
                return false;
            } else {
                if (cVar != null) {
                    cVar.dispose();
                }
                Throwable c2 = nVar.mo36735c();
                if (c2 != null) {
                    uVar.onError(c2);
                } else {
                    uVar.onComplete();
                }
                return true;
            }
        }
    }

    /* renamed from: a */
    public static <T> C10918g<T> m37497a(int i) {
        if (i < 0) {
            return new C11385c(-i);
        }
        return new C11384b(i);
    }
}
