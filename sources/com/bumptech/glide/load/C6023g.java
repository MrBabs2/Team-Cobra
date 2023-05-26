package com.bumptech.glide.load;

import android.content.Context;
import com.bumptech.glide.load.engine.C5992u;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: com.bumptech.glide.load.g */
/* compiled from: MultiTransformation */
public class C6023g<T> implements C6030l<T> {

    /* renamed from: b */
    private final Collection<? extends C6030l<T>> f11097b;

    @SafeVarargs
    public C6023g(C6030l<T>... lVarArr) {
        if (lVarArr.length != 0) {
            this.f11097b = Arrays.asList(lVarArr);
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6023g) {
            return this.f11097b.equals(((C6023g) obj).f11097b);
        }
        return false;
    }

    public int hashCode() {
        return this.f11097b.hashCode();
    }

    public C5992u<T> transform(Context context, C5992u<T> uVar, int i, int i2) {
        C5992u<T> uVar2 = uVar;
        for (C6030l transform : this.f11097b) {
            C5992u<T> transform2 = transform.transform(context, uVar2, i, i2);
            if (uVar2 != null && !uVar2.equals(uVar) && !uVar2.equals(transform2)) {
                uVar2.mo20235a();
            }
            uVar2 = transform2;
        }
        return uVar2;
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) {
        for (C6030l updateDiskCacheKey : this.f11097b) {
            updateDiskCacheKey.updateDiskCacheKey(messageDigest);
        }
    }
}
