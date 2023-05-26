package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

public class GoogleSignInResult implements Result {

    /* renamed from: f */
    private Status f13567f;

    /* renamed from: g */
    private GoogleSignInAccount f13568g;

    public GoogleSignInResult(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f13568g = googleSignInAccount;
        this.f13567f = status;
    }

    /* renamed from: a */
    public GoogleSignInAccount mo24773a() {
        return this.f13568g;
    }

    /* renamed from: c */
    public boolean mo24774c() {
        return this.f13567f.mo24986q();
    }

    public Status getStatus() {
        return this.f13567f;
    }
}
