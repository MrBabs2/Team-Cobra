package com.airbnb.lottie.p137t;

import android.content.Context;
import com.airbnb.lottie.C5647c;
import com.airbnb.lottie.C5648d;
import com.airbnb.lottie.C5649e;
import com.airbnb.lottie.C5671k;
import com.airbnb.lottie.C5672l;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;
import p050l.p075h.p083k.C5004d;

/* renamed from: com.airbnb.lottie.t.c */
/* compiled from: NetworkFetcher */
public class C5785c {

    /* renamed from: a */
    private final Context f10465a;

    /* renamed from: b */
    private final String f10466b;

    /* renamed from: c */
    private final C5784b f10467c;

    /* renamed from: com.airbnb.lottie.t.c$a */
    /* compiled from: NetworkFetcher */
    class C5786a implements Callable<C5671k<C5648d>> {
        C5786a() {
        }

        public C5671k<C5648d> call() throws Exception {
            return C5785c.this.mo19694a();
        }
    }

    private C5785c(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        this.f10465a = applicationContext;
        this.f10466b = str;
        this.f10467c = new C5784b(applicationContext, str);
    }

    /* renamed from: a */
    public static C5672l<C5648d> m11252a(Context context, String str) {
        return new C5785c(context, str).m11253b();
    }

    /* renamed from: b */
    private C5672l<C5648d> m11253b() {
        return new C5672l<>(new C5786a());
    }

    /* renamed from: c */
    private C5648d m11254c() {
        C5671k<C5648d> kVar;
        C5004d<C5783a, InputStream> a = this.f10467c.mo19692a();
        if (a == null) {
            return null;
        }
        C5783a aVar = (C5783a) a.f8862a;
        InputStream inputStream = (InputStream) a.f8863b;
        if (aVar == C5783a.Zip) {
            kVar = C5649e.m10776a(new ZipInputStream(inputStream), this.f10466b);
        } else {
            kVar = C5649e.m10774a(inputStream, this.f10466b);
        }
        if (kVar.mo19475b() != null) {
            return kVar.mo19475b();
        }
        return null;
    }

    /* renamed from: d */
    private C5671k<C5648d> m11255d() {
        try {
            return m11256e();
        } catch (IOException e) {
            return new C5671k<>((Throwable) e);
        }
    }

    /* renamed from: e */
    private C5671k m11256e() throws IOException {
        C5783a aVar;
        C5671k<C5648d> kVar;
        C5647c.m10754b("Fetching " + this.f10466b);
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f10466b).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        if (httpURLConnection.getErrorStream() == null && httpURLConnection.getResponseCode() == 200) {
            String contentType = httpURLConnection.getContentType();
            char c = 65535;
            int hashCode = contentType.hashCode();
            boolean z = true;
            if (hashCode != -1248325150) {
                if (hashCode == -43840953 && contentType.equals("application/json")) {
                    c = 1;
                }
            } else if (contentType.equals("application/zip")) {
                c = 0;
            }
            if (c != 0) {
                C5647c.m10754b("Received json response.");
                aVar = C5783a.Json;
                kVar = C5649e.m10774a((InputStream) new FileInputStream(new File(this.f10467c.mo19691a(httpURLConnection.getInputStream(), aVar).getAbsolutePath())), this.f10466b);
            } else {
                C5647c.m10754b("Handling zip response.");
                aVar = C5783a.Zip;
                kVar = C5649e.m10776a(new ZipInputStream(new FileInputStream(this.f10467c.mo19691a(httpURLConnection.getInputStream(), aVar))), this.f10466b);
            }
            if (kVar.mo19475b() != null) {
                this.f10467c.mo19693a(aVar);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Completed fetch from network. Success: ");
            if (kVar.mo19475b() == null) {
                z = false;
            }
            sb.append(z);
            C5647c.m10754b(sb.toString());
            return kVar;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb2.append(readLine);
                sb2.append(10);
            } else {
                return new C5671k((Throwable) new IllegalArgumentException("Unable to fetch " + this.f10466b + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + sb2));
            }
        }
    }

    /* renamed from: a */
    public C5671k<C5648d> mo19694a() {
        C5648d c = m11254c();
        if (c != null) {
            return new C5671k<>(c);
        }
        C5647c.m10754b("Animation for " + this.f10466b + " not found in cache. Fetching from network.");
        return m11255d();
    }
}
