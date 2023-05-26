package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zaj;
import com.google.android.gms.signin.zaa;
import com.google.android.gms.signin.zad;
import java.util.Set;

public final class zace extends zac implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {

    /* renamed from: m */
    private static Api.AbstractClientBuilder<? extends zad, SignInOptions> f13942m = zaa.f23701c;

    /* renamed from: f */
    private final Context f13943f;

    /* renamed from: g */
    private final Handler f13944g;

    /* renamed from: h */
    private final Api.AbstractClientBuilder<? extends zad, SignInOptions> f13945h;

    /* renamed from: i */
    private Set<Scope> f13946i;

    /* renamed from: j */
    private ClientSettings f13947j;

    /* renamed from: k */
    private zad f13948k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public zach f13949l;

    public zace(Context context, Handler handler, ClientSettings clientSettings) {
        this(context, handler, clientSettings, f13942m);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m15785b(zaj zaj) {
        ConnectionResult d = zaj.mo30699d();
        if (d.mo24846t()) {
            ResolveAccountResponse o = zaj.mo30700o();
            ConnectionResult o2 = o.mo25381o();
            if (!o2.mo24846t()) {
                String valueOf = String.valueOf(o2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                this.f13949l.mo25040b(o2);
                this.f13948k.disconnect();
                return;
            }
            this.f13949l.mo25039a(o.mo25379d(), this.f13946i);
        } else {
            this.f13949l.mo25040b(d);
        }
        this.f13948k.disconnect();
    }

    /* renamed from: Z */
    public final zad mo25178Z() {
        return this.f13948k;
    }

    /* renamed from: a */
    public final void mo25179a(zach zach) {
        zad zad = this.f13948k;
        if (zad != null) {
            zad.disconnect();
        }
        this.f13947j.mo25322a(Integer.valueOf(System.identityHashCode(this)));
        Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder = this.f13945h;
        Context context = this.f13943f;
        Looper looper = this.f13944g.getLooper();
        ClientSettings clientSettings = this.f13947j;
        this.f13948k = (zad) abstractClientBuilder.mo24654a(context, looper, clientSettings, clientSettings.mo25331j(), this, this);
        this.f13949l = zach;
        Set<Scope> set = this.f13946i;
        if (set == null || set.isEmpty()) {
            this.f13944g.post(new C7177f0(this));
        } else {
            this.f13948k.mo30682a();
        }
    }

    /* renamed from: d */
    public final void mo24961d(Bundle bundle) {
        this.f13948k.mo30684a(this);
    }

    /* renamed from: h0 */
    public final void mo25180h0() {
        zad zad = this.f13948k;
        if (zad != null) {
            zad.disconnect();
        }
    }

    public zace(Context context, Handler handler, ClientSettings clientSettings, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder) {
        this.f13943f = context;
        this.f13944g = handler;
        Preconditions.m16038a(clientSettings, (Object) "ClientSettings must not be null");
        this.f13947j = clientSettings;
        this.f13946i = clientSettings.mo25330i();
        this.f13945h = abstractClientBuilder;
    }

    /* renamed from: a */
    public final void mo24960a(int i) {
        this.f13948k.disconnect();
    }

    /* renamed from: a */
    public final void mo24962a(ConnectionResult connectionResult) {
        this.f13949l.mo25040b(connectionResult);
    }

    /* renamed from: a */
    public final void mo25109a(zaj zaj) {
        this.f13944g.post(new C7179g0(this, zaj));
    }
}
