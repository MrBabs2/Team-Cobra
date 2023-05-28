package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p015cm.aptoide.p016pt.dataprovider.BuildConfig;

@zzard
public final class zzazt {

    /* renamed from: b */
    public static final Handler f18727b = new zzdbh(Looper.getMainLooper());

    /* renamed from: c */
    private static final String f18728c = AdView.class.getName();

    /* renamed from: d */
    private static final String f18729d = InterstitialAd.class.getName();

    /* renamed from: e */
    private static final String f18730e = PublisherAdView.class.getName();

    /* renamed from: f */
    private static final String f18731f = PublisherInterstitialAd.class.getName();

    /* renamed from: g */
    private static final String f18732g = SearchAdView.class.getName();

    /* renamed from: h */
    private static final String f18733h = AdLoader.class.getName();

    /* renamed from: a */
    private float f18734a = -1.0f;

    /* renamed from: a */
    public static void m20473a(boolean z, HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setReadTimeout(60000);
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setUseCaches(false);
    }

    /* renamed from: b */
    public static int m20475b(Context context, int i) {
        return m20466a(context.getResources().getDisplayMetrics(), i);
    }

    /* renamed from: c */
    public static boolean m20482c(Context context, int i) {
        return GoogleApiAvailabilityLight.m15275a().mo24858a(context, i) == 0;
    }

    /* renamed from: d */
    public static boolean m20483d(Context context) {
        if (context.getResources().getConfiguration().orientation != 2) {
            return false;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (((int) (((float) displayMetrics.heightPixels) / displayMetrics.density)) < 600) {
            return true;
        }
        return false;
    }

    @TargetApi(17)
    /* renamed from: e */
    public static boolean m20484e(Context context) {
        int i;
        int i2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (PlatformVersion.m16288d()) {
            defaultDisplay.getRealMetrics(displayMetrics);
            i2 = displayMetrics.heightPixels;
            i = displayMetrics.widthPixels;
        } else {
            try {
                i2 = ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                i = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
            } catch (Exception unused) {
            }
        }
        defaultDisplay.getMetrics(displayMetrics);
        int i3 = displayMetrics.heightPixels;
        int i4 = displayMetrics.widthPixels;
        if (i3 == i2 && i4 == i) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static int m20485f(Context context) {
        int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: b */
    public static int m20476b(DisplayMetrics displayMetrics, int i) {
        return Math.round(((float) i) / displayMetrics.density);
    }

    /* renamed from: b */
    public static String m20477b(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            return null;
        }
        return Settings.Secure.getString(contentResolver, "android_id");
    }

    /* renamed from: c */
    public static boolean m20481c(Context context) {
        int a = GoogleApiAvailabilityLight.m15275a().mo24858a(context, (int) GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
        return a == 0 || a == 2;
    }

    /* renamed from: b */
    public static boolean m20478b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: c */
    public static String m20480c() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(byteArray);
                instance.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(instance.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    /* renamed from: a */
    public static int m20466a(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, displayMetrics);
    }

    @VisibleForTesting
    /* renamed from: b */
    public static boolean m20479b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith((String) zzyt.m25670e().mo27163a(zzacu.f17912h))) {
            return true;
        }
        try {
            return Class.forName(str).isAnnotationPresent(zzard.class);
        } catch (Exception e) {
            String valueOf = String.valueOf(str);
            zzbad.m20517a(valueOf.length() != 0 ? "Fail to check class type for class ".concat(valueOf) : new String("Fail to check class type for class "), e);
            return false;
        }
    }

    /* renamed from: a */
    public final int mo27878a(Context context, int i) {
        if (this.f18734a < 0.0f) {
            synchronized (this) {
                if (this.f18734a < 0.0f) {
                    Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    this.f18734a = displayMetrics.density;
                }
            }
        }
        return Math.round(((float) i) / this.f18734a);
    }

    /* renamed from: a */
    public final void mo27881a(ViewGroup viewGroup, zzyd zzyd, String str, String str2) {
        zzbad.m20523d(str2);
        m20472a(viewGroup, zzyd, str, -65536, -16777216);
    }

    /* renamed from: a */
    public final void mo27880a(ViewGroup viewGroup, zzyd zzyd, String str) {
        m20472a(viewGroup, zzyd, str, -16777216, -1);
    }

    /* renamed from: a */
    private final void m20472a(ViewGroup viewGroup, zzyd zzyd, String str, int i, int i2) {
        if (viewGroup.getChildCount() == 0) {
            Context context = viewGroup.getContext();
            TextView textView = new TextView(context);
            textView.setGravity(17);
            textView.setText(str);
            textView.setTextColor(i);
            textView.setBackgroundColor(i2);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(i);
            int b = m20475b(context, 3);
            frameLayout.addView(textView, new FrameLayout.LayoutParams(zzyd.f23021k - b, zzyd.f23018h - b, 17));
            viewGroup.addView(frameLayout, zzyd.f23021k, zzyd.f23018h);
        }
    }

    /* renamed from: a */
    public static String m20467a(Context context) {
        String str;
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            str = null;
        } else {
            str = Settings.Secure.getString(contentResolver, "android_id");
        }
        if (str == null || m20474a()) {
            str = "emulator";
        }
        return m20468a(str);
    }

    /* renamed from: a */
    public static boolean m20474a() {
        return Build.DEVICE.startsWith("generic");
    }

    /* renamed from: a */
    public static String m20468a(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(str.getBytes());
                return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, instance.digest())});
            } catch (NoSuchAlgorithmException unused) {
                i++;
            } catch (ArithmeticException unused2) {
                return null;
            }
        }
        return null;
    }

    @VisibleForTesting
    /* renamed from: a */
    public static String m20469a(StackTraceElement[] stackTraceElementArr, String str) {
        int i;
        String str2;
        int i2 = 0;
        while (true) {
            i = i2 + 1;
            if (i >= stackTraceElementArr.length) {
                str2 = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            String className = stackTraceElement.getClassName();
            if (!"loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) || (!f18728c.equalsIgnoreCase(className) && !f18729d.equalsIgnoreCase(className) && !f18730e.equalsIgnoreCase(className) && !f18731f.equalsIgnoreCase(className) && !f18732g.equalsIgnoreCase(className) && !f18733h.equalsIgnoreCase(className))) {
                i2 = i;
            }
        }
        str2 = stackTraceElementArr[i].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            int i3 = 2;
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                while (true) {
                    int i4 = i3 - 1;
                    if (i3 <= 0 || !stringTokenizer.hasMoreElements()) {
                        str = sb.toString();
                    } else {
                        sb.append(".");
                        sb.append(stringTokenizer.nextToken());
                        i3 = i4;
                    }
                }
                str = sb.toString();
            }
            if (str2 == null || str2.contains(str)) {
                return null;
            }
            return str2;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo27879a(Context context, String str, String str2, Bundle bundle, boolean z) {
        m20471a(context, str, str2, bundle, true, new C7459f6(this));
    }

    /* renamed from: a */
    public static void m20471a(Context context, String str, String str2, Bundle bundle, boolean z, zzazw zzazw) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            int b = GoogleApiAvailabilityLight.m15275a().mo24878b(context);
            StringBuilder sb = new StringBuilder(23);
            sb.append(b);
            sb.append(".15000000");
            str = sb.toString();
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme(BuildConfig.APTOIDE_WEB_SERVICES_SCHEME).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter(DeepLinkIntentReceiver.DeepLinksKeys.f3452ID, str2);
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        zzazw.mo25913a(appendQueryParameter.toString());
    }

    /* renamed from: a */
    public static Throwable m20470a(Throwable th) {
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17907g)).booleanValue()) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        Throwable th2 = null;
        while (!linkedList.isEmpty()) {
            Throwable th3 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th3.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (m20479b(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    z = true;
                } else {
                    String className = stackTraceElement.getClassName();
                    if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                        arrayList.add(stackTraceElement);
                    } else {
                        arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                    }
                }
            }
            if (z) {
                if (th2 == null) {
                    th2 = new Throwable(th3.getMessage());
                } else {
                    th2 = new Throwable(th3.getMessage(), th2);
                }
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        return th2;
    }
}
