package p015cm.aptoide.p016pt.account;

/* renamed from: cm.aptoide.pt.account.GoogleSignUpException */
public class GoogleSignUpException extends Exception {
    private final String error;
    private final int statusCode;

    public GoogleSignUpException(String str, int i) {
        this.error = str;
        this.statusCode = i;
    }

    public String getError() {
        return this.error;
    }

    public int getStatusCode() {
        return this.statusCode;
    }
}
