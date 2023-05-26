package retrofit2.adapter.rxjava2;

import p036io.reactivex.exceptions.C9034a;
import p036io.reactivex.exceptions.CompositeException;
import p120q.p326a.C11482n;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p348g0.C11459a;
import retrofit2.Call;
import retrofit2.Response;

final class CallExecuteObservable<T> extends C11482n<Response<T>> {
    private final Call<T> originalCall;

    private static final class CallDisposable implements C10842c {
        private final Call<?> call;
        private volatile boolean disposed;

        CallDisposable(Call<?> call2) {
            this.call = call2;
        }

        public void dispose() {
            this.disposed = true;
            this.call.cancel();
        }

        public boolean isDisposed() {
            return this.disposed;
        }
    }

    CallExecuteObservable(Call<T> call) {
        this.originalCall = call;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super Response<T>> uVar) {
        boolean z;
        Call<T> clone = this.originalCall.clone();
        CallDisposable callDisposable = new CallDisposable(clone);
        uVar.onSubscribe(callDisposable);
        try {
            Response<T> execute = clone.execute();
            if (!callDisposable.isDisposed()) {
                uVar.onNext(execute);
            }
            if (!callDisposable.isDisposed()) {
                try {
                    uVar.onComplete();
                } catch (Throwable th) {
                    th = th;
                    z = true;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
            C9034a.m29708a(th);
            if (z) {
                C11459a.m37531b(th);
            } else if (!callDisposable.isDisposed()) {
                try {
                    uVar.onError(th);
                } catch (Throwable th3) {
                    C9034a.m29708a(th3);
                    C11459a.m37531b((Throwable) new CompositeException(th, th3));
                }
            }
        }
    }
}
