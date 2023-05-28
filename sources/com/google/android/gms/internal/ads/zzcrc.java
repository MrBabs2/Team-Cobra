package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.ads.internal.zzk;
import java.io.IOException;
import org.json.JSONException;

public final class zzcrc {

    /* renamed from: a */
    public final String f20833a;

    /* renamed from: b */
    public String f20834b;

    public zzcrc(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName = nextName == null ? "" : nextName;
            char c = 65535;
            if (nextName.hashCode() == -995427962 && nextName.equals("params")) {
                c = 0;
            }
            if (c != 0) {
                jsonReader.skipValue();
            } else {
                str = jsonReader.nextString();
            }
        }
        this.f20833a = str;
        jsonReader.endObject();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final zzcrc mo28781a(Bundle bundle) {
        try {
            this.f20834b = zzk.zzlg().mo27795a(bundle).toString();
        } catch (JSONException unused) {
            this.f20834b = "{}";
        }
        return this;
    }
}
