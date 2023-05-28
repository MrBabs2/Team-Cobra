package p123rx.p401n.p404c;

import java.util.concurrent.TimeUnit;
import p123rx.C5373h;
import p123rx.C5375k;
import p123rx.p126m.C5377a;
import p123rx.p401n.p405d.C12754a;

/* renamed from: rx.n.c.i */
/* compiled from: SchedulePeriodicHelper */
public final class C12732i {

    /* renamed from: a */
    public static final long f32888a = TimeUnit.MINUTES.toNanos(Long.getLong("rx.scheduler.drift-tolerance", 15).longValue());

    /* renamed from: rx.n.c.i$a */
    /* compiled from: SchedulePeriodicHelper */
    static class C12733a implements C5377a {

        /* renamed from: f */
        long f32889f;

        /* renamed from: g */
        long f32890g = this.f32892i;

        /* renamed from: h */
        long f32891h = this.f32893j;

        /* renamed from: i */
        final /* synthetic */ long f32892i;

        /* renamed from: j */
        final /* synthetic */ long f32893j;

        /* renamed from: k */
        final /* synthetic */ C5377a f32894k;

        /* renamed from: l */
        final /* synthetic */ C12754a f32895l;

        /* renamed from: m */
        final /* synthetic */ C12734b f32896m;

        /* renamed from: n */
        final /* synthetic */ C5373h.C5374a f32897n;

        /* renamed from: o */
        final /* synthetic */ long f32898o;

        C12733a(long j, long j2, C5377a aVar, C12754a aVar2, C12734b bVar, C5373h.C5374a aVar3, long j3) {
            this.f32892i = j;
            this.f32893j = j2;
            this.f32894k = aVar;
            this.f32895l = aVar2;
            this.f32896m = bVar;
            this.f32897n = aVar3;
            this.f32898o = j3;
        }

        public void call() {
            long j;
            this.f32894k.call();
            if (!this.f32895l.isUnsubscribed()) {
                C12734b bVar = this.f32896m;
                long a = bVar != null ? bVar.mo40866a() : TimeUnit.MILLISECONDS.toNanos(this.f32897n.mo18713b());
                long j2 = C12732i.f32888a;
                long j3 = this.f32890g;
                if (a + j2 >= j3) {
                    long j4 = this.f32898o;
                    if (a < j3 + j4 + j2) {
                        long j5 = this.f32891h;
                        long j6 = this.f32889f + 1;
                        this.f32889f = j6;
                        j = j5 + (j6 * j4);
                        this.f32890g = a;
                        this.f32895l.mo40878a(this.f32897n.mo18712a(this, j - a, TimeUnit.NANOSECONDS));
                    }
                }
                long j7 = this.f32898o;
                long j8 = a + j7;
                long j9 = this.f32889f + 1;
                this.f32889f = j9;
                this.f32891h = j8 - (j7 * j9);
                j = j8;
                this.f32890g = a;
                this.f32895l.mo40878a(this.f32897n.mo18712a(this, j - a, TimeUnit.NANOSECONDS));
            }
        }
    }

    /* renamed from: rx.n.c.i$b */
    /* compiled from: SchedulePeriodicHelper */
    public interface C12734b {
        /* renamed from: a */
        long mo40866a();
    }

    /* renamed from: a */
    public static C5375k m41225a(C5373h.C5374a aVar, C5377a aVar2, long j, long j2, TimeUnit timeUnit, C12734b bVar) {
        long j3 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        long a = bVar != null ? bVar.mo40866a() : TimeUnit.MILLISECONDS.toNanos(aVar.mo18713b());
        C12754a aVar3 = new C12754a();
        C12754a aVar4 = new C12754a(aVar3);
        C12754a aVar5 = aVar4;
        C12733a aVar6 = r3;
        C12733a aVar7 = new C12733a(a, timeUnit2.toNanos(j3) + a, aVar2, aVar4, bVar, aVar, nanos);
        aVar3.mo40878a(aVar.mo18712a(aVar6, j3, timeUnit2));
        return aVar5;
    }
}
