package p123rx.p128t;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p123rx.C5375k;
import p123rx.exceptions.C12472a;

/* renamed from: rx.t.b */
/* compiled from: CompositeSubscription */
public final class C5383b implements C5375k {

    /* renamed from: f */
    private Set<C5375k> f9646f;

    /* renamed from: g */
    private volatile boolean f9647g;

    /* renamed from: a */
    public void mo18721a(C5375k kVar) {
        if (!kVar.isUnsubscribed()) {
            if (!this.f9647g) {
                synchronized (this) {
                    if (!this.f9647g) {
                        if (this.f9646f == null) {
                            this.f9646f = new HashSet(4);
                        }
                        this.f9646f.add(kVar);
                        return;
                    }
                }
            }
            kVar.unsubscribe();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        r2.unsubscribe();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18722b(p123rx.C5375k r2) {
        /*
            r1 = this;
            boolean r0 = r1.f9647g
            if (r0 != 0) goto L_0x0020
            monitor-enter(r1)
            boolean r0 = r1.f9647g     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x001b
            java.util.Set<rx.k> r0 = r1.f9646f     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x000e
            goto L_0x001b
        L_0x000e:
            java.util.Set<rx.k> r0 = r1.f9646f     // Catch:{ all -> 0x001d }
            boolean r0 = r0.remove(r2)     // Catch:{ all -> 0x001d }
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x0020
            r2.unsubscribe()
            goto L_0x0020
        L_0x001b:
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            return
        L_0x001d:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            throw r2
        L_0x0020:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p123rx.p128t.C5383b.mo18722b(rx.k):void");
    }

    public boolean isUnsubscribed() {
        return this.f9647g;
    }

    public void unsubscribe() {
        if (!this.f9647g) {
            synchronized (this) {
                if (!this.f9647g) {
                    this.f9647g = true;
                    Set<C5375k> set = this.f9646f;
                    this.f9646f = null;
                    m10355a((Collection<C5375k>) set);
                }
            }
        }
    }

    /* renamed from: b */
    public boolean mo18723b() {
        boolean z = false;
        if (this.f9647g) {
            return false;
        }
        synchronized (this) {
            if (!this.f9647g && this.f9646f != null && !this.f9646f.isEmpty()) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public void mo18720a() {
        if (!this.f9647g) {
            synchronized (this) {
                if (!this.f9647g) {
                    if (this.f9646f != null) {
                        Set<C5375k> set = this.f9646f;
                        this.f9646f = null;
                        m10355a((Collection<C5375k>) set);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m10355a(Collection<C5375k> collection) {
        if (collection != null) {
            ArrayList arrayList = null;
            for (C5375k unsubscribe : collection) {
                try {
                    unsubscribe.unsubscribe();
                } catch (Throwable th) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
            C12472a.m40943a((List<? extends Throwable>) arrayList);
        }
    }
}
