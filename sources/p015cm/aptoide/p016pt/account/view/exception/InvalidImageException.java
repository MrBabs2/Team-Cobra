package p015cm.aptoide.p016pt.account.view.exception;

import java.util.List;

/* renamed from: cm.aptoide.pt.account.view.exception.InvalidImageException */
public class InvalidImageException extends Exception {
    private final String errorCode;
    private final List<ImageError> imageErrors;

    /* renamed from: cm.aptoide.pt.account.view.exception.InvalidImageException$ImageError */
    public enum ImageError {
        ERROR_DECODING,
        MIN_HEIGHT,
        MAX_HEIGHT,
        MIN_WIDTH,
        MAX_WIDTH,
        MAX_IMAGE_SIZE,
        API_ERROR
    }

    public InvalidImageException(List<ImageError> list, String str) {
        this.errorCode = str;
        this.imageErrors = list;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public List<ImageError> getImageErrors() {
        return this.imageErrors;
    }

    public InvalidImageException(List<ImageError> list) {
        this.imageErrors = list;
        this.errorCode = null;
    }
}
