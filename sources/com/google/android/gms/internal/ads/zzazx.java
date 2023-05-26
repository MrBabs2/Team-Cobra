package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.JsonWriter;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;

@zzard
public final class zzazx {

    /* renamed from: b */
    private static Object f18735b = new Object();

    /* renamed from: c */
    private static boolean f18736c = false;

    /* renamed from: d */
    private static boolean f18737d = false;

    /* renamed from: e */
    private static Clock f18738e = DefaultClock.m16265d();

    /* renamed from: f */
    private static final Set<String> f18739f = new HashSet(Arrays.asList(new String[0]));

    /* renamed from: a */
    private final List<String> f18740a;

    public zzazx() {
        this((String) null);
    }

    /* renamed from: b */
    private final void m20502b(String str, String str2, Map<String, ?> map, byte[] bArr) {
        m20494a("onNetworkRequest", (C7684l6) new C7532h6(str, str2, map, bArr));
    }

    /* renamed from: c */
    private static synchronized void m20504c(String str) {
        synchronized (zzazx.class) {
            zzbad.m20521c("GMA Debug BEGIN");
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 4000;
                String valueOf = String.valueOf(str.substring(i, Math.min(i2, str.length())));
                zzbad.m20521c(valueOf.length() != 0 ? "GMA Debug CONTENT ".concat(valueOf) : new String("GMA Debug CONTENT "));
                i = i2;
            }
            zzbad.m20521c("GMA Debug FINISH");
        }
    }

    /* renamed from: a */
    public final void mo27885a(HttpURLConnection httpURLConnection, byte[] bArr) {
        HashMap hashMap;
        if (m20498a()) {
            if (httpURLConnection.getRequestProperties() == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap(httpURLConnection.getRequestProperties());
            }
            m20502b(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), hashMap, bArr);
        }
    }

    public zzazx(String str) {
        List<String> list;
        if (!m20498a()) {
            list = new ArrayList<>();
        } else {
            String[] strArr = new String[1];
            String valueOf = String.valueOf(UUID.randomUUID().toString());
            strArr[0] = valueOf.length() != 0 ? "network_request_".concat(valueOf) : new String("network_request_");
            list = Arrays.asList(strArr);
        }
        this.f18740a = list;
    }

    /* renamed from: b */
    private final void m20503b(Map<String, ?> map, int i) {
        m20494a("onNetworkResponse", (C7684l6) new C7569i6(i, map));
    }

    /* renamed from: b */
    private final void m20501b(String str) {
        m20494a("onNetworkRequestError", (C7684l6) new C7647k6(str));
    }

    /* renamed from: b */
    public static void m20500b() {
        synchronized (f18735b) {
            f18736c = false;
            f18737d = false;
            zzbad.m20523d("Ad debug logging enablement is out of date.");
        }
    }

    /* renamed from: c */
    public static boolean m20505c() {
        boolean z;
        synchronized (f18735b) {
            z = f18736c;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo27883a(String str, String str2, Map<String, ?> map, byte[] bArr) {
        if (m20498a()) {
            m20502b(str, str2, map, bArr);
        }
    }

    /* renamed from: a */
    public final void mo27884a(HttpURLConnection httpURLConnection, int i) {
        if (m20498a()) {
            String str = null;
            m20503b(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i);
            if (i < 200 || i >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e) {
                    String valueOf = String.valueOf(e.getMessage());
                    zzbad.m20523d(valueOf.length() != 0 ? "Can not get error message from error HttpURLConnection\n".concat(valueOf) : new String("Can not get error message from error HttpURLConnection\n"));
                }
                m20501b(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo27886a(Map<String, ?> map, int i) {
        if (m20498a()) {
            m20503b(map, i);
            if (i < 200 || i >= 300) {
                m20501b((String) null);
            }
        }
    }

    /* renamed from: a */
    public final void mo27882a(String str) {
        if (m20498a() && str != null) {
            mo27887a(str.getBytes());
        }
    }

    /* renamed from: a */
    public final void mo27887a(byte[] bArr) {
        m20494a("onNetworkResponseBody", (C7684l6) new C7610j6(bArr));
    }

    /* renamed from: a */
    private static void m20492a(JsonWriter jsonWriter, Map<String, ?> map) throws IOException {
        if (map != null) {
            jsonWriter.name("headers").beginArray();
            Iterator<Map.Entry<String, ?>> it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                String str = (String) next.getKey();
                if (!f18739f.contains(str)) {
                    if (!(next.getValue() instanceof List)) {
                        if (!(next.getValue() instanceof String)) {
                            zzbad.m20519b("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                            break;
                        }
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name(DonationsAnalytics.VALUE).value((String) next.getValue());
                        jsonWriter.endObject();
                    } else {
                        for (String value : (List) next.getValue()) {
                            jsonWriter.beginObject();
                            jsonWriter.name("name").value(str);
                            jsonWriter.name(DonationsAnalytics.VALUE).value(value);
                            jsonWriter.endObject();
                        }
                    }
                }
            }
            jsonWriter.endArray();
        }
    }

    /* renamed from: a */
    private final void m20494a(String str, C7684l6 l6Var) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(f18738e.mo25498b());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            for (String value : this.f18740a) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
            l6Var.mo26014a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            zzbad.m20520b("unable to log", e);
        }
        m20504c(stringWriter.toString());
    }

    /* renamed from: a */
    public static void m20496a(boolean z) {
        synchronized (f18735b) {
            f18736c = true;
            f18737d = z;
        }
    }

    /* renamed from: a */
    public static boolean m20498a() {
        boolean z;
        synchronized (f18735b) {
            z = f18736c && f18737d;
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m20499a(Context context) {
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        if (!((Boolean) zzyt.m25670e().mo27163a(zzacu.f17830O0)).booleanValue()) {
            return false;
        }
        try {
            if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            zzbad.m20522c("Fail to determine debug setting.", e);
            return false;
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m20493a(String str, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    /* renamed from: a */
    static final /* synthetic */ void m20497a(byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String a = Base64Utils.m16248a(bArr);
        if (length < 10000) {
            jsonWriter.name("body").value(a);
        } else {
            String a2 = zzazt.m20468a(a);
            if (a2 != null) {
                jsonWriter.name("bodydigest").value(a2);
            }
        }
        jsonWriter.name("bodylength").value((long) length);
        jsonWriter.endObject();
    }

    /* renamed from: a */
    static final /* synthetic */ void m20491a(int i, Map map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value((long) i);
        jsonWriter.endObject();
        m20492a(jsonWriter, (Map<String, ?>) map);
        jsonWriter.endObject();
    }

    /* renamed from: a */
    static final /* synthetic */ void m20495a(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) throws IOException {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name(DeepLinkIntentReceiver.DeepLinksKeys.URI).value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        m20492a(jsonWriter, (Map<String, ?>) map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64Utils.m16248a(bArr));
        }
        jsonWriter.endObject();
    }
}
