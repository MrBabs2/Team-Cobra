package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

public final class zzem extends zzfk {

    /* renamed from: n */
    private static zzfl<String> f21824n = new zzfl<>();

    /* renamed from: m */
    private final Context f21825m;

    public zzem(zzdy zzdy, String str, String str2, zzbp.zza.C12966zza zza, int i, int i2, Context context) {
        super(zzdy, str, str2, zza, i, 29);
        this.f21825m = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29271a() throws IllegalAccessException, InvocationTargetException {
        this.f21855i.mo28306a("E");
        AtomicReference<String> a = f21824n.mo29276a(this.f21825m.getPackageName());
        if (a.get() == null) {
            synchronized (a) {
                if (a.get() == null) {
                    a.set((String) this.f21856j.invoke((Object) null, new Object[]{this.f21825m}));
                }
            }
        }
        String str = a.get();
        synchronized (this.f21855i) {
            this.f21855i.mo28306a(zzcg.m22509a(str.getBytes(), true));
        }
    }
}
