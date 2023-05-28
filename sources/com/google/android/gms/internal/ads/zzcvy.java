package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;

public final class zzcvy implements zzcva<zzcvx> {

    /* renamed from: a */
    private final zzasc f21047a;

    /* renamed from: b */
    private final Context f21048b;

    /* renamed from: c */
    private final String f21049c;

    /* renamed from: d */
    private final zzbbl f21050d;

    public zzcvy(zzasc zzasc, Context context, String str, zzbbl zzbbl) {
        this.f21047a = zzasc;
        this.f21048b = context;
        this.f21049c = str;
        this.f21050d = zzbbl;
    }

    /* renamed from: a */
    public final zzbbh<zzcvx> mo25785a() {
        return this.f21050d.mo27892a(new C7629jp(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ zzcvx mo28804b() throws Exception {
        JSONObject jSONObject = new JSONObject();
        zzasc zzasc = this.f21047a;
        if (zzasc != null) {
            zzasc.mo27604a(this.f21048b, this.f21049c, jSONObject);
        }
        return new zzcvx(jSONObject);
    }
}
