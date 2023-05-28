package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.internal.zaj;
import com.google.android.gms.signin.zad;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

public final class zaak implements zabd {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zabe f13869a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Lock f13870b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f13871c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final GoogleApiAvailabilityLight f13872d;

    /* renamed from: e */
    private ConnectionResult f13873e;

    /* renamed from: f */
    private int f13874f;

    /* renamed from: g */
    private int f13875g = 0;

    /* renamed from: h */
    private int f13876h;

    /* renamed from: i */
    private final Bundle f13877i = new Bundle();

    /* renamed from: j */
    private final Set<Api.AnyClientKey> f13878j = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public zad f13879k;

    /* renamed from: l */
    private boolean f13880l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f13881m;

    /* renamed from: n */
    private boolean f13882n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public IAccountAccessor f13883o;

    /* renamed from: p */
    private boolean f13884p;

    /* renamed from: q */
    private boolean f13885q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final ClientSettings f13886r;

    /* renamed from: s */
    private final Map<Api<?>, Boolean> f13887s;

    /* renamed from: t */
    private final Api.AbstractClientBuilder<? extends zad, SignInOptions> f13888t;

    /* renamed from: u */
    private ArrayList<Future<?>> f13889u = new ArrayList<>();

    public zaak(zabe zabe, ClientSettings clientSettings, Map<Api<?>, Boolean> map, GoogleApiAvailabilityLight googleApiAvailabilityLight, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder, Lock lock, Context context) {
        this.f13869a = zabe;
        this.f13886r = clientSettings;
        this.f13887s = map;
        this.f13872d = googleApiAvailabilityLight;
        this.f13888t = abstractClientBuilder;
        this.f13870b = lock;
        this.f13871c = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m15648a(zaj zaj) {
        if (m15655b(0)) {
            ConnectionResult d = zaj.mo30699d();
            if (d.mo24846t()) {
                ResolveAccountResponse o = zaj.mo30700o();
                ConnectionResult o2 = o.mo25381o();
                if (!o2.mo24846t()) {
                    String valueOf = String.valueOf(o2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                    sb.append("Sign-in succeeded with resolve account failure: ");
                    sb.append(valueOf);
                    Log.wtf("GoogleApiClientConnecting", sb.toString(), new Exception());
                    m15653b(o2);
                    return;
                }
                this.f13882n = true;
                this.f13883o = o.mo25379d();
                this.f13884p = o.mo25382p();
                this.f13885q = o.mo25383q();
                m15661d();
            } else if (m15650a(d)) {
                m15665f();
                m15661d();
            } else {
                m15653b(d);
            }
        }
    }

    /* renamed from: c */
    private static String m15657c(int i) {
        return i != 0 ? i != 1 ? "UNKNOWN" : "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final boolean m15659c() {
        int i = this.f13876h - 1;
        this.f13876h = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            Log.w("GoogleApiClientConnecting", this.f13869a.f13929s.mo25165n());
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            m15653b(new ConnectionResult(8, (PendingIntent) null));
            return false;
        }
        ConnectionResult connectionResult = this.f13873e;
        if (connectionResult == null) {
            return true;
        }
        this.f13869a.f13928r = this.f13874f;
        m15653b(connectionResult);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m15661d() {
        if (this.f13876h == 0) {
            if (!this.f13881m || this.f13882n) {
                ArrayList arrayList = new ArrayList();
                this.f13875g = 1;
                this.f13876h = this.f13869a.f13921k.size();
                for (Api.AnyClientKey next : this.f13869a.f13921k.keySet()) {
                    if (!this.f13869a.f13922l.containsKey(next)) {
                        arrayList.add(this.f13869a.f13921k.get(next));
                    } else if (m15659c()) {
                        m15662e();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f13889u.add(zabh.m15754a().submit(new C7188l(this, arrayList)));
                }
            }
        }
    }

    /* renamed from: e */
    private final void m15662e() {
        this.f13869a.mo25172g();
        zabh.m15754a().execute(new C7178g(this));
        zad zad = this.f13879k;
        if (zad != null) {
            if (this.f13884p) {
                zad.mo30683a(this.f13883o, this.f13885q);
            }
            m15649a(false);
        }
        for (Api.AnyClientKey<?> anyClientKey : this.f13869a.f13922l.keySet()) {
            this.f13869a.f13921k.get(anyClientKey).disconnect();
        }
        this.f13869a.f13930t.mo25135a(this.f13877i.isEmpty() ? null : this.f13877i);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m15665f() {
        this.f13881m = false;
        this.f13869a.f13929s.f13906q = Collections.emptySet();
        for (Api.AnyClientKey next : this.f13878j) {
            if (!this.f13869a.f13922l.containsKey(next)) {
                this.f13869a.f13922l.put(next, new ConnectionResult(17, (PendingIntent) null));
            }
        }
    }

    /* renamed from: g */
    private final void m15667g() {
        ArrayList<Future<?>> arrayList = this.f13889u;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Future<?> future = arrayList.get(i);
            i++;
            future.cancel(true);
        }
        this.f13889u.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final Set<Scope> m15669h() {
        if (this.f13886r == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(this.f13886r.mo25330i());
        Map<Api<?>, ClientSettings.OptionalApiSettings> f = this.f13886r.mo25327f();
        for (Api next : f.keySet()) {
            if (!this.f13869a.f13922l.containsKey(next.mo24888a())) {
                hashSet.addAll(f.get(next).f14102a);
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public final void mo25152a() {
    }

    /* renamed from: b */
    public final void mo25156b() {
        this.f13869a.f13922l.clear();
        this.f13881m = false;
        this.f13873e = null;
        this.f13875g = 0;
        this.f13880l = true;
        this.f13882n = false;
        this.f13884p = false;
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (Api next : this.f13887s.keySet()) {
            Api.Client client = this.f13869a.f13921k.get(next.mo24888a());
            z |= next.mo24890c().mo24894a() == 1;
            boolean booleanValue = this.f13887s.get(next).booleanValue();
            if (client.requiresSignIn()) {
                this.f13881m = true;
                if (booleanValue) {
                    this.f13878j.add(next.mo24888a());
                } else {
                    this.f13880l = false;
                }
            }
            hashMap.put(client, new C7180h(this, next, booleanValue));
        }
        if (z) {
            this.f13881m = false;
        }
        if (this.f13881m) {
            this.f13886r.mo25322a(Integer.valueOf(System.identityHashCode(this.f13869a.f13929s)));
            C7194o oVar = new C7194o(this, (C7178g) null);
            Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder = this.f13888t;
            Context context = this.f13871c;
            Looper f = this.f13869a.f13929s.mo24951f();
            ClientSettings clientSettings = this.f13886r;
            this.f13879k = (zad) abstractClientBuilder.mo24654a(context, f, clientSettings, clientSettings.mo25331j(), oVar, oVar);
        }
        this.f13876h = this.f13869a.f13921k.size();
        this.f13889u.add(zabh.m15754a().submit(new C7182i(this, hashMap)));
    }

    public final boolean disconnect() {
        m15667g();
        m15649a(true);
        this.f13869a.mo25167a((ConnectionResult) null);
        return true;
    }

    /* renamed from: d */
    public final void mo25158d(Bundle bundle) {
        if (m15655b(1)) {
            if (bundle != null) {
                this.f13877i.putAll(bundle);
            }
            if (m15659c()) {
                m15662e();
            }
        }
    }

    /* renamed from: a */
    public final void mo25154a(ConnectionResult connectionResult, Api<?> api, boolean z) {
        if (m15655b(1)) {
            m15654b(connectionResult, api, z);
            if (m15659c()) {
                m15662e();
            }
        }
    }

    /* renamed from: a */
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T mo25151a(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* renamed from: a */
    public final void mo25153a(int i) {
        m15653b(new ConnectionResult(8, (PendingIntent) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m15650a(ConnectionResult connectionResult) {
        return this.f13880l && !connectionResult.mo24845q();
    }

    /* renamed from: a */
    private final void m15649a(boolean z) {
        zad zad = this.f13879k;
        if (zad != null) {
            if (zad.isConnected() && z) {
                this.f13879k.mo30685b();
            }
            this.f13879k.disconnect();
            if (this.f13886r.mo25332k()) {
                this.f13879k = null;
            }
            this.f13883o = null;
        }
    }

    /* renamed from: b */
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T mo25155b(T t) {
        this.f13869a.f13929s.f13898i.add(t);
        return t;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r7 != false) goto L_0x0024;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m15654b(com.google.android.gms.common.ConnectionResult r5, com.google.android.gms.common.api.Api<?> r6, boolean r7) {
        /*
            r4 = this;
            com.google.android.gms.common.api.Api$BaseClientBuilder r0 = r6.mo24890c()
            int r0 = r0.mo24894a()
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L_0x0024
            boolean r7 = r5.mo24845q()
            if (r7 == 0) goto L_0x0014
        L_0x0012:
            r7 = 1
            goto L_0x0022
        L_0x0014:
            com.google.android.gms.common.GoogleApiAvailabilityLight r7 = r4.f13872d
            int r3 = r5.mo24840d()
            android.content.Intent r7 = r7.mo24875a((int) r3)
            if (r7 == 0) goto L_0x0021
            goto L_0x0012
        L_0x0021:
            r7 = 0
        L_0x0022:
            if (r7 == 0) goto L_0x002d
        L_0x0024:
            com.google.android.gms.common.ConnectionResult r7 = r4.f13873e
            if (r7 == 0) goto L_0x002c
            int r7 = r4.f13874f
            if (r0 >= r7) goto L_0x002d
        L_0x002c:
            r1 = 1
        L_0x002d:
            if (r1 == 0) goto L_0x0033
            r4.f13873e = r5
            r4.f13874f = r0
        L_0x0033:
            com.google.android.gms.common.api.internal.zabe r7 = r4.f13869a
            java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.ConnectionResult> r7 = r7.f13922l
            com.google.android.gms.common.api.Api$AnyClientKey r6 = r6.mo24888a()
            r7.put(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zaak.m15654b(com.google.android.gms.common.ConnectionResult, com.google.android.gms.common.api.Api, boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m15653b(ConnectionResult connectionResult) {
        m15667g();
        m15649a(!connectionResult.mo24845q());
        this.f13869a.mo25167a(connectionResult);
        this.f13869a.f13930t.mo25136a(connectionResult);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final boolean m15655b(int i) {
        if (this.f13875g == i) {
            return true;
        }
        Log.w("GoogleApiClientConnecting", this.f13869a.f13929s.mo25165n());
        String valueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("Unexpected callback in ");
        sb.append(valueOf);
        Log.w("GoogleApiClientConnecting", sb.toString());
        int i2 = this.f13876h;
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("mRemainingConnections=");
        sb2.append(i2);
        Log.w("GoogleApiClientConnecting", sb2.toString());
        String c = m15657c(this.f13875g);
        String c2 = m15657c(i);
        StringBuilder sb3 = new StringBuilder(String.valueOf(c).length() + 70 + String.valueOf(c2).length());
        sb3.append("GoogleApiClient connecting is in step ");
        sb3.append(c);
        sb3.append(" but received callback for step ");
        sb3.append(c2);
        Log.wtf("GoogleApiClientConnecting", sb3.toString(), new Exception());
        m15653b(new ConnectionResult(8, (PendingIntent) null));
        return false;
    }
}
