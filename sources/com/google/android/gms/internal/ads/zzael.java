package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

@zzard
public final class zzael extends NativeAd.Image {

    /* renamed from: a */
    private final zzaei f18053a;

    /* renamed from: b */
    private final Drawable f18054b;

    /* renamed from: c */
    private final Uri f18055c;

    /* renamed from: d */
    private final double f18056d;

    /* renamed from: e */
    private final int f18057e;

    /* renamed from: f */
    private final int f18058f;

    public zzael(zzaei zzaei) {
        Drawable drawable;
        int i;
        this.f18053a = zzaei;
        Uri uri = null;
        try {
            IObjectWrapper D0 = zzaei.mo27203D0();
            if (D0 != null) {
                drawable = (Drawable) ObjectWrapper.m16390H(D0);
                this.f18054b = drawable;
                uri = this.f18053a.mo27204F();
                this.f18055c = uri;
                double d = 1.0d;
                d = this.f18053a.mo27207t0();
                this.f18056d = d;
                int i2 = -1;
                i = this.f18053a.getWidth();
                this.f18057e = i;
                i2 = this.f18053a.getHeight();
                this.f18058f = i2;
            }
        } catch (RemoteException e) {
            zzbad.m20520b("", e);
        }
        drawable = null;
        this.f18054b = drawable;
        try {
            uri = this.f18053a.mo27204F();
        } catch (RemoteException e2) {
            zzbad.m20520b("", e2);
        }
        this.f18055c = uri;
        double d2 = 1.0d;
        try {
            d2 = this.f18053a.mo27207t0();
        } catch (RemoteException e3) {
            zzbad.m20520b("", e3);
        }
        this.f18056d = d2;
        int i22 = -1;
        try {
            i = this.f18053a.getWidth();
        } catch (RemoteException e4) {
            zzbad.m20520b("", e4);
            i = -1;
        }
        this.f18057e = i;
        try {
            i22 = this.f18053a.getHeight();
        } catch (RemoteException e5) {
            zzbad.m20520b("", e5);
        }
        this.f18058f = i22;
    }

    public final Drawable getDrawable() {
        return this.f18054b;
    }

    public final int getHeight() {
        return this.f18058f;
    }

    public final double getScale() {
        return this.f18056d;
    }

    public final Uri getUri() {
        return this.f18055c;
    }

    public final int getWidth() {
        return this.f18057e;
    }
}
