package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.ads.zzbk;
import com.google.android.gms.internal.ads.zzbp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class zzde extends zzdf {

    /* renamed from: G */
    private AdvertisingIdClient.Info f21372G;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final zzbp.zza.C12966zza mo28924a(Context context, View view, Activity activity) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28935a(zzdy zzdy, Context context, zzbp.zza.C12966zza zza, zzbk.zza zza2) {
        if (zzdy.f21787m) {
            AdvertisingIdClient.Info info = this.f21372G;
            if (info != null) {
                String id = info.getId();
                if (!TextUtils.isEmpty(id)) {
                    zza.mo28321f(zzef.m24288a(id));
                    zza.mo28301a(zzbp.zza.zzc.DEVICE_IDENTIFIER_ANDROID_AD_ID);
                    zza.mo28307a(this.f21372G.isLimitAdTrackingEnabled());
                }
                this.f21372G = null;
                return;
            }
            return;
        }
        zzdf.m23419a(mo28936b(zzdy, context, zza, zza2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final List<Callable<Void>> mo28936b(zzdy zzdy, Context context, zzbp.zza.C12966zza zza, zzbk.zza zza2) {
        ArrayList arrayList = new ArrayList();
        if (zzdy.mo29244d() == null) {
            return arrayList;
        }
        arrayList.add(new zzes(zzdy, "3pegtvj7nkb7e3rwh5b+3dnQATJj6aqtaosJ3DkOYPzNGN2w+CoarbJEsY1UQgeA", "/kRTFQbKQx44ublaFMNQ8yNL6QxOrgEofiWDpZSH6zA=", zza, zzdy.mo29243c(), 24));
        return arrayList;
    }
}
