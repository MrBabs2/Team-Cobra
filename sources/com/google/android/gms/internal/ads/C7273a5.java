package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.a5 */
final class C7273a5 extends zzawv {

    /* renamed from: a */
    private Context f14405a;

    C7273a5(Context context) {
        this.f14405a = context;
    }

    public final void zzto() {
        boolean z;
        try {
            z = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.f14405a);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            zzbad.m20520b("Fail to get isAdIdFakeForDebugLogging", e);
            z = false;
        }
        zzazx.m20496a(z);
        StringBuilder sb = new StringBuilder(43);
        sb.append("Update ad debug logging enablement as ");
        sb.append(z);
        zzbad.m20523d(sb.toString());
    }
}
