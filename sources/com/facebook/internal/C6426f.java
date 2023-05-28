package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.facebook.C4716f;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.facebook.internal.f */
/* compiled from: CustomTabUtils */
public class C6426f {

    /* renamed from: a */
    private static final String[] f11797a = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    /* renamed from: a */
    public static String m13316a() {
        Context e = C4716f.m7696e();
        List<ResolveInfo> queryIntentServices = e.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (queryIntentServices == null) {
            return null;
        }
        HashSet hashSet = new HashSet(Arrays.asList(f11797a));
        for (ResolveInfo resolveInfo : queryIntentServices) {
            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                return serviceInfo.packageName;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m13317b() {
        return "fbconnect://cct." + C4716f.m7696e().getPackageName();
    }
}
