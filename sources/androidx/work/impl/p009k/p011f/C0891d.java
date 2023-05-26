package androidx.work.impl.p009k.p011f;

import android.content.Context;
import androidx.work.C0834i;
import androidx.work.impl.p009k.C0874a;
import androidx.work.impl.utils.p014k.C0956a;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: androidx.work.impl.k.f.d */
/* compiled from: ConstraintTracker */
public abstract class C0891d<T> {

    /* renamed from: f */
    private static final String f3170f = C0834i.m3721a("ConstraintTracker");

    /* renamed from: a */
    protected final C0956a f3171a;

    /* renamed from: b */
    protected final Context f3172b;

    /* renamed from: c */
    private final Object f3173c = new Object();

    /* renamed from: d */
    private final Set<C0874a<T>> f3174d = new LinkedHashSet();

    /* renamed from: e */
    T f3175e;

    /* renamed from: androidx.work.impl.k.f.d$a */
    /* compiled from: ConstraintTracker */
    class C0892a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ List f3176f;

        C0892a(List list) {
            this.f3176f = list;
        }

        public void run() {
            for (C0874a a : this.f3176f) {
                a.mo4822a(C0891d.this.f3175e);
            }
        }
    }

    C0891d(Context context, C0956a aVar) {
        this.f3172b = context.getApplicationContext();
        this.f3171a = aVar;
    }

    /* renamed from: a */
    public abstract T mo4848a();

    /* renamed from: a */
    public void mo4854a(C0874a<T> aVar) {
        synchronized (this.f3173c) {
            if (this.f3174d.add(aVar)) {
                if (this.f3174d.size() == 1) {
                    this.f3175e = mo4848a();
                    C0834i.m3720a().mo4726a(f3170f, String.format("%s: initial state = %s", new Object[]{getClass().getSimpleName(), this.f3175e}), new Throwable[0]);
                    mo4851b();
                }
                aVar.mo4822a(this.f3175e);
            }
        }
    }

    /* renamed from: b */
    public abstract void mo4851b();

    /* renamed from: b */
    public void mo4856b(C0874a<T> aVar) {
        synchronized (this.f3173c) {
            if (this.f3174d.remove(aVar) && this.f3174d.isEmpty()) {
                mo4852c();
            }
        }
    }

    /* renamed from: c */
    public abstract void mo4852c();

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4855a(T r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f3173c
            monitor-enter(r0)
            T r1 = r3.f3175e     // Catch:{ all -> 0x002f }
            if (r1 == r4) goto L_0x002d
            T r1 = r3.f3175e     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x0014
            T r1 = r3.f3175e     // Catch:{ all -> 0x002f }
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x0014
            goto L_0x002d
        L_0x0014:
            r3.f3175e = r4     // Catch:{ all -> 0x002f }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x002f }
            java.util.Set<androidx.work.impl.k.a<T>> r1 = r3.f3174d     // Catch:{ all -> 0x002f }
            r4.<init>(r1)     // Catch:{ all -> 0x002f }
            androidx.work.impl.utils.k.a r1 = r3.f3171a     // Catch:{ all -> 0x002f }
            java.util.concurrent.Executor r1 = r1.mo4960a()     // Catch:{ all -> 0x002f }
            androidx.work.impl.k.f.d$a r2 = new androidx.work.impl.k.f.d$a     // Catch:{ all -> 0x002f }
            r2.<init>(r4)     // Catch:{ all -> 0x002f }
            r1.execute(r2)     // Catch:{ all -> 0x002f }
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x002d:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x002f:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p009k.p011f.C0891d.mo4855a(java.lang.Object):void");
    }
}
