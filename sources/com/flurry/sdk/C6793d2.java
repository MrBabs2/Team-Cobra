package com.flurry.sdk;

import java.util.Timer;
import java.util.concurrent.Executor;

/* renamed from: com.flurry.sdk.d2 */
public final class C6793d2 extends C6917l3 {

    /* renamed from: l */
    Executor f12663l;

    static {
        new Timer("ExecutorQueue Global Timer", true);
    }

    public C6793d2(Executor executor, String str) {
        super(str);
        this.f12663l = executor;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0018, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo23562a(com.flurry.sdk.C6833g4.C6835b r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r2.mo23597a()     // Catch:{ Exception -> 0x0016, all -> 0x0013 }
            if (r0 == 0) goto L_0x000b
            r2.run()     // Catch:{ Exception -> 0x0016, all -> 0x0013 }
            goto L_0x0010
        L_0x000b:
            java.util.concurrent.Executor r0 = r1.f12663l     // Catch:{ Exception -> 0x0016, all -> 0x0013 }
            r0.execute(r2)     // Catch:{ Exception -> 0x0016, all -> 0x0013 }
        L_0x0010:
            r2 = 1
            monitor-exit(r1)
            return r2
        L_0x0013:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x0016:
            r2 = 0
            monitor-exit(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C6793d2.mo23562a(com.flurry.sdk.g4$b):boolean");
    }
}
