package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.Set;

public final class zzcxv {

    /* renamed from: a */
    public final zzzy f21164a;

    /* renamed from: b */
    public final zzacd f21165b;

    /* renamed from: c */
    public final zzaiy f21166c;

    /* renamed from: d */
    public final zzxz f21167d;

    /* renamed from: e */
    public final zzyd f21168e;

    /* renamed from: f */
    public final String f21169f;

    /* renamed from: g */
    public final ArrayList<String> f21170g;

    /* renamed from: h */
    public final ArrayList<String> f21171h;

    /* renamed from: i */
    public final zzady f21172i;

    /* renamed from: j */
    public final String f21173j;

    /* renamed from: k */
    public final String f21174k;

    /* renamed from: l */
    public final int f21175l;

    /* renamed from: m */
    public final PublisherAdViewOptions f21176m;

    /* renamed from: n */
    public final zzzs f21177n;

    /* renamed from: o */
    public final Set<String> f21178o;

    private zzcxv(zzcxx zzcxx) {
        zzacd zzacd;
        this.f21168e = zzcxx.f21180b;
        this.f21169f = zzcxx.f21182d;
        this.f21164a = zzcxx.f21181c;
        this.f21167d = new zzxz(zzcxx.f21179a.f22981f, zzcxx.f21179a.f22982g, zzcxx.f21179a.f22983h, zzcxx.f21179a.f22984i, zzcxx.f21179a.f22985j, zzcxx.f21179a.f22986k, zzcxx.f21179a.f22987l, zzcxx.f21179a.f22988m || zzcxx.f21184f, zzcxx.f21179a.f22989n, zzcxx.f21179a.f22990o, zzcxx.f21179a.f22991p, zzcxx.f21179a.f22992q, zzcxx.f21179a.f22993r, zzcxx.f21179a.f22994s, zzcxx.f21179a.f22995t, zzcxx.f21179a.f22996u, zzcxx.f21179a.f22997v, zzcxx.f21179a.f22998w, zzcxx.f21179a.f22999x, zzcxx.f21179a.f23000y, zzcxx.f21179a.f23001z);
        zzady zzady = null;
        if (zzcxx.f21183e != null) {
            zzacd = zzcxx.f21183e;
        } else {
            zzacd = zzcxx.f21187i != null ? zzcxx.f21187i.f18047k : null;
        }
        this.f21165b = zzacd;
        this.f21170g = zzcxx.f21185g;
        this.f21171h = zzcxx.f21186h;
        if (zzcxx.f21185g != null) {
            if (zzcxx.f21187i == null) {
                zzady = new zzady(new NativeAdOptions.Builder().build());
            } else {
                zzady = zzcxx.f21187i;
            }
        }
        this.f21172i = zzady;
        this.f21173j = zzcxx.f21190l;
        this.f21174k = zzcxx.f21191m;
        this.f21175l = zzcxx.f21192n;
        this.f21176m = zzcxx.f21188j;
        this.f21177n = zzcxx.f21189k;
        this.f21166c = zzcxx.f21193o;
        this.f21178o = zzcxx.f21194p;
    }

    /* renamed from: a */
    public final zzaga mo28816a() {
        PublisherAdViewOptions publisherAdViewOptions = this.f21176m;
        if (publisherAdViewOptions == null) {
            return null;
        }
        return publisherAdViewOptions.zzku();
    }
}
