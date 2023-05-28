package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zap;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class GmsClientEventManager implements Handler.Callback {

    /* renamed from: f */
    private final GmsClientEventState f14118f;

    /* renamed from: g */
    private final ArrayList<GoogleApiClient.ConnectionCallbacks> f14119g = new ArrayList<>();
    @VisibleForTesting

    /* renamed from: h */
    private final ArrayList<GoogleApiClient.ConnectionCallbacks> f14120h = new ArrayList<>();

    /* renamed from: i */
    private final ArrayList<GoogleApiClient.OnConnectionFailedListener> f14121i = new ArrayList<>();

    /* renamed from: j */
    private volatile boolean f14122j = false;

    /* renamed from: k */
    private final AtomicInteger f14123k = new AtomicInteger(0);

    /* renamed from: l */
    private boolean f14124l = false;

    /* renamed from: m */
    private final Handler f14125m;

    /* renamed from: n */
    private final Object f14126n = new Object();

    @VisibleForTesting
    public interface GmsClientEventState {
        Bundle getConnectionHint();

        boolean isConnected();
    }

    public GmsClientEventManager(Looper looper, GmsClientEventState gmsClientEventState) {
        this.f14118f = gmsClientEventState;
        this.f14125m = new zap(looper, this);
    }

    /* renamed from: a */
    public final void mo25343a() {
        this.f14122j = false;
        this.f14123k.incrementAndGet();
    }

    /* renamed from: b */
    public final void mo25349b() {
        this.f14122j = true;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) message.obj;
            synchronized (this.f14126n) {
                if (this.f14122j && this.f14118f.isConnected() && this.f14119g.contains(connectionCallbacks)) {
                    connectionCallbacks.mo24961d(this.f14118f.getConnectionHint());
                }
            }
            return true;
        }
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i);
        Log.wtf("GmsClientEvents", sb.toString(), new Exception());
        return false;
    }

    /* renamed from: b */
    public final void mo25350b(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.m16037a(onConnectionFailedListener);
        synchronized (this.f14126n) {
            if (!this.f14121i.remove(onConnectionFailedListener)) {
                String valueOf = String.valueOf(onConnectionFailedListener);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
                sb.append("unregisterConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" not found");
                Log.w("GmsClientEvents", sb.toString());
            }
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    public final void mo25345a(Bundle bundle) {
        Preconditions.m16041a(this.f14125m, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f14126n) {
            boolean z = true;
            Preconditions.m16047b(!this.f14124l);
            this.f14125m.removeMessages(1);
            this.f14124l = true;
            if (this.f14120h.size() != 0) {
                z = false;
            }
            Preconditions.m16047b(z);
            ArrayList arrayList = new ArrayList(this.f14119g);
            int i = this.f14123k.get();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) obj;
                if (!this.f14122j || !this.f14118f.isConnected() || this.f14123k.get() != i) {
                    break;
                } else if (!this.f14120h.contains(connectionCallbacks)) {
                    connectionCallbacks.mo24961d(bundle);
                }
            }
            this.f14120h.clear();
            this.f14124l = false;
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    public final void mo25344a(int i) {
        Preconditions.m16041a(this.f14125m, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f14125m.removeMessages(1);
        synchronized (this.f14126n) {
            this.f14124l = true;
            ArrayList arrayList = new ArrayList(this.f14119g);
            int i2 = this.f14123k.get();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                GoogleApiClient.ConnectionCallbacks connectionCallbacks = (GoogleApiClient.ConnectionCallbacks) obj;
                if (!this.f14122j || this.f14123k.get() != i2) {
                    break;
                } else if (this.f14119g.contains(connectionCallbacks)) {
                    connectionCallbacks.mo24960a(i);
                }
            }
            this.f14120h.clear();
            this.f14124l = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        return;
     */
    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25346a(com.google.android.gms.common.ConnectionResult r8) {
        /*
            r7 = this;
            android.os.Handler r0 = r7.f14125m
            java.lang.String r1 = "onConnectionFailure must only be called on the Handler thread"
            com.google.android.gms.common.internal.Preconditions.m16041a((android.os.Handler) r0, (java.lang.String) r1)
            android.os.Handler r0 = r7.f14125m
            r1 = 1
            r0.removeMessages(r1)
            java.lang.Object r0 = r7.f14126n
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0049 }
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener> r2 = r7.f14121i     // Catch:{ all -> 0x0049 }
            r1.<init>(r2)     // Catch:{ all -> 0x0049 }
            java.util.concurrent.atomic.AtomicInteger r2 = r7.f14123k     // Catch:{ all -> 0x0049 }
            int r2 = r2.get()     // Catch:{ all -> 0x0049 }
            int r3 = r1.size()     // Catch:{ all -> 0x0049 }
            r4 = 0
        L_0x0022:
            if (r4 >= r3) goto L_0x0047
            java.lang.Object r5 = r1.get(r4)     // Catch:{ all -> 0x0049 }
            int r4 = r4 + 1
            com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener r5 = (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) r5     // Catch:{ all -> 0x0049 }
            boolean r6 = r7.f14122j     // Catch:{ all -> 0x0049 }
            if (r6 == 0) goto L_0x0045
            java.util.concurrent.atomic.AtomicInteger r6 = r7.f14123k     // Catch:{ all -> 0x0049 }
            int r6 = r6.get()     // Catch:{ all -> 0x0049 }
            if (r6 == r2) goto L_0x0039
            goto L_0x0045
        L_0x0039:
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener> r6 = r7.f14121i     // Catch:{ all -> 0x0049 }
            boolean r6 = r6.contains(r5)     // Catch:{ all -> 0x0049 }
            if (r6 == 0) goto L_0x0022
            r5.mo24962a(r8)     // Catch:{ all -> 0x0049 }
            goto L_0x0022
        L_0x0045:
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            return
        L_0x0047:
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            return
        L_0x0049:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            goto L_0x004d
        L_0x004c:
            throw r8
        L_0x004d:
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.GmsClientEventManager.mo25346a(com.google.android.gms.common.ConnectionResult):void");
    }

    /* renamed from: a */
    public final void mo25347a(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        Preconditions.m16037a(connectionCallbacks);
        synchronized (this.f14126n) {
            if (this.f14119g.contains(connectionCallbacks)) {
                String valueOf = String.valueOf(connectionCallbacks);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
                sb.append("registerConnectionCallbacks(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.f14119g.add(connectionCallbacks);
            }
        }
        if (this.f14118f.isConnected()) {
            Handler handler = this.f14125m;
            handler.sendMessage(handler.obtainMessage(1, connectionCallbacks));
        }
    }

    /* renamed from: a */
    public final void mo25348a(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.m16037a(onConnectionFailedListener);
        synchronized (this.f14126n) {
            if (this.f14121i.contains(onConnectionFailedListener)) {
                String valueOf = String.valueOf(onConnectionFailedListener);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67);
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.f14121i.add(onConnectionFailedListener);
            }
        }
    }
}
