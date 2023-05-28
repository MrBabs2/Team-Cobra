package retrofit2.adapter.rxjava;

import java.lang.reflect.Type;
import p123rx.C5368e;
import p123rx.Single;
import retrofit2.Call;
import retrofit2.CallAdapter;

final class SingleHelper {
    SingleHelper() {
    }

    static CallAdapter<Single<?>> makeSingle(final CallAdapter<C5368e<?>> callAdapter) {
        return new CallAdapter<Single<?>>() {
            public Type responseType() {
                return callAdapter.responseType();
            }

            public <R> Single<?> adapt(Call<R> call) {
                return ((C5368e) callAdapter.adapt(call)).mo18700m();
            }
        };
    }
}
