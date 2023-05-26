package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.zi */
final /* synthetic */ class C8214zi implements Callable {

    /* renamed from: f */
    private final zzbbh f17641f;

    /* renamed from: g */
    private final zzbai f17642g;

    /* renamed from: h */
    private final ApplicationInfo f17643h;

    /* renamed from: i */
    private final String f17644i;

    /* renamed from: j */
    private final List f17645j;

    /* renamed from: k */
    private final PackageInfo f17646k;

    /* renamed from: l */
    private final zzbbh f17647l;

    /* renamed from: m */
    private final zzaxb f17648m;

    /* renamed from: n */
    private final String f17649n;

    C8214zi(zzbbh zzbbh, zzbai zzbai, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, zzbbh zzbbh2, zzaxb zzaxb, String str2) {
        this.f17641f = zzbbh;
        this.f17642g = zzbai;
        this.f17643h = applicationInfo;
        this.f17644i = str;
        this.f17645j = list;
        this.f17646k = packageInfo;
        this.f17647l = zzbbh2;
        this.f17648m = zzaxb;
        this.f17649n = str2;
    }

    public final Object call() {
        zzbbh zzbbh = this.f17641f;
        zzbai zzbai = this.f17642g;
        ApplicationInfo applicationInfo = this.f17643h;
        String str = this.f17644i;
        List list = this.f17645j;
        PackageInfo packageInfo = this.f17646k;
        zzbbh zzbbh2 = this.f17647l;
        zzaxb zzaxb = this.f17648m;
        String str2 = this.f17649n;
        boolean l = zzaxb.mo27789l();
        return new zzarx((Bundle) zzbbh.get(), zzbai, applicationInfo, str, list, packageInfo, (String) zzbbh2.get(), l, str2);
    }
}
