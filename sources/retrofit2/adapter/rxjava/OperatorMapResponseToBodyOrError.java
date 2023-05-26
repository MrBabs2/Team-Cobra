package retrofit2.adapter.rxjava;

import p123rx.C12475j;
import p123rx.C5368e;
import retrofit2.Response;

final class OperatorMapResponseToBodyOrError<T> implements C5368e.C5371b<T, Response<T>> {
    private static final OperatorMapResponseToBodyOrError<Object> INSTANCE = new OperatorMapResponseToBodyOrError<>();

    OperatorMapResponseToBodyOrError() {
    }

    static <R> OperatorMapResponseToBodyOrError<R> instance() {
        return INSTANCE;
    }

    public C12475j<? super Response<T>> call(final C12475j<? super T> jVar) {
        return new C12475j<Response<T>>(jVar) {
            public void onCompleted() {
                jVar.onCompleted();
            }

            public void onError(Throwable th) {
                jVar.onError(th);
            }

            public void onNext(Response<T> response) {
                if (response.isSuccessful()) {
                    jVar.onNext(response.body());
                } else {
                    jVar.onError(new HttpException(response));
                }
            }
        };
    }
}
