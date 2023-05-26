package retrofit2.adapter.rxjava;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicBoolean;
import p123rx.C12473g;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.C5375k;
import p123rx.exceptions.C12472a;
import p123rx.p126m.C5379n;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Response;
import retrofit2.Retrofit;

public final class RxJavaCallAdapterFactory extends CallAdapter.Factory {
    private final C5373h scheduler;

    static final class CallOnSubscribe<T> implements C5368e.C5370a<Response<T>> {
        private final Call<T> originalCall;

        CallOnSubscribe(Call<T> call) {
            this.originalCall = call;
        }

        public void call(C12475j<? super Response<T>> jVar) {
            RequestArbiter requestArbiter = new RequestArbiter(this.originalCall.clone(), jVar);
            jVar.add(requestArbiter);
            jVar.setProducer(requestArbiter);
        }
    }

    static final class RequestArbiter<T> extends AtomicBoolean implements C5375k, C12473g {
        private final Call<T> call;
        private final C12475j<? super Response<T>> subscriber;

        RequestArbiter(Call<T> call2, C12475j<? super Response<T>> jVar) {
            this.call = call2;
            this.subscriber = jVar;
        }

        public boolean isUnsubscribed() {
            return this.call.isCanceled();
        }

        public void request(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n < 0: " + j);
            } else if (j != 0 && compareAndSet(false, true)) {
                try {
                    Response<T> execute = this.call.execute();
                    if (!this.subscriber.isUnsubscribed()) {
                        this.subscriber.onNext(execute);
                    }
                    if (!this.subscriber.isUnsubscribed()) {
                        this.subscriber.onCompleted();
                    }
                } catch (Throwable th) {
                    C12472a.m40945c(th);
                    if (!this.subscriber.isUnsubscribed()) {
                        this.subscriber.onError(th);
                    }
                }
            }
        }

        public void unsubscribe() {
            this.call.cancel();
        }
    }

    static final class ResponseCallAdapter implements CallAdapter<C5368e<?>> {
        private final Type responseType;
        private final C5373h scheduler;

        ResponseCallAdapter(Type type, C5373h hVar) {
            this.responseType = type;
            this.scheduler = hVar;
        }

        public Type responseType() {
            return this.responseType;
        }

        public <R> C5368e<Response<R>> adapt(Call<R> call) {
            C5368e<Response<R>> a = C5368e.m10241a(new CallOnSubscribe(call));
            C5373h hVar = this.scheduler;
            return hVar != null ? a.mo18662b(hVar) : a;
        }
    }

    static final class ResultCallAdapter implements CallAdapter<C5368e<?>> {
        private final Type responseType;
        private final C5373h scheduler;

        ResultCallAdapter(Type type, C5373h hVar) {
            this.responseType = type;
            this.scheduler = hVar;
        }

        public Type responseType() {
            return this.responseType;
        }

        public <R> C5368e<Result<R>> adapt(Call<R> call) {
            C5368e<Result<R>> l = C5368e.m10241a(new CallOnSubscribe(call)).mo18694j(new C5379n<Response<R>, Result<R>>() {
                public Result<R> call(Response<R> response) {
                    return Result.response(response);
                }
            }).mo18699l(new C5379n<Throwable, Result<R>>() {
                public Result<R> call(Throwable th) {
                    return Result.error(th);
                }
            });
            C5373h hVar = this.scheduler;
            return hVar != null ? l.mo18662b(hVar) : l;
        }
    }

    static final class SimpleCallAdapter implements CallAdapter<C5368e<?>> {
        private final Type responseType;
        private final C5373h scheduler;

        SimpleCallAdapter(Type type, C5373h hVar) {
            this.responseType = type;
            this.scheduler = hVar;
        }

        public Type responseType() {
            return this.responseType;
        }

        public <R> C5368e<R> adapt(Call<R> call) {
            C5368e<R> a = C5368e.m10241a(new CallOnSubscribe(call)).mo18640a(OperatorMapResponseToBodyOrError.instance());
            C5373h hVar = this.scheduler;
            return hVar != null ? a.mo18662b(hVar) : a;
        }
    }

    private RxJavaCallAdapterFactory(C5373h hVar) {
        this.scheduler = hVar;
    }

    public static RxJavaCallAdapterFactory create() {
        return new RxJavaCallAdapterFactory((C5373h) null);
    }

    public static RxJavaCallAdapterFactory createWithScheduler(C5373h hVar) {
        if (hVar != null) {
            return new RxJavaCallAdapterFactory(hVar);
        }
        throw new NullPointerException("scheduler == null");
    }

    private CallAdapter<C5368e<?>> getCallAdapter(Type type, C5373h hVar) {
        Type parameterUpperBound = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) type);
        Class<?> rawType = CallAdapter.Factory.getRawType(parameterUpperBound);
        if (rawType == Response.class) {
            if (parameterUpperBound instanceof ParameterizedType) {
                return new ResponseCallAdapter(CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound), hVar);
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        } else if (rawType != Result.class) {
            return new SimpleCallAdapter(parameterUpperBound, hVar);
        } else {
            if (parameterUpperBound instanceof ParameterizedType) {
                return new ResultCallAdapter(CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound), hVar);
            }
            throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
        }
    }

    public CallAdapter<?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        Class<?> rawType = CallAdapter.Factory.getRawType(type);
        String canonicalName = rawType.getCanonicalName();
        boolean equals = "rx.Single".equals(canonicalName);
        boolean equals2 = "rx.Completable".equals(canonicalName);
        if (rawType != C5368e.class && !equals && !equals2) {
            return null;
        }
        if (!equals2 && !(type instanceof ParameterizedType)) {
            String str = equals ? "Single" : "Observable";
            throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
        } else if (equals2) {
            return CompletableHelper.createCallAdapter(this.scheduler);
        } else {
            CallAdapter<C5368e<?>> callAdapter = getCallAdapter(type, this.scheduler);
            return equals ? SingleHelper.makeSingle(callAdapter) : callAdapter;
        }
    }
}
