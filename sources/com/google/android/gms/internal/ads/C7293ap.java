package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;

/* renamed from: com.google.android.gms.internal.ads.ap */
final /* synthetic */ class C7293ap implements Runnable {

    /* renamed from: f */
    private final zzcva f14496f;

    /* renamed from: g */
    private final long f14497g;

    C7293ap(zzcva zzcva, long j) {
        this.f14496f = zzcva;
        this.f14497g = j;
    }

    public final void run() {
        zzcva zzcva = this.f14496f;
        long j = this.f14497g;
        String canonicalName = zzcva.getClass().getCanonicalName();
        long c = zzk.zzln().mo25499c() - j;
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 40);
        sb.append("Signal runtime : ");
        sb.append(canonicalName);
        sb.append(" = ");
        sb.append(c);
        zzawz.m20167e(sb.toString());
    }
}
