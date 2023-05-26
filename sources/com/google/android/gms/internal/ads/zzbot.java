package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;
import p050l.p066e.C4868a;

public final class zzbot implements zzbrw, zzbsr {

    /* renamed from: f */
    private final Context f19306f;

    /* renamed from: g */
    private final zzbgz f19307g;

    /* renamed from: h */
    private final zzcxm f19308h;

    /* renamed from: i */
    private final zzbai f19309i;

    /* renamed from: j */
    private IObjectWrapper f19310j;

    /* renamed from: k */
    private boolean f19311k;

    public zzbot(Context context, zzbgz zzbgz, zzcxm zzcxm, zzbai zzbai) {
        this.f19306f = context;
        this.f19307g = zzbgz;
        this.f19308h = zzcxm;
        this.f19309i = zzbai;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m21440a() {
        /*
            r10 = this;
            monitor-enter(r10)
            com.google.android.gms.internal.ads.zzcxm r0 = r10.f19308h     // Catch:{ all -> 0x008b }
            boolean r0 = r0.f21111J     // Catch:{ all -> 0x008b }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r10)
            return
        L_0x0009:
            com.google.android.gms.internal.ads.zzbgz r0 = r10.f19307g     // Catch:{ all -> 0x008b }
            if (r0 != 0) goto L_0x000f
            monitor-exit(r10)
            return
        L_0x000f:
            com.google.android.gms.internal.ads.zzaqd r0 = com.google.android.gms.ads.internal.zzk.zzlv()     // Catch:{ all -> 0x008b }
            android.content.Context r1 = r10.f19306f     // Catch:{ all -> 0x008b }
            boolean r0 = r0.mo27566b((android.content.Context) r1)     // Catch:{ all -> 0x008b }
            if (r0 != 0) goto L_0x001d
            monitor-exit(r10)
            return
        L_0x001d:
            com.google.android.gms.internal.ads.zzbai r0 = r10.f19309i     // Catch:{ all -> 0x008b }
            int r0 = r0.f18743g     // Catch:{ all -> 0x008b }
            com.google.android.gms.internal.ads.zzbai r1 = r10.f19309i     // Catch:{ all -> 0x008b }
            int r1 = r1.f18744h     // Catch:{ all -> 0x008b }
            r2 = 23
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x008b }
            r3.<init>(r2)     // Catch:{ all -> 0x008b }
            r3.append(r0)     // Catch:{ all -> 0x008b }
            java.lang.String r0 = "."
            r3.append(r0)     // Catch:{ all -> 0x008b }
            r3.append(r1)     // Catch:{ all -> 0x008b }
            java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x008b }
            com.google.android.gms.internal.ads.zzcxm r0 = r10.f19308h     // Catch:{ all -> 0x008b }
            org.json.JSONObject r0 = r0.f21113L     // Catch:{ all -> 0x008b }
            java.lang.String r1 = "media_type"
            r2 = -1
            int r0 = r0.optInt(r1, r2)     // Catch:{ all -> 0x008b }
            if (r0 != 0) goto L_0x004a
            r0 = 0
            goto L_0x004c
        L_0x004a:
            java.lang.String r0 = "javascript"
        L_0x004c:
            r9 = r0
            com.google.android.gms.internal.ads.zzaqd r4 = com.google.android.gms.ads.internal.zzk.zzlv()     // Catch:{ all -> 0x008b }
            com.google.android.gms.internal.ads.zzbgz r0 = r10.f19307g     // Catch:{ all -> 0x008b }
            android.webkit.WebView r6 = r0.getWebView()     // Catch:{ all -> 0x008b }
            java.lang.String r7 = ""
            java.lang.String r8 = "javascript"
            com.google.android.gms.dynamic.IObjectWrapper r0 = r4.mo27560a(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x008b }
            r10.f19310j = r0     // Catch:{ all -> 0x008b }
            com.google.android.gms.internal.ads.zzbgz r0 = r10.f19307g     // Catch:{ all -> 0x008b }
            android.view.View r0 = r0.getView()     // Catch:{ all -> 0x008b }
            com.google.android.gms.dynamic.IObjectWrapper r1 = r10.f19310j     // Catch:{ all -> 0x008b }
            if (r1 == 0) goto L_0x0089
            if (r0 == 0) goto L_0x0089
            com.google.android.gms.internal.ads.zzaqd r1 = com.google.android.gms.ads.internal.zzk.zzlv()     // Catch:{ all -> 0x008b }
            com.google.android.gms.dynamic.IObjectWrapper r2 = r10.f19310j     // Catch:{ all -> 0x008b }
            r1.mo27564a(r2, r0)     // Catch:{ all -> 0x008b }
            com.google.android.gms.internal.ads.zzbgz r0 = r10.f19307g     // Catch:{ all -> 0x008b }
            com.google.android.gms.dynamic.IObjectWrapper r1 = r10.f19310j     // Catch:{ all -> 0x008b }
            r0.mo25654a((com.google.android.gms.dynamic.IObjectWrapper) r1)     // Catch:{ all -> 0x008b }
            com.google.android.gms.internal.ads.zzaqd r0 = com.google.android.gms.ads.internal.zzk.zzlv()     // Catch:{ all -> 0x008b }
            com.google.android.gms.dynamic.IObjectWrapper r1 = r10.f19310j     // Catch:{ all -> 0x008b }
            r0.mo27563a((com.google.android.gms.dynamic.IObjectWrapper) r1)     // Catch:{ all -> 0x008b }
            r0 = 1
            r10.f19311k = r0     // Catch:{ all -> 0x008b }
        L_0x0089:
            monitor-exit(r10)
            return
        L_0x008b:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbot.m21440a():void");
    }

    public final synchronized void onAdImpression() {
        if (!this.f19311k) {
            m21440a();
        }
        if (!(!this.f19308h.f21111J || this.f19310j == null || this.f19307g == null)) {
            this.f19307g.mo25665a("onSdkImpression", (Map<String, ?>) new C4868a());
        }
    }

    public final synchronized void onAdLoaded() {
        if (!this.f19311k) {
            m21440a();
        }
    }
}
