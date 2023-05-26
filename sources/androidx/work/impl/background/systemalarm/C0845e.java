package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.C0834i;
import androidx.work.impl.C0838a;
import androidx.work.impl.C0858c;
import androidx.work.impl.C0868h;
import androidx.work.impl.utils.C0942i;
import androidx.work.impl.utils.p014k.C0956a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.background.systemalarm.e */
/* compiled from: SystemAlarmDispatcher */
public class C0845e implements C0838a {

    /* renamed from: p */
    static final String f3034p = C0834i.m3721a("SystemAlarmDispatcher");

    /* renamed from: f */
    final Context f3035f;

    /* renamed from: g */
    private final C0956a f3036g;

    /* renamed from: h */
    private final C0851g f3037h;

    /* renamed from: i */
    private final C0858c f3038i;

    /* renamed from: j */
    private final C0868h f3039j;

    /* renamed from: k */
    final C0842b f3040k;

    /* renamed from: l */
    private final Handler f3041l;

    /* renamed from: m */
    final List<Intent> f3042m;

    /* renamed from: n */
    Intent f3043n;

    /* renamed from: o */
    private C0848c f3044o;

    /* renamed from: androidx.work.impl.background.systemalarm.e$a */
    /* compiled from: SystemAlarmDispatcher */
    class C0846a implements Runnable {
        C0846a() {
        }

        public void run() {
            C0849d dVar;
            C0845e eVar;
            synchronized (C0845e.this.f3042m) {
                C0845e.this.f3043n = C0845e.this.f3042m.get(0);
            }
            Intent intent = C0845e.this.f3043n;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = C0845e.this.f3043n.getIntExtra("KEY_START_ID", 0);
                C0834i.m3720a().mo4726a(C0845e.f3034p, String.format("Processing command %s, %s", new Object[]{C0845e.this.f3043n, Integer.valueOf(intExtra)}), new Throwable[0]);
                PowerManager.WakeLock a = C0942i.m4079a(C0845e.this.f3035f, String.format("%s (%s)", new Object[]{action, Integer.valueOf(intExtra)}));
                try {
                    C0834i.m3720a().mo4726a(C0845e.f3034p, String.format("Acquiring operation wake lock (%s) %s", new Object[]{action, a}), new Throwable[0]);
                    a.acquire();
                    C0845e.this.f3040k.mo4743a(C0845e.this.f3043n, intExtra, C0845e.this);
                    C0834i.m3720a().mo4726a(C0845e.f3034p, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, a}), new Throwable[0]);
                    a.release();
                    eVar = C0845e.this;
                    dVar = new C0849d(eVar);
                } catch (Throwable th) {
                    C0834i.m3720a().mo4726a(C0845e.f3034p, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, a}), new Throwable[0]);
                    a.release();
                    C0845e eVar2 = C0845e.this;
                    eVar2.mo4752a((Runnable) new C0849d(eVar2));
                    throw th;
                }
                eVar.mo4752a((Runnable) dVar);
            }
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.e$b */
    /* compiled from: SystemAlarmDispatcher */
    static class C0847b implements Runnable {

        /* renamed from: f */
        private final C0845e f3046f;

        /* renamed from: g */
        private final Intent f3047g;

        /* renamed from: h */
        private final int f3048h;

        C0847b(C0845e eVar, Intent intent, int i) {
            this.f3046f = eVar;
            this.f3047g = intent;
            this.f3048h = i;
        }

        public void run() {
            this.f3046f.mo4753a(this.f3047g, this.f3048h);
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.e$c */
    /* compiled from: SystemAlarmDispatcher */
    interface C0848c {
        /* renamed from: a */
        void mo4742a();
    }

    /* renamed from: androidx.work.impl.background.systemalarm.e$d */
    /* compiled from: SystemAlarmDispatcher */
    static class C0849d implements Runnable {

        /* renamed from: f */
        private final C0845e f3049f;

        C0849d(C0845e eVar) {
            this.f3049f = eVar;
        }

        public void run() {
            this.f3049f.mo4750a();
        }
    }

    C0845e(Context context) {
        this(context, (C0858c) null, (C0868h) null);
    }

    /* renamed from: g */
    private void m3791g() {
        if (this.f3041l.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    /* renamed from: h */
    private void m3792h() {
        m3791g();
        PowerManager.WakeLock a = C0942i.m4079a(this.f3035f, "ProcessCommand");
        try {
            a.acquire();
            this.f3039j.mo4809g().mo4961a(new C0846a());
        } finally {
            a.release();
        }
    }

    /* renamed from: a */
    public void mo4736a(String str, boolean z) {
        mo4752a((Runnable) new C0847b(this, C0842b.m3768a(this.f3035f, str, z), 0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0858c mo4754b() {
        return this.f3038i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0956a mo4755c() {
        return this.f3036g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0868h mo4756d() {
        return this.f3039j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C0851g mo4757e() {
        return this.f3037h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo4758f() {
        C0834i.m3720a().mo4726a(f3034p, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f3038i.mo4778b((C0838a) this);
        this.f3037h.mo4764a();
        this.f3044o = null;
    }

    C0845e(Context context, C0858c cVar, C0868h hVar) {
        this.f3035f = context.getApplicationContext();
        this.f3040k = new C0842b(this.f3035f);
        this.f3037h = new C0851g();
        hVar = hVar == null ? C0868h.m3846a(context) : hVar;
        this.f3039j = hVar;
        this.f3038i = cVar == null ? hVar.mo4805d() : cVar;
        this.f3036g = this.f3039j.mo4809g();
        this.f3038i.mo4775a((C0838a) this);
        this.f3042m = new ArrayList();
        this.f3043n = null;
        this.f3041l = new Handler(Looper.getMainLooper());
    }

    /* renamed from: a */
    public boolean mo4753a(Intent intent, int i) {
        boolean z = false;
        C0834i.m3720a().mo4726a(f3034p, String.format("Adding command %s (%s)", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        m3791g();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            C0834i.m3720a().mo4730e(f3034p, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && m3790a("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i);
            synchronized (this.f3042m) {
                if (!this.f3042m.isEmpty()) {
                    z = true;
                }
                this.f3042m.add(intent);
                if (!z) {
                    m3792h();
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4751a(C0848c cVar) {
        if (this.f3044o != null) {
            C0834i.m3720a().mo4727b(f3034p, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.f3044o = cVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4752a(Runnable runnable) {
        this.f3041l.post(runnable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4750a() {
        C0834i.m3720a().mo4726a(f3034p, "Checking if commands are complete.", new Throwable[0]);
        m3791g();
        synchronized (this.f3042m) {
            if (this.f3043n != null) {
                C0834i.m3720a().mo4726a(f3034p, String.format("Removing command %s", new Object[]{this.f3043n}), new Throwable[0]);
                if (this.f3042m.remove(0).equals(this.f3043n)) {
                    this.f3043n = null;
                } else {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
            }
            if (!this.f3040k.mo4744a() && this.f3042m.isEmpty()) {
                C0834i.m3720a().mo4726a(f3034p, "No more commands & intents.", new Throwable[0]);
                if (this.f3044o != null) {
                    this.f3044o.mo4742a();
                }
            } else if (!this.f3042m.isEmpty()) {
                m3792h();
            }
        }
    }

    /* renamed from: a */
    private boolean m3790a(String str) {
        m3791g();
        synchronized (this.f3042m) {
            for (Intent action : this.f3042m) {
                if (str.equals(action.getAction())) {
                    return true;
                }
            }
            return false;
        }
    }
}
