package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.auth.api.Auth;

public final class CredentialsOptions extends Auth.AuthCredentialsOptions {

    public static final class Builder extends Auth.AuthCredentialsOptions.Builder {
        /* renamed from: b */
        public final CredentialsOptions mo24659a() {
            return new CredentialsOptions(this);
        }
    }

    static {
        CredentialsOptions credentialsOptions = (CredentialsOptions) new Builder().mo24659a();
    }

    private CredentialsOptions(Builder builder) {
        super(builder);
    }
}
