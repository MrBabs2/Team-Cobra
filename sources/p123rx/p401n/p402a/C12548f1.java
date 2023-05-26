package p123rx.p401n.p402a;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5372f;
import p123rx.exceptions.C12472a;
import p123rx.p401n.p403b.C12706b;

/* renamed from: rx.n.a.f1 */
/* compiled from: OperatorToObservableList */
public final class C12548f1<T> implements C5368e.C5371b<List<T>, T> {

    /* renamed from: rx.n.a.f1$a */
    /* compiled from: OperatorToObservableList */
    class C12549a extends C12475j<T> {

        /* renamed from: f */
        boolean f32358f;

        /* renamed from: g */
        List<T> f32359g = new LinkedList();

        /* renamed from: h */
        final /* synthetic */ C12706b f32360h;

        /* renamed from: i */
        final /* synthetic */ C12475j f32361i;

        C12549a(C12548f1 f1Var, C12706b bVar, C12475j jVar) {
            this.f32360h = bVar;
            this.f32361i = jVar;
        }

        public void onCompleted() {
            if (!this.f32358f) {
                this.f32358f = true;
                try {
                    ArrayList arrayList = new ArrayList(this.f32359g);
                    this.f32359g = null;
                    this.f32360h.mo40846a(arrayList);
                } catch (Throwable th) {
                    C12472a.m40939a(th, (C5372f<?>) this);
                }
            }
        }

        public void onError(Throwable th) {
            this.f32361i.onError(th);
        }

        public void onNext(T t) {
            if (!this.f32358f) {
                this.f32359g.add(t);
            }
        }

        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    /* renamed from: rx.n.a.f1$b */
    /* compiled from: OperatorToObservableList */
    static final class C12550b {

        /* renamed from: a */
        static final C12548f1<Object> f32362a = new C12548f1<>();
    }

    C12548f1() {
    }

    /* renamed from: a */
    public static <T> C12548f1<T> m41008a() {
        return C12550b.f32362a;
    }

    /* renamed from: a */
    public C12475j<? super T> call(C12475j<? super List<T>> jVar) {
        C12706b bVar = new C12706b(jVar);
        C12549a aVar = new C12549a(this, bVar, jVar);
        jVar.add(aVar);
        jVar.setProducer(bVar);
        return aVar;
    }
}
