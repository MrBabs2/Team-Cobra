package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
@KeepForSdk
public class GoogleSignatureVerifier {

    /* renamed from: b */
    private static GoogleSignatureVerifier f13625b;

    /* renamed from: a */
    private final Context f13626a;

    private GoogleSignatureVerifier(Context context) {
        this.f13626a = context.getApplicationContext();
    }

    @KeepForSdk
    /* renamed from: a */
    public static GoogleSignatureVerifier m15289a(Context context) {
        Preconditions.m16037a(context);
        synchronized (GoogleSignatureVerifier.class) {
            if (f13625b == null) {
                C7159a.m15295a(context);
                f13625b = new GoogleSignatureVerifier(context);
            }
        }
        return f13625b;
    }

    /* renamed from: a */
    public static boolean m15291a(PackageInfo packageInfo, boolean z) {
        C7218b bVar;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                bVar = m15290a(packageInfo, C7222e.f14049a);
            } else {
                bVar = m15290a(packageInfo, C7222e.f14049a[0]);
            }
            if (bVar != null) {
                return true;
            }
        }
        return false;
    }

    @KeepForSdk
    /* renamed from: a */
    public boolean mo24880a(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m15291a(packageInfo, false)) {
            return true;
        }
        if (m15291a(packageInfo, true)) {
            if (GooglePlayServicesUtilLight.honorsDebugCertificates(this.f13626a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    /* renamed from: a */
    private static C7218b m15290a(PackageInfo packageInfo, C7218b... bVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        C7219c cVar = new C7219c(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < bVarArr.length; i++) {
            if (bVarArr[i].equals(cVar)) {
                return bVarArr[i];
            }
        }
        return null;
    }
}
