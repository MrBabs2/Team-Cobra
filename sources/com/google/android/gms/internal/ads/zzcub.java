package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;

public final class zzcub implements zzcuz<Bundle>, zzcva<zzcuz<Bundle>> {

    /* renamed from: a */
    private final ApplicationInfo f20954a;

    /* renamed from: b */
    private final PackageInfo f20955b;

    zzcub(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        this.f20954a = applicationInfo;
        this.f20955b = packageInfo;
    }

    /* renamed from: a */
    public final zzbbh<zzcuz<Bundle>> mo25785a() {
        return zzbar.m20539a(this);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25833a(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f20954a.packageName;
        PackageInfo packageInfo = this.f20955b;
        Integer valueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        bundle.putString("pn", str);
        if (valueOf != null) {
            bundle.putInt("vc", valueOf.intValue());
        }
    }
}
