package com.facebook;

public class FacebookServiceException extends FacebookException {

    /* renamed from: f */
    private final FacebookRequestError f11630f;

    public FacebookServiceException(FacebookRequestError facebookRequestError, String str) {
        super(str);
        this.f11630f = facebookRequestError;
    }

    /* renamed from: a */
    public final FacebookRequestError mo20824a() {
        return this.f11630f;
    }

    public final String toString() {
        return "{FacebookServiceException: " + "httpResponseCode: " + this.f11630f.mo20817e() + ", facebookErrorCode: " + this.f11630f.mo20812a() + ", facebookErrorType: " + this.f11630f.mo20814c() + ", message: " + this.f11630f.mo20813b() + "}";
    }
}
