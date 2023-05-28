package com.bumptech.glide.load.p148m;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.C5878g;
import com.bumptech.glide.load.C5901a;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.p148m.C6034d;
import com.bumptech.glide.load.p150n.C6087g;
import com.bumptech.glide.p166r.C6306c;
import com.bumptech.glide.p166r.C6311f;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.m.j */
/* compiled from: HttpUrlFetcher */
public class C6044j implements C6034d<InputStream> {

    /* renamed from: l */
    static final C6046b f11119l = new C6045a();

    /* renamed from: f */
    private final C6087g f11120f;

    /* renamed from: g */
    private final int f11121g;

    /* renamed from: h */
    private final C6046b f11122h;

    /* renamed from: i */
    private HttpURLConnection f11123i;

    /* renamed from: j */
    private InputStream f11124j;

    /* renamed from: k */
    private volatile boolean f11125k;

    /* renamed from: com.bumptech.glide.load.m.j$a */
    /* compiled from: HttpUrlFetcher */
    private static class C6045a implements C6046b {
        C6045a() {
        }

        /* renamed from: a */
        public HttpURLConnection mo20351a(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* renamed from: com.bumptech.glide.load.m.j$b */
    /* compiled from: HttpUrlFetcher */
    interface C6046b {
        /* renamed from: a */
        HttpURLConnection mo20351a(URL url) throws IOException;
    }

    public C6044j(C6087g gVar, int i) {
        this(gVar, i, f11119l);
    }

    /* renamed from: b */
    private static boolean m12119b(int i) {
        return i / 100 == 3;
    }

    /* renamed from: a */
    public void mo20327a(C5878g gVar, C6034d.C6035a<? super InputStream> aVar) {
        StringBuilder sb;
        long a = C6311f.m12965a();
        try {
            aVar.mo20141a(m12117a(this.f11120f.mo20387c(), 0, (URL) null, this.f11120f.mo20386b()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(C6311f.m12964a(a));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (IOException e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e);
            }
            aVar.mo20140a((Exception) e);
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + C6311f.m12964a(a));
            }
            throw th;
        }
    }

    /* renamed from: c */
    public C5901a mo20330c() {
        return C5901a.REMOTE;
    }

    public void cancel() {
        this.f11125k = true;
    }

    C6044j(C6087g gVar, int i, C6046b bVar) {
        this.f11120f = gVar;
        this.f11121g = i;
        this.f11122h = bVar;
    }

    /* renamed from: b */
    public void mo20329b() {
        InputStream inputStream = this.f11124j;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f11123i;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f11123i = null;
    }

    /* renamed from: a */
    private InputStream m12117a(URL url, int i, URL url2, Map<String, String> map) throws IOException {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            this.f11123i = this.f11122h.mo20351a(url);
            for (Map.Entry next : map.entrySet()) {
                this.f11123i.addRequestProperty((String) next.getKey(), (String) next.getValue());
            }
            this.f11123i.setConnectTimeout(this.f11121g);
            this.f11123i.setReadTimeout(this.f11121g);
            this.f11123i.setUseCaches(false);
            this.f11123i.setDoInput(true);
            this.f11123i.setInstanceFollowRedirects(false);
            this.f11123i.connect();
            this.f11124j = this.f11123i.getInputStream();
            if (this.f11125k) {
                return null;
            }
            int responseCode = this.f11123i.getResponseCode();
            if (m12118a(responseCode)) {
                return m12116a(this.f11123i);
            }
            if (m12119b(responseCode)) {
                String headerField = this.f11123i.getHeaderField("Location");
                if (!TextUtils.isEmpty(headerField)) {
                    URL url3 = new URL(url, headerField);
                    mo20329b();
                    return m12117a(url3, i + 1, url, map);
                }
                throw new HttpException("Received empty or null redirect url");
            } else if (responseCode == -1) {
                throw new HttpException(responseCode);
            } else {
                throw new HttpException(this.f11123i.getResponseMessage(), responseCode);
            }
        } else {
            throw new HttpException("Too many (> 5) redirects!");
        }
    }

    /* renamed from: a */
    private static boolean m12118a(int i) {
        return i / 100 == 2;
    }

    /* renamed from: a */
    private InputStream m12116a(HttpURLConnection httpURLConnection) throws IOException {
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            this.f11124j = C6306c.m12957a(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
            }
            this.f11124j = httpURLConnection.getInputStream();
        }
        return this.f11124j;
    }

    /* renamed from: a */
    public Class<InputStream> mo20323a() {
        return InputStream.class;
    }
}
