package com.bumptech.glide.load;

import java.io.IOException;

public final class HttpException extends IOException {
    public HttpException(int i) {
        this("Http request failed with status code: " + i, i);
    }

    public HttpException(String str) {
        this(str, -1);
    }

    public HttpException(String str, int i) {
        this(str, i, (Throwable) null);
    }

    public HttpException(String str, int i, Throwable th) {
        super(str, th);
    }
}
