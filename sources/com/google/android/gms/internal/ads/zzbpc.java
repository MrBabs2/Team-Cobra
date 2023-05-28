package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONException;

public class zzbpc {

    /* renamed from: a */
    protected zzcxu f19367a;

    /* renamed from: b */
    protected zzcxm f19368b;

    /* renamed from: c */
    protected zzbry f19369c;

    /* renamed from: d */
    protected zzbso f19370d;

    /* renamed from: e */
    protected String f19371e;

    /* renamed from: a */
    public void mo28384a() {
        this.f19369c.mo28412d((Context) null);
    }

    /* renamed from: b */
    public final String mo28385b() {
        return this.f19371e;
    }

    /* renamed from: c */
    public void mo26812c() {
        this.f19370d.onAdLoaded();
    }

    /* renamed from: d */
    public final zzbry mo28386d() {
        return this.f19369c;
    }

    /* renamed from: e */
    public final String mo28387e() {
        String a = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(this.f19371e) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(this.f19371e) ? m21744a(this.f19368b) : null;
        return a == null ? this.f19371e : a;
    }

    /* renamed from: a */
    private static String m21744a(zzcxm zzcxm) {
        try {
            return zzcxm.f21135s.getString("class_name");
        } catch (JSONException unused) {
            return null;
        }
    }
}
