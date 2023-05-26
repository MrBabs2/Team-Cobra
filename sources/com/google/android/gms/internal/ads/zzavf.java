package com.google.android.gms.internal.ads;

import android.content.Context;

@zzard
public final class zzavf implements zzue {

    /* renamed from: f */
    private final Context f18553f;

    /* renamed from: g */
    private final Object f18554g;

    /* renamed from: h */
    private String f18555h;

    /* renamed from: i */
    private boolean f18556i;

    public zzavf(Context context, String str) {
        this.f18553f = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f18555h = str;
        this.f18556i = false;
        this.f18554g = new Object();
    }

    /* renamed from: a */
    public final void mo25659a(zzud zzud) {
        mo27684f(zzud.f22775j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27684f(boolean r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzavg r0 = com.google.android.gms.ads.internal.zzk.zzme()
            android.content.Context r1 = r3.f18553f
            boolean r0 = r0.mo27700f(r1)
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.Object r0 = r3.f18554g
            monitor-enter(r0)
            boolean r1 = r3.f18556i     // Catch:{ all -> 0x003f }
            if (r1 != r4) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x0016:
            r3.f18556i = r4     // Catch:{ all -> 0x003f }
            java.lang.String r4 = r3.f18555h     // Catch:{ all -> 0x003f }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x0022
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x0022:
            boolean r4 = r3.f18556i     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x0032
            com.google.android.gms.internal.ads.zzavg r4 = com.google.android.gms.ads.internal.zzk.zzme()     // Catch:{ all -> 0x003f }
            android.content.Context r1 = r3.f18553f     // Catch:{ all -> 0x003f }
            java.lang.String r2 = r3.f18555h     // Catch:{ all -> 0x003f }
            r4.mo27688a((android.content.Context) r1, (java.lang.String) r2)     // Catch:{ all -> 0x003f }
            goto L_0x003d
        L_0x0032:
            com.google.android.gms.internal.ads.zzavg r4 = com.google.android.gms.ads.internal.zzk.zzme()     // Catch:{ all -> 0x003f }
            android.content.Context r1 = r3.f18553f     // Catch:{ all -> 0x003f }
            java.lang.String r2 = r3.f18555h     // Catch:{ all -> 0x003f }
            r4.mo27692b(r1, r2)     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzavf.mo27684f(boolean):void");
    }

    /* renamed from: j */
    public final String mo27685j() {
        return this.f18555h;
    }
}
