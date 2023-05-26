package com.google.android.gms.auth.api.signin.internal;

import android.content.Intent;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

public final class zzf implements GoogleSignInApi {
    /* renamed from: d */
    private static GoogleSignInOptions m15214d(GoogleApiClient googleApiClient) {
        return ((zzg) googleApiClient.mo24939a(Auth.f13428b)).mo24807d();
    }

    /* renamed from: a */
    public final Intent mo24750a(GoogleApiClient googleApiClient) {
        return zzh.m15220a(googleApiClient.mo24950e(), m15214d(googleApiClient));
    }

    /* renamed from: b */
    public final PendingResult<Status> mo24752b(GoogleApiClient googleApiClient) {
        return zzh.m15224b(googleApiClient, googleApiClient.mo24950e(), false);
    }

    /* renamed from: c */
    public final PendingResult<Status> mo24753c(GoogleApiClient googleApiClient) {
        return zzh.m15222a(googleApiClient, googleApiClient.mo24950e(), false);
    }

    /* renamed from: a */
    public final GoogleSignInResult mo24751a(Intent intent) {
        return zzh.m15221a(intent);
    }
}
