package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.qb */
final class C7874qb implements zzaho<zzbgz> {

    /* renamed from: a */
    private final /* synthetic */ C7800ob f16654a;

    C7874qb(C7800ob obVar) {
        this.f16654a = obVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25559a(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.f16654a) {
                        if (this.f16654a.f16455F != parseInt) {
                            int unused = this.f16654a.f16455F = parseInt;
                            this.f16654a.requestLayout();
                        }
                    }
                } catch (Exception e) {
                    zzbad.m20522c("Exception occurred while getting webview content height", e);
                }
            }
        }
    }
}
