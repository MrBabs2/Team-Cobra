package com.bumptech.glide.load.p152o.p153c;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C6022f;
import com.bumptech.glide.load.engine.p147z.C6004e;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.o.c.g */
/* compiled from: CenterCrop */
public class C6151g extends C6149e {

    /* renamed from: b */
    private static final byte[] f11253b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(C6022f.f11096a);

    public boolean equals(Object obj) {
        return obj instanceof C6151g;
    }

    public int hashCode() {
        return -599754482;
    }

    /* access modifiers changed from: protected */
    public Bitmap transform(C6004e eVar, Bitmap bitmap, int i, int i2) {
        return C6183w.m12506a(eVar, bitmap, i, i2);
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f11253b);
    }
}
