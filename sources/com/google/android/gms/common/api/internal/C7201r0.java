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
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import p050l.p066e.C4868a;

/* renamed from: com.google.android.gms.common.api.internal.r0 */
final class C7201r0 implements zabs {

    /* renamed from: f */
    private final Context f13827f;

    /* renamed from: g */
    private final zaaw f13828g;

    /* renamed from: h */
    private final Looper f13829h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final zabe f13830i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final zabe f13831j;

    /* renamed from: k */
    private final Map<Api.AnyClientKey<?>, zabe> f13832k;

    /* renamed from: l */
    private final Set<SignInConnectionListener> f13833l = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: m */
    private final Api.Client f13834m;

    /* renamed from: n */
    private Bundle f13835n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public ConnectionResult f13836o = null;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public ConnectionResult f13837p = null;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f13838q = false;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final Lock f13839r;

    /* renamed from: s */
    private int f13840s = 0;

    private C7201r0(Context context, zaaw zaaw, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, Map<Api.AnyClientKey<?>, Api.Client> map2, ClientSettings clientSettings, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder, Api.Client client, ArrayList<zaq> arrayList, ArrayList<zaq> arrayList2, Map<Api<?>, Boolean> map3, Map<Api<?>, Boolean> map4) {
        this.f13827f = context;
        zaaw zaaw2 = zaaw;
        this.f13828g = zaaw2;
        this.f13839r = lock;
        this.f13829h = looper;
        this.f13834m = client;
        Context context2 = context;
        Lock lock2 = lock;
        Looper looper2 = looper;
        GoogleApiAvailabilityLight googleApiAvailabilityLight2 = googleApiAvailabilityLight;
        zabe zabe = r3;
        zabe zabe2 = new zabe(context2, zaaw2, lock2, looper2, googleApiAvailabilityLight2, map2, (ClientSettings) null, map4, (Api.AbstractClientBuilder<? extends zad, SignInOptions>) null, arrayList2, new C7205t0(this, (C7203s0) null));
        this.f13830i = zabe;
        this.f13831j = new zabe(context2, this.f13828g, lock2, looper2, googleApiAvailabilityLight2, map, clientSettings, map3, abstractClientBuilder, arrayList, new C7207u0(this, (C7203s0) null));
        C4868a aVar = new C4868a();
        for (Api.AnyClientKey<?> put : map2.keySet()) {
            aVar.put(put, this.f13830i);
        }
        for (Api.AnyClientKey<?> put2 : map.keySet()) {
            aVar.put(put2, this.f13831j);
        }
        this.f13832k = Collections.unmodifiableMap(aVar);
    }

    /* renamed from: a */
    public static C7201r0 m15572a(Context context, zaaw zaaw, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, ClientSettings clientSettings, Map<Api<?>, Boolean> map2, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder, ArrayList<zaq> arrayList) {
        Map<Api<?>, Boolean> map3 = map2;
        C4868a aVar = new C4868a();
        C4868a aVar2 = new C4868a();
        Api.Client client = null;
        for (Map.Entry next : map.entrySet()) {
            Api.Client client2 = (Api.Client) next.getValue();
            if (client2.providesSignIn()) {
                client = client2;
            }
            if (client2.requiresSignIn()) {
                aVar.put((Api.AnyClientKey) next.getKey(), client2);
            } else {
                aVar2.put((Api.AnyClientKey) next.getKey(), client2);
            }
        }
        Preconditions.m16048b(!aVar.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        C4868a aVar3 = new C4868a();
        C4868a aVar4 = new C4868a();
        for (Api next2 : map2.keySet()) {
            Api.AnyClientKey<?> a = next2.mo24888a();
            if (aVar.containsKey(a)) {
                aVar3.put(next2, map3.get(next2));
            } else if (aVar2.containsKey(a)) {
                aVar4.put(next2, map3.get(next2));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            zaq zaq = arrayList.get(i);
            i++;
            zaq zaq2 = zaq;
            if (aVar3.containsKey(zaq2.f13987f)) {
                arrayList2.add(zaq2);
            } else if (aVar4.containsKey(zaq2.f13987f)) {
                arrayList3.add(zaq2);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new C7201r0(context, zaaw, lock, looper, googleApiAvailabilityLight, aVar, aVar2, clientSettings, abstractClientBuilder, client, arrayList2, arrayList3, aVar3, aVar4);
    }

    /* renamed from: f */
    private final PendingIntent m15587f() {
        if (this.f13834m == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f13827f, System.identityHashCode(this.f13828g), this.f13834m.getSignInIntent(), 134217728);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m15589g() {
        ConnectionResult connectionResult;
        if (m15582b(this.f13836o)) {
            if (m15582b(this.f13837p) || m15591i()) {
                int i = this.f13840s;
                if (i != 1) {
                    if (i != 2) {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        this.f13840s = 0;
                        return;
                    }
                    this.f13828g.mo25135a(this.f13835n);
                }
                m15590h();
                this.f13840s = 0;
                return;
            }
            ConnectionResult connectionResult2 = this.f13837p;
            if (connectionResult2 == null) {
                return;
            }
            if (this.f13840s == 1) {
                m15590h();
                return;
            }
            m15576a(connectionResult2);
            this.f13830i.disconnect();
        } else if (this.f13836o == null || !m15582b(this.f13837p)) {
            ConnectionResult connectionResult3 = this.f13836o;
            if (connectionResult3 != null && (connectionResult = this.f13837p) != null) {
                if (this.f13831j.f13928r < this.f13830i.f13928r) {
                    connectionResult3 = connectionResult;
                }
                m15576a(connectionResult3);
            }
        } else {
            this.f13831j.disconnect();
            m15576a(this.f13836o);
        }
    }

    /* renamed from: h */
    private final void m15590h() {
        for (SignInConnectionListener onComplete : this.f13833l) {
            onComplete.onComplete();
        }
        this.f13833l.clear();
    }

    /* renamed from: i */
    private final boolean m15591i() {
        ConnectionResult connectionResult = this.f13837p;
        return connectionResult != null && connectionResult.mo24840d() == 4;
    }

    /* renamed from: b */
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T mo25125b(T t) {
        if (!m15583c((BaseImplementation.ApiMethodImpl<? extends Result, ? extends Api.AnyClient>) t)) {
            return this.f13830i.mo25125b(t);
        }
        if (!m15591i()) {
            return this.f13831j.mo25125b(t);
        }
        t.mo25009c(new Status(4, (String) null, m15587f()));
        return t;
    }

    /* renamed from: c */
    public final void mo25127c() {
        this.f13839r.lock();
        try {
            boolean e = mo25131e();
            this.f13831j.disconnect();
            this.f13837p = new ConnectionResult(4);
            if (e) {
                new zap(this.f13829h).post(new C7203s0(this));
            } else {
                m15590h();
            }
        } finally {
            this.f13839r.unlock();
        }
    }

    /* renamed from: d */
    public final ConnectionResult mo25128d() {
        throw new UnsupportedOperationException();
    }

    public final void disconnect() {
        this.f13837p = null;
        this.f13836o = null;
        this.f13840s = 0;
        this.f13830i.disconnect();
        this.f13831j.disconnect();
        m15590h();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("authClient").println(":");
        this.f13831j.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(":");
        this.f13830i.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    /* renamed from: e */
    public final boolean mo25131e() {
        this.f13839r.lock();
        try {
            return this.f13840s == 2;
        } finally {
            this.f13839r.unlock();
        }
    }

    public final boolean isConnected() {
        this.f13839r.lock();
        try {
            boolean z = true;
            if (!this.f13830i.isConnected() || (!this.f13831j.isConnected() && !m15591i() && this.f13840s != 1)) {
                z = false;
            }
            return z;
        } finally {
            this.f13839r.unlock();
        }
    }

    /* renamed from: b */
    public final void mo25126b() {
        this.f13830i.mo25126b();
        this.f13831j.mo25126b();
    }

    /* renamed from: b */
    private static boolean m15582b(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.mo24846t();
    }

    /* renamed from: c */
    private final boolean m15583c(BaseImplementation.ApiMethodImpl<? extends Result, ? extends Api.AnyClient> apiMethodImpl) {
        Api.AnyClientKey<? extends Api.AnyClient> h = apiMethodImpl.mo25011h();
        Preconditions.m16044a(this.f13832k.containsKey(h), (Object) "GoogleApiClient is not configured to use the API required for this call.");
        return this.f13832k.get(h).equals(this.f13831j);
    }

    /* renamed from: a */
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T mo25122a(T t) {
        if (!m15583c((BaseImplementation.ApiMethodImpl<? extends Result, ? extends Api.AnyClient>) t)) {
            return this.f13830i.mo25122a(t);
        }
        if (!m15591i()) {
            return this.f13831j.mo25122a(t);
        }
        t.mo25009c(new Status(4, (String) null, m15587f()));
        return t;
    }

    /* renamed from: a */
    public final void mo25123a() {
        this.f13840s = 2;
        this.f13838q = false;
        this.f13837p = null;
        this.f13836o = null;
        this.f13830i.mo25123a();
        this.f13831j.mo25123a();
    }

    /* renamed from: a */
    public final boolean mo25124a(SignInConnectionListener signInConnectionListener) {
        this.f13839r.lock();
        try {
            if ((mo25131e() || isConnected()) && !this.f13831j.isConnected()) {
                this.f13833l.add(signInConnectionListener);
                if (this.f13840s == 0) {
                    this.f13840s = 1;
                }
                this.f13837p = null;
                this.f13831j.mo25123a();
                return true;
            }
            this.f13839r.unlock();
            return false;
        } finally {
            this.f13839r.unlock();
        }
    }

    /* renamed from: a */
    private final void m15576a(ConnectionResult connectionResult) {
        int i = this.f13840s;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f13840s = 0;
            }
            this.f13828g.mo25136a(connectionResult);
        }
        m15590h();
        this.f13840s = 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m15574a(int i, boolean z) {
        this.f13828g.mo25134a(i, z);
        this.f13837p = null;
        this.f13836o = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m15575a(Bundle bundle) {
        Bundle bundle2 = this.f13835n;
        if (bundle2 == null) {
            this.f13835n = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }
}
