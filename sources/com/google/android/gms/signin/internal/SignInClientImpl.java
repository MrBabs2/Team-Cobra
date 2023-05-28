package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;

@KeepForSdk
public class SignInClientImpl extends GmsClient<zaf> implements zad {

    /* renamed from: d */
    private final boolean f23687d;

    /* renamed from: e */
    private final ClientSettings f23688e;

    /* renamed from: f */
    private final Bundle f23689f;

    /* renamed from: g */
    private Integer f23690g;

    private SignInClientImpl(Context context, Looper looper, boolean z, ClientSettings clientSettings, Bundle bundle, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 44, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f23687d = true;
        this.f23688e = clientSettings;
        this.f23689f = bundle;
        this.f23690g = clientSettings.mo25326e();
    }

    /* renamed from: a */
    public final void mo30683a(IAccountAccessor iAccountAccessor, boolean z) {
        try {
            ((zaf) getService()).mo30693a(iAccountAccessor, this.f23690g.intValue(), z);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    /* renamed from: b */
    public final void mo30685b() {
        try {
            ((zaf) getService()).mo30695g(this.f23690g.intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof zaf) {
            return (zaf) queryLocalInterface;
        }
        return new zag(iBinder);
    }

    /* access modifiers changed from: protected */
    public Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.f23688e.mo25329h())) {
            this.f23689f.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f23688e.mo25329h());
        }
        return this.f23689f;
    }

    public int getMinApkVersion() {
        return GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    /* access modifiers changed from: protected */
    public String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    public String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    public boolean requiresSignIn() {
        return this.f23687d;
    }

    /* renamed from: a */
    public final void mo30684a(zad zad) {
        Preconditions.m16038a(zad, (Object) "Expecting a valid ISignInCallbacks");
        try {
            Account c = this.f23688e.mo25324c();
            GoogleSignInAccount googleSignInAccount = null;
            if (BaseGmsClient.DEFAULT_ACCOUNT.equals(c.name)) {
                googleSignInAccount = Storage.m15189a(getContext()).mo24793b();
            }
            ((zaf) getService()).mo30694a(new zah(new ResolveAccountRequest(c, this.f23690g.intValue(), googleSignInAccount)), zad);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                zad.mo25109a(new zaj(8));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    public SignInClientImpl(Context context, Looper looper, boolean z, ClientSettings clientSettings, SignInOptions signInOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, true, clientSettings, m26876a(clientSettings), connectionCallbacks, onConnectionFailedListener);
    }

    /* renamed from: a */
    public final void mo30682a() {
        connect(new BaseGmsClient.LegacyClientCallbackAdapter());
    }

    @KeepForSdk
    /* renamed from: a */
    public static Bundle m26876a(ClientSettings clientSettings) {
        SignInOptions j = clientSettings.mo25331j();
        Integer e = clientSettings.mo25326e();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", clientSettings.mo25320a());
        if (e != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", e.intValue());
        }
        if (j != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", j.mo30680h());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", j.mo30679g());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", j.mo30677e());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", j.mo30678f());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", j.mo30675c());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", j.mo30681i());
            if (j.mo30674b() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", j.mo30674b().longValue());
            }
            if (j.mo30676d() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", j.mo30676d().longValue());
            }
        }
        return bundle;
    }
}
