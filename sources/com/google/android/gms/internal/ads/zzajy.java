package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.Predicate;
import java.util.Map;
import org.json.JSONObject;

@zzard
public final class zzajy implements zzajq, zzajw {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final zzbgz f18149f;

    public zzajy(Context context, zzbai zzbai, zzdh zzdh, zza zza) throws zzbhj {
        zzk.zzlh();
        zzbgz a = zzbhf.m20985a(context, zzbin.m21124f(), "", false, false, zzdh, zzbai, (zzadi) null, (zzj) null, (zza) null, zzwj.m25465a());
        this.f18149f = a;
        a.getView().setWillNotDraw(true);
    }

    /* renamed from: a */
    private static void m19327a(Runnable runnable) {
        zzyt.m25666a();
        if (zzazt.m20478b()) {
            runnable.run();
        } else {
            zzaxi.f18651h.post(runnable);
        }
    }

    /* renamed from: J */
    public final zzalg mo27336J() {
        return new zzalh(this);
    }

    /* renamed from: a */
    public final void mo26359a(String str, String str2) {
        zzajr.m19304a((zzajq) this, str, str2);
    }

    /* renamed from: a */
    public final void mo25665a(String str, Map map) {
        zzajr.m19305a((zzajq) this, str, map);
    }

    /* renamed from: a */
    public final void mo25666a(String str, JSONObject jSONObject) {
        zzajr.m19307b(this, str, jSONObject);
    }

    /* renamed from: b */
    public final void mo27357b(String str, zzaho<? super zzalf> zzaho) {
        this.f18149f.mo25661a(str, (Predicate<zzaho<? super zzbgz>>) new C7343c1(zzaho));
    }

    /* renamed from: b */
    public final void mo25675b(String str, JSONObject jSONObject) {
        zzajr.m19306a((zzajq) this, str, jSONObject);
    }

    /* renamed from: c */
    public final void mo27338c(String str) {
        m19327a((Runnable) new C7491g1(this, str));
    }

    public final void destroy() {
        this.f18149f.destroy();
    }

    /* renamed from: e */
    public final void mo27340e(String str) {
        m19327a((Runnable) new C7417e1(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str})));
    }

    /* renamed from: f */
    public final void mo27341f(String str) {
        m19327a((Runnable) new C7454f1(this, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo27356b(String str) {
        this.f18149f.mo25660a(str);
    }

    /* renamed from: f */
    public final boolean mo27342f() {
        return this.f18149f.mo25689f();
    }

    /* renamed from: a */
    public final void mo25660a(String str) {
        m19327a((Runnable) new C7306b1(this, str));
    }

    /* renamed from: a */
    public final void mo27355a(String str, zzaho<? super zzalf> zzaho) {
        this.f18149f.mo25662a(str, (zzaho<? super zzbgz>) new C7527h1(this, zzaho));
    }

    /* renamed from: a */
    public final void mo27337a(zzajx zzajx) {
        zzbii k = this.f18149f.mo25697k();
        zzajx.getClass();
        k.mo28129a(C7380d1.m16755a(zzajx));
    }
}
