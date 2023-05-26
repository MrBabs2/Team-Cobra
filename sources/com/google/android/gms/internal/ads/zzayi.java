package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import okhttp3.internal.cache.DiskLruCache;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
public final class zzayi {

    /* renamed from: a */
    private final Object f18674a = new Object();

    /* renamed from: b */
    private String f18675b = "";

    /* renamed from: c */
    private String f18676c = "";

    /* renamed from: d */
    private boolean f18677d = false;
    @VisibleForTesting

    /* renamed from: e */
    private String f18678e = "";

    @VisibleForTesting
    /* renamed from: b */
    private final boolean m20395b(Context context, String str, String str2) {
        String d = m20399d(context, m20398d(context, (String) zzyt.m25670e().mo27163a(zzacu.f17910g2), str, str2).toString(), str2);
        if (TextUtils.isEmpty(d)) {
            zzbad.m20516a("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(d.trim());
            String optString = jSONObject.optString("gct");
            this.f18678e = jSONObject.optString("status");
            synchronized (this.f18674a) {
                this.f18676c = optString;
            }
            return true;
        } catch (JSONException e) {
            zzbad.m20522c("Fail to get in app preview response json.", e);
            return false;
        }
    }

    @VisibleForTesting
    /* renamed from: c */
    private final boolean m20397c(Context context, String str, String str2) {
        String d = m20399d(context, m20398d(context, (String) zzyt.m25670e().mo27163a(zzacu.f17915h2), str, str2).toString(), str2);
        if (TextUtils.isEmpty(d)) {
            zzbad.m20516a("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = DiskLruCache.VERSION_1.equals(new JSONObject(d.trim()).optString("debug_mode"));
            synchronized (this.f18674a) {
                this.f18677d = equals;
            }
            return equals;
        } catch (JSONException e) {
            zzbad.m20522c("Fail to get debug mode response json.", e);
            return false;
        }
    }

    @VisibleForTesting
    /* renamed from: d */
    private static String m20399d(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", zzk.zzlg().mo27794a(context, str2));
        zzbbh<String> a = new zzayu(context).mo27861a(str, hashMap);
        try {
            return (String) a.get((long) ((Integer) zzyt.m25670e().mo27163a(zzacu.f17925j2)).intValue(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            String valueOf = String.valueOf(str);
            zzbad.m20520b(valueOf.length() != 0 ? "Timeout while retriving a response from: ".concat(valueOf) : new String("Timeout while retriving a response from: "), e);
            a.cancel(true);
            return null;
        } catch (InterruptedException e2) {
            String valueOf2 = String.valueOf(str);
            zzbad.m20520b(valueOf2.length() != 0 ? "Interrupted while retriving a response from: ".concat(valueOf2) : new String("Interrupted while retriving a response from: "), e2);
            a.cancel(true);
            return null;
        } catch (Exception e3) {
            String valueOf3 = String.valueOf(str);
            zzbad.m20520b(valueOf3.length() != 0 ? "Error retriving a response from: ".concat(valueOf3) : new String("Error retriving a response from: "), e3);
            return null;
        }
    }

    /* renamed from: e */
    private final void m20400e(Context context, String str, String str2) {
        zzk.zzlg();
        zzaxi.m20274a(context, m20398d(context, (String) zzyt.m25670e().mo27163a(zzacu.f17905f2), str, str2));
    }

    /* renamed from: a */
    public final void mo27845a(Context context, String str, String str2) {
        if (!m20395b(context, str, str2)) {
            m20394a(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if ("2".equals(this.f18678e)) {
            zzbad.m20516a("Creative is not pushed for this device.");
            m20394a(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if (DiskLruCache.VERSION_1.equals(this.f18678e)) {
            zzbad.m20516a("The app is not linked for creative preview.");
            m20400e(context, str, str2);
        } else if ("0".equals(this.f18678e)) {
            zzbad.m20516a("Device is linked for in app preview.");
            m20394a(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    /* renamed from: a */
    public final void mo27846a(Context context, String str, String str2, String str3) {
        boolean b = mo27847b();
        if (m20397c(context, str, str2)) {
            if (!b && !TextUtils.isEmpty(str3)) {
                m20396c(context, str2, str3, str);
            }
            zzbad.m20516a("Device is linked for debug signals.");
            m20394a(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        m20400e(context, str, str2);
    }

    /* renamed from: d */
    private final Uri m20398d(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("linkedDeviceId", m20393a(context));
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    /* renamed from: c */
    private final void m20396c(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = m20398d(context, (String) zzyt.m25670e().mo27163a(zzacu.f17920i2), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        zzk.zzlg();
        zzaxi.m20275a(context, str, buildUpon.build().toString());
    }

    /* renamed from: b */
    public final boolean mo27848b(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !zzk.zzlq().mo27847b()) {
            return false;
        }
        zzbad.m20516a("Sending troubleshooting signals to the server.");
        m20396c(context, str, str2, str3);
        return true;
    }

    /* renamed from: a */
    private final String m20393a(Context context) {
        String str;
        synchronized (this.f18674a) {
            if (TextUtils.isEmpty(this.f18675b)) {
                zzk.zzlg();
                String c = zzaxi.m20292c(context, "debug_signals_id.txt");
                this.f18675b = c;
                if (TextUtils.isEmpty(c)) {
                    zzk.zzlg();
                    this.f18675b = zzaxi.m20283b();
                    zzk.zzlg();
                    zzaxi.m20285b(context, "debug_signals_id.txt", this.f18675b);
                }
            }
            str = this.f18675b;
        }
        return str;
    }

    /* renamed from: b */
    public final boolean mo27847b() {
        boolean z;
        synchronized (this.f18674a) {
            z = this.f18677d;
        }
        return z;
    }

    /* renamed from: a */
    public final String mo27844a() {
        String str;
        synchronized (this.f18674a) {
            str = this.f18676c;
        }
        return str;
    }

    @VisibleForTesting
    /* renamed from: a */
    private final void m20394a(Context context, String str, boolean z, boolean z2) {
        if (!(context instanceof Activity)) {
            zzbad.m20521c("Can not create dialog without Activity Context");
        } else {
            zzaxi.f18651h.post(new C7942s5(this, context, str, z, z2));
        }
    }
}
