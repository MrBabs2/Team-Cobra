package com.google.android.gms.common.wrappers;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;

@KeepForSdk
public class PackageManagerWrapper {

    /* renamed from: a */
    private final Context f14281a;

    public PackageManagerWrapper(Context context) {
        this.f14281a = context;
    }

    @KeepForSdk
    /* renamed from: a */
    public ApplicationInfo mo25507a(String str, int i) throws PackageManager.NameNotFoundException {
        return this.f14281a.getPackageManager().getApplicationInfo(str, i);
    }

    @KeepForSdk
    /* renamed from: b */
    public PackageInfo mo25510b(String str, int i) throws PackageManager.NameNotFoundException {
        return this.f14281a.getPackageManager().getPackageInfo(str, i);
    }

    @TargetApi(19)
    /* renamed from: a */
    public final boolean mo25509a(int i, String str) {
        if (PlatformVersion.m16290f()) {
            try {
                ((AppOpsManager) this.f14281a.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.f14281a.getPackageManager().getPackagesForUid(i);
            if (!(str == null || packagesForUid == null)) {
                for (String equals : packagesForUid) {
                    if (str.equals(equals)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @KeepForSdk
    /* renamed from: b */
    public CharSequence mo25511b(String str) throws PackageManager.NameNotFoundException {
        return this.f14281a.getPackageManager().getApplicationLabel(this.f14281a.getPackageManager().getApplicationInfo(str, 0));
    }

    @KeepForSdk
    /* renamed from: a */
    public int mo25505a(String str) {
        return this.f14281a.checkCallingOrSelfPermission(str);
    }

    @KeepForSdk
    /* renamed from: a */
    public int mo25506a(String str, String str2) {
        return this.f14281a.getPackageManager().checkPermission(str, str2);
    }

    @KeepForSdk
    /* renamed from: a */
    public boolean mo25508a() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return InstantApps.m16309a(this.f14281a);
        }
        if (!PlatformVersion.m16295k() || (nameForUid = this.f14281a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f14281a.getPackageManager().isInstantApp(nameForUid);
    }
}
