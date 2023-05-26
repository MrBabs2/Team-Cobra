package androidx.fragment.app;

import androidx.lifecycle.C0514f;
import androidx.lifecycle.C0521j;
import androidx.lifecycle.C0522k;

/* renamed from: androidx.fragment.app.q */
/* compiled from: FragmentViewLifecycleOwner */
class C0502q implements C0521j {

    /* renamed from: f */
    private C0522k f2133f = null;

    C0502q() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2995a() {
        if (this.f2133f == null) {
            this.f2133f = new C0522k(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo2997b() {
        return this.f2133f != null;
    }

    public C0514f getLifecycle() {
        mo2995a();
        return this.f2133f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2996a(C0514f.C0515a aVar) {
        this.f2133f.mo3042a(aVar);
    }
}
