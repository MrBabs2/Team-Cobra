package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
public final class zzbfo implements zzaho<zzbdf> {

    /* renamed from: a */
    private boolean f18923a;

    /* renamed from: a */
    private static int m20809a(Context context, Map<String, String> map, String str, int i) {
        String str2 = map.get(str);
        if (str2 == null) {
            return i;
        }
        try {
            zzyt.m25666a();
            return zzazt.m20475b(context, Integer.parseInt(str2));
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(str2).length());
            sb.append("Could not parse ");
            sb.append(str);
            sb.append(" in a video GMSG: ");
            sb.append(str2);
            zzbad.m20523d(sb.toString());
            return i;
        }
    }

    /* renamed from: a */
    private static void m20810a(zzbcq zzbcq, Map<String, String> map) {
        String str = map.get("minBufferMs");
        String str2 = map.get("maxBufferMs");
        String str3 = map.get("bufferForPlaybackMs");
        String str4 = map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzbcq.mo27945b(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                zzbad.m20523d(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", new Object[]{str, str2}));
                return;
            }
        }
        if (str2 != null) {
            zzbcq.mo27947c(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzbcq.mo27948d(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzbcq.mo27949e(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzbcq.mo27950f(Integer.parseInt(str5));
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25559a(Object obj, Map map) {
        int i;
        zzbdf zzbdf = (zzbdf) obj;
        String str = (String) map.get("action");
        if (str == null) {
            zzbad.m20523d("Action missing from video GMSG.");
            return;
        }
        if (zzbad.m20518a(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String jSONObject2 = jSONObject.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13 + String.valueOf(jSONObject2).length());
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(jSONObject2);
            zzbad.m20516a(sb.toString());
        }
        if ("background".equals(str)) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                zzbad.m20523d("Color parameter missing from color video GMSG.");
                return;
            }
            try {
                zzbdf.setBackgroundColor(Color.parseColor(str2));
            } catch (IllegalArgumentException unused) {
                zzbad.m20523d("Invalid color parameter in video GMSG.");
            }
        } else {
            if ("decoderProps".equals(str)) {
                String str3 = (String) map.get("mimeTypes");
                if (str3 == null) {
                    zzbad.m20523d("No MIME types specified for decoder properties inspection.");
                    zzbcq.m20609a(zzbdf, "missingMimeTypes");
                } else if (Build.VERSION.SDK_INT < 16) {
                    zzbad.m20523d("Video decoder properties available on API versions >= 16.");
                    zzbcq.m20609a(zzbdf, "deficientApiVersion");
                } else {
                    HashMap hashMap = new HashMap();
                    for (String str4 : str3.split(",")) {
                        hashMap.put(str4, zzazr.m20456a(str4.trim()));
                    }
                    zzbcq.m20610a(zzbdf, (Map<String, List<Map<String, Object>>>) hashMap);
                }
            } else {
                zzbcw E = zzbdf.mo25643E();
                if (E == null) {
                    zzbad.m20523d("Could not get underlay container for a video GMSG.");
                    return;
                }
                boolean equals = "new".equals(str);
                boolean equals2 = "position".equals(str);
                if (equals || equals2) {
                    Context context = zzbdf.getContext();
                    int a = m20809a(context, map, "x", 0);
                    int a2 = m20809a(context, map, "y", 0);
                    int a3 = m20809a(context, map, "w", -1);
                    int a4 = m20809a(context, map, "h", -1);
                    int min = Math.min(a3, zzbdf.mo25727y() - a);
                    int min2 = Math.min(a4, zzbdf.mo25642D() - a2);
                    try {
                        i = Integer.parseInt((String) map.get("player"));
                    } catch (NumberFormatException unused2) {
                        i = 0;
                    }
                    boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
                    if (!equals || E.mo27964c() != null) {
                        E.mo27961a(a, a2, min, min2);
                        return;
                    }
                    E.mo27962a(a, a2, min, min2, i, parseBoolean, new zzbde((String) map.get("flags")));
                    zzbcq c = E.mo27964c();
                    if (c != null) {
                        m20810a(c, (Map<String, String>) map);
                        return;
                    }
                    return;
                }
                zzbhq e = zzbdf.mo25685e();
                if (e != null) {
                    if ("timeupdate".equals(str)) {
                        String str5 = (String) map.get("currentTime");
                        if (str5 == null) {
                            zzbad.m20523d("currentTime parameter missing from timeupdate video GMSG.");
                            return;
                        }
                        try {
                            e.mo28161b(Float.parseFloat(str5));
                            return;
                        } catch (NumberFormatException unused3) {
                            String valueOf = String.valueOf(str5);
                            zzbad.m20523d(valueOf.length() != 0 ? "Could not parse currentTime parameter from timeupdate video GMSG: ".concat(valueOf) : new String("Could not parse currentTime parameter from timeupdate video GMSG: "));
                            return;
                        }
                    } else if ("skip".equals(str)) {
                        e.mo28164p1();
                        return;
                    }
                }
                zzbcq c2 = E.mo27964c();
                if (c2 == null) {
                    zzbcq.m20608a(zzbdf);
                } else if ("click".equals(str)) {
                    Context context2 = zzbdf.getContext();
                    int a5 = m20809a(context2, map, "x", 0);
                    int a6 = m20809a(context2, map, "y", 0);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float) a5, (float) a6, 0);
                    c2.mo27941a(obtain);
                    obtain.recycle();
                } else if ("currentTime".equals(str)) {
                    String str6 = (String) map.get("time");
                    if (str6 == null) {
                        zzbad.m20523d("Time parameter missing from currentTime video GMSG.");
                        return;
                    }
                    try {
                        c2.mo27939a((int) (Float.parseFloat(str6) * 1000.0f));
                    } catch (NumberFormatException unused4) {
                        String valueOf2 = String.valueOf(str6);
                        zzbad.m20523d(valueOf2.length() != 0 ? "Could not parse time parameter from currentTime video GMSG: ".concat(valueOf2) : new String("Could not parse time parameter from currentTime video GMSG: "));
                    }
                } else if ("hide".equals(str)) {
                    c2.setVisibility(4);
                } else if ("load".equals(str)) {
                    c2.mo27953k();
                } else if ("loadControl".equals(str)) {
                    m20810a(c2, (Map<String, String>) map);
                } else if ("muted".equals(str)) {
                    if (Boolean.parseBoolean((String) map.get("muted"))) {
                        c2.mo27954l();
                    } else {
                        c2.mo27955m();
                    }
                } else if ("pause".equals(str)) {
                    c2.mo27946c();
                } else if ("play".equals(str)) {
                    c2.mo27952j();
                } else if ("show".equals(str)) {
                    c2.setVisibility(0);
                } else if ("src".equals(str)) {
                    String str7 = (String) map.get("src");
                    String[] strArr = {str7};
                    String str8 = (String) map.get("demuxed");
                    if (str8 != null) {
                        try {
                            JSONArray jSONArray = new JSONArray(str8);
                            String[] strArr2 = new String[jSONArray.length()];
                            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                strArr2[i2] = jSONArray.getString(i2);
                            }
                            strArr = strArr2;
                        } catch (JSONException unused5) {
                            String valueOf3 = String.valueOf(str8);
                            zzbad.m20523d(valueOf3.length() != 0 ? "Malformed demuxed URL list for playback: ".concat(valueOf3) : new String("Malformed demuxed URL list for playback: "));
                            strArr = new String[]{str7};
                        }
                    }
                    c2.mo27942a(str7, strArr);
                } else if ("touchMove".equals(str)) {
                    Context context3 = zzbdf.getContext();
                    c2.mo27938a((float) m20809a(context3, map, "dx", 0), (float) m20809a(context3, map, "dy", 0));
                    if (!this.f18923a) {
                        zzbdf.mo25717s();
                        this.f18923a = true;
                    }
                } else if ("volume".equals(str)) {
                    String str9 = (String) map.get("volume");
                    if (str9 == null) {
                        zzbad.m20523d("Level parameter missing from volume video GMSG.");
                        return;
                    }
                    try {
                        c2.setVolume(Float.parseFloat(str9));
                    } catch (NumberFormatException unused6) {
                        String valueOf4 = String.valueOf(str9);
                        zzbad.m20523d(valueOf4.length() != 0 ? "Could not parse volume parameter from volume video GMSG: ".concat(valueOf4) : new String("Could not parse volume parameter from volume video GMSG: "));
                    }
                } else if ("watermark".equals(str)) {
                    c2.mo27956n();
                } else {
                    String valueOf5 = String.valueOf(str);
                    zzbad.m20523d(valueOf5.length() != 0 ? "Unknown video action: ".concat(valueOf5) : new String("Unknown video action: "));
                }
            }
        }
    }
}
