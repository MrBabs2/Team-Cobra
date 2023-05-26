package p123rx.p401n.p402a;

import java.util.concurrent.TimeUnit;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5372f;
import p123rx.C5373h;
import p123rx.exceptions.C12472a;
import p123rx.p126m.C5377a;

/* renamed from: rx.n.a.g0 */
/* compiled from: OnSubscribeTimerPeriodically */
public final class C12552g0 implements C5368e.C5370a<Long> {

    /* renamed from: f */
    final long f32366f;

    /* renamed from: g */
    final long f32367g;

    /* renamed from: h */
    final TimeUnit f32368h;

    /* renamed from: i */
    final C5373h f32369i;

    /* renamed from: rx.n.a.g0$a */
    /* compiled from: OnSubscribeTimerPeriodically */
    class C12553a implements C5377a {

        /* renamed from: f */
        long f32370f;

        /* renamed from: g */
        final /* synthetic */ C12475j f32371g;

        /* renamed from: h */
        final /* synthetic */ C5373h.C5374a f32372h;

        C12553a(C12552g0 g0Var, C12475j jVar, C5373h.C5374a aVar) {
            this.f32371g = jVar;
            this.f32372h = aVar;
        }

        public void call() {
            try {
                C12475j jVar = this.f32371g;
                long j = this.f32370f;
                this.f32370f = 1 + j;
                jVar.onNext(Long.valueOf(j));
            } catch (Throwable th) {
                C12472a.m40939a(th, (C5372f<?>) this.f32371g);
                throw th;
            }
        }
    }

    public C12552g0(long j, long j2, TimeUnit timeUnit, C5373h hVar) {
        this.f32366f = j;
        this.f32367g = j2;
        this.f32368h = timeUnit;
        this.f32369i = hVar;
    }

    /* renamed from: a */
    public void call(C12475j<? super Long> jVar) {
        C5373h.C5374a createWorker = this.f32369i.createWorker();
        jVar.add(createWorker);
        createWorker.mo18711a(new C12553a(this, jVar, createWorker), this.f32366f, this.f32367g, this.f32368h);
    }
}
