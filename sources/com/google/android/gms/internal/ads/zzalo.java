package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
public final class zzalo {

    /* renamed from: a */
    private static final Charset f18179a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final zzaln<JSONObject> f18180b = new C7381d2();

    /* renamed from: c */
    public static final zzall<InputStream> f18181c = C7344c2.f14693a;

    /* renamed from: a */
    static final /* synthetic */ InputStream m19386a(JSONObject jSONObject) throws JSONException {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(f18179a));
    }
}
