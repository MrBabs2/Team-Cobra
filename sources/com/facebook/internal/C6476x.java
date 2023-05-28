package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.AccessToken;
import com.facebook.C4716f;
import com.facebook.C6371i;
import com.facebook.C6492j;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.internal.p168a0.p170f.C6391a;
import com.facebook.p032t.C6601p;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import p015cm.aptoide.p016pt.dataprovider.BuildConfig;

/* renamed from: com.facebook.internal.x */
/* compiled from: Utility */
public final class C6476x {

    /* renamed from: a */
    private static int f11921a = 0;

    /* renamed from: b */
    private static long f11922b = -1;

    /* renamed from: c */
    private static long f11923c = -1;

    /* renamed from: d */
    private static long f11924d = -1;

    /* renamed from: e */
    private static String f11925e = "";

    /* renamed from: f */
    private static String f11926f = "";

    /* renamed from: g */
    private static String f11927g = "NoCarrier";

    /* renamed from: com.facebook.internal.x$a */
    /* compiled from: Utility */
    static class C6477a implements GraphRequest.C6344f {

        /* renamed from: a */
        final /* synthetic */ C6479c f11928a;

        /* renamed from: b */
        final /* synthetic */ String f11929b;

        C6477a(C6479c cVar, String str) {
            this.f11928a = cVar;
            this.f11929b = str;
        }

        public void onCompleted(C6371i iVar) {
            if (iVar.mo20918a() != null) {
                this.f11928a.mo20871a(iVar.mo20918a().mo20815d());
                return;
            }
            C6473u.m13471a(this.f11929b, iVar.mo20919b());
            this.f11928a.mo20872a(iVar.mo20919b());
        }
    }

    /* renamed from: com.facebook.internal.x$b */
    /* compiled from: Utility */
    static class C6478b implements FilenameFilter {
        C6478b() {
        }

        public boolean accept(File file, String str) {
            return Pattern.matches("cpu[0-9]+", str);
        }
    }

    /* renamed from: com.facebook.internal.x$c */
    /* compiled from: Utility */
    public interface C6479c {
        /* renamed from: a */
        void mo20871a(FacebookException facebookException);

        /* renamed from: a */
        void mo20872a(JSONObject jSONObject);
    }

    /* renamed from: com.facebook.internal.x$d */
    /* compiled from: Utility */
    public static class C6480d {

        /* renamed from: a */
        List<String> f11930a;

        /* renamed from: b */
        List<String> f11931b;

        /* renamed from: c */
        List<String> f11932c;

        public C6480d(List<String> list, List<String> list2, List<String> list3) {
            this.f11930a = list;
            this.f11931b = list2;
            this.f11932c = list3;
        }

        /* renamed from: a */
        public List<String> mo21031a() {
            return this.f11931b;
        }

        /* renamed from: b */
        public List<String> mo21032b() {
            return this.f11932c;
        }

        /* renamed from: c */
        public List<String> mo21033c() {
            return this.f11930a;
        }
    }

    /* renamed from: a */
    public static <T> boolean m13516a(Collection<T> collection) {
        return collection == null || collection.size() == 0;
    }

    /* renamed from: b */
    public static <T> Collection<T> m13521b(T... tArr) {
        return Collections.unmodifiableCollection(Arrays.asList(tArr));
    }

    /* renamed from: c */
    public static void m13528c(String str, String str2) {
        if (C4716f.m7711t() && str != null && str2 != null) {
            Log.d(str, str2);
        }
    }

    /* renamed from: d */
    public static boolean m13533d(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: e */
    public static String m13534e(String str) {
        return m13520b("MD5", str);
    }

    /* renamed from: f */
    public static Bundle m13537f(String str) {
        Bundle bundle = new Bundle();
        if (!m13533d(str)) {
            for (String split : str.split("&")) {
                String[] split2 = split.split("=");
                try {
                    if (split2.length == 2) {
                        bundle.putString(URLDecoder.decode(split2[0], "UTF-8"), URLDecoder.decode(split2[1], "UTF-8"));
                    } else if (split2.length == 1) {
                        bundle.putString(URLDecoder.decode(split2[0], "UTF-8"), "");
                    }
                } catch (UnsupportedEncodingException e) {
                    m13507a("FacebookSDK", (Exception) e);
                }
            }
        }
        return bundle;
    }

    /* renamed from: g */
    public static String m13540g(String str) {
        if (str == null) {
            return null;
        }
        return m13520b("SHA-256", str);
    }

    /* renamed from: h */
    private static void m13544h(Context context) {
        if (f11927g.equals("NoCarrier")) {
            try {
                f11927g = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: i */
    private static int m13545i() {
        int i = f11921a;
        if (i > 0) {
            return i;
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new C6478b());
            if (listFiles != null) {
                f11921a = listFiles.length;
            }
        } catch (Exception unused) {
        }
        if (f11921a <= 0) {
            f11921a = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return f11921a;
    }

    /* renamed from: j */
    private static void m13547j() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            f11925e = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            f11926f = timeZone.getID();
        } catch (AssertionError | Exception unused) {
        }
    }

    /* renamed from: k */
    private static void m13548k() {
        try {
            if (m13512a()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f11923c = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            }
            f11923c = m13479a((double) f11923c);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static String m13486a(String str, String str2) {
        return m13533d(str) ? str2 : str;
    }

    /* renamed from: b */
    private static String m13520b(String str, String str2) {
        return m13487a(str, str2.getBytes());
    }

    /* renamed from: d */
    public static String m13530d(Context context) {
        C6481y.m13556a((Object) context, "context");
        C4716f.m7694c(context);
        return C4716f.m7697f();
    }

    /* renamed from: e */
    public static boolean m13536e(Context context) {
        AutofillManager autofillManager;
        if (Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class)) != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m13542g(Context context) {
        return m13536e(context);
    }

    /* renamed from: a */
    public static String m13490a(byte[] bArr) {
        return m13487a("SHA-1", bArr);
    }

    /* renamed from: b */
    public static List<String> m13522b(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    /* renamed from: c */
    public static boolean m13529c(Uri uri) {
        return uri != null && "file".equalsIgnoreCase(uri.getScheme());
    }

    /* renamed from: g */
    public static boolean m13541g() {
        Class<C6476x> cls = C6476x.class;
        if (C6391a.m13260a((Object) cls)) {
            return false;
        }
        try {
            JSONObject d = m13531d();
            if (d == null) {
                return false;
            }
            try {
                JSONArray jSONArray = d.getJSONArray("data_processing_options");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (jSONArray.getString(i).toLowerCase().equals("ldu")) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return false;
        }
    }

    /* renamed from: a */
    private static String m13487a(String str, byte[] bArr) {
        try {
            return m13488a(MessageDigest.getInstance(str), bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static GraphRequest m13525c(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,name,first_name,middle_name,last_name,link");
        bundle.putString("access_token", str);
        return new GraphRequest((AccessToken) null, "me", bundle, C6492j.GET, (GraphRequest.C6344f) null);
    }

    /* renamed from: h */
    private static void m13543h() {
        try {
            if (m13512a()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f11924d = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            }
            f11924d = m13479a((double) f11924d);
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public static boolean m13532d(Uri uri) {
        return uri != null && ("http".equalsIgnoreCase(uri.getScheme()) || BuildConfig.APTOIDE_WEB_SERVICES_SCHEME.equalsIgnoreCase(uri.getScheme()) || "fbstaging".equalsIgnoreCase(uri.getScheme()));
    }

    /* renamed from: e */
    public static Locale m13535e() {
        try {
            return C4716f.m7696e().getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m13488a(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(Integer.toHexString((b >> 4) & 15));
            sb.append(Integer.toHexString((b >> 0) & 15));
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m13518b() {
        Context e = C4716f.m7696e();
        if (e == null) {
            return null;
        }
        try {
            return e.getPackageManager().getPackageInfo(e.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static Locale m13527c() {
        Locale e = m13535e();
        return e != null ? e : Locale.getDefault();
    }

    /* renamed from: d */
    public static JSONObject m13531d() {
        Class<C6476x> cls = C6476x.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            String string = C4716f.m7696e().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", (String) null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: i */
    private static void m13546i(Context context) {
        if (f11922b == -1 || System.currentTimeMillis() - f11922b >= p015cm.aptoide.p016pt.BuildConfig.ANALYTICS_SESSION_INTERVAL_IN_MILLIS) {
            f11922b = System.currentTimeMillis();
            m13547j();
            m13544h(context);
            m13548k();
            m13543h();
        }
    }

    /* renamed from: b */
    public static String m13519b(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return "unknown";
        }
        return context.getClass().getSimpleName();
    }

    /* renamed from: c */
    public static String m13526c(Context context) {
        try {
            String g = C4716f.m7698g();
            if (g != null) {
                return g;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = applicationInfo.labelRes;
            if (i == 0) {
                return applicationInfo.nonLocalizedLabel.toString();
            }
            return context.getString(i);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static boolean m13524b(Uri uri) {
        return uri != null && "content".equalsIgnoreCase(uri.getScheme());
    }

    /* renamed from: a */
    public static Uri m13481a(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        return builder.build();
    }

    /* renamed from: b */
    public static JSONObject m13523b(String str) {
        JSONObject a = C6473u.m13470a(str);
        if (a != null) {
            return a;
        }
        C6371i a2 = m13525c(str).mo20825a();
        if (a2.mo20918a() != null) {
            return null;
        }
        return a2.mo20919b();
    }

    /* renamed from: f */
    public static boolean m13539f(Context context) {
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        return str != null && str.matches(".+_cheets|cheets_.+");
    }

    /* renamed from: f */
    public static boolean m13538f() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(String.format("fb%s://applinks", new Object[]{C4716f.m7697f()})));
            Context e = C4716f.m7696e();
            PackageManager packageManager = e.getPackageManager();
            String packageName = e.getPackageName();
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 65536)) {
                if (packageName.equals(resolveInfo.activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: b */
    public static C6480d m13517b(JSONObject jSONObject) throws JSONException {
        String optString;
        JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        ArrayList arrayList2 = new ArrayList(jSONArray.length());
        ArrayList arrayList3 = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            String optString2 = optJSONObject.optString("permission");
            if (!(optString2 == null || optString2.equals("installed") || (optString = optJSONObject.optString("status")) == null)) {
                if (optString.equals("granted")) {
                    arrayList.add(optString2);
                } else if (optString.equals("declined")) {
                    arrayList2.add(optString2);
                } else if (optString.equals("expired")) {
                    arrayList3.add(optString2);
                }
            }
        }
        return new C6480d(arrayList, arrayList2, arrayList3);
    }

    /* renamed from: a */
    public static void m13502a(Bundle bundle, String str, String str2) {
        if (!m13533d(str2)) {
            bundle.putString(str, str2);
        }
    }

    /* renamed from: a */
    public static void m13501a(Bundle bundle, String str, Uri uri) {
        if (uri != null) {
            m13502a(bundle, str, uri.toString());
        }
    }

    /* renamed from: a */
    public static boolean m13513a(Bundle bundle, String str, Object obj) {
        if (obj == null) {
            bundle.remove(str);
            return true;
        } else if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return true;
        } else if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
            return true;
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return true;
        } else if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
            return true;
        } else if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
            return true;
        } else if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
            return true;
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return true;
        } else if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
            return true;
        } else if (obj instanceof String) {
            bundle.putString(str, (String) obj);
            return true;
        } else if (obj instanceof JSONArray) {
            bundle.putString(str, obj.toString());
            return true;
        } else if (!(obj instanceof JSONObject)) {
            return false;
        } else {
            bundle.putString(str, obj.toString());
            return true;
        }
    }

    /* renamed from: a */
    public static void m13504a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m13509a(URLConnection uRLConnection) {
        if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    /* renamed from: a */
    public static Map<String, String> m13498a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (optString != null) {
                hashMap.put(next, optString);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static List<String> m13494a(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    /* renamed from: a */
    public static Object m13483a(JSONObject jSONObject, String str, String str2) throws JSONException {
        Object opt = jSONObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt == null || (opt instanceof JSONObject) || (opt instanceof JSONArray)) {
            return opt;
        }
        if (str2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt(str2, opt);
            return jSONObject2;
        }
        throw new FacebookException("Got an unexpected non-JSON object.");
    }

    /* renamed from: a */
    public static String m13485a(InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader;
        BufferedInputStream bufferedInputStream;
        Throwable th;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb = new StringBuilder();
                    char[] cArr = new char[RecyclerView.C0638l.FLAG_MOVED];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read != -1) {
                            sb.append(cArr, 0, read);
                        } else {
                            String sb2 = sb.toString();
                            m13504a((Closeable) bufferedInputStream);
                            m13504a((Closeable) inputStreamReader);
                            return sb2;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    m13504a((Closeable) bufferedInputStream);
                    m13504a((Closeable) inputStreamReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
                m13504a((Closeable) bufferedInputStream);
                m13504a((Closeable) inputStreamReader);
                throw th;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            inputStreamReader = null;
            m13504a((Closeable) bufferedInputStream);
            m13504a((Closeable) inputStreamReader);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m13478a(java.io.InputStream r6, java.io.OutputStream r7) throws java.io.IOException {
        /*
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0024 }
            r1.<init>(r6)     // Catch:{ all -> 0x0024 }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0021 }
            r2 = 0
            r3 = 0
        L_0x000c:
            int r4 = r1.read(r0)     // Catch:{ all -> 0x0021 }
            r5 = -1
            if (r4 == r5) goto L_0x0018
            r7.write(r0, r2, r4)     // Catch:{ all -> 0x0021 }
            int r3 = r3 + r4
            goto L_0x000c
        L_0x0018:
            r1.close()
            if (r6 == 0) goto L_0x0020
            r6.close()
        L_0x0020:
            return r3
        L_0x0021:
            r7 = move-exception
            r0 = r1
            goto L_0x0025
        L_0x0024:
            r7 = move-exception
        L_0x0025:
            if (r0 == 0) goto L_0x002a
            r0.close()
        L_0x002a:
            if (r6 == 0) goto L_0x002f
            r6.close()
        L_0x002f:
            goto L_0x0031
        L_0x0030:
            throw r7
        L_0x0031:
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C6476x.m13478a(java.io.InputStream, java.io.OutputStream):int");
    }

    /* renamed from: a */
    private static void m13500a(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager instance = CookieManager.getInstance();
        String cookie = instance.getCookie(str);
        if (cookie != null) {
            for (String split : cookie.split(";")) {
                String[] split2 = split.split("=");
                if (split2.length > 0) {
                    instance.setCookie(str, split2[0].trim() + "=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                }
            }
            instance.removeExpiredCookie();
        }
    }

    /* renamed from: a */
    public static void m13499a(Context context) {
        m13500a(context, "facebook.com");
        m13500a(context, ".facebook.com");
        m13500a(context, "https://facebook.com");
        m13500a(context, "https://.facebook.com");
    }

    /* renamed from: a */
    public static void m13507a(String str, Exception exc) {
        if (C4716f.m7711t() && str != null && exc != null) {
            Log.d(str, exc.getClass().getSimpleName() + ": " + exc.getMessage());
        }
    }

    /* renamed from: a */
    public static void m13508a(String str, String str2, Throwable th) {
        if (C4716f.m7711t() && !m13533d(str)) {
            Log.d(str, str2, th);
        }
    }

    /* renamed from: a */
    public static <T> boolean m13515a(T t, T t2) {
        if (t == null) {
            return t2 == null;
        }
        return t.equals(t2);
    }

    /* renamed from: a */
    public static <T> List<T> m13495a(T... tArr) {
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m13489a(Map<String, String> map) {
        if (map.isEmpty()) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry next : map.entrySet()) {
                jSONObject.put((String) next.getKey(), next.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static Map<String, String> m13497a(String str) {
        if (str.isEmpty()) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    /* renamed from: a */
    public static void m13511a(JSONObject jSONObject, C6372a aVar, String str, boolean z) throws JSONException {
        jSONObject.put("anon_id", str);
        jSONObject.put("application_tracking_enabled", !z);
        jSONObject.put("advertiser_id_collection_enabled", C4716f.m7695d());
        if (aVar != null) {
            if (aVar.mo20929c() != null) {
                jSONObject.put("attribution", aVar.mo20929c());
            }
            if (aVar.mo20927a() != null) {
                jSONObject.put("advertiser_id", aVar.mo20927a());
                jSONObject.put("advertiser_tracking_enabled", !aVar.mo20930d());
            }
            if (!aVar.mo20930d()) {
                String d = C6601p.m14023d();
                if (!d.isEmpty()) {
                    jSONObject.put("ud", d);
                }
            }
            if (aVar.mo20928b() != null) {
                jSONObject.put("installer_package", aVar.mo20928b());
            }
        }
    }

    /* renamed from: a */
    public static void m13510a(JSONObject jSONObject, Context context) throws JSONException {
        String str;
        Locale locale;
        int i;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        m13546i(context);
        String packageName = context.getPackageName();
        int i2 = 0;
        int i3 = -1;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            i3 = packageInfo.versionCode;
            str = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "";
        }
        jSONArray.put(packageName);
        jSONArray.put(i3);
        jSONArray.put(str);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = context.getResources().getConfiguration().locale;
        } catch (Exception unused2) {
            locale = Locale.getDefault();
        }
        jSONArray.put(locale.getLanguage() + "_" + locale.getCountry());
        jSONArray.put(f11925e);
        jSONArray.put(f11927g);
        double d = 0.0d;
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                int i4 = displayMetrics.widthPixels;
                try {
                    int i5 = displayMetrics.heightPixels;
                    try {
                        d = (double) displayMetrics.density;
                    } catch (Exception unused3) {
                    }
                    int i6 = i5;
                    i2 = i4;
                    i = i6;
                } catch (Exception unused4) {
                    i2 = i4;
                }
                jSONArray.put(i2);
                jSONArray.put(i);
                jSONArray.put(new DecimalFormat("#.##").format(d));
                jSONArray.put(m13545i());
                jSONArray.put(f11923c);
                jSONArray.put(f11924d);
                jSONArray.put(f11926f);
                jSONObject.put("extinfo", jSONArray.toString());
            }
        } catch (Exception unused5) {
        }
        i = 0;
        jSONArray.put(i2);
        jSONArray.put(i);
        jSONArray.put(new DecimalFormat("#.##").format(d));
        jSONArray.put(m13545i());
        jSONArray.put(f11923c);
        jSONArray.put(f11924d);
        jSONArray.put(f11926f);
        jSONObject.put("extinfo", jSONArray.toString());
    }

    /* renamed from: a */
    public static Method m13491a(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Method m13492a(String str, String str2, Class<?>... clsArr) {
        try {
            return m13491a(Class.forName(str), str2, clsArr);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Object m13482a(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static long m13480a(Uri uri) {
        Cursor cursor = null;
        try {
            cursor = C4716f.m7696e().getContentResolver().query(uri, (String[]) null, (String) null, (String[]) null, (String) null);
            int columnIndex = cursor.getColumnIndex("_size");
            cursor.moveToFirst();
            return cursor.getLong(columnIndex);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* renamed from: a */
    public static Date m13493a(Bundle bundle, String str, Date date) {
        long j;
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            j = ((Long) obj).longValue();
        } else if (!(obj instanceof String)) {
            return null;
        } else {
            try {
                j = Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        if (j == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date(date.getTime() + (j * 1000));
    }

    /* renamed from: a */
    public static void m13503a(Parcel parcel, Map<String, String> map) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeString((String) next.getValue());
        }
    }

    /* renamed from: a */
    public static Map<String, String> m13496a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        return hashMap;
    }

    /* renamed from: a */
    public static boolean m13514a(AccessToken accessToken) {
        return accessToken != null && accessToken.equals(AccessToken.m13036r());
    }

    /* renamed from: a */
    public static void m13506a(String str, C6479c cVar) {
        JSONObject a = C6473u.m13470a(str);
        if (a != null) {
            cVar.mo20872a(a);
            return;
        }
        C6477a aVar = new C6477a(cVar, str);
        GraphRequest c = m13525c(str);
        c.mo20827a((GraphRequest.C6344f) aVar);
        c.mo20832b();
    }

    /* renamed from: a */
    private static boolean m13512a() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    /* renamed from: a */
    private static long m13479a(double d) {
        return Math.round(d / 1.073741824E9d);
    }

    /* renamed from: a */
    public static String m13484a(int i) {
        return new BigInteger(i * 5, new Random()).toString(32);
    }

    /* renamed from: a */
    public static void m13505a(Runnable runnable) {
        try {
            C4716f.m7704m().execute(runnable);
        } catch (Exception unused) {
        }
    }
}
