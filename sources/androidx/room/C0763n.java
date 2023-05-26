package androidx.room;

import androidx.room.C0739g;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p120q.p326a.C11478j;
import p120q.p326a.C11480l;
import p120q.p326a.C11482n;
import p120q.p326a.C11485p;
import p120q.p326a.C11486q;
import p120q.p326a.C11491v;
import p120q.p326a.C11496w;
import p120q.p326a.C11497x;
import p120q.p326a.C11499z;
import p120q.p326a.p327b0.C10843d;
import p120q.p326a.p328c0.C10847a;
import p120q.p326a.p328c0.C10861o;
import p120q.p326a.p349h0.C11461a;

/* renamed from: androidx.room.n */
/* compiled from: RxRoom */
public class C0763n {

    /* renamed from: a */
    public static final Object f2827a = new Object();

    /* renamed from: androidx.room.n$a */
    /* compiled from: RxRoom */
    static class C0764a implements C11486q<Object> {

        /* renamed from: a */
        final /* synthetic */ String[] f2828a;

        /* renamed from: b */
        final /* synthetic */ C0753j f2829b;

        /* renamed from: androidx.room.n$a$a */
        /* compiled from: RxRoom */
        class C0765a extends C0739g.C0742c {

            /* renamed from: b */
            final /* synthetic */ C11485p f2830b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0765a(C0764a aVar, String[] strArr, C11485p pVar) {
                super(strArr);
                this.f2830b = pVar;
            }

            /* renamed from: a */
            public void mo4365a(Set<String> set) {
                this.f2830b.onNext(C0763n.f2827a);
            }
        }

        /* renamed from: androidx.room.n$a$b */
        /* compiled from: RxRoom */
        class C0766b implements C10847a {

            /* renamed from: f */
            final /* synthetic */ C0739g.C0742c f2831f;

            C0766b(C0739g.C0742c cVar) {
                this.f2831f = cVar;
            }

            public void run() throws Exception {
                C0764a.this.f2829b.getInvalidationTracker().mo4356b(this.f2831f);
            }
        }

        C0764a(String[] strArr, C0753j jVar) {
            this.f2828a = strArr;
            this.f2829b = jVar;
        }

        /* renamed from: a */
        public void mo4438a(C11485p<Object> pVar) throws Exception {
            C0765a aVar = new C0765a(this, this.f2828a, pVar);
            this.f2829b.getInvalidationTracker().mo4351a((C0739g.C0742c) aVar);
            pVar.mo36790a(C10843d.m36750a((C10847a) new C0766b(aVar)));
            pVar.onNext(C0763n.f2827a);
        }
    }

    /* renamed from: androidx.room.n$b */
    /* compiled from: RxRoom */
    static class C0767b implements C10861o<Object, C11480l<T>> {

        /* renamed from: f */
        final /* synthetic */ C11478j f2833f;

        C0767b(C11478j jVar) {
            this.f2833f = jVar;
        }

        public C11480l<T> apply(Object obj) throws Exception {
            return this.f2833f;
        }
    }

    /* renamed from: androidx.room.n$c */
    /* compiled from: RxRoom */
    static class C0768c implements C11499z<T> {

        /* renamed from: a */
        final /* synthetic */ Callable f2834a;

        C0768c(Callable callable) {
            this.f2834a = callable;
        }

        /* renamed from: a */
        public void mo4441a(C11497x<T> xVar) throws Exception {
            try {
                xVar.onSuccess(this.f2834a.call());
            } catch (EmptyResultSetException e) {
                xVar.mo37082a((Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public static C11482n<Object> m3519a(C0753j jVar, String... strArr) {
        return C11482n.create(new C0764a(strArr, jVar));
    }

    /* renamed from: a */
    public static <T> C11482n<T> m3518a(C0753j jVar, boolean z, String[] strArr, Callable<T> callable) {
        C11491v a = C11461a.m37547a(m3517a(jVar, z));
        return m3519a(jVar, strArr).subscribeOn(a).unsubscribeOn(a).observeOn(a).flatMapMaybe(new C0767b(C11478j.m37573a(callable)));
    }

    /* renamed from: a */
    public static <T> C11496w<T> m3520a(Callable<T> callable) {
        return C11496w.m37608a(new C0768c(callable));
    }

    /* renamed from: a */
    private static Executor m3517a(C0753j jVar, boolean z) {
        if (z) {
            return jVar.getTransactionExecutor();
        }
        return jVar.getQueryExecutor();
    }
}
