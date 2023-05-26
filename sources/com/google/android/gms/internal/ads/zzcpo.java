package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.util.VisibleForTesting;

public final class zzcpo extends zzzg {

    /* renamed from: f */
    private final Context f20751f;

    /* renamed from: g */
    private final zzbjm f20752g;
    @VisibleForTesting

    /* renamed from: h */
    private final zzcxx f20753h = new zzcxx();
    @VisibleForTesting

    /* renamed from: i */
    private final zzbze f20754i = new zzbze();

    /* renamed from: j */
    private zzyz f20755j;

    public zzcpo(zzbjm zzbjm, Context context, String str) {
        this.f20752g = zzbjm;
        this.f20753h.mo28825a(str);
        this.f20751f = context;
    }

    /* renamed from: T */
    public final zzzc mo27054T() {
        zzbzc a = this.f20754i.mo28573a();
        this.f20753h.mo28826a(a.mo28571f());
        this.f20753h.mo28830b(a.mo28572g());
        zzcxx zzcxx = this.f20753h;
        if (zzcxx.mo28834d() == null) {
            zzcxx.mo28823a(zzyd.m25644a(this.f20751f));
        }
        return new zzcpp(this.f20751f, this.f20752g, this.f20753h, a, this.f20755j);
    }

    /* renamed from: a */
    public final void mo27057a(zzafi zzafi) {
        this.f20754i.mo28574a(zzafi);
    }

    /* renamed from: b */
    public final void mo27064b(zzyz zzyz) {
        this.f20755j = zzyz;
    }

    /* renamed from: a */
    public final void mo27060a(zzafx zzafx) {
        this.f20754i.mo28577a(zzafx);
    }

    /* renamed from: b */
    public final void mo27065b(zzzy zzzy) {
        this.f20753h.mo28824a(zzzy);
    }

    /* renamed from: a */
    public final void mo27058a(zzafl zzafl) {
        this.f20754i.mo28575a(zzafl);
    }

    /* renamed from: a */
    public final void mo27063a(String str, zzafr zzafr, zzafo zzafo) {
        this.f20754i.mo28579a(str, zzafr, zzafo);
    }

    /* renamed from: a */
    public final void mo27056a(zzady zzady) {
        this.f20753h.mo28820a(zzady);
    }

    /* renamed from: a */
    public final void mo27061a(zzaiy zzaiy) {
        this.f20753h.mo28821a(zzaiy);
    }

    /* renamed from: a */
    public final void mo27062a(zzaje zzaje) {
        this.f20754i.mo28578a(zzaje);
    }

    /* renamed from: a */
    public final void mo27059a(zzafu zzafu, zzyd zzyd) {
        this.f20754i.mo28576a(zzafu);
        this.f20753h.mo28823a(zzyd);
    }

    /* renamed from: a */
    public final void mo27055a(PublisherAdViewOptions publisherAdViewOptions) {
        this.f20753h.mo28818a(publisherAdViewOptions);
    }
}
