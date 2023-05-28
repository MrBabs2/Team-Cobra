package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* renamed from: com.google.android.gms.internal.ads.t0 */
final class C7974t0 implements BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: a */
    private final /* synthetic */ zzbbr f16873a;

    C7974t0(zzaii zzaii, zzbbr zzbbr) {
        this.f16873a = zzbbr;
    }

    /* renamed from: a */
    public final void mo25300a(ConnectionResult connectionResult) {
        this.f16873a.mo27903a(new RuntimeException("Connection failed."));
    }
}
