package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.C0834i;
import androidx.work.impl.C0868h;
import androidx.work.impl.p012l.C0902d;
import androidx.work.impl.p012l.C0903e;
import androidx.work.impl.utils.C0935c;

/* renamed from: androidx.work.impl.background.systemalarm.a */
/* compiled from: Alarms */
class C0841a {

    /* renamed from: a */
    private static final String f3014a = C0834i.m3721a("Alarms");

    /* renamed from: a */
    public static void m3763a(Context context, C0868h hVar, String str, long j) {
        C0903e b = hVar.mo4808f().mo4732b();
        C0902d a = b.mo4873a(str);
        if (a != null) {
            m3764a(context, str, a.f3195b);
            m3765a(context, str, a.f3195b, j);
            return;
        }
        int a2 = new C0935c(context).mo4927a();
        b.mo4874a(new C0902d(str, a2));
        m3765a(context, str, a2, j);
    }

    /* renamed from: a */
    public static void m3762a(Context context, C0868h hVar, String str) {
        C0903e b = hVar.mo4808f().mo4732b();
        C0902d a = b.mo4873a(str);
        if (a != null) {
            m3764a(context, str, a.f3195b);
            C0834i.m3720a().mo4726a(f3014a, String.format("Removing SystemIdInfo for workSpecId (%s)", new Object[]{str}), new Throwable[0]);
            b.mo4875b(str);
        }
    }

    /* renamed from: a */
    private static void m3764a(Context context, String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, C0842b.m3767a(context, str), 536870912);
        if (service != null && alarmManager != null) {
            C0834i.m3720a().mo4726a(f3014a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", new Object[]{str, Integer.valueOf(i)}), new Throwable[0]);
            alarmManager.cancel(service);
        }
    }

    /* renamed from: a */
    private static void m3765a(Context context, String str, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, C0842b.m3767a(context, str), 1073741824);
        if (alarmManager == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            alarmManager.setExact(0, j, service);
        } else {
            alarmManager.set(0, j, service);
        }
    }
}
