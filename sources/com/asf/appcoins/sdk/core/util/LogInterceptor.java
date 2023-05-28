package com.asf.appcoins.sdk.core.util;

import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p413s.C12905f;
import p413s.C12910h;

public class LogInterceptor implements Interceptor {
    private static final String TAG = "HTTP_TRACE";
    private static final Charset UTF8 = Charset.forName("UTF-8");

    private String requestDecodedPath(HttpUrl httpUrl) {
        try {
            String decode = URLDecoder.decode(httpUrl.encodedPath(), "UTF-8");
            String decode2 = URLDecoder.decode(httpUrl.encodedQuery(), "UTF-8");
            StringBuilder sb = new StringBuilder();
            sb.append(httpUrl.scheme());
            sb.append("://");
            sb.append(httpUrl.host());
            if (decode2 != null) {
                decode = decode + '?' + decode2;
            }
            sb.append(decode);
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    private static String requestPath(HttpUrl httpUrl) {
        String encodedPath = httpUrl.encodedPath();
        String encodedQuery = httpUrl.encodedQuery();
        StringBuilder sb = new StringBuilder();
        sb.append(httpUrl.scheme());
        sb.append("://");
        sb.append(httpUrl.host());
        if (encodedQuery != null) {
            encodedPath = encodedPath + '?' + encodedQuery;
        }
        sb.append(encodedPath);
        return sb.toString();
    }

    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        RequestBody body = request.body();
        StringBuilder sb = new StringBuilder();
        sb.append("<---------------------------BEGIN REQUEST---------------------------------->");
        sb.append("\n");
        sb.append("Request encoded url: ");
        sb.append(request.method());
        sb.append(" ");
        sb.append(requestPath(request.url()));
        sb.append("\n");
        String requestDecodedPath = requestDecodedPath(request.url());
        if (!TextUtils.isEmpty(requestDecodedPath)) {
            sb.append("Request decoded url: ");
            sb.append(request.method());
            sb.append(" ");
            sb.append(requestDecodedPath);
        }
        Headers headers = request.headers();
        sb.append("\n=============== Headers ===============\n");
        int size = headers.size();
        while (true) {
            size--;
            if (size <= -1) {
                break;
            }
            sb.append(headers.name(size));
            sb.append(" : ");
            sb.append(headers.get(headers.name(size)));
            sb.append("\n");
        }
        sb.append("\n=============== END Headers ===============\n");
        if (body != null) {
            C12905f fVar = new C12905f();
            body.writeTo(fVar);
            MediaType contentType = body.contentType();
            if (contentType != null) {
                contentType.charset(UTF8);
            }
            sb.append(fVar.mo41140a(UTF8));
        }
        long nanoTime = System.nanoTime();
        Response proceed = chain.proceed(request);
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
        ResponseBody body2 = proceed.body();
        sb.append("\n");
        sb.append("Response timeout: ");
        sb.append(millis);
        sb.append("ms");
        sb.append("\n");
        sb.append("Response message: ");
        sb.append(proceed.message());
        sb.append("\n");
        sb.append("Response code: ");
        sb.append(proceed.code());
        if (body2 != null) {
            C12910h source = body2.source();
            source.request(Long.MAX_VALUE);
            C12905f c = source.mo41158c();
            Charset charset = null;
            MediaType contentType2 = body2.contentType();
            if (contentType2 != null) {
                charset = contentType2.charset(UTF8);
            }
            if (charset == null) {
                charset = UTF8;
            }
            if (body2.contentLength() != 0) {
                sb.append("\n");
                sb.append("Response body: \n");
                sb.append(c.clone().mo41140a(charset));
            }
        }
        Headers headers2 = proceed.headers();
        sb.append("\n=============== Headers ===============\n");
        for (int size2 = headers2.size() - 1; size2 > -1; size2--) {
            sb.append(headers2.name(size2));
            sb.append(" : ");
            sb.append(headers2.get(headers2.name(size2)));
            sb.append("\n");
        }
        sb.append("\n=============== END Headers ===============\n");
        sb.append("\n");
        sb.append("<-----------------------------END REQUEST--------------------------------->");
        sb.append("\n\n\n");
        Log.d(TAG, sb.toString());
        return proceed;
    }
}
