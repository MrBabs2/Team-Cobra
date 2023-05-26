package com.bumptech.glide.load.p152o.p153c;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C6022f;
import com.bumptech.glide.load.engine.p147z.C6004e;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.o.c.p */
/* compiled from: FitCenter */
public class C6174p extends C6149e {

    /* renamed from: b */
    private static final byte[] f11285b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(C6022f.f11096a);

    public boolean equals(Object obj) {
        return obj instanceof C6174p;
    }

    public int hashCode() {
        return 1572326941;
    }

    /* access modifiers changed from: protected */
    public Bitmap transform(C6004e eVar, Bitmap bitmap, int i, int i2) {
        return C6183w.m12517d(eVar, bitmap, i, i2);
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f11285b);
    }
}
