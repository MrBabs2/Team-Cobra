package retrofit2.adapter.rxjava;

import retrofit2.Response;

public final class Result<T> {
    private final Throwable error;
    private final Response<T> response;

    private Result(Response<T> response2, Throwable th) {
        this.response = response2;
        this.error = th;
    }

    public static <T> Result<T> error(Throwable th) {
        if (th != null) {
            return new Result<>((Response) null, th);
        }
        throw new NullPointerException("error == null");
    }

    public static <T> Result<T> response(Response<T> response2) {
        if (response2 != null) {
            return new Result<>(response2, (Throwable) null);
        }
        throw new NullPointerException("response == null");
    }

    public boolean isError() {
        return this.error != null;
    }

    public Throwable error() {
        return this.error;
    }

    public Response<T> response() {
        return this.response;
    }
}
