package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.logging.Logger;

public final class zzh {

    /* renamed from: a */
    private static Logger f13600a = new Logger("GoogleSignInCommon", new String[0]);

    /* renamed from: a */
    public static Intent m15220a(Context context, GoogleSignInOptions googleSignInOptions) {
        f13600a.mo25433a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    /* renamed from: b */
    public static PendingResult<Status> m15224b(GoogleApiClient googleApiClient, Context context, boolean z) {
        f13600a.mo25433a("Revoking access", new Object[0]);
        String d = Storage.m15189a(context).mo24795d();
        m15223a(context);
        if (z) {
            return zzd.m15210a(d);
        }
        return googleApiClient.mo24946b(new C7150c(googleApiClient));
    }

    /* renamed from: a */
    public static PendingResult<Status> m15222a(GoogleApiClient googleApiClient, Context context, boolean z) {
        f13600a.mo25433a("Signing out", new Object[0]);
        m15223a(context);
        if (z) {
            return PendingResults.m15361a(Status.f13682j, googleApiClient);
        }
        return googleApiClient.mo24946b(new C7148a(googleApiClient));
    }

    /* renamed from: a */
    private static void m15223a(Context context) {
        zzp.m15225a(context).mo24813a();
        for (GoogleApiClient g : GoogleApiClient.m15328h()) {
            g.mo24952g();
        }
        GoogleApiManager.m15423d();
    }

    /* renamed from: a */
    public static GoogleSignInResult m15221a(Intent intent) {
        if (intent == null) {
            return null;
        }
        if (!intent.hasExtra("googleSignInStatus") && !intent.hasExtra("googleSignInAccount")) {
            return null;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        if (googleSignInAccount != null) {
            status = Status.f13682j;
        }
        return new GoogleSignInResult(googleSignInAccount, status);
    }
}
