package p123rx.p401n.p402a;

import java.util.NoSuchElementException;
import p123rx.C12474i;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.Single;

/* renamed from: rx.n.a.a0 */
/* compiled from: OnSubscribeSingle */
public class C12503a0<T> implements Single.C5327j<T> {

    /* renamed from: f */
    private final C5368e<T> f32248f;

    /* renamed from: rx.n.a.a0$a */
    /* compiled from: OnSubscribeSingle */
    class C12504a extends C12475j<T> {

        /* renamed from: f */
        private boolean f32249f;

        /* renamed from: g */
        private boolean f32250g;

        /* renamed from: h */
        private T f32251h;

        /* renamed from: i */
        final /* synthetic */ C12474i f32252i;

        C12504a(C12503a0 a0Var, C12474i iVar) {
            this.f32252i = iVar;
        }

        public void onCompleted() {
            if (!this.f32249f) {
                if (this.f32250g) {
                    this.f32252i.mo18573a(this.f32251h);
                } else {
                    this.f32252i.onError(new NoSuchElementException("Observable emitted no items"));
                }
            }
        }

        public void onError(Throwable th) {
            this.f32252i.onError(th);
            unsubscribe();
        }

        public void onNext(T t) {
            if (this.f32250g) {
                this.f32249f = true;
                this.f32252i.onError(new IllegalArgumentException("Observable emitted too many elements"));
                unsubscribe();
                return;
            }
            this.f32250g = true;
            this.f32251h = t;
        }

        public void onStart() {
            request(2);
        }
    }

    public C12503a0(C5368e<T> eVar) {
        this.f32248f = eVar;
    }

    /* renamed from: a */
    public void call(C12474i<? super T> iVar) {
        C12504a aVar = new C12504a(this, iVar);
        iVar.mo40654b(aVar);
        this.f32248f.mo18668b(aVar);
    }

    /* renamed from: a */
    public static <T> C12503a0<T> m40963a(C5368e<T> eVar) {
        return new C12503a0<>(eVar);
    }
}
