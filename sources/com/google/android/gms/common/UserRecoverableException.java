package com.google.android.gms.common;

import android.content.Intent;

public class UserRecoverableException extends Exception {

    /* renamed from: f */
    private final Intent f13633f;

    public UserRecoverableException(String str, Intent intent) {
        super(str);
        this.f13633f = intent;
    }
}
