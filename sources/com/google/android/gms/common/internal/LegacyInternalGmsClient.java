package com.google.android.gms.common.internal;

import android.os.IInterface;
import com.google.android.gms.common.ConnectionResult;

@Deprecated
public abstract class LegacyInternalGmsClient<T extends IInterface> extends GmsClient<T> {

    /* renamed from: d */
    private final GmsClientEventManager f14136d;

    public void checkAvailabilityAndConnect() {
        this.f14136d.mo25349b();
        super.checkAvailabilityAndConnect();
    }

    public void disconnect() {
        this.f14136d.mo25343a();
        super.disconnect();
    }

    public int getMinApkVersion() {
        return super.getMinApkVersion();
    }

    public void onConnectedLocked(T t) {
        super.onConnectedLocked(t);
        this.f14136d.mo25345a(getConnectionHint());
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        super.onConnectionFailed(connectionResult);
        this.f14136d.mo25346a(connectionResult);
    }

    public void onConnectionSuspended(int i) {
        super.onConnectionSuspended(i);
        this.f14136d.mo25344a(i);
    }
}
