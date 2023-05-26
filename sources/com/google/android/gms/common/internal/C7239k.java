package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.k */
final class C7239k implements ServiceConnection {

    /* renamed from: f */
    private final Set<ServiceConnection> f14180f = new HashSet();

    /* renamed from: g */
    private int f14181g = 2;

    /* renamed from: h */
    private boolean f14182h;

    /* renamed from: i */
    private IBinder f14183i;

    /* renamed from: j */
    private final GmsClientSupervisor.zza f14184j;

    /* renamed from: k */
    private ComponentName f14185k;

    /* renamed from: l */
    private final /* synthetic */ C7238j f14186l;

    public C7239k(C7238j jVar, GmsClientSupervisor.zza zza) {
        this.f14186l = jVar;
        this.f14184j = zza;
    }

    /* renamed from: a */
    public final void mo25398a(String str) {
        this.f14181g = 3;
        boolean a = this.f14186l.f14177k.mo25488a(this.f14186l.f14175i, str, this.f14184j.mo25356a(this.f14186l.f14175i), this, this.f14184j.mo25358c());
        this.f14182h = a;
        if (a) {
            this.f14186l.f14176j.sendMessageDelayed(this.f14186l.f14176j.obtainMessage(1, this.f14184j), this.f14186l.f14179m);
            return;
        }
        this.f14181g = 2;
        try {
            this.f14186l.f14177k.mo25486a(this.f14186l.f14175i, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: b */
    public final void mo25402b(String str) {
        this.f14186l.f14176j.removeMessages(1, this.f14184j);
        this.f14186l.f14177k.mo25486a(this.f14186l.f14175i, this);
        this.f14182h = false;
        this.f14181g = 2;
    }

    /* renamed from: c */
    public final int mo25403c() {
        return this.f14181g;
    }

    /* renamed from: d */
    public final boolean mo25404d() {
        return this.f14182h;
    }

    /* renamed from: e */
    public final boolean mo25405e() {
        return this.f14180f.isEmpty();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f14186l.f14174h) {
            this.f14186l.f14176j.removeMessages(1, this.f14184j);
            this.f14183i = iBinder;
            this.f14185k = componentName;
            for (ServiceConnection onServiceConnected : this.f14180f) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f14181g = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f14186l.f14174h) {
            this.f14186l.f14176j.removeMessages(1, this.f14184j);
            this.f14183i = null;
            this.f14185k = componentName;
            for (ServiceConnection onServiceDisconnected : this.f14180f) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f14181g = 2;
        }
    }

    /* renamed from: b */
    public final void mo25401b(ServiceConnection serviceConnection, String str) {
        ConnectionTracker unused = this.f14186l.f14177k;
        Context unused2 = this.f14186l.f14175i;
        this.f14180f.remove(serviceConnection);
    }

    /* renamed from: b */
    public final ComponentName mo25400b() {
        return this.f14185k;
    }

    /* renamed from: a */
    public final void mo25397a(ServiceConnection serviceConnection, String str) {
        ConnectionTracker unused = this.f14186l.f14177k;
        Context unused2 = this.f14186l.f14175i;
        this.f14184j.mo25356a(this.f14186l.f14175i);
        this.f14180f.add(serviceConnection);
    }

    /* renamed from: a */
    public final boolean mo25399a(ServiceConnection serviceConnection) {
        return this.f14180f.contains(serviceConnection);
    }

    /* renamed from: a */
    public final IBinder mo25396a() {
        return this.f14183i;
    }
}
