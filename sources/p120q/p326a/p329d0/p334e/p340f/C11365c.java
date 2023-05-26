package p120q.p326a.p329d0.p334e.p340f;

import java.util.concurrent.Callable;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11496w;
import p120q.p326a.C11498y;
import p120q.p326a.p329d0.p330a.C10868e;
import p120q.p326a.p329d0.p331b.C10910b;

/* renamed from: q.a.d0.e.f.c */
/* compiled from: SingleError */
public final class C11365c<T> extends C11496w<T> {

    /* renamed from: f */
    final Callable<? extends Throwable> f30447f;

    public C11365c(Callable<? extends Throwable> callable) {
        this.f30447f = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36633b(C11498y<? super T> yVar) {
        try {
            Object call = this.f30447f.call();
            C10910b.m36861a(call, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
            th = (Throwable) call;
        } catch (Throwable th) {
            th = th;
            C9034a.m29708a(th);
        }
        C10868e.m36782a(th, (C11498y<?>) yVar);
    }
}
