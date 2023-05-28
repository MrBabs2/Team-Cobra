package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.C0821a;
import androidx.work.C0825c;
import androidx.work.C0827d;
import androidx.work.C0834i;
import androidx.work.C0961j;
import androidx.work.impl.p012l.C0911j;

/* renamed from: androidx.work.impl.background.systemjob.a */
/* compiled from: SystemJobInfoConverter */
class C0855a {

    /* renamed from: b */
    private static final String f3064b = C0834i.m3721a("SystemJobInfoConverter");

    /* renamed from: a */
    private final ComponentName f3065a;

    /* renamed from: androidx.work.impl.background.systemjob.a$a */
    /* compiled from: SystemJobInfoConverter */
    static /* synthetic */ class C0856a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3066a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.work.j[] r0 = androidx.work.C0961j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3066a = r0
                androidx.work.j r1 = androidx.work.C0961j.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3066a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.work.j r1 = androidx.work.C0961j.CONNECTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3066a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.work.j r1 = androidx.work.C0961j.UNMETERED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3066a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.work.j r1 = androidx.work.C0961j.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f3066a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.work.j r1 = androidx.work.C0961j.METERED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.C0855a.C0856a.<clinit>():void");
        }
    }

    C0855a(Context context) {
        this.f3065a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JobInfo mo4773a(C0911j jVar, int i) {
        C0825c cVar = jVar.f3213j;
        int a = m3811a(cVar.mo4689b());
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", jVar.f3204a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", jVar.mo4884d());
        JobInfo.Builder extras = new JobInfo.Builder(i, this.f3065a).setRequiredNetworkType(a).setRequiresCharging(cVar.mo4699g()).setRequiresDeviceIdle(cVar.mo4700h()).setExtras(persistableBundle);
        if (!cVar.mo4700h()) {
            extras.setBackoffCriteria(jVar.f3216m, jVar.f3215l == C0821a.LINEAR ? 0 : 1);
        }
        extras.setMinimumLatency(Math.max(jVar.mo4879a() - System.currentTimeMillis(), 0));
        if (Build.VERSION.SDK_INT >= 24 && cVar.mo4696e()) {
            for (C0827d.C0828a a2 : cVar.mo4684a().mo4705a()) {
                extras.addTriggerContentUri(m3812a(a2));
            }
            extras.setTriggerContentUpdateDelay(cVar.mo4692c());
            extras.setTriggerContentMaxDelay(cVar.mo4694d());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(cVar.mo4698f());
            extras.setRequiresStorageNotLow(cVar.mo4702i());
        }
        return extras.build();
    }

    /* renamed from: a */
    private static JobInfo.TriggerContentUri m3812a(C0827d.C0828a aVar) {
        return new JobInfo.TriggerContentUri(aVar.mo4710a(), aVar.mo4711b() ? 1 : 0);
    }

    /* renamed from: a */
    static int m3811a(C0961j jVar) {
        int i = C0856a.f3066a[jVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            if (i == 5 && Build.VERSION.SDK_INT >= 26) {
                return 4;
            }
        } else if (Build.VERSION.SDK_INT >= 24) {
            return 3;
        }
        C0834i.m3720a().mo4726a(f3064b, String.format("API version too low. Cannot convert network type value %s", new Object[]{jVar}), new Throwable[0]);
        return 1;
    }
}
