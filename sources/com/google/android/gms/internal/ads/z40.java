package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

final class z40 implements BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: a */
    private final /* synthetic */ zzvn f17552a;

    z40(zzvn zzvn) {
        this.f17552a = zzvn;
    }

    /* renamed from: a */
    public final void mo25300a(ConnectionResult connectionResult) {
        synchronized (this.f17552a.f22849b) {
            zzvy unused = this.f17552a.f22852e = null;
            if (this.f17552a.f22850c != null) {
                zzvu unused2 = this.f17552a.f22850c = null;
            }
            this.f17552a.f22849b.notifyAll();
        }
    }
}
