package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;

public final class zzeq extends zzfk {

    /* renamed from: m */
    private static volatile Long f21829m;

    /* renamed from: n */
    private static final Object f21830n = new Object();

    public zzeq(zzdy zzdy, String str, String str2, zzbp.zza.C12966zza zza, int i, int i2) {
        super(zzdy, str, str2, zza, i, 44);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29271a() throws IllegalAccessException, InvocationTargetException {
        if (f21829m == null) {
            synchronized (f21830n) {
                if (f21829m == null) {
                    f21829m = (Long) this.f21856j.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f21855i) {
            this.f21855i.mo28342w(f21829m.longValue());
        }
    }
}
