package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.t4 */
final class C7978t4 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ Context f16888f;

    /* renamed from: g */
    private final /* synthetic */ zzbbr f16889g;

    C7978t4(zzawg zzawg, Context context, zzbbr zzbbr) {
        this.f16888f = context;
        this.f16889g = zzbbr;
    }

    public final void run() {
        try {
            this.f16889g.mo27904b(AdvertisingIdClient.getAdvertisingIdInfo(this.f16888f));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            this.f16889g.mo27903a(e);
            zzbad.m20520b("Exception while getting advertising Id info", e);
        }
    }
}
