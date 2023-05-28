package com.facebook.internal.p168a0;

import com.facebook.AccessToken;
import com.facebook.C4716f;
import com.facebook.GraphRequest;
import com.facebook.internal.C6476x;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.a0.d */
/* compiled from: InstrumentUtility */
public final class C6385d {

    /* renamed from: com.facebook.internal.a0.d$a */
    /* compiled from: InstrumentUtility */
    static class C6386a implements FilenameFilter {
        C6386a() {
        }

        public boolean accept(File file, String str) {
            return str.matches(String.format("^%s[0-9]+.json$", new Object[]{"analysis_log_"}));
        }
    }

    /* renamed from: com.facebook.internal.a0.d$b */
    /* compiled from: InstrumentUtility */
    static class C6387b implements FilenameFilter {
        C6387b() {
        }

        public boolean accept(File file, String str) {
            return str.matches(String.format("^(%s|%s|%s)[0-9]+.json$", new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}));
        }
    }

    /* renamed from: a */
    public static String m13245a(Throwable th) {
        if (th == null) {
            return null;
        }
        if (th.getCause() == null) {
            return th.toString();
        }
        return th.getCause().toString();
    }

    /* renamed from: b */
    public static String m13250b(Throwable th) {
        Throwable th2 = null;
        if (th == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (th != null && th != th2) {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                jSONArray.put(stackTraceElement.toString());
            }
            th2 = th;
            th = th.getCause();
        }
        return jSONArray.toString();
    }

    /* renamed from: c */
    public static boolean m13252c(Throwable th) {
        if (th == null) {
            return false;
        }
        Throwable th2 = null;
        while (th != null && th != th2) {
            for (StackTraceElement className : th.getStackTrace()) {
                if (className.getClassName().startsWith("com.facebook")) {
                    return true;
                }
            }
            th2 = th;
            th = th.getCause();
        }
        return false;
    }

    /* renamed from: a */
    public static JSONObject m13246a(String str, boolean z) {
        File a = m13244a();
        if (!(a == null || str == null)) {
            try {
                return new JSONObject(C6476x.m13485a((InputStream) new FileInputStream(new File(a, str))));
            } catch (Exception unused) {
                if (z) {
                    m13249a(str);
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public static File[] m13253c() {
        File a = m13244a();
        if (a == null) {
            return new File[0];
        }
        File[] listFiles = a.listFiles(new C6387b());
        return listFiles != null ? listFiles : new File[0];
    }

    /* renamed from: b */
    public static File[] m13251b() {
        File a = m13244a();
        if (a == null) {
            return new File[0];
        }
        File[] listFiles = a.listFiles(new C6386a());
        return listFiles != null ? listFiles : new File[0];
    }

    /* renamed from: a */
    public static void m13247a(String str, String str2) {
        File a = m13244a();
        if (a != null && str != null && str2 != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(a, str));
                fileOutputStream.write(str2.getBytes());
                fileOutputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m13249a(String str) {
        File a = m13244a();
        if (a == null || str == null) {
            return false;
        }
        return new File(a, str).delete();
    }

    /* renamed from: a */
    public static void m13248a(String str, JSONArray jSONArray, GraphRequest.C6344f fVar) {
        if (jSONArray.length() != 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(str, jSONArray.toString());
                GraphRequest.m13074a((AccessToken) null, String.format("%s/instruments", new Object[]{C4716f.m7697f()}), jSONObject, fVar).mo20832b();
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public static File m13244a() {
        File file = new File(C4716f.m7696e().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }
}
