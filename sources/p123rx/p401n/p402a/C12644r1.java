package p123rx.p401n.p402a;

import p123rx.C12474i;
import p123rx.Single;
import p123rx.exceptions.C12472a;
import p123rx.p126m.C5379n;

/* renamed from: rx.n.a.r1 */
/* compiled from: SingleOperatorOnErrorResumeNext */
public final class C12644r1<T> implements Single.C5327j<T> {

    /* renamed from: f */
    private final Single<? extends T> f32653f;

    /* renamed from: g */
    final C5379n<Throwable, ? extends Single<? extends T>> f32654g;

    /* renamed from: rx.n.a.r1$a */
    /* compiled from: SingleOperatorOnErrorResumeNext */
    class C12645a extends C12474i<T> {

        /* renamed from: g */
        final /* synthetic */ C12474i f32655g;

        C12645a(C12474i iVar) {
            this.f32655g = iVar;
        }

        /* renamed from: a */
        public void mo18573a(T t) {
            this.f32655g.mo18573a(t);
        }

        public void onError(Throwable th) {
            try {
                ((Single) C12644r1.this.f32654g.call(th)).mo18560a(this.f32655g);
            } catch (Throwable th2) {
                C12472a.m40941a(th2, (C12474i<?>) this.f32655g);
            }
        }
    }

    private C12644r1(Single<? extends T> single, C5379n<Throwable, ? extends Single<? extends T>> nVar) {
        if (single == null) {
            throw new NullPointerException("originalSingle must not be null");
        } else if (nVar != null) {
            this.f32653f = single;
            this.f32654g = nVar;
        } else {
            throw new NullPointerException("resumeFunctionInCaseOfError must not be null");
        }
    }

    /* renamed from: a */
    public static <T> C12644r1<T> m41122a(Single<? extends T> single, C5379n<Throwable, ? extends Single<? extends T>> nVar) {
        return new C12644r1<>(single, nVar);
    }

    /* renamed from: a */
    public void call(C12474i<? super T> iVar) {
        C12645a aVar = new C12645a(iVar);
        iVar.mo40654b(aVar);
        this.f32653f.mo18560a(aVar);
    }
}
