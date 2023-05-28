package p015cm.aptoide.p016pt.account.view.exception;

/* renamed from: cm.aptoide.pt.account.view.exception.StoreCreationException */
public class StoreCreationException extends Exception {
    private final String errorCode;

    public StoreCreationException() {
        this.errorCode = null;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public boolean hasErrorCode() {
        return this.errorCode != null;
    }

    public StoreCreationException(String str) {
        this.errorCode = str;
    }
}
