package p123rx.p411q;

import p123rx.exceptions.C12472a;

/* renamed from: rx.q.b */
/* compiled from: RxJavaErrorHandler */
public abstract class C12843b {
    /* renamed from: a */
    public final String mo41045a(Object obj) {
        try {
            return mo41047b(obj);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return obj.getClass().getName() + ".errorRendering";
        } catch (Throwable th) {
            C12472a.m40945c(th);
            return obj.getClass().getName() + ".errorRendering";
        }
    }

    @Deprecated
    /* renamed from: a */
    public void mo41046a(Throwable th) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo41047b(Object obj) throws InterruptedException {
        return null;
    }
}
