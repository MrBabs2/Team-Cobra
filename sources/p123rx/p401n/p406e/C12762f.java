package p123rx.p401n.p406e;

import java.util.List;
import p123rx.C12465d;
import p123rx.C5368e;
import p123rx.exceptions.OnErrorNotImplementedException;
import p123rx.p126m.C12496o;
import p123rx.p126m.C5378b;
import p123rx.p126m.C5379n;
import p123rx.p401n.p402a.C12562h0;

/* renamed from: rx.n.e.f */
/* compiled from: InternalObservableUtils */
public enum C12762f {
    ;
    

    /* renamed from: f */
    static final C12764b f32951f = null;

    /* renamed from: g */
    public static final C5378b<Throwable> f32952g = null;

    /* renamed from: rx.n.e.f$a */
    /* compiled from: InternalObservableUtils */
    static final class C12763a implements C5378b<Throwable> {
        C12763a() {
        }

        /* renamed from: a */
        public void mo40883a(Throwable th) {
            throw new OnErrorNotImplementedException(th);
        }

        public /* bridge */ /* synthetic */ void call(Object obj) {
            mo40883a((Throwable) obj);
            throw null;
        }
    }

    /* renamed from: rx.n.e.f$b */
    /* compiled from: InternalObservableUtils */
    static final class C12764b implements C5379n<C12465d<?>, Throwable> {
        C12764b() {
        }

        /* renamed from: a */
        public Throwable call(C12465d<?> dVar) {
            return dVar.mo40633b();
        }
    }

    /* renamed from: rx.n.e.f$c */
    /* compiled from: InternalObservableUtils */
    static final class C12765c implements C12496o<Object, Object, Boolean> {
        C12765c() {
        }

        public Boolean call(Object obj, Object obj2) {
            return Boolean.valueOf(obj == obj2 || (obj != null && obj.equals(obj2)));
        }
    }

    /* renamed from: rx.n.e.f$d */
    /* compiled from: InternalObservableUtils */
    static final class C12766d implements C12496o<Integer, Object, Integer> {
        C12766d() {
        }

        /* renamed from: a */
        public Integer call(Integer num, Object obj) {
            return Integer.valueOf(num.intValue() + 1);
        }
    }

    /* renamed from: rx.n.e.f$e */
    /* compiled from: InternalObservableUtils */
    static final class C12767e implements C12496o<Long, Object, Long> {
        C12767e() {
        }

        /* renamed from: a */
        public Long call(Long l, Object obj) {
            return Long.valueOf(l.longValue() + 1);
        }
    }

    /* renamed from: rx.n.e.f$f */
    /* compiled from: InternalObservableUtils */
    static final class C12768f implements C5379n<C5368e<? extends C12465d<?>>, C5368e<?>> {

        /* renamed from: f */
        final C5379n<? super C5368e<? extends Throwable>, ? extends C5368e<?>> f32954f;

        public C12768f(C5379n<? super C5368e<? extends Throwable>, ? extends C5368e<?>> nVar) {
            this.f32954f = nVar;
        }

        /* renamed from: a */
        public C5368e<?> call(C5368e<? extends C12465d<?>> eVar) {
            return (C5368e) this.f32954f.call(eVar.mo18694j(C12762f.f32951f));
        }
    }

    /* renamed from: rx.n.e.f$g */
    /* compiled from: InternalObservableUtils */
    static final class C12769g implements C5379n<Object, Void> {
        C12769g() {
        }

        public Void call(Object obj) {
            return null;
        }
    }

    /* renamed from: rx.n.e.f$h */
    /* compiled from: InternalObservableUtils */
    static final class C12770h implements C5379n<List<? extends C5368e<?>>, C5368e<?>[]> {
        C12770h() {
        }

        /* renamed from: a */
        public C5368e<?>[] call(List<? extends C5368e<?>> list) {
            return (C5368e[]) list.toArray(new C5368e[list.size()]);
        }
    }

    static {
        new C12767e();
        new C12765c();
        new C12770h();
        new C12769g();
        new C12766d();
        f32951f = new C12764b();
        f32952g = new C12763a();
        new C12562h0(C12792m.m41298a(), true);
    }

    /* renamed from: a */
    public static C5379n<C5368e<? extends C12465d<?>>, C5368e<?>> m41257a(C5379n<? super C5368e<? extends Throwable>, ? extends C5368e<?>> nVar) {
        return new C12768f(nVar);
    }
}
