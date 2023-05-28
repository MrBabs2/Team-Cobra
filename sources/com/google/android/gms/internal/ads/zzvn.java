package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.VisibleForTesting;

@zzard
public final class zzvn {

    /* renamed from: a */
    private final Runnable f22848a = new w40(this);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f22849b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public zzvu f22850c;

    /* renamed from: d */
    private Context f22851d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public zzvy f22852e;

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m25438b() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f22849b
            monitor-enter(r0)
            android.content.Context r1 = r3.f22851d     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0021
            com.google.android.gms.internal.ads.zzvu r1 = r3.f22850c     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x000c
            goto L_0x0021
        L_0x000c:
            com.google.android.gms.internal.ads.y40 r1 = new com.google.android.gms.internal.ads.y40     // Catch:{ all -> 0x0023 }
            r1.<init>(r3)     // Catch:{ all -> 0x0023 }
            com.google.android.gms.internal.ads.z40 r2 = new com.google.android.gms.internal.ads.z40     // Catch:{ all -> 0x0023 }
            r2.<init>(r3)     // Catch:{ all -> 0x0023 }
            com.google.android.gms.internal.ads.zzvu r1 = r3.m25434a((com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks) r1, (com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener) r2)     // Catch:{ all -> 0x0023 }
            r3.f22850c = r1     // Catch:{ all -> 0x0023 }
            r1.checkAvailabilityAndConnect()     // Catch:{ all -> 0x0023 }
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x0023:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvn.m25438b():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m25441c() {
        synchronized (this.f22849b) {
            if (this.f22850c != null) {
                if (this.f22850c.isConnected() || this.f22850c.isConnecting()) {
                    this.f22850c.disconnect();
                }
                this.f22850c = null;
                this.f22852e = null;
                Binder.flushPendingCommands();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29844a(android.content.Context r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.Object r0 = r2.f22849b
            monitor-enter(r0)
            android.content.Context r1 = r2.f22851d     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x000c:
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x0048 }
            r2.f22851d = r3     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzacj<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.zzacu.f17847S1     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzacr r1 = com.google.android.gms.internal.ads.zzyt.m25670e()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.mo27163a(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0028
            r2.m25438b()     // Catch:{ all -> 0x0048 }
            goto L_0x0046
        L_0x0028:
            com.google.android.gms.internal.ads.zzacj<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.zzacu.f17843R1     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzacr r1 = com.google.android.gms.internal.ads.zzyt.m25670e()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.mo27163a(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0046
            com.google.android.gms.internal.ads.x40 r3 = new com.google.android.gms.internal.ads.x40     // Catch:{ all -> 0x0048 }
            r3.<init>(r2)     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.zzuq r1 = com.google.android.gms.ads.internal.zzk.zzlj()     // Catch:{ all -> 0x0048 }
            r1.mo29814a((com.google.android.gms.internal.ads.zzut) r3)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0048:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvn.mo29844a(android.content.Context):void");
    }

    /* renamed from: a */
    public final void mo29843a() {
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17851T1)).booleanValue()) {
            synchronized (this.f22849b) {
                m25438b();
                zzk.zzlg();
                zzaxi.f18651h.removeCallbacks(this.f22848a);
                zzk.zzlg();
                zzaxi.f18651h.postDelayed(this.f22848a, ((Long) zzyt.m25670e().mo27163a(zzacu.f17855U1)).longValue());
            }
        }
    }

    /* renamed from: a */
    public final zzvs mo29842a(zzvv zzvv) {
        synchronized (this.f22849b) {
            if (this.f22852e == null) {
                zzvs zzvs = new zzvs();
                return zzvs;
            }
            try {
                zzvs a = this.f22852e.mo29855a(zzvv);
                return a;
            } catch (RemoteException e) {
                zzbad.m20520b("Unable to call into cache service.", e);
                return new zzvs();
            }
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    private final synchronized zzvu m25434a(BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener) {
        return new zzvu(this.f22851d, zzk.zzlu().mo27864b(), baseConnectionCallbacks, baseOnConnectionFailedListener);
    }
}
