package retrofit2.adapter.rxjava;

import java.lang.reflect.Type;
import p123rx.C5328b;
import p123rx.C5373h;
import p123rx.C5375k;
import p123rx.exceptions.C12472a;
import p123rx.p126m.C5377a;
import p123rx.p128t.C12889e;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Response;
import rx.Completable;

final class CompletableHelper {

    static class CompletableCallAdapter implements CallAdapter<C5328b> {
        private final C5373h scheduler;

        CompletableCallAdapter(C5373h hVar) {
            this.scheduler = hVar;
        }

        public Type responseType() {
            return Void.class;
        }

        public C5328b adapt(Call call) {
            C5328b create = C5328b.create(new CompletableCallOnSubscribe(call));
            C5373h hVar = this.scheduler;
            return hVar != null ? create.mo18600b(hVar) : create;
        }
    }

    private static final class CompletableCallOnSubscribe implements Completable.CompletableOnSubscribe {
        private final Call originalCall;

        CompletableCallOnSubscribe(Call call) {
            this.originalCall = call;
        }

        public void call(Completable.CompletableSubscriber completableSubscriber) {
            final Call clone = this.originalCall.clone();
            C5375k a = C12889e.m41501a(new C5377a() {
                public void call() {
                    clone.cancel();
                }
            });
            completableSubscriber.onSubscribe(a);
            try {
                Response execute = clone.execute();
                if (a.isUnsubscribed()) {
                    return;
                }
                if (execute.isSuccessful()) {
                    completableSubscriber.onCompleted();
                } else {
                    completableSubscriber.onError(new HttpException(execute));
                }
            } catch (Throwable th) {
                C12472a.m40945c(th);
                if (!a.isUnsubscribed()) {
                    completableSubscriber.onError(th);
                }
            }
        }
    }

    CompletableHelper() {
    }

    static CallAdapter<C5328b> createCallAdapter(C5373h hVar) {
        return new CompletableCallAdapter(hVar);
    }
}
