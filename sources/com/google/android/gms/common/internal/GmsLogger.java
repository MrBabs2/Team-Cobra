package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public final class GmsLogger {
    public GmsLogger(String str, String str2) {
        Preconditions.m16038a(str, (Object) "log tag cannot be null");
        Preconditions.m16045a(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        if (str2 == null || str2.length() <= 0) {
        }
    }

    public GmsLogger(String str) {
        this(str, (String) null);
    }
}
