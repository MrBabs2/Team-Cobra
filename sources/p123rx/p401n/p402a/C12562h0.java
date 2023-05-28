package p123rx.p401n.p402a;

import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5372f;
import p123rx.exceptions.C12472a;
import p123rx.p126m.C5379n;
import p123rx.p401n.p403b.C12706b;
import p123rx.p411q.C12844c;

/* renamed from: rx.n.a.h0 */
/* compiled from: OperatorAny */
public final class C12562h0<T> implements C5368e.C5371b<Boolean, T> {

    /* renamed from: f */
    final C5379n<? super T, Boolean> f32384f;

    /* renamed from: g */
    final boolean f32385g;

    /* renamed from: rx.n.a.h0$a */
    /* compiled from: OperatorAny */
    class C12563a extends C12475j<T> {

        /* renamed from: f */
        boolean f32386f;

        /* renamed from: g */
        boolean f32387g;

        /* renamed from: h */
        final /* synthetic */ C12706b f32388h;

        /* renamed from: i */
        final /* synthetic */ C12475j f32389i;

        C12563a(C12706b bVar, C12475j jVar) {
            this.f32388h = bVar;
            this.f32389i = jVar;
        }

        public void onCompleted() {
            if (!this.f32387g) {
                this.f32387g = true;
                if (this.f32386f) {
                    this.f32388h.mo40846a(false);
                } else {
                    this.f32388h.mo40846a(Boolean.valueOf(C12562h0.this.f32385g));
                }
            }
        }

        public void onError(Throwable th) {
            if (!this.f32387g) {
                this.f32387g = true;
                this.f32389i.onError(th);
                return;
            }
            C12844c.m41417b(th);
        }

        public void onNext(T t) {
            if (!this.f32387g) {
                this.f32386f = true;
                try {
                    if (C12562h0.this.f32384f.call(t).booleanValue()) {
                        this.f32387g = true;
                        this.f32388h.mo40846a(Boolean.valueOf(true ^ C12562h0.this.f32385g));
                        unsubscribe();
                    }
                } catch (Throwable th) {
                    C12472a.m40940a(th, (C5372f<?>) this, (Object) t);
                }
            }
        }
    }

    public C12562h0(C5379n<? super T, Boolean> nVar, boolean z) {
        this.f32384f = nVar;
        this.f32385g = z;
    }

    /* renamed from: a */
    public C12475j<? super T> call(C12475j<? super Boolean> jVar) {
        C12706b bVar = new C12706b(jVar);
        C12563a aVar = new C12563a(bVar, jVar);
        jVar.add(aVar);
        jVar.setProducer(bVar);
        return aVar;
    }
}
