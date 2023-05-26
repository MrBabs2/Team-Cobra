package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.LifecycleActivity;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.api.internal.zacm;
import com.google.android.gms.common.api.internal.zaj;
import com.google.android.gms.common.api.internal.zaq;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zaa;
import com.google.android.gms.signin.zad;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import p050l.p066e.C4868a;

@KeepForSdk
public abstract class GoogleApiClient {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Set<GoogleApiClient> f13657a = Collections.newSetFromMap(new WeakHashMap());

    public interface ConnectionCallbacks {
        /* renamed from: a */
        void mo24960a(int i);

        /* renamed from: d */
        void mo24961d(Bundle bundle);
    }

    public interface OnConnectionFailedListener {
        /* renamed from: a */
        void mo24962a(ConnectionResult connectionResult);
    }

    @KeepForSdk
    /* renamed from: h */
    public static Set<GoogleApiClient> m15328h() {
        Set<GoogleApiClient> set;
        synchronized (f13657a) {
            set = f13657a;
        }
        return set;
    }

    /* renamed from: a */
    public abstract ConnectionResult mo24938a();

    @KeepForSdk
    /* renamed from: a */
    public <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T mo24940a(T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public abstract void mo24941a(OnConnectionFailedListener onConnectionFailedListener);

    /* renamed from: a */
    public abstract void mo24943a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: b */
    public abstract PendingResult<Status> mo24945b();

    @KeepForSdk
    /* renamed from: b */
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T mo24946b(T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public abstract void mo24947b(OnConnectionFailedListener onConnectionFailedListener);

    /* renamed from: c */
    public abstract void mo24948c();

    /* renamed from: d */
    public abstract void mo24949d();

    @KeepForSdk
    /* renamed from: e */
    public Context mo24950e() {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    /* renamed from: f */
    public Looper mo24951f() {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    /* renamed from: g */
    public void mo24952g() {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public static final class Builder {

        /* renamed from: a */
        private Account f13658a;

        /* renamed from: b */
        private final Set<Scope> f13659b = new HashSet();

        /* renamed from: c */
        private final Set<Scope> f13660c = new HashSet();

        /* renamed from: d */
        private int f13661d;

        /* renamed from: e */
        private View f13662e;

        /* renamed from: f */
        private String f13663f;

        /* renamed from: g */
        private String f13664g;

        /* renamed from: h */
        private final Map<Api<?>, ClientSettings.OptionalApiSettings> f13665h = new C4868a();

        /* renamed from: i */
        private final Context f13666i;

        /* renamed from: j */
        private final Map<Api<?>, Api.ApiOptions> f13667j = new C4868a();

        /* renamed from: k */
        private LifecycleActivity f13668k;

        /* renamed from: l */
        private int f13669l = -1;

        /* renamed from: m */
        private OnConnectionFailedListener f13670m;

        /* renamed from: n */
        private Looper f13671n;

        /* renamed from: o */
        private GoogleApiAvailability f13672o = GoogleApiAvailability.m15256a();

        /* renamed from: p */
        private Api.AbstractClientBuilder<? extends zad, SignInOptions> f13673p = zaa.f23701c;

        /* renamed from: q */
        private final ArrayList<ConnectionCallbacks> f13674q = new ArrayList<>();

        /* renamed from: r */
        private final ArrayList<OnConnectionFailedListener> f13675r = new ArrayList<>();

        @KeepForSdk
        public Builder(Context context) {
            this.f13666i = context;
            this.f13671n = context.getMainLooper();
            this.f13663f = context.getPackageName();
            this.f13664g = context.getClass().getName();
        }

        /* renamed from: a */
        public final Builder mo24953a(Handler handler) {
            Preconditions.m16038a(handler, (Object) "Handler must not be null");
            this.f13671n = handler.getLooper();
            return this;
        }

        @KeepForSdk
        @VisibleForTesting
        /* renamed from: b */
        public final ClientSettings mo24959b() {
            SignInOptions signInOptions = SignInOptions.f23678n;
            if (this.f13667j.containsKey(zaa.f23703e)) {
                signInOptions = (SignInOptions) this.f13667j.get(zaa.f23703e);
            }
            return new ClientSettings(this.f13658a, this.f13659b, this.f13665h, this.f13661d, this.f13662e, this.f13663f, this.f13664g, signInOptions, false);
        }

        /* renamed from: a */
        public final Builder mo24956a(ConnectionCallbacks connectionCallbacks) {
            Preconditions.m16038a(connectionCallbacks, (Object) "Listener must not be null");
            this.f13674q.add(connectionCallbacks);
            return this;
        }

        /* renamed from: a */
        public final Builder mo24957a(OnConnectionFailedListener onConnectionFailedListener) {
            Preconditions.m16038a(onConnectionFailedListener, (Object) "Listener must not be null");
            this.f13675r.add(onConnectionFailedListener);
            return this;
        }

        /* renamed from: a */
        public final Builder mo24954a(Api<? extends Api.ApiOptions.NotRequiredOptions> api) {
            Preconditions.m16038a(api, (Object) "Api must not be null");
            this.f13667j.put(api, (Object) null);
            List<Scope> a = api.mo24890c().mo24681a(null);
            this.f13660c.addAll(a);
            this.f13659b.addAll(a);
            return this;
        }

        /* renamed from: a */
        public final <O extends Api.ApiOptions.HasOptions> Builder mo24955a(Api<O> api, O o) {
            Preconditions.m16038a(api, (Object) "Api must not be null");
            Preconditions.m16038a(o, (Object) "Null options are not permitted for this Api");
            this.f13667j.put(api, o);
            List<Scope> a = api.mo24890c().mo24681a(o);
            this.f13660c.addAll(a);
            this.f13659b.addAll(a);
            return this;
        }

        /* renamed from: a */
        public final GoogleApiClient mo24958a() {
            Preconditions.m16044a(!this.f13667j.isEmpty(), (Object) "must call addApi() to add at least one API");
            ClientSettings b = mo24959b();
            Api api = null;
            Map<Api<?>, ClientSettings.OptionalApiSettings> f = b.mo25327f();
            C4868a aVar = new C4868a();
            C4868a aVar2 = new C4868a();
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (Api next : this.f13667j.keySet()) {
                Api.ApiOptions apiOptions = this.f13667j.get(next);
                boolean z2 = f.get(next) != null;
                aVar.put(next, Boolean.valueOf(z2));
                zaq zaq = new zaq(next, z2);
                arrayList.add(zaq);
                Api.AbstractClientBuilder d = next.mo24891d();
                Api api2 = next;
                Api.Client a = d.mo24654a(this.f13666i, this.f13671n, b, apiOptions, zaq, zaq);
                aVar2.put(api2.mo24888a(), a);
                if (d.mo24894a() == 1) {
                    z = apiOptions != null;
                }
                if (a.providesSignIn()) {
                    if (api == null) {
                        api = api2;
                    } else {
                        String b2 = api2.mo24889b();
                        String b3 = api.mo24889b();
                        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 21 + String.valueOf(b3).length());
                        sb.append(b2);
                        sb.append(" cannot be used with ");
                        sb.append(b3);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
            if (api != null) {
                if (!z) {
                    Preconditions.m16049b(this.f13658a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", api.mo24889b());
                    Preconditions.m16049b(this.f13659b.equals(this.f13660c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", api.mo24889b());
                } else {
                    String b4 = api.mo24889b();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(b4).length() + 82);
                    sb2.append("With using ");
                    sb2.append(b4);
                    sb2.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                    throw new IllegalStateException(sb2.toString());
                }
            }
            zaaw zaaw = new zaaw(this.f13666i, new ReentrantLock(), this.f13671n, b, this.f13672o, this.f13673p, aVar, this.f13674q, this.f13675r, aVar2, this.f13669l, zaaw.m15688a((Iterable<Api.Client>) aVar2.values(), true), arrayList, false);
            synchronized (GoogleApiClient.f13657a) {
                GoogleApiClient.f13657a.add(zaaw);
            }
            if (this.f13669l >= 0) {
                zaj.m15830b(this.f13668k).mo25189a(this.f13669l, zaaw, this.f13670m);
            }
            return zaaw;
        }
    }

    @KeepForSdk
    /* renamed from: a */
    public <C extends Api.Client> C mo24939a(Api.AnyClientKey<C> anyClientKey) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    /* renamed from: a */
    public boolean mo24944a(SignInConnectionListener signInConnectionListener) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo24942a(zacm zacm) {
        throw new UnsupportedOperationException();
    }
}
