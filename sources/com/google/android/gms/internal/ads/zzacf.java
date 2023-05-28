package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;

@zzard
public final class zzacf {

    /* renamed from: a */
    private final Context f17758a;

    public zzacf(Context context) {
        Preconditions.m16038a(context, (Object) "Context can not be null");
        this.f17758a = context;
    }

    /* renamed from: a */
    public final boolean mo27149a() {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return m18950a(intent);
    }

    /* renamed from: b */
    public final boolean mo27150b() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return m18950a(intent);
    }

    /* renamed from: c */
    public final boolean mo27151c() {
        return ((Boolean) zzazl.m20448a(this.f17758a, new C7640k())).booleanValue() && Wrappers.m16317a(this.f17758a).mo25505a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    @TargetApi(14)
    /* renamed from: d */
    public final boolean mo27152d() {
        return m18950a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    /* renamed from: a */
    private final boolean m18950a(Intent intent) {
        Preconditions.m16038a(intent, (Object) "Intent can not be null");
        if (!this.f17758a.getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
            return true;
        }
        return false;
    }
}
