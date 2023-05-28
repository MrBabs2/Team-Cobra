package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.c */
final class C8402c implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ Task f23710f;

    /* renamed from: g */
    private final /* synthetic */ C8401b f23711g;

    C8402c(C8401b bVar, Task task) {
        this.f23711g = bVar;
        this.f23710f = task;
    }

    public final void run() {
        synchronized (this.f23711g.f23708b) {
            if (this.f23711g.f23709c != null) {
                this.f23711g.f23709c.mo6796a(this.f23710f);
            }
        }
    }
}
