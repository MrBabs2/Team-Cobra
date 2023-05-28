package p120q.p326a.p329d0.p330a;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p036io.reactivex.exceptions.C9034a;
import p036io.reactivex.exceptions.CompositeException;
import p120q.p326a.p327b0.C10842c;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p345j.C11435j;

/* renamed from: q.a.d0.a.f */
/* compiled from: ListCompositeDisposable */
public final class C10869f implements C10842c, C10866c {

    /* renamed from: f */
    List<C10842c> f28929f;

    /* renamed from: g */
    volatile boolean f28930g;

    /* renamed from: a */
    public boolean mo36645a(C10842c cVar) {
        if (!mo36647c(cVar)) {
            return false;
        }
        cVar.dispose();
        return true;
    }

    /* renamed from: b */
    public boolean mo36646b(C10842c cVar) {
        C10910b.m36861a(cVar, "d is null");
        if (!this.f28930g) {
            synchronized (this) {
                if (!this.f28930g) {
                    List list = this.f28929f;
                    if (list == null) {
                        list = new LinkedList();
                        this.f28929f = list;
                    }
                    list.add(cVar);
                    return true;
                }
            }
        }
        cVar.dispose();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo36647c(p120q.p326a.p327b0.C10842c r3) {
        /*
            r2 = this;
            java.lang.String r0 = "Disposable item is null"
            p120q.p326a.p329d0.p331b.C10910b.m36861a(r3, (java.lang.String) r0)
            boolean r0 = r2.f28930g
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r2)
            boolean r0 = r2.f28930g     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0012:
            java.util.List<q.a.b0.c> r0 = r2.f28929f     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            boolean r3 = r0.remove(r3)     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x001d
            goto L_0x0020
        L_0x001d:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            r3 = 1
            return r3
        L_0x0020:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0022:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p120q.p326a.p329d0.p330a.C10869f.mo36647c(q.a.b0.c):boolean");
    }

    public void dispose() {
        if (!this.f28930g) {
            synchronized (this) {
                if (!this.f28930g) {
                    this.f28930g = true;
                    List<C10842c> list = this.f28929f;
                    this.f28929f = null;
                    mo36670a(list);
                }
            }
        }
    }

    public boolean isDisposed() {
        return this.f28930g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36670a(List<C10842c> list) {
        if (list != null) {
            ArrayList arrayList = null;
            for (C10842c dispose : list) {
                try {
                    dispose.dispose();
                } catch (Throwable th) {
                    C9034a.m29708a(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
            if (arrayList == null) {
                return;
            }
            if (arrayList.size() == 1) {
                throw C11435j.m37463a((Throwable) arrayList.get(0));
            }
            throw new CompositeException((Iterable<? extends Throwable>) arrayList);
        }
    }
}
