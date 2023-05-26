package com.facebook;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.C6368h;
import com.facebook.internal.C6457p;
import com.facebook.internal.C6460r;
import com.facebook.internal.C6474v;
import com.facebook.internal.C6476x;
import com.facebook.internal.C6481y;
import com.facebook.internal.p168a0.p170f.C6391a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p015cm.aptoide.p016pt.networking.BodyInterceptorV3;

public class GraphRequest {

    /* renamed from: n */
    public static final String f11631n = "GraphRequest";
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final String f11632o;

    /* renamed from: p */
    private static String f11633p;

    /* renamed from: q */
    private static Pattern f11634q = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");

    /* renamed from: r */
    private static volatile String f11635r;

    /* renamed from: a */
    private AccessToken f11636a;

    /* renamed from: b */
    private C6492j f11637b;

    /* renamed from: c */
    private String f11638c;

    /* renamed from: d */
    private JSONObject f11639d;

    /* renamed from: e */
    private String f11640e;

    /* renamed from: f */
    private String f11641f;

    /* renamed from: g */
    private boolean f11642g;

    /* renamed from: h */
    private Bundle f11643h;

    /* renamed from: i */
    private C6344f f11644i;

    /* renamed from: j */
    private String f11645j;

    /* renamed from: k */
    private Object f11646k;

    /* renamed from: l */
    private String f11647l;

    /* renamed from: m */
    private boolean f11648m;

    public static class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {
        public static final Parcelable.Creator<ParcelableResourceWithMimeType> CREATOR = new C6338a();

        /* renamed from: f */
        private final String f11649f;

        /* renamed from: g */
        private final RESOURCE f11650g;

        /* renamed from: com.facebook.GraphRequest$ParcelableResourceWithMimeType$a */
        static class C6338a implements Parcelable.Creator<ParcelableResourceWithMimeType> {
            C6338a() {
            }

            public ParcelableResourceWithMimeType createFromParcel(Parcel parcel) {
                return new ParcelableResourceWithMimeType(parcel, (C6339a) null);
            }

            public ParcelableResourceWithMimeType[] newArray(int i) {
                return new ParcelableResourceWithMimeType[i];
            }
        }

        /* synthetic */ ParcelableResourceWithMimeType(Parcel parcel, C6339a aVar) {
            this(parcel);
        }

        /* renamed from: a */
        public String mo20844a() {
            return this.f11649f;
        }

        /* renamed from: b */
        public RESOURCE mo20845b() {
            return this.f11650g;
        }

        public int describeContents() {
            return 1;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f11649f);
            parcel.writeParcelable(this.f11650g, i);
        }

        public ParcelableResourceWithMimeType(RESOURCE resource, String str) {
            this.f11649f = str;
            this.f11650g = resource;
        }

        private ParcelableResourceWithMimeType(Parcel parcel) {
            this.f11649f = parcel.readString();
            this.f11650g = parcel.readParcelable(C4716f.m7696e().getClassLoader());
        }
    }

    /* renamed from: com.facebook.GraphRequest$a */
    static class C6339a implements C6344f {

        /* renamed from: a */
        final /* synthetic */ C6345g f11651a;

        C6339a(C6345g gVar) {
            this.f11651a = gVar;
        }

        public void onCompleted(C6371i iVar) {
            C6345g gVar = this.f11651a;
            if (gVar != null) {
                gVar.mo20854a(iVar.mo20919b(), iVar);
            }
        }
    }

    /* renamed from: com.facebook.GraphRequest$b */
    class C6340b implements C6344f {

        /* renamed from: a */
        final /* synthetic */ C6344f f11652a;

        C6340b(GraphRequest graphRequest, C6344f fVar) {
            this.f11652a = fVar;
        }

        public void onCompleted(C6371i iVar) {
            JSONObject b = iVar.mo20919b();
            JSONObject optJSONObject = b != null ? b.optJSONObject("__debug__") : null;
            JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("messages") : null;
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                    String optString = optJSONObject2 != null ? optJSONObject2.optString("message") : null;
                    String optString2 = optJSONObject2 != null ? optJSONObject2.optString("type") : null;
                    String optString3 = optJSONObject2 != null ? optJSONObject2.optString("link") : null;
                    if (!(optString == null || optString2 == null)) {
                        C6494l lVar = C6494l.GRAPH_API_DEBUG_INFO;
                        if (optString2.equals("warning")) {
                            lVar = C6494l.GRAPH_API_DEBUG_WARNING;
                        }
                        if (!C6476x.m13533d(optString3)) {
                            optString = optString + " Link: " + optString3;
                        }
                        C6460r.m13407a(lVar, GraphRequest.f11631n, optString);
                    }
                }
            }
            C6344f fVar = this.f11652a;
            if (fVar != null) {
                fVar.onCompleted(iVar);
            }
        }
    }

    /* renamed from: com.facebook.GraphRequest$c */
    static class C6341c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f11653f;

        /* renamed from: g */
        final /* synthetic */ C6368h f11654g;

        C6341c(ArrayList arrayList, C6368h hVar) {
            this.f11653f = arrayList;
            this.f11654g = hVar;
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    Iterator it = this.f11653f.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        ((C6344f) pair.first).onCompleted((C6371i) pair.second);
                    }
                    for (C6368h.C6369a a : this.f11654g.mo20910h()) {
                        a.mo20886a(this.f11654g);
                    }
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.GraphRequest$d */
    class C6342d implements C6346h {

        /* renamed from: a */
        final /* synthetic */ ArrayList f11655a;

        C6342d(GraphRequest graphRequest, ArrayList arrayList) {
            this.f11655a = arrayList;
        }

        /* renamed from: a */
        public void mo20851a(String str, String str2) throws IOException {
            this.f11655a.add(String.format(Locale.US, "%s=%s", new Object[]{str, URLEncoder.encode(str2, "UTF-8")}));
        }
    }

    /* renamed from: com.facebook.GraphRequest$e */
    private static class C6343e {

        /* renamed from: a */
        private final GraphRequest f11656a;

        /* renamed from: b */
        private final Object f11657b;

        public C6343e(GraphRequest graphRequest, Object obj) {
            this.f11656a = graphRequest;
            this.f11657b = obj;
        }

        /* renamed from: a */
        public GraphRequest mo20852a() {
            return this.f11656a;
        }

        /* renamed from: b */
        public Object mo20853b() {
            return this.f11657b;
        }
    }

    /* renamed from: com.facebook.GraphRequest$f */
    public interface C6344f {
        void onCompleted(C6371i iVar);
    }

    /* renamed from: com.facebook.GraphRequest$g */
    public interface C6345g {
        /* renamed from: a */
        void mo20854a(JSONObject jSONObject, C6371i iVar);
    }

    /* renamed from: com.facebook.GraphRequest$h */
    private interface C6346h {
        /* renamed from: a */
        void mo20851a(String str, String str2) throws IOException;
    }

    /* renamed from: com.facebook.GraphRequest$i */
    public interface C6347i extends C6344f {
        /* renamed from: a */
        void mo20855a(long j, long j2);
    }

    /* renamed from: com.facebook.GraphRequest$j */
    private static class C6348j implements C6346h {

        /* renamed from: a */
        private final OutputStream f11658a;

        /* renamed from: b */
        private final C6460r f11659b;

        /* renamed from: c */
        private boolean f11660c = true;

        /* renamed from: d */
        private boolean f11661d = false;

        public C6348j(OutputStream outputStream, C6460r rVar, boolean z) {
            this.f11658a = outputStream;
            this.f11659b = rVar;
            this.f11661d = z;
        }

        /* renamed from: b */
        private RuntimeException m13138b() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        /* renamed from: a */
        public void mo20860a(String str, Object obj, GraphRequest graphRequest) throws IOException {
            OutputStream outputStream = this.f11658a;
            if (outputStream instanceof C6540q) {
                ((C6540q) outputStream).mo21230a(graphRequest);
            }
            if (GraphRequest.m13103e(obj)) {
                mo20851a(str, GraphRequest.m13104f(obj));
            } else if (obj instanceof Bitmap) {
                mo20857a(str, (Bitmap) obj);
            } else if (obj instanceof byte[]) {
                mo20863a(str, (byte[]) obj);
            } else if (obj instanceof Uri) {
                mo20858a(str, (Uri) obj, (String) null);
            } else if (obj instanceof ParcelFileDescriptor) {
                mo20859a(str, (ParcelFileDescriptor) obj, (String) null);
            } else if (obj instanceof ParcelableResourceWithMimeType) {
                ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) obj;
                Parcelable b = parcelableResourceWithMimeType.mo20845b();
                String a = parcelableResourceWithMimeType.mo20844a();
                if (b instanceof ParcelFileDescriptor) {
                    mo20859a(str, (ParcelFileDescriptor) b, a);
                } else if (b instanceof Uri) {
                    mo20858a(str, (Uri) b, a);
                } else {
                    throw m13138b();
                }
            } else {
                throw m13138b();
            }
        }

        /* renamed from: b */
        public void mo20865b(String str, Object... objArr) throws IOException {
            mo20864a(str, objArr);
            if (!this.f11661d) {
                mo20864a("\r\n", new Object[0]);
            }
        }

        /* renamed from: a */
        public void mo20862a(String str, JSONArray jSONArray, Collection<GraphRequest> collection) throws IOException, JSONException {
            OutputStream outputStream = this.f11658a;
            if (!(outputStream instanceof C6540q)) {
                mo20851a(str, jSONArray.toString());
                return;
            }
            C6540q qVar = (C6540q) outputStream;
            mo20861a(str, (String) null, (String) null);
            mo20864a("[", new Object[0]);
            int i = 0;
            for (GraphRequest a : collection) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                qVar.mo21230a(a);
                if (i > 0) {
                    mo20864a(",%s", jSONObject.toString());
                } else {
                    mo20864a("%s", jSONObject.toString());
                }
                i++;
            }
            mo20864a("]", new Object[0]);
            C6460r rVar = this.f11659b;
            if (rVar != null) {
                rVar.mo21012a("    " + str, (Object) jSONArray.toString());
            }
        }

        /* renamed from: a */
        public void mo20851a(String str, String str2) throws IOException {
            mo20861a(str, (String) null, (String) null);
            mo20865b("%s", str2);
            mo20856a();
            C6460r rVar = this.f11659b;
            if (rVar != null) {
                rVar.mo21012a("    " + str, (Object) str2);
            }
        }

        /* renamed from: a */
        public void mo20857a(String str, Bitmap bitmap) throws IOException {
            mo20861a(str, str, "image/png");
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.f11658a);
            mo20865b("", new Object[0]);
            mo20856a();
            C6460r rVar = this.f11659b;
            if (rVar != null) {
                rVar.mo21012a("    " + str, (Object) "<Image>");
            }
        }

        /* renamed from: a */
        public void mo20863a(String str, byte[] bArr) throws IOException {
            mo20861a(str, str, "content/unknown");
            this.f11658a.write(bArr);
            mo20865b("", new Object[0]);
            mo20856a();
            C6460r rVar = this.f11659b;
            if (rVar != null) {
                rVar.mo21012a("    " + str, (Object) String.format(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(bArr.length)}));
            }
        }

        /* renamed from: a */
        public void mo20858a(String str, Uri uri, String str2) throws IOException {
            int i;
            if (str2 == null) {
                str2 = "content/unknown";
            }
            mo20861a(str, str, str2);
            if (this.f11658a instanceof C6537o) {
                ((C6537o) this.f11658a).mo21232d(C6476x.m13480a(uri));
                i = 0;
            } else {
                i = C6476x.m13478a(C4716f.m7696e().getContentResolver().openInputStream(uri), this.f11658a) + 0;
            }
            mo20865b("", new Object[0]);
            mo20856a();
            C6460r rVar = this.f11659b;
            if (rVar != null) {
                rVar.mo21012a("    " + str, (Object) String.format(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(i)}));
            }
        }

        /* renamed from: a */
        public void mo20859a(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) throws IOException {
            int i;
            if (str2 == null) {
                str2 = "content/unknown";
            }
            mo20861a(str, str, str2);
            OutputStream outputStream = this.f11658a;
            if (outputStream instanceof C6537o) {
                ((C6537o) outputStream).mo21232d(parcelFileDescriptor.getStatSize());
                i = 0;
            } else {
                i = C6476x.m13478a((InputStream) new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.f11658a) + 0;
            }
            mo20865b("", new Object[0]);
            mo20856a();
            C6460r rVar = this.f11659b;
            if (rVar != null) {
                rVar.mo21012a("    " + str, (Object) String.format(Locale.ROOT, "<Data: %d>", new Object[]{Integer.valueOf(i)}));
            }
        }

        /* renamed from: a */
        public void mo20856a() throws IOException {
            if (!this.f11661d) {
                mo20865b("--%s", GraphRequest.f11632o);
                return;
            }
            this.f11658a.write("&".getBytes());
        }

        /* renamed from: a */
        public void mo20861a(String str, String str2, String str3) throws IOException {
            if (!this.f11661d) {
                mo20864a("Content-Disposition: form-data; name=\"%s\"", str);
                if (str2 != null) {
                    mo20864a("; filename=\"%s\"", str2);
                }
                mo20865b("", new Object[0]);
                if (str3 != null) {
                    mo20865b("%s: %s", "Content-Type", str3);
                }
                mo20865b("", new Object[0]);
                return;
            }
            this.f11658a.write(String.format("%s=", new Object[]{str}).getBytes());
        }

        /* renamed from: a */
        public void mo20864a(String str, Object... objArr) throws IOException {
            if (!this.f11661d) {
                if (this.f11660c) {
                    this.f11658a.write("--".getBytes());
                    this.f11658a.write(GraphRequest.f11632o.getBytes());
                    this.f11658a.write("\r\n".getBytes());
                    this.f11660c = false;
                }
                this.f11658a.write(String.format(str, objArr).getBytes());
                return;
            }
            this.f11658a.write(URLEncoder.encode(String.format(Locale.US, str, objArr), "UTF-8").getBytes());
        }
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        for (int i = 0; i < nextInt; i++) {
            sb.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        f11632o = sb.toString();
    }

    public GraphRequest() {
        this((AccessToken) null, (String) null, (Bundle) null, (C6492j) null, (C6344f) null);
    }

    /* renamed from: a */
    public static GraphRequest m13072a(AccessToken accessToken, C6345g gVar) {
        return new GraphRequest(accessToken, "me", (Bundle) null, (C6492j) null, new C6339a(gVar));
    }

    /* renamed from: n */
    private void m13108n() {
        if (this.f11636a != null) {
            if (!this.f11643h.containsKey("access_token")) {
                String k = this.f11636a.mo20788k();
                C6460r.m13411c(k);
                this.f11643h.putString("access_token", k);
            }
        } else if (!this.f11648m && !this.f11643h.containsKey("access_token")) {
            String f = C4716f.m7697f();
            String k2 = C4716f.m7702k();
            if (C6476x.m13533d(f) || C6476x.m13533d(k2)) {
                C6476x.m13528c(f11631n, "Warning: Request without access token missing application ID or client token.");
            } else {
                this.f11643h.putString("access_token", f + "|" + k2);
            }
        }
        this.f11643h.putString("sdk", "android");
        this.f11643h.putString("format", BodyInterceptorV3.RESPONSE_MODE_JSON);
        if (C4716f.m7689a(C6494l.GRAPH_API_DEBUG_INFO)) {
            this.f11643h.putString("debug", "info");
        } else if (C4716f.m7689a(C6494l.GRAPH_API_DEBUG_WARNING)) {
            this.f11643h.putString("debug", "warning");
        }
    }

    /* renamed from: o */
    private String m13109o() {
        if (f11634q.matcher(this.f11638c).matches()) {
            return this.f11638c;
        }
        return String.format("%s/%s", new Object[]{this.f11647l, this.f11638c});
    }

    /* renamed from: p */
    private static String m13110p() {
        return String.format("multipart/form-data; boundary=%s", new Object[]{f11632o});
    }

    /* renamed from: q */
    private static String m13111q() {
        if (f11635r == null) {
            f11635r = String.format("%s.%s", new Object[]{"FBAndroidSDK", "7.1.0"});
            String a = C6457p.m13401a();
            if (!C6476x.m13533d(a)) {
                f11635r = String.format(Locale.ROOT, "%s/%s", new Object[]{f11635r, a});
            }
        }
        return f11635r;
    }

    /* renamed from: d */
    public final C6344f mo20834d() {
        return this.f11644i;
    }

    /* renamed from: e */
    public final JSONObject mo20835e() {
        return this.f11639d;
    }

    /* renamed from: f */
    public final String mo20836f() {
        return this.f11638c;
    }

    /* renamed from: g */
    public final C6492j mo20837g() {
        return this.f11637b;
    }

    /* renamed from: h */
    public final Bundle mo20838h() {
        return this.f11643h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final String mo20839i() {
        if (this.f11645j == null) {
            String format = String.format("%s/%s", new Object[]{C6474v.m13474c(), m13109o()});
            m13108n();
            Uri parse = Uri.parse(m13076a(format, (Boolean) true));
            return String.format("%s?%s", new Object[]{parse.getPath(), parse.getQuery()});
        }
        throw new FacebookException("Can't override URL for a batch request");
    }

    /* renamed from: j */
    public final Object mo20840j() {
        return this.f11646k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final String mo20841k() {
        String str;
        String str2;
        String str3 = this.f11645j;
        if (str3 != null) {
            return str3.toString();
        }
        if (mo20837g() != C6492j.POST || (str2 = this.f11638c) == null || !str2.endsWith("/videos")) {
            str = C6474v.m13474c();
        } else {
            str = C6474v.m13475d();
        }
        String format = String.format("%s/%s", new Object[]{str, m13109o()});
        m13108n();
        return m13076a(format, (Boolean) false);
    }

    /* renamed from: l */
    public final String mo20842l() {
        return this.f11647l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{Request: ");
        sb.append(" accessToken: ");
        Object obj = this.f11636a;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.f11638c);
        sb.append(", graphObject: ");
        sb.append(this.f11639d);
        sb.append(", httpMethod: ");
        sb.append(this.f11637b);
        sb.append(", parameters: ");
        sb.append(this.f11643h);
        sb.append("}");
        return sb.toString();
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, C6492j jVar, C6344f fVar) {
        this(accessToken, str, bundle, jVar, fVar, (String) null);
    }

    /* renamed from: d */
    private static boolean m13100d(C6368h hVar) {
        for (C6368h.C6369a aVar : hVar.mo20910h()) {
            if (aVar instanceof C6368h.C6370b) {
                return true;
            }
        }
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            if (((GraphRequest) it.next()).mo20834d() instanceof C6347i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m13102e(C6368h hVar) {
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            GraphRequest graphRequest = (GraphRequest) it.next();
            Iterator it2 = graphRequest.f11643h.keySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (m13101d(graphRequest.f11643h.get((String) it2.next()))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: f */
    public static HttpURLConnection m13105f(C6368h hVar) {
        URL url;
        m13106g(hVar);
        try {
            if (hVar.size() == 1) {
                url = new URL(hVar.get(0).mo20841k());
            } else {
                url = new URL(C6474v.m13474c());
            }
            HttpURLConnection httpURLConnection = null;
            try {
                httpURLConnection = m13077a(url);
                m13085a(hVar, httpURLConnection);
                return httpURLConnection;
            } catch (IOException | JSONException e) {
                C6476x.m13509a((URLConnection) httpURLConnection);
                throw new FacebookException("could not construct request body", e);
            }
        } catch (MalformedURLException e2) {
            throw new FacebookException("could not construct URL for request", e2);
        }
    }

    /* renamed from: g */
    static final void m13106g(C6368h hVar) {
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            GraphRequest graphRequest = (GraphRequest) it.next();
            if (C6492j.GET.equals(graphRequest.mo20837g()) && m13096b(graphRequest)) {
                Bundle h = graphRequest.mo20838h();
                if (!h.containsKey("fields") || C6476x.m13533d(h.getString("fields"))) {
                    C6460r.m13406a(C6494l.DEVELOPER_ERRORS, 5, "Request", "starting with Graph API v2.4, GET requests for /%s should contain an explicit \"fields\" parameter.", graphRequest.mo20836f());
                }
            }
        }
    }

    /* renamed from: b */
    public final C6367g mo20832b() {
        return m13095b(this);
    }

    /* renamed from: c */
    public final AccessToken mo20833c() {
        return this.f11636a;
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, C6492j jVar, C6344f fVar, String str2) {
        this.f11642g = true;
        this.f11648m = false;
        this.f11636a = accessToken;
        this.f11638c = str;
        this.f11647l = str2;
        mo20827a(fVar);
        mo20828a(jVar);
        if (bundle != null) {
            this.f11643h = new Bundle(bundle);
        } else {
            this.f11643h = new Bundle();
        }
        if (this.f11647l == null) {
            this.f11647l = C4716f.m7706o();
        }
    }

    /* renamed from: a */
    public static GraphRequest m13074a(AccessToken accessToken, String str, JSONObject jSONObject, C6344f fVar) {
        GraphRequest graphRequest = new GraphRequest(accessToken, str, (Bundle) null, C6492j.POST, fVar);
        graphRequest.mo20830a(jSONObject);
        return graphRequest;
    }

    /* renamed from: b */
    public static C6367g m13095b(GraphRequest... graphRequestArr) {
        C6481y.m13556a((Object) graphRequestArr, "requests");
        return m13094b((Collection<GraphRequest>) Arrays.asList(graphRequestArr));
    }

    /* renamed from: c */
    private static String m13098c(C6368h hVar) {
        String a;
        if (!C6476x.m13533d(hVar.mo20907f())) {
            return hVar.mo20907f();
        }
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            AccessToken accessToken = ((GraphRequest) it.next()).f11636a;
            if (accessToken != null && (a = accessToken.mo20776a()) != null) {
                return a;
            }
        }
        if (!C6476x.m13533d(f11633p)) {
            return f11633p;
        }
        return C4716f.m7697f();
    }

    /* renamed from: a */
    public static GraphRequest m13073a(AccessToken accessToken, String str, C6344f fVar) {
        return new GraphRequest(accessToken, str, (Bundle) null, (C6492j) null, fVar);
    }

    /* renamed from: b */
    public static C6367g m13094b(Collection<GraphRequest> collection) {
        return m13093b(new C6368h(collection));
    }

    /* renamed from: b */
    public static C6367g m13093b(C6368h hVar) {
        C6481y.m13564c(hVar, "requests");
        C6367g gVar = new C6367g(hVar);
        gVar.executeOnExecutor(C4716f.m7704m(), new Void[0]);
        return gVar;
    }

    /* renamed from: d */
    private static boolean m13101d(Object obj) {
        return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelableResourceWithMimeType);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static boolean m13103e(Object obj) {
        return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
    }

    /* renamed from: a */
    public final void mo20830a(JSONObject jSONObject) {
        this.f11639d = jSONObject;
    }

    /* renamed from: a */
    public final void mo20828a(C6492j jVar) {
        if (this.f11645j == null || jVar == C6492j.GET) {
            if (jVar == null) {
                jVar = C6492j.GET;
            }
            this.f11637b = jVar;
            return;
        }
        throw new FacebookException("Can't change HTTP method on request with overridden URL.");
    }

    /* renamed from: b */
    static final boolean m13096b(GraphRequest graphRequest) {
        String l = graphRequest.mo20842l();
        if (C6476x.m13533d(l)) {
            return true;
        }
        if (l.startsWith("v")) {
            l = l.substring(1);
        }
        String[] split = l.split("\\.");
        if (split.length >= 2 && Integer.parseInt(split[0]) > 2) {
            return true;
        }
        if (Integer.parseInt(split[0]) < 2 || Integer.parseInt(split[1]) < 4) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo20831a(boolean z) {
        this.f11648m = z;
    }

    /* renamed from: a */
    public final void mo20826a(Bundle bundle) {
        this.f11643h = bundle;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static String m13104f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof Boolean) || (obj instanceof Number)) {
            return obj.toString();
        }
        if (obj instanceof Date) {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(obj);
        }
        throw new IllegalArgumentException("Unsupported parameter type.");
    }

    /* renamed from: a */
    public final void mo20827a(C6344f fVar) {
        if (C4716f.m7689a(C6494l.GRAPH_API_DEBUG_INFO) || C4716f.m7689a(C6494l.GRAPH_API_DEBUG_WARNING)) {
            this.f11644i = new C6340b(this, fVar);
        } else {
            this.f11644i = fVar;
        }
    }

    /* renamed from: a */
    public final void mo20829a(Object obj) {
        this.f11646k = obj;
    }

    /* renamed from: a */
    public final C6371i mo20825a() {
        return m13075a(this);
    }

    /* renamed from: a */
    public static C6371i m13075a(GraphRequest graphRequest) {
        List<C6371i> a = m13081a(graphRequest);
        if (a != null && a.size() == 1) {
            return a.get(0);
        }
        throw new FacebookException("invalid state: expected a single response");
    }

    /* renamed from: a */
    public static List<C6371i> m13081a(GraphRequest... graphRequestArr) {
        C6481y.m13556a((Object) graphRequestArr, "requests");
        return m13080a((Collection<GraphRequest>) Arrays.asList(graphRequestArr));
    }

    /* renamed from: a */
    public static List<C6371i> m13080a(Collection<GraphRequest> collection) {
        return m13078a(new C6368h(collection));
    }

    /* renamed from: a */
    public static List<C6371i> m13078a(C6368h hVar) {
        C6481y.m13564c(hVar, "requests");
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnection = m13105f(hVar);
            return m13079a(httpURLConnection, hVar);
        } catch (Exception e) {
            List<C6371i> a = C6371i.m13208a(hVar.mo20912k(), httpURLConnection, new FacebookException((Throwable) e));
            m13086a(hVar, a);
            return a;
        } finally {
            C6476x.m13509a((URLConnection) httpURLConnection);
        }
    }

    /* renamed from: a */
    public static List<C6371i> m13079a(HttpURLConnection httpURLConnection, C6368h hVar) {
        List<C6371i> a = C6371i.m13206a(httpURLConnection, hVar);
        C6476x.m13509a((URLConnection) httpURLConnection);
        int size = hVar.size();
        if (size == a.size()) {
            m13086a(hVar, a);
            C6353b.m13173e().mo20882b();
            return a;
        }
        throw new FacebookException(String.format(Locale.US, "Received %d responses while expecting %d", new Object[]{Integer.valueOf(a.size()), Integer.valueOf(size)}));
    }

    /* renamed from: a */
    static void m13086a(C6368h hVar, List<C6371i> list) {
        int size = hVar.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            GraphRequest graphRequest = hVar.get(i);
            if (graphRequest.f11644i != null) {
                arrayList.add(new Pair(graphRequest.f11644i, list.get(i)));
            }
        }
        if (arrayList.size() > 0) {
            C6341c cVar = new C6341c(arrayList, hVar);
            Handler g = hVar.mo20908g();
            if (g == null) {
                cVar.run();
            } else {
                g.post(cVar);
            }
        }
    }

    /* renamed from: a */
    private static HttpURLConnection m13077a(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestProperty("User-Agent", m13111q());
        httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
        httpURLConnection.setChunkedStreamingMode(0);
        return httpURLConnection;
    }

    /* renamed from: a */
    private String m13076a(String str, Boolean bool) {
        if (!bool.booleanValue() && this.f11637b == C6492j.POST) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f11643h.keySet()) {
            Object obj = this.f11643h.get(str2);
            if (obj == null) {
                obj = "";
            }
            if (m13103e(obj)) {
                buildUpon.appendQueryParameter(str2, m13104f(obj).toString());
            } else if (this.f11637b == C6492j.GET) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", new Object[]{obj.getClass().getSimpleName()}));
            }
        }
        return buildUpon.toString();
    }

    /* renamed from: a */
    private void m13090a(JSONArray jSONArray, Map<String, C6343e> map) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        String str = this.f11640e;
        if (str != null) {
            jSONObject.put("name", str);
            jSONObject.put("omit_response_on_success", this.f11642g);
        }
        String str2 = this.f11641f;
        if (str2 != null) {
            jSONObject.put("depends_on", str2);
        }
        String i = mo20839i();
        jSONObject.put("relative_url", i);
        jSONObject.put("method", this.f11637b);
        AccessToken accessToken = this.f11636a;
        if (accessToken != null) {
            C6460r.m13411c(accessToken.mo20788k());
        }
        ArrayList arrayList = new ArrayList();
        for (String str3 : this.f11643h.keySet()) {
            Object obj = this.f11643h.get(str3);
            if (m13101d(obj)) {
                String format = String.format(Locale.ROOT, "%s%d", new Object[]{"file", Integer.valueOf(map.size())});
                arrayList.add(format);
                map.put(format, new C6343e(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        if (this.f11639d != null) {
            ArrayList arrayList2 = new ArrayList();
            m13091a(this.f11639d, i, (C6346h) new C6342d(this, arrayList2));
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    /* renamed from: a */
    private static void m13088a(HttpURLConnection httpURLConnection, boolean z) {
        if (z) {
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            return;
        }
        httpURLConnection.setRequestProperty("Content-Type", m13110p());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: com.facebook.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: com.facebook.p} */
    /* JADX WARNING: type inference failed for: r14v3, types: [java.io.OutputStream] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final void m13085a(com.facebook.C6368h r13, java.net.HttpURLConnection r14) throws java.io.IOException, org.json.JSONException {
        /*
            com.facebook.internal.r r6 = new com.facebook.internal.r
            com.facebook.l r0 = com.facebook.C6494l.REQUESTS
            java.lang.String r1 = "Request"
            r6.<init>(r0, r1)
            int r2 = r13.size()
            boolean r5 = m13102e((com.facebook.C6368h) r13)
            r0 = 0
            r1 = 1
            if (r2 != r1) goto L_0x001c
            com.facebook.GraphRequest r3 = r13.get((int) r0)
            com.facebook.j r3 = r3.f11637b
            goto L_0x001e
        L_0x001c:
            com.facebook.j r3 = com.facebook.C6492j.POST
        L_0x001e:
            java.lang.String r4 = r3.name()
            r14.setRequestMethod(r4)
            m13088a((java.net.HttpURLConnection) r14, (boolean) r5)
            java.net.URL r4 = r14.getURL()
            java.lang.String r7 = "Request:\n"
            r6.mo21011a(r7)
            java.lang.String r7 = r13.mo20911j()
            java.lang.String r8 = "Id"
            r6.mo21012a((java.lang.String) r8, (java.lang.Object) r7)
            java.lang.String r7 = "URL"
            r6.mo21012a((java.lang.String) r7, (java.lang.Object) r4)
            java.lang.String r7 = r14.getRequestMethod()
            java.lang.String r8 = "Method"
            r6.mo21012a((java.lang.String) r8, (java.lang.Object) r7)
            java.lang.String r7 = "User-Agent"
            java.lang.String r8 = r14.getRequestProperty(r7)
            r6.mo21012a((java.lang.String) r7, (java.lang.Object) r8)
            java.lang.String r7 = "Content-Type"
            java.lang.String r8 = r14.getRequestProperty(r7)
            r6.mo21012a((java.lang.String) r7, (java.lang.Object) r8)
            int r7 = r13.mo20913n()
            r14.setConnectTimeout(r7)
            int r7 = r13.mo20913n()
            r14.setReadTimeout(r7)
            com.facebook.j r7 = com.facebook.C6492j.POST
            if (r3 != r7) goto L_0x006d
            r0 = 1
        L_0x006d:
            if (r0 != 0) goto L_0x0073
            r6.mo21010a()
            return
        L_0x0073:
            r14.setDoOutput(r1)
            r0 = 0
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00c9 }
            java.io.OutputStream r14 = r14.getOutputStream()     // Catch:{ all -> 0x00c9 }
            r1.<init>(r14)     // Catch:{ all -> 0x00c9 }
            if (r5 == 0) goto L_0x008c
            java.util.zip.GZIPOutputStream r14 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0089 }
            r14.<init>(r1)     // Catch:{ all -> 0x0089 }
            r0 = r14
            goto L_0x008d
        L_0x0089:
            r13 = move-exception
            r0 = r1
            goto L_0x00ca
        L_0x008c:
            r0 = r1
        L_0x008d:
            boolean r14 = m13100d((com.facebook.C6368h) r13)     // Catch:{ all -> 0x00c9 }
            if (r14 == 0) goto L_0x00b7
            com.facebook.o r14 = new com.facebook.o     // Catch:{ all -> 0x00c9 }
            android.os.Handler r1 = r13.mo20908g()     // Catch:{ all -> 0x00c9 }
            r14.<init>(r1)     // Catch:{ all -> 0x00c9 }
            r8 = 0
            r7 = r13
            r9 = r2
            r10 = r4
            r11 = r14
            r12 = r5
            m13084a(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00c9 }
            int r1 = r14.mo21229a()     // Catch:{ all -> 0x00c9 }
            java.util.Map r10 = r14.mo21231b()     // Catch:{ all -> 0x00c9 }
            com.facebook.p r14 = new com.facebook.p     // Catch:{ all -> 0x00c9 }
            long r11 = (long) r1     // Catch:{ all -> 0x00c9 }
            r7 = r14
            r8 = r0
            r9 = r13
            r7.<init>(r8, r9, r10, r11)     // Catch:{ all -> 0x00c9 }
            goto L_0x00b8
        L_0x00b7:
            r14 = r0
        L_0x00b8:
            r0 = r13
            r1 = r6
            r3 = r4
            r4 = r14
            m13084a(r0, r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00c6 }
            r14.close()
            r6.mo21010a()
            return
        L_0x00c6:
            r13 = move-exception
            r0 = r14
            goto L_0x00ca
        L_0x00c9:
            r13 = move-exception
        L_0x00ca:
            if (r0 == 0) goto L_0x00cf
            r0.close()
        L_0x00cf:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.m13085a(com.facebook.h, java.net.HttpURLConnection):void");
    }

    /* renamed from: a */
    private static void m13084a(C6368h hVar, C6460r rVar, int i, URL url, OutputStream outputStream, boolean z) throws IOException, JSONException {
        C6348j jVar = new C6348j(outputStream, rVar, z);
        if (i == 1) {
            GraphRequest graphRequest = hVar.get(0);
            HashMap hashMap = new HashMap();
            for (String str : graphRequest.f11643h.keySet()) {
                Object obj = graphRequest.f11643h.get(str);
                if (m13101d(obj)) {
                    hashMap.put(str, new C6343e(graphRequest, obj));
                }
            }
            if (rVar != null) {
                rVar.mo21011a("  Parameters:\n");
            }
            m13082a(graphRequest.f11643h, jVar, graphRequest);
            if (rVar != null) {
                rVar.mo21011a("  Attachments:\n");
            }
            m13089a((Map<String, C6343e>) hashMap, jVar);
            JSONObject jSONObject = graphRequest.f11639d;
            if (jSONObject != null) {
                m13091a(jSONObject, url.getPath(), (C6346h) jVar);
                return;
            }
            return;
        }
        String c = m13098c(hVar);
        if (!C6476x.m13533d(c)) {
            jVar.mo20851a("batch_app_id", c);
            HashMap hashMap2 = new HashMap();
            m13083a(jVar, (Collection<GraphRequest>) hVar, (Map<String, C6343e>) hashMap2);
            if (rVar != null) {
                rVar.mo21011a("  Attachments:\n");
            }
            m13089a((Map<String, C6343e>) hashMap2, jVar);
            return;
        }
        throw new FacebookException("App ID was not specified at the request or Settings.");
    }

    /* renamed from: a */
    private static boolean m13092a(String str) {
        Matcher matcher = f11634q.matcher(str);
        if (matcher.matches()) {
            str = matcher.group(1);
        }
        if (str.startsWith("me/") || str.startsWith("/me/")) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m13091a(org.json.JSONObject r6, java.lang.String r7, com.facebook.GraphRequest.C6346h r8) throws java.io.IOException {
        /*
            boolean r0 = m13092a((java.lang.String) r7)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = ":"
            int r0 = r7.indexOf(r0)
            java.lang.String r3 = "?"
            int r7 = r7.indexOf(r3)
            r3 = 3
            if (r0 <= r3) goto L_0x001e
            r3 = -1
            if (r7 == r3) goto L_0x001c
            if (r0 >= r7) goto L_0x001e
        L_0x001c:
            r7 = 1
            goto L_0x001f
        L_0x001e:
            r7 = 0
        L_0x001f:
            java.util.Iterator r0 = r6.keys()
        L_0x0023:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0044
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r6.opt(r3)
            if (r7 == 0) goto L_0x003f
            java.lang.String r5 = "image"
            boolean r5 = r3.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x003f
            r5 = 1
            goto L_0x0040
        L_0x003f:
            r5 = 0
        L_0x0040:
            m13087a((java.lang.String) r3, (java.lang.Object) r4, (com.facebook.GraphRequest.C6346h) r8, (boolean) r5)
            goto L_0x0023
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.GraphRequest.m13091a(org.json.JSONObject, java.lang.String, com.facebook.GraphRequest$h):void");
    }

    /* renamed from: a */
    private static void m13087a(String str, Object obj, C6346h hVar, boolean z) throws IOException {
        Class<?> cls = obj.getClass();
        if (JSONObject.class.isAssignableFrom(cls)) {
            JSONObject jSONObject = (JSONObject) obj;
            if (z) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    m13087a(String.format("%s[%s]", new Object[]{str, next}), jSONObject.opt(next), hVar, z);
                }
            } else if (jSONObject.has(DeepLinkIntentReceiver.DeepLinksKeys.f3452ID)) {
                m13087a(str, (Object) jSONObject.optString(DeepLinkIntentReceiver.DeepLinksKeys.f3452ID), hVar, z);
            } else if (jSONObject.has("url")) {
                m13087a(str, (Object) jSONObject.optString("url"), hVar, z);
            } else if (jSONObject.has("fbsdk:create_object")) {
                m13087a(str, (Object) jSONObject.toString(), hVar, z);
            }
        } else if (JSONArray.class.isAssignableFrom(cls)) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                m13087a(String.format(Locale.ROOT, "%s[%d]", new Object[]{str, Integer.valueOf(i)}), jSONArray.opt(i), hVar, z);
            }
        } else if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
            hVar.mo20851a(str, obj.toString());
        } else if (Date.class.isAssignableFrom(cls)) {
            hVar.mo20851a(str, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj));
        }
    }

    /* renamed from: a */
    private static void m13082a(Bundle bundle, C6348j jVar, GraphRequest graphRequest) throws IOException {
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (m13103e(obj)) {
                jVar.mo20860a(str, obj, graphRequest);
            }
        }
    }

    /* renamed from: a */
    private static void m13089a(Map<String, C6343e> map, C6348j jVar) throws IOException {
        for (String next : map.keySet()) {
            C6343e eVar = map.get(next);
            if (m13101d(eVar.mo20853b())) {
                jVar.mo20860a(next, eVar.mo20853b(), eVar.mo20852a());
            }
        }
    }

    /* renamed from: a */
    private static void m13083a(C6348j jVar, Collection<GraphRequest> collection, Map<String, C6343e> map) throws JSONException, IOException {
        JSONArray jSONArray = new JSONArray();
        for (GraphRequest a : collection) {
            a.m13090a(jSONArray, map);
        }
        jVar.mo20862a("batch", jSONArray, collection);
    }
}
