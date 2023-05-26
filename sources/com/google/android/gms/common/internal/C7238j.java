package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.common.zze;
import java.util.HashMap;
import p015cm.aptoide.p016pt.notification.sync.LocalNotificationSyncManager;

/* renamed from: com.google.android.gms.common.internal.j */
final class C7238j extends GmsClientSupervisor implements Handler.Callback {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final HashMap<GmsClientSupervisor.zza, C7239k> f14174h = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Context f14175i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Handler f14176j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final ConnectionTracker f14177k;

    /* renamed from: l */
    private final long f14178l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final long f14179m;

    C7238j(Context context) {
        this.f14175i = context.getApplicationContext();
        this.f14176j = new zze(context.getMainLooper(), this);
        this.f14177k = ConnectionTracker.m16228a();
        this.f14178l = 5000;
        this.f14179m = LocalNotificationSyncManager.FIVE_MINUTES;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo25353a(GmsClientSupervisor.zza zza, ServiceConnection serviceConnection, String str) {
        boolean d;
        Preconditions.m16038a(serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f14174h) {
            C7239k kVar = this.f14174h.get(zza);
            if (kVar == null) {
                kVar = new C7239k(this, zza);
                kVar.mo25397a(serviceConnection, str);
                kVar.mo25398a(str);
                this.f14174h.put(zza, kVar);
            } else {
                this.f14176j.removeMessages(0, zza);
                if (!kVar.mo25399a(serviceConnection)) {
                    kVar.mo25397a(serviceConnection, str);
                    int c = kVar.mo25403c();
                    if (c == 1) {
                        serviceConnection.onServiceConnected(kVar.mo25400b(), kVar.mo25396a());
                    } else if (c == 2) {
                        kVar.mo25398a(str);
                    }
                } else {
                    String valueOf = String.valueOf(zza);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            d = kVar.mo25404d();
        }
        return d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo25354b(GmsClientSupervisor.zza zza, ServiceConnection serviceConnection, String str) {
        Preconditions.m16038a(serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f14174h) {
            C7239k kVar = this.f14174h.get(zza);
            if (kVar == null) {
                String valueOf = String.valueOf(zza);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (kVar.mo25399a(serviceConnection)) {
                kVar.mo25401b(serviceConnection, str);
                if (kVar.mo25405e()) {
                    this.f14176j.sendMessageDelayed(this.f14176j.obtainMessage(0, zza), this.f14178l);
                }
            } else {
                String valueOf2 = String.valueOf(zza);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f14174h) {
                GmsClientSupervisor.zza zza = (GmsClientSupervisor.zza) message.obj;
                C7239k kVar = this.f14174h.get(zza);
                if (kVar != null && kVar.mo25405e()) {
                    if (kVar.mo25404d()) {
                        kVar.mo25402b("GmsClientSupervisor");
                    }
                    this.f14174h.remove(zza);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.f14174h) {
                GmsClientSupervisor.zza zza2 = (GmsClientSupervisor.zza) message.obj;
                C7239k kVar2 = this.f14174h.get(zza2);
                if (kVar2 != null && kVar2.mo25403c() == 3) {
                    String valueOf = String.valueOf(zza2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName b = kVar2.mo25400b();
                    if (b == null) {
                        b = zza2.mo25355a();
                    }
                    if (b == null) {
                        b = new ComponentName(zza2.mo25357b(), "unknown");
                    }
                    kVar2.onServiceDisconnected(b);
                }
            }
            return true;
        }
    }
}
