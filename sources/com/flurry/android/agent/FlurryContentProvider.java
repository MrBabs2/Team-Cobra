package com.flurry.android.agent;

import android.app.ActivityManager;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.flurry.sdk.C6747b0;
import com.flurry.sdk.C6766c2;
import com.flurry.sdk.C6792d1;
import com.flurry.sdk.C6812e7;
import com.flurry.sdk.C6951o1;
import com.flurry.sdk.C6970p1;
import java.util.Locale;

public class FlurryContentProvider extends ContentProvider {

    /* renamed from: g */
    private static UriMatcher f12512g;

    /* renamed from: h */
    private static final long f12513h = System.nanoTime();

    /* renamed from: f */
    private MatrixCursor f12514f;

    /* renamed from: a */
    public static String m14354a(Context context) {
        String packageName = context.getApplicationContext().getPackageName();
        return packageName + ".FlurryContentProvider";
    }

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
        String a = m14354a(getContext());
        UriMatcher uriMatcher = new UriMatcher(-1);
        f12512g = uriMatcher;
        uriMatcher.addURI(a, "performance", 1);
        if (!C6766c2.m14421a(16)) {
            C6792d1.m14488e("FlurryContentProvider", String.format(Locale.getDefault(), "Device SDK Version older than %d", new Object[]{16}));
            return true;
        }
        Runtime runtime = Runtime.getRuntime();
        ActivityManager.MemoryInfo a2 = C6970p1.m14806a(getContext());
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"START_TIME", "RUNTIME_USED_MEMORY", "SYSTEM_USED_MEMORY"});
        this.f12514f = matrixCursor;
        matrixCursor.newRow().add(Long.valueOf(f12513h)).add(Long.valueOf(runtime.totalMemory() - runtime.freeMemory())).add(Long.valueOf(a2.totalMem - a2.availMem));
        C6951o1.m14763a().mo23668a(getContext(), this.f12514f);
        C6747b0.m14387a(getContext());
        C6812e7.m14513a();
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (f12512g.match(uri) != 1) {
            return null;
        }
        return this.f12514f;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
