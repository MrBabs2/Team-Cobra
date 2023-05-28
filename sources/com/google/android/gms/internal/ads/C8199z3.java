package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* renamed from: com.google.android.gms.internal.ads.z3 */
final class C8199z3 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ Bitmap f17547f;

    /* renamed from: g */
    private final /* synthetic */ zzauq f17548g;

    C8199z3(zzauq zzauq, Bitmap bitmap) {
        this.f17548g = zzauq;
        this.f17547f = bitmap;
    }

    public final void run() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f17547f.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
        synchronized (this.f17548g.f18541j) {
            this.f17548g.f18532a.f21694i = new zzdso();
            this.f17548g.f18532a.f21694i.f21706e = byteArrayOutputStream.toByteArray();
            this.f17548g.f18532a.f21694i.f21705d = "image/png";
            this.f17548g.f18532a.f21694i.f21704c = 1;
        }
    }
}
