package p036io.sentry.connection;

/* renamed from: io.sentry.connection.ConnectionException */
public class ConnectionException extends RuntimeException {

    /* renamed from: f */
    private Long f25568f = null;

    /* renamed from: g */
    private Integer f25569g = null;

    public ConnectionException() {
    }

    /* renamed from: a */
    public Long mo33399a() {
        return this.f25568f;
    }

    /* renamed from: b */
    public Integer mo33400b() {
        return this.f25569g;
    }

    public ConnectionException(String str, Throwable th) {
        super(str, th);
    }

    public ConnectionException(String str, Throwable th, Long l, Integer num) {
        super(str, th);
        this.f25568f = l;
        this.f25569g = num;
    }
}
