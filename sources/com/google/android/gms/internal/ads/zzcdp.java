package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.zzb;
import java.util.Map;
import java.util.concurrent.Executor;

public final class zzcdp {

    /* renamed from: a */
    private final zzbri f20017a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final zzbse f20018b;

    /* renamed from: c */
    private final zzbss f20019c;

    /* renamed from: d */
    private final zzbsv f20020d;

    /* renamed from: e */
    private final zzbtp f20021e;

    /* renamed from: f */
    private final Executor f20022f;

    /* renamed from: g */
    private final zzbva f20023g;

    /* renamed from: h */
    private final zzbmn f20024h;

    /* renamed from: i */
    private final zzb f20025i;

    /* renamed from: j */
    private final zzbry f20026j;

    /* renamed from: k */
    private final zzavb f20027k;

    /* renamed from: l */
    private final zzdh f20028l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final zzbtl f20029m;

    public zzcdp(zzbri zzbri, zzbse zzbse, zzbss zzbss, zzbsv zzbsv, zzbtp zzbtp, Executor executor, zzbva zzbva, zzbmn zzbmn, zzb zzb, zzbry zzbry, zzavb zzavb, zzdh zzdh, zzbtl zzbtl) {
        this.f20017a = zzbri;
        this.f20018b = zzbse;
        this.f20019c = zzbss;
        this.f20020d = zzbsv;
        this.f20021e = zzbtp;
        this.f20022f = executor;
        this.f20023g = zzbva;
        this.f20024h = zzbmn;
        this.f20025i = zzb;
        this.f20026j = zzbry;
        this.f20027k = zzavb;
        this.f20028l = zzdh;
        this.f20029m = zzbtl;
    }

    /* renamed from: a */
    public final void mo28659a(zzbgz zzbgz, boolean z) {
        zzdc a;
        zzbgz.mo25697k().mo28130a(new C8028uh(this), this.f20019c, this.f20020d, new C8065vh(this), new C8102wh(this), z, (zzahp) null, this.f20025i, new C7397di(this), this.f20027k);
        zzbgz.setOnTouchListener(new C8139xh(this));
        zzbgz.setOnClickListener(new C8176yh(this));
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17943n1)).booleanValue() && (a = this.f20028l.mo29015a()) != null) {
            a.zzb(zzbgz.getView());
        }
        this.f20023g.mo28428a(zzbgz, this.f20022f);
        this.f20023g.mo28428a(new C8213zh(zzbgz), this.f20022f);
        this.f20023g.mo28454a(zzbgz.getView());
        zzbgz.mo25662a("/trackActiveViewUnit", (zzaho<? super zzbgz>) new C7286ai(this, zzbgz));
        this.f20024h.mo28272a((Object) zzbgz);
        this.f20026j.mo28410a(new C7323bi(zzbgz), this.f20022f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo28662b() {
        this.f20017a.onAdClicked();
    }

    /* renamed from: a */
    public static zzbbh<?> m22419a(zzbgz zzbgz, String str, String str2) {
        zzbbr zzbbr = new zzbbr();
        zzbgz.mo25697k().mo28128a((zzbij) new C7360ci(zzbbr));
        zzbgz.mo25664a(str, str2, (String) null);
        return zzbbr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo28658a(zzbgz zzbgz, zzbgz zzbgz2, Map map) {
        this.f20024h.mo28271a(zzbgz);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo28657a(View view) {
        this.f20025i.recordClick();
        zzavb zzavb = this.f20027k;
        if (zzavb != null) {
            zzavb.mo27674b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ boolean mo28661a(View view, MotionEvent motionEvent) {
        this.f20025i.recordClick();
        zzavb zzavb = this.f20027k;
        if (zzavb == null) {
            return false;
        }
        zzavb.mo27674b();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo28656a() {
        this.f20018b.mo28418y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo28660a(String str, String str2) {
        this.f20021e.onAppEvent(str, str2);
    }
}
