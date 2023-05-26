package p123rx.p410p;

import java.util.Arrays;
import java.util.Collection;
import p123rx.C12475j;
import p123rx.C5372f;
import p123rx.exceptions.C12472a;
import p123rx.exceptions.CompositeException;
import p123rx.exceptions.OnErrorFailedException;
import p123rx.exceptions.OnErrorNotImplementedException;
import p123rx.exceptions.UnsubscribeFailedException;
import p123rx.p411q.C12844c;
import p123rx.p411q.C12863f;

/* renamed from: rx.p.c */
/* compiled from: SafeSubscriber */
public class C12835c<T> extends C12475j<T> {

    /* renamed from: f */
    private final C12475j<? super T> f33053f;

    /* renamed from: g */
    boolean f33054g;

    public C12835c(C12475j<? super T> jVar) {
        super(jVar);
        this.f33053f = jVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo41039b(Throwable th) {
        C12863f.m41441f().mo41069b().mo41046a(th);
        try {
            this.f33053f.onError(th);
            try {
                unsubscribe();
            } catch (Throwable th2) {
                C12844c.m41417b(th2);
                throw new OnErrorFailedException(th2);
            }
        } catch (OnErrorNotImplementedException e) {
            unsubscribe();
            throw e;
        } catch (Throwable th3) {
            C12844c.m41417b(th3);
            throw new OnErrorNotImplementedException("Observer.onError not implemented and error while unsubscribing.", new CompositeException((Collection<? extends Throwable>) Arrays.asList(new Throwable[]{th, th3})));
        }
    }

    public void onCompleted() {
        if (!this.f33054g) {
            this.f33054g = true;
            try {
                this.f33053f.onCompleted();
                try {
                    unsubscribe();
                } catch (Throwable th) {
                    C12844c.m41417b(th);
                    throw new UnsubscribeFailedException(th.getMessage(), th);
                }
            } catch (Throwable th2) {
                try {
                    unsubscribe();
                    throw th2;
                } catch (Throwable th3) {
                    C12844c.m41417b(th3);
                    throw new UnsubscribeFailedException(th3.getMessage(), th3);
                }
            }
        }
    }

    public void onError(Throwable th) {
        C12472a.m40945c(th);
        if (!this.f33054g) {
            this.f33054g = true;
            mo41039b(th);
        }
    }

    public void onNext(T t) {
        try {
            if (!this.f33054g) {
                this.f33053f.onNext(t);
            }
        } catch (Throwable th) {
            C12472a.m40939a(th, (C5372f<?>) this);
        }
    }
}
