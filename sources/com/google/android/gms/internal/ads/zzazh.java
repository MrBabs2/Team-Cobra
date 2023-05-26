package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@zzard
public final class zzazh {

    /* renamed from: a */
    private Map<Integer, Bitmap> f18704a = new ConcurrentHashMap();

    public zzazh() {
        new AtomicInteger(0);
    }

    /* renamed from: a */
    public final Bitmap mo27865a(Integer num) {
        return this.f18704a.get(num);
    }
}
