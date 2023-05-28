package p123rx.p401n.p402a;

import java.util.NoSuchElementException;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.p401n.p403b.C12707c;
import p123rx.p411q.C12844c;

/* renamed from: rx.n.a.w0 */
/* compiled from: OperatorSingle */
public final class C12676w0<T> implements C5368e.C5371b<T, T> {

    /* renamed from: f */
    private final boolean f32732f;

    /* renamed from: g */
    private final T f32733g;

    /* renamed from: rx.n.a.w0$a */
    /* compiled from: OperatorSingle */
    static final class C12677a {

        /* renamed from: a */
        static final C12676w0<?> f32734a = new C12676w0<>();
    }

    /* renamed from: rx.n.a.w0$b */
    /* compiled from: OperatorSingle */
    static final class C12678b<T> extends C12475j<T> {

        /* renamed from: f */
        private final C12475j<? super T> f32735f;

        /* renamed from: g */
        private final boolean f32736g;

        /* renamed from: h */
        private final T f32737h;

        /* renamed from: i */
        private T f32738i;

        /* renamed from: j */
        private boolean f32739j;

        /* renamed from: k */
        private boolean f32740k;

        C12678b(C12475j<? super T> jVar, boolean z, T t) {
            this.f32735f = jVar;
            this.f32736g = z;
            this.f32737h = t;
            request(2);
        }

        public void onCompleted() {
            if (this.f32740k) {
                return;
            }
            if (this.f32739j) {
                this.f32735f.setProducer(new C12707c(this.f32735f, this.f32738i));
            } else if (this.f32736g) {
                this.f32735f.setProducer(new C12707c(this.f32735f, this.f32737h));
            } else {
                this.f32735f.onError(new NoSuchElementException("Sequence contains no elements"));
            }
        }

        public void onError(Throwable th) {
            if (this.f32740k) {
                C12844c.m41417b(th);
            } else {
                this.f32735f.onError(th);
            }
        }

        public void onNext(T t) {
            if (this.f32740k) {
                return;
            }
            if (this.f32739j) {
                this.f32740k = true;
                this.f32735f.onError(new IllegalArgumentException("Sequence contains too many elements"));
                unsubscribe();
                return;
            }
            this.f32738i = t;
            this.f32739j = true;
        }
    }

    C12676w0() {
        this(false, (Object) null);
    }

    /* renamed from: a */
    public static <T> C12676w0<T> m41163a() {
        return C12677a.f32734a;
    }

    private C12676w0(boolean z, T t) {
        this.f32732f = z;
        this.f32733g = t;
    }

    /* renamed from: a */
    public C12475j<? super T> call(C12475j<? super T> jVar) {
        C12678b bVar = new C12678b(jVar, this.f32732f, this.f32733g);
        jVar.add(bVar);
        return bVar;
    }
}
