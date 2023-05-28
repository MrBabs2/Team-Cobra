package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;

public final class zzfg extends zzfk {
    public zzfg(zzdy zzdy, String str, String str2, zzbp.zza.C12966zza zza, int i, int i2) {
        super(zzdy, str, str2, zza, i, 48);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29271a() throws IllegalAccessException, InvocationTargetException {
        this.f21855i.mo28305a(zzbz.ENUM_FAILURE);
        boolean booleanValue = ((Boolean) this.f21856j.invoke((Object) null, new Object[]{this.f21852f.mo29237a()})).booleanValue();
        synchronized (this.f21855i) {
            if (booleanValue) {
                this.f21855i.mo28305a(zzbz.ENUM_TRUE);
            } else {
                this.f21855i.mo28305a(zzbz.ENUM_FALSE);
            }
        }
    }
}
