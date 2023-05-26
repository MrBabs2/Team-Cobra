package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.C0834i;
import androidx.work.impl.C0838a;
import androidx.work.impl.background.systemalarm.C0845e;
import androidx.work.impl.background.systemalarm.C0851g;
import androidx.work.impl.p009k.C0876c;
import androidx.work.impl.p009k.C0877d;
import androidx.work.impl.p012l.C0911j;
import androidx.work.impl.utils.C0942i;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.work.impl.background.systemalarm.d */
/* compiled from: DelayMetCommandHandler */
public class C0844d implements C0876c, C0838a, C0851g.C0853b {

    /* renamed from: o */
    private static final String f3024o = C0834i.m3721a("DelayMetCommandHandler");

    /* renamed from: f */
    private final Context f3025f;

    /* renamed from: g */
    private final int f3026g;

    /* renamed from: h */
    private final String f3027h;

    /* renamed from: i */
    private final C0845e f3028i;

    /* renamed from: j */
    private final C0877d f3029j;

    /* renamed from: k */
    private final Object f3030k = new Object();

    /* renamed from: l */
    private int f3031l = 0;

    /* renamed from: m */
    private PowerManager.WakeLock f3032m;

    /* renamed from: n */
    private boolean f3033n = false;

    C0844d(Context context, int i, String str, C0845e eVar) {
        this.f3025f = context;
        this.f3026g = i;
        this.f3028i = eVar;
        this.f3027h = str;
        this.f3029j = new C0877d(this.f3025f, eVar.mo4755c(), this);
    }

    /* renamed from: c */
    private void m3784c() {
        synchronized (this.f3030k) {
            if (this.f3031l < 2) {
                this.f3031l = 2;
                C0834i.m3720a().mo4726a(f3024o, String.format("Stopping work for WorkSpec %s", new Object[]{this.f3027h}), new Throwable[0]);
                this.f3028i.mo4752a((Runnable) new C0845e.C0847b(this.f3028i, C0842b.m3773c(this.f3025f, this.f3027h), this.f3026g));
                if (this.f3028i.mo4754b().mo4779b(this.f3027h)) {
                    C0834i.m3720a().mo4726a(f3024o, String.format("WorkSpec %s needs to be rescheduled", new Object[]{this.f3027h}), new Throwable[0]);
                    this.f3028i.mo4752a((Runnable) new C0845e.C0847b(this.f3028i, C0842b.m3771b(this.f3025f, this.f3027h), this.f3026g));
                } else {
                    C0834i.m3720a().mo4726a(f3024o, String.format("Processor does not have WorkSpec %s. No need to reschedule ", new Object[]{this.f3027h}), new Throwable[0]);
                }
            } else {
                C0834i.m3720a().mo4726a(f3024o, String.format("Already stopped work for %s", new Object[]{this.f3027h}), new Throwable[0]);
            }
        }
    }

    /* renamed from: a */
    public void mo4736a(String str, boolean z) {
        C0834i.m3720a().mo4726a(f3024o, String.format("onExecuted %s, %s", new Object[]{str, Boolean.valueOf(z)}), new Throwable[0]);
        m3783b();
        if (z) {
            Intent b = C0842b.m3771b(this.f3025f, this.f3027h);
            C0845e eVar = this.f3028i;
            eVar.mo4752a((Runnable) new C0845e.C0847b(eVar, b, this.f3026g));
        }
        if (this.f3033n) {
            Intent a = C0842b.m3766a(this.f3025f);
            C0845e eVar2 = this.f3028i;
            eVar2.mo4752a((Runnable) new C0845e.C0847b(eVar2, a, this.f3026g));
        }
    }

    /* renamed from: b */
    public void mo4749b(List<String> list) {
        if (list.contains(this.f3027h)) {
            synchronized (this.f3030k) {
                if (this.f3031l == 0) {
                    this.f3031l = 1;
                    C0834i.m3720a().mo4726a(f3024o, String.format("onAllConstraintsMet for %s", new Object[]{this.f3027h}), new Throwable[0]);
                    if (this.f3028i.mo4754b().mo4780c(this.f3027h)) {
                        this.f3028i.mo4757e().mo4766a(this.f3027h, 600000, this);
                    } else {
                        m3783b();
                    }
                } else {
                    C0834i.m3720a().mo4726a(f3024o, String.format("Already started work for %s", new Object[]{this.f3027h}), new Throwable[0]);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo4747a(String str) {
        C0834i.m3720a().mo4726a(f3024o, String.format("Exceeded time limits on execution for %s", new Object[]{str}), new Throwable[0]);
        m3784c();
    }

    /* renamed from: b */
    private void m3783b() {
        synchronized (this.f3030k) {
            this.f3029j.mo4830a();
            this.f3028i.mo4757e().mo4765a(this.f3027h);
            if (this.f3032m != null && this.f3032m.isHeld()) {
                C0834i.m3720a().mo4726a(f3024o, String.format("Releasing wakelock %s for WorkSpec %s", new Object[]{this.f3032m, this.f3027h}), new Throwable[0]);
                this.f3032m.release();
            }
        }
    }

    /* renamed from: a */
    public void mo4748a(List<String> list) {
        m3784c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4746a() {
        this.f3032m = C0942i.m4079a(this.f3025f, String.format("%s (%s)", new Object[]{this.f3027h, Integer.valueOf(this.f3026g)}));
        C0834i.m3720a().mo4726a(f3024o, String.format("Acquiring wakelock %s for WorkSpec %s", new Object[]{this.f3032m, this.f3027h}), new Throwable[0]);
        this.f3032m.acquire();
        C0911j d = this.f3028i.mo4756d().mo4808f().mo4734d().mo4903d(this.f3027h);
        if (d == null) {
            m3784c();
            return;
        }
        boolean b = d.mo4882b();
        this.f3033n = b;
        if (!b) {
            C0834i.m3720a().mo4726a(f3024o, String.format("No constraints for %s", new Object[]{this.f3027h}), new Throwable[0]);
            mo4749b(Collections.singletonList(this.f3027h));
            return;
        }
        this.f3029j.mo4834c(Collections.singletonList(d));
    }
}
