package retrofit2.adapter.rxjava;

import retrofit2.Response;

public final class HttpException extends Exception {
    private final int code;
    private final String message;
    private final transient Response<?> response;

    public HttpException(Response<?> response2) {
        super("HTTP " + response2.code() + " " + response2.message());
        this.code = response2.code();
        this.message = response2.message();
        this.response = response2;
    }

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    public Response<?> response() {
        return this.response;
    }
}
