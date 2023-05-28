package com.bumptech.glide.load.engine.p147z;

import android.graphics.Bitmap;

/* renamed from: com.bumptech.glide.load.engine.z.f */
/* compiled from: BitmapPoolAdapter */
public class C6005f implements C6004e {
    /* renamed from: a */
    public void mo20281a() {
    }

    /* renamed from: a */
    public void mo20282a(int i) {
    }

    /* renamed from: a */
    public void mo20283a(Bitmap bitmap) {
        bitmap.recycle();
    }

    /* renamed from: b */
    public Bitmap mo20284b(int i, int i2, Bitmap.Config config) {
        return mo20280a(i, i2, config);
    }

    /* renamed from: a */
    public Bitmap mo20280a(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }
}
