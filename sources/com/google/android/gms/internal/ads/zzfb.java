package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;

public final class zzfb extends zzfk {

    /* renamed from: m */
    private final boolean f21839m;

    public zzfb(zzdy zzdy, String str, String str2, zzbp.zza.C12966zza zza, int i, int i2) {
        super(zzdy, str, str2, zza, i, 61);
        this.f21839m = zzdy.mo29251k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29271a() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.f21856j.invoke((Object) null, new Object[]{this.f21852f.mo29237a(), Boolean.valueOf(this.f21839m)})).longValue();
        synchronized (this.f21855i) {
            this.f21855i.mo28296D(longValue);
        }
    }
}
