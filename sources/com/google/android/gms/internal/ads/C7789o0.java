package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectTimeoutException;

/* renamed from: com.google.android.gms.internal.ads.o0 */
final class C7789o0 extends zzaj {

    /* renamed from: a */
    private final zzas f16410a;

    C7789o0(zzas zzas) {
        this.f16410a = zzas;
    }

    /* renamed from: b */
    public final zzar mo26332b(zzr<?> zzr, Map<String, String> map) throws IOException, zza {
        try {
            HttpResponse a = this.f16410a.mo27328a(zzr, map);
            int statusCode = a.getStatusLine().getStatusCode();
            Header[] allHeaders = a.getAllHeaders();
            ArrayList arrayList = new ArrayList(allHeaders.length);
            for (Header header : allHeaders) {
                arrayList.add(new zzl(header.getName(), header.getValue()));
            }
            if (a.getEntity() == null) {
                return new zzar(statusCode, arrayList);
            }
            long contentLength = a.getEntity().getContentLength();
            if (((long) ((int) contentLength)) == contentLength) {
                return new zzar(statusCode, arrayList, (int) a.getEntity().getContentLength(), a.getEntity().getContent());
            }
            StringBuilder sb = new StringBuilder(40);
            sb.append("Response too large: ");
            sb.append(contentLength);
            throw new IOException(sb.toString());
        } catch (ConnectTimeoutException e) {
            throw new SocketTimeoutException(e.getMessage());
        }
    }
}
