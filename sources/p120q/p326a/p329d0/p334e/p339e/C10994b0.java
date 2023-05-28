package p120q.p326a.p329d0.p334e.p339e;

import java.util.concurrent.atomic.AtomicReference;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C11482n;
import p120q.p326a.C11485p;
import p120q.p326a.C11486q;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.e.b0 */
/* compiled from: ObservableCreate */
public final class C10994b0<T> extends C11482n<T> {

    /* renamed from: f */
    final C11486q<T> f29188f;

    public C10994b0(C11486q<T> qVar) {
        this.f29188f = qVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super T> uVar) {
        C10995a aVar = new C10995a(uVar);
        uVar.onSubscribe(aVar);
        try {
            this.f29188f.mo4438a(aVar);
        } catch (Throwable th) {
            C9034a.m29708a(th);
            aVar.mo36789a(th);
        }
    }

    /* renamed from: q.a.d0.e.e.b0$a */
    /* compiled from: ObservableCreate */
    static final class C10995a<T> extends AtomicReference<C10842c> implements C11485p<T>, C10842c {

        /* renamed from: f */
        final C11490u<? super T> f29189f;

        C10995a(C11490u<? super T> uVar) {
            this.f29189f = uVar;
        }

        /* renamed from: a */
        public void mo36789a(Throwable th) {
            if (!mo36791b(th)) {
                C11459a.m37531b(th);
            }
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: b */
        public boolean mo36791b(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isDisposed()) {
                return false;
            }
            try {
                this.f29189f.onError(th);
                dispose();
                return true;
            } catch (Throwable th2) {
                dispose();
                throw th2;
            }
        }

        public void dispose() {
            C10867d.m36773a((AtomicReference<C10842c>) this);
        }

        public boolean isDisposed() {
            return C10867d.m36775a((C10842c) get());
        }

        public void onNext(T t) {
            if (t == null) {
                mo36789a((Throwable) new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else if (!isDisposed()) {
                this.f29189f.onNext(t);
            }
        }

        public String toString() {
            return String.format("%s{%s}", new Object[]{C10995a.class.getSimpleName(), super.toString()});
        }

        /* renamed from: a */
        public void mo36790a(C10842c cVar) {
            C10867d.m36777b(this, cVar);
        }
    }
}
