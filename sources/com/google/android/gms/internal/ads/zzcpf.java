package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcpf {

    /* renamed from: a */
    private final zzclc f20728a;

    /* renamed from: b */
    private final Map<String, zzcpk> f20729b = new ConcurrentHashMap();

    /* renamed from: c */
    private final Map<String, List<zzcpk>> f20730c = new ConcurrentHashMap();

    /* renamed from: d */
    private final Executor f20731d;

    public zzcpf(zzclc zzclc, Executor executor, Context context) {
        this.f20728a = zzclc;
        this.f20731d = executor;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final synchronized void mo28758e() {
        JSONArray optJSONArray;
        synchronized (this) {
            JSONObject f = zzk.zzlk().mo27743i().mo27787j().mo27730f();
            if (f != null) {
                try {
                    JSONArray optJSONArray2 = f.optJSONArray("ad_unit_id_settings");
                    if (optJSONArray2 != null) {
                        for (int i = 0; i < optJSONArray2.length(); i++) {
                            JSONObject jSONObject = optJSONArray2.getJSONObject(i);
                            String optString = jSONObject.optString("ad_unit_id", "");
                            String optString2 = jSONObject.optString("format", "");
                            ArrayList arrayList = new ArrayList();
                            JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                            if (!(optJSONObject == null || (optJSONArray = optJSONObject.optJSONArray("ad_networks")) == null)) {
                                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                                    ArrayList arrayList2 = new ArrayList();
                                    if (jSONObject2 != null) {
                                        JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                                        Bundle bundle = new Bundle();
                                        if (optJSONObject2 != null) {
                                            Iterator<String> keys = optJSONObject2.keys();
                                            while (keys.hasNext()) {
                                                String next = keys.next();
                                                bundle.putString(next, optJSONObject2.optString(next, ""));
                                            }
                                        }
                                        JSONArray optJSONArray3 = jSONObject2.optJSONArray("rtb_adapters");
                                        if (optJSONArray3 != null) {
                                            ArrayList arrayList3 = new ArrayList();
                                            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                                                String optString3 = optJSONArray3.optString(i3, "");
                                                if (!TextUtils.isEmpty(optString3)) {
                                                    arrayList3.add(optString3);
                                                }
                                            }
                                            int size = arrayList3.size();
                                            int i4 = 0;
                                            while (i4 < size) {
                                                Object obj = arrayList3.get(i4);
                                                i4++;
                                                String str = (String) obj;
                                                mo28754a(str);
                                                zzcpk zzcpk = this.f20729b.get(str);
                                                if (zzcpk != null) {
                                                    arrayList2.add(new zzcpk(str, optString2, bundle, zzcpk.f20737c));
                                                }
                                            }
                                        }
                                    }
                                    arrayList.addAll(arrayList2);
                                }
                            }
                            if (!TextUtils.isEmpty(optString)) {
                                this.f20730c.put(optString, arrayList);
                            }
                        }
                    }
                } catch (JSONException e) {
                    zzawz.m20168e("Malformed config loading JSON.", e);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo28753a() {
        zzk.zzlk().mo27743i().mo27768a((Runnable) new C8033um(this));
        this.f20731d.execute(new C8070vm(this));
    }

    /* renamed from: b */
    public final Map<String, List<zzcpk>> mo28755b() {
        return this.f20730c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo28757d() {
        this.f20731d.execute(new C8107wm(this));
    }

    /* renamed from: a */
    public final void mo28754a(String str) {
        if (!TextUtils.isEmpty(str) && !this.f20729b.containsKey(str)) {
            try {
                this.f20729b.put(str, new zzcpk(str, "", new Bundle(), this.f20728a.mo28732a(str)));
            } catch (RemoteException unused) {
            }
        }
    }
}
