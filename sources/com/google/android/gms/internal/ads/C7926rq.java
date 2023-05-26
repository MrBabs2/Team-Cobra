package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzbp;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.ads.rq */
final class C7926rq implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    @VisibleForTesting

    /* renamed from: a */
    private zzdba f16775a;

    /* renamed from: b */
    private final String f16776b;

    /* renamed from: c */
    private final String f16777c;

    /* renamed from: d */
    private final LinkedBlockingQueue<zzbp.zza> f16778d = new LinkedBlockingQueue<>();

    /* renamed from: e */
    private final HandlerThread f16779e;

    public C7926rq(Context context, String str, String str2) {
        this.f16776b = str;
        this.f16777c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f16779e = handlerThread;
        handlerThread.start();
        this.f16775a = new zzdba(context, this.f16779e.getLooper(), this, this);
        this.f16775a.checkAvailabilityAndConnect();
    }

    @VisibleForTesting
    /* renamed from: c */
    private static zzbp.zza m18130c() {
        zzbp.zza.C12966zza p = zzbp.zza.m21530p();
        p.mo28328j(32768);
        return (zzbp.zza) ((zzdob) p.mo29143t());
    }

    /* renamed from: a */
    public final void mo25298a(int i) {
        try {
            this.f16778d.put(m18130c());
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: b */
    public final zzbp.zza mo26524b(int i) {
        zzbp.zza zza;
        try {
            zza = this.f16778d.poll(5000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zza = null;
        }
        return zza == null ? m18130c() : zza;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:6|7|11|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        m18128a();
        r3.f16779e.quit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r3.f16778d.put(m18130c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        m18128a();
        r3.f16779e.quit();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0025 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25299d(android.os.Bundle r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzdbf r4 = r3.m18129b()
            if (r4 == 0) goto L_0x0041
            com.google.android.gms.internal.ads.zzdbb r0 = new com.google.android.gms.internal.ads.zzdbb     // Catch:{ all -> 0x0025 }
            java.lang.String r1 = r3.f16776b     // Catch:{ all -> 0x0025 }
            java.lang.String r2 = r3.f16777c     // Catch:{ all -> 0x0025 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.zzdbd r4 = r4.mo28899a((com.google.android.gms.internal.ads.zzdbb) r0)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.zzbp$zza r4 = r4.mo28895d()     // Catch:{ all -> 0x0025 }
            java.util.concurrent.LinkedBlockingQueue<com.google.android.gms.internal.ads.zzbp$zza> r0 = r3.f16778d     // Catch:{ all -> 0x0025 }
            r0.put(r4)     // Catch:{ all -> 0x0025 }
            r3.m18128a()
            android.os.HandlerThread r4 = r3.f16779e
            r4.quit()
            return
        L_0x0025:
            java.util.concurrent.LinkedBlockingQueue<com.google.android.gms.internal.ads.zzbp$zza> r4 = r3.f16778d     // Catch:{ InterruptedException -> 0x0039, all -> 0x002f }
            com.google.android.gms.internal.ads.zzbp$zza r0 = m18130c()     // Catch:{ InterruptedException -> 0x0039, all -> 0x002f }
            r4.put(r0)     // Catch:{ InterruptedException -> 0x0039, all -> 0x002f }
            goto L_0x0039
        L_0x002f:
            r4 = move-exception
            r3.m18128a()
            android.os.HandlerThread r0 = r3.f16779e
            r0.quit()
            throw r4
        L_0x0039:
            r3.m18128a()
            android.os.HandlerThread r4 = r3.f16779e
            r4.quit()
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7926rq.mo25299d(android.os.Bundle):void");
    }

    /* renamed from: a */
    public final void mo25300a(ConnectionResult connectionResult) {
        try {
            this.f16778d.put(m18130c());
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: a */
    private final void m18128a() {
        zzdba zzdba = this.f16775a;
        if (zzdba == null) {
            return;
        }
        if (zzdba.isConnected() || this.f16775a.isConnecting()) {
            this.f16775a.disconnect();
        }
    }

    /* renamed from: b */
    private final zzdbf m18129b() {
        try {
            return this.f16775a.mo28891c();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
