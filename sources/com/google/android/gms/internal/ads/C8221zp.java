package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.zp */
final /* synthetic */ class C8221zp implements Runnable {

    /* renamed from: f */
    private final InputStream f17658f;

    /* renamed from: g */
    private final ParcelFileDescriptor f17659g;

    C8221zp(InputStream inputStream, ParcelFileDescriptor parcelFileDescriptor) {
        this.f17658f = inputStream;
        this.f17659g = parcelFileDescriptor;
    }

    public final void run() {
        zzcyc.m23114a(this.f17658f, this.f17659g);
    }
}
