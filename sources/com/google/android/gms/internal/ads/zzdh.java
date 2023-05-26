package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

public final class zzdh {

    /* renamed from: d */
    private static final String[] f21416d = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* renamed from: a */
    private String f21417a = "ad.doubleclick.net";

    /* renamed from: b */
    private String[] f21418b = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: c */
    private zzdc f21419c;

    public zzdh(zzdc zzdc) {
        this.f21419c = zzdc;
    }

    /* renamed from: c */
    private final boolean m23584c(Uri uri) {
        if (uri != null) {
            try {
                return uri.getHost().equals(this.f21417a);
            } catch (NullPointerException unused) {
                return false;
            }
        } else {
            throw null;
        }
    }

    /* renamed from: a */
    public final boolean mo29017a(Uri uri) {
        if (uri != null) {
            try {
                String host = uri.getHost();
                for (String endsWith : this.f21418b) {
                    if (host.endsWith(endsWith)) {
                        return true;
                    }
                }
            } catch (NullPointerException unused) {
            }
            return false;
        }
        throw null;
    }

    /* renamed from: b */
    public final boolean mo29018b(Uri uri) {
        if (mo29017a(uri)) {
            for (String endsWith : f21416d) {
                if (uri.getPath().endsWith(endsWith)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final zzdc mo29015a() {
        return this.f21419c;
    }

    /* renamed from: a */
    public final void mo29016a(MotionEvent motionEvent) {
        this.f21419c.zza(motionEvent);
    }

    /* renamed from: a */
    public final Uri mo29014a(Uri uri, Context context, View view, Activity activity) throws zzdi {
        try {
            return m23583a(uri, context, uri.getQueryParameter("ai"), true, view, activity);
        } catch (UnsupportedOperationException unused) {
            throw new zzdi("Provided Uri is not in a valid state");
        }
    }

    /* renamed from: a */
    private final Uri m23583a(Uri uri, Context context, String str, boolean z, View view, Activity activity) throws zzdi {
        String str2;
        try {
            boolean c = m23584c(uri);
            if (c) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new zzdi("Parameter already exists: dc_ms");
                }
            } else if (uri.getQueryParameter("ms") != null) {
                throw new zzdi("Query parameter already exists: ms");
            }
            if (z) {
                str2 = this.f21419c.zza(context, str, view, activity);
            } else {
                str2 = this.f21419c.zza(context);
            }
            if (c) {
                String uri2 = uri.toString();
                int indexOf = uri2.indexOf(";adurl");
                if (indexOf != -1) {
                    int i = indexOf + 1;
                    return Uri.parse(uri2.substring(0, i) + "dc_ms" + "=" + str2 + ";" + uri2.substring(i));
                }
                String encodedPath = uri.getEncodedPath();
                int indexOf2 = uri2.indexOf(encodedPath);
                return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";" + "dc_ms" + "=" + str2 + ";" + uri2.substring(indexOf2 + encodedPath.length()));
            }
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter("ms", str2).build();
            }
            int i2 = indexOf3 + 1;
            return Uri.parse(uri3.substring(0, i2) + "ms" + "=" + str2 + "&" + uri3.substring(i2));
        } catch (UnsupportedOperationException unused) {
            throw new zzdi("Provided Uri is not in a valid state");
        }
    }
}
