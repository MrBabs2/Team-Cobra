package p120q.p326a;

import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.p328c0.C10849c;
import p120q.p326a.p328c0.C10853g;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p329d0.p331b.C10872a;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p332c.C10912a;
import p120q.p326a.p329d0.p333d.C10925g;
import p120q.p326a.p329d0.p334e.p335a.C10941c;
import p120q.p326a.p329d0.p334e.p340f.C11361a;
import p120q.p326a.p329d0.p334e.p340f.C11363b;
import p120q.p326a.p329d0.p334e.p340f.C11365c;
import p120q.p326a.p329d0.p334e.p340f.C11366d;
import p120q.p326a.p329d0.p334e.p340f.C11369e;
import p120q.p326a.p329d0.p334e.p340f.C11370f;
import p120q.p326a.p329d0.p334e.p340f.C11372g;
import p120q.p326a.p329d0.p334e.p340f.C11374h;
import p120q.p326a.p329d0.p334e.p340f.C11376i;
import p120q.p326a.p329d0.p334e.p340f.C11378j;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.w */
/* compiled from: Single */
public abstract class C11496w<T> implements C10838a0<T> {
    /* renamed from: a */
    public static <T> C11496w<T> m37608a(C11499z<T> zVar) {
        C10910b.m36861a(zVar, "source is null");
        return C11459a.m37524a(new C11361a(zVar));
    }

    /* renamed from: b */
    public final T mo37609b() {
        C10925g gVar = new C10925g();
        mo36638a(gVar);
        return gVar.mo36712a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo36633b(C11498y<? super T> yVar);

    /* renamed from: c */
    public final C10839b mo37612c() {
        return C11459a.m37513a((C10839b) new C10941c(this));
    }

    /* renamed from: d */
    public final C11482n<T> mo37613d() {
        if (this instanceof C10912a) {
            return ((C10912a) this).mo36701a();
        }
        return C11459a.m37519a(new C11376i(this));
    }

    /* renamed from: a */
    public static <T> C11496w<T> m37605a(Callable<? extends Throwable> callable) {
        C10910b.m36861a(callable, "errorSupplier is null");
        return C11459a.m37524a(new C11365c(callable));
    }

    /* renamed from: b */
    public final <R> C11496w<R> mo37610b(C10861o<? super T, ? extends R> oVar) {
        C10910b.m36861a(oVar, "mapper is null");
        return C11459a.m37524a(new C11370f(this, oVar));
    }

    /* renamed from: a */
    public static <T> C11496w<T> m37604a(Throwable th) {
        C10910b.m36861a(th, "exception is null");
        return m37605a((Callable<? extends Throwable>) C10872a.m36814b(th));
    }

    /* renamed from: b */
    public final C11496w<T> mo37611b(C11491v vVar) {
        C10910b.m36861a(vVar, "scheduler is null");
        return C11459a.m37524a(new C11374h(this, vVar));
    }

    /* renamed from: a */
    public static <T> C11496w<T> m37603a(T t) {
        C10910b.m36861a(t, "item is null");
        return C11459a.m37524a(new C11369e(t));
    }

    /* renamed from: a */
    public static <T1, T2, R> C11496w<R> m37606a(C10838a0<? extends T1> a0Var, C10838a0<? extends T2> a0Var2, C10849c<? super T1, ? super T2, ? extends R> cVar) {
        C10910b.m36861a(a0Var, "source1 is null");
        C10910b.m36861a(a0Var2, "source2 is null");
        return m37607a(C10872a.m36803a(cVar), a0Var, a0Var2);
    }

    /* renamed from: a */
    public static <T, R> C11496w<R> m37607a(C10861o<? super Object[], ? extends R> oVar, C10838a0<? extends T>... a0VarArr) {
        C10910b.m36861a(oVar, "zipper is null");
        C10910b.m36861a(a0VarArr, "sources is null");
        if (a0VarArr.length == 0) {
            return m37604a((Throwable) new NoSuchElementException());
        }
        return C11459a.m37524a(new C11378j(a0VarArr, oVar));
    }

    /* renamed from: a */
    public final C11496w<T> mo37606a(C10853g<? super T> gVar) {
        C10910b.m36861a(gVar, "onSuccess is null");
        return C11459a.m37524a(new C11363b(this, gVar));
    }

    /* renamed from: a */
    public final <R> C11496w<R> mo37607a(C10861o<? super T, ? extends C10838a0<? extends R>> oVar) {
        C10910b.m36861a(oVar, "mapper is null");
        return C11459a.m37524a(new C11366d(this, oVar));
    }

    /* renamed from: a */
    public final C11496w<T> mo37608a(C11491v vVar) {
        C10910b.m36861a(vVar, "scheduler is null");
        return C11459a.m37524a(new C11372g(this, vVar));
    }

    /* renamed from: a */
    public final void mo36638a(C11498y<? super T> yVar) {
        C10910b.m36861a(yVar, "observer is null");
        C11498y<? super Object> a = C11459a.m37525a(this, yVar);
        C10910b.m36861a(a, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            mo36633b(a);
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
