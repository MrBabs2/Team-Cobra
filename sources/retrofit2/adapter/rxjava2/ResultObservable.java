package retrofit2.adapter.rxjava2;

import p036io.reactivex.exceptions.C9034a;
import p036io.reactivex.exceptions.CompositeException;
import p120q.p326a.C11482n;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p348g0.C11459a;
import retrofit2.Response;

final class ResultObservable<T> extends C11482n<Result<T>> {
    private final C11482n<Response<T>> upstream;

    private static class ResultObserver<R> implements C11490u<Response<R>> {
        private final C11490u<? super Result<R>> observer;

        ResultObserver(C11490u<? super Result<R>> uVar) {
            this.observer = uVar;
        }

        public void onComplete() {
            this.observer.onComplete();
        }

        public void onError(Throwable th) {
            try {
                this.observer.onNext(Result.error(th));
                this.observer.onComplete();
            } catch (Throwable th2) {
                C9034a.m29708a(th2);
                C11459a.m37531b((Throwable) new CompositeException(th, th2));
            }
        }

        public void onSubscribe(C10842c cVar) {
            this.observer.onSubscribe(cVar);
        }

        public void onNext(Response<R> response) {
            this.observer.onNext(Result.response(response));
        }
    }

    ResultObservable(C11482n<Response<T>> nVar) {
        this.upstream = nVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super Result<T>> uVar) {
        this.upstream.subscribe(new ResultObserver(uVar));
    }
}
