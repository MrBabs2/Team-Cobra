package androidx.work;

import android.os.Build;
import androidx.work.C0976r;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.work.m */
/* compiled from: PeriodicWorkRequest */
public final class C0970m extends C0976r {

    /* renamed from: androidx.work.m$a */
    /* compiled from: PeriodicWorkRequest */
    public static final class C0971a extends C0976r.C0977a<C0971a, C0970m> {
        public C0971a(Class<? extends ListenableWorker> cls, long j, TimeUnit timeUnit) {
            super(cls);
            this.f3335c.mo4880a(timeUnit.toMillis(j));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C0971a mo4972c() {
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0970m m4140b() {
            if (!this.f3333a || Build.VERSION.SDK_INT < 23 || !this.f3335c.f3213j.mo4700h()) {
                return new C0970m(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
    }

    C0970m(C0971a aVar) {
        super(aVar.f3334b, aVar.f3335c, aVar.f3336d);
    }
}
