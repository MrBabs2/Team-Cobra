package p123rx.p401n.p402a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5372f;
import p123rx.exceptions.C12472a;
import p123rx.p126m.C12496o;
import p123rx.p401n.p403b.C12706b;

/* renamed from: rx.n.a.g1 */
/* compiled from: OperatorToObservableSortedList */
public final class C12554g1<T> implements C5368e.C5371b<List<T>, T> {

    /* renamed from: f */
    final Comparator<? super T> f32373f;

    /* renamed from: g */
    final int f32374g;

    /* renamed from: rx.n.a.g1$a */
    /* compiled from: OperatorToObservableSortedList */
    class C12555a implements Comparator<T> {

        /* renamed from: f */
        final /* synthetic */ C12496o f32375f;

        C12555a(C12554g1 g1Var, C12496o oVar) {
            this.f32375f = oVar;
        }

        public int compare(T t, T t2) {
            return ((Integer) this.f32375f.call(t, t2)).intValue();
        }
    }

    /* renamed from: rx.n.a.g1$b */
    /* compiled from: OperatorToObservableSortedList */
    class C12556b extends C12475j<T> {

        /* renamed from: f */
        List<T> f32376f = new ArrayList(C12554g1.this.f32374g);

        /* renamed from: g */
        boolean f32377g;

        /* renamed from: h */
        final /* synthetic */ C12706b f32378h;

        /* renamed from: i */
        final /* synthetic */ C12475j f32379i;

        C12556b(C12706b bVar, C12475j jVar) {
            this.f32378h = bVar;
            this.f32379i = jVar;
        }

        public void onCompleted() {
            if (!this.f32377g) {
                this.f32377g = true;
                List<T> list = this.f32376f;
                this.f32376f = null;
                try {
                    Collections.sort(list, C12554g1.this.f32373f);
                    this.f32378h.mo40846a(list);
                } catch (Throwable th) {
                    C12472a.m40939a(th, (C5372f<?>) this);
                }
            }
        }

        public void onError(Throwable th) {
            this.f32379i.onError(th);
        }

        public void onNext(T t) {
            if (!this.f32377g) {
                this.f32376f.add(t);
            }
        }

        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    /* renamed from: rx.n.a.g1$c */
    /* compiled from: OperatorToObservableSortedList */
    static final class C12557c implements Comparator<Object> {
        C12557c() {
        }

        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }

    static {
        new C12557c();
    }

    public C12554g1(C12496o<? super T, ? super T, Integer> oVar, int i) {
        this.f32374g = i;
        this.f32373f = new C12555a(this, oVar);
    }

    /* renamed from: a */
    public C12475j<? super T> call(C12475j<? super List<T>> jVar) {
        C12706b bVar = new C12706b(jVar);
        C12556b bVar2 = new C12556b(bVar, jVar);
        jVar.add(bVar2);
        jVar.setProducer(bVar);
        return bVar2;
    }
}
