package androidx.work;

import android.os.Build;
import androidx.work.C0976r;

/* renamed from: androidx.work.k */
/* compiled from: OneTimeWorkRequest */
public final class C0962k extends C0976r {

    /* renamed from: androidx.work.k$a */
    /* compiled from: OneTimeWorkRequest */
    public static final class C0963a extends C0976r.C0977a<C0963a, C0962k> {
        public C0963a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f3335c.f3207d = OverwritingInputMerger.class.getName();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C0963a mo4972c() {
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0962k m4135b() {
            if (!this.f3333a || Build.VERSION.SDK_INT < 23 || !this.f3335c.f3213j.mo4700h()) {
                return new C0962k(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
    }

    C0962k(C0963a aVar) {
        super(aVar.f3334b, aVar.f3335c, aVar.f3336d);
    }
}
