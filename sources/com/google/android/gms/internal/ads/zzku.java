package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzku extends Exception {
    private zzku(int i, String str, Throwable th, int i2) {
        super((String) null, th);
    }

    /* renamed from: a */
    public static zzku m24722a(Exception exc, int i) {
        return new zzku(1, (String) null, exc, i);
    }

    /* renamed from: a */
    public static zzku m24721a(IOException iOException) {
        return new zzku(0, (String) null, iOException, -1);
    }

    /* renamed from: a */
    static zzku m24723a(RuntimeException runtimeException) {
        return new zzku(2, (String) null, runtimeException, -1);
    }
}
