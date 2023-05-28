package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzbqy;

public final class zzcmo extends zzcmn<zzbnf> {

    /* renamed from: a */
    private final zzbjm f20595a;

    /* renamed from: b */
    private final zzbqy.zza f20596b;

    /* renamed from: c */
    private final zzcow f20597c;

    /* renamed from: d */
    private final zzbtv f20598d;

    /* renamed from: e */
    private final zzbxk f20599e;

    /* renamed from: f */
    private final zzbtb f20600f;

    /* renamed from: g */
    private final ViewGroup f20601g;

    public zzcmo(zzbjm zzbjm, zzbqy.zza zza, zzcow zzcow, zzbtv zzbtv, zzbxk zzbxk, zzbtb zzbtb, ViewGroup viewGroup) {
        this.f20595a = zzbjm;
        this.f20596b = zza;
        this.f20597c = zzcow;
        this.f20598d = zzbtv;
        this.f20599e = zzbxk;
        this.f20600f = zzbtb;
        this.f20601g = viewGroup;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final zzbbh<zzbnf> mo28740a(zzcxv zzcxv, Bundle bundle) {
        zzbod f = this.f20595a.mo28229f();
        zzbqy.zza zza = this.f20596b;
        zza.mo28404a(zzcxv);
        zza.mo28403a(bundle);
        return f.mo25781a(zza.mo28406a()).mo25782a(this.f20598d).mo25784a(this.f20597c).mo25783a(this.f20599e).mo25780a(new zzbox(this.f20600f)).mo25779a(new zzbnc(this.f20601g)).mo25778a().mo25827b();
    }
}
