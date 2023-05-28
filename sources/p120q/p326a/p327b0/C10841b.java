package p120q.p326a.p327b0;

import java.util.ArrayList;
import p036io.reactivex.exceptions.C9034a;
import p036io.reactivex.exceptions.CompositeException;
import p120q.p326a.p329d0.p330a.C10866c;
import p120q.p326a.p329d0.p331b.C10910b;
import p120q.p326a.p329d0.p345j.C11435j;
import p120q.p326a.p329d0.p345j.C11443o;

/* renamed from: q.a.b0.b */
/* compiled from: CompositeDisposable */
public final class C10841b implements C10842c, C10866c {

    /* renamed from: f */
    C11443o<C10842c> f28922f;

    /* renamed from: g */
    volatile boolean f28923g;

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
        C10910b.m36861a(cVar, "disposable is null");
        if (!this.f28923g) {
            synchronized (this) {
                if (!this.f28923g) {
                    C11443o<C10842c> oVar = this.f28922f;
                    if (oVar == null) {
                        oVar = new C11443o<>();
                        this.f28922f = oVar;
                    }
                    oVar.mo37179a(cVar);
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
            java.lang.String r0 = "disposables is null"
            p120q.p326a.p329d0.p331b.C10910b.m36861a(r3, (java.lang.String) r0)
            boolean r0 = r2.f28923g
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r2)
            boolean r0 = r2.f28923g     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0012:
            q.a.d0.j.o<q.a.b0.c> r0 = r2.f28922f     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            boolean r3 = r0.mo37182b(r3)     // Catch:{ all -> 0x0022 }
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
        throw new UnsupportedOperationException("Method not decompiled: p120q.p326a.p327b0.C10841b.mo36647c(q.a.b0.c):boolean");
    }

    public void dispose() {
        if (!this.f28923g) {
            synchronized (this) {
                if (!this.f28923g) {
                    this.f28923g = true;
                    C11443o<C10842c> oVar = this.f28922f;
                    this.f28922f = null;
                    mo36644a(oVar);
                }
            }
        }
    }

    public boolean isDisposed() {
        return this.f28923g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0016, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo36643a() {
        /*
            r2 = this;
            boolean r0 = r2.f28923g
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            monitor-enter(r2)
            boolean r0 = r2.f28923g     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            return r1
        L_0x000d:
            q.a.d0.j.o<q.a.b0.c> r0 = r2.f28922f     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0015
            int r1 = r0.mo37183c()     // Catch:{ all -> 0x0017 }
        L_0x0015:
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            return r1
        L_0x0017:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p120q.p326a.p327b0.C10841b.mo36643a():int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36644a(C11443o<C10842c> oVar) {
        if (oVar != null) {
            ArrayList arrayList = null;
            for (Object obj : oVar.mo37180a()) {
                if (obj instanceof C10842c) {
                    try {
                        ((C10842c) obj).dispose();
                    } catch (Throwable th) {
                        C9034a.m29708a(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
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
