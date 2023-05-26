package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
public final class zzbgc implements zzaho<zzbdf> {
    /* renamed from: a */
    private static Integer m20840a(Map<String, String> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = map.get(str);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39 + String.valueOf(str2).length());
            sb.append("Precache invalid numeric parameter '");
            sb.append(str);
            sb.append("': ");
            sb.append(str2);
            zzbad.m20523d(sb.toString());
            return null;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25559a(Object obj, Map map) {
        zzbft zzbft;
        zzbdf zzbdf = (zzbdf) obj;
        if (zzbad.m20518a(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String valueOf = String.valueOf(jSONObject);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
            sb.append("Precache GMSG: ");
            sb.append(valueOf);
            zzbad.m20516a(sb.toString());
        }
        zzk.zzmc();
        if (!map.containsKey("abort")) {
            String str = (String) map.get("src");
            if (str != null) {
                String[] strArr = {str};
                String str2 = (String) map.get("demuxed");
                if (str2 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(str2);
                        String[] strArr2 = new String[jSONArray.length()];
                        for (int i = 0; i < jSONArray.length(); i++) {
                            strArr2[i] = jSONArray.getString(i);
                        }
                        strArr = strArr2;
                    } catch (JSONException unused) {
                        String valueOf2 = String.valueOf(str2);
                        zzbad.m20523d(valueOf2.length() != 0 ? "Malformed demuxed URL list for precache: ".concat(valueOf2) : new String("Malformed demuxed URL list for precache: "));
                        strArr = null;
                    }
                }
                if (strArr == null) {
                    strArr = new String[]{str};
                }
                if (zzbfs.m20814b(zzbdf) != null) {
                    zzbad.m20523d("Precache task is already running.");
                    return;
                } else if (zzbdf.mo25678c() == null) {
                    zzbad.m20523d("Precache requires a dependency provider.");
                    return;
                } else {
                    zzbde zzbde = new zzbde((String) map.get("flags"));
                    Integer a = m20840a((Map<String, String>) map, "player");
                    if (a == null) {
                        a = 0;
                    }
                    zzbft = zzbdf.mo25678c().zzbqr.mo28066a(zzbdf, a.intValue(), (String) null, zzbde);
                    new zzbfq(zzbdf, zzbft, str, strArr).zzvi();
                }
            } else {
                zzbfq b = zzbfs.m20814b(zzbdf);
                if (b != null) {
                    zzbft = b.f18925b;
                } else {
                    zzbad.m20523d("Precache must specify a source.");
                    return;
                }
            }
            Integer a2 = m20840a((Map<String, String>) map, "minBufferMs");
            if (a2 != null) {
                zzbft.mo28081b(a2.intValue());
            }
            Integer a3 = m20840a((Map<String, String>) map, "maxBufferMs");
            if (a3 != null) {
                zzbft.mo28082c(a3.intValue());
            }
            Integer a4 = m20840a((Map<String, String>) map, "bufferForPlaybackMs");
            if (a4 != null) {
                zzbft.mo28083d(a4.intValue());
            }
            Integer a5 = m20840a((Map<String, String>) map, "bufferForPlaybackAfterRebufferMs");
            if (a5 != null) {
                zzbft.mo28084e(a5.intValue());
            }
        } else if (!zzbfs.m20813a(zzbdf)) {
            zzbad.m20523d("Precache abort but no precache task running.");
        }
    }
}
