package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.C0834i;
import androidx.work.impl.C0838a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.C0845e;
import androidx.work.impl.p012l.C0911j;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.work.impl.background.systemalarm.b */
/* compiled from: CommandHandler */
public class C0842b implements C0838a {

    /* renamed from: i */
    private static final String f3015i = C0834i.m3721a("CommandHandler");

    /* renamed from: f */
    private final Context f3016f;

    /* renamed from: g */
    private final Map<String, C0838a> f3017g = new HashMap();

    /* renamed from: h */
    private final Object f3018h = new Object();

    C0842b(Context context) {
        this.f3016f = context;
    }

    /* renamed from: a */
    static Intent m3767a(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: b */
    static Intent m3771b(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: c */
    static Intent m3773c(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: d */
    private void m3775d(Intent intent, int i, C0845e eVar) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        C0834i.m3720a().mo4726a(f3015i, String.format("Handling onExecutionCompleted %s, %s", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        mo4736a(string, z);
    }

    /* renamed from: e */
    private void m3776e(Intent intent, int i, C0845e eVar) {
        C0834i.m3720a().mo4726a(f3015i, String.format("Handling reschedule %s, %s", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        eVar.mo4756d().mo4811i();
    }

    /* renamed from: f */
    private void m3777f(Intent intent, int i, C0845e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        C0834i.m3720a().mo4726a(f3015i, String.format("Handling schedule work for %s", new Object[]{string}), new Throwable[0]);
        WorkDatabase f = eVar.mo4756d().mo4808f();
        f.beginTransaction();
        try {
            C0911j d = f.mo4734d().mo4903d(string);
            if (d == null) {
                C0834i a = C0834i.m3720a();
                String str = f3015i;
                a.mo4730e(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
            } else if (d.f3205b.mo4977a()) {
                C0834i a2 = C0834i.m3720a();
                String str2 = f3015i;
                a2.mo4730e(str2, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                f.endTransaction();
            } else {
                long a3 = d.mo4879a();
                if (!d.mo4882b()) {
                    C0834i.m3720a().mo4726a(f3015i, String.format("Setting up Alarms for %s at %s", new Object[]{string, Long.valueOf(a3)}), new Throwable[0]);
                    C0841a.m3763a(this.f3016f, eVar.mo4756d(), string, a3);
                } else {
                    C0834i.m3720a().mo4726a(f3015i, String.format("Opportunistically setting an alarm for %s at %s", new Object[]{string, Long.valueOf(a3)}), new Throwable[0]);
                    C0841a.m3763a(this.f3016f, eVar.mo4756d(), string, a3);
                    eVar.mo4752a((Runnable) new C0845e.C0847b(eVar, m3766a(this.f3016f), i));
                }
                f.setTransactionSuccessful();
                f.endTransaction();
            }
        } finally {
            f.endTransaction();
        }
    }

    /* renamed from: g */
    private void m3778g(Intent intent, int i, C0845e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        C0834i.m3720a().mo4726a(f3015i, String.format("Handing stopWork work for %s", new Object[]{string}), new Throwable[0]);
        eVar.mo4756d().mo4806d(string);
        C0841a.m3762a(this.f3016f, eVar.mo4756d(), string);
        eVar.mo4736a(string, false);
    }

    /* renamed from: a */
    static Intent m3766a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    /* renamed from: b */
    static Intent m3770b(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    /* renamed from: c */
    private void m3774c(Intent intent, int i, C0845e eVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.f3018h) {
            String string = extras.getString("KEY_WORKSPEC_ID");
            C0834i.m3720a().mo4726a(f3015i, String.format("Handing delay met for %s", new Object[]{string}), new Throwable[0]);
            if (!this.f3017g.containsKey(string)) {
                C0844d dVar = new C0844d(this.f3016f, i, string, eVar);
                this.f3017g.put(string, dVar);
                dVar.mo4746a();
            } else {
                C0834i.m3720a().mo4726a(f3015i, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", new Object[]{string}), new Throwable[0]);
            }
        }
    }

    /* renamed from: a */
    static Intent m3768a(Context context, String str, boolean z) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return intent;
    }

    /* renamed from: b */
    private void m3772b(Intent intent, int i, C0845e eVar) {
        C0834i.m3720a().mo4726a(f3015i, String.format("Handling constraints changed %s", new Object[]{intent}), new Throwable[0]);
        new C0843c(this.f3016f, i, eVar).mo4745a();
    }

    /* renamed from: a */
    public void mo4736a(String str, boolean z) {
        synchronized (this.f3018h) {
            C0838a remove = this.f3017g.remove(str);
            if (remove != null) {
                remove.mo4736a(str, z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4744a() {
        boolean z;
        synchronized (this.f3018h) {
            z = !this.f3017g.isEmpty();
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4743a(Intent intent, int i, C0845e eVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            m3772b(intent, i, eVar);
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            m3776e(intent, i, eVar);
        } else {
            if (!m3769a(intent.getExtras(), "KEY_WORKSPEC_ID")) {
                C0834i.m3720a().mo4727b(f3015i, String.format("Invalid request for %s, requires %s.", new Object[]{action, "KEY_WORKSPEC_ID"}), new Throwable[0]);
            } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
                m3777f(intent, i, eVar);
            } else if ("ACTION_DELAY_MET".equals(action)) {
                m3774c(intent, i, eVar);
            } else if ("ACTION_STOP_WORK".equals(action)) {
                m3778g(intent, i, eVar);
            } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                m3775d(intent, i, eVar);
            } else {
                C0834i.m3720a().mo4730e(f3015i, String.format("Ignoring intent %s", new Object[]{intent}), new Throwable[0]);
            }
        }
    }

    /* renamed from: a */
    private static boolean m3769a(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }
}
