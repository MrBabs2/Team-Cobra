package p120q.p326a.p329d0.p334e.p338d;

import java.util.concurrent.Callable;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C10838a0;
import p120q.p326a.C10863d;
import p120q.p326a.C11450f;
import p120q.p326a.C11480l;
import p120q.p326a.C11490u;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p330a.C10868e;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p334e.p337c.C10959d;
import p120q.p326a.p329d0.p334e.p340f.C11376i;

/* renamed from: q.a.d0.e.d.g */
/* compiled from: ScalarXMapZHelper */
final class C10979g {
    /* renamed from: a */
    static <T> boolean m36946a(Object obj, C10861o<? super T, ? extends C11450f> oVar, C10863d dVar) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        C11450f fVar = null;
        try {
            Object call = ((Callable) obj).call();
            if (call != null) {
                Object apply = oVar.apply(call);
                C10910b.m36861a(apply, "The mapper returned a null CompletableSource");
                fVar = (C11450f) apply;
            }
            if (fVar == null) {
                C10868e.m36783a(dVar);
            } else {
                fVar.mo36640a(dVar);
            }
            return true;
        } catch (Throwable th) {
            C9034a.m29708a(th);
            C10868e.m36780a(th, dVar);
            return true;
        }
    }

    /* renamed from: b */
    static <T, R> boolean m36948b(Object obj, C10861o<? super T, ? extends C10838a0<? extends R>> oVar, C11490u<? super R> uVar) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        C10838a0 a0Var = null;
        try {
            Object call = ((Callable) obj).call();
            if (call != null) {
                Object apply = oVar.apply(call);
                C10910b.m36861a(apply, "The mapper returned a null SingleSource");
                a0Var = (C10838a0) apply;
            }
            if (a0Var == null) {
                C10868e.m36785a((C11490u<?>) uVar);
            } else {
                a0Var.mo36638a(C11376i.m37334a(uVar));
            }
            return true;
        } catch (Throwable th) {
            C9034a.m29708a(th);
            C10868e.m36781a(th, (C11490u<?>) uVar);
            return true;
        }
    }

    /* renamed from: a */
    static <T, R> boolean m36947a(Object obj, C10861o<? super T, ? extends C11480l<? extends R>> oVar, C11490u<? super R> uVar) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        C11480l lVar = null;
        try {
            Object call = ((Callable) obj).call();
            if (call != null) {
                Object apply = oVar.apply(call);
                C10910b.m36861a(apply, "The mapper returned a null MaybeSource");
                lVar = (C11480l) apply;
            }
            if (lVar == null) {
                C10868e.m36785a((C11490u<?>) uVar);
            } else {
                lVar.mo37244a(C10959d.m36917a(uVar));
            }
            return true;
        } catch (Throwable th) {
            C9034a.m29708a(th);
            C10868e.m36781a(th, (C11490u<?>) uVar);
            return true;
        }
    }
}
