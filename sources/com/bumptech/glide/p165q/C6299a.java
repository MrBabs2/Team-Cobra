package com.bumptech.glide.p165q;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.bumptech.glide.load.C6022f;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.bumptech.glide.q.a */
/* compiled from: ApplicationVersionSignature */
public final class C6299a {

    /* renamed from: a */
    private static final ConcurrentMap<String, C6022f> f11545a = new ConcurrentHashMap();

    /* renamed from: a */
    private static String m12944a(PackageInfo packageInfo) {
        if (packageInfo != null) {
            return String.valueOf(packageInfo.versionCode);
        }
        return UUID.randomUUID().toString();
    }

    /* renamed from: b */
    public static C6022f m12945b(Context context) {
        String packageName = context.getPackageName();
        C6022f fVar = (C6022f) f11545a.get(packageName);
        if (fVar != null) {
            return fVar;
        }
        C6022f c = m12946c(context);
        C6022f putIfAbsent = f11545a.putIfAbsent(packageName, c);
        return putIfAbsent == null ? c : putIfAbsent;
    }

    /* renamed from: c */
    private static C6022f m12946c(Context context) {
        return new C6301c(m12944a(m12943a(context)));
    }

    /* renamed from: a */
    private static PackageInfo m12943a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e);
            return null;
        }
    }
}
