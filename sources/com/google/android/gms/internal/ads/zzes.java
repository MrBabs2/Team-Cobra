package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.ads.zzbp;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public final class zzes extends zzfk {
    public zzes(zzdy zzdy, String str, String str2, zzbp.zza.C12966zza zza, int i, int i2) {
        super(zzdy, str, str2, zza, i, 24);
    }

    /* renamed from: c */
    private final void m24312c() {
        AdvertisingIdClient n = this.f21852f.mo29254n();
        if (n != null) {
            try {
                AdvertisingIdClient.Info info = n.getInfo();
                String a = zzef.m24288a(info.getId());
                if (a != null) {
                    synchronized (this.f21855i) {
                        this.f21855i.mo28321f(a);
                        this.f21855i.mo28307a(info.isLimitAdTrackingEnabled());
                        this.f21855i.mo28301a(zzbp.zza.zzc.DEVICE_IDENTIFIER_ANDROID_AD_ID);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29271a() throws IllegalAccessException, InvocationTargetException {
        if (this.f21852f.mo29248h()) {
            m24312c();
            return;
        }
        synchronized (this.f21855i) {
            this.f21855i.mo28321f((String) this.f21856j.invoke((Object) null, new Object[]{this.f21852f.mo29237a()}));
        }
    }

    /* renamed from: b */
    public final Void call() throws Exception {
        if (this.f21852f.mo29242b()) {
            return super.call();
        }
        if (!this.f21852f.mo29248h()) {
            return null;
        }
        m24312c();
        return null;
    }
}
