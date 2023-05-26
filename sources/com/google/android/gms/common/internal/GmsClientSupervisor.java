package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public abstract class GmsClientSupervisor {

    /* renamed from: f */
    private static final Object f14127f = new Object();

    /* renamed from: g */
    private static GmsClientSupervisor f14128g;

    protected static final class zza {

        /* renamed from: a */
        private final String f14129a;

        /* renamed from: b */
        private final String f14130b;

        /* renamed from: c */
        private final ComponentName f14131c = null;

        /* renamed from: d */
        private final int f14132d;

        public zza(String str, String str2, int i) {
            Preconditions.m16046b(str);
            this.f14129a = str;
            Preconditions.m16046b(str2);
            this.f14130b = str2;
            this.f14132d = i;
        }

        /* renamed from: a */
        public final ComponentName mo25355a() {
            return this.f14131c;
        }

        /* renamed from: b */
        public final String mo25357b() {
            return this.f14130b;
        }

        /* renamed from: c */
        public final int mo25358c() {
            return this.f14132d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zza = (zza) obj;
            return Objects.m16031a(this.f14129a, zza.f14129a) && Objects.m16031a(this.f14130b, zza.f14130b) && Objects.m16031a(this.f14131c, zza.f14131c) && this.f14132d == zza.f14132d;
        }

        public final int hashCode() {
            return Objects.m16029a(this.f14129a, this.f14130b, this.f14131c, Integer.valueOf(this.f14132d));
        }

        public final String toString() {
            String str = this.f14129a;
            return str == null ? this.f14131c.flattenToString() : str;
        }

        /* renamed from: a */
        public final Intent mo25356a(Context context) {
            if (this.f14129a != null) {
                return new Intent(this.f14129a).setPackage(this.f14130b);
            }
            return new Intent().setComponent(this.f14131c);
        }
    }

    @KeepForSdk
    /* renamed from: a */
    public static GmsClientSupervisor m16007a(Context context) {
        synchronized (f14127f) {
            if (f14128g == null) {
                f14128g = new C7238j(context.getApplicationContext());
            }
        }
        return f14128g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo25353a(zza zza2, ServiceConnection serviceConnection, String str);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo25354b(zza zza2, ServiceConnection serviceConnection, String str);

    /* renamed from: a */
    public final void mo25352a(String str, String str2, int i, ServiceConnection serviceConnection, String str3) {
        mo25354b(new zza(str, str2, i), serviceConnection, str3);
    }
}
