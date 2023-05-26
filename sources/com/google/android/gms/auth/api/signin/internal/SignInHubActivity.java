package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.C0456c;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p050l.p094l.p095a.C5112a;
import p050l.p094l.p096b.C5121b;

@KeepName
public class SignInHubActivity extends C0456c {

    /* renamed from: k */
    private static boolean f13581k = false;

    /* renamed from: f */
    private boolean f13582f = false;

    /* renamed from: g */
    private SignInConfiguration f13583g;

    /* renamed from: h */
    private boolean f13584h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f13585i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Intent f13586j;

    /* renamed from: a */
    private final void m15182a() {
        getSupportLoaderManager().mo17725a(0, (Bundle) null, new C7147a());
        f13581k = false;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.f13582f) {
            setResult(0);
            if (i == 40962) {
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                    if (signInAccount != null && signInAccount.mo24777a() != null) {
                        GoogleSignInAccount a = signInAccount.mo24777a();
                        zzp.m15225a(this).mo24814a(this.f13583g.mo24786d(), a);
                        intent.removeExtra("signInAccount");
                        intent.putExtra("googleSignInAccount", a);
                        this.f13584h = true;
                        this.f13585i = i2;
                        this.f13586j = intent;
                        m15182a();
                        return;
                    } else if (intent.hasExtra("errorCode")) {
                        int intExtra = intent.getIntExtra("errorCode", 8);
                        if (intExtra == 13) {
                            intExtra = AccountAnalytics.UNKNOWN_STATUS_CODE;
                        }
                        m15183a(intExtra);
                        return;
                    }
                }
                m15183a(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            m15183a(12500);
        } else if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            SignInConfiguration signInConfiguration = (SignInConfiguration) intent.getBundleExtra("config").getParcelable("config");
            this.f13583g = signInConfiguration;
            if (signInConfiguration == null) {
                Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            if (!(bundle == null)) {
                boolean z = bundle.getBoolean("signingInGoogleApiClients");
                this.f13584h = z;
                if (z) {
                    this.f13585i = bundle.getInt("signInResultCode");
                    this.f13586j = (Intent) bundle.getParcelable("signInResultData");
                    m15182a();
                }
            } else if (f13581k) {
                setResult(0);
                m15183a(12502);
            } else {
                f13581k = true;
                Intent intent2 = new Intent(action);
                if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                    intent2.setPackage("com.google.android.gms");
                } else {
                    intent2.setPackage(getPackageName());
                }
                intent2.putExtra("config", this.f13583g);
                try {
                    startActivityForResult(intent2, 40962);
                } catch (ActivityNotFoundException unused) {
                    this.f13582f = true;
                    Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                    m15183a(17);
                }
            }
        } else {
            String valueOf = String.valueOf(intent.getAction());
            Log.e("AuthSignInClient", valueOf.length() != 0 ? "Unknown action: ".concat(valueOf) : new String("Unknown action: "));
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f13584h);
        if (this.f13584h) {
            bundle.putInt("signInResultCode", this.f13585i);
            bundle.putParcelable("signInResultData", this.f13586j);
        }
    }

    /* renamed from: com.google.android.gms.auth.api.signin.internal.SignInHubActivity$a */
    private class C7147a implements C5112a.C5113a<Void> {
        private C7147a() {
        }

        /* renamed from: a */
        public final C5121b<Void> mo17728a(int i, Bundle bundle) {
            return new zze(SignInHubActivity.this, GoogleApiClient.m15328h());
        }

        /* renamed from: a */
        public final void mo17729a(C5121b<Void> bVar) {
        }

        /* renamed from: a */
        public final /* synthetic */ void mo17730a(C5121b bVar, Object obj) {
            SignInHubActivity signInHubActivity = SignInHubActivity.this;
            signInHubActivity.setResult(signInHubActivity.f13585i, SignInHubActivity.this.f13586j);
            SignInHubActivity.this.finish();
        }
    }

    /* renamed from: a */
    private final void m15183a(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f13581k = false;
    }
}
