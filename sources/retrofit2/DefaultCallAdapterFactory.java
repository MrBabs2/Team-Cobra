package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import okhttp3.Request;
import p413s.C12894b0;
import retrofit2.CallAdapter;

final class DefaultCallAdapterFactory extends CallAdapter.Factory {
    private final Executor callbackExecutor;

    static final class ExecutorCallbackCall<T> implements Call<T> {
        final Executor callbackExecutor;
        final Call<T> delegate;

        ExecutorCallbackCall(Executor executor, Call<T> call) {
            this.callbackExecutor = executor;
            this.delegate = call;
        }

        public void cancel() {
            this.delegate.cancel();
        }

        public void enqueue(final Callback<T> callback) {
            C4758i.m7802a(callback, "callback == null");
            this.delegate.enqueue(new Callback<T>() {
                /* renamed from: a */
                public /* synthetic */ void mo40504a(Callback callback, Response response) {
                    if (ExecutorCallbackCall.this.delegate.isCanceled()) {
                        callback.onFailure(ExecutorCallbackCall.this, new IOException("Canceled"));
                    } else {
                        callback.onResponse(ExecutorCallbackCall.this, response);
                    }
                }

                public void onFailure(Call<T> call, Throwable th) {
                    ExecutorCallbackCall.this.callbackExecutor.execute(new C12458b(this, callback, th));
                }

                public void onResponse(Call<T> call, Response<T> response) {
                    ExecutorCallbackCall.this.callbackExecutor.execute(new C12452a(this, callback, response));
                }

                /* renamed from: a */
                public /* synthetic */ void mo40503a(Callback callback, Throwable th) {
                    callback.onFailure(ExecutorCallbackCall.this, th);
                }
            });
        }

        public Response<T> execute() throws IOException {
            return this.delegate.execute();
        }

        public boolean isCanceled() {
            return this.delegate.isCanceled();
        }

        public boolean isExecuted() {
            return this.delegate.isExecuted();
        }

        public Request request() {
            return this.delegate.request();
        }

        public C12894b0 timeout() {
            return this.delegate.timeout();
        }

        public Call<T> clone() {
            return new ExecutorCallbackCall(this.callbackExecutor, this.delegate.clone());
        }
    }

    DefaultCallAdapterFactory(Executor executor) {
        this.callbackExecutor = executor;
    }

    public CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        final Executor executor = null;
        if (CallAdapter.Factory.getRawType(type) != Call.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            final Type parameterUpperBound = Utils.getParameterUpperBound(0, (ParameterizedType) type);
            if (!Utils.isAnnotationPresent(annotationArr, SkipCallbackExecutor.class)) {
                executor = this.callbackExecutor;
            }
            return new CallAdapter<Object, Call<?>>() {
                public Type responseType() {
                    return parameterUpperBound;
                }

                public Call<Object> adapt(Call<Object> call) {
                    Executor executor = executor;
                    return executor == null ? call : new ExecutorCallbackCall(executor, call);
                }
            };
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
