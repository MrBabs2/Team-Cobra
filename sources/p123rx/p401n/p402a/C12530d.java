package p123rx.p401n.p402a;

import java.util.concurrent.atomic.AtomicInteger;
import p123rx.C12464c;
import p123rx.C5328b;
import p123rx.C5375k;
import p123rx.p401n.p405d.C12754a;

/* renamed from: rx.n.a.d */
/* compiled from: CompletableOnSubscribeConcatArray */
public final class C12530d implements C5328b.C5366w {

    /* renamed from: f */
    final C5328b[] f32313f;

    /* renamed from: rx.n.a.d$a */
    /* compiled from: CompletableOnSubscribeConcatArray */
    static final class C12531a extends AtomicInteger implements C12464c {

        /* renamed from: f */
        final C12464c f32314f;

        /* renamed from: g */
        final C5328b[] f32315g;

        /* renamed from: h */
        int f32316h;

        /* renamed from: i */
        final C12754a f32317i = new C12754a();

        public C12531a(C12464c cVar, C5328b[] bVarArr) {
            this.f32314f = cVar;
            this.f32315g = bVarArr;
        }

        /* renamed from: a */
        public void mo18613a(C5375k kVar) {
            this.f32317i.mo40878a(kVar);
        }

        public void onCompleted() {
            mo40686a();
        }

        public void onError(Throwable th) {
            this.f32314f.onError(th);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40686a() {
            if (!this.f32317i.isUnsubscribed() && getAndIncrement() == 0) {
                C5328b[] bVarArr = this.f32315g;
                while (!this.f32317i.isUnsubscribed()) {
                    int i = this.f32316h;
                    this.f32316h = i + 1;
                    if (i == bVarArr.length) {
                        this.f32314f.onCompleted();
                        return;
                    }
                    bVarArr[i].mo18604b((C12464c) this);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
    }

    public C12530d(C5328b[] bVarArr) {
        this.f32313f = bVarArr;
    }

    /* renamed from: a */
    public void call(C12464c cVar) {
        C12531a aVar = new C12531a(cVar, this.f32313f);
        cVar.mo18613a(aVar.f32317i);
        aVar.mo40686a();
    }
}
