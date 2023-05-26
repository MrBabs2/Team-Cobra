package p123rx.p401n.p402a;

import java.util.concurrent.TimeUnit;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5372f;
import p123rx.C5373h;
import p123rx.exceptions.C12472a;
import p123rx.p126m.C5377a;

/* renamed from: rx.n.a.f0 */
/* compiled from: OnSubscribeTimerOnce */
public final class C12546f0 implements C5368e.C5370a<Long> {

    /* renamed from: f */
    final long f32354f;

    /* renamed from: g */
    final TimeUnit f32355g;

    /* renamed from: h */
    final C5373h f32356h;

    /* renamed from: rx.n.a.f0$a */
    /* compiled from: OnSubscribeTimerOnce */
    class C12547a implements C5377a {

        /* renamed from: f */
        final /* synthetic */ C12475j f32357f;

        C12547a(C12546f0 f0Var, C12475j jVar) {
            this.f32357f = jVar;
        }

        public void call() {
            try {
                this.f32357f.onNext(0L);
                this.f32357f.onCompleted();
            } catch (Throwable th) {
                C12472a.m40939a(th, (C5372f<?>) this.f32357f);
            }
        }
    }

    public C12546f0(long j, TimeUnit timeUnit, C5373h hVar) {
        this.f32354f = j;
        this.f32355g = timeUnit;
        this.f32356h = hVar;
    }

    /* renamed from: a */
    public void call(C12475j<? super Long> jVar) {
        C5373h.C5374a createWorker = this.f32356h.createWorker();
        jVar.add(createWorker);
        createWorker.mo18712a(new C12547a(this, jVar), this.f32354f, this.f32355g);
    }
}
