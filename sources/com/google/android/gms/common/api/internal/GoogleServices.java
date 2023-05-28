package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.C7158R;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.internal.zzp;
import com.google.android.gms.common.util.VisibleForTesting;

@KeepForSdk
@Deprecated
public final class GoogleServices {

    /* renamed from: c */
    private static final Object f13756c = new Object();

    /* renamed from: d */
    private static GoogleServices f13757d;

    /* renamed from: a */
    private final String f13758a;

    /* renamed from: b */
    private final Status f13759b;

    @KeepForSdk
    @VisibleForTesting
    GoogleServices(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(C7158R.string.common_google_play_services_unknown_issue));
        if (identifier != 0) {
            int integer = resources.getInteger(identifier);
        }
        String a = zzp.m16183a(context);
        a = a == null ? new StringResourceValueReader(context).mo25392a("google_app_id") : a;
        if (TextUtils.isEmpty(a)) {
            this.f13759b = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f13758a = null;
            return;
        }
        this.f13758a = a;
        this.f13759b = Status.f13682j;
    }

    @KeepForSdk
    /* renamed from: a */
    public static Status m15494a(Context context) {
        Status status;
        Preconditions.m16038a(context, (Object) "Context must not be null.");
        synchronized (f13756c) {
            if (f13757d == null) {
                f13757d = new GoogleServices(context);
            }
            status = f13757d.f13759b;
        }
        return status;
    }

    @KeepForSdk
    /* renamed from: a */
    public static String m15496a() {
        return m15495a("getGoogleAppId").f13758a;
    }

    @KeepForSdk
    /* renamed from: a */
    private static GoogleServices m15495a(String str) {
        GoogleServices googleServices;
        synchronized (f13756c) {
            if (f13757d != null) {
                googleServices = f13757d;
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
        }
        return googleServices;
    }
}
