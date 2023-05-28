package p036io.sentry.connection;

import java.util.Random;
import p120q.p121b.p359l.C11542b;

/* renamed from: io.sentry.connection.l */
/* compiled from: RandomEventSampler */
public class C9054l implements C9046e {

    /* renamed from: a */
    private double f25626a;

    /* renamed from: b */
    private Random f25627b;

    public C9054l(double d) {
        this(d, new Random());
    }

    /* renamed from: a */
    public boolean mo33413a(C11542b bVar) {
        return this.f25626a >= Math.abs(this.f25627b.nextDouble());
    }

    public C9054l(double d, Random random) {
        this.f25626a = d;
        this.f25627b = random;
    }
}
