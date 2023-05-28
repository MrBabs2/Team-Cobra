package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import androidx.work.C0822b;
import androidx.work.C0834i;
import androidx.work.impl.background.systemalarm.C0850f;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.C0857b;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.p012l.C0911j;
import androidx.work.impl.p012l.C0914k;
import androidx.work.impl.utils.C0936d;
import java.util.List;

/* renamed from: androidx.work.impl.e */
/* compiled from: Schedulers */
public class C0861e {

    /* renamed from: a */
    private static final String f3086a = C0834i.m3721a("Schedulers");

    /* renamed from: a */
    public static void m3833a(C0822b bVar, WorkDatabase workDatabase, List<C0860d> list) {
        if (list != null && list.size() != 0) {
            C0914k d = workDatabase.mo4734d();
            workDatabase.beginTransaction();
            try {
                List<C0911j> a = d.mo4893a(bVar.mo4675c());
                if (a != null && a.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (C0911j jVar : a) {
                        d.mo4891a(jVar.f3204a, currentTimeMillis);
                    }
                }
                workDatabase.setTransactionSuccessful();
                if (a != null && a.size() > 0) {
                    C0911j[] jVarArr = (C0911j[]) a.toArray(new C0911j[0]);
                    for (C0860d a2 : list) {
                        a2.mo4762a(jVarArr);
                    }
                }
            } finally {
                workDatabase.endTransaction();
            }
        }
    }

    /* renamed from: a */
    static C0860d m3832a(Context context, C0868h hVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            C0857b bVar = new C0857b(context, hVar);
            C0936d.m4074a(context, SystemJobService.class, true);
            C0834i.m3720a().mo4726a(f3086a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return bVar;
        }
        C0860d a = m3831a(context);
        if (a != null) {
            return a;
        }
        C0850f fVar = new C0850f(context);
        C0936d.m4074a(context, SystemAlarmService.class, true);
        C0834i.m3720a().mo4726a(f3086a, "Created SystemAlarmScheduler", new Throwable[0]);
        return fVar;
    }

    /* renamed from: a */
    private static C0860d m3831a(Context context) {
        try {
            C0860d dVar = (C0860d) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
            C0834i.m3720a().mo4726a(f3086a, String.format("Created %s", new Object[]{"androidx.work.impl.background.gcm.GcmScheduler"}), new Throwable[0]);
            return dVar;
        } catch (Throwable th) {
            C0834i.m3720a().mo4726a(f3086a, "Unable to create GCM Scheduler", th);
            return null;
        }
    }
}
