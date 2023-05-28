package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.Locale;

public final class zzasf {

    /* renamed from: A */
    private int f18467A;

    /* renamed from: B */
    private String f18468B;

    /* renamed from: C */
    private boolean f18469C;

    /* renamed from: a */
    private int f18470a;

    /* renamed from: b */
    private boolean f18471b;

    /* renamed from: c */
    private boolean f18472c;

    /* renamed from: d */
    private int f18473d;

    /* renamed from: e */
    private int f18474e;

    /* renamed from: f */
    private int f18475f;

    /* renamed from: g */
    private String f18476g;

    /* renamed from: h */
    private int f18477h;

    /* renamed from: i */
    private int f18478i;

    /* renamed from: j */
    private int f18479j;

    /* renamed from: k */
    private boolean f18480k;

    /* renamed from: l */
    private int f18481l;

    /* renamed from: m */
    private double f18482m;

    /* renamed from: n */
    private boolean f18483n;

    /* renamed from: o */
    private String f18484o;

    /* renamed from: p */
    private String f18485p;

    /* renamed from: q */
    private boolean f18486q;

    /* renamed from: r */
    private boolean f18487r;

    /* renamed from: s */
    private String f18488s;

    /* renamed from: t */
    private boolean f18489t;

    /* renamed from: u */
    private final boolean f18490u;

    /* renamed from: v */
    private boolean f18491v;

    /* renamed from: w */
    private String f18492w;

    /* renamed from: x */
    private String f18493x;

    /* renamed from: y */
    private float f18494y;

    /* renamed from: z */
    private int f18495z;

    public zzasf(Context context) {
        DisplayMetrics displayMetrics;
        PackageManager packageManager = context.getPackageManager();
        m19899a(context);
        m19900b(context);
        m19901c(context);
        Locale locale = Locale.getDefault();
        boolean z = true;
        this.f18486q = m19897a(packageManager, "geo:0,0?q=donuts") != null;
        this.f18487r = m19897a(packageManager, "http://www.google.com") == null ? false : z;
        this.f18488s = locale.getCountry();
        zzyt.m25666a();
        this.f18489t = zzazt.m20474a();
        this.f18490u = DeviceProperties.m16270a(context);
        this.f18491v = DeviceProperties.m16271b(context);
        this.f18492w = locale.getLanguage();
        this.f18493x = m19898a(context, packageManager);
        this.f18468B = m19902d(context);
        Resources resources = context.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            this.f18494y = displayMetrics.density;
            this.f18495z = displayMetrics.widthPixels;
            this.f18467A = displayMetrics.heightPixels;
        }
    }

    /* renamed from: a */
    private final void m19899a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.f18470a = audioManager.getMode();
                this.f18471b = audioManager.isMusicActive();
                this.f18472c = audioManager.isSpeakerphoneOn();
                this.f18473d = audioManager.getStreamVolume(3);
                this.f18474e = audioManager.getRingerMode();
                this.f18475f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                zzk.zzlk().mo27734a(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f18470a = -2;
        this.f18471b = false;
        this.f18472c = false;
        this.f18473d = 0;
        this.f18474e = 2;
        this.f18475f = 0;
    }

    @TargetApi(16)
    /* renamed from: b */
    private final void m19900b(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f18476g = telephonyManager.getNetworkOperator();
        this.f18478i = telephonyManager.getNetworkType();
        this.f18479j = telephonyManager.getPhoneType();
        this.f18477h = -2;
        this.f18480k = false;
        this.f18481l = -1;
        zzk.zzlg();
        if (zzaxi.m20286b(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.f18477h = activeNetworkInfo.getType();
                this.f18481l = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.f18477h = -1;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                this.f18480k = connectivityManager.isActiveNetworkMetered();
            }
        }
    }

    /* renamed from: c */
    private final void m19901c(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            this.f18482m = (double) (((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
            this.f18483n = z;
            return;
        }
        this.f18482m = -1.0d;
        this.f18483n = false;
    }

    /* renamed from: d */
    private static String m19902d(Context context) {
        try {
            PackageInfo b = Wrappers.m16317a(context).mo25510b("com.android.vending", 128);
            if (b != null) {
                int i = b.versionCode;
                String str = b.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    private static String m19898a(Context context, PackageManager packageManager) {
        ActivityInfo activityInfo;
        ResolveInfo a = m19897a(packageManager, "market://details?id=com.google.android.gms.ads");
        if (a == null || (activityInfo = a.activityInfo) == null) {
            return null;
        }
        try {
            PackageInfo b = Wrappers.m16317a(context).mo25510b(activityInfo.packageName, 0);
            if (b != null) {
                int i = b.versionCode;
                String str = activityInfo.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    /* renamed from: a */
    private static ResolveInfo m19897a(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            zzk.zzlk().mo27734a(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    public zzasf(Context context, zzase zzase) {
        m19899a(context);
        m19900b(context);
        m19901c(context);
        this.f18484o = Build.FINGERPRINT;
        this.f18485p = Build.DEVICE;
        this.f18469C = PlatformVersion.m16286b() && zzads.m19024a(context);
        this.f18486q = zzase.f18453a;
        this.f18487r = zzase.f18454b;
        this.f18488s = zzase.f18455c;
        this.f18489t = zzase.f18456d;
        this.f18490u = zzase.f18457e;
        this.f18491v = zzase.f18458f;
        this.f18492w = zzase.f18459g;
        this.f18493x = zzase.f18460h;
        this.f18468B = zzase.f18461i;
        this.f18494y = zzase.f18464l;
        this.f18495z = zzase.f18465m;
        this.f18467A = zzase.f18466n;
    }

    /* renamed from: a */
    public final zzase mo27610a() {
        return new zzase(this.f18470a, this.f18486q, this.f18487r, this.f18476g, this.f18488s, this.f18489t, this.f18490u, this.f18491v, this.f18471b, this.f18472c, this.f18492w, this.f18493x, this.f18468B, this.f18473d, this.f18477h, this.f18478i, this.f18479j, this.f18474e, this.f18475f, this.f18494y, this.f18495z, this.f18467A, this.f18482m, this.f18483n, this.f18480k, this.f18481l, this.f18484o, this.f18469C, this.f18485p);
    }
}
