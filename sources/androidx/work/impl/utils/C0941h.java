package androidx.work.impl.utils;

import androidx.work.C0834i;
import androidx.work.C0974p;
import androidx.work.impl.C0868h;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p012l.C0914k;

/* renamed from: androidx.work.impl.utils.h */
/* compiled from: StopWorkRunnable */
public class C0941h implements Runnable {

    /* renamed from: h */
    private static final String f3267h = C0834i.m3721a("StopWorkRunnable");

    /* renamed from: f */
    private C0868h f3268f;

    /* renamed from: g */
    private String f3269g;

    public C0941h(C0868h hVar, String str) {
        this.f3268f = hVar;
        this.f3269g = str;
    }

    public void run() {
        WorkDatabase f = this.f3268f.mo4808f();
        C0914k d = f.mo4734d();
        f.beginTransaction();
        try {
            if (d.mo4900c(this.f3269g) == C0974p.RUNNING) {
                d.mo4890a(C0974p.ENQUEUED, this.f3269g);
            }
            boolean e = this.f3268f.mo4805d().mo4782e(this.f3269g);
            C0834i.m3720a().mo4726a(f3267h, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", new Object[]{this.f3269g, Boolean.valueOf(e)}), new Throwable[0]);
            f.setTransactionSuccessful();
        } finally {
            f.endTransaction();
        }
    }
}
