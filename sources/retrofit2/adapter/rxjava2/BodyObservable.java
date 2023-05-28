package retrofit2.adapter.rxjava2;

import p036io.reactivex.exceptions.C9034a;
import p036io.reactivex.exceptions.CompositeException;
import p120q.p326a.C11482n;
import p120q.p326a.C11490u;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p348g0.C11459a;
import retrofit2.Response;

final class BodyObservable<T> extends C11482n<T> {
    private final C11482n<Response<T>> upstream;

    private static class BodyObserver<R> implements C11490u<Response<R>> {
        private final C11490u<? super R> observer;
        private boolean terminated;

        BodyObserver(C11490u<? super R> uVar) {
            this.observer = uVar;
        }

        public void onComplete() {
            if (!this.terminated) {
                this.observer.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (!this.terminated) {
                this.observer.onError(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th);
            C11459a.m37531b((Throwable) assertionError);
        }

        public void onSubscribe(C10842c cVar) {
            this.observer.onSubscribe(cVar);
        }

        public void onNext(Response<R> response) {
            if (response.isSuccessful()) {
                this.observer.onNext(response.body());
                return;
            }
            this.terminated = true;
            HttpException httpException = new HttpException(response);
            try {
                this.observer.onError(httpException);
            } catch (Throwable th) {
                C9034a.m29708a(th);
                C11459a.m37531b((Throwable) new CompositeException(httpException, th));
            }
        }
    }

    BodyObservable(C11482n<Response<T>> nVar) {
        this.upstream = nVar;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(C11490u<? super T> uVar) {
        this.upstream.subscribe(new BodyObserver(uVar));
    }
}
