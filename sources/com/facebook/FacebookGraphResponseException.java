package com.facebook;

public class FacebookGraphResponseException extends FacebookException {

    /* renamed from: f */
    private final C6371i f11612f;

    public FacebookGraphResponseException(C6371i iVar, String str) {
        super(str);
        this.f11612f = iVar;
    }

    public final String toString() {
        C6371i iVar = this.f11612f;
        FacebookRequestError a = iVar != null ? iVar.mo20918a() : null;
        StringBuilder sb = new StringBuilder();
        sb.append("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (a != null) {
            sb.append("httpResponseCode: ");
            sb.append(a.mo20817e());
            sb.append(", facebookErrorCode: ");
            sb.append(a.mo20812a());
            sb.append(", facebookErrorType: ");
            sb.append(a.mo20814c());
            sb.append(", message: ");
            sb.append(a.mo20813b());
            sb.append("}");
        }
        return sb.toString();
    }
}
