package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.C0732d;
import androidx.room.C0735e;
import androidx.room.C0739g;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.room.h */
/* compiled from: MultiInstanceInvalidationClient */
class C0744h {

    /* renamed from: a */
    final Context f2769a;

    /* renamed from: b */
    final String f2770b;

    /* renamed from: c */
    int f2771c;

    /* renamed from: d */
    final C0739g f2772d;

    /* renamed from: e */
    final C0739g.C0742c f2773e;

    /* renamed from: f */
    C0735e f2774f;

    /* renamed from: g */
    final Executor f2775g;

    /* renamed from: h */
    final C0732d f2776h = new C0745a();

    /* renamed from: i */
    final AtomicBoolean f2777i = new AtomicBoolean(false);

    /* renamed from: j */
    final ServiceConnection f2778j = new C0747b();

    /* renamed from: k */
    final Runnable f2779k = new C0748c();

    /* renamed from: l */
    final Runnable f2780l = new C0749d();

    /* renamed from: m */
    private final Runnable f2781m = new C0750e();

    /* renamed from: androidx.room.h$a */
    /* compiled from: MultiInstanceInvalidationClient */
    class C0745a extends C0732d.C0733a {

        /* renamed from: androidx.room.h$a$a */
        /* compiled from: MultiInstanceInvalidationClient */
        class C0746a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ String[] f2783f;

            C0746a(String[] strArr) {
                this.f2783f = strArr;
            }

            public void run() {
                C0744h.this.f2772d.mo4353a(this.f2783f);
            }
        }

        C0745a() {
        }

        /* renamed from: a */
        public void mo4343a(String[] strArr) {
            C0744h.this.f2775g.execute(new C0746a(strArr));
        }
    }

    /* renamed from: androidx.room.h$b */
    /* compiled from: MultiInstanceInvalidationClient */
    class C0747b implements ServiceConnection {
        C0747b() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C0744h.this.f2774f = C0735e.C0736a.m3450a(iBinder);
            C0744h hVar = C0744h.this;
            hVar.f2775g.execute(hVar.f2779k);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C0744h hVar = C0744h.this;
            hVar.f2775g.execute(hVar.f2780l);
            C0744h.this.f2774f = null;
        }
    }

    /* renamed from: androidx.room.h$c */
    /* compiled from: MultiInstanceInvalidationClient */
    class C0748c implements Runnable {
        C0748c() {
        }

        public void run() {
            try {
                C0735e eVar = C0744h.this.f2774f;
                if (eVar != null) {
                    C0744h.this.f2771c = eVar.mo4323a(C0744h.this.f2776h, C0744h.this.f2770b);
                    C0744h.this.f2772d.mo4351a(C0744h.this.f2773e);
                }
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
            }
        }
    }

    /* renamed from: androidx.room.h$d */
    /* compiled from: MultiInstanceInvalidationClient */
    class C0749d implements Runnable {
        C0749d() {
        }

        public void run() {
            C0744h hVar = C0744h.this;
            hVar.f2772d.mo4356b(hVar.f2773e);
        }
    }

    /* renamed from: androidx.room.h$e */
    /* compiled from: MultiInstanceInvalidationClient */
    class C0750e implements Runnable {
        C0750e() {
        }

        public void run() {
            C0744h hVar = C0744h.this;
            hVar.f2772d.mo4356b(hVar.f2773e);
            try {
                C0735e eVar = C0744h.this.f2774f;
                if (eVar != null) {
                    eVar.mo4324a(C0744h.this.f2776h, C0744h.this.f2771c);
                }
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e);
            }
            C0744h hVar2 = C0744h.this;
            hVar2.f2769a.unbindService(hVar2.f2778j);
        }
    }

    /* renamed from: androidx.room.h$f */
    /* compiled from: MultiInstanceInvalidationClient */
    class C0751f extends C0739g.C0742c {
        C0751f(String[] strArr) {
            super(strArr);
        }

        /* renamed from: a */
        public void mo4365a(Set<String> set) {
            if (!C0744h.this.f2777i.get()) {
                try {
                    C0735e eVar = C0744h.this.f2774f;
                    if (eVar != null) {
                        eVar.mo4325b(C0744h.this.f2771c, (String[]) set.toArray(new String[0]));
                    }
                } catch (RemoteException e) {
                    Log.w("ROOM", "Cannot broadcast invalidation", e);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4366a() {
            return true;
        }
    }

    C0744h(Context context, String str, C0739g gVar, Executor executor) {
        this.f2769a = context.getApplicationContext();
        this.f2770b = str;
        this.f2772d = gVar;
        this.f2775g = executor;
        this.f2773e = new C0751f(gVar.f2748b);
        this.f2769a.bindService(new Intent(this.f2769a, MultiInstanceInvalidationService.class), this.f2778j, 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4369a() {
        if (this.f2777i.compareAndSet(false, true)) {
            this.f2775g.execute(this.f2781m);
        }
    }
}
