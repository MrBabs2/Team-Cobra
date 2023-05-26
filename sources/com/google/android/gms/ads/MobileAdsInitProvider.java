package com.google.android.gms.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.internal.ads.zzabh;

@KeepForSdkWithMembers
public class MobileAdsInitProvider extends ContentProvider {
    private final zzabh zzaau = new zzabh();

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        this.zzaau.attachInfo(context, providerInfo);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return this.zzaau.delete(uri, str, strArr);
    }

    public String getType(Uri uri) {
        return this.zzaau.getType(uri);
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return this.zzaau.insert(uri, contentValues);
    }

    public boolean onCreate() {
        return this.zzaau.onCreate();
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return this.zzaau.query(uri, strArr, str, strArr2, str2);
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return this.zzaau.update(uri, contentValues, str, strArr);
    }
}
