package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

public abstract class zzaj implements zzas {
    @Deprecated
    /* renamed from: a */
    public final HttpResponse mo27328a(zzr<?> zzr, Map<String, String> map) throws IOException, zza {
        zzar b = mo26332b(zzr, map);
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion("HTTP", 1, 1), b.mo27575c(), ""));
        ArrayList arrayList = new ArrayList();
        for (zzl next : b.mo27576d()) {
            arrayList.add(new BasicHeader(next.mo29461a(), next.mo29462b()));
        }
        basicHttpResponse.setHeaders((Header[]) arrayList.toArray(new Header[arrayList.size()]));
        InputStream a = b.mo27573a();
        if (a != null) {
            BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
            basicHttpEntity.setContent(a);
            basicHttpEntity.setContentLength((long) b.mo27574b());
            basicHttpResponse.setEntity(basicHttpEntity);
        }
        return basicHttpResponse;
    }

    /* renamed from: b */
    public abstract zzar mo26332b(zzr<?> zzr, Map<String, String> map) throws IOException, zza;
}
