package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.C0514f;

/* renamed from: androidx.lifecycle.u */
/* compiled from: ServiceLifecycleDispatcher */
public class C0540u {

    /* renamed from: a */
    private final C0522k f2199a;

    /* renamed from: b */
    private final Handler f2200b = new Handler();

    /* renamed from: c */
    private C0541a f2201c;

    /* renamed from: androidx.lifecycle.u$a */
    /* compiled from: ServiceLifecycleDispatcher */
    static class C0541a implements Runnable {

        /* renamed from: f */
        private final C0522k f2202f;

        /* renamed from: g */
        final C0514f.C0515a f2203g;

        /* renamed from: h */
        private boolean f2204h = false;

        C0541a(C0522k kVar, C0514f.C0515a aVar) {
            this.f2202f = kVar;
            this.f2203g = aVar;
        }

        public void run() {
            if (!this.f2204h) {
                this.f2202f.mo3042a(this.f2203g);
                this.f2204h = true;
            }
        }
    }

    public C0540u(C0521j jVar) {
        this.f2199a = new C0522k(jVar);
    }

    /* renamed from: a */
    private void m2624a(C0514f.C0515a aVar) {
        C0541a aVar2 = this.f2201c;
        if (aVar2 != null) {
            aVar2.run();
        }
        C0541a aVar3 = new C0541a(this.f2199a, aVar);
        this.f2201c = aVar3;
        this.f2200b.postAtFrontOfQueue(aVar3);
    }

    /* renamed from: b */
    public void mo3088b() {
        m2624a(C0514f.C0515a.ON_START);
    }

    /* renamed from: c */
    public void mo3089c() {
        m2624a(C0514f.C0515a.ON_CREATE);
    }

    /* renamed from: d */
    public void mo3090d() {
        m2624a(C0514f.C0515a.ON_STOP);
        m2624a(C0514f.C0515a.ON_DESTROY);
    }

    /* renamed from: e */
    public void mo3091e() {
        m2624a(C0514f.C0515a.ON_START);
    }

    /* renamed from: a */
    public C0514f mo3087a() {
        return this.f2199a;
    }
}
