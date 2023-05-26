package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

@zzard
public class zzaqb {

    /* renamed from: a */
    private final zzbgz f18304a;

    /* renamed from: b */
    private final String f18305b;

    public zzaqb(zzbgz zzbgz) {
        this(zzbgz, "");
    }

    /* renamed from: a */
    public final void mo27556a(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.f18305b);
            if (this.f18304a != null) {
                this.f18304a.mo25666a("onError", put);
            }
        } catch (JSONException e) {
            zzbad.m20520b("Error occurred while dispatching error event.", e);
        }
    }

    /* renamed from: b */
    public final void mo27558b(String str) {
        try {
            this.f18304a.mo25666a("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            zzbad.m20520b("Error occured while dispatching ready Event.", e);
        }
    }

    /* renamed from: c */
    public final void mo27559c(String str) {
        try {
            this.f18304a.mo25666a("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            zzbad.m20520b("Error occured while dispatching state change.", e);
        }
    }

    public zzaqb(zzbgz zzbgz, String str) {
        this.f18304a = zzbgz;
        this.f18305b = str;
    }

    /* renamed from: b */
    public final void mo27557b(int i, int i2, int i3, int i4) {
        try {
            this.f18304a.mo25666a("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            zzbad.m20520b("Error occured while dispatching default position.", e);
        }
    }

    /* renamed from: a */
    public final void mo27554a(int i, int i2, int i3, int i4) {
        try {
            this.f18304a.mo25666a("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            zzbad.m20520b("Error occured while dispatching size change.", e);
        }
    }

    /* renamed from: a */
    public final void mo27555a(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.f18304a.mo25666a("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", (double) f).put("rotation", i5));
        } catch (JSONException e) {
            zzbad.m20520b("Error occured while obtaining screen information.", e);
        }
    }
}
