package p123rx.p127s;

import java.util.ArrayList;
import java.util.List;
import p123rx.C5368e;
import p123rx.exceptions.C12472a;
import p123rx.p126m.C5378b;
import p123rx.p127s.C12876e;
import p123rx.p401n.p402a.C12558h;

/* renamed from: rx.s.a */
/* compiled from: BehaviorSubject */
public final class C5380a<T> extends C5382d<T, T> {

    /* renamed from: h */
    private static final Object[] f9639h = new Object[0];

    /* renamed from: g */
    private final C12876e<T> f9640g;

    /* renamed from: rx.s.a$a */
    /* compiled from: BehaviorSubject */
    static class C5381a implements C5378b<C12876e.C12879c<T>> {

        /* renamed from: f */
        final /* synthetic */ C12876e f9641f;

        C5381a(C12876e eVar) {
            this.f9641f = eVar;
        }

        /* renamed from: a */
        public void call(C12876e.C12879c<T> cVar) {
            cVar.mo41099b(this.f9641f.mo41087a());
        }
    }

    protected C5380a(C5368e.C5370a<T> aVar, C12876e<T> eVar) {
        super(aVar);
        this.f9640g = eVar;
    }

    /* renamed from: a */
    private static <T> C5380a<T> m10347a(T t, boolean z) {
        C12876e eVar = new C12876e();
        if (z) {
            eVar.mo41092b(C12558h.m41020d(t));
        }
        C5381a aVar = new C5381a(eVar);
        eVar.f33108i = aVar;
        eVar.f33109j = aVar;
        return new C5380a<>(eVar, eVar);
    }

    /* renamed from: p */
    public static <T> C5380a<T> m10348p() {
        return m10347a((Object) null, false);
    }

    public void onCompleted() {
        if (this.f9640g.mo41087a() == null || this.f9640g.f33106g) {
            Object a = C12558h.m41014a();
            for (C12876e.C12879c c : this.f9640g.mo41094c(a)) {
                c.mo41100c(a);
            }
        }
    }

    public void onError(Throwable th) {
        if (this.f9640g.mo41087a() == null || this.f9640g.f33106g) {
            Object a = C12558h.m41015a(th);
            ArrayList arrayList = null;
            for (C12876e.C12879c c : this.f9640g.mo41094c(a)) {
                try {
                    c.mo41100c(a);
                } catch (Throwable th2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
            C12472a.m40943a((List<? extends Throwable>) arrayList);
        }
    }

    public void onNext(T t) {
        if (this.f9640g.mo41087a() == null || this.f9640g.f33106g) {
            Object d = C12558h.m41020d(t);
            for (C12876e.C12879c c : this.f9640g.mo41091a(d)) {
                c.mo41100c(d);
            }
        }
    }
}
