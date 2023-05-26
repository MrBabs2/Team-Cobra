package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

public final class zzcvu implements zzcva<zzcvt> {

    /* renamed from: a */
    private final zzawi f21042a;

    /* renamed from: b */
    private final Executor f21043b;

    /* renamed from: c */
    private final String f21044c;

    /* renamed from: d */
    private final PackageInfo f21045d;

    public zzcvu(zzawi zzawi, Executor executor, String str, PackageInfo packageInfo) {
        this.f21042a = zzawi;
        this.f21043b = executor;
        this.f21044c = str;
        this.f21045d = packageInfo;
    }

    /* renamed from: a */
    public final zzbbh<zzcvt> mo25785a() {
        return zzbar.m20544a(zzbar.m20543a(this.f21042a.mo27716a(this.f21044c, this.f21045d), C7551hp.f15538a, this.f21043b), Throwable.class, new C7588ip(this), this.f21043b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzbbh mo28803a(Throwable th) throws Exception {
        return zzbar.m20539a(new zzcvt(this.f21044c));
    }
}
