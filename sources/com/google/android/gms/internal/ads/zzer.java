package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;

public final class zzer extends zzfk {

    /* renamed from: m */
    private long f21831m;

    public zzer(zzdy zzdy, String str, String str2, zzbp.zza.C12966zza zza, long j, int i, int i2) {
        super(zzdy, str, str2, zza, i, 25);
        this.f21831m = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29271a() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.f21856j.invoke((Object) null, new Object[0])).longValue();
        synchronized (this.f21855i) {
            this.f21855i.mo28299G(longValue);
            if (this.f21831m != 0) {
                this.f21855i.mo28326i(longValue - this.f21831m);
                this.f21855i.mo28330l(this.f21831m);
            }
        }
    }
}
