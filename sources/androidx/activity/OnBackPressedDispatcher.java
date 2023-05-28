package androidx.activity;

import androidx.lifecycle.C0514f;
import androidx.lifecycle.C0519h;
import androidx.lifecycle.C0521j;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {

    /* renamed from: a */
    private final Runnable f93a;

    /* renamed from: b */
    final ArrayDeque<C0054b> f94b = new ArrayDeque<>();

    private class LifecycleOnBackPressedCancellable implements C0519h, C0053a {

        /* renamed from: a */
        private final C0514f f95a;

        /* renamed from: b */
        private final C0054b f96b;

        /* renamed from: c */
        private C0053a f97c;

        LifecycleOnBackPressedCancellable(C0514f fVar, C0054b bVar) {
            this.f95a = fVar;
            this.f96b = bVar;
            fVar.mo3039a(this);
        }

        /* renamed from: a */
        public void mo136a(C0521j jVar, C0514f.C0515a aVar) {
            if (aVar == C0514f.C0515a.ON_START) {
                this.f97c = OnBackPressedDispatcher.this.mo138a(this.f96b);
            } else if (aVar == C0514f.C0515a.ON_STOP) {
                C0053a aVar2 = this.f97c;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (aVar == C0514f.C0515a.ON_DESTROY) {
                cancel();
            }
        }

        public void cancel() {
            this.f95a.mo3040b(this);
            this.f96b.mo145b(this);
            C0053a aVar = this.f97c;
            if (aVar != null) {
                aVar.cancel();
                this.f97c = null;
            }
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    private class C0052a implements C0053a {

        /* renamed from: a */
        private final C0054b f99a;

        C0052a(C0054b bVar) {
            this.f99a = bVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.f94b.remove(this.f99a);
            this.f99a.mo145b(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f93a = runnable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0053a mo138a(C0054b bVar) {
        this.f94b.add(bVar);
        C0052a aVar = new C0052a(bVar);
        bVar.mo143a((C0053a) aVar);
        return aVar;
    }

    /* renamed from: a */
    public void mo140a(C0521j jVar, C0054b bVar) {
        C0514f lifecycle = jVar.getLifecycle();
        if (lifecycle.mo3038a() != C0514f.C0516b.DESTROYED) {
            bVar.mo143a((C0053a) new LifecycleOnBackPressedCancellable(lifecycle, bVar));
        }
    }

    /* renamed from: a */
    public void mo139a() {
        Iterator<C0054b> descendingIterator = this.f94b.descendingIterator();
        while (descendingIterator.hasNext()) {
            C0054b next = descendingIterator.next();
            if (next.mo146b()) {
                next.mo142a();
                return;
            }
        }
        Runnable runnable = this.f93a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
