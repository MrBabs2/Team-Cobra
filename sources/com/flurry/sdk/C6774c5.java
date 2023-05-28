package com.flurry.sdk;

import com.flurry.sdk.C6833g4;
import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;

/* renamed from: com.flurry.sdk.c5 */
public class C6774c5 extends C6833g4 {

    /* renamed from: j */
    private final Deque<C6833g4.C6835b> f12612j = new LinkedList();

    /* renamed from: k */
    private C6833g4.C6835b f12613k;

    /* renamed from: com.flurry.sdk.c5$a */
    class C6775a extends C6833g4.C6835b {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6775a(C6774c5 c5Var, C6774c5 c5Var2, C6833g4 g4Var, Runnable runnable) {
            super(c5Var2, g4Var, runnable);
            c5Var2.getClass();
        }

        /* access modifiers changed from: protected */
        public final void done() {
            this.f12789f.mo23561a(this);
        }
    }

    C6774c5(String str, C6833g4 g4Var, boolean z) {
        super(str, g4Var, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo23562a(C6833g4.C6835b bVar) {
        C6833g4 g4Var = this.f12786f;
        if (g4Var == null) {
            return true;
        }
        g4Var.mo23563c(bVar);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Future<Void> mo23563c(Runnable runnable) {
        C6833g4.C6835b bVar;
        if (runnable instanceof C6833g4.C6835b) {
            bVar = (C6833g4.C6835b) runnable;
        } else {
            bVar = new C6775a(this, this, this, runnable);
        }
        synchronized (this) {
            this.f12612j.add(bVar);
            mo23570a();
        }
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo23564d(Runnable runnable) throws CancellationException {
        C6833g4.C6835b bVar = new C6833g4.C6835b(this, this, C6833g4.f12785i);
        synchronized (this) {
            this.f12612j.add(bVar);
            mo23570a();
        }
        if (this.f12788h) {
            for (C6833g4 g4Var = this.f12786f; g4Var != null; g4Var = g4Var.f12786f) {
                g4Var.mo23594b(bVar);
            }
        }
        while (!bVar.isDone()) {
            try {
                bVar.get();
            } catch (CancellationException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
        if (!mo23565f(runnable)) {
            mo23595e(runnable);
        }
        mo23561a((Runnable) bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo23565f(Runnable runnable) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23561a(Runnable runnable) {
        synchronized (this) {
            if (this.f12613k == runnable) {
                this.f12613k = null;
            }
        }
        mo23570a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void mo23570a() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f12787g     // Catch:{ all -> 0x0058 }
            r1 = 0
            if (r0 == 0) goto L_0x002d
        L_0x0006:
            java.util.Deque<com.flurry.sdk.g4$b> r0 = r3.f12612j     // Catch:{ all -> 0x0058 }
            int r0 = r0.size()     // Catch:{ all -> 0x0058 }
            if (r0 <= 0) goto L_0x0056
            java.util.Deque<com.flurry.sdk.g4$b> r0 = r3.f12612j     // Catch:{ all -> 0x0058 }
            java.lang.Object r0 = r0.remove()     // Catch:{ all -> 0x0058 }
            com.flurry.sdk.g4$b r0 = (com.flurry.sdk.C6833g4.C6835b) r0     // Catch:{ all -> 0x0058 }
            boolean r2 = r0.isDone()     // Catch:{ all -> 0x0058 }
            if (r2 != 0) goto L_0x0006
            r3.f12613k = r0     // Catch:{ all -> 0x0058 }
            boolean r2 = r3.mo23562a((com.flurry.sdk.C6833g4.C6835b) r0)     // Catch:{ all -> 0x0058 }
            if (r2 != 0) goto L_0x0006
            r3.f12613k = r1     // Catch:{ all -> 0x0058 }
            java.util.Deque<com.flurry.sdk.g4$b> r1 = r3.f12612j     // Catch:{ all -> 0x0058 }
            r1.addFirst(r0)     // Catch:{ all -> 0x0058 }
            monitor-exit(r3)
            return
        L_0x002d:
            com.flurry.sdk.g4$b r0 = r3.f12613k     // Catch:{ all -> 0x0058 }
            if (r0 != 0) goto L_0x0056
            java.util.Deque<com.flurry.sdk.g4$b> r0 = r3.f12612j     // Catch:{ all -> 0x0058 }
            int r0 = r0.size()     // Catch:{ all -> 0x0058 }
            if (r0 <= 0) goto L_0x0056
            java.util.Deque<com.flurry.sdk.g4$b> r0 = r3.f12612j     // Catch:{ all -> 0x0058 }
            java.lang.Object r0 = r0.remove()     // Catch:{ all -> 0x0058 }
            com.flurry.sdk.g4$b r0 = (com.flurry.sdk.C6833g4.C6835b) r0     // Catch:{ all -> 0x0058 }
            boolean r2 = r0.isDone()     // Catch:{ all -> 0x0058 }
            if (r2 != 0) goto L_0x0056
            r3.f12613k = r0     // Catch:{ all -> 0x0058 }
            boolean r2 = r3.mo23562a((com.flurry.sdk.C6833g4.C6835b) r0)     // Catch:{ all -> 0x0058 }
            if (r2 != 0) goto L_0x0056
            r3.f12613k = r1     // Catch:{ all -> 0x0058 }
            java.util.Deque<com.flurry.sdk.g4$b> r1 = r3.f12612j     // Catch:{ all -> 0x0058 }
            r1.addFirst(r0)     // Catch:{ all -> 0x0058 }
        L_0x0056:
            monitor-exit(r3)
            return
        L_0x0058:
            r0 = move-exception
            monitor-exit(r3)
            goto L_0x005c
        L_0x005b:
            throw r0
        L_0x005c:
            goto L_0x005b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C6774c5.mo23570a():void");
    }
}
