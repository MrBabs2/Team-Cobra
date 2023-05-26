package p120q.p326a;

import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.p329d0.p331b.C10872a;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p334e.p336b.C10948c;
import p120q.p326a.p329d0.p334e.p336b.C10950d;
import p120q.p326a.p329d0.p334e.p336b.C10954f;
import p120q.p326a.p329d0.p343h.C11422a;
import p120q.p326a.p348g0.C11459a;
import p415t.p416a.C12934a;
import p415t.p416a.C12935b;

/* renamed from: q.a.h */
/* compiled from: Flowable */
public abstract class C11460h<T> implements C12934a<T> {

    /* renamed from: f */
    static final int f30680f = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    /* renamed from: d */
    public static int m37538d() {
        return f30680f;
    }

    /* renamed from: a */
    public final C11460h<T> mo37216a() {
        return mo37217a(m37538d(), false, true);
    }

    /* renamed from: b */
    public final C11460h<T> mo37220b() {
        return C11459a.m37516a(new C10950d(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo36741b(C12935b<? super T> bVar);

    /* renamed from: c */
    public final C11460h<T> mo37221c() {
        return C11459a.m37516a(new C10954f(this));
    }

    /* renamed from: a */
    public final C11460h<T> mo37217a(int i, boolean z, boolean z2) {
        C10910b.m36858a(i, "capacity");
        return C11459a.m37516a(new C10948c(this, i, z2, z, C10872a.f28933c));
    }

    /* renamed from: a */
    public final void mo37219a(C12935b<? super T> bVar) {
        if (bVar instanceof C11471i) {
            mo37218a((C11471i) bVar);
            return;
        }
        C10910b.m36861a(bVar, "s is null");
        mo37218a(new C11422a(bVar));
    }

    /* renamed from: a */
    public final void mo37218a(C11471i<? super T> iVar) {
        C10910b.m36861a(iVar, "s is null");
        try {
            C12935b<? super Object> a = C11459a.m37526a(this, iVar);
            C10910b.m36861a(a, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo36741b(a);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C9034a.m29708a(th);
            C11459a.m37531b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
