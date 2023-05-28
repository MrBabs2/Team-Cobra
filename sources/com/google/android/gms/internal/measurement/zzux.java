package com.google.android.gms.internal.measurement;

public enum zzux {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(String.class, String.class, ""),
    BYTE_STRING(zzte.class, zzte.class, zzte.f23433g),
    ENUM(Integer.TYPE, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    

    /* renamed from: f */
    private final Class<?> f23522f;

    /* renamed from: g */
    private final Object f23523g;

    private zzux(Class<?> cls, Class<?> cls2, Object obj) {
        this.f23522f = cls2;
        this.f23523g = obj;
    }

    /* renamed from: a */
    public final Class<?> mo30439a() {
        return this.f23522f;
    }
}
