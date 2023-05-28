package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.gms.internal.ads.zzbhx;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzbih;

@TargetApi(17)
@zzard
public final class zzbht<WebViewT extends zzbhx & zzbif & zzbih> {

    /* renamed from: a */
    private final zzbhw f19012a;

    /* renamed from: b */
    private final WebViewT f19013b;

    private zzbht(WebViewT webviewt, zzbhw zzbhw) {
        this.f19012a = zzbhw;
        this.f19013b = webviewt;
    }

    /* renamed from: a */
    public static zzbht<zzbgz> m21074a(zzbgz zzbgz) {
        return new zzbht<>(zzbgz, new C7537hb(zzbgz));
    }

    @JavascriptInterface
    public final String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            zzawz.m20167e("Click string is empty, not proceeding.");
            return "";
        }
        zzdh d = ((zzbif) this.f19013b).mo25682d();
        if (d == null) {
            zzawz.m20167e("Signal utils is empty, ignoring.");
            return "";
        }
        zzdc a = d.mo29015a();
        if (a == null) {
            zzawz.m20167e("Signals object is empty, ignoring.");
            return "";
        } else if (this.f19013b.getContext() != null) {
            return a.zza(this.f19013b.getContext(), str, ((zzbih) this.f19013b).getView(), this.f19013b.mo25650a());
        } else {
            zzawz.m20167e("Context is null, ignoring.");
            return "";
        }
    }

    @JavascriptInterface
    public final void notify(String str) {
        if (TextUtils.isEmpty(str)) {
            zzbad.m20523d("URL is empty, ignoring message");
        } else {
            zzaxi.f18651h.post(new C7574ib(this, str));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo28165a(String str) {
        this.f19012a.mo26023a(Uri.parse(str));
    }
}
