package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;

@VisibleForTesting
public final class zzaht {

    /* renamed from: a */
    private final Context f18119a;

    /* renamed from: b */
    private final zzdh f18120b;

    /* renamed from: c */
    private final View f18121c;

    public zzaht(Context context, zzdh zzdh, View view) {
        this.f18119a = context;
        this.f18120b = zzdh;
        this.f18121c = view;
    }

    /* renamed from: a */
    private static Intent m19246a(Uri uri) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    @VisibleForTesting
    /* renamed from: a */
    private final ResolveInfo m19247a(Intent intent) {
        return m19248a(intent, (ArrayList<ResolveInfo>) new ArrayList());
    }

    @VisibleForTesting
    /* renamed from: a */
    private final ResolveInfo m19248a(Intent intent, ArrayList<ResolveInfo> arrayList) {
        ResolveInfo resolveInfo = null;
        try {
            PackageManager packageManager = this.f18119a.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                int i = 0;
                while (true) {
                    if (i >= queryIntentActivities.size()) {
                        break;
                    }
                    ResolveInfo resolveInfo2 = queryIntentActivities.get(i);
                    if (resolveActivity != null && resolveActivity.activityInfo.name.equals(resolveInfo2.activityInfo.name)) {
                        resolveInfo = resolveActivity;
                        break;
                    }
                    i++;
                }
            }
            arrayList.addAll(queryIntentActivities);
            return resolveInfo;
        } catch (Throwable th) {
            zzk.zzlk().mo27734a(th, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
        }
    }

    /* renamed from: a */
    private static Intent m19245a(Intent intent, ResolveInfo resolveInfo) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c0 A[ADDED_TO_REGION] */
    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Intent mo27303a(java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
            r10 = this;
            android.content.Context r0 = r10.f18119a
            java.lang.String r1 = "activity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            java.lang.String r1 = "u"
            java.lang.Object r1 = r11.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 0
            if (r2 == 0) goto L_0x001a
            return r3
        L_0x001a:
            android.content.Context r2 = r10.f18119a
            com.google.android.gms.internal.ads.zzdh r4 = r10.f18120b
            android.view.View r5 = r10.f18121c
            java.lang.String r1 = com.google.android.gms.internal.ads.zzahs.m19240a(r2, r4, r1, r5, r3)
            android.net.Uri r1 = android.net.Uri.parse(r1)
            java.lang.String r2 = "use_first_package"
            java.lang.Object r2 = r11.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            java.lang.String r4 = "use_running_process"
            java.lang.Object r4 = r11.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            java.lang.String r5 = "use_custom_tabs"
            java.lang.Object r11 = r11.get(r5)
            java.lang.String r11 = (java.lang.String) r11
            boolean r11 = java.lang.Boolean.parseBoolean(r11)
            r5 = 0
            if (r11 != 0) goto L_0x0064
            com.google.android.gms.internal.ads.zzacj<java.lang.Boolean> r11 = com.google.android.gms.internal.ads.zzacu.f17890c2
            com.google.android.gms.internal.ads.zzacr r6 = com.google.android.gms.internal.ads.zzyt.m25670e()
            java.lang.Object r11 = r6.mo27163a(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x0062
            goto L_0x0064
        L_0x0062:
            r11 = 0
            goto L_0x0065
        L_0x0064:
            r11 = 1
        L_0x0065:
            java.lang.String r6 = r1.getScheme()
            java.lang.String r7 = "http"
            boolean r6 = r7.equalsIgnoreCase(r6)
            java.lang.String r8 = "https"
            if (r6 == 0) goto L_0x0080
            android.net.Uri$Builder r3 = r1.buildUpon()
            android.net.Uri$Builder r3 = r3.scheme(r8)
            android.net.Uri r3 = r3.build()
            goto L_0x0096
        L_0x0080:
            java.lang.String r6 = r1.getScheme()
            boolean r6 = r8.equalsIgnoreCase(r6)
            if (r6 == 0) goto L_0x0096
            android.net.Uri$Builder r3 = r1.buildUpon()
            android.net.Uri$Builder r3 = r3.scheme(r7)
            android.net.Uri r3 = r3.build()
        L_0x0096:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            android.content.Intent r1 = m19246a((android.net.Uri) r1)
            android.content.Intent r3 = m19246a((android.net.Uri) r3)
            if (r11 == 0) goto L_0x00b5
            com.google.android.gms.ads.internal.zzk.zzlg()
            android.content.Context r11 = r10.f18119a
            com.google.android.gms.internal.ads.zzaxi.m20284b((android.content.Context) r11, (android.content.Intent) r1)
            com.google.android.gms.ads.internal.zzk.zzlg()
            android.content.Context r11 = r10.f18119a
            com.google.android.gms.internal.ads.zzaxi.m20284b((android.content.Context) r11, (android.content.Intent) r3)
        L_0x00b5:
            android.content.pm.ResolveInfo r11 = r10.m19248a((android.content.Intent) r1, (java.util.ArrayList<android.content.pm.ResolveInfo>) r6)
            if (r11 == 0) goto L_0x00c0
            android.content.Intent r11 = m19245a((android.content.Intent) r1, (android.content.pm.ResolveInfo) r11)
            return r11
        L_0x00c0:
            if (r3 == 0) goto L_0x00d3
            android.content.pm.ResolveInfo r11 = r10.m19247a((android.content.Intent) r3)
            if (r11 == 0) goto L_0x00d3
            android.content.Intent r11 = m19245a((android.content.Intent) r1, (android.content.pm.ResolveInfo) r11)
            android.content.pm.ResolveInfo r3 = r10.m19247a((android.content.Intent) r11)
            if (r3 == 0) goto L_0x00d3
            return r11
        L_0x00d3:
            int r11 = r6.size()
            if (r11 != 0) goto L_0x00da
            return r1
        L_0x00da:
            if (r4 == 0) goto L_0x0114
            if (r0 == 0) goto L_0x0114
            java.util.List r11 = r0.getRunningAppProcesses()
            if (r11 == 0) goto L_0x0114
            int r0 = r6.size()
            r3 = 0
        L_0x00e9:
            if (r3 >= r0) goto L_0x0114
            java.lang.Object r4 = r6.get(r3)
            int r3 = r3 + 1
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            java.util.Iterator r7 = r11.iterator()
        L_0x00f7:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00e9
            java.lang.Object r8 = r7.next()
            android.app.ActivityManager$RunningAppProcessInfo r8 = (android.app.ActivityManager.RunningAppProcessInfo) r8
            java.lang.String r8 = r8.processName
            android.content.pm.ActivityInfo r9 = r4.activityInfo
            java.lang.String r9 = r9.packageName
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x00f7
            android.content.Intent r11 = m19245a((android.content.Intent) r1, (android.content.pm.ResolveInfo) r4)
            return r11
        L_0x0114:
            if (r2 == 0) goto L_0x0121
            java.lang.Object r11 = r6.get(r5)
            android.content.pm.ResolveInfo r11 = (android.content.pm.ResolveInfo) r11
            android.content.Intent r11 = m19245a((android.content.Intent) r1, (android.content.pm.ResolveInfo) r11)
            return r11
        L_0x0121:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaht.mo27303a(java.util.Map):android.content.Intent");
    }
}
