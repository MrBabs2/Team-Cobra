package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;

@zzard
public final class zzalu<I, O> implements zzalj<I, O> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzall<O> f18185a;

    /* renamed from: b */
    private final zzalm<I> f18186b;

    /* renamed from: c */
    private final zzakh f18187c;

    /* renamed from: d */
    private final String f18188d;

    zzalu(zzakh zzakh, String str, zzalm<I> zzalm, zzall<O> zzall) {
        this.f18187c = zzakh;
        this.f18188d = str;
        this.f18186b = zzalm;
        this.f18185a = zzall;
    }

    /* renamed from: a */
    public final zzbbh<O> mo27370a(I i) {
        zzbbr zzbbr = new zzbbr();
        zzakw b = this.f18187c.mo27362b((zzdh) null);
        b.mo27910a(new C7492g2(this, b, i, zzbbr), new C7528h2(this, zzbbr, b));
        return zzbbr;
    }

    public final zzbbh<O> zzf(I i) throws Exception {
        return mo27370a(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m19390a(zzakw zzakw, zzalf zzalf, I i, zzbbr<O> zzbbr) {
        try {
            zzk.zzlg();
            String b = zzaxi.m20283b();
            zzagz.f18108o.mo27305a(b, (zzahw) new C7565i2(this, zzakw, zzbbr));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(DeepLinkIntentReceiver.DeepLinksKeys.f3452ID, b);
            jSONObject.put("args", this.f18186b.mo25813a(i));
            zzalf.mo25675b(this.f18188d, jSONObject);
        } catch (Exception e) {
            zzbbr.mo27903a(e);
            zzbad.m20520b("Unable to invokeJavascript", e);
            zzakw.mo27363c();
        } catch (Throwable th) {
            zzakw.mo27363c();
            throw th;
        }
    }
}
