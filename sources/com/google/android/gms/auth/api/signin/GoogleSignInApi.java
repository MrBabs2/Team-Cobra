package com.google.android.gms.auth.api.signin;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

public interface GoogleSignInApi {
    /* renamed from: a */
    Intent mo24750a(GoogleApiClient googleApiClient);

    /* renamed from: a */
    GoogleSignInResult mo24751a(Intent intent);

    /* renamed from: b */
    PendingResult<Status> mo24752b(GoogleApiClient googleApiClient);

    /* renamed from: c */
    PendingResult<Status> mo24753c(GoogleApiClient googleApiClient);
}
