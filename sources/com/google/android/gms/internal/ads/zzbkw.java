package com.google.android.gms.internal.ads;

@zzard
public class zzbkw {

    /* renamed from: a */
    private zza f19112a;

    public static abstract class zza {
        /* renamed from: a */
        public abstract zzbgd mo28248a();

        /* renamed from: b */
        public abstract zzbcp mo28249b();

        /* renamed from: c */
        public abstract zzwo mo28250c();

        /* renamed from: d */
        public abstract zzavd mo28251d();
    }

    public zzbkw(zza zza2) {
        this.f19112a = zza2;
    }

    /* renamed from: a */
    public final zzavd mo28255a() {
        return this.f19112a.mo28251d();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.google.android.gms.internal.ads.zzauw, com.google.android.gms.internal.ads.zzavc] */
    /* renamed from: b */
    public final com.google.android.gms.ads.internal.zza mo28256b() {
        zza zza2 = this.f19112a;
        return new com.google.android.gms.ads.internal.zza(zza2.mo28248a(), zza2.mo28249b(), new zzauw(zza2.mo28251d()), zza2.mo28250c());
    }
}
