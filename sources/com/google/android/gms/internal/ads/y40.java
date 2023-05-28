package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

final class y40 implements BaseGmsClient.BaseConnectionCallbacks {

    /* renamed from: a */
    private final /* synthetic */ zzvn f17271a;

    y40(zzvn zzvn) {
        this.f17271a = zzvn;
    }

    /* renamed from: a */
    public final void mo25298a(int i) {
        synchronized (this.f17271a.f22849b) {
            zzvy unused = this.f17271a.f22852e = null;
            this.f17271a.f22849b.notifyAll();
        }
    }

    /* renamed from: d */
    public final void mo25299d(Bundle bundle) {
        synchronized (this.f17271a.f22849b) {
            try {
                if (this.f17271a.f22850c != null) {
                    zzvy unused = this.f17271a.f22852e = this.f17271a.f22850c.mo29850c();
                }
            } catch (DeadObjectException e) {
                zzbad.m20520b("Unable to obtain a cache service instance.", e);
                this.f17271a.m25441c();
            }
            this.f17271a.f22849b.notifyAll();
        }
    }
}
