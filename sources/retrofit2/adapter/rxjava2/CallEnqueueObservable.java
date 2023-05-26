package retrofit2.adapter.rxjava2;

import p036io.reactivex.exceptions.C9034a;
import p036io.reactivex.exceptions.CompositeException;
import p120q.p326a.C11482n;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p348g0.C11459a;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

final class CallEnqueueObservable<T> extends C11482n<Response<T>> {
    private final Call<T> originalCall;

    private static final class CallCallback<T> implements C10842c, Callback<T> {
        private final Call<?> call;
        private volatile boolean disposed;
        private final C11490u<? super Response<T>> observer;
        boolean terminated = false;

        CallCallback(Call<?> call2, C11490u<? super Response<T>> uVar) {
            this.call = call2;
            this.observer = uVar;
        }

        public void dispose() {
            this.disposed = true;
            this.call.cancel();
        }

        public boolean isDisposed() {
            return this.disposed;
        }

        public void onFailure(Call<T> call2, Throwable th) {
            if (!call2.isCanceled()) {
                try {
                    this.observer.onError(th);
                } catch (Throwable th2) {
                    C9034a.m29708a(th2);
                    C11459a.m37531b((Throwable) new CompositeException(th, th2));
                }
            }
        }

        public void onResponse(Call<T> call2, Response<T> response) {
            if (!this.disposed) {
                try {
                    this.observer.onNext(response);
                    if (!this.disposed) {
                        this.terminated = true;
                        this.observer.onComplete();
                    }
                } catch (Throwable th) {
                    C9034a.m29708a(th);
                    C11459a.m37531b((Throwable) new CompositeException(th, th));
                }
            }
        }
    }

    CallEnqueueObservable(Call<T> call) {
        this.originalCall = call;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super Response<T>> uVar) {
        Call<T> clone = this.originalCall.clone();
        CallCallback callCallback = new CallCallback(clone, uVar);
        uVar.onSubscribe(callCallback);
        clone.enqueue(callCallback);
    }
}
