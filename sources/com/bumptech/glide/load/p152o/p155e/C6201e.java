package com.bumptech.glide.load.p152o.p155e;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.C6027i;
import com.bumptech.glide.load.C6028j;
import com.bumptech.glide.load.engine.C5992u;
import java.util.List;

/* renamed from: com.bumptech.glide.load.o.e.e */
/* compiled from: ResourceDrawableDecoder */
public class C6201e implements C6028j<Uri, Drawable> {

    /* renamed from: a */
    private final Context f11324a;

    public C6201e(Context context) {
        this.f11324a = context.getApplicationContext();
    }

    /* renamed from: b */
    private int m12568b(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return m12565a(context, uri);
        }
        if (pathSegments.size() == 1) {
            return m12566a(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    /* renamed from: a */
    public boolean mo20320a(Uri uri, C6027i iVar) {
        return uri.getScheme().equals("android.resource");
    }

    /* renamed from: a */
    public C5992u<Drawable> mo20319a(Uri uri, int i, int i2, C6027i iVar) {
        Context a = m12567a(uri, uri.getAuthority());
        return C6200d.m12561a(C6197a.m12552a(this.f11324a, a, m12568b(a, uri)));
    }

    /* renamed from: a */
    private Context m12567a(Uri uri, String str) {
        if (str.equals(this.f11324a.getPackageName())) {
            return this.f11324a;
        }
        try {
            return this.f11324a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (str.contains(this.f11324a.getPackageName())) {
                return this.f11324a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
        }
    }

    /* renamed from: a */
    private int m12565a(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    /* renamed from: a */
    private int m12566a(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e);
        }
    }
}
