package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* renamed from: com.google.android.gms.internal.ads.sq */
final class C7963sq implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: a */
    private final zzdba f16858a;

    /* renamed from: b */
    private final zzdau f16859b;

    /* renamed from: c */
    private final Object f16860c = new Object();

    /* renamed from: d */
    private boolean f16861d = false;

    /* renamed from: e */
    private boolean f16862e = false;

    C7963sq(Context context, Looper looper, zzdau zzdau) {
        this.f16859b = zzdau;
        this.f16858a = new zzdba(context, looper, this, this);
    }

    /* renamed from: b */
    private final void m18170b() {
        synchronized (this.f16860c) {
            if (this.f16858a.isConnected() || this.f16858a.isConnecting()) {
                this.f16858a.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo26552a() {
        synchronized (this.f16860c) {
            if (!this.f16861d) {
                this.f16861d = true;
                this.f16858a.checkAvailabilityAndConnect();
            }
        }
    }

    /* renamed from: a */
    public final void mo25298a(int i) {
    }

    /* renamed from: a */
    public final void mo25300a(ConnectionResult connectionResult) {
    }

    /* renamed from: d */
    public final void mo25299d(Bundle bundle) {
        synchronized (this.f16860c) {
            if (!this.f16862e) {
                this.f16862e = true;
                try {
                    this.f16858a.mo28891c().mo28900a(new zzday(this.f16859b.mo29065g()));
                    m18170b();
                } catch (Exception unused) {
                    m18170b();
                } catch (Throwable th) {
                    m18170b();
                    throw th;
                }
            }
        }
    }
}
