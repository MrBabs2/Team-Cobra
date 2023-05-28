package p123rx;

import java.util.concurrent.TimeUnit;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5379n;
import p123rx.p401n.p404c.C12732i;
import p123rx.p401n.p404c.C12740l;

/* renamed from: rx.h */
/* compiled from: Scheduler */
public abstract class C5373h {

    /* renamed from: rx.h$a */
    /* compiled from: Scheduler */
    public static abstract class C5374a implements C5375k {
        /* renamed from: a */
        public abstract C5375k mo18710a(C5377a aVar);

        /* renamed from: a */
        public C5375k mo18711a(C5377a aVar, long j, long j2, TimeUnit timeUnit) {
            return C12732i.m41225a(this, aVar, j, j2, timeUnit, (C12732i.C12734b) null);
        }

        /* renamed from: a */
        public abstract C5375k mo18712a(C5377a aVar, long j, TimeUnit timeUnit);

        /* renamed from: b */
        public long mo18713b() {
            return System.currentTimeMillis();
        }
    }

    public abstract C5374a createWorker();

    public long now() {
        return System.currentTimeMillis();
    }

    public <S extends C5373h & C5375k> S when(C5379n<C5368e<C5368e<C5328b>>, C5328b> nVar) {
        return new C12740l(nVar, this);
    }
}
