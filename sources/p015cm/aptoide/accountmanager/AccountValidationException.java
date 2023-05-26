package p015cm.aptoide.accountmanager;

/* renamed from: cm.aptoide.accountmanager.AccountValidationException */
public class AccountValidationException extends Exception {
    public static final int EMPTY_CODE = 2;
    public static final int EMPTY_EMAIL = 1;
    public static final int EMPTY_EMAIL_AND_CODE = 3;
    public static final int EMPTY_NAME = 5;
    public static final int EMPTY_NAME_AND_AVATAR = 6;
    public static final int INVALID_PASSWORD = 4;
    private final int code;

    public AccountValidationException(int i) {
        this.code = i;
    }

    public int getCode() {
        return this.code;
    }
}
