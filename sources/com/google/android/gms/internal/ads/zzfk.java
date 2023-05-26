package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public abstract class zzfk implements Callable {

    /* renamed from: f */
    protected final zzdy f21852f;

    /* renamed from: g */
    private final String f21853g;

    /* renamed from: h */
    private final String f21854h;

    /* renamed from: i */
    protected final zzbp.zza.C12966zza f21855i;

    /* renamed from: j */
    protected Method f21856j;

    /* renamed from: k */
    private final int f21857k;

    /* renamed from: l */
    private final int f21858l;

    public zzfk(zzdy zzdy, String str, String str2, zzbp.zza.C12966zza zza, int i, int i2) {
        getClass().getSimpleName();
        this.f21852f = zzdy;
        this.f21853g = str;
        this.f21854h = str2;
        this.f21855i = zza;
        this.f21857k = i;
        this.f21858l = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo29271a() throws IllegalAccessException, InvocationTargetException;

    /* renamed from: b */
    public Void call() throws Exception {
        try {
            long nanoTime = System.nanoTime();
            Method a = this.f21852f.mo29238a(this.f21853g, this.f21854h);
            this.f21856j = a;
            if (a == null) {
                return null;
            }
            mo29271a();
            zzda i = this.f21852f.mo29249i();
            if (!(i == null || this.f21857k == Integer.MIN_VALUE)) {
                i.mo28868a(this.f21858l, this.f21857k, (System.nanoTime() - nanoTime) / 1000);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }
}
