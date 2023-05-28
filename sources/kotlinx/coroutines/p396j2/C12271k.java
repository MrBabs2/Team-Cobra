package kotlinx.coroutines.p396j2;

import kotlinx.coroutines.C12256j0;

/* renamed from: kotlinx.coroutines.j2.k */
/* compiled from: Tasks.kt */
public final class C12271k extends C12269i {

    /* renamed from: h */
    public final Runnable f32079h;

    public C12271k(Runnable runnable, long j, C12270j jVar) {
        super(j, jVar);
        this.f32079h = runnable;
    }

    public void run() {
        try {
            this.f32079h.run();
        } finally {
            this.f32078g.mo38964a();
        }
    }

    public String toString() {
        return "Task[" + C12256j0.m40409a((Object) this.f32079h) + '@' + C12256j0.m40411b(this.f32079h) + ", " + this.f32077f + ", " + this.f32078g + ']';
    }
}
