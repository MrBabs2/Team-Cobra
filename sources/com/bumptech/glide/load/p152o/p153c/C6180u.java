package com.bumptech.glide.load.p152o.p153c;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C6022f;
import com.bumptech.glide.load.engine.p147z.C6004e;
import com.bumptech.glide.p166r.C6315j;
import com.bumptech.glide.p166r.C6316k;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.o.c.u */
/* compiled from: RoundedCorners */
public final class C6180u extends C6149e {

    /* renamed from: c */
    private static final byte[] f11300c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(C6022f.f11096a);

    /* renamed from: b */
    private final int f11301b;

    public C6180u(int i) {
        C6315j.m12982a(i > 0, "roundingRadius must be greater than 0.");
        this.f11301b = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6180u) || this.f11301b != ((C6180u) obj).f11301b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C6316k.m12985a(-569625254, C6316k.m12997b(this.f11301b));
    }

    /* access modifiers changed from: protected */
    public Bitmap transform(C6004e eVar, Bitmap bitmap, int i, int i2) {
        return C6183w.m12513b(eVar, bitmap, this.f11301b);
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(f11300c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f11301b).array());
    }
}
