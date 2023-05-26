package retrofit2;

import java.io.IOException;
import okhttp3.Request;
import p413s.C12894b0;

public interface Call<T> extends Cloneable {
    void cancel();

    Call<T> clone();

    void enqueue(Callback<T> callback);

    Response<T> execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    Request request();

    C12894b0 timeout();
}
