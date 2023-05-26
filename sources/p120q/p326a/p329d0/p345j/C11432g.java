package p120q.p326a.p329d0.p345j;

import p120q.p326a.C10863d;
import p120q.p326a.C11471i;
import p120q.p326a.C11479k;
import p120q.p326a.C11490u;
import p120q.p326a.C11498y;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p348g0.C11459a;
import p415t.p416a.C12936c;

/* renamed from: q.a.d0.j.g */
/* compiled from: EmptyComponent */
public enum C11432g implements C11471i<Object>, C11490u<Object>, C11479k<Object>, C11498y<Object>, C10863d, C12936c, C10842c {
    INSTANCE;

    /* renamed from: a */
    public static <T> C11490u<T> m37457a() {
        return INSTANCE;
    }

    public void cancel() {
    }

    public void dispose() {
    }

    public boolean isDisposed() {
        return true;
    }

    public void onComplete() {
    }

    public void onError(Throwable th) {
        C11459a.m37531b(th);
    }

    public void onNext(Object obj) {
    }

    public void onSubscribe(C10842c cVar) {
        cVar.dispose();
    }

    public void onSuccess(Object obj) {
    }

    public void request(long j) {
    }

    /* renamed from: a */
    public void mo36628a(C12936c cVar) {
        cVar.cancel();
    }
}
