package kotlinx.coroutines.p396j2;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.p393g2.C12231p;

/* renamed from: kotlinx.coroutines.j2.l */
/* compiled from: Tasks.kt */
public final class C12272l {

    /* renamed from: a */
    public static final long f32080a = C12233r.m40330a("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, (Object) null);

    /* renamed from: b */
    public static final int f32081b = C12233r.m40328a("kotlinx.coroutines.scheduler.core.pool.size", C9150f.m29847a(C12231p.m40318a(), 2), 1, 0, 8, (Object) null);

    /* renamed from: c */
    public static final int f32082c = C12233r.m40328a("kotlinx.coroutines.scheduler.max.pool.size", C9150f.m29848a(C12231p.m40318a() * 128, f32081b, 2097150), 0, 2097150, 4, (Object) null);

    /* renamed from: d */
    public static final long f32083d = TimeUnit.SECONDS.toNanos(C12233r.m40330a("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, (Object) null));

    /* renamed from: e */
    public static C12273m f32084e = C12267g.f32074a;

    static {
        int unused = C12233r.m40328a("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, (Object) null);
    }
}
