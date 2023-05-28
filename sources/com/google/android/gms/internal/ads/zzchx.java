package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.InputStream;

public abstract class zzchx implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* renamed from: a */
    protected final zzbbr<InputStream> f20223a = new zzbbr<>();

    /* renamed from: b */
    protected final Object f20224b = new Object();

    /* renamed from: c */
    protected boolean f20225c = false;

    /* renamed from: d */
    protected boolean f20226d = false;

    /* renamed from: e */
    protected zzarx f20227e;

    /* renamed from: f */
    protected zzarf f20228f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28698a() {
        synchronized (this.f20224b) {
            this.f20226d = true;
            if (this.f20228f.isConnected() || this.f20228f.isConnecting()) {
                this.f20228f.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    /* renamed from: a */
    public void mo25298a(int i) {
        zzbad.m20516a("Cannot connect to remote service, fallback to local instance.");
    }

    /* renamed from: a */
    public void mo25300a(ConnectionResult connectionResult) {
        zzbad.m20516a("Disconnected from remote ad request service.");
        this.f20223a.mo27903a(new zzcie(0));
    }
}
