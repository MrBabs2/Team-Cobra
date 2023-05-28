package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.db */
final class C7390db implements zzaho<zzbgz> {

    /* renamed from: a */
    private final /* synthetic */ C7316bb f14837a;

    C7390db(C7316bb bbVar) {
        this.f14837a = bbVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25559a(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.f14837a) {
                        if (this.f14837a.f14579H != parseInt) {
                            int unused = this.f14837a.f14579H = parseInt;
                            this.f14837a.requestLayout();
                        }
                    }
                } catch (Exception e) {
                    zzbad.m20522c("Exception occurred while getting webview content height", e);
                }
            }
        }
    }
}
