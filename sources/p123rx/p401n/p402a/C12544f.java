package p123rx.p401n.p402a;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import p123rx.C12464c;
import p123rx.C5328b;
import p123rx.C5375k;
import p123rx.p128t.C5383b;

/* renamed from: rx.n.a.f */
/* compiled from: CompletableOnSubscribeMergeDelayErrorArray */
public final class C12544f implements C5328b.C5366w {

    /* renamed from: f */
    final C5328b[] f32349f;

    /* renamed from: rx.n.a.f$a */
    /* compiled from: CompletableOnSubscribeMergeDelayErrorArray */
    class C12545a implements C12464c {

        /* renamed from: f */
        final /* synthetic */ C5383b f32350f;

        /* renamed from: g */
        final /* synthetic */ Queue f32351g;

        /* renamed from: h */
        final /* synthetic */ AtomicInteger f32352h;

        /* renamed from: i */
        final /* synthetic */ C12464c f32353i;

        C12545a(C12544f fVar, C5383b bVar, Queue queue, AtomicInteger atomicInteger, C12464c cVar) {
            this.f32350f = bVar;
            this.f32351g = queue;
            this.f32352h = atomicInteger;
            this.f32353i = cVar;
        }

        /* renamed from: a */
        public void mo18613a(C5375k kVar) {
            this.f32350f.mo18721a(kVar);
        }

        public void onCompleted() {
            mo40696a();
        }

        public void onError(Throwable th) {
            this.f32351g.offer(th);
            mo40696a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo40696a() {
            if (this.f32352h.decrementAndGet() != 0) {
                return;
            }
            if (this.f32351g.isEmpty()) {
                this.f32353i.onCompleted();
            } else {
                this.f32353i.onError(C12536e.m40998a(this.f32351g));
            }
        }
    }

    public C12544f(C5328b[] bVarArr) {
        this.f32349f = bVarArr;
    }

    /* renamed from: a */
    public void call(C12464c cVar) {
        C5383b bVar = new C5383b();
        AtomicInteger atomicInteger = new AtomicInteger(this.f32349f.length + 1);
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        cVar.mo18613a(bVar);
        C5328b[] bVarArr = this.f32349f;
        int length = bVarArr.length;
        int i = 0;
        while (i < length) {
            C5328b bVar2 = bVarArr[i];
            if (!bVar.isUnsubscribed()) {
                if (bVar2 == null) {
                    concurrentLinkedQueue.offer(new NullPointerException("A completable source is null"));
                    atomicInteger.decrementAndGet();
                } else {
                    bVar2.mo18604b((C12464c) new C12545a(this, bVar, concurrentLinkedQueue, atomicInteger, cVar));
                }
                i++;
            } else {
                return;
            }
        }
        if (atomicInteger.decrementAndGet() != 0) {
            return;
        }
        if (concurrentLinkedQueue.isEmpty()) {
            cVar.onCompleted();
        } else {
            cVar.onError(C12536e.m40998a(concurrentLinkedQueue));
        }
    }
}
