package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* renamed from: com.google.android.gms.internal.ads.s0 */
final class C7937s0 implements BaseGmsClient.BaseConnectionCallbacks {

    /* renamed from: a */
    private final /* synthetic */ zzbbr f16794a;

    /* renamed from: b */
    private final /* synthetic */ zzaii f16795b;

    C7937s0(zzaii zzaii, zzbbr zzbbr) {
        this.f16795b = zzaii;
        this.f16794a = zzbbr;
    }

    /* renamed from: a */
    public final void mo25298a(int i) {
        zzbbr zzbbr = this.f16794a;
        StringBuilder sb = new StringBuilder(34);
        sb.append("onConnectionSuspended: ");
        sb.append(i);
        zzbbr.mo27903a(new RuntimeException(sb.toString()));
    }

    /* renamed from: d */
    public final void mo25299d(Bundle bundle) {
        try {
            this.f16794a.mo27904b(this.f16795b.f18136a.mo27309c());
        } catch (DeadObjectException e) {
            this.f16794a.mo27903a(e);
        }
    }
}
