package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;

public final class zzff extends zzfk {

    /* renamed from: m */
    private static volatile Long f21843m;

    /* renamed from: n */
    private static final Object f21844n = new Object();

    public zzff(zzdy zzdy, String str, String str2, zzbp.zza.C12966zza zza, int i, int i2) {
        super(zzdy, str, str2, zza, i, 33);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29271a() throws IllegalAccessException, InvocationTargetException {
        if (f21843m == null) {
            synchronized (f21844n) {
                if (f21843m == null) {
                    f21843m = (Long) this.f21856j.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f21855i) {
            this.f21855i.mo28334o(f21843m.longValue());
        }
    }
}
