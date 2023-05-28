package com.google.android.gms.internal.ads;

public class zzcgm extends Exception {

    /* renamed from: f */
    private final int f20158f;

    public zzcgm(int i) {
        this.f20158f = i;
    }

    /* renamed from: a */
    public static int m22526a(Throwable th) {
        if (th instanceof zzcgm) {
            return ((zzcgm) th).f20158f;
        }
        if (th instanceof zzayn) {
            return ((zzayn) th).mo27850a();
        }
        return 0;
    }

    public zzcgm(String str, int i) {
        super(str);
        this.f20158f = i;
    }

    public zzcgm(String str, Throwable th, int i) {
        super(str, th);
        this.f20158f = 0;
    }

    /* renamed from: a */
    public final int mo28688a() {
        return this.f20158f;
    }
}
