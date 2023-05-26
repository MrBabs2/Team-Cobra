package com.bumptech.glide.load;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.f */
/* compiled from: Key */
public interface C6022f {

    /* renamed from: a */
    public static final Charset f11096a = Charset.forName("UTF-8");

    boolean equals(Object obj);

    int hashCode();

    void updateDiskCacheKey(MessageDigest messageDigest);
}
