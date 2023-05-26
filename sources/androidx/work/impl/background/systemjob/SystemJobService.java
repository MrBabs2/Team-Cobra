package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.C0834i;
import androidx.work.impl.C0838a;
import androidx.work.impl.C0868h;
import java.util.HashMap;
import java.util.Map;

public class SystemJobService extends JobService implements C0838a {

    /* renamed from: h */
    private static final String f3061h = C0834i.m3721a("SystemJobService");

    /* renamed from: f */
    private C0868h f3062f;

    /* renamed from: g */
    private final Map<String, JobParameters> f3063g = new HashMap();

    /* renamed from: a */
    public void mo4736a(String str, boolean z) {
        JobParameters remove;
        C0834i.m3720a().mo4726a(f3061h, String.format("%s executed on JobScheduler", new Object[]{str}), new Throwable[0]);
        synchronized (this.f3063g) {
            remove = this.f3063g.remove(str);
        }
        if (remove != null) {
            jobFinished(remove, z);
        }
    }

    public void onCreate() {
        super.onCreate();
        try {
            C0868h a = C0868h.m3846a(getApplicationContext());
            this.f3062f = a;
            a.mo4805d().mo4775a((C0838a) this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                C0834i.m3720a().mo4730e(f3061h, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C0868h hVar = this.f3062f;
        if (hVar != null) {
            hVar.mo4805d().mo4778b((C0838a) this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0082, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0087, code lost:
        if (android.os.Build.VERSION.SDK_INT < 24) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0089, code lost:
        r2 = new androidx.work.WorkerParameters.C0820a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0092, code lost:
        if (r9.getTriggeredContentUris() == null) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0094, code lost:
        r2.f2942b = java.util.Arrays.asList(r9.getTriggeredContentUris());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a2, code lost:
        if (r9.getTriggeredContentAuthorities() == null) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a4, code lost:
        r2.f2941a = java.util.Arrays.asList(r9.getTriggeredContentAuthorities());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b2, code lost:
        if (android.os.Build.VERSION.SDK_INT < 28) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b4, code lost:
        r2.f2943c = r9.getNetwork();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ba, code lost:
        r8.f3062f.mo4800a(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bf, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartJob(android.app.job.JobParameters r9) {
        /*
            r8 = this;
            androidx.work.impl.h r0 = r8.f3062f
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0017
            androidx.work.i r0 = androidx.work.C0834i.m3720a()
            java.lang.String r3 = f3061h
            java.lang.Throwable[] r4 = new java.lang.Throwable[r2]
            java.lang.String r5 = "WorkManager is not initialized; requesting retry."
            r0.mo4726a(r3, r5, r4)
            r8.jobFinished(r9, r1)
            return r2
        L_0x0017:
            android.os.PersistableBundle r0 = r9.getExtras()
            if (r0 != 0) goto L_0x002b
            androidx.work.i r9 = androidx.work.C0834i.m3720a()
            java.lang.String r0 = f3061h
            java.lang.Throwable[] r1 = new java.lang.Throwable[r2]
            java.lang.String r3 = "No extras in JobParameters."
            r9.mo4727b(r0, r3, r1)
            return r2
        L_0x002b:
            java.lang.String r3 = "EXTRA_WORK_SPEC_ID"
            java.lang.String r0 = r0.getString(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x0045
            androidx.work.i r9 = androidx.work.C0834i.m3720a()
            java.lang.String r0 = f3061h
            java.lang.Throwable[] r1 = new java.lang.Throwable[r2]
            java.lang.String r3 = "WorkSpec id not found!"
            r9.mo4727b(r0, r3, r1)
            return r2
        L_0x0045:
            java.util.Map<java.lang.String, android.app.job.JobParameters> r3 = r8.f3063g
            monitor-enter(r3)
            java.util.Map<java.lang.String, android.app.job.JobParameters> r4 = r8.f3063g     // Catch:{ all -> 0x00c0 }
            boolean r4 = r4.containsKey(r0)     // Catch:{ all -> 0x00c0 }
            if (r4 == 0) goto L_0x0067
            androidx.work.i r9 = androidx.work.C0834i.m3720a()     // Catch:{ all -> 0x00c0 }
            java.lang.String r4 = f3061h     // Catch:{ all -> 0x00c0 }
            java.lang.String r5 = "Job is already being executed by SystemJobService: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00c0 }
            r1[r2] = r0     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = java.lang.String.format(r5, r1)     // Catch:{ all -> 0x00c0 }
            java.lang.Throwable[] r1 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x00c0 }
            r9.mo4726a(r4, r0, r1)     // Catch:{ all -> 0x00c0 }
            monitor-exit(r3)     // Catch:{ all -> 0x00c0 }
            return r2
        L_0x0067:
            androidx.work.i r4 = androidx.work.C0834i.m3720a()     // Catch:{ all -> 0x00c0 }
            java.lang.String r5 = f3061h     // Catch:{ all -> 0x00c0 }
            java.lang.String r6 = "onStartJob for %s"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ all -> 0x00c0 }
            r7[r2] = r0     // Catch:{ all -> 0x00c0 }
            java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch:{ all -> 0x00c0 }
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x00c0 }
            r4.mo4726a(r5, r6, r2)     // Catch:{ all -> 0x00c0 }
            java.util.Map<java.lang.String, android.app.job.JobParameters> r2 = r8.f3063g     // Catch:{ all -> 0x00c0 }
            r2.put(r0, r9)     // Catch:{ all -> 0x00c0 }
            monitor-exit(r3)     // Catch:{ all -> 0x00c0 }
            r2 = 0
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r3 < r4) goto L_0x00ba
            androidx.work.WorkerParameters$a r2 = new androidx.work.WorkerParameters$a
            r2.<init>()
            android.net.Uri[] r3 = r9.getTriggeredContentUris()
            if (r3 == 0) goto L_0x009e
            android.net.Uri[] r3 = r9.getTriggeredContentUris()
            java.util.List r3 = java.util.Arrays.asList(r3)
            r2.f2942b = r3
        L_0x009e:
            java.lang.String[] r3 = r9.getTriggeredContentAuthorities()
            if (r3 == 0) goto L_0x00ae
            java.lang.String[] r3 = r9.getTriggeredContentAuthorities()
            java.util.List r3 = java.util.Arrays.asList(r3)
            r2.f2941a = r3
        L_0x00ae:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 < r4) goto L_0x00ba
            android.net.Network r9 = r9.getNetwork()
            r2.f2943c = r9
        L_0x00ba:
            androidx.work.impl.h r9 = r8.f3062f
            r9.mo4800a((java.lang.String) r0, (androidx.work.WorkerParameters.C0820a) r2)
            return r1
        L_0x00c0:
            r9 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00c0 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f3062f == null) {
            C0834i.m3720a().mo4726a(f3061h, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        PersistableBundle extras = jobParameters.getExtras();
        if (extras == null) {
            C0834i.m3720a().mo4727b(f3061h, "No extras in JobParameters.", new Throwable[0]);
            return false;
        }
        String string = extras.getString("EXTRA_WORK_SPEC_ID");
        if (TextUtils.isEmpty(string)) {
            C0834i.m3720a().mo4727b(f3061h, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        C0834i.m3720a().mo4726a(f3061h, String.format("onStopJob for %s", new Object[]{string}), new Throwable[0]);
        synchronized (this.f3063g) {
            this.f3063g.remove(string);
        }
        this.f3062f.mo4806d(string);
        return !this.f3062f.mo4805d().mo4776a(string);
    }
}
