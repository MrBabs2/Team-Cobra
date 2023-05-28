package p036io.sentry.connection;

/* renamed from: io.sentry.connection.TooManyRequestsException */
public class TooManyRequestsException extends ConnectionException {
    public TooManyRequestsException(String str, Throwable th, Long l, Integer num) {
        super(str, th, l, num);
    }
}
