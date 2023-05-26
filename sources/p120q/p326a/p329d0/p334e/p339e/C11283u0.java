package p120q.p326a.p329d0.p334e.p339e;

import p120q.p326a.C11488s;
import p120q.p326a.C11490u;
import p120q.p326a.p328c0.C10862p;
import p120q.p326a.p329d0.p333d.C10919a;

/* renamed from: q.a.d0.e.e.u0 */
/* compiled from: ObservableFilter */
public final class C11283u0<T> extends C10980a<T, T> {

    /* renamed from: g */
    final C10862p<? super T> f30180g;

    /* renamed from: q.a.d0.e.e.u0$a */
    /* compiled from: ObservableFilter */
    static final class C11284a<T> extends C10919a<T, T> {

        /* renamed from: k */
        final C10862p<? super T> f30181k;

        C11284a(C11490u<? super T> uVar, C10862p<? super T> pVar) {
            super(uVar);
            this.f30181k = pVar;
        }

        /* renamed from: a */
        public int mo36665a(int i) {
            return mo36705b(i);
        }

        public void onNext(T t) {
            if (this.f28976j == 0) {
                try {
                    if (this.f30181k.mo36663a(t)) {
                        this.f28972f.onNext(t);
                    }
                } catch (Throwable th) {
                    mo36704a(th);
                }
            } else {
                this.f28972f.onNext(null);
            }
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public T poll() throws java.lang.Exception {
            /*
                r2 = this;
            L_0x0000:
                q.a.d0.c.b<T> r0 = r2.f28974h
                java.lang.Object r0 = r0.poll()
                if (r0 == 0) goto L_0x0010
                q.a.c0.p<? super T> r1 = r2.f30181k
                boolean r1 = r1.mo36663a(r0)
                if (r1 == 0) goto L_0x0000
            L_0x0010:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p120q.p326a.p329d0.p334e.p339e.C11283u0.C11284a.poll():java.lang.Object");
        }
    }

    public C11283u0(C11488s<T> sVar, C10862p<? super T> pVar) {
        super(sVar);
        this.f30180g = pVar;
    }

    public void subscribeActual(C11490u<? super T> uVar) {
        this.f29150f.subscribe(new C11284a(uVar, this.f30180g));
    }
}
