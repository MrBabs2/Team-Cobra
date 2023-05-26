package com.google.android.gms.internal.ads;

public final class zzy<T> {

    /* renamed from: a */
    public final T f23002a;

    /* renamed from: b */
    public final zzc f23003b;

    /* renamed from: c */
    public final zzaf f23004c;

    /* renamed from: d */
    public boolean f23005d;

    private zzy(T t, zzc zzc) {
        this.f23005d = false;
        this.f23002a = t;
        this.f23003b = zzc;
        this.f23004c = null;
    }

    /* renamed from: a */
    public static <T> zzy<T> m25640a(T t, zzc zzc) {
        return new zzy<>(t, zzc);
    }

    /* renamed from: a */
    public static <T> zzy<T> m25639a(zzaf zzaf) {
        return new zzy<>(zzaf);
    }

    private zzy(zzaf zzaf) {
        this.f23005d = false;
        this.f23002a = null;
        this.f23003b = null;
        this.f23004c = zzaf;
    }
}
