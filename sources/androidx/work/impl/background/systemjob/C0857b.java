package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.C0834i;
import androidx.work.C0974p;
import androidx.work.impl.C0860d;
import androidx.work.impl.C0868h;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p012l.C0902d;
import androidx.work.impl.p012l.C0911j;
import androidx.work.impl.utils.C0935c;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: androidx.work.impl.background.systemjob.b */
/* compiled from: SystemJobScheduler */
public class C0857b implements C0860d {

    /* renamed from: k */
    private static final String f3067k = C0834i.m3721a("SystemJobScheduler");

    /* renamed from: f */
    private final Context f3068f;

    /* renamed from: g */
    private final JobScheduler f3069g;

    /* renamed from: h */
    private final C0868h f3070h;

    /* renamed from: i */
    private final C0935c f3071i;

    /* renamed from: j */
    private final C0855a f3072j;

    public C0857b(Context context, C0868h hVar) {
        this(context, hVar, (JobScheduler) context.getSystemService("jobscheduler"), new C0855a(context));
    }

    /* renamed from: b */
    public static void m3818b(Context context) {
        List<JobInfo> a;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (a = m3814a(context, jobScheduler)) != null && !a.isEmpty()) {
            for (JobInfo next : a) {
                PersistableBundle extras = next.getExtras();
                if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    m3816a(jobScheduler, next.getId());
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo4762a(C0911j... jVarArr) {
        int i;
        List<Integer> a;
        int i2;
        WorkDatabase f = this.f3070h.mo4808f();
        int length = jVarArr.length;
        int i3 = 0;
        while (i3 < length) {
            C0911j jVar = jVarArr[i3];
            f.beginTransaction();
            try {
                C0911j d = f.mo4734d().mo4903d(jVar.f3204a);
                if (d == null) {
                    C0834i a2 = C0834i.m3720a();
                    String str = f3067k;
                    a2.mo4730e(str, "Skipping scheduling " + jVar.f3204a + " because it's no longer in the DB", new Throwable[0]);
                    f.setTransactionSuccessful();
                } else if (d.f3205b != C0974p.ENQUEUED) {
                    C0834i a3 = C0834i.m3720a();
                    String str2 = f3067k;
                    a3.mo4730e(str2, "Skipping scheduling " + jVar.f3204a + " because it is no longer enqueued", new Throwable[0]);
                    f.setTransactionSuccessful();
                } else {
                    C0902d a4 = f.mo4732b().mo4873a(jVar.f3204a);
                    if (a4 != null) {
                        i = a4.f3195b;
                    } else {
                        i = this.f3071i.mo4928a(this.f3070h.mo4801b().mo4676d(), this.f3070h.mo4801b().mo4674b());
                    }
                    if (a4 == null) {
                        this.f3070h.mo4808f().mo4732b().mo4874a(new C0902d(jVar.f3204a, i));
                    }
                    mo4774a(jVar, i);
                    if (Build.VERSION.SDK_INT == 23 && (a = m3815a(this.f3068f, this.f3069g, jVar.f3204a)) != null) {
                        int indexOf = a.indexOf(Integer.valueOf(i));
                        if (indexOf >= 0) {
                            a.remove(indexOf);
                        }
                        if (!a.isEmpty()) {
                            i2 = a.get(0).intValue();
                        } else {
                            i2 = this.f3071i.mo4928a(this.f3070h.mo4801b().mo4676d(), this.f3070h.mo4801b().mo4674b());
                        }
                        mo4774a(jVar, i2);
                    }
                    f.setTransactionSuccessful();
                }
                f.endTransaction();
                i3++;
            } catch (Throwable th) {
                f.endTransaction();
                throw th;
            }
        }
    }

    public void cancel(String str) {
        List<Integer> a = m3815a(this.f3068f, this.f3069g, str);
        if (a != null && !a.isEmpty()) {
            for (Integer intValue : a) {
                m3816a(this.f3069g, intValue.intValue());
            }
            this.f3070h.mo4808f().mo4732b().mo4875b(str);
        }
    }

    public C0857b(Context context, C0868h hVar, JobScheduler jobScheduler, C0855a aVar) {
        this.f3068f = context;
        this.f3070h = hVar;
        this.f3069g = jobScheduler;
        this.f3071i = new C0935c(context);
        this.f3072j = aVar;
    }

    /* renamed from: a */
    public void mo4774a(C0911j jVar, int i) {
        JobInfo a = this.f3072j.mo4773a(jVar, i);
        C0834i.m3720a().mo4726a(f3067k, String.format("Scheduling work ID %s Job ID %s", new Object[]{jVar.f3204a, Integer.valueOf(i)}), new Throwable[0]);
        try {
            this.f3069g.schedule(a);
        } catch (IllegalStateException e) {
            List<JobInfo> a2 = m3814a(this.f3068f, this.f3069g);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", new Object[]{Integer.valueOf(a2 != null ? a2.size() : 0), Integer.valueOf(this.f3070h.mo4808f().mo4734d().mo4892a().size()), Integer.valueOf(this.f3070h.mo4801b().mo4675c())});
            C0834i.m3720a().mo4727b(f3067k, format, new Throwable[0]);
            throw new IllegalStateException(format, e);
        } catch (Throwable th) {
            C0834i.m3720a().mo4727b(f3067k, String.format("Unable to schedule %s", new Object[]{jVar}), th);
        }
    }

    /* renamed from: a */
    private static void m3816a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            C0834i.m3720a().mo4727b(f3067k, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i)}), th);
        }
    }

    /* renamed from: a */
    public static void m3817a(Context context) {
        List<JobInfo> a;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (a = m3814a(context, jobScheduler)) != null && !a.isEmpty()) {
            for (JobInfo id : a) {
                m3816a(jobScheduler, id.getId());
            }
        }
    }

    /* renamed from: a */
    private static List<JobInfo> m3814a(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            C0834i.m3720a().mo4727b(f3067k, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo next : list) {
            if (componentName.equals(next.getService())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static List<Integer> m3815a(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> a = m3814a(context, jobScheduler);
        if (a == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo next : a) {
            PersistableBundle extras = next.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID") && str.equals(extras.getString("EXTRA_WORK_SPEC_ID"))) {
                arrayList.add(Integer.valueOf(next.getId()));
            }
        }
        return arrayList;
    }
}
