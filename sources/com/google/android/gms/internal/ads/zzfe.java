package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;

public final class zzfe extends zzfk {

    /* renamed from: m */
    private final zzeh f21841m;

    /* renamed from: n */
    private long f21842n;

    public zzfe(zzdy zzdy, String str, String str2, zzbp.zza.C12966zza zza, int i, int i2, zzeh zzeh) {
        super(zzdy, str, str2, zza, i, 53);
        this.f21841m = zzeh;
        if (zzeh != null) {
            this.f21842n = zzeh.mo29258a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29271a() throws IllegalAccessException, InvocationTargetException {
        if (this.f21841m != null) {
            this.f21855i.mo28293A(((Long) this.f21856j.invoke((Object) null, new Object[]{Long.valueOf(this.f21842n)})).longValue());
        }
    }
}
