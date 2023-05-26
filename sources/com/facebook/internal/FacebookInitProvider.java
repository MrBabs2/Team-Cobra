package com.facebook.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.facebook.C4716f;

public final class FacebookInitProvider extends ContentProvider {

    /* renamed from: f */
    private static final String f11725f = FacebookInitProvider.class.getSimpleName();

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        try {
            C4716f.m7694c(getContext());
            return false;
        } catch (Exception e) {
            Log.i(f11725f, "Failed to auto initialize the Facebook SDK", e);
            return false;
        }
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
