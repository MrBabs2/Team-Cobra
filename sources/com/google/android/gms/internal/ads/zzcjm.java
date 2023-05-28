package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.internal.ads.zzwt;
import java.util.ArrayList;

public final class zzcjm {

    /* renamed from: g */
    private static final SparseArray<zzwt.zzi.zzc> f20283g;

    /* renamed from: a */
    private final Context f20284a;

    /* renamed from: b */
    private final zzbbh<Bundle> f20285b;

    /* renamed from: c */
    private final TelephonyManager f20286c;

    /* renamed from: d */
    private final zzcji f20287d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final zzcjc f20288e;

    /* renamed from: f */
    private zzwx f20289f;

    static {
        SparseArray<zzwt.zzi.zzc> sparseArray = new SparseArray<>();
        f20283g = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzwt.zzi.zzc.CONNECTED);
        f20283g.put(NetworkInfo.DetailedState.AUTHENTICATING.ordinal(), zzwt.zzi.zzc.CONNECTING);
        f20283g.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzwt.zzi.zzc.CONNECTING);
        f20283g.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzwt.zzi.zzc.CONNECTING);
        f20283g.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzwt.zzi.zzc.DISCONNECTING);
        f20283g.put(NetworkInfo.DetailedState.BLOCKED.ordinal(), zzwt.zzi.zzc.DISCONNECTED);
        f20283g.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzwt.zzi.zzc.DISCONNECTED);
        f20283g.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzwt.zzi.zzc.DISCONNECTED);
        f20283g.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzwt.zzi.zzc.DISCONNECTED);
        f20283g.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzwt.zzi.zzc.DISCONNECTED);
        f20283g.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzwt.zzi.zzc.SUSPENDED);
        if (Build.VERSION.SDK_INT >= 17) {
            f20283g.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzwt.zzi.zzc.CONNECTING);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            f20283g.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzwt.zzi.zzc.CONNECTING);
        }
    }

    zzcjm(Context context, zzbbh<Bundle> zzbbh, zzcji zzcji, zzcjc zzcjc) {
        this.f20284a = context;
        this.f20285b = zzbbh;
        this.f20287d = zzcji;
        this.f20288e = zzcjc;
        this.f20286c = (TelephonyManager) context.getSystemService("phone");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final zzwt.zzg m22602a(Bundle bundle) {
        zzwt.zzg.zzb zzb;
        zzwt.zzg.zza j = zzwt.zzg.m25500j();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        if (i == -1) {
            this.f20289f = zzwx.ENUM_TRUE;
        } else {
            this.f20289f = zzwx.ENUM_FALSE;
            if (i == 0) {
                j.mo29865a(zzwt.zzg.zzc.CELL);
            } else if (i != 1) {
                j.mo29865a(zzwt.zzg.zzc.NETWORKTYPE_UNSPECIFIED);
            } else {
                j.mo29865a(zzwt.zzg.zzc.WIFI);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zzb = zzwt.zzg.zzb.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    zzb = zzwt.zzg.zzb.THREE_G;
                    break;
                case 13:
                    zzb = zzwt.zzg.zzb.LTE;
                    break;
                default:
                    zzb = zzwt.zzg.zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            j.mo29864a(zzb);
        }
        return (zzwt.zzg) ((zzdob) j.mo29143t());
    }

    /* renamed from: b */
    private static zzwx m22608b(boolean z) {
        return z ? zzwx.ENUM_TRUE : zzwx.ENUM_FALSE;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<com.google.android.gms.internal.ads.zzwt.zza.C12977zza> m22610c(android.os.Bundle r7) {
        /*
            java.lang.String r0 = "ad_types"
            java.lang.Object r7 = r7.get(r0)
            boolean r0 = r7 instanceof java.util.List
            if (r0 == 0) goto L_0x000d
            java.util.List r7 = (java.util.List) r7
            goto L_0x0017
        L_0x000d:
            boolean r0 = r7 instanceof java.lang.String[]
            if (r0 == 0) goto L_0x003d
            java.lang.String[] r7 = (java.lang.String[]) r7
            java.util.List r7 = java.util.Arrays.asList(r7)
        L_0x0017:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.size()
            r0.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
        L_0x0024:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0038
            java.lang.Object r1 = r7.next()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L_0x0024
            java.lang.String r1 = (java.lang.String) r1
            r0.add(r1)
            goto L_0x0024
        L_0x0038:
            java.util.List r7 = java.util.Collections.unmodifiableList(r0)
            goto L_0x0041
        L_0x003d:
            java.util.List r7 = java.util.Collections.emptyList()
        L_0x0041:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x004a:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x00a3
            java.lang.Object r1 = r7.next()
            java.lang.String r1 = (java.lang.String) r1
            r2 = -1
            int r3 = r1.hashCode()
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r3) {
                case -1396342996: goto L_0x0080;
                case -1052618729: goto L_0x0076;
                case -239580146: goto L_0x006c;
                case 604727084: goto L_0x0062;
                default: goto L_0x0061;
            }
        L_0x0061:
            goto L_0x0089
        L_0x0062:
            java.lang.String r3 = "interstitial"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0089
            r2 = 1
            goto L_0x0089
        L_0x006c:
            java.lang.String r3 = "rewarded"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0089
            r2 = 3
            goto L_0x0089
        L_0x0076:
            java.lang.String r3 = "native"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0089
            r2 = 2
            goto L_0x0089
        L_0x0080:
            java.lang.String r3 = "banner"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0089
            r2 = 0
        L_0x0089:
            if (r2 == 0) goto L_0x009d
            if (r2 == r6) goto L_0x009a
            if (r2 == r5) goto L_0x0097
            if (r2 == r4) goto L_0x0094
            com.google.android.gms.internal.ads.zzwt$zza$zza r1 = com.google.android.gms.internal.ads.zzwt.zza.C12977zza.AD_FORMAT_TYPE_UNSPECIFIED
            goto L_0x009f
        L_0x0094:
            com.google.android.gms.internal.ads.zzwt$zza$zza r1 = com.google.android.gms.internal.ads.zzwt.zza.C12977zza.REWARD_BASED_VIDEO_AD
            goto L_0x009f
        L_0x0097:
            com.google.android.gms.internal.ads.zzwt$zza$zza r1 = com.google.android.gms.internal.ads.zzwt.zza.C12977zza.NATIVE_APP_INSTALL
            goto L_0x009f
        L_0x009a:
            com.google.android.gms.internal.ads.zzwt$zza$zza r1 = com.google.android.gms.internal.ads.zzwt.zza.C12977zza.INTERSTITIAL
            goto L_0x009f
        L_0x009d:
            com.google.android.gms.internal.ads.zzwt$zza$zza r1 = com.google.android.gms.internal.ads.zzwt.zza.C12977zza.BANNER
        L_0x009f:
            r0.add(r1)
            goto L_0x004a
        L_0x00a3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcjm.m22610c(android.os.Bundle):java.util.ArrayList");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static zzwt.zzi.zzc m22606b(Bundle bundle) {
        return f20283g.get(zzcxz.m23101a(zzcxz.m23101a(bundle, "device"), "network").getInt("active_network_state", -1), zzwt.zzi.zzc.UNSPECIFIED);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final byte[] m22605a(boolean z, ArrayList<zzwt.zza.C12977zza> arrayList, zzwt.zzg zzg, zzwt.zzi.zzc zzc) {
        zzwt.zzi.zza.C12978zza j = zzwt.zzi.zza.m25553j();
        j.mo29871a((Iterable<? extends zzwt.zza.C12977zza>) arrayList);
        boolean z2 = true;
        j.mo29875c(m22608b(zzk.zzli().mo27822b(this.f20284a.getContentResolver()) != 0));
        j.mo29876d(zzk.zzli().mo27814a(this.f20284a, this.f20286c));
        j.mo29872b(this.f20287d.mo28708b());
        j.mo29874c(this.f20287d.mo28712d());
        j.mo29866a(this.f20287d.mo28705a());
        j.mo29869a(zzc);
        j.mo29868a(zzg);
        j.mo29877e(this.f20289f);
        j.mo29870a(m22608b(z));
        j.mo29867a(zzk.zzln().mo25498b());
        if (zzk.zzli().mo27810a(this.f20284a.getContentResolver()) == 0) {
            z2 = false;
        }
        j.mo29873b(m22608b(z2));
        return ((zzwt.zzi.zza) ((zzdob) j.mo29143t())).mo29065g();
    }

    /* renamed from: a */
    public final void mo28713a(boolean z) {
        zzbar.m20546a(this.f20285b, new C8215zj(this, z), zzbbm.f18749b);
    }
}
