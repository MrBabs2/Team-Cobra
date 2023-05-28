package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;

/* renamed from: com.google.android.gms.internal.ads.og */
final /* synthetic */ class C7805og implements zzbam {

    /* renamed from: a */
    private final String f16490a;

    /* renamed from: b */
    private final double f16491b;

    /* renamed from: c */
    private final int f16492c;

    /* renamed from: d */
    private final int f16493d;

    C7805og(String str, double d, int i, int i2) {
        this.f16490a = str;
        this.f16491b = d;
        this.f16492c = i;
        this.f16493d = i2;
    }

    public final Object apply(Object obj) {
        String str = this.f16490a;
        return new zzadw(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), this.f16491b, this.f16492c, this.f16493d);
    }
}
