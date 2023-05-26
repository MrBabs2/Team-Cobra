package p112n.p312h.p313a.p314b0;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import p112n.p312h.p313a.p318f0.C10763c;

/* renamed from: n.h.a.b0.b */
/* compiled from: FileDownloadUrlConnection */
public class C10733b implements C10732a {

    /* renamed from: a */
    protected URLConnection f28767a;

    /* renamed from: n.h.a.b0.b$a */
    /* compiled from: FileDownloadUrlConnection */
    public static class C10734a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Proxy f28768a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Integer f28769b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Integer f28770c;
    }

    /* renamed from: n.h.a.b0.b$b */
    /* compiled from: FileDownloadUrlConnection */
    public static class C10735b implements C10763c.C10764a {

        /* renamed from: a */
        private final C10734a f28771a;

        public C10735b() {
            this((C10734a) null);
        }

        /* renamed from: a */
        public C10732a mo36102a(String str) throws IOException {
            return new C10733b(str, this.f28771a);
        }

        public C10735b(C10734a aVar) {
            this.f28771a = aVar;
        }
    }

    public C10733b(String str, C10734a aVar) throws IOException {
        this(new URL(str), aVar);
    }

    /* renamed from: a */
    public void mo36095a(String str, String str2) {
        this.f28767a.addRequestProperty(str, str2);
    }

    /* renamed from: a */
    public boolean mo36096a(String str, long j) {
        return false;
    }

    /* renamed from: b */
    public Map<String, List<String>> mo36097b() {
        return this.f28767a.getHeaderFields();
    }

    /* renamed from: c */
    public int mo36098c() throws IOException {
        URLConnection uRLConnection = this.f28767a;
        if (uRLConnection instanceof HttpURLConnection) {
            return ((HttpURLConnection) uRLConnection).getResponseCode();
        }
        return 0;
    }

    /* renamed from: d */
    public void mo36099d() {
    }

    /* renamed from: e */
    public Map<String, List<String>> mo36100e() {
        return this.f28767a.getRequestProperties();
    }

    public void execute() throws IOException {
        this.f28767a.connect();
    }

    public C10733b(URL url, C10734a aVar) throws IOException {
        if (aVar == null || aVar.f28768a == null) {
            this.f28767a = url.openConnection();
        } else {
            this.f28767a = url.openConnection(aVar.f28768a);
        }
        if (aVar != null) {
            if (aVar.f28769b != null) {
                this.f28767a.setReadTimeout(aVar.f28769b.intValue());
            }
            if (aVar.f28770c != null) {
                this.f28767a.setConnectTimeout(aVar.f28770c.intValue());
            }
        }
    }

    /* renamed from: a */
    public InputStream mo36093a() throws IOException {
        return this.f28767a.getInputStream();
    }

    /* renamed from: a */
    public String mo36094a(String str) {
        return this.f28767a.getHeaderField(str);
    }
}
