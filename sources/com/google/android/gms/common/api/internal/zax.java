package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.util.concurrent.HandlerExecutor;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import p050l.p066e.C4868a;

public final class zax implements zabs {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Map<Api.AnyClientKey<?>, zaw<?>> f13994f = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Map<Api.AnyClientKey<?>, zaw<?>> f13995g = new HashMap();

    /* renamed from: h */
    private final Map<Api<?>, Boolean> f13996h;

    /* renamed from: i */
    private final GoogleApiManager f13997i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final zaaw f13998j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Lock f13999k;

    /* renamed from: l */
    private final Looper f14000l;

    /* renamed from: m */
    private final GoogleApiAvailabilityLight f14001m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final Condition f14002n;

    /* renamed from: o */
    private final ClientSettings f14003o;

    /* renamed from: p */
    private final boolean f14004p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final boolean f14005q;

    /* renamed from: r */
    private final Queue<BaseImplementation.ApiMethodImpl<?, ?>> f14006r = new LinkedList();
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f14007s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public Map<zai<?>, ConnectionResult> f14008t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public Map<zai<?>, ConnectionResult> f14009u;

    /* renamed from: v */
    private C7166a f14010v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public ConnectionResult f14011w;

    public zax(Context context, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, ClientSettings clientSettings, Map<Api<?>, Boolean> map2, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder, ArrayList<zaq> arrayList, zaaw zaaw, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        this.f13999k = lock;
        this.f14000l = looper;
        this.f14002n = lock.newCondition();
        this.f14001m = googleApiAvailabilityLight;
        this.f13998j = zaaw;
        this.f13996h = map2;
        this.f14003o = clientSettings;
        this.f14004p = z;
        HashMap hashMap = new HashMap();
        for (Api next : map2.keySet()) {
            hashMap.put(next.mo24888a(), next);
        }
        HashMap hashMap2 = new HashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            zaq zaq = arrayList.get(i);
            i++;
            zaq zaq2 = zaq;
            hashMap2.put(zaq2.f13987f, zaq2);
        }
        boolean z5 = false;
        boolean z6 = true;
        boolean z7 = false;
        for (Map.Entry next2 : map.entrySet()) {
            Api api = (Api) hashMap.get(next2.getKey());
            Api.Client client = (Api.Client) next2.getValue();
            if (client.requiresGooglePlayServices()) {
                z3 = z6;
                if (!this.f13996h.get(api).booleanValue()) {
                    z4 = true;
                    z2 = true;
                } else {
                    z2 = z7;
                    z4 = true;
                }
            } else {
                z4 = z5;
                z2 = z7;
                z3 = false;
            }
            zaw zaw = r1;
            zaw zaw2 = new zaw(context, api, looper, client, (zaq) hashMap2.get(api), clientSettings, abstractClientBuilder);
            this.f13994f.put((Api.AnyClientKey) next2.getKey(), zaw);
            if (client.requiresSignIn()) {
                this.f13995g.put((Api.AnyClientKey) next2.getKey(), zaw);
            }
            z5 = z4;
            z6 = z3;
            z7 = z2;
        }
        this.f14005q = z5 && !z6 && !z7;
        this.f13997i = GoogleApiManager.m15424e();
    }

    /* renamed from: c */
    private final <T extends BaseImplementation.ApiMethodImpl<? extends Result, ? extends Api.AnyClient>> boolean m15871c(T t) {
        Api.AnyClientKey h = t.mo25011h();
        ConnectionResult a = m15861a((Api.AnyClientKey<?>) h);
        if (a == null || a.mo24840d() != 4) {
            return false;
        }
        t.mo25009c(new Status(4, (String) null, this.f13997i.mo25023a((zai<?>) this.f13994f.get(h).mo24931g(), System.identityHashCode(this.f13998j))));
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f A[Catch:{ all -> 0x0044 }] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m15875f() {
        /*
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.f13999k
            r0.lock()
            boolean r0 = r3.f14007s     // Catch:{ all -> 0x0044 }
            r1 = 0
            if (r0 == 0) goto L_0x003e
            boolean r0 = r3.f14004p     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x000f
            goto L_0x003e
        L_0x000f:
            java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.api.internal.zaw<?>> r0 = r3.f13995g     // Catch:{ all -> 0x0044 }
            java.util.Set r0 = r0.keySet()     // Catch:{ all -> 0x0044 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0044 }
        L_0x0019:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0044 }
            if (r2 == 0) goto L_0x0037
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0044 }
            com.google.android.gms.common.api.Api$AnyClientKey r2 = (com.google.android.gms.common.api.Api.AnyClientKey) r2     // Catch:{ all -> 0x0044 }
            com.google.android.gms.common.ConnectionResult r2 = r3.m15861a((com.google.android.gms.common.api.Api.AnyClientKey<?>) r2)     // Catch:{ all -> 0x0044 }
            if (r2 == 0) goto L_0x0031
            boolean r2 = r2.mo24846t()     // Catch:{ all -> 0x0044 }
            if (r2 != 0) goto L_0x0019
        L_0x0031:
            java.util.concurrent.locks.Lock r0 = r3.f13999k
            r0.unlock()
            return r1
        L_0x0037:
            java.util.concurrent.locks.Lock r0 = r3.f13999k
            r0.unlock()
            r0 = 1
            return r0
        L_0x003e:
            java.util.concurrent.locks.Lock r0 = r3.f13999k
            r0.unlock()
            return r1
        L_0x0044:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r3.f13999k
            r1.unlock()
            goto L_0x004c
        L_0x004b:
            throw r0
        L_0x004c:
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zax.m15875f():boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m15877g() {
        if (this.f14003o == null) {
            this.f13998j.f13906q = Collections.emptySet();
            return;
        }
        HashSet hashSet = new HashSet(this.f14003o.mo25330i());
        Map<Api<?>, ClientSettings.OptionalApiSettings> f = this.f14003o.mo25327f();
        for (Api next : f.keySet()) {
            ConnectionResult a = mo25198a((Api<?>) next);
            if (a != null && a.mo24846t()) {
                hashSet.addAll(f.get(next).f14102a);
            }
        }
        this.f13998j.f13906q = hashSet;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m15879h() {
        while (!this.f14006r.isEmpty()) {
            mo25122a(this.f14006r.remove());
        }
        this.f13998j.mo25135a((Bundle) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final ConnectionResult m15880i() {
        int i = 0;
        ConnectionResult connectionResult = null;
        ConnectionResult connectionResult2 = null;
        int i2 = 0;
        for (zaw next : this.f13994f.values()) {
            Api c = next.mo24927c();
            ConnectionResult connectionResult3 = this.f14008t.get(next.mo24931g());
            if (!connectionResult3.mo24846t() && (!this.f13996h.get(c).booleanValue() || connectionResult3.mo24845q() || this.f14001m.mo24871c(connectionResult3.mo24840d()))) {
                if (connectionResult3.mo24840d() != 4 || !this.f14004p) {
                    int a = c.mo24890c().mo24894a();
                    if (connectionResult == null || i > a) {
                        connectionResult = connectionResult3;
                        i = a;
                    }
                } else {
                    int a2 = c.mo24890c().mo24894a();
                    if (connectionResult2 == null || i2 > a2) {
                        connectionResult2 = connectionResult3;
                        i2 = a2;
                    }
                }
            }
        }
        return (connectionResult == null || connectionResult2 == null || i <= i2) ? connectionResult : connectionResult2;
    }

    /* renamed from: a */
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T mo25122a(T t) {
        Api.AnyClientKey h = t.mo25011h();
        if (this.f14004p && m15871c(t)) {
            return t;
        }
        this.f13998j.f13914y.mo25183a(t);
        this.f13994f.get(h).mo24925b(t);
        return t;
    }

    /* renamed from: b */
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T mo25125b(T t) {
        if (this.f14004p && m15871c(t)) {
            return t;
        }
        if (!isConnected()) {
            this.f14006r.add(t);
            return t;
        }
        this.f13998j.f13914y.mo25183a(t);
        this.f13994f.get(t.mo25011h()).mo24923a(t);
        return t;
    }

    /* renamed from: b */
    public final void mo25126b() {
    }

    /* renamed from: d */
    public final ConnectionResult mo25128d() {
        mo25123a();
        while (mo25199e()) {
            try {
                this.f14002n.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, (PendingIntent) null);
            }
        }
        if (isConnected()) {
            return ConnectionResult.f13608j;
        }
        ConnectionResult connectionResult = this.f14011w;
        if (connectionResult != null) {
            return connectionResult;
        }
        return new ConnectionResult(13, (PendingIntent) null);
    }

    public final void disconnect() {
        this.f13999k.lock();
        try {
            this.f14007s = false;
            this.f14008t = null;
            this.f14009u = null;
            if (this.f14010v != null) {
                this.f14010v.mo25093a();
                this.f14010v = null;
            }
            this.f14011w = null;
            while (!this.f14006r.isEmpty()) {
                BaseImplementation.ApiMethodImpl remove = this.f14006r.remove();
                remove.mo25013a((C7189l0) null);
                remove.mo24914a();
            }
            this.f14002n.signalAll();
        } finally {
            this.f13999k.unlock();
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: e */
    public final boolean mo25199e() {
        this.f13999k.lock();
        try {
            return this.f14008t == null && this.f14007s;
        } finally {
            this.f13999k.unlock();
        }
    }

    public final boolean isConnected() {
        this.f13999k.lock();
        try {
            return this.f14008t != null && this.f14011w == null;
        } finally {
            this.f13999k.unlock();
        }
    }

    /* renamed from: a */
    public final void mo25123a() {
        this.f13999k.lock();
        try {
            if (!this.f14007s) {
                this.f14007s = true;
                this.f14008t = null;
                this.f14009u = null;
                this.f14010v = null;
                this.f14011w = null;
                this.f13997i.mo25033c();
                this.f13997i.mo25024a((Iterable<? extends GoogleApi<?>>) this.f13994f.values()).mo30705a(new HandlerExecutor(this.f14000l), new C7211w0(this));
                this.f13999k.unlock();
            }
        } finally {
            this.f13999k.unlock();
        }
    }

    /* renamed from: c */
    public final void mo25127c() {
        this.f13999k.lock();
        try {
            this.f13997i.mo25025a();
            if (this.f14010v != null) {
                this.f14010v.mo25093a();
                this.f14010v = null;
            }
            if (this.f14009u == null) {
                this.f14009u = new C4868a(this.f13995g.size());
            }
            ConnectionResult connectionResult = new ConnectionResult(4);
            for (zaw<?> g : this.f13995g.values()) {
                this.f14009u.put(g.mo24931g(), connectionResult);
            }
            if (this.f14008t != null) {
                this.f14008t.putAll(this.f14009u);
            }
        } finally {
            this.f13999k.unlock();
        }
    }

    /* renamed from: a */
    public final ConnectionResult mo25198a(Api<?> api) {
        return m15861a(api.mo24888a());
    }

    /* renamed from: a */
    private final ConnectionResult m15861a(Api.AnyClientKey<?> anyClientKey) {
        this.f13999k.lock();
        try {
            zaw zaw = this.f13994f.get(anyClientKey);
            if (this.f14008t != null && zaw != null) {
                return this.f14008t.get(zaw.mo24931g());
            }
            this.f13999k.unlock();
            return null;
        } finally {
            this.f13999k.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final boolean mo25124a(SignInConnectionListener signInConnectionListener) {
        this.f13999k.lock();
        try {
            if (!this.f14007s || m15875f()) {
                this.f13999k.unlock();
                return false;
            }
            this.f13997i.mo25033c();
            this.f14010v = new C7166a(this, signInConnectionListener);
            this.f13997i.mo25024a((Iterable<? extends GoogleApi<?>>) this.f13995g.values()).mo30705a(new HandlerExecutor(this.f14000l), this.f14010v);
            this.f13999k.unlock();
            return true;
        } catch (Throwable th) {
            this.f13999k.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m15865a(zaw<?> zaw, ConnectionResult connectionResult) {
        return !connectionResult.mo24846t() && !connectionResult.mo24845q() && this.f13996h.get(zaw.mo24927c()).booleanValue() && zaw.mo25197h().requiresGooglePlayServices() && this.f14001m.mo24871c(connectionResult.mo24840d());
    }
}
