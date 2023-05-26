package p015cm.aptoide.p016pt.account;

/* renamed from: cm.aptoide.pt.account.FacebookSignUpException */
public class FacebookSignUpException extends Exception {
    public static final int ERROR = 99;
    public static final int MISSING_REQUIRED_PERMISSIONS = 1;
    public static final int USER_CANCELLED = 2;
    private final int code;
    private final String facebookMessage;

    public FacebookSignUpException(int i, String str) {
        this.code = i;
        this.facebookMessage = str;
    }

    public int getCode() {
        return this.code;
    }

    public String getFacebookMessage() {
        return this.facebookMessage;
    }
}
