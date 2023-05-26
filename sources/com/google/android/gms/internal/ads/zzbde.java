package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

@zzard
public final class zzbde {

    /* renamed from: a */
    public final boolean f18827a;

    /* renamed from: b */
    public final int f18828b;

    /* renamed from: c */
    public final int f18829c;

    /* renamed from: d */
    public final int f18830d;

    /* renamed from: e */
    public final String f18831e;

    /* renamed from: f */
    public final int f18832f;

    /* renamed from: g */
    public final int f18833g;

    /* renamed from: h */
    public final int f18834h;

    /* renamed from: i */
    public final int f18835i;

    /* renamed from: j */
    public final boolean f18836j;

    public zzbde(String str) {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f18827a = m20664a(jSONObject, "aggressive_media_codec_release", zzacu.f17789E);
        this.f18828b = m20666b(jSONObject, "byte_buffer_precache_limit", zzacu.f17945o);
        this.f18829c = m20666b(jSONObject, "exo_cache_buffer_size", zzacu.f17961s);
        this.f18830d = m20666b(jSONObject, "exo_connect_timeout_millis", zzacu.f17927k);
        this.f18831e = m20667c(jSONObject, "exo_player_version", zzacu.f17922j);
        this.f18832f = m20666b(jSONObject, "exo_read_timeout_millis", zzacu.f17932l);
        this.f18833g = m20666b(jSONObject, "load_check_interval_bytes", zzacu.f17937m);
        this.f18834h = m20666b(jSONObject, "player_precache_limit", zzacu.f17941n);
        this.f18835i = m20666b(jSONObject, "socket_receive_buffer_size", zzacu.f17949p);
        this.f18836j = m20664a(jSONObject, "use_cache_data_source", zzacu.f17859V1);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.zzacj<java.lang.Boolean>, com.google.android.gms.internal.ads.zzacj] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m20664a(org.json.JSONObject r1, java.lang.String r2, com.google.android.gms.internal.ads.zzacj<java.lang.Boolean> r3) {
        /*
            com.google.android.gms.internal.ads.zzacr r0 = com.google.android.gms.internal.ads.zzyt.m25670e()
            java.lang.Object r3 = r0.mo27163a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            boolean r1 = m20665a((org.json.JSONObject) r1, (java.lang.String) r2, (boolean) r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbde.m20664a(org.json.JSONObject, java.lang.String, com.google.android.gms.internal.ads.zzacj):boolean");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.zzacj<java.lang.Integer>, com.google.android.gms.internal.ads.zzacj] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m20666b(org.json.JSONObject r0, java.lang.String r1, com.google.android.gms.internal.ads.zzacj<java.lang.Integer> r2) {
        /*
            if (r0 == 0) goto L_0x0007
            int r0 = r0.getInt(r1)     // Catch:{ JSONException -> 0x0007 }
            return r0
        L_0x0007:
            com.google.android.gms.internal.ads.zzacr r0 = com.google.android.gms.internal.ads.zzyt.m25670e()
            java.lang.Object r0 = r0.mo27163a(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbde.m20666b(org.json.JSONObject, java.lang.String, com.google.android.gms.internal.ads.zzacj):int");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.zzacj<java.lang.String>, com.google.android.gms.internal.ads.zzacj] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m20667c(org.json.JSONObject r0, java.lang.String r1, com.google.android.gms.internal.ads.zzacj<java.lang.String> r2) {
        /*
            if (r0 == 0) goto L_0x0007
            java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x0007 }
            return r0
        L_0x0007:
            com.google.android.gms.internal.ads.zzacr r0 = com.google.android.gms.internal.ads.zzyt.m25670e()
            java.lang.Object r0 = r0.mo27163a(r2)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbde.m20667c(org.json.JSONObject, java.lang.String, com.google.android.gms.internal.ads.zzacj):java.lang.String");
    }

    /* renamed from: a */
    private static boolean m20665a(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return z;
    }
}
