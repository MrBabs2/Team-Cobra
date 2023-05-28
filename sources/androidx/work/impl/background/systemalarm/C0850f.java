package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.work.C0834i;
import androidx.work.impl.C0860d;
import androidx.work.impl.p012l.C0911j;

/* renamed from: androidx.work.impl.background.systemalarm.f */
/* compiled from: SystemAlarmScheduler */
public class C0850f implements C0860d {

    /* renamed from: g */
    private static final String f3050g = C0834i.m3721a("SystemAlarmScheduler");

    /* renamed from: f */
    private final Context f3051f;

    public C0850f(Context context) {
        this.f3051f = context.getApplicationContext();
    }

    /* renamed from: a */
    public void mo4762a(C0911j... jVarArr) {
        for (C0911j a : jVarArr) {
            m3804a(a);
        }
    }

    public void cancel(String str) {
        this.f3051f.startService(C0842b.m3773c(this.f3051f, str));
    }

    /* renamed from: a */
    private void m3804a(C0911j jVar) {
        C0834i.m3720a().mo4726a(f3050g, String.format("Scheduling work with workSpecId %s", new Object[]{jVar.f3204a}), new Throwable[0]);
        this.f3051f.startService(C0842b.m3771b(this.f3051f, jVar.f3204a));
    }
}
