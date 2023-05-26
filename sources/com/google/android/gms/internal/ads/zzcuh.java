package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

public final class zzcuh implements zzcva<zzcuz<Bundle>> {

    /* renamed from: a */
    private final Context f20963a;

    /* renamed from: b */
    private final String f20964b;

    zzcuh(Context context, String str) {
        this.f20963a = context;
        this.f20964b = str;
    }

    /* renamed from: a */
    public final zzbbh<zzcuz<Bundle>> mo25785a() {
        C7961so soVar;
        if (this.f20964b == null) {
            soVar = null;
        } else {
            soVar = new C7961so(this);
        }
        return zzbar.m20539a(soVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo28794a(Bundle bundle) {
        bundle.putString("rewarded_sku_package", this.f20963a.getPackageName());
    }
}
