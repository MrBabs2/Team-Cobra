package com.squareup.moshi;

import java.io.IOException;

public final class JsonEncodingException extends IOException {
    public JsonEncodingException(String str) {
        super(str);
    }
}
