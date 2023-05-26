package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.C0526m;
import androidx.work.C0834i;
import androidx.work.impl.background.systemalarm.C0845e;
import androidx.work.impl.utils.C0942i;

public class SystemAlarmService extends C0526m implements C0845e.C0848c {

    /* renamed from: i */
    private static final String f3011i = C0834i.m3721a("SystemAlarmService");

    /* renamed from: g */
    private C0845e f3012g;

    /* renamed from: h */
    private boolean f3013h;

    /* renamed from: b */
    private void m3760b() {
        C0845e eVar = new C0845e(this);
        this.f3012g = eVar;
        eVar.mo4751a((C0845e.C0848c) this);
    }

    /* renamed from: a */
    public void mo4742a() {
        this.f3013h = true;
        C0834i.m3720a().mo4726a(f3011i, "All commands completed in dispatcher", new Throwable[0]);
        C0942i.m4080a();
        stopSelf();
    }

    public void onCreate() {
        super.onCreate();
        m3760b();
        this.f3013h = false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f3013h = true;
        this.f3012g.mo4758f();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f3013h) {
            C0834i.m3720a().mo4728c(f3011i, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f3012g.mo4758f();
            m3760b();
            this.f3013h = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f3012g.mo4753a(intent, i2);
        return 3;
    }
}
