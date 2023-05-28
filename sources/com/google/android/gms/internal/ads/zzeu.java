package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;

public final class zzeu extends zzfk {

    /* renamed from: m */
    private static volatile Long f21834m;

    /* renamed from: n */
    private static final Object f21835n = new Object();

    public zzeu(zzdy zzdy, String str, String str2, zzbp.zza.C12966zza zza, int i, int i2) {
        super(zzdy, str, str2, zza, i, 22);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29271a() throws IllegalAccessException, InvocationTargetException {
        if (f21834m == null) {
            synchronized (f21835n) {
                if (f21834m == null) {
                    f21834m = (Long) this.f21856j.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f21855i) {
            this.f21855i.mo28329k(f21834m.longValue());
        }
    }
}
