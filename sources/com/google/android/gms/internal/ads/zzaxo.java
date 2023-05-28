package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.zzk;
import java.io.InputStream;
import java.util.Map;

@TargetApi(14)
@zzard
public class zzaxo {
    private zzaxo() {
    }

    /* renamed from: b */
    public static boolean m20329b(zzbgz zzbgz) {
        if (zzbgz == null) {
            return false;
        }
        zzbgz.onResume();
        return true;
    }

    /* renamed from: d */
    public static boolean m20330d() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    /* renamed from: a */
    public int mo27809a() {
        return 5;
    }

    /* renamed from: a */
    public String mo27815a(Context context) {
        return "";
    }

    /* renamed from: a */
    public void mo27816a(Activity activity) {
    }

    /* renamed from: a */
    public boolean mo27819a(Activity activity, Configuration configuration) {
        return false;
    }

    /* renamed from: a */
    public boolean mo27821a(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    /* renamed from: b */
    public void mo27824b(Context context) {
    }

    /* renamed from: c */
    public int mo27825c() {
        return 1;
    }

    /* renamed from: c */
    public CookieManager mo27826c(Context context) {
        if (m20330d()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzbad.m20520b("Failed to obtain CookieManager.", th);
            zzk.zzlk().mo27734a(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    /* renamed from: a */
    public boolean mo27820a(Context context, WebSettings webSettings) {
        return ((Boolean) zzazl.m20448a(context, new C7609j5(context, webSettings))).booleanValue();
    }

    /* renamed from: b */
    public ViewGroup.LayoutParams mo27823b() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    /* renamed from: a */
    public static boolean m20328a(zzbgz zzbgz) {
        if (zzbgz == null) {
            return false;
        }
        zzbgz.onPause();
        return true;
    }

    /* renamed from: b */
    public int mo27822b(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "airplane_mode_on", 0);
    }

    /* renamed from: a */
    public zzbha mo27813a(zzbgz zzbgz, zzwj zzwj, boolean z) {
        return new zzbhz(zzbgz, zzwj, z);
    }

    /* renamed from: a */
    public void mo27818a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
    }

    /* renamed from: a */
    public void mo27817a(View view, Drawable drawable) {
        view.setBackgroundDrawable(drawable);
    }

    /* renamed from: a */
    public Drawable mo27811a(Context context, Bitmap bitmap, boolean z, float f) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    /* renamed from: a */
    public zzwx mo27814a(Context context, TelephonyManager telephonyManager) {
        return zzwx.ENUM_UNKNOWN;
    }

    /* renamed from: a */
    public int mo27810a(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "wifi_on", 0);
    }

    /* renamed from: a */
    public WebResourceResponse mo27812a(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    /* renamed from: a */
    public static zzaxo m20327a(int i) {
        if (i >= 28) {
            return new zzaxy();
        }
        if (i >= 26) {
            return new zzaxx();
        }
        if (i >= 24) {
            return new zzaxw();
        }
        if (i >= 21) {
            return new zzaxv();
        }
        if (i >= 19) {
            return new zzaxu();
        }
        if (i >= 18) {
            return new zzaxs();
        }
        if (i >= 17) {
            return new zzaxr();
        }
        if (i >= 16) {
            return new zzaxt();
        }
        return new zzaxo();
    }
}
