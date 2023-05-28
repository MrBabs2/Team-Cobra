package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

public final class zzcfn {

    /* renamed from: a */
    private final Clock f20117a;

    public zzcfn(Clock clock) {
        this.f20117a = clock;
    }

    /* renamed from: a */
    public final void mo28676a(List<Object> list, String str, String str2, Object... objArr) {
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17850T0)).booleanValue()) {
            long b = this.f20117a.mo25498b();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(b);
                jsonWriter.name("source").value(str);
                jsonWriter.name("event").value(str2);
                jsonWriter.name("components").beginArray();
                for (Object obj : list) {
                    jsonWriter.value(obj.toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    Object obj2 = objArr[i];
                    jsonWriter.value(obj2 != null ? obj2.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e) {
                zzbad.m20520b("unable to log", e);
            }
            String valueOf = String.valueOf(stringWriter.toString());
            zzbad.m20521c(valueOf.length() != 0 ? "AD-DBG ".concat(valueOf) : new String("AD-DBG "));
        }
    }
}
