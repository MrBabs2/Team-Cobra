package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClientEventManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.Common;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import p015cm.aptoide.p016pt.notification.sync.LocalNotificationSyncManager;

public final class zaaw extends GoogleApiClient implements zabt {

    /* renamed from: b */
    private final Lock f13891b;

    /* renamed from: c */
    private boolean f13892c;

    /* renamed from: d */
    private final GmsClientEventManager f13893d;

    /* renamed from: e */
    private zabs f13894e = null;

    /* renamed from: f */
    private final int f13895f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Context f13896g;

    /* renamed from: h */
    private final Looper f13897h;
    @VisibleForTesting

    /* renamed from: i */
    final Queue<BaseImplementation.ApiMethodImpl<?, ?>> f13898i = new LinkedList();

    /* renamed from: j */
    private volatile boolean f13899j;

    /* renamed from: k */
    private long f13900k;

    /* renamed from: l */
    private long f13901l;

    /* renamed from: m */
    private final C7206u f13902m;

    /* renamed from: n */
    private final GoogleApiAvailability f13903n;
    @VisibleForTesting

    /* renamed from: o */
    private zabq f13904o;

    /* renamed from: p */
    final Map<Api.AnyClientKey<?>, Api.Client> f13905p;

    /* renamed from: q */
    Set<Scope> f13906q;

    /* renamed from: r */
    private final ClientSettings f13907r;

    /* renamed from: s */
    private final Map<Api<?>, Boolean> f13908s;

    /* renamed from: t */
    private final Api.AbstractClientBuilder<? extends zad, SignInOptions> f13909t;

    /* renamed from: u */
    private final ListenerHolders f13910u;

    /* renamed from: v */
    private final ArrayList<zaq> f13911v;

    /* renamed from: w */
    private Integer f13912w;

    /* renamed from: x */
    Set<zacm> f13913x;

    /* renamed from: y */
    final zacp f13914y;

    /* renamed from: z */
    private final GmsClientEventManager.GmsClientEventState f13915z;

    public zaaw(Context context, Lock lock, Looper looper, ClientSettings clientSettings, GoogleApiAvailability googleApiAvailability, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder, Map<Api<?>, Boolean> map, List<GoogleApiClient.ConnectionCallbacks> list, List<GoogleApiClient.OnConnectionFailedListener> list2, Map<Api.AnyClientKey<?>, Api.Client> map2, int i, int i2, ArrayList<zaq> arrayList, boolean z) {
        Looper looper2 = looper;
        int i3 = i;
        this.f13900k = ClientLibraryUtils.m16251a() ? 10000 : LocalNotificationSyncManager.TWO_MINUTES;
        this.f13901l = 5000;
        this.f13906q = new HashSet();
        this.f13910u = new ListenerHolders();
        this.f13912w = null;
        this.f13913x = null;
        C7198q qVar = new C7198q(this);
        this.f13915z = qVar;
        this.f13896g = context;
        this.f13891b = lock;
        this.f13892c = false;
        this.f13893d = new GmsClientEventManager(looper, qVar);
        this.f13897h = looper2;
        this.f13902m = new C7206u(this, looper);
        this.f13903n = googleApiAvailability;
        this.f13895f = i3;
        if (i3 >= 0) {
            this.f13912w = Integer.valueOf(i2);
        }
        this.f13908s = map;
        this.f13905p = map2;
        this.f13911v = arrayList;
        this.f13914y = new zacp(this.f13905p);
        for (GoogleApiClient.ConnectionCallbacks a : list) {
            this.f13893d.mo25347a(a);
        }
        for (GoogleApiClient.OnConnectionFailedListener a2 : list2) {
            this.f13893d.mo25348a(a2);
        }
        this.f13907r = clientSettings;
        this.f13909t = abstractClientBuilder;
    }

    /* renamed from: c */
    private static String m15695c(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m15696o() {
        this.f13891b.lock();
        try {
            if (this.f13899j) {
                m15697p();
            }
        } finally {
            this.f13891b.unlock();
        }
    }

    /* renamed from: p */
    private final void m15697p() {
        this.f13893d.mo25349b();
        this.f13894e.mo25123a();
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final void m15698q() {
        this.f13891b.lock();
        try {
            if (mo25163l()) {
                m15697p();
            }
        } finally {
            this.f13891b.unlock();
        }
    }

    /* renamed from: a */
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T mo24940a(T t) {
        Preconditions.m16044a(t.mo25011h() != null, (Object) "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean containsKey = this.f13905p.containsKey(t.mo25011h());
        String b = t.mo25010g() != null ? t.mo25010g().mo24889b() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(b);
        sb.append(" required for this call.");
        Preconditions.m16044a(containsKey, (Object) sb.toString());
        this.f13891b.lock();
        try {
            if (this.f13894e == null) {
                this.f13898i.add(t);
                return t;
            }
            T b2 = this.f13894e.mo25125b(t);
            this.f13891b.unlock();
            return b2;
        } finally {
            this.f13891b.unlock();
        }
    }

    /* renamed from: b */
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T mo24946b(T t) {
        Preconditions.m16044a(t.mo25011h() != null, (Object) "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.f13905p.containsKey(t.mo25011h());
        String b = t.mo25010g() != null ? t.mo25010g().mo24889b() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(b);
        sb.append(" required for this call.");
        Preconditions.m16044a(containsKey, (Object) sb.toString());
        this.f13891b.lock();
        try {
            if (this.f13894e == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            } else if (this.f13899j) {
                this.f13898i.add(t);
                while (!this.f13898i.isEmpty()) {
                    BaseImplementation.ApiMethodImpl remove = this.f13898i.remove();
                    this.f13914y.mo25183a(remove);
                    remove.mo25009c(Status.f13684l);
                }
                return t;
            } else {
                T a = this.f13894e.mo25122a(t);
                this.f13891b.unlock();
                return a;
            }
        } finally {
            this.f13891b.unlock();
        }
    }

    /* renamed from: c */
    public final void mo24948c() {
        this.f13891b.lock();
        try {
            boolean z = false;
            if (this.f13895f >= 0) {
                if (this.f13912w != null) {
                    z = true;
                }
                Preconditions.m16048b(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.f13912w == null) {
                this.f13912w = Integer.valueOf(m15688a((Iterable<Api.Client>) this.f13905p.values(), false));
            } else if (this.f13912w.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            mo25160a(this.f13912w.intValue());
        } finally {
            this.f13891b.unlock();
        }
    }

    /* renamed from: d */
    public final void mo24949d() {
        this.f13891b.lock();
        try {
            this.f13914y.mo25182a();
            if (this.f13894e != null) {
                this.f13894e.disconnect();
            }
            this.f13910u.mo25083a();
            for (BaseImplementation.ApiMethodImpl apiMethodImpl : this.f13898i) {
                apiMethodImpl.mo25013a((C7189l0) null);
                apiMethodImpl.mo24914a();
            }
            this.f13898i.clear();
            if (this.f13894e != null) {
                mo25163l();
                this.f13893d.mo25343a();
                this.f13891b.unlock();
            }
        } finally {
            this.f13891b.unlock();
        }
    }

    /* renamed from: e */
    public final Context mo24950e() {
        return this.f13896g;
    }

    /* renamed from: f */
    public final Looper mo24951f() {
        return this.f13897h;
    }

    /* renamed from: g */
    public final void mo24952g() {
        zabs zabs = this.f13894e;
        if (zabs != null) {
            zabs.mo25127c();
        }
    }

    /* renamed from: j */
    public final boolean mo25161j() {
        zabs zabs = this.f13894e;
        return zabs != null && zabs.isConnected();
    }

    /* renamed from: k */
    public final void mo25162k() {
        mo24949d();
        mo24948c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo25163l() {
        if (!this.f13899j) {
            return false;
        }
        this.f13899j = false;
        this.f13902m.removeMessages(2);
        this.f13902m.removeMessages(1);
        zabq zabq = this.f13904o;
        if (zabq != null) {
            zabq.mo25173a();
            this.f13904o = null;
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo25164m() {
        this.f13891b.lock();
        try {
            if (this.f13913x == null) {
                this.f13891b.unlock();
                return false;
            }
            boolean z = !this.f13913x.isEmpty();
            this.f13891b.unlock();
            return z;
        } catch (Throwable th) {
            this.f13891b.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final String mo25165n() {
        StringWriter stringWriter = new StringWriter();
        mo24943a("", (FileDescriptor) null, new PrintWriter(stringWriter), (String[]) null);
        return stringWriter.toString();
    }

    /* renamed from: a */
    public final <C extends Api.Client> C mo24939a(Api.AnyClientKey<C> anyClientKey) {
        C c = (Api.Client) this.f13905p.get(anyClientKey);
        Preconditions.m16038a(c, (Object) "Appropriate Api was not requested.");
        return c;
    }

    /* renamed from: a */
    public final void mo25160a(int i) {
        this.f13891b.lock();
        boolean z = true;
        if (!(i == 3 || i == 1 || i == 2)) {
            z = false;
        }
        try {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Illegal sign-in mode: ");
            sb.append(i);
            Preconditions.m16044a(z, (Object) sb.toString());
            m15692b(i);
            m15697p();
        } finally {
            this.f13891b.unlock();
        }
    }

    /* renamed from: b */
    public final PendingResult<Status> mo24945b() {
        Preconditions.m16048b(mo25161j(), "GoogleApiClient is not connected yet.");
        Preconditions.m16048b(this.f13912w.intValue() != 2, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        StatusPendingResult statusPendingResult = new StatusPendingResult(this);
        if (this.f13905p.containsKey(Common.f14187a)) {
            m15689a(this, statusPendingResult, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            C7200r rVar = new C7200r(this, atomicReference, statusPendingResult);
            C7202s sVar = new C7202s(this, statusPendingResult);
            GoogleApiClient.Builder builder = new GoogleApiClient.Builder(this.f13896g);
            builder.mo24954a((Api<? extends Api.ApiOptions.NotRequiredOptions>) Common.f14189c);
            builder.mo24956a((GoogleApiClient.ConnectionCallbacks) rVar);
            builder.mo24957a((GoogleApiClient.OnConnectionFailedListener) sVar);
            builder.mo24953a((Handler) this.f13902m);
            GoogleApiClient a = builder.mo24958a();
            atomicReference.set(a);
            a.mo24948c();
        }
        return statusPendingResult;
    }

    /* renamed from: a */
    public final ConnectionResult mo24938a() {
        boolean z = true;
        Preconditions.m16048b(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.f13891b.lock();
        try {
            if (this.f13895f >= 0) {
                if (this.f13912w == null) {
                    z = false;
                }
                Preconditions.m16048b(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.f13912w == null) {
                this.f13912w = Integer.valueOf(m15688a((Iterable<Api.Client>) this.f13905p.values(), false));
            } else if (this.f13912w.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            m15692b(this.f13912w.intValue());
            this.f13893d.mo25349b();
            return this.f13894e.mo25128d();
        } finally {
            this.f13891b.unlock();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m15689a(GoogleApiClient googleApiClient, StatusPendingResult statusPendingResult, boolean z) {
        Common.f14190d.mo25410a(googleApiClient).mo24965a(new C7204t(this, statusPendingResult, z, googleApiClient));
    }

    /* renamed from: b */
    private final void m15692b(int i) {
        Integer num = this.f13912w;
        if (num == null) {
            this.f13912w = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            String c = m15695c(i);
            String c2 = m15695c(this.f13912w.intValue());
            StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 51 + String.valueOf(c2).length());
            sb.append("Cannot use sign-in mode: ");
            sb.append(c);
            sb.append(". Mode was already set to ");
            sb.append(c2);
            throw new IllegalStateException(sb.toString());
        }
        if (this.f13894e == null) {
            boolean z = false;
            boolean z2 = false;
            for (Api.Client next : this.f13905p.values()) {
                if (next.requiresSignIn()) {
                    z = true;
                }
                if (next.providesSignIn()) {
                    z2 = true;
                }
            }
            int intValue = this.f13912w.intValue();
            if (intValue != 1) {
                if (intValue == 2 && z) {
                    if (this.f13892c) {
                        this.f13894e = new zax(this.f13896g, this.f13891b, this.f13897h, this.f13903n, this.f13905p, this.f13907r, this.f13908s, this.f13909t, this.f13911v, this, true);
                        return;
                    }
                    this.f13894e = C7201r0.m15572a(this.f13896g, this, this.f13891b, this.f13897h, this.f13903n, this.f13905p, this.f13907r, this.f13908s, this.f13909t, this.f13911v);
                    return;
                }
            } else if (!z) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            } else if (z2) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            if (!this.f13892c || z2) {
                this.f13894e = new zabe(this.f13896g, this, this.f13891b, this.f13897h, this.f13903n, this.f13905p, this.f13907r, this.f13908s, this.f13909t, this.f13911v, this);
                return;
            }
            this.f13894e = new zax(this.f13896g, this.f13891b, this.f13897h, this.f13903n, this.f13905p, this.f13907r, this.f13908s, this.f13909t, this.f13911v, this, false);
        }
    }

    /* renamed from: a */
    public final void mo24941a(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f13893d.mo25348a(onConnectionFailedListener);
    }

    /* renamed from: a */
    public final void mo25135a(Bundle bundle) {
        while (!this.f13898i.isEmpty()) {
            mo24946b(this.f13898i.remove());
        }
        this.f13893d.mo25345a(bundle);
    }

    /* renamed from: a */
    public final void mo25136a(ConnectionResult connectionResult) {
        if (!this.f13903n.mo24879b(this.f13896g, connectionResult.mo24840d())) {
            mo25163l();
        }
        if (!this.f13899j) {
            this.f13893d.mo25346a(connectionResult);
            this.f13893d.mo25343a();
        }
    }

    /* renamed from: a */
    public final void mo25134a(int i, boolean z) {
        if (i == 1 && !z && !this.f13899j) {
            this.f13899j = true;
            if (this.f13904o == null && !ClientLibraryUtils.m16251a()) {
                this.f13904o = this.f13903n.mo24864a(this.f13896g.getApplicationContext(), (zabr) new C7208v(this));
            }
            C7206u uVar = this.f13902m;
            uVar.sendMessageDelayed(uVar.obtainMessage(1), this.f13900k);
            C7206u uVar2 = this.f13902m;
            uVar2.sendMessageDelayed(uVar2.obtainMessage(2), this.f13901l);
        }
        this.f13914y.mo25184b();
        this.f13893d.mo25344a(i);
        this.f13893d.mo25343a();
        if (i == 2) {
            m15697p();
        }
    }

    /* renamed from: b */
    public final void mo24947b(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f13893d.mo25350b(onConnectionFailedListener);
    }

    /* renamed from: a */
    public final boolean mo24944a(SignInConnectionListener signInConnectionListener) {
        zabs zabs = this.f13894e;
        return zabs != null && zabs.mo25124a(signInConnectionListener);
    }

    /* renamed from: a */
    public final void mo24942a(zacm zacm) {
        this.f13891b.lock();
        try {
            if (this.f13913x == null) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            } else if (!this.f13913x.remove(zacm)) {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            } else if (!mo25164m()) {
                this.f13894e.mo25126b();
            }
        } finally {
            this.f13891b.unlock();
        }
    }

    /* renamed from: a */
    public final void mo24943a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.f13896g);
        printWriter.append(str).append("mResuming=").print(this.f13899j);
        printWriter.append(" mWorkQueue.size()=").print(this.f13898i.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f13914y.f13959a.size());
        zabs zabs = this.f13894e;
        if (zabs != null) {
            zabs.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: a */
    public static int m15688a(Iterable<Api.Client> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (Api.Client next : iterable) {
            if (next.requiresSignIn()) {
                z2 = true;
            }
            if (next.providesSignIn()) {
                z3 = true;
            }
        }
        if (!z2) {
            return 3;
        }
        if (!z3 || !z) {
            return 1;
        }
        return 2;
    }
}
