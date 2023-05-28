package com.bumptech.glide.load.p148m.p149o;

import android.net.Uri;

/* renamed from: com.bumptech.glide.load.m.o.b */
/* compiled from: MediaStoreUtil */
public final class C6053b {
    /* renamed from: a */
    public static boolean m12152a(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    /* renamed from: a */
    public static boolean m12153a(Uri uri) {
        return m12154b(uri) && !m12156d(uri);
    }

    /* renamed from: b */
    public static boolean m12154b(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* renamed from: c */
    public static boolean m12155c(Uri uri) {
        return m12154b(uri) && m12156d(uri);
    }

    /* renamed from: d */
    private static boolean m12156d(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
