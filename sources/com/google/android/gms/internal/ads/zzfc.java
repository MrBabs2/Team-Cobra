package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;

public final class zzfc extends zzfk {

    /* renamed from: m */
    private final StackTraceElement[] f21840m;

    public zzfc(zzdy zzdy, String str, String str2, zzbp.zza.C12966zza zza, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(zzdy, str, str2, zza, i, 45);
        this.f21840m = stackTraceElementArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29271a() throws IllegalAccessException, InvocationTargetException {
        zzbz zzbz;
        Object obj = this.f21840m;
        if (obj != null) {
            zzdw zzdw = new zzdw((String) this.f21856j.invoke((Object) null, new Object[]{obj}));
            synchronized (this.f21855i) {
                this.f21855i.mo28343x(zzdw.f21769b.longValue());
                if (zzdw.f21770c.booleanValue()) {
                    zzbp.zza.C12966zza zza = this.f21855i;
                    if (zzdw.f21771d.booleanValue()) {
                        zzbz = zzbz.ENUM_FALSE;
                    } else {
                        zzbz = zzbz.ENUM_TRUE;
                    }
                    zza.mo28313c(zzbz);
                } else {
                    this.f21855i.mo28313c(zzbz.ENUM_FAILURE);
                }
            }
        }
    }
}
