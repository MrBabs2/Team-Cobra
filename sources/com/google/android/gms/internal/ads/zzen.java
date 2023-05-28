package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbk;
import com.google.android.gms.internal.ads.zzbp;
import java.util.concurrent.ExecutionException;

public final class zzen extends zzfk {

    /* renamed from: o */
    private static final zzfl<zzch> f21826o = new zzfl<>();

    /* renamed from: m */
    private final Context f21827m;

    /* renamed from: n */
    private zzbk.zza f21828n = null;

    public zzen(zzdy zzdy, String str, String str2, zzbp.zza.C12966zza zza, int i, int i2, Context context, zzbk.zza zza2) {
        super(zzdy, str, str2, zza, i, 27);
        this.f21827m = context;
        this.f21828n = zza2;
    }

    /* renamed from: c */
    private final String m24307c() {
        try {
            if (this.f21852f.mo29253m() != null) {
                this.f21852f.mo29253m().get();
            }
            zzbp.zza l = this.f21852f.mo29252l();
            if (l == null || !l.mo28290k()) {
                return null;
            }
            return l.mo28289j();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29271a() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzfl<com.google.android.gms.internal.ads.zzch> r0 = f21826o
            android.content.Context r1 = r8.f21827m
            java.lang.String r1 = r1.getPackageName()
            java.util.concurrent.atomic.AtomicReference r0 = r0.mo29276a(r1)
            monitor-enter(r0)
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x011e }
            com.google.android.gms.internal.ads.zzch r1 = (com.google.android.gms.internal.ads.zzch) r1     // Catch:{ all -> 0x011e }
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0036
            java.lang.String r4 = r1.f20182b     // Catch:{ all -> 0x011e }
            boolean r4 = com.google.android.gms.internal.ads.zzef.m24292b(r4)     // Catch:{ all -> 0x011e }
            if (r4 != 0) goto L_0x0036
            java.lang.String r4 = r1.f20182b     // Catch:{ all -> 0x011e }
            java.lang.String r5 = "E"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x011e }
            if (r4 != 0) goto L_0x0036
            java.lang.String r1 = r1.f20182b     // Catch:{ all -> 0x011e }
            java.lang.String r4 = "0000000000000000000000000000000000000000000000000000000000000000"
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x011e }
            if (r1 == 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            r1 = 0
            goto L_0x0037
        L_0x0036:
            r1 = 1
        L_0x0037:
            if (r1 == 0) goto L_0x00ea
            com.google.android.gms.internal.ads.zzbk$zza r1 = r8.f21828n     // Catch:{ all -> 0x011e }
            java.lang.String r1 = m24306a(r1)     // Catch:{ all -> 0x011e }
            boolean r1 = com.google.android.gms.internal.ads.zzef.m24292b(r1)     // Catch:{ all -> 0x011e }
            if (r1 != 0) goto L_0x0048
            com.google.android.gms.internal.ads.zzbm r1 = com.google.android.gms.internal.ads.zzbm.ENUM_SIGNAL_SOURCE_CALLER_PROVIDED     // Catch:{ all -> 0x011e }
            goto L_0x0082
        L_0x0048:
            com.google.android.gms.internal.ads.zzbk$zza r1 = r8.f21828n     // Catch:{ all -> 0x011e }
            java.lang.String r4 = m24306a(r1)     // Catch:{ all -> 0x011e }
            boolean r4 = com.google.android.gms.internal.ads.zzef.m24292b(r4)     // Catch:{ all -> 0x011e }
            if (r4 == 0) goto L_0x006a
            if (r1 == 0) goto L_0x006a
            boolean r4 = r1.mo28241j()     // Catch:{ all -> 0x011e }
            if (r4 == 0) goto L_0x006a
            com.google.android.gms.internal.ads.zzbk$zzb r1 = r1.mo28242k()     // Catch:{ all -> 0x011e }
            com.google.android.gms.internal.ads.zzbm r1 = r1.mo28245j()     // Catch:{ all -> 0x011e }
            com.google.android.gms.internal.ads.zzbm r4 = com.google.android.gms.internal.ads.zzbm.ENUM_SIGNAL_SOURCE_GASS     // Catch:{ all -> 0x011e }
            if (r1 != r4) goto L_0x006a
            r1 = 1
            goto L_0x006b
        L_0x006a:
            r1 = 0
        L_0x006b:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x011e }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x011e }
            if (r1 == 0) goto L_0x0080
            com.google.android.gms.internal.ads.zzdy r1 = r8.f21852f     // Catch:{ all -> 0x011e }
            boolean r1 = r1.mo29250j()     // Catch:{ all -> 0x011e }
            if (r1 == 0) goto L_0x0080
            com.google.android.gms.internal.ads.zzbm r1 = com.google.android.gms.internal.ads.zzbm.ENUM_SIGNAL_SOURCE_GASS     // Catch:{ all -> 0x011e }
            goto L_0x0082
        L_0x0080:
            com.google.android.gms.internal.ads.zzbm r1 = com.google.android.gms.internal.ads.zzbm.ENUM_SIGNAL_SOURCE_ADSHIELD     // Catch:{ all -> 0x011e }
        L_0x0082:
            java.lang.reflect.Method r4 = r8.f21856j     // Catch:{ all -> 0x011e }
            r5 = 0
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x011e }
            android.content.Context r7 = r8.f21827m     // Catch:{ all -> 0x011e }
            r6[r2] = r7     // Catch:{ all -> 0x011e }
            com.google.android.gms.internal.ads.zzbm r7 = com.google.android.gms.internal.ads.zzbm.ENUM_SIGNAL_SOURCE_ADSHIELD     // Catch:{ all -> 0x011e }
            if (r1 != r7) goto L_0x0091
            r2 = 1
        L_0x0091:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x011e }
            r6[r3] = r2     // Catch:{ all -> 0x011e }
            com.google.android.gms.internal.ads.zzacj<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.zzacu.f17955q1     // Catch:{ all -> 0x011e }
            com.google.android.gms.internal.ads.zzacr r7 = com.google.android.gms.internal.ads.zzyt.m25670e()     // Catch:{ all -> 0x011e }
            java.lang.Object r2 = r7.mo27163a(r2)     // Catch:{ all -> 0x011e }
            r7 = 2
            r6[r7] = r2     // Catch:{ all -> 0x011e }
            java.lang.Object r2 = r4.invoke(r5, r6)     // Catch:{ all -> 0x011e }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x011e }
            com.google.android.gms.internal.ads.zzch r4 = new com.google.android.gms.internal.ads.zzch     // Catch:{ all -> 0x011e }
            r4.<init>(r2)     // Catch:{ all -> 0x011e }
            java.lang.String r2 = r4.f20182b     // Catch:{ all -> 0x011e }
            boolean r2 = com.google.android.gms.internal.ads.zzef.m24292b(r2)     // Catch:{ all -> 0x011e }
            if (r2 != 0) goto L_0x00c1
            java.lang.String r2 = r4.f20182b     // Catch:{ all -> 0x011e }
            java.lang.String r5 = "E"
            boolean r2 = r2.equals(r5)     // Catch:{ all -> 0x011e }
            if (r2 == 0) goto L_0x00e7
        L_0x00c1:
            int[] r2 = com.google.android.gms.internal.ads.C8082vy.f17040a     // Catch:{ all -> 0x011e }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x011e }
            r1 = r2[r1]     // Catch:{ all -> 0x011e }
            if (r1 == r3) goto L_0x00db
            if (r1 == r7) goto L_0x00ce
            goto L_0x00e7
        L_0x00ce:
            java.lang.String r1 = r8.m24307c()     // Catch:{ all -> 0x011e }
            boolean r2 = com.google.android.gms.internal.ads.zzef.m24292b(r1)     // Catch:{ all -> 0x011e }
            if (r2 != 0) goto L_0x00e7
            r4.f20182b = r1     // Catch:{ all -> 0x011e }
            goto L_0x00e7
        L_0x00db:
            com.google.android.gms.internal.ads.zzbk$zza r1 = r8.f21828n     // Catch:{ all -> 0x011e }
            com.google.android.gms.internal.ads.zzbk$zzc r1 = r1.mo28244m()     // Catch:{ all -> 0x011e }
            java.lang.String r1 = r1.mo28246j()     // Catch:{ all -> 0x011e }
            r4.f20182b = r1     // Catch:{ all -> 0x011e }
        L_0x00e7:
            r0.set(r4)     // Catch:{ all -> 0x011e }
        L_0x00ea:
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x011e }
            com.google.android.gms.internal.ads.zzch r1 = (com.google.android.gms.internal.ads.zzch) r1     // Catch:{ all -> 0x011e }
            monitor-exit(r0)     // Catch:{ all -> 0x011e }
            com.google.android.gms.internal.ads.zzbp$zza$zza r2 = r8.f21855i
            monitor-enter(r2)
            if (r1 == 0) goto L_0x0119
            com.google.android.gms.internal.ads.zzbp$zza$zza r0 = r8.f21855i     // Catch:{ all -> 0x011b }
            java.lang.String r3 = r1.f20182b     // Catch:{ all -> 0x011b }
            r0.mo28327i((java.lang.String) r3)     // Catch:{ all -> 0x011b }
            com.google.android.gms.internal.ads.zzbp$zza$zza r0 = r8.f21855i     // Catch:{ all -> 0x011b }
            long r3 = r1.f20183c     // Catch:{ all -> 0x011b }
            r0.mo28335p(r3)     // Catch:{ all -> 0x011b }
            com.google.android.gms.internal.ads.zzbp$zza$zza r0 = r8.f21855i     // Catch:{ all -> 0x011b }
            java.lang.String r3 = r1.f20184d     // Catch:{ all -> 0x011b }
            r0.mo28311b((java.lang.String) r3)     // Catch:{ all -> 0x011b }
            com.google.android.gms.internal.ads.zzbp$zza$zza r0 = r8.f21855i     // Catch:{ all -> 0x011b }
            java.lang.String r3 = r1.f20185e     // Catch:{ all -> 0x011b }
            r0.mo28314c((java.lang.String) r3)     // Catch:{ all -> 0x011b }
            com.google.android.gms.internal.ads.zzbp$zza$zza r0 = r8.f21855i     // Catch:{ all -> 0x011b }
            java.lang.String r1 = r1.f20186f     // Catch:{ all -> 0x011b }
            r0.mo28317d((java.lang.String) r1)     // Catch:{ all -> 0x011b }
        L_0x0119:
            monitor-exit(r2)     // Catch:{ all -> 0x011b }
            return
        L_0x011b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x011b }
            throw r0
        L_0x011e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x011e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzen.mo29271a():void");
    }

    /* renamed from: a */
    private static String m24306a(zzbk.zza zza) {
        if (zza == null || !zza.mo28243l() || zzef.m24292b(zza.mo28244m().mo28246j())) {
            return null;
        }
        return zza.mo28244m().mo28246j();
    }
}
