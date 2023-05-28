package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;
import java.util.Map;
import org.json.JSONObject;

@zzard
public final class zzajj extends zzaju<zzalf> implements zzajq, zzajw {

    /* renamed from: h */
    private final zzbjb f18145h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public zzajx f18146i;

    public zzajj(Context context, zzbai zzbai) throws zzbhj {
        try {
            zzbjb zzbjb = new zzbjb(context, new C8196z0(this));
            this.f18145h = zzbjb;
            zzbjb.setWillNotDraw(true);
            this.f18145h.addJavascriptInterface(new C8159y0(this), "GoogleJsInterface");
            zzk.zzlg().mo27798a(context, zzbai.f18742f, this.f18145h.getSettings());
            super.mo27349a(this);
        } catch (Throwable th) {
            throw new zzbhj("Init failed.", th);
        }
    }

    /* renamed from: J */
    public final zzalg mo27336J() {
        return new zzalh(this);
    }

    /* renamed from: a */
    public final void mo27337a(zzajx zzajx) {
        this.f18146i = zzajx;
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
    public final void mo25675b(String str, JSONObject jSONObject) {
        zzajr.m19306a((zzajq) this, str, jSONObject);
    }

    /* renamed from: c */
    public final void mo27338c(String str) {
        zzbbm.f18748a.execute(new C8048v0(this, str));
    }

    public final void destroy() {
        this.f18145h.destroy();
    }

    /* renamed from: e */
    public final void mo27340e(String str) {
        mo27341f(String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head></html>", new Object[]{str}));
    }

    /* renamed from: f */
    public final void mo27341f(String str) {
        zzbbm.f18748a.execute(new C8011u0(this, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo27343g(String str) {
        this.f18145h.mo25660a(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo27344h(String str) {
        this.f18145h.loadUrl(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo27345i(String str) {
        this.f18145h.loadData(str, "text/html", "UTF-8");
    }

    /* renamed from: a */
    public final void mo25660a(String str) {
        zzbbm.f18748a.execute(new C8085w0(this, str));
    }

    /* renamed from: f */
    public final boolean mo27342f() {
        return this.f18145h.mo28215f();
    }
}
