package p120q.p121b.p122g.p351d.p352a;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import p120q.p121b.p359l.C11544c;
import p120q.p121b.p359l.p360f.C11553c;
import p120q.p121b.p359l.p361g.C11557a;
import p120q.p121b.p359l.p361g.C11565h;
import p120q.p121b.p359l.p361g.C11568k;
import p120q.p121b.p367q.C11591b;

/* renamed from: q.b.g.d.a.a */
/* compiled from: AndroidEventBuilderHelper */
public class C11508a implements C11553c {

    /* renamed from: b */
    public static final String f30747b = "q.b.g.d.a.a";

    /* renamed from: c */
    private static final Boolean f30748c = m37651h();

    /* renamed from: d */
    private static final String f30749d = m37642c();

    /* renamed from: e */
    private static String[] f30750e = null;

    /* renamed from: a */
    private Context f30751a;

    public C11508a(Context context) {
        this.f30751a = context;
    }

    /* renamed from: b */
    protected static String m37640b() {
        try {
            return Build.MODEL.split(" ")[0];
        } catch (RuntimeException e) {
            Log.e(f30747b, "Error getting device family.", e);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0042 A[SYNTHETIC, Splitter:B:20:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0051 A[SYNTHETIC, Splitter:B:28:0x0051] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static java.lang.String m37642c() {
        /*
            java.lang.String r0 = "Exception while attempting to read kernel information"
            java.lang.String r1 = "os.version"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            r2 = 0
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x0038, RuntimeException -> 0x0036, all -> 0x0034 }
            java.lang.String r4 = "/proc/version"
            r3.<init>(r4)     // Catch:{ IOException -> 0x0038, RuntimeException -> 0x0036, all -> 0x0034 }
            boolean r4 = r3.canRead()     // Catch:{ IOException -> 0x0038, RuntimeException -> 0x0036, all -> 0x0034 }
            if (r4 != 0) goto L_0x0017
            return r1
        L_0x0017:
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0038, RuntimeException -> 0x0036, all -> 0x0034 }
            java.io.FileReader r5 = new java.io.FileReader     // Catch:{ IOException -> 0x0038, RuntimeException -> 0x0036, all -> 0x0034 }
            r5.<init>(r3)     // Catch:{ IOException -> 0x0038, RuntimeException -> 0x0036, all -> 0x0034 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0038, RuntimeException -> 0x0036, all -> 0x0034 }
            java.lang.String r1 = r4.readLine()     // Catch:{ IOException -> 0x0032, RuntimeException -> 0x0030 }
            r4.close()     // Catch:{ IOException -> 0x0029 }
            goto L_0x002f
        L_0x0029:
            r2 = move-exception
            java.lang.String r3 = f30747b
            android.util.Log.e(r3, r0, r2)
        L_0x002f:
            return r1
        L_0x0030:
            r2 = move-exception
            goto L_0x003b
        L_0x0032:
            r2 = move-exception
            goto L_0x003b
        L_0x0034:
            r1 = move-exception
            goto L_0x004f
        L_0x0036:
            r3 = move-exception
            goto L_0x0039
        L_0x0038:
            r3 = move-exception
        L_0x0039:
            r4 = r2
            r2 = r3
        L_0x003b:
            java.lang.String r3 = f30747b     // Catch:{ all -> 0x004d }
            android.util.Log.e(r3, r0, r2)     // Catch:{ all -> 0x004d }
            if (r4 == 0) goto L_0x004c
            r4.close()     // Catch:{ IOException -> 0x0046 }
            goto L_0x004c
        L_0x0046:
            r2 = move-exception
            java.lang.String r3 = f30747b
            android.util.Log.e(r3, r0, r2)
        L_0x004c:
            return r1
        L_0x004d:
            r1 = move-exception
            r2 = r4
        L_0x004f:
            if (r2 == 0) goto L_0x005b
            r2.close()     // Catch:{ IOException -> 0x0055 }
            goto L_0x005b
        L_0x0055:
            r2 = move-exception
            java.lang.String r3 = f30747b
            android.util.Log.e(r3, r0, r2)
        L_0x005b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p120q.p121b.p122g.p351d.p352a.C11508a.m37642c():java.lang.String");
    }

    /* renamed from: d */
    protected static ActivityManager.MemoryInfo m37643d(Context context) {
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (RuntimeException e) {
            Log.e(f30747b, "Error getting MemoryInfo.", e);
            return null;
        }
    }

    /* renamed from: e */
    protected static String m37646e(Context context) {
        try {
            int i = context.getResources().getConfiguration().orientation;
            if (i == 1) {
                return "portrait";
            }
            if (i != 2) {
                return null;
            }
            return "landscape";
        } catch (RuntimeException e) {
            Log.e(f30747b, "Error getting device orientation.", e);
            return null;
        }
    }

    /* renamed from: f */
    protected static PackageInfo m37647f(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException | RuntimeException e) {
            Log.e(f30747b, "Error getting package info.", e);
            return null;
        }
    }

    /* renamed from: g */
    protected static String[] m37650g(Context context) {
        String[] strArr = f30750e;
        if (strArr != null) {
            return strArr;
        }
        String[] strArr2 = new String[0];
        try {
            InputStream open = context.getAssets().open("sentry-debug-meta.properties");
            Properties properties = new Properties();
            properties.load(open);
            open.close();
            String property = properties.getProperty("io.sentry.ProguardUuids");
            if (!C11591b.m37917a(property)) {
                strArr2 = property.split("\\|");
            }
        } catch (FileNotFoundException unused) {
            Log.d(f30747b, "Proguard UUIDs file not found.");
        } catch (IOException | RuntimeException e) {
            Log.e(f30747b, "Error getting Proguard UUIDs.", e);
        }
        f30750e = strArr2;
        return strArr2;
    }

    /* renamed from: h */
    protected static Boolean m37651h() {
        boolean z;
        try {
            if (!Build.FINGERPRINT.startsWith("generic") && !Build.FINGERPRINT.startsWith("unknown") && !Build.MODEL.contains("google_sdk") && !Build.MODEL.contains("Emulator") && !Build.MODEL.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && (!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic"))) {
                if (!"google_sdk".equals(Build.PRODUCT)) {
                    z = false;
                    return Boolean.valueOf(z);
                }
            }
            z = true;
            return Boolean.valueOf(z);
        } catch (RuntimeException e) {
            Log.e(f30747b, "Error checking whether application is running in an emulator.", e);
            return null;
        }
    }

    /* renamed from: i */
    protected static boolean m37653i() {
        return Environment.getExternalStorageState().equals("mounted") && !Environment.isExternalStorageEmulated();
    }

    /* renamed from: j */
    protected static Boolean m37655j() {
        String str = Build.TAGS;
        if (str != null && str.contains("test-keys")) {
            return true;
        }
        String[] strArr = {"/data/local/bin/su", "/data/local/su", "/data/local/xbin/su", "/sbin/su", "/su/bin", "/su/bin/su", "/system/app/SuperSU", "/system/app/SuperSU.apk", "/system/app/Superuser", "/system/app/Superuser.apk", "/system/bin/failsafe/su", "/system/bin/su", "/system/sd/xbin/su", "/system/xbin/daemonsu", "/system/xbin/su"};
        int i = 0;
        while (i < 15) {
            try {
                if (new File(strArr[i]).exists()) {
                    return true;
                }
                i++;
            } catch (RuntimeException e) {
                Log.e(f30747b, "Exception while attempting to detect whether the device is rooted", e);
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo37625a(C11544c cVar) {
        cVar.mo37707e("android");
        PackageInfo f = m37647f(this.f30751a);
        if (f != null) {
            if (cVar.mo37703b().mo37686n() == null) {
                cVar.mo37706d(f.packageName + "-" + f.versionName);
            }
            if (cVar.mo37703b().mo37673e() == null) {
                cVar.mo37695a(Integer.toString(f.versionCode));
            }
        }
        String string = Settings.Secure.getString(this.f30751a.getContentResolver(), "android_id");
        if (string != null && !string.trim().equals("")) {
            cVar.mo37702a((C11565h) new C11568k("android:" + string, (String) null, (String) null, (String) null), false);
        }
        String[] g = m37650g(this.f30751a);
        if (g != null && g.length > 0) {
            C11557a aVar = new C11557a();
            for (String aVar2 : g) {
                aVar.mo37721a(new C11557a.C11558a(aVar2));
            }
            cVar.mo37701a((C11565h) aVar);
        }
        cVar.mo37699a(mo37624a());
    }

    /* renamed from: i */
    protected static boolean m37654i(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: b */
    protected static Float m37639b(Context context) {
        try {
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver == null) {
                return null;
            }
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra != -1) {
                if (intExtra2 != -1) {
                    return Float.valueOf((((float) intExtra) / ((float) intExtra2)) * 100.0f);
                }
            }
            return null;
        } catch (RuntimeException e) {
            Log.e(f30747b, "Error getting device battery level.", e);
            return null;
        }
    }

    /* renamed from: e */
    protected static Long m37645e() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return Long.valueOf(((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()));
        } catch (RuntimeException e) {
            Log.e(f30747b, "Error getting total internal storage amount.", e);
            return null;
        }
    }

    /* renamed from: f */
    protected static Long m37648f() {
        try {
            if (!m37653i()) {
                return null;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return Long.valueOf(((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize()));
        } catch (RuntimeException e) {
            Log.e(f30747b, "Error getting unused external storage amount.", e);
            return null;
        }
    }

    /* renamed from: h */
    protected static Boolean m37652h(Context context) {
        try {
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver == null) {
                return null;
            }
            int intExtra = registerReceiver.getIntExtra("plugged", -1);
            boolean z = true;
            if (intExtra != 1) {
                if (intExtra != 2) {
                    z = false;
                }
            }
            return Boolean.valueOf(z);
        } catch (RuntimeException e) {
            Log.e(f30747b, "Error getting device charging state.", e);
            return null;
        }
    }

    /* renamed from: d */
    protected static Long m37644d() {
        try {
            if (!m37653i()) {
                return null;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return Long.valueOf(((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()));
        } catch (RuntimeException e) {
            Log.e(f30747b, "Error getting total external storage amount.", e);
            return null;
        }
    }

    /* renamed from: g */
    protected static Long m37649g() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return Long.valueOf(((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize()));
        } catch (RuntimeException e) {
            Log.e(f30747b, "Error getting unused internal storage amount.", e);
            return null;
        }
    }

    /* renamed from: c */
    protected static DisplayMetrics m37641c(Context context) {
        try {
            return context.getResources().getDisplayMetrics();
        } catch (RuntimeException e) {
            Log.e(f30747b, "Error getting DisplayMetrics.", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, Map<String, Object>> mo37624a() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        hashMap.put("os", hashMap3);
        hashMap.put("device", hashMap2);
        hashMap.put("app", hashMap4);
        hashMap2.put("manufacturer", Build.MANUFACTURER);
        hashMap2.put("brand", Build.BRAND);
        hashMap2.put("model", Build.MODEL);
        hashMap2.put("family", m37640b());
        hashMap2.put("model_id", Build.ID);
        hashMap2.put("battery_level", m37639b(this.f30751a));
        hashMap2.put("orientation", m37646e(this.f30751a));
        hashMap2.put("simulator", f30748c);
        hashMap2.put("arch", Build.CPU_ABI);
        hashMap2.put("storage_size", m37645e());
        hashMap2.put("free_storage", m37649g());
        hashMap2.put("external_storage_size", m37644d());
        hashMap2.put("external_free_storage", m37648f());
        hashMap2.put("charging", m37652h(this.f30751a));
        hashMap2.put("online", Boolean.valueOf(m37654i(this.f30751a)));
        DisplayMetrics c = m37641c(this.f30751a);
        if (c != null) {
            int max = Math.max(c.widthPixels, c.heightPixels);
            int min = Math.min(c.widthPixels, c.heightPixels);
            hashMap2.put("screen_resolution", Integer.toString(max) + "x" + Integer.toString(min));
            hashMap2.put("screen_density", Float.valueOf(c.density));
            hashMap2.put("screen_dpi", Integer.valueOf(c.densityDpi));
        }
        ActivityManager.MemoryInfo d = m37643d(this.f30751a);
        if (d != null) {
            hashMap2.put("free_memory", Long.valueOf(d.availMem));
            if (Build.VERSION.SDK_INT >= 16) {
                hashMap2.put("memory_size", Long.valueOf(d.totalMem));
            }
            hashMap2.put("low_memory", Boolean.valueOf(d.lowMemory));
        }
        hashMap3.put("name", "Android");
        hashMap3.put("version", Build.VERSION.RELEASE);
        hashMap3.put("build", Build.DISPLAY);
        hashMap3.put("kernel_version", f30749d);
        hashMap3.put("rooted", m37655j());
        PackageInfo f = m37647f(this.f30751a);
        if (f != null) {
            hashMap4.put("app_version", f.versionName);
            hashMap4.put("app_build", Integer.valueOf(f.versionCode));
            hashMap4.put("app_identifier", f.packageName);
        }
        hashMap4.put("app_name", m37637a(this.f30751a));
        hashMap4.put("app_start_time", m37638a(new Date()));
        return hashMap;
    }

    /* renamed from: a */
    protected static String m37638a(Date date) {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH).format(date);
    }

    /* renamed from: a */
    protected static String m37637a(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = applicationInfo.labelRes;
            if (i != 0) {
                return context.getString(i);
            }
            if (applicationInfo.nonLocalizedLabel != null) {
                return applicationInfo.nonLocalizedLabel.toString();
            }
            return null;
        } catch (RuntimeException e) {
            Log.e(f30747b, "Error getting application name.", e);
            return null;
        }
    }
}
