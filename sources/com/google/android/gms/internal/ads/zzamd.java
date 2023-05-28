package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;

@zzard
public final class zzamd<I, O> implements zzbal<I, O> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzall<O> f18191a;

    /* renamed from: b */
    private final zzalm<I> f18192b;

    /* renamed from: c */
    private final String f18193c;

    /* renamed from: d */
    private final zzbbh<zzalf> f18194d;

    zzamd(zzbbh<zzalf> zzbbh, String str, zzalm<I> zzalm, zzall<O> zzall) {
        this.f18194d = zzbbh;
        this.f18193c = str;
        this.f18192b = zzalm;
        this.f18191a = zzall;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzbbh mo27378a(Object obj, zzalf zzalf) throws Exception {
        zzbbr zzbbr = new zzbbr();
        zzk.zzlg();
        String b = zzaxi.m20283b();
        zzagz.f18108o.mo27305a(b, (zzahw) new C7828p2(this, zzbbr));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(DeepLinkIntentReceiver.DeepLinksKeys.f3452ID, b);
        jSONObject.put("args", this.f18192b.mo25813a(obj));
        zzalf.mo25675b(this.f18193c, jSONObject);
        return zzbbr;
    }

    public final zzbbh<O> zzf(I i) throws Exception {
        return zzbar.m20542a(this.f18194d, new C7791o2(this, i), zzbbm.f18749b);
    }
}
