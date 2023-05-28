package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;

public final class zzex extends zzfk {

    /* renamed from: m */
    private static volatile String f21836m;

    /* renamed from: n */
    private static final Object f21837n = new Object();

    public zzex(zzdy zzdy, String str, String str2, zzbp.zza.C12966zza zza, int i, int i2) {
        super(zzdy, str, str2, zza, i, 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29271a() throws IllegalAccessException, InvocationTargetException {
        this.f21855i.mo28323g("E");
        if (f21836m == null) {
            synchronized (f21837n) {
                if (f21836m == null) {
                    f21836m = (String) this.f21856j.invoke((Object) null, new Object[0]);
                }
            }
        }
        synchronized (this.f21855i) {
            this.f21855i.mo28323g(f21836m);
        }
    }
}
