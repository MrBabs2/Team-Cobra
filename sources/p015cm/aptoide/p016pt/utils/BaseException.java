package p015cm.aptoide.p016pt.utils;

/* renamed from: cm.aptoide.pt.utils.BaseException */
public abstract class BaseException extends RuntimeException {
    public BaseException() {
    }

    public BaseException(String str) {
        super(str);
    }

    public BaseException(Throwable th) {
        super(th);
    }
}
