package p120q.p121b.p354i.p355f;

/* renamed from: q.b.i.f.c */
/* compiled from: EnvironmentBasedLocator */
public class C11519c implements C11518b {

    /* renamed from: a */
    private final String f30764a;

    public C11519c() {
        this("SENTRY_PROPERTIES_FILE");
    }

    /* renamed from: a */
    public String mo37635a() {
        return System.getenv(this.f30764a);
    }

    public C11519c(String str) {
        this.f30764a = str;
    }
}
