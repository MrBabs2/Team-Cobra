package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;

public final class zzep extends zzfk {
    public zzep(zzdy zzdy, String str, String str2, zzbp.zza.C12966zza zza, int i, int i2) {
        super(zzdy, str, str2, zza, i, 5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29271a() throws IllegalAccessException, InvocationTargetException {
        this.f21855i.mo28308b(-1);
        this.f21855i.mo28312c(-1);
        int[] iArr = (int[]) this.f21856j.invoke((Object) null, new Object[]{this.f21852f.mo29237a()});
        synchronized (this.f21855i) {
            this.f21855i.mo28308b((long) iArr[0]);
            this.f21855i.mo28312c((long) iArr[1]);
            if (iArr[2] != Integer.MIN_VALUE) {
                this.f21855i.mo28294B((long) iArr[2]);
            }
        }
    }
}
