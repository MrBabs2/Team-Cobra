package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.C0834i;
import androidx.work.C0974p;
import androidx.work.impl.C0861e;
import androidx.work.impl.C0868h;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.C0857b;
import androidx.work.impl.p012l.C0911j;
import androidx.work.impl.p012l.C0914k;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ForceStopRunnable implements Runnable {

    /* renamed from: h */
    private static final String f3238h = C0834i.m3721a("ForceStopRunnable");

    /* renamed from: i */
    private static final long f3239i = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: f */
    private final Context f3240f;

    /* renamed from: g */
    private final C0868h f3241g;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a */
        private static final String f3242a = C0834i.m3721a("ForceStopRunnable$Rcvr");

        public void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                C0834i.m3720a().mo4729d(f3242a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
                ForceStopRunnable.m4048b(context);
            }
        }
    }

    public ForceStopRunnable(Context context, C0868h hVar) {
        this.f3240f = context.getApplicationContext();
        this.f3241g = hVar;
    }

    /* renamed from: a */
    public boolean mo4913a() {
        if (Build.VERSION.SDK_INT >= 23) {
            C0857b.m3818b(this.f3240f);
        }
        WorkDatabase f = this.f3241g.mo4808f();
        C0914k d = f.mo4734d();
        f.beginTransaction();
        try {
            List<C0911j> b = d.mo4897b();
            boolean z = b != null && !b.isEmpty();
            if (z) {
                for (C0911j next : b) {
                    d.mo4890a(C0974p.ENQUEUED, next.f3204a);
                    d.mo4891a(next.f3204a, -1);
                }
            }
            f.setTransactionSuccessful();
            return z;
        } finally {
            f.endTransaction();
        }
    }

    /* renamed from: b */
    public boolean mo4914b() {
        if (m4046a(this.f3240f, 536870912) != null) {
            return false;
        }
        m4048b(this.f3240f);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo4915c() {
        return this.f3241g.mo4803c().mo4930a();
    }

    public void run() {
        C0834i.m3720a().mo4726a(f3238h, "Performing cleanup operations.", new Throwable[0]);
        boolean a = mo4913a();
        if (mo4915c()) {
            C0834i.m3720a().mo4726a(f3238h, "Rescheduling Workers.", new Throwable[0]);
            this.f3241g.mo4811i();
            this.f3241g.mo4803c().mo4929a(false);
        } else if (mo4914b()) {
            C0834i.m3720a().mo4726a(f3238h, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.f3241g.mo4811i();
        } else if (a) {
            C0834i.m3720a().mo4726a(f3238h, "Found unfinished work, scheduling it.", new Throwable[0]);
            C0861e.m3833a(this.f3241g.mo4801b(), this.f3241g.mo4808f(), this.f3241g.mo4807e());
        }
        this.f3241g.mo4810h();
    }

    /* renamed from: b */
    static void m4048b(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent a = m4046a(context, 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f3239i;
        if (alarmManager == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            alarmManager.setExact(0, currentTimeMillis, a);
        } else {
            alarmManager.set(0, currentTimeMillis, a);
        }
    }

    /* renamed from: a */
    private static PendingIntent m4046a(Context context, int i) {
        return PendingIntent.getBroadcast(context, -1, m4047a(context), i);
    }

    /* renamed from: a */
    static Intent m4047a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }
}
