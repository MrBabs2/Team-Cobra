package p120q.p326a;

import java.util.concurrent.Callable;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p333d.C10925g;
import p120q.p326a.p329d0.p334e.p337c.C10956a;
import p120q.p326a.p329d0.p334e.p337c.C10957b;
import p120q.p326a.p329d0.p334e.p337c.C10958c;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.j */
/* compiled from: Maybe */
public abstract class C11478j<T> implements C11480l<T> {
    /* renamed from: a */
    public static <T> C11478j<T> m37573a(Callable<? extends T> callable) {
        C10910b.m36861a(callable, "callable is null");
        return C11459a.m37517a(new C10957b(callable));
    }

    /* renamed from: c */
    public static <T> C11478j<T> m37574c() {
        return C11459a.m37517a(C10956a.f29058f);
    }

    /* renamed from: b */
    public final T mo37245b() {
        C10925g gVar = new C10925g();
        mo37244a(gVar);
        return gVar.mo36712a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo36748b(C11479k<? super T> kVar);

    /* renamed from: a */
    public static <T> C11478j<T> m37572a(T t) {
        C10910b.m36861a(t, "item is null");
        return C11459a.m37517a(new C10958c(t));
    }

    /* renamed from: a */
    public final void mo37244a(C11479k<? super T> kVar) {
        C10910b.m36861a(kVar, "observer is null");
        C11479k<? super Object> a = C11459a.m37518a(this, kVar);
        C10910b.m36861a(a, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            mo36748b(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C9034a.m29708a(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
