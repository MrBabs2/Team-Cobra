package p123rx.p401n.p402a;

import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p123rx.C12474i;
import p123rx.C5375k;
import p123rx.Single;
import p123rx.exceptions.C12472a;
import p123rx.p126m.C12498q;
import p123rx.p128t.C5383b;
import p123rx.p411q.C12844c;

/* renamed from: rx.n.a.s1 */
/* compiled from: SingleOperatorZip */
public final class C12651s1 {

    /* renamed from: rx.n.a.s1$a */
    /* compiled from: SingleOperatorZip */
    static class C12652a implements Single.C5327j<R> {

        /* renamed from: f */
        final /* synthetic */ Single[] f32672f;

        /* renamed from: g */
        final /* synthetic */ C12498q f32673g;

        /* renamed from: rx.n.a.s1$a$a */
        /* compiled from: SingleOperatorZip */
        class C12653a extends C12474i<T> {

            /* renamed from: g */
            final /* synthetic */ Object[] f32674g;

            /* renamed from: h */
            final /* synthetic */ int f32675h;

            /* renamed from: i */
            final /* synthetic */ AtomicInteger f32676i;

            /* renamed from: j */
            final /* synthetic */ C12474i f32677j;

            /* renamed from: k */
            final /* synthetic */ AtomicBoolean f32678k;

            C12653a(Object[] objArr, int i, AtomicInteger atomicInteger, C12474i iVar, AtomicBoolean atomicBoolean) {
                this.f32674g = objArr;
                this.f32675h = i;
                this.f32676i = atomicInteger;
                this.f32677j = iVar;
                this.f32678k = atomicBoolean;
            }

            /* renamed from: a */
            public void mo18573a(T t) {
                this.f32674g[this.f32675h] = t;
                if (this.f32676i.decrementAndGet() == 0) {
                    try {
                        this.f32677j.mo18573a(C12652a.this.f32673g.call(this.f32674g));
                    } catch (Throwable th) {
                        C12472a.m40945c(th);
                        onError(th);
                    }
                }
            }

            public void onError(Throwable th) {
                if (this.f32678k.compareAndSet(false, true)) {
                    this.f32677j.onError(th);
                } else {
                    C12844c.m41417b(th);
                }
            }
        }

        C12652a(Single[] singleArr, C12498q qVar) {
            this.f32672f = singleArr;
            this.f32673g = qVar;
        }

        /* renamed from: a */
        public void call(C12474i<? super R> iVar) {
            if (this.f32672f.length == 0) {
                iVar.onError(new NoSuchElementException("Can't zip 0 Singles."));
                return;
            }
            AtomicInteger atomicInteger = new AtomicInteger(this.f32672f.length);
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            Object[] objArr = new Object[this.f32672f.length];
            C5383b bVar = new C5383b();
            iVar.mo40654b(bVar);
            int i = 0;
            while (i < this.f32672f.length && !bVar.isUnsubscribed() && !atomicBoolean.get()) {
                C12653a aVar = new C12653a(objArr, i, atomicInteger, iVar, atomicBoolean);
                bVar.mo18721a((C5375k) aVar);
                if (!bVar.isUnsubscribed() && !atomicBoolean.get()) {
                    this.f32672f[i].mo18560a(aVar);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static <T, R> Single<R> m41134a(Single<? extends T>[] singleArr, C12498q<? extends R> qVar) {
        return Single.m10122a(new C12652a(singleArr, qVar));
    }
}
