package com.google.android.gms.internal.location;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.zzu;
import com.google.android.gms.location.zzx;
import java.util.HashMap;
import java.util.Map;

public final class zzas {

    /* renamed from: a */
    private final zzbj<zzao> f23161a;

    /* renamed from: b */
    private boolean f23162b = false;

    /* renamed from: c */
    private final Map<ListenerHolder.ListenerKey<LocationListener>, C8252e> f23163c = new HashMap();

    /* renamed from: d */
    private final Map<ListenerHolder.ListenerKey<Object>, C8251d> f23164d = new HashMap();

    /* renamed from: e */
    private final Map<ListenerHolder.ListenerKey<LocationCallback>, C8248a> f23165e = new HashMap();

    public zzas(Context context, zzbj<zzao> zzbj) {
        this.f23161a = zzbj;
    }

    /* renamed from: a */
    public final void mo30032a() throws RemoteException {
        synchronized (this.f23163c) {
            for (C8252e next : this.f23163c.values()) {
                if (next != null) {
                    this.f23161a.mo30015b().mo30028a(zzbf.m25868a((zzx) next, (zzaj) null));
                }
            }
            this.f23163c.clear();
        }
        synchronized (this.f23165e) {
            for (C8248a next2 : this.f23165e.values()) {
                if (next2 != null) {
                    this.f23161a.mo30015b().mo30028a(zzbf.m25867a((zzu) next2, (zzaj) null));
                }
            }
            this.f23165e.clear();
        }
        synchronized (this.f23164d) {
            for (C8251d next3 : this.f23164d.values()) {
                if (next3 != null) {
                    this.f23161a.mo30015b().mo30029a(new zzo(2, (zzm) null, next3.asBinder(), (IBinder) null));
                }
            }
            this.f23164d.clear();
        }
    }

    /* renamed from: a */
    public final void mo30033a(boolean z) throws RemoteException {
        this.f23161a.mo30014a();
        this.f23161a.mo30015b().mo30030a(z);
        this.f23162b = z;
    }

    /* renamed from: b */
    public final void mo30034b() throws RemoteException {
        if (this.f23162b) {
            mo30033a(false);
        }
    }
}
