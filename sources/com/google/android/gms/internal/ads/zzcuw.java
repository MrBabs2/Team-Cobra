package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

public final class zzcuw implements zzcva<zzcuv> {

    /* renamed from: a */
    private final zzbbl f20997a;

    /* renamed from: b */
    private final Context f20998b;

    /* renamed from: c */
    private final zzbai f20999c;

    public zzcuw(zzbbl zzbbl, Context context, zzbai zzbai) {
        this.f20997a = zzbbl;
        this.f20998b = context;
        this.f20999c = zzbai;
    }

    /* renamed from: a */
    public final zzbbh<zzcuv> mo25785a() {
        return this.f20997a.mo27892a(new C8183yo(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ zzcuv mo28799b() throws Exception {
        boolean a = Wrappers.m16317a(this.f20998b).mo25508a();
        zzk.zzlg();
        boolean k = zzaxi.m20308k(this.f20998b);
        String str = this.f20999c.f18742f;
        zzk.zzli();
        boolean d = zzaxo.m20330d();
        zzk.zzlg();
        return new zzcuv(a, k, str, d, zzaxi.m20305h(this.f20998b), DynamiteModule.m16423b(this.f20998b, ModuleDescriptor.MODULE_ID));
    }
}
