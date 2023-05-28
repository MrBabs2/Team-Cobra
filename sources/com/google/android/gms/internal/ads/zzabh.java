package com.google.android.gms.internal.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.wrappers.Wrappers;

@zzard
public final class zzabh extends ContentProvider {
    /* renamed from: a */
    private static Bundle m18862a(Context context) {
        try {
            return Wrappers.m16317a(context).mo25507a(context.getPackageName(), 128).metaData;
        } catch (NullPointerException e) {
            zzbad.m20520b("Failed to load metadata: Null pointer exception", e);
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            zzbad.m20520b("Failed to load metadata: Package name not found", e2);
            return null;
        }
    }

    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        String str;
        Bundle a = m18862a(context);
        Boolean bool = null;
        if (a != null) {
            try {
                str = (String) a.get("com.google.android.gms.ads.APPLICATION_ID");
            } catch (ClassCastException unused) {
                zzbad.m20519b("The com.google.android.gms.ads.APPLICATION_ID metadata must have a String value");
                str = null;
            }
            try {
                bool = (Boolean) a.get("com.google.android.gms.ads.AD_MANAGER_APP");
            } catch (ClassCastException unused2) {
                zzbad.m20519b("The com.google.android.gms.ads.AD_MANAGER_APP metadata must have a boolean value");
            }
        } else {
            str = null;
        }
        if ((bool == null || !bool.booleanValue()) && str == null) {
            throw new IllegalStateException("\n\n******************************************************************************\n* The Google Mobile Ads SDK was initialized incorrectly. AdMob publishers    *\n* should follow the instructions here: https://goo.gl/fQ2neu to add a valid  *\n* App ID inside the AndroidManifest. Google Ad Manager publishers should     *\n* follow instructions here: https://goo.gl/h17b6x.                           *\n******************************************************************************\n\n");
        }
        if (str != null) {
            if (str.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$")) {
                String valueOf = String.valueOf(str);
                zzbad.m20516a(valueOf.length() != 0 ? "Publisher provided Google AdMob App ID in manifest: ".concat(valueOf) : new String("Publisher provided Google AdMob App ID in manifest: "));
                zzami.m19401a(context, str);
            } else {
                throw new IllegalStateException("\n\n******************************************************************************\n* Invalid application ID. Follow instructions here: https://goo.gl/fQ2neu to *\n* find your app ID.                                                          *\n******************************************************************************\n\n");
            }
        }
        super.attachInfo(context, providerInfo);
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        return false;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
