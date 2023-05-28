package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.root.execution.Command;

public final class zzcau {

    /* renamed from: a */
    private final Context f19872a;

    /* renamed from: b */
    private final zzcan f19873b;

    /* renamed from: c */
    private final zzdh f19874c;

    /* renamed from: d */
    private final zzbai f19875d;

    /* renamed from: e */
    private final zza f19876e;

    /* renamed from: f */
    private final zzwj f19877f;

    /* renamed from: g */
    private final Executor f19878g;

    /* renamed from: h */
    private final zzady f19879h;

    /* renamed from: i */
    private final zzcbi f19880i;

    /* renamed from: j */
    private final ScheduledExecutorService f19881j;

    public zzcau(Context context, zzcan zzcan, zzdh zzdh, zzbai zzbai, zza zza, zzwj zzwj, Executor executor, zzcxv zzcxv, zzcbi zzcbi, ScheduledExecutorService scheduledExecutorService) {
        this.f19872a = context;
        this.f19873b = zzcan;
        this.f19874c = zzdh;
        this.f19875d = zzbai;
        this.f19876e = zza;
        this.f19877f = zzwj;
        this.f19878g = executor;
        this.f19879h = zzcxv.f21172i;
        this.f19880i = zzcbi;
        this.f19881j = scheduledExecutorService;
    }

    /* renamed from: b */
    public static List<zzabj> m22287b(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return Collections.emptyList();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            zzabj d = m22289d(optJSONArray.optJSONObject(i));
            if (d != null) {
                arrayList.add(d);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static zzabj m22288c(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return m22289d(optJSONObject);
    }

    /* renamed from: d */
    private static zzabj m22289d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new zzabj(optString, optString2);
    }

    /* renamed from: a */
    public final zzbbh<zzadw> mo28623a(JSONObject jSONObject, String str) {
        return m22285a(jSONObject.optJSONObject(str), this.f19879h.f18043g);
    }

    /* renamed from: a */
    private final zzbbh<List<zzadw>> m22284a(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzbar.m20539a(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(m22285a(jSONArray.optJSONObject(i), z));
        }
        return zzbar.m20543a(zzbar.m20545a(arrayList), C7768ng.f16384a, this.f19878g);
    }

    /* renamed from: c */
    public final zzbbh<zzadt> mo28625c(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return zzbar.m20539a(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return m22286a(optJSONObject.optBoolean("require"), zzbar.m20543a(m22284a(optJSONArray, false, true), new C7842pg(this, optJSONObject), this.f19878g), (Object) null);
    }

    /* renamed from: d */
    private static Integer m22290d(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final zzbbh<List<zzadw>> mo28624b(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        zzady zzady = this.f19879h;
        return m22284a(optJSONArray, zzady.f18043g, zzady.f18045i);
    }

    /* renamed from: a */
    private final zzbbh<zzadw> m22285a(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return zzbar.m20539a(null);
        }
        String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            return zzbar.m20539a(null);
        }
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        int optInt = jSONObject.optInt("width", -1);
        int optInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return zzbar.m20539a(new zzadw((Drawable) null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return m22286a(jSONObject.optBoolean("require"), zzbar.m20543a(this.f19873b.mo28618a(optString, optDouble, optBoolean), new C7805og(optString, optDouble, optInt, optInt2), this.f19878g), (Object) null);
    }

    /* renamed from: a */
    public final zzbbh<zzbgz> mo28622a(JSONObject jSONObject) {
        JSONObject a = zzazc.m20431a(jSONObject, "html_containers", "instream");
        if (a == null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("video");
            if (optJSONObject == null) {
                return zzbar.m20539a(null);
            }
            if (TextUtils.isEmpty(optJSONObject.optString("vast_xml"))) {
                zzbad.m20523d("Required field 'vast_xml' is missing");
                return zzbar.m20539a(null);
            }
            return m22283a(zzbar.m20541a(this.f19880i.mo28630a(optJSONObject), (long) ((Integer) zzyt.m25670e().mo27163a(zzacu.f17791E1)).intValue(), TimeUnit.SECONDS, this.f19881j), (Object) null);
        }
        return m22286a(a.optBoolean("require"), this.f19880i.mo28628a(a.optString("base_url"), a.optString("html")), (Object) null);
    }

    /* renamed from: a */
    private static <T> zzbbh<T> m22283a(zzbbh<T> zzbbh, T t) {
        return zzbar.m20544a(zzbbh, Exception.class, new C7916rg((Object) null), zzbbm.f18749b);
    }

    /* renamed from: a */
    private static <T> zzbbh<T> m22286a(boolean z, zzbbh<T> zzbbh, T t) {
        if (z) {
            return zzbar.m20542a(zzbbh, new C7990tg(zzbbh), zzbbm.f18749b);
        }
        return m22283a(zzbbh, (Object) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzbbh mo28621a(String str, Object obj) throws Exception {
        zzk.zzlh();
        zzbgz a = zzbhf.m20985a(this.f19872a, zzbin.m21124f(), "native-omid", false, false, this.f19874c, this.f19875d, (zzadi) null, (zzj) null, this.f19876e, this.f19877f);
        zzbbq c = zzbbq.m20559c(a);
        a.mo25697k().mo28128a((zzbij) new C8027ug(c));
        a.loadData(str, "text/html", "UTF-8");
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzadt mo28620a(JSONObject jSONObject, List list) {
        Integer num = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString(Command.CommandHandler.TEXT);
        Integer d = m22290d(jSONObject, "bg_color");
        Integer d2 = m22290d(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        int optInt3 = jSONObject.optInt("presentation_ms", 4000);
        if (optInt > 0) {
            num = Integer.valueOf(optInt);
        }
        return new zzadt(optString, list, d, d2, num, optInt3 + optInt2, this.f19879h.f18046j, optBoolean);
    }
}
