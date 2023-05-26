package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;

public final class zzcsp implements zzcva<C7403do> {

    /* renamed from: a */
    private final Context f20911a;

    /* renamed from: b */
    private final zzbbl f20912b;

    zzcsp(Context context, zzbbl zzbbl) {
        this.f20911a = context;
        this.f20912b = zzbbl;
    }

    /* renamed from: a */
    public final zzbbh<C7403do> mo25785a() {
        return this.f20912b.mo27892a(new C7329bo(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ C7403do mo28787b() throws Exception {
        zzk.zzlg();
        String l = zzaxi.m20309l(this.f20911a);
        zzk.zzlg();
        return new C7403do(l, zzaxi.m20310m(this.f20911a));
    }
}
