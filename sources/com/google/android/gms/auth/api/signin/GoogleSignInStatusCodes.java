package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.CommonStatusCodes;
import p015cm.aptoide.p016pt.account.AccountAnalytics;

public final class GoogleSignInStatusCodes extends CommonStatusCodes {
    private GoogleSignInStatusCodes() {
    }

    /* renamed from: a */
    public static String m15174a(int i) {
        switch (i) {
            case 12500:
                return "A non-recoverable sign in failure occurred";
            case AccountAnalytics.UNKNOWN_STATUS_CODE:
                return "Sign in action cancelled";
            case 12502:
                return "Sign-in in progress";
            default:
                return CommonStatusCodes.m15310a(i);
        }
    }
}
