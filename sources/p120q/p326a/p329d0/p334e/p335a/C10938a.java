package p120q.p326a.p329d0.p334e.p335a;

import java.util.concurrent.atomic.AtomicReference;
import p036io.reactivex.exceptions.C9034a;
import p120q.p326a.C10839b;
import p120q.p326a.C10846c;
import p120q.p326a.C10863d;
import p120q.p326a.C11447e;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p330a.C10867d;
import p120q.p326a.p348g0.C11459a;

/* renamed from: q.a.d0.e.a.a */
/* compiled from: CompletableCreate */
public final class C10938a extends C10839b {

    /* renamed from: f */
    final C11447e f29015f;

    /* renamed from: q.a.d0.e.a.a$a */
    /* compiled from: CompletableCreate */
    static final class C10939a extends AtomicReference<C10842c> implements C10846c, C10842c {

        /* renamed from: f */
        final C10863d f29016f;

        C10939a(C10863d dVar) {
            this.f29016f = dVar;
        }

        /* renamed from: a */
        public boolean mo36738a(Throwable th) {
            C10842c cVar;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            Object obj = get();
            C10867d dVar = C10867d.DISPOSED;
            if (obj == dVar || (cVar = (C10842c) getAndSet(dVar)) == C10867d.DISPOSED) {
                return false;
            }
            try {
                this.f29016f.onError(th);
            } finally {
                if (cVar != null) {
                    cVar.dispose();
                }
            }
        }

        public void dispose() {
            C10867d.m36773a((AtomicReference<C10842c>) this);
        }

        public boolean isDisposed() {
            return C10867d.m36775a((C10842c) get());
        }

        public void onComplete() {
            C10842c cVar;
            Object obj = get();
            C10867d dVar = C10867d.DISPOSED;
            if (obj != dVar && (cVar = (C10842c) getAndSet(dVar)) != C10867d.DISPOSED) {
                try {
                    this.f29016f.onComplete();
                } finally {
                    if (cVar != null) {
                        cVar.dispose();
                    }
                }
            }
        }

        public void onError(Throwable th) {
            if (!mo36738a(th)) {
                C11459a.m37531b(th);
            }
        }

        public String toString() {
            return String.format("%s{%s}", new Object[]{C10939a.class.getSimpleName(), super.toString()});
        }
    }

    public C10938a(C11447e eVar) {
        this.f29015f = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36620b(C10863d dVar) {
        C10939a aVar = new C10939a(dVar);
        dVar.onSubscribe(aVar);
        try {
            this.f29015f.mo8099a(aVar);
        } catch (Throwable th) {
            C9034a.m29708a(th);
            aVar.onError(th);
        }
    }
}
