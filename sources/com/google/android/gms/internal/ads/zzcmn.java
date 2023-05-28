package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class zzcmn<AdT> implements zzcjv<AdT> {
    /* renamed from: a */
    public final zzbbh<AdT> mo28716a(zzcxu zzcxu, zzcxm zzcxm) {
        zzcxm zzcxm2 = zzcxm;
        String optString = zzcxm2.f21135s.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        zzcxv zzcxv = zzcxu.f21162a.f21156a;
        zzcxx zzcxx = new zzcxx();
        zzcxx.mo28822a(zzcxv.f21167d);
        zzcxx.mo28823a(zzcxv.f21168e);
        zzcxx.mo28824a(zzcxv.f21164a);
        zzcxx.mo28825a(zzcxv.f21169f);
        zzcxx.mo28819a(zzcxv.f21165b);
        zzcxx.mo28826a(zzcxv.f21170g);
        zzcxx.mo28830b(zzcxv.f21171h);
        zzcxx.mo28820a(zzcxv.f21172i);
        zzcxx.mo28829b(zzcxv.f21173j);
        zzcxx.mo28818a(zzcxv.f21176m);
        zzcxx.mo28833c(zzcxv.f21174k);
        zzcxx.mo28825a(optString);
        Bundle a = m22698a(zzcxv.f21167d.f22993r);
        Bundle a2 = m22698a(a.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        a2.putInt("gw", 1);
        String optString2 = zzcxm2.f21135s.optString("mad_hac", (String) null);
        if (optString2 != null) {
            a2.putString("mad_hac", optString2);
        }
        String optString3 = zzcxm2.f21135s.optString("adJson", (String) null);
        if (optString3 != null) {
            a2.putString("_ad", optString3);
        }
        a2.putBoolean("_noRefresh", true);
        Iterator<String> keys = zzcxm2.f21102A.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = zzcxm2.f21102A.optString(next, (String) null);
            if (next != null) {
                a2.putString(next, optString4);
            }
        }
        a.putBundle("com.google.ads.mediation.admob.AdMobAdapter", a2);
        zzxz zzxz = zzcxv.f21167d;
        zzxz zzxz2 = r5;
        zzxz zzxz3 = new zzxz(zzxz.f22981f, zzxz.f22982g, a2, zzxz.f22984i, zzxz.f22985j, zzxz.f22986k, zzxz.f22987l, zzxz.f22988m, zzxz.f22989n, zzxz.f22990o, zzxz.f22991p, zzxz.f22992q, a, zzxz.f22994s, zzxz.f22995t, zzxz.f22996u, zzxz.f22997v, zzxz.f22998w, zzxz.f22999x, zzxz.f23000y, zzxz.f23001z);
        zzcxx.mo28822a(zzxz2);
        zzcxv c = zzcxx.mo28832c();
        Bundle bundle = new Bundle();
        zzcxu zzcxu2 = zzcxu;
        zzcxo zzcxo = zzcxu2.f21163b.f21158b;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList(zzcxo.f21146a));
        bundle2.putInt("refresh_interval", zzcxo.f21148c);
        bundle2.putString("gws_query_id", zzcxo.f21147b);
        bundle.putBundle("parent_common_config", bundle2);
        String str = zzcxu2.f21162a.f21156a.f21169f;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        zzcxm zzcxm3 = zzcxm;
        bundle3.putString("allocation_id", zzcxm3.f21136t);
        bundle3.putStringArrayList("click_urls", new ArrayList(zzcxm3.f21119c));
        bundle3.putStringArrayList("imp_urls", new ArrayList(zzcxm3.f21120d));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList(zzcxm3.f21130n));
        bundle3.putStringArrayList("fill_urls", new ArrayList(zzcxm3.f21129m));
        bundle3.putStringArrayList("video_start_urls", new ArrayList(zzcxm3.f21123g));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList(zzcxm3.f21124h));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList(zzcxm3.f21125i));
        bundle3.putString("transaction_id", zzcxm3.f21126j);
        bundle3.putString("valid_from_timestamp", zzcxm3.f21127k);
        bundle3.putBoolean("is_closable_area_disabled", zzcxm3.f21108G);
        if (zzcxm3.f21128l != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzcxm3.f21128l.f18519g);
            bundle4.putString("rb_type", zzcxm3.f21128l.f18518f);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return mo28740a(c, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract zzbbh<AdT> mo28740a(zzcxv zzcxv, Bundle bundle);

    /* renamed from: b */
    public final boolean mo28717b(zzcxu zzcxu, zzcxm zzcxm) {
        return !TextUtils.isEmpty(zzcxm.f21135s.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    /* renamed from: a */
    private static Bundle m22698a(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }
}
