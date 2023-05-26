package p123rx.p401n.p402a;

import java.util.concurrent.atomic.AtomicLong;
import p123rx.C12473g;
import p123rx.C12475j;
import p123rx.C5368e;

/* renamed from: rx.n.a.s */
/* compiled from: OnSubscribeFromArray */
public final class C12646s<T> implements C5368e.C5370a<T> {

    /* renamed from: f */
    final T[] f32657f;

    public C12646s(T[] tArr) {
        this.f32657f = tArr;
    }

    /* renamed from: a */
    public void call(C12475j<? super T> jVar) {
        jVar.setProducer(new C12647a(jVar, this.f32657f));
    }

    /* renamed from: rx.n.a.s$a */
    /* compiled from: OnSubscribeFromArray */
    static final class C12647a<T> extends AtomicLong implements C12473g {

        /* renamed from: f */
        final C12475j<? super T> f32658f;

        /* renamed from: g */
        final T[] f32659g;

        /* renamed from: h */
        int f32660h;

        public C12647a(C12475j<? super T> jVar, T[] tArr) {
            this.f32658f = jVar;
            this.f32659g = tArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40797a() {
            C12475j<? super T> jVar = this.f32658f;
            T[] tArr = this.f32659g;
            int length = tArr.length;
            int i = 0;
            while (i < length) {
                T t = tArr[i];
                if (!jVar.isUnsubscribed()) {
                    jVar.onNext(t);
                    i++;
                } else {
                    return;
                }
            }
            if (!jVar.isUnsubscribed()) {
                jVar.onCompleted();
            }
        }

        public void request(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            } else if (j == Long.MAX_VALUE) {
                if (C12502a.m40960a((AtomicLong) this, j) == 0) {
                    mo40797a();
                }
            } else if (j != 0 && C12502a.m40960a((AtomicLong) this, j) == 0) {
                mo40798a(j);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40798a(long j) {
            C12475j<? super T> jVar = this.f32658f;
            T[] tArr = this.f32659g;
            int length = tArr.length;
            int i = this.f32660h;
            do {
                long j2 = 0;
                while (true) {
                    if (r11 == 0 || i == length) {
                        r11 = get() + j2;
                        if (r11 == 0) {
                            this.f32660h = i;
                            j = addAndGet(j2);
                        }
                    } else if (!jVar.isUnsubscribed()) {
                        jVar.onNext(tArr[i]);
                        i++;
                        if (i != length) {
                            r11--;
                            j2--;
                        } else if (!jVar.isUnsubscribed()) {
                            jVar.onCompleted();
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } while (j != 0);
        }
    }
}
