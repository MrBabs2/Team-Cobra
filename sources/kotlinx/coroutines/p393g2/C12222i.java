package kotlinx.coroutines.p393g2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: kotlinx.coroutines.g2.i */
/* compiled from: LockFreeTaskQueue.kt */
public class C12222i<E> {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f31991a = AtomicReferenceFieldUpdater.newUpdater(C12222i.class, Object.class, "_cur");
    private volatile Object _cur;

    public C12222i(boolean z) {
        this._cur = new C12223j(8, z);
    }

    /* renamed from: a */
    public final void mo38883a() {
        while (true) {
            C12223j jVar = (C12223j) this._cur;
            if (!jVar.mo38888a()) {
                f31991a.compareAndSet(this, jVar, jVar.mo38891d());
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final int mo38885b() {
        return ((C12223j) this._cur).mo38889b();
    }

    /* renamed from: c */
    public final E mo38886c() {
        while (true) {
            C12223j jVar = (C12223j) this._cur;
            E e = jVar.mo38892e();
            if (e != C12223j.f31994g) {
                return e;
            }
            f31991a.compareAndSet(this, jVar, jVar.mo38891d());
        }
    }

    /* renamed from: a */
    public final boolean mo38884a(E e) {
        while (true) {
            C12223j jVar = (C12223j) this._cur;
            int a = jVar.mo38887a(e);
            if (a == 0) {
                return true;
            }
            if (a == 1) {
                f31991a.compareAndSet(this, jVar, jVar.mo38891d());
            } else if (a == 2) {
                return false;
            }
        }
    }
}
