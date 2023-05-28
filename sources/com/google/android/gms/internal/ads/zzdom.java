package com.google.android.gms.internal.ads;

public enum zzdom {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(String.class, String.class, ""),
    BYTE_STRING(zzdmr.class, zzdmr.class, zzdmr.f21488g),
    ENUM(Integer.TYPE, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    

    /* renamed from: f */
    private final Class<?> f21599f;

    /* renamed from: g */
    private final Object f21600g;

    private zzdom(Class<?> cls, Class<?> cls2, Object obj) {
        this.f21599f = cls2;
        this.f21600g = obj;
    }

    /* renamed from: a */
    public final Class<?> mo29145a() {
        return this.f21599f;
    }
}
