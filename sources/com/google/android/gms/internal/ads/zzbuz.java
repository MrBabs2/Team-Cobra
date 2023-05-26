package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzbuz<T> {

    /* renamed from: a */
    public T f19504a;

    /* renamed from: b */
    public Executor f19505b;

    public zzbuz(T t, Executor executor) {
        this.f19504a = t;
        this.f19505b = executor;
    }

    /* renamed from: a */
    public static <T> zzbuz<T> m21935a(T t, Executor executor) {
        return new zzbuz<>(t, executor);
    }
}
