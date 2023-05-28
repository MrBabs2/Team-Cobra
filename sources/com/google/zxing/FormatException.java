package com.google.zxing;

public final class FormatException extends ReaderException {

    /* renamed from: h */
    private static final FormatException f24981h;

    static {
        FormatException formatException = new FormatException();
        f24981h = formatException;
        formatException.setStackTrace(ReaderException.f24983g);
    }

    private FormatException() {
    }

    /* renamed from: a */
    public static FormatException m28738a() {
        return ReaderException.f24982f ? new FormatException() : f24981h;
    }
}
