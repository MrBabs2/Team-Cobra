package com.facebook;

public class FacebookDialogException extends FacebookException {

    /* renamed from: f */
    private int f11609f;

    /* renamed from: g */
    private String f11610g;

    public FacebookDialogException(String str, int i, String str2) {
        super(str);
        this.f11609f = i;
        this.f11610g = str2;
    }

    /* renamed from: a */
    public int mo20809a() {
        return this.f11609f;
    }

    /* renamed from: b */
    public String mo20810b() {
        return this.f11610g;
    }

    public final String toString() {
        return "{FacebookDialogException: " + "errorCode: " + mo20809a() + ", message: " + getMessage() + ", url: " + mo20810b() + "}";
    }
}
