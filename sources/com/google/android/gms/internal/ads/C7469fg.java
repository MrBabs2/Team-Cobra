package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.fg */
final /* synthetic */ class C7469fg implements zzaho {

    /* renamed from: a */
    private final zzbzt f15218a;

    C7469fg(zzbzt zzbzt) {
        this.f15218a = zzbzt;
    }

    /* renamed from: a */
    public final void mo25559a(Object obj, Map map) {
        zzbgz zzbgz = (zzbgz) obj;
        zzbgz.mo25697k().mo28128a((zzbij) new C7579ig(this.f15218a, map));
        String str = (String) map.get("overlayHtml");
        String str2 = (String) map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            zzbgz.loadData(str, "text/html", "UTF-8");
        } else {
            zzbgz.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", (String) null);
        }
    }
}
