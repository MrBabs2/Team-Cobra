package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzk;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;

@zzard
public final class zzahu implements zzaho<Object> {

    /* renamed from: a */
    private final Object f18122a = new Object();

    /* renamed from: b */
    private final Map<String, zzahw> f18123b = new HashMap();

    /* renamed from: a */
    public final void mo27305a(String str, zzahw zzahw) {
        synchronized (this.f18122a) {
            this.f18123b.put(str, zzahw);
        }
    }

    /* renamed from: a */
    public final void mo25559a(Object obj, Map<String, String> map) {
        String str;
        String str2 = map.get(DeepLinkIntentReceiver.DeepLinksKeys.f3452ID);
        String str3 = map.get("fail");
        String str4 = map.get("fail_reason");
        String str5 = map.get("fail_stack");
        String str6 = map.get("result");
        if (TextUtils.isEmpty(str5)) {
            str4 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str5)) {
            str = "";
        } else {
            String valueOf = String.valueOf(str5);
            str = valueOf.length() != 0 ? "\n".concat(valueOf) : new String("\n");
        }
        synchronized (this.f18122a) {
            zzahw remove = this.f18123b.remove(str2);
            if (remove == null) {
                String valueOf2 = String.valueOf(str2);
                zzbad.m20523d(valueOf2.length() != 0 ? "Received result for unexpected method invocation: ".concat(valueOf2) : new String("Received result for unexpected method invocation: "));
            } else if (!TextUtils.isEmpty(str3)) {
                String valueOf3 = String.valueOf(str4);
                String valueOf4 = String.valueOf(str);
                remove.onFailure(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3));
            } else if (str6 == null) {
                remove.mo26069a((JSONObject) null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str6);
                    if (zzawz.m20166a()) {
                        String valueOf5 = String.valueOf(jSONObject.toString(2));
                        zzawz.m20167e(valueOf5.length() != 0 ? "Result GMSG: ".concat(valueOf5) : new String("Result GMSG: "));
                    }
                    remove.mo26069a(jSONObject);
                } catch (JSONException e) {
                    remove.onFailure(e.getMessage());
                }
            }
        }
    }

    /* renamed from: a */
    public final <EngineT extends zzakg> zzbbh<JSONObject> mo27304a(EngineT enginet, String str, JSONObject jSONObject) {
        zzbbr zzbbr = new zzbbr();
        zzk.zzlg();
        String b = zzaxi.m20283b();
        mo27305a(b, (zzahw) new C7752n0(this, zzbbr));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(DeepLinkIntentReceiver.DeepLinksKeys.f3452ID, b);
            jSONObject2.put("args", jSONObject);
            enginet.mo25675b(str, jSONObject2);
        } catch (Exception e) {
            zzbbr.mo27903a(e);
        }
        return zzbbr;
    }
}
