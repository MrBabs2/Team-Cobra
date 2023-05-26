package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;

/* renamed from: com.google.android.gms.internal.ads.se */
final /* synthetic */ class C7951se implements zzbtu {

    /* renamed from: a */
    private final String f16845a;

    /* renamed from: b */
    private final String f16846b;

    C7951se(String str, String str2) {
        this.f16845a = str;
        this.f16846b = str2;
    }

    /* renamed from: a */
    public final void mo25595a(Object obj) {
        ((AppEventListener) obj).onAppEvent(this.f16845a, this.f16846b);
    }
}
