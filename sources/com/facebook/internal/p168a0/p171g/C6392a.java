package com.facebook.internal.p168a0.p171g;

import com.facebook.internal.p168a0.C6385d;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.a0.g.a */
/* compiled from: ErrorReportData */
public final class C6392a {

    /* renamed from: a */
    private String f11758a;

    /* renamed from: b */
    private String f11759b;

    /* renamed from: c */
    private Long f11760c;

    public C6392a(String str) {
        this.f11760c = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f11759b = str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("error_log_");
        stringBuffer.append(this.f11760c);
        stringBuffer.append(".json");
        this.f11758a = stringBuffer.toString();
    }

    /* renamed from: a */
    public int mo20949a(C6392a aVar) {
        Long l = this.f11760c;
        if (l == null) {
            return -1;
        }
        Long l2 = aVar.f11760c;
        if (l2 == null) {
            return 1;
        }
        return l2.compareTo(l);
    }

    /* renamed from: b */
    public JSONObject mo20951b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f11760c != null) {
                jSONObject.put("timestamp", this.f11760c);
            }
            jSONObject.put("error_message", this.f11759b);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public boolean mo20952c() {
        return (this.f11759b == null || this.f11760c == null) ? false : true;
    }

    /* renamed from: d */
    public void mo20953d() {
        if (mo20952c()) {
            C6385d.m13247a(this.f11758a, toString());
        }
    }

    public String toString() {
        JSONObject b = mo20951b();
        if (b == null) {
            return null;
        }
        return b.toString();
    }

    /* renamed from: a */
    public void mo20950a() {
        C6385d.m13249a(this.f11758a);
    }

    public C6392a(File file) {
        String name = file.getName();
        this.f11758a = name;
        JSONObject a = C6385d.m13246a(name, true);
        if (a != null) {
            this.f11760c = Long.valueOf(a.optLong("timestamp", 0));
            this.f11759b = a.optString("error_message", (String) null);
        }
    }
}
