package p123rx.p401n.p402a;

import java.util.concurrent.atomic.AtomicLong;
import p123rx.C12473g;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5372f;
import p123rx.C5375k;
import p123rx.exceptions.C12472a;
import p123rx.exceptions.MissingBackpressureException;
import p123rx.p126m.C12496o;
import p123rx.p126m.C12498q;
import p123rx.p126m.C12499r;
import p123rx.p128t.C5383b;
import p123rx.p401n.p406e.C12772h;

/* renamed from: rx.n.a.h1 */
/* compiled from: OperatorZip */
public final class C12564h1<R> implements C5368e.C5371b<R, C5368e<?>[]> {

    /* renamed from: f */
    final C12498q<? extends R> f32391f;

    /* renamed from: rx.n.a.h1$b */
    /* compiled from: OperatorZip */
    static final class C12567b<R> extends AtomicLong implements C12473g {

        /* renamed from: f */
        final C12565a<R> f32401f;

        public C12567b(C12565a<R> aVar) {
            this.f32401f = aVar;
        }

        public void request(long j) {
            C12502a.m40960a((AtomicLong) this, j);
            this.f32401f.mo40709a();
        }
    }

    /* renamed from: rx.n.a.h1$c */
    /* compiled from: OperatorZip */
    final class C12568c extends C12475j<C5368e[]> {

        /* renamed from: f */
        final C12475j<? super R> f32402f;

        /* renamed from: g */
        final C12565a<R> f32403g;

        /* renamed from: h */
        final C12567b<R> f32404h;

        /* renamed from: i */
        boolean f32405i;

        public C12568c(C12564h1 h1Var, C12475j<? super R> jVar, C12565a<R> aVar, C12567b<R> bVar) {
            this.f32402f = jVar;
            this.f32403g = aVar;
            this.f32404h = bVar;
        }

        /* renamed from: a */
        public void onNext(C5368e[] eVarArr) {
            if (eVarArr == null || eVarArr.length == 0) {
                this.f32402f.onCompleted();
                return;
            }
            this.f32405i = true;
            this.f32403g.mo40710a(eVarArr, this.f32404h);
        }

        public void onCompleted() {
            if (!this.f32405i) {
                this.f32402f.onCompleted();
            }
        }

        public void onError(Throwable th) {
            this.f32402f.onError(th);
        }
    }

    public C12564h1(C12496o oVar) {
        this.f32391f = C12499r.m40957a(oVar);
    }

    /* renamed from: a */
    public C12475j<? super C5368e[]> call(C12475j<? super R> jVar) {
        C12565a aVar = new C12565a(jVar, this.f32391f);
        C12567b bVar = new C12567b(aVar);
        C12568c cVar = new C12568c(this, jVar, aVar, bVar);
        jVar.add(cVar);
        jVar.setProducer(bVar);
        return cVar;
    }

    /* renamed from: rx.n.a.h1$a */
    /* compiled from: OperatorZip */
    static final class C12565a<R> extends AtomicLong {

        /* renamed from: l */
        static final int f32392l;

        /* renamed from: f */
        final C5372f<? super R> f32393f;

        /* renamed from: g */
        private final C12498q<? extends R> f32394g;

        /* renamed from: h */
        private final C5383b f32395h;

        /* renamed from: i */
        int f32396i;

        /* renamed from: j */
        private volatile Object[] f32397j;

        /* renamed from: k */
        private AtomicLong f32398k;

        /* renamed from: rx.n.a.h1$a$a */
        /* compiled from: OperatorZip */
        final class C12566a extends C12475j {

            /* renamed from: f */
            final C12772h f32399f = C12772h.m41267f();

            C12566a() {
            }

            /* renamed from: a */
            public void mo40711a(long j) {
                request(j);
            }

            public void onCompleted() {
                this.f32399f.mo40891b();
                C12565a.this.mo40709a();
            }

            public void onError(Throwable th) {
                C12565a.this.f32393f.onError(th);
            }

            public void onNext(Object obj) {
                try {
                    this.f32399f.mo40894c(obj);
                } catch (MissingBackpressureException e) {
                    onError(e);
                }
                C12565a.this.mo40709a();
            }

            public void onStart() {
                request((long) C12772h.f32957h);
            }
        }

        static {
            double d = (double) C12772h.f32957h;
            Double.isNaN(d);
            f32392l = (int) (d * 0.7d);
        }

        public C12565a(C12475j<? super R> jVar, C12498q<? extends R> qVar) {
            C5383b bVar = new C5383b();
            this.f32395h = bVar;
            this.f32393f = jVar;
            this.f32394g = qVar;
            jVar.add(bVar);
        }

        /* renamed from: a */
        public void mo40710a(C5368e[] eVarArr, AtomicLong atomicLong) {
            Object[] objArr = new Object[eVarArr.length];
            for (int i = 0; i < eVarArr.length; i++) {
                C12566a aVar = new C12566a();
                objArr[i] = aVar;
                this.f32395h.mo18721a((C5375k) aVar);
            }
            this.f32398k = atomicLong;
            this.f32397j = objArr;
            for (int i2 = 0; i2 < eVarArr.length; i2++) {
                eVarArr[i2].mo18668b((C12566a) objArr[i2]);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40709a() {
            Object[] objArr = this.f32397j;
            if (objArr != null && getAndIncrement() == 0) {
                int length = objArr.length;
                C5372f<? super R> fVar = this.f32393f;
                AtomicLong atomicLong = this.f32398k;
                while (true) {
                    Object[] objArr2 = new Object[length];
                    boolean z = true;
                    for (int i = 0; i < length; i++) {
                        C12772h hVar = ((C12566a) objArr[i]).f32399f;
                        Object c = hVar.mo40893c();
                        if (c == null) {
                            z = false;
                        } else if (hVar.mo40892b(c)) {
                            fVar.onCompleted();
                            this.f32395h.unsubscribe();
                            return;
                        } else {
                            objArr2[i] = hVar.mo40889a(c);
                        }
                    }
                    if (z && atomicLong.get() > 0) {
                        try {
                            fVar.onNext(this.f32394g.call(objArr2));
                            atomicLong.decrementAndGet();
                            this.f32396i++;
                            for (Object obj : objArr) {
                                C12772h hVar2 = ((C12566a) obj).f32399f;
                                hVar2.mo40895d();
                                if (hVar2.mo40892b(hVar2.mo40893c())) {
                                    fVar.onCompleted();
                                    this.f32395h.unsubscribe();
                                    return;
                                }
                            }
                            if (this.f32396i > f32392l) {
                                for (Object obj2 : objArr) {
                                    ((C12566a) obj2).mo40711a((long) this.f32396i);
                                }
                                this.f32396i = 0;
                            }
                        } catch (Throwable th) {
                            C12472a.m40940a(th, (C5372f<?>) fVar, (Object) objArr2);
                            return;
                        }
                    } else if (decrementAndGet() <= 0) {
                        return;
                    }
                }
            }
        }
    }
}
