package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.p */
abstract class C7196p implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ zaak f13820f;

    private C7196p(zaak zaak) {
        this.f13820f = zaak;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo25106a();

    public void run() {
        this.f13820f.f13870b.lock();
        try {
            if (!Thread.interrupted()) {
                mo25106a();
                this.f13820f.f13870b.unlock();
            }
        } catch (RuntimeException e) {
            this.f13820f.f13869a.mo25169a(e);
        } finally {
            this.f13820f.f13870b.unlock();
        }
    }

    /* synthetic */ C7196p(zaak zaak, C7178g gVar) {
        this(zaak);
    }
}
