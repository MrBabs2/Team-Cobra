package p123rx.p401n.p402a;

import java.util.Arrays;
import java.util.Collection;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5372f;
import p123rx.exceptions.C12472a;
import p123rx.exceptions.CompositeException;
import p123rx.p411q.C12844c;

/* renamed from: rx.n.a.n */
/* compiled from: OnSubscribeDoOnEach */
public class C12604n<T> implements C5368e.C5370a<T> {

    /* renamed from: f */
    private final C5372f<? super T> f32512f;

    /* renamed from: g */
    private final C5368e<T> f32513g;

    /* renamed from: rx.n.a.n$a */
    /* compiled from: OnSubscribeDoOnEach */
    private static final class C12605a<T> extends C12475j<T> {

        /* renamed from: f */
        private final C12475j<? super T> f32514f;

        /* renamed from: g */
        private final C5372f<? super T> f32515g;

        /* renamed from: h */
        private boolean f32516h;

        C12605a(C12475j<? super T> jVar, C5372f<? super T> fVar) {
            super(jVar);
            this.f32514f = jVar;
            this.f32515g = fVar;
        }

        public void onCompleted() {
            if (!this.f32516h) {
                try {
                    this.f32515g.onCompleted();
                    this.f32516h = true;
                    this.f32514f.onCompleted();
                } catch (Throwable th) {
                    C12472a.m40939a(th, (C5372f<?>) this);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f32516h) {
                C12844c.m41417b(th);
                return;
            }
            this.f32516h = true;
            try {
                this.f32515g.onError(th);
                this.f32514f.onError(th);
            } catch (Throwable th2) {
                C12472a.m40945c(th2);
                this.f32514f.onError(new CompositeException((Collection<? extends Throwable>) Arrays.asList(new Throwable[]{th, th2})));
            }
        }

        public void onNext(T t) {
            if (!this.f32516h) {
                try {
                    this.f32515g.onNext(t);
                    this.f32514f.onNext(t);
                } catch (Throwable th) {
                    C12472a.m40940a(th, (C5372f<?>) this, (Object) t);
                }
            }
        }
    }

    public C12604n(C5368e<T> eVar, C5372f<? super T> fVar) {
        this.f32513g = eVar;
        this.f32512f = fVar;
    }

    /* renamed from: a */
    public void call(C12475j<? super T> jVar) {
        this.f32513g.mo18668b(new C12605a(jVar, this.f32512f));
    }
}
