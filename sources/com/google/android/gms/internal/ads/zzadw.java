package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

@zzard
public final class zzadw extends zzaej {

    /* renamed from: f */
    private final Drawable f18037f;

    /* renamed from: g */
    private final Uri f18038g;

    /* renamed from: h */
    private final double f18039h;

    /* renamed from: i */
    private final int f18040i;

    /* renamed from: j */
    private final int f18041j;

    public zzadw(Drawable drawable, Uri uri, double d, int i, int i2) {
        this.f18037f = drawable;
        this.f18038g = uri;
        this.f18039h = d;
        this.f18040i = i;
        this.f18041j = i2;
    }

    /* renamed from: D0 */
    public final IObjectWrapper mo27203D0() throws RemoteException {
        return ObjectWrapper.m16391a(this.f18037f);
    }

    /* renamed from: F */
    public final Uri mo27204F() throws RemoteException {
        return this.f18038g;
    }

    public final int getHeight() {
        return this.f18041j;
    }

    public final int getWidth() {
        return this.f18040i;
    }

    /* renamed from: t0 */
    public final double mo27207t0() {
        return this.f18039h;
    }
}
