package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzb;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class zzcbi {

    /* renamed from: a */
    private final Context f19900a;

    /* renamed from: b */
    private final zzcxv f19901b;

    /* renamed from: c */
    private final Executor f19902c;

    /* renamed from: d */
    private final zzcdn f19903d;

    public zzcbi(Context context, zzcxv zzcxv, Executor executor, zzcdn zzcdn) {
        this.f19900a = context;
        this.f19901b = zzcxv;
        this.f19902c = executor;
        this.f19903d = zzcdn;
    }

    /* renamed from: a */
    public final zzbbh<zzbgz> mo28630a(JSONObject jSONObject) {
        return zzbar.m20542a(zzbar.m20542a(zzbar.m20539a(null), new C8212zg(this), this.f19902c), new C8138xg(this, jSONObject), this.f19902c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo28633b(zzbgz zzbgz, zzbbq zzbbq, boolean z) {
        if (!(this.f19901b.f21165b == null || zzbgz.mo25685e() == null)) {
            zzbgz.mo25685e().mo28162b(this.f19901b.f21165b);
        }
        zzbbq.mo27902a();
    }

    /* renamed from: a */
    public final zzbbh<zzbgz> mo28628a(String str, String str2) {
        return zzbar.m20542a(zzbar.m20539a(null), new C8175yg(this, str, str2), this.f19902c);
    }

    /* renamed from: a */
    private final void m22298a(zzbgz zzbgz) {
        zzbgz.mo25662a("/video", (zzaho<? super zzbgz>) zzagz.f18105l);
        zzbgz.mo25662a("/videoMeta", (zzaho<? super zzbgz>) zzagz.f18106m);
        zzbgz.mo25662a("/precache", (zzaho<? super zzbgz>) new zzbgc());
        zzbgz.mo25662a("/delayPageLoaded", (zzaho<? super zzbgz>) zzagz.f18109p);
        zzbgz.mo25662a("/instrument", (zzaho<? super zzbgz>) zzagz.f18107n);
        zzbgz.mo25662a("/log", (zzaho<? super zzbgz>) zzagz.f18100g);
        zzbgz.mo25662a("/videoClicked", (zzaho<? super zzbgz>) zzagz.f18101h);
        zzbgz.mo25697k().mo28133a(true);
        if (this.f19901b.f21166c != null) {
            zzbgz.mo25662a("/open", (zzaho<? super zzbgz>) new zzahs((zzb) null, (zzapr) null));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzbbh mo28627a(Object obj) throws Exception {
        zzbgz a = this.f19903d.mo28655a(zzyd.m25644a(this.f19900a));
        zzbbq c = zzbbq.m20559c(a);
        m22298a(a);
        a.mo25697k().mo28129a((zzbik) new C7285ah(c));
        a.loadUrl((String) zzyt.m25670e().mo27163a(zzacu.f17787D1));
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzbbh mo28629a(String str, String str2, Object obj) throws Exception {
        zzbgz a = this.f19903d.mo28655a(zzyd.m25644a(this.f19900a));
        zzbbq c = zzbbq.m20559c(a);
        m22298a(a);
        if (this.f19901b.f21166c != null) {
            a.mo25658a(zzbin.m21126h());
        } else {
            a.mo25658a(zzbin.m21125g());
        }
        a.mo25697k().mo28128a((zzbij) new C7322bh(this, a, c));
        a.mo25664a(str, str2, (String) null);
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo28632a(zzbgz zzbgz, zzbbq zzbbq, boolean z) {
        if (!(this.f19901b.f21165b == null || zzbgz.mo25685e() == null)) {
            zzbgz.mo25685e().mo28162b(this.f19901b.f21165b);
        }
        zzbbq.mo27902a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzbbh mo28631a(JSONObject jSONObject, zzbgz zzbgz) throws Exception {
        zzbbq c = zzbbq.m20559c(zzbgz);
        if (this.f19901b.f21166c != null) {
            zzbgz.mo25658a(zzbin.m21126h());
        } else {
            zzbgz.mo25658a(zzbin.m21125g());
        }
        zzbgz.mo25697k().mo28128a((zzbij) new C7359ch(this, zzbgz, c));
        zzbgz.mo25675b("google.afma.nativeAds.renderVideo", jSONObject);
        return c;
    }
}
