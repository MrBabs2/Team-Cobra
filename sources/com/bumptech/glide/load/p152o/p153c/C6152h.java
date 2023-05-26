package com.bumptech.glide.load.p152o.p153c;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C6022f;
import com.bumptech.glide.load.engine.p147z.C6004e;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.o.c.h */
/* compiled from: CenterInside */
public class C6152h extends C6149e {

    /* renamed from: b */
    private static final byte[] f11254b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(C6022f.f11096a);

    public boolean equals(Object obj) {
        return obj instanceof C6152h;
    }

    public int hashCode() {
        return -670243078;
    }

    /* access modifiers changed from: protected */
    public Bitmap transform(C6004e eVar, Bitmap bitmap, int i, int i2) {
        return C6183w.m12514b(eVar, bitmap, i, i2);
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f11254b);
    }
}
