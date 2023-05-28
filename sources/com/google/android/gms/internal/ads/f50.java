package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

final class f50 implements BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: a */
    private final /* synthetic */ zzbbr f15188a;

    /* renamed from: b */
    private final /* synthetic */ zzwb f15189b;

    f50(zzwb zzwb, zzbbr zzbbr) {
        this.f15189b = zzwb;
        this.f15188a = zzbbr;
    }

    /* renamed from: a */
    public final void mo25300a(ConnectionResult connectionResult) {
        synchronized (this.f15189b.f22865d) {
            this.f15188a.mo27903a(new RuntimeException("Connection failed."));
        }
    }
}
