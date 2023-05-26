package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;

/* renamed from: com.google.android.gms.internal.ads.v3 */
final class C8051v3 extends FilterInputStream {

    /* renamed from: f */
    private final HttpURLConnection f17000f;

    C8051v3(HttpURLConnection httpURLConnection) {
        super(zzat.m19943a(httpURLConnection));
        this.f17000f = httpURLConnection;
    }

    public final void close() throws IOException {
        super.close();
        this.f17000f.disconnect();
    }
}
