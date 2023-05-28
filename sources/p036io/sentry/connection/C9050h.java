package p036io.sentry.connection;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import p120q.p121b.p366p.C11587a;
import p120q.p121b.p366p.C11588b;

/* renamed from: io.sentry.connection.h */
/* compiled from: LockdownManager */
public class C9050h {

    /* renamed from: f */
    public static final long f25614f = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: g */
    public static final long f25615g = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: a */
    private long f25616a;

    /* renamed from: b */
    private long f25617b;

    /* renamed from: c */
    private long f25618c;

    /* renamed from: d */
    private Date f25619d;

    /* renamed from: e */
    private final C11587a f25620e;

    public C9050h() {
        this(new C11588b());
    }

    /* renamed from: a */
    public synchronized boolean mo33423a() {
        return this.f25619d != null && this.f25620e.mo37825a() - this.f25619d.getTime() < this.f25618c;
    }

    /* renamed from: b */
    public synchronized void mo33425b() {
        this.f25618c = 0;
        this.f25619d = null;
    }

    public C9050h(C11587a aVar) {
        this.f25616a = f25614f;
        this.f25617b = f25615g;
        this.f25618c = 0;
        this.f25619d = null;
        this.f25620e = aVar;
    }

    /* renamed from: a */
    public synchronized boolean mo33424a(ConnectionException connectionException) {
        if (mo33423a()) {
            return false;
        }
        if (connectionException != null) {
            if (connectionException.mo33399a() != null) {
                this.f25618c = connectionException.mo33399a().longValue();
                this.f25618c = Math.min(this.f25616a, this.f25618c);
                this.f25619d = this.f25620e.mo37826b();
                return true;
            }
        }
        if (this.f25618c != 0) {
            this.f25618c *= 2;
        } else {
            this.f25618c = this.f25617b;
        }
        this.f25618c = Math.min(this.f25616a, this.f25618c);
        this.f25619d = this.f25620e.mo37826b();
        return true;
    }
}
