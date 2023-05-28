package com.facebook;

public class FacebookOperationCanceledException extends FacebookException {
    public FacebookOperationCanceledException() {
    }

    public FacebookOperationCanceledException(String str) {
        super(str);
    }
}
