package com.facebook.internal;

import com.facebook.C4716f;
import java.util.Collection;

/* renamed from: com.facebook.internal.v */
/* compiled from: ServerProtocol */
public final class C6474v {

    /* renamed from: a */
    public static final Collection<String> f11913a = C6476x.m13521b((T[]) new String[]{"service_disabled", "AndroidAuthKillSwitchException"});

    /* renamed from: b */
    public static final Collection<String> f11914b = C6476x.m13521b((T[]) new String[]{"access_denied", "OAuthAccessDeniedException"});

    /* renamed from: a */
    public static final String m13472a() {
        return "v6.0";
    }

    /* renamed from: b */
    public static final String m13473b() {
        return String.format("m.%s", new Object[]{C4716f.m7705n()});
    }

    /* renamed from: c */
    public static final String m13474c() {
        return String.format("https://graph.%s", new Object[]{C4716f.m7707p()});
    }

    /* renamed from: d */
    public static final String m13475d() {
        return String.format("https://graph-video.%s", new Object[]{C4716f.m7707p()});
    }
}
