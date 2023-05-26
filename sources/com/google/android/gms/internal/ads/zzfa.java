package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public final class zzfa extends zzfk {

    /* renamed from: m */
    private List<Long> f21838m = null;

    public zzfa(zzdy zzdy, String str, String str2, zzbp.zza.C12966zza zza, int i, int i2) {
        super(zzdy, str, str2, zza, i, 31);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29271a() throws IllegalAccessException, InvocationTargetException {
        this.f21855i.mo28332m(-1);
        this.f21855i.mo28333n(-1);
        if (this.f21838m == null) {
            this.f21838m = (List) this.f21856j.invoke((Object) null, new Object[]{this.f21852f.mo29237a()});
        }
        List<Long> list = this.f21838m;
        if (list != null && list.size() == 2) {
            synchronized (this.f21855i) {
                this.f21855i.mo28332m(this.f21838m.get(0).longValue());
                this.f21855i.mo28333n(this.f21838m.get(1).longValue());
            }
        }
    }
}
