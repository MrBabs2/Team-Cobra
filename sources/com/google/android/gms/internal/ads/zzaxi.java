package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.impl.C7125R;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
public final class zzaxi {

    /* renamed from: h */
    public static final Handler f18651h = new zzaxa(Looper.getMainLooper());

    /* renamed from: a */
    private AtomicReference<Pattern> f18652a = new AtomicReference<>((Object) null);

    /* renamed from: b */
    private AtomicReference<Pattern> f18653b = new AtomicReference<>((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f18654c = true;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Object f18655d = new Object();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f18656e;

    /* renamed from: f */
    private boolean f18657f = false;

    /* renamed from: g */
    private boolean f18658g = false;

    /* renamed from: b */
    public static boolean m20286b(Context context, String str) {
        Context c = zzasq.m19919c(context);
        return Wrappers.m16317a(c).mo25506a(str, c.getPackageName()) == 0;
    }

    @VisibleForTesting
    /* renamed from: c */
    protected static String m20291c(Context context) {
        try {
            return new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return m20268a();
        }
    }

    /* renamed from: d */
    private static int[] m20297d() {
        return new int[]{0, 0};
    }

    /* renamed from: e */
    public static zzacf m20298e(Context context) {
        return new zzacf(context);
    }

    /* renamed from: f */
    public static String m20303f(Context context) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (!(activityManager == null || (runningTasks = activityManager.getRunningTasks(1)) == null || runningTasks.isEmpty() || (runningTaskInfo = runningTasks.get(0)) == null || runningTaskInfo.topActivity == null)) {
                return runningTaskInfo.topActivity.getClassName();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: g */
    public static boolean m20304g(Context context) {
        boolean z;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager != null) {
                if (keyguardManager != null) {
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses == null) {
                        return false;
                    }
                    for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                        if (Process.myPid() == next.pid) {
                            if (next.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                                return true;
                            }
                            PowerManager powerManager = (PowerManager) context.getSystemService("power");
                            if (powerManager == null) {
                                z = false;
                            } else {
                                z = powerManager.isScreenOn();
                            }
                            if (z) {
                                return false;
                            }
                            return true;
                        }
                    }
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: h */
    public static int m20305h(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            return 0;
        }
        return applicationInfo.targetSdkVersion;
    }

    /* renamed from: i */
    private static KeyguardManager m20306i(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    @TargetApi(16)
    /* renamed from: j */
    public static boolean m20307j(Context context) {
        KeyguardManager i;
        if (context == null || !PlatformVersion.m16287c() || (i = m20306i(context)) == null || !i.isKeyguardLocked()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static boolean m20308k(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi2");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            zzbad.m20520b("Error loading class.", th);
            zzk.zzlk().mo27734a(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    /* renamed from: l */
    public static String m20309l(Context context) {
        if (!((Boolean) zzyt.m25670e().mo27163a(zzacu.f17881a3)).booleanValue()) {
            return "";
        }
        return context.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
    }

    /* renamed from: m */
    public static Bundle m20310m(Context context) {
        if (!((Boolean) zzyt.m25670e().mo27163a(zzacu.f17886b3)).booleanValue()) {
            return null;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        Bundle bundle = new Bundle();
        if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
            bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
        }
        String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
        for (int i = 0; i < 4; i++) {
            String str = strArr[i];
            if (defaultSharedPreferences.contains(str)) {
                bundle.putString(str, defaultSharedPreferences.getString(str, (String) null));
            }
        }
        return bundle;
    }

    /* renamed from: n */
    public static boolean m20311n(Context context) {
        Window window;
        if (!(!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || window.getDecorView() == null)) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, (Point) null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo27800a(Context context, String str, boolean z, HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty("User-Agent", mo27794a(context, str));
        httpURLConnection.setUseCaches(false);
    }

    /* renamed from: d */
    public static boolean m20296d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m20300e(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 == 0) goto L_0x0012
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0012
            android.app.Activity r2 = (android.app.Activity) r2
            goto L_0x0013
        L_0x0012:
            r2 = r0
        L_0x0013:
            r1 = 0
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L_0x001e
            goto L_0x0022
        L_0x001e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L_0x0022:
            if (r0 == 0) goto L_0x002d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x002d
            r2 = 1
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaxi.m20300e(android.view.View):boolean");
    }

    /* renamed from: c */
    public static int m20287c(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("Could not parse value:");
            sb.append(valueOf);
            zzbad.m20523d(sb.toString());
            return 0;
        }
    }

    /* renamed from: d */
    public static AlertDialog.Builder m20294d(Context context) {
        return new AlertDialog.Builder(context);
    }

    /* renamed from: b */
    public final boolean mo27806b(Context context) {
        if (this.f18658g) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        context.getApplicationContext().registerReceiver(new C7531h5(this, (C7421e5) null), intentFilter);
        this.f18658g = true;
        return true;
    }

    /* renamed from: c */
    public static String m20290c() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: d */
    private static Bitmap m20295d(View view) {
        Bitmap bitmap = null;
        try {
            boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
            view.setDrawingCacheEnabled(true);
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                bitmap = Bitmap.createBitmap(drawingCache);
            }
            view.setDrawingCacheEnabled(isDrawingCacheEnabled);
        } catch (RuntimeException e) {
            zzbad.m20520b("Fail to capture the web view", e);
        }
        return bitmap;
    }

    /* renamed from: a */
    public static void m20275a(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            new zzazi(context, str, (String) obj).zzvi();
        }
    }

    /* renamed from: f */
    public static int m20302f(View view) {
        if (view == null) {
            return -1;
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof AdapterView)) {
            parent = parent.getParent();
        }
        if (parent == null) {
            return -1;
        }
        return ((AdapterView) parent).getPositionForView(view);
    }

    /* renamed from: c */
    public static int[] m20293c(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        if (window == null || (findViewById = window.findViewById(16908290)) == null) {
            return m20297d();
        }
        return new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    /* renamed from: e */
    public static String m20299e() {
        Resources b = zzk.zzlk().mo27735b();
        return b != null ? b.getString(C7125R.string.f13405s7) : "Test Ad";
    }

    /* renamed from: a */
    public static String m20270a(InputStreamReader inputStreamReader) throws IOException {
        StringBuilder sb = new StringBuilder(8192);
        char[] cArr = new char[RecyclerView.C0638l.FLAG_MOVED];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }

    /* renamed from: b */
    public static String m20283b() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: e */
    public static boolean m20301e(String str) {
        if (!zzazx.m20498a()) {
            return false;
        }
        if (!((Boolean) zzyt.m25670e().mo27163a(zzacu.f17960r2)).booleanValue()) {
            return false;
        }
        String str2 = (String) zzyt.m25670e().mo27163a(zzacu.f17968t2);
        if (!str2.isEmpty()) {
            for (String equals : str2.split(";")) {
                if (equals.equals(str)) {
                    return false;
                }
            }
        }
        String str3 = (String) zzyt.m25670e().mo27163a(zzacu.f17964s2);
        if (str3.isEmpty()) {
            return true;
        }
        for (String equals2 : str3.split(";")) {
            if (equals2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r0.findViewById(16908290);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int[] mo27808b(android.app.Activity r7) {
        /*
            r6 = this;
            android.view.Window r0 = r7.getWindow()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0021
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r4)
            if (r0 == 0) goto L_0x0021
            int[] r4 = new int[r1]
            int r5 = r0.getTop()
            r4[r3] = r5
            int r0 = r0.getBottom()
            r4[r2] = r0
            goto L_0x0025
        L_0x0021:
            int[] r4 = m20297d()
        L_0x0025:
            int[] r0 = new int[r1]
            com.google.android.gms.internal.ads.zzazt r1 = com.google.android.gms.internal.ads.zzyt.m25666a()
            r5 = r4[r3]
            int r1 = r1.mo27878a((android.content.Context) r7, (int) r5)
            r0[r3] = r1
            com.google.android.gms.internal.ads.zzazt r1 = com.google.android.gms.internal.ads.zzyt.m25666a()
            r3 = r4[r2]
            int r7 = r1.mo27878a((android.content.Context) r7, (int) r3)
            r0[r2] = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaxi.mo27808b(android.app.Activity):int[]");
    }

    /* renamed from: c */
    private static Bitmap m20288c(View view) {
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width != 0) {
                if (height != 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                    Canvas canvas = new Canvas(createBitmap);
                    view.layout(0, 0, width, height);
                    view.draw(canvas);
                    return createBitmap;
                }
            }
            zzbad.m20523d("Width or height of view is zero");
            return null;
        } catch (RuntimeException e) {
            zzbad.m20520b("Fail to capture the webview", e);
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo27801a(Context context) {
        if (this.f18657f) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver(new C7568i5(this, (C7421e5) null), intentFilter);
        this.f18657f = true;
        return true;
    }

    /* renamed from: b */
    public static Bitmap m20282b(View view) {
        if (view == null) {
            return null;
        }
        Bitmap d = m20295d(view);
        return d == null ? m20288c(view) : d;
    }

    @TargetApi(18)
    /* renamed from: b */
    public static void m20284b(Context context, Intent intent) {
        if (intent != null && PlatformVersion.m16289e()) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            extras.putBinder("android.support.customtabs.extra.SESSION", (IBinder) null);
            extras.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(extras);
        }
    }

    /* renamed from: c */
    public static String m20292c(Context context, String str) {
        try {
            return new String(IOUtils.m16281a((InputStream) context.openFileInput(str), true), "UTF-8");
        } catch (IOException unused) {
            zzbad.m20516a("Error reading from internal storage.");
            return "";
        }
    }

    /* renamed from: a */
    public final void mo27798a(Context context, String str, WebSettings webSettings) {
        webSettings.setUserAgentString(mo27794a(context, str));
    }

    /* renamed from: a */
    private static String m20268a() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        if (Build.VERSION.RELEASE != null) {
            sb.append(" ");
            sb.append(Build.VERSION.RELEASE);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        if (Build.DEVICE != null) {
            sb.append("; ");
            sb.append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                sb.append(" Build/");
                sb.append(Build.DISPLAY);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    /* renamed from: c */
    public static WebResourceResponse m20289c(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", zzk.zzlg().mo27794a(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new zzayu(context).mo27861a(str2, hashMap).get(60, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
            return null;
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            zzbad.m20522c("Could not fetch MRAID JS.", e);
            return null;
        }
    }

    /* renamed from: b */
    public static void m20285b(Context context, String str, String str2) {
        try {
            FileOutputStream openFileOutput = context.openFileOutput(str, 0);
            openFileOutput.write(str2.getBytes("UTF-8"));
            openFileOutput.close();
        } catch (Exception e) {
            zzbad.m20520b("Error writing to file in internal storage.", e);
        }
    }

    /* renamed from: b */
    public final boolean mo27807b(String str) {
        return m20281a(str, this.f18653b, (String) zzyt.m25670e().mo27163a(zzacu.f17913h0));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x003b, code lost:
        continue;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0045 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0025 A[Catch:{ Exception -> 0x00b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0057 A[Catch:{ Exception -> 0x00b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005c A[Catch:{ Exception -> 0x00b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a4 A[Catch:{ Exception -> 0x00b3 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo27794a(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f18655d
            monitor-enter(r0)
            java.lang.String r1 = r4.f18656e     // Catch:{ all -> 0x00cd }
            if (r1 == 0) goto L_0x000b
            java.lang.String r5 = r4.f18656e     // Catch:{ all -> 0x00cd }
            monitor-exit(r0)     // Catch:{ all -> 0x00cd }
            return r5
        L_0x000b:
            if (r6 != 0) goto L_0x0013
            java.lang.String r5 = m20268a()     // Catch:{ all -> 0x00cd }
            monitor-exit(r0)     // Catch:{ all -> 0x00cd }
            return r5
        L_0x0013:
            com.google.android.gms.internal.ads.zzaxo r1 = com.google.android.gms.ads.internal.zzk.zzli()     // Catch:{ Exception -> 0x001d }
            java.lang.String r1 = r1.mo27815a((android.content.Context) r5)     // Catch:{ Exception -> 0x001d }
            r4.f18656e = r1     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            java.lang.String r1 = r4.f18656e     // Catch:{ all -> 0x00cd }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00cd }
            if (r1 == 0) goto L_0x006b
            com.google.android.gms.internal.ads.zzyt.m25666a()     // Catch:{ all -> 0x00cd }
            boolean r1 = com.google.android.gms.internal.ads.zzazt.m20478b()     // Catch:{ all -> 0x00cd }
            if (r1 != 0) goto L_0x0065
            r1 = 0
            r4.f18656e = r1     // Catch:{ all -> 0x00cd }
            android.os.Handler r1 = f18651h     // Catch:{ all -> 0x00cd }
            com.google.android.gms.internal.ads.f5 r2 = new com.google.android.gms.internal.ads.f5     // Catch:{ all -> 0x00cd }
            r2.<init>(r4, r5)     // Catch:{ all -> 0x00cd }
            r1.post(r2)     // Catch:{ all -> 0x00cd }
        L_0x003b:
            java.lang.String r1 = r4.f18656e     // Catch:{ all -> 0x00cd }
            if (r1 != 0) goto L_0x006b
            java.lang.Object r1 = r4.f18655d     // Catch:{ InterruptedException -> 0x0045 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0045 }
            goto L_0x003b
        L_0x0045:
            java.lang.String r1 = m20268a()     // Catch:{ all -> 0x00cd }
            r4.f18656e = r1     // Catch:{ all -> 0x00cd }
            java.lang.String r2 = "Interrupted, use default user agent: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00cd }
            int r3 = r1.length()     // Catch:{ all -> 0x00cd }
            if (r3 == 0) goto L_0x005c
            java.lang.String r1 = r2.concat(r1)     // Catch:{ all -> 0x00cd }
            goto L_0x0061
        L_0x005c:
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x00cd }
            r1.<init>(r2)     // Catch:{ all -> 0x00cd }
        L_0x0061:
            com.google.android.gms.internal.ads.zzbad.m20523d(r1)     // Catch:{ all -> 0x00cd }
            goto L_0x003b
        L_0x0065:
            java.lang.String r1 = m20291c((android.content.Context) r5)     // Catch:{ all -> 0x00cd }
            r4.f18656e = r1     // Catch:{ all -> 0x00cd }
        L_0x006b:
            java.lang.String r1 = r4.f18656e     // Catch:{ all -> 0x00cd }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00cd }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00cd }
            int r2 = r2.length()     // Catch:{ all -> 0x00cd }
            int r2 = r2 + 10
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00cd }
            int r3 = r3.length()     // Catch:{ all -> 0x00cd }
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cd }
            r3.<init>(r2)     // Catch:{ all -> 0x00cd }
            r3.append(r1)     // Catch:{ all -> 0x00cd }
            java.lang.String r1 = " (Mobile; "
            r3.append(r1)     // Catch:{ all -> 0x00cd }
            r3.append(r6)     // Catch:{ all -> 0x00cd }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x00cd }
            r4.f18656e = r6     // Catch:{ all -> 0x00cd }
            com.google.android.gms.common.wrappers.PackageManagerWrapper r5 = com.google.android.gms.common.wrappers.Wrappers.m16317a(r5)     // Catch:{ Exception -> 0x00b3 }
            boolean r5 = r5.mo25508a()     // Catch:{ Exception -> 0x00b3 }
            if (r5 == 0) goto L_0x00bd
            java.lang.String r5 = r4.f18656e     // Catch:{ Exception -> 0x00b3 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x00b3 }
            java.lang.String r6 = ";aia"
            java.lang.String r5 = r5.concat(r6)     // Catch:{ Exception -> 0x00b3 }
            r4.f18656e = r5     // Catch:{ Exception -> 0x00b3 }
            goto L_0x00bd
        L_0x00b3:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzawm r6 = com.google.android.gms.ads.internal.zzk.zzlk()     // Catch:{ all -> 0x00cd }
            java.lang.String r1 = "AdUtil.getUserAgent"
            r6.mo27734a((java.lang.Throwable) r5, (java.lang.String) r1)     // Catch:{ all -> 0x00cd }
        L_0x00bd:
            java.lang.String r5 = r4.f18656e     // Catch:{ all -> 0x00cd }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00cd }
            java.lang.String r6 = ")"
            java.lang.String r5 = r5.concat(r6)     // Catch:{ all -> 0x00cd }
            r4.f18656e = r5     // Catch:{ all -> 0x00cd }
            monitor-exit(r0)     // Catch:{ all -> 0x00cd }
            return r5
        L_0x00cd:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00cd }
            goto L_0x00d1
        L_0x00d0:
            throw r5
        L_0x00d1:
            goto L_0x00d0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaxi.mo27794a(android.content.Context, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public final JSONObject mo27797a(Map<String, ?> map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String next : map.keySet()) {
                m20279a(jSONObject, next, (Object) map.get(next));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(e.getMessage());
            throw new JSONException(valueOf.length() != 0 ? "Could not convert map to JSON: ".concat(valueOf) : new String("Could not convert map to JSON: "));
        }
    }

    /* renamed from: a */
    public final JSONObject mo27796a(Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return mo27795a(bundle);
            } catch (JSONException e) {
                zzbad.m20520b("Error converting Bundle to JSON", e);
            }
        }
        return null;
    }

    /* renamed from: a */
    public final JSONObject mo27795a(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            m20279a(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    /* renamed from: a */
    private final JSONArray m20272a(Collection<?> collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object a : collection) {
            m20278a(jSONArray, (Object) a);
        }
        return jSONArray;
    }

    /* renamed from: a */
    private final void m20278a(JSONArray jSONArray, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONArray.put(mo27795a((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONArray.put(mo27797a((Map<String, ?>) (Map) obj));
        } else if (obj instanceof Collection) {
            jSONArray.put(m20272a((Collection<?>) (Collection) obj));
        } else if (obj instanceof Object[]) {
            JSONArray jSONArray2 = new JSONArray();
            for (Object a : (Object[]) obj) {
                m20278a(jSONArray2, a);
            }
            jSONArray.put(jSONArray2);
        } else {
            jSONArray.put(obj);
        }
    }

    /* renamed from: a */
    private final void m20279a(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONObject.put(str, mo27795a((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONObject.put(str, mo27797a((Map<String, ?>) (Map) obj));
        } else if (obj instanceof Collection) {
            if (str == null) {
                str = "null";
            }
            jSONObject.put(str, m20272a((Collection<?>) (Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, m20272a((Collection<?>) Arrays.asList((Object[]) obj)));
        } else {
            jSONObject.put(str, obj);
        }
    }

    /* renamed from: a */
    private static int m20262a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'A';
        if (c < 'A' || c > 'F') {
            c2 = 'a';
            if (c < 'a' || c > 'f') {
                throw new IllegalArgumentException("Invalid Hex.");
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: a */
    public static Map<String, String> m20271a(Uri uri) {
        if (!((Boolean) zzyt.m25670e().mo27163a(zzacu.f17921i3)).booleanValue()) {
            if (uri == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            zzk.zzli();
            for (String next : uri.getQueryParameterNames()) {
                hashMap.put(next, uri.getQueryParameter(next));
            }
            return hashMap;
        } else if (uri == null) {
            return null;
        } else {
            HashMap hashMap2 = new HashMap(20);
            String encodedQuery = uri.getEncodedQuery();
            if (encodedQuery == null) {
                return hashMap2;
            }
            int length = encodedQuery.length();
            StringBuilder sb = new StringBuilder(100);
            StringBuilder sb2 = new StringBuilder(length);
            StringBuilder sb3 = sb;
            int i = 0;
            while (i < length) {
                char charAt = encodedQuery.charAt(i);
                if (charAt == '%') {
                    byte[] bArr = new byte[((length - i) / 3)];
                    int i2 = 0;
                    while (i < length - 2 && charAt == '%') {
                        try {
                            bArr[i2] = (byte) ((m20262a(encodedQuery.charAt(i + 1)) << 4) + m20262a(encodedQuery.charAt(i + 2)));
                            i2++;
                        } catch (IllegalArgumentException unused) {
                        }
                        i += 3;
                        if (i < length) {
                            charAt = encodedQuery.charAt(i);
                        }
                    }
                    try {
                        sb3.append(new String(bArr, 0, i2, "UTF-8"));
                    } catch (UnsupportedEncodingException unused2) {
                    }
                    if (charAt != '%') {
                    }
                } else if (charAt == '&') {
                    if (sb.length() > 0 && sb3 != sb) {
                        hashMap2.put(sb.toString(), sb2.toString());
                        sb.setLength(0);
                        sb2.setLength(0);
                    }
                    sb3 = sb;
                } else if (charAt == '+') {
                    sb3.append(' ');
                } else if (charAt != '=') {
                    sb3.append(charAt);
                } else if (sb3 != sb2) {
                    sb3 = sb2;
                } else {
                    sb3.append(charAt);
                }
                i++;
            }
            if (sb.length() > 0 && sb3 != sb) {
                hashMap2.put(sb.toString(), sb2.toString());
            }
            return hashMap2;
        }
    }

    /* renamed from: a */
    public final int[] mo27805a(Activity activity) {
        int[] c = m20293c(activity);
        return new int[]{zzyt.m25666a().mo27878a((Context) activity, c[0]), zzyt.m25666a().mo27878a((Context) activity, c[1])};
    }

    /* renamed from: a */
    public static DisplayMetrics m20264a(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* renamed from: a */
    public static Bitmap m20263a(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return createBitmap;
    }

    /* renamed from: a */
    public static PopupWindow m20266a(View view, int i, int i2, boolean z) {
        return new PopupWindow(view, i, i2, false);
    }

    /* renamed from: a */
    public final void mo27799a(Context context, String str, String str2, Bundle bundle, boolean z) {
        zzk.zzlg();
        bundle.putString("device", m20290c());
        bundle.putString("eids", TextUtils.join(",", zzacu.m18982a()));
        zzyt.m25666a();
        zzazt.m20471a(context, str, str2, bundle, true, new C7495g5(this, context, str));
    }

    /* renamed from: a */
    public static void m20277a(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            zzaxg.m20259a(runnable);
        }
    }

    /* renamed from: a */
    public static void m20273a(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public final boolean mo27802a(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return mo27803a(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, m20306i(context));
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0062 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo27803a(android.view.View r4, android.os.PowerManager r5, android.app.KeyguardManager r6) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzaxi r0 = com.google.android.gms.ads.internal.zzk.zzlg()
            boolean r0 = r0.f18654c
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001d
            if (r6 != 0) goto L_0x000e
            r6 = 0
            goto L_0x0012
        L_0x000e:
            boolean r6 = r6.inKeyguardRestrictedInputMode()
        L_0x0012:
            if (r6 == 0) goto L_0x001d
            boolean r6 = m20300e((android.view.View) r4)
            if (r6 == 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r6 = 0
            goto L_0x001e
        L_0x001d:
            r6 = 1
        L_0x001e:
            int r0 = r4.getVisibility()
            if (r0 != 0) goto L_0x0063
            boolean r0 = r4.isShown()
            if (r0 == 0) goto L_0x0063
            if (r5 == 0) goto L_0x0035
            boolean r5 = r5.isScreenOn()
            if (r5 == 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r5 = 0
            goto L_0x0036
        L_0x0035:
            r5 = 1
        L_0x0036:
            if (r5 == 0) goto L_0x0063
            if (r6 == 0) goto L_0x0063
            com.google.android.gms.internal.ads.zzacj<java.lang.Boolean> r5 = com.google.android.gms.internal.ads.zzacu.f17854U0
            com.google.android.gms.internal.ads.zzacr r6 = com.google.android.gms.internal.ads.zzyt.m25670e()
            java.lang.Object r5 = r6.mo27163a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0062
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r4.getLocalVisibleRect(r5)
            if (r5 != 0) goto L_0x0062
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r4 = r4.getGlobalVisibleRect(r5)
            if (r4 == 0) goto L_0x0063
        L_0x0062:
            return r1
        L_0x0063:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaxi.mo27803a(android.view.View, android.os.PowerManager, android.app.KeyguardManager):boolean");
    }

    @TargetApi(18)
    /* renamed from: a */
    public static void m20274a(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            m20284b(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(uri2).length() + 26);
            sb.append("Opening ");
            sb.append(uri2);
            sb.append(" in a new browser.");
            zzbad.m20516a(sb.toString());
        } catch (ActivityNotFoundException e) {
            zzbad.m20520b("No browser is found.", e);
        }
    }

    /* renamed from: a */
    public final boolean mo27804a(String str) {
        return m20281a(str, this.f18652a, (String) zzyt.m25670e().mo27163a(zzacu.f17908g0));
    }

    /* renamed from: a */
    private static boolean m20281a(String str, AtomicReference<Pattern> atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static WebResourceResponse m20265a(HttpURLConnection httpURLConnection) throws IOException {
        String str;
        zzk.zzlg();
        String contentType = httpURLConnection.getContentType();
        String str2 = "";
        if (TextUtils.isEmpty(contentType)) {
            str = str2;
        } else {
            str = contentType.split(";")[0].trim();
        }
        zzk.zzlg();
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] split = contentType2.split(";");
            if (split.length != 1) {
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    if (split[i].trim().startsWith("charset")) {
                        String[] split2 = split[i].trim().split("=");
                        if (split2.length > 1) {
                            str2 = split2[1].trim();
                            break;
                        }
                    }
                    i++;
                }
            }
        }
        String str3 = str2;
        Map headerFields = httpURLConnection.getHeaderFields();
        HashMap hashMap = new HashMap(headerFields.size());
        for (Map.Entry entry : headerFields.entrySet()) {
            if (!(entry.getKey() == null || entry.getValue() == null || ((List) entry.getValue()).size() <= 0)) {
                hashMap.put((String) entry.getKey(), (String) ((List) entry.getValue()).get(0));
            }
        }
        return zzk.zzli().mo27812a(str, str3, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
    }

    /* renamed from: a */
    public static void m20276a(Context context, Throwable th) {
        if (context != null) {
            boolean z = false;
            try {
                z = ((Boolean) zzyt.m25670e().mo27163a(zzacu.f17902f)).booleanValue();
            } catch (IllegalStateException unused) {
            }
            if (z) {
                CrashUtils.m16263a(context, th);
            }
        }
    }
}
