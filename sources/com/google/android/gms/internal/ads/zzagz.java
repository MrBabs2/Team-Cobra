package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;

@zzard
public final class zzagz {

    /* renamed from: a */
    public static final zzaho<zzbgz> f18094a = C8195z.f17500a;

    /* renamed from: b */
    public static final zzaho<zzbgz> f18095b = C7268a0.f14309a;

    /* renamed from: c */
    public static final zzaho<zzbgz> f18096c = C7305b0.f14525a;

    /* renamed from: d */
    public static final zzaho<zzbgz> f18097d = new C7416e0();

    /* renamed from: e */
    public static final zzaho<zzbgz> f18098e = new C7453f0();

    /* renamed from: f */
    public static final zzaho<zzbgz> f18099f = C7342c0.f14688a;

    /* renamed from: g */
    public static final zzaho<Object> f18100g = new C7490g0();

    /* renamed from: h */
    public static final zzaho<zzbgz> f18101h = new C7526h0();

    /* renamed from: i */
    public static final zzaho<zzbgz> f18102i = C7379d0.f14782a;

    /* renamed from: j */
    public static final zzaho<zzbgz> f18103j = new C7563i0();

    /* renamed from: k */
    public static final zzaho<zzbgz> f18104k = new C7604j0();

    /* renamed from: l */
    public static final zzaho<zzbdf> f18105l = new zzbfo();

    /* renamed from: m */
    public static final zzaho<zzbdf> f18106m = new zzbfp();

    /* renamed from: n */
    public static final zzaho<zzbgz> f18107n = new zzagy();

    /* renamed from: o */
    public static final zzahu f18108o = new zzahu();

    /* renamed from: p */
    public static final zzaho<zzbgz> f18109p = new C7641k0();

    /* renamed from: q */
    public static final zzaho<zzbgz> f18110q = new C7678l0();

    /* renamed from: r */
    public static final zzaho<zzbgz> f18111r = new C7715m0();

    /* renamed from: a */
    static final /* synthetic */ void m19234a(zzbif zzbif, Map map) {
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            zzdh d = zzbif.mo25682d();
            if (d != null) {
                d.mo29015a().zza(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            zzbad.m20523d("Could not parse touch parameters from gmsg.");
        }
    }

    /* renamed from: b */
    static final /* synthetic */ void m19235b(zzbhx zzbhx, Map map) {
        PackageManager packageManager = zzbhx.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String optString = jSONObject2.optString(DeepLinkIntentReceiver.DeepLinksKeys.f3452ID);
                        String optString2 = jSONObject2.optString("u");
                        String optString3 = jSONObject2.optString("i");
                        String optString4 = jSONObject2.optString("m");
                        String optString5 = jSONObject2.optString("p");
                        String optString6 = jSONObject2.optString("c");
                        jSONObject2.optString("f");
                        jSONObject2.optString("e");
                        String optString7 = jSONObject2.optString("intent_url");
                        Intent intent = null;
                        if (!TextUtils.isEmpty(optString7)) {
                            try {
                                intent = Intent.parseUri(optString7, 0);
                            } catch (URISyntaxException e) {
                                URISyntaxException uRISyntaxException = e;
                                String valueOf = String.valueOf(optString7);
                                zzbad.m20520b(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), uRISyntaxException);
                            }
                        }
                        boolean z = true;
                        if (intent == null) {
                            intent = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                intent.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                intent.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                intent.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                intent.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split("/", 2);
                                if (split.length == 2) {
                                    intent.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                        }
                        if (packageManager.resolveActivity(intent, 65536) == null) {
                            z = false;
                        }
                        try {
                            jSONObject.put(optString, z);
                        } catch (JSONException e2) {
                            zzbad.m20520b("Error constructing openable urls response.", e2);
                        }
                    } catch (JSONException e3) {
                        zzbad.m20520b("Error parsing the intent data.", e3);
                    }
                }
                ((zzaji) zzbhx).mo25666a("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((zzaji) zzbhx).mo25666a("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((zzaji) zzbhx).mo25666a("openableIntents", new JSONObject());
        }
    }

    /* renamed from: c */
    static final /* synthetic */ void m19236c(zzbhx zzbhx, Map map) {
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            zzbad.m20523d("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = zzbhx.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                z = false;
            }
            hashMap.put(str2, Boolean.valueOf(z));
        }
        ((zzaji) zzbhx).mo25665a("openableURLs", (Map<String, ?>) hashMap);
    }

    /* renamed from: a */
    static final /* synthetic */ void m19233a(zzbhx zzbhx, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            zzbad.m20523d("URL missing from httpTrack GMSG.");
        } else {
            new zzazi(zzbhx.getContext(), ((zzbig) zzbhx).mo25672b().f18742f, str).zzvi();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m19232a(zzaji zzaji, Map map) {
        String str = (String) map.get("u");
        if (str == null) {
            zzbad.m20523d("URL missing from click GMSG.");
            return;
        }
        Uri parse = Uri.parse(str);
        try {
            zzdh d = ((zzbif) zzaji).mo25682d();
            if (d != null && d.mo29017a(parse)) {
                parse = d.mo29014a(parse, ((zzbhx) zzaji).getContext(), ((zzbih) zzaji).getView(), ((zzbhx) zzaji).mo25650a());
            }
        } catch (zzdi unused) {
            String valueOf = String.valueOf(str);
            zzbad.m20523d(valueOf.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf) : new String("Unable to append parameter to URL: "));
        }
        zzbhx zzbhx = (zzbhx) zzaji;
        new zzazi(zzbhx.getContext(), ((zzbig) zzaji).mo25672b().f18742f, zzavx.m20099a(parse, zzbhx.getContext())).zzvi();
    }
}
