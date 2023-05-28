package p015cm.aptoide.p016pt.dataprovider.cache;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p413s.C12910h;

/* renamed from: cm.aptoide.pt.dataprovider.cache.ResponseCacheEntry */
public class ResponseCacheEntry {
    private static final String DEFAULT_CHARSET = "UTF-8";
    private String body;
    private String bodyMediaType;
    private int code;
    private Map<String, List<String>> headers;
    private String message;
    private String protocol;
    private long validity;

    public ResponseCacheEntry() {
    }

    public static String getDefaultCharset() {
        return DEFAULT_CHARSET;
    }

    public String getBody() {
        return this.body;
    }

    public String getBodyMediaType() {
        return this.bodyMediaType;
    }

    public int getCode() {
        return this.code;
    }

    public Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public String getMessage() {
        return this.message;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public Response getResponse(Request request) {
        Response.Builder builder = new Response.Builder();
        builder.code(this.code);
        builder.message(this.message);
        try {
            builder.protocol(Protocol.get(this.protocol));
        } catch (IOException e) {
            e.printStackTrace();
        }
        builder.body(ResponseBody.create(MediaType.parse(this.bodyMediaType), this.body));
        Headers.Builder builder2 = new Headers.Builder();
        for (Map.Entry next : this.headers.entrySet()) {
            for (String add : (List) next.getValue()) {
                builder2.add((String) next.getKey(), add);
            }
        }
        builder.headers(builder2.build());
        builder.request(request);
        return builder.build();
    }

    public long getValidity() {
        return this.validity;
    }

    /* access modifiers changed from: package-private */
    @JsonIgnore
    public boolean isValid() {
        return System.currentTimeMillis() <= this.validity;
    }

    public void setBody(String str) {
        this.body = str;
    }

    public void setBodyMediaType(String str) {
        this.bodyMediaType = str;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setHeaders(Map<String, List<String>> map) {
        this.headers = map;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setValidity(long j) {
        this.validity = j;
    }

    public ResponseCacheEntry(Response response, int i) {
        this.validity = System.currentTimeMillis() + ((long) (i * 1000));
        this.code = response.code();
        this.message = response.message();
        this.protocol = response.protocol().toString();
        this.headers = response.headers().toMultimap();
        ResponseBody body2 = response.body();
        this.bodyMediaType = body2.contentType().toString();
        Charset charset = body2.contentType().charset(Charset.forName(DEFAULT_CHARSET));
        try {
            C12910h source = body2.source();
            source.request(Long.MAX_VALUE);
            this.body = source.mo41158c().clone().mo41140a(charset);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
