package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzk;
import java.io.InputStream;

public final class zzchz extends zzchx {
    public zzchz(Context context) {
        this.f20228f = new zzarf(context, zzk.zzlu().mo27864b(), this, this);
    }

    /* renamed from: a */
    public final zzbbh<InputStream> mo28699a(zzarx zzarx) {
        synchronized (this.f20224b) {
            if (this.f20225c) {
                zzbbr<InputStream> zzbbr = this.f20223a;
                return zzbbr;
            }
            this.f20225c = true;
            this.f20227e = zzarx;
            this.f20228f.checkAvailabilityAndConnect();
            this.f20223a.mo25573b(new C7623jj(this), zzbbm.f18749b);
            zzbbr<InputStream> zzbbr2 = this.f20223a;
            return zzbbr2;
        }
    }

    /* renamed from: d */
    public final void mo25299d(Bundle bundle) {
        synchronized (this.f20224b) {
            if (!this.f20226d) {
                this.f20226d = true;
                try {
                    this.f20228f.mo27577c().mo27590b(this.f20227e, new zzchy(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.f20223a.mo27903a(new zzcie(0));
                } catch (Throwable th) {
                    zzk.zzlk().mo27734a(th, "RemoteSignalsClientTask.onConnected");
                    this.f20223a.mo27903a(new zzcie(0));
                }
            }
        }
    }
}
