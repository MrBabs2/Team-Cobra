package p264m.p265a.p266a;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import p112n.p312h.p313a.p314b0.C10732a;
import p112n.p312h.p313a.p318f0.C10763c;

/* renamed from: m.a.a.a */
/* compiled from: OkHttp3Connection */
public class C10551a implements C10732a {

    /* renamed from: a */
    final OkHttpClient f28396a;

    /* renamed from: b */
    private final Request.Builder f28397b;

    /* renamed from: c */
    private Request f28398c;

    /* renamed from: d */
    private Response f28399d;

    /* renamed from: m.a.a.a$a */
    /* compiled from: OkHttp3Connection */
    public static class C10552a implements C10763c.C10764a {

        /* renamed from: a */
        private OkHttpClient f28400a;

        /* renamed from: b */
        private OkHttpClient.Builder f28401b;

        public C10552a() {
        }

        /* renamed from: a */
        public C10732a mo36102a(String str) throws IOException {
            if (this.f28400a == null) {
                synchronized (C10552a.class) {
                    if (this.f28400a == null) {
                        this.f28400a = this.f28401b != null ? this.f28401b.build() : new OkHttpClient();
                        this.f28401b = null;
                    }
                }
            }
            return new C10551a(str, this.f28400a);
        }

        public C10552a(OkHttpClient.Builder builder) {
            this.f28401b = builder;
        }
    }

    C10551a(Request.Builder builder, OkHttpClient okHttpClient) {
        this.f28397b = builder;
        this.f28396a = okHttpClient;
    }

    /* renamed from: a */
    public void mo36095a(String str, String str2) {
        this.f28397b.addHeader(str, str2);
    }

    /* renamed from: a */
    public boolean mo36096a(String str, long j) {
        return false;
    }

    /* renamed from: b */
    public Map<String, List<String>> mo36097b() {
        Response response = this.f28399d;
        if (response == null) {
            return null;
        }
        return response.headers().toMultimap();
    }

    /* renamed from: c */
    public int mo36098c() throws IOException {
        Response response = this.f28399d;
        if (response != null) {
            return response.code();
        }
        throw new IllegalStateException("Please invoke #execute first!");
    }

    /* renamed from: d */
    public void mo36099d() {
        this.f28398c = null;
        this.f28399d = null;
    }

    /* renamed from: e */
    public Map<String, List<String>> mo36100e() {
        if (this.f28398c == null) {
            this.f28398c = this.f28397b.build();
        }
        return this.f28398c.headers().toMultimap();
    }

    public void execute() throws IOException {
        if (this.f28398c == null) {
            this.f28398c = this.f28397b.build();
        }
        this.f28399d = this.f28396a.newCall(this.f28398c).execute();
    }

    /* renamed from: a */
    public InputStream mo36093a() throws IOException {
        Response response = this.f28399d;
        if (response != null) {
            return response.body().byteStream();
        }
        throw new IllegalStateException("Please invoke #execute first!");
    }

    public C10551a(String str, OkHttpClient okHttpClient) {
        this(new Request.Builder().url(str), okHttpClient);
    }

    /* renamed from: a */
    public String mo36094a(String str) {
        Response response = this.f28399d;
        if (response == null) {
            return null;
        }
        return response.header(str);
    }
}
