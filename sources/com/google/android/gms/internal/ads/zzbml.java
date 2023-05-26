package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzk;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbml implements zzalm<zzbmp> {

    /* renamed from: a */
    private final Context f19173a;

    /* renamed from: b */
    private final zzty f19174b;

    /* renamed from: c */
    private final PowerManager f19175c;

    public zzbml(Context context, zzty zzty) {
        this.f19173a = context;
        this.f19174b = zzty;
        this.f19175c = (PowerManager) context.getSystemService("power");
    }

    /* renamed from: a */
    public final JSONObject mo25813a(zzbmp zzbmp) throws JSONException {
        JSONObject jSONObject;
        boolean z;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzud zzud = zzbmp.f19192e;
        if (zzud == null) {
            jSONObject = new JSONObject();
        } else if (this.f19174b.mo29773c() != null) {
            boolean z2 = zzud.f22766a;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject put = jSONObject3.put("afmaVersion", this.f19174b.mo29772b()).put("activeViewJSON", this.f19174b.mo29773c()).put("timestamp", zzbmp.f19190c).put("adFormat", this.f19174b.mo29771a()).put("hashCode", this.f19174b.mo29774d()).put("isMraid", false).put("isStopped", false).put("isPaused", zzbmp.f19189b).put("isNative", this.f19174b.mo29775e());
            if (Build.VERSION.SDK_INT >= 20) {
                z = this.f19175c.isInteractive();
            } else {
                z = this.f19175c.isScreenOn();
            }
            put.put("isScreenOn", z).put("appMuted", zzk.zzll().mo27831b()).put("appVolume", (double) zzk.zzll().mo27828a()).put("deviceVolume", (double) zzaya.m20374a(this.f19173a.getApplicationContext()));
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.f19173a.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", zzud.f22767b).put("isAttachedToWindow", z2).put("viewBox", new JSONObject().put("top", zzud.f22768c.top).put("bottom", zzud.f22768c.bottom).put("left", zzud.f22768c.left).put("right", zzud.f22768c.right)).put("adBox", new JSONObject().put("top", zzud.f22769d.top).put("bottom", zzud.f22769d.bottom).put("left", zzud.f22769d.left).put("right", zzud.f22769d.right)).put("globalVisibleBox", new JSONObject().put("top", zzud.f22770e.top).put("bottom", zzud.f22770e.bottom).put("left", zzud.f22770e.left).put("right", zzud.f22770e.right)).put("globalVisibleBoxVisible", zzud.f22771f).put("localVisibleBox", new JSONObject().put("top", zzud.f22772g.top).put("bottom", zzud.f22772g.bottom).put("left", zzud.f22772g.left).put("right", zzud.f22772g.right)).put("localVisibleBoxVisible", zzud.f22773h).put("hitBox", new JSONObject().put("top", zzud.f22774i.top).put("bottom", zzud.f22774i.bottom).put("left", zzud.f22774i.left).put("right", zzud.f22774i.right)).put("screenDensity", (double) this.f19173a.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", zzbmp.f19188a);
            if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17870Y0)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzud.f22776k;
                if (list != null) {
                    for (Rect next : list) {
                        jSONArray2.put(new JSONObject().put("top", next.top).put("bottom", next.bottom).put("left", next.left).put("right", next.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzbmp.f19191d)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        } else {
            throw new JSONException("Active view Info cannot be null.");
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
