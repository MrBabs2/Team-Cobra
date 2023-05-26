package p120q.p326a;

import java.util.concurrent.Callable;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p334e.p335a.C10938a;
import p120q.p326a.p329d0.p334e.p335a.C10940b;
import p120q.p326a.p329d0.p334e.p335a.C10943d;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.b */
/* compiled from: Completable */
public abstract class C10839b implements C11450f {
    /* renamed from: a */
    public static C10839b m36737a(C11447e eVar) {
        C10910b.m36861a(eVar, "source is null");
        return C11459a.m37513a((C10839b) new C10938a(eVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo36620b(C10863d dVar);

    /* renamed from: a */
    public static C10839b m36736a(Callable<?> callable) {
        C10910b.m36861a(callable, "callable is null");
        return C11459a.m37513a((C10839b) new C10940b(callable));
    }

    /* renamed from: a */
    private static NullPointerException m36735a(Throwable th) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    /* renamed from: a */
    public final void mo36640a(C10863d dVar) {
        C10910b.m36861a(dVar, "observer is null");
        try {
            C10863d a = C11459a.m37514a(this, dVar);
            C10910b.m36861a(a, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo36620b(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C9034a.m29708a(th);
            C11459a.m37531b(th);
            throw m36735a(th);
        }
    }

    /* renamed from: a */
    public final C10839b mo36639a(C11491v vVar) {
        C10910b.m36861a(vVar, "scheduler is null");
        return C11459a.m37513a((C10839b) new C10943d(this, vVar));
    }
}
