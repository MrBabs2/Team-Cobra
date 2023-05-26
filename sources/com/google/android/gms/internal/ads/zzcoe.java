package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzbsm;
import java.util.Iterator;

public final class zzcoe<AdT, AdapterT, ListenerT extends zzbsm> implements zzcjv<AdT> {

    /* renamed from: a */
    private final zzcjz<AdapterT, ListenerT> f20682a;

    /* renamed from: b */
    private final zzcka<AdT, AdapterT, ListenerT> f20683b;

    /* renamed from: c */
    private final zzczt f20684c;

    /* renamed from: d */
    private final zzbbl f20685d;

    public zzcoe(zzczt zzczt, zzbbl zzbbl, zzcjz<AdapterT, ListenerT> zzcjz, zzcka<AdT, AdapterT, ListenerT> zzcka) {
        this.f20684c = zzczt;
        this.f20685d = zzbbl;
        this.f20683b = zzcka;
        this.f20682a = zzcjz;
    }

    /* renamed from: a */
    public final zzbbh<AdT> mo28716a(zzcxu zzcxu, zzcxm zzcxm) {
        zzcjy<AdapterT, ListenerT> zzcjy;
        Class<AdMobAdapter> cls = AdMobAdapter.class;
        Iterator<String> it = zzcxm.f21133q.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzcjy = null;
                break;
            }
            try {
                zzcjy = this.f20682a.mo28720a(it.next(), zzcxm.f21135s);
                break;
            } catch (Throwable unused) {
            }
        }
        if (zzcjy == null) {
            return zzbar.m20538a((Throwable) new zzcmk("unable to instantiate mediation adapter class"));
        }
        zzbbr zzbbr = new zzbbr();
        zzcjy.f20304c.mo28419a(new C7663km(this, zzbbr, zzcjy));
        if (zzcxm.f21106E) {
            Bundle bundle = zzcxu.f21162a.f21156a.f21167d.f22993r;
            Bundle bundle2 = bundle.getBundle(cls.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(cls.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        return this.f20684c.mo28849a(zzczs.ADAPTER_LOAD_AD_SYN).mo28854a((zzczd) new C7585im(this, zzcxu, zzcxm, zzcjy), this.f20685d).mo28863a(zzczs.ADAPTER_LOAD_AD_ACK).mo28859a(zzbbr).mo28863a(zzczs.ADAPTER_WRAP_ADAPTER).mo28860a(new C7626jm(this, zzcxu, zzcxm, zzcjy)).mo28856a();
    }

    /* renamed from: b */
    public final boolean mo28717b(zzcxu zzcxu, zzcxm zzcxm) {
        return !zzcxm.f21133q.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo28746a(zzcxu zzcxu, zzcxm zzcxm, zzcjy zzcjy, Void voidR) throws Exception {
        return this.f20683b.mo28721a(zzcxu, zzcxm, zzcjy);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo28747a(zzcxu zzcxu, zzcxm zzcxm, zzcjy zzcjy) throws Exception {
        this.f20683b.mo28722b(zzcxu, zzcxm, zzcjy);
    }
}
