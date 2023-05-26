package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbmy implements zzue {

    /* renamed from: f */
    private zzbgz f19218f;

    /* renamed from: g */
    private final Executor f19219g;

    /* renamed from: h */
    private final zzbml f19220h;

    /* renamed from: i */
    private final Clock f19221i;

    /* renamed from: j */
    private boolean f19222j = false;

    /* renamed from: k */
    private boolean f19223k = false;

    /* renamed from: l */
    private zzbmp f19224l = new zzbmp();

    public zzbmy(Executor executor, zzbml zzbml, Clock clock) {
        this.f19219g = executor;
        this.f19220h = zzbml;
        this.f19221i = clock;
    }

    /* renamed from: o */
    private final void m21380o() {
        try {
            JSONObject a = this.f19220h.mo25813a(this.f19224l);
            if (this.f19218f != null) {
                this.f19219g.execute(new C8097wc(this, a));
            }
        } catch (JSONException e) {
            zzawz.m20168e("Failed to call video active view js", e);
        }
    }

    /* renamed from: a */
    public final void mo25659a(zzud zzud) {
        this.f19224l.f19188a = this.f19223k ? false : zzud.f22775j;
        this.f19224l.f19190c = this.f19221i.mo25499c();
        this.f19224l.f19192e = zzud;
        if (this.f19222j) {
            m21380o();
        }
    }

    /* renamed from: f */
    public final void mo28277f(boolean z) {
        this.f19223k = z;
    }

    /* renamed from: j */
    public final void mo28278j() {
        this.f19222j = false;
    }

    /* renamed from: n */
    public final void mo28279n() {
        this.f19222j = true;
        m21380o();
    }

    /* renamed from: a */
    public final void mo28275a(zzbgz zzbgz) {
        this.f19218f = zzbgz;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo28276a(JSONObject jSONObject) {
        this.f19218f.mo25675b("AFMA_updateActiveView", jSONObject);
    }
}
