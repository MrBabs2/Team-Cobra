package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

@zzard
public final class zzbim extends MutableContextWrapper {

    /* renamed from: a */
    private Activity f19016a;

    /* renamed from: b */
    private Context f19017b;

    /* renamed from: c */
    private Context f19018c;

    public zzbim(Context context) {
        super(context);
        setBaseContext(context);
    }

    /* renamed from: a */
    public final Context mo28175a() {
        return this.f19018c;
    }

    /* renamed from: b */
    public final Activity mo28176b() {
        return this.f19016a;
    }

    public final Object getSystemService(String str) {
        return this.f19018c.getSystemService(str);
    }

    public final void setBaseContext(Context context) {
        this.f19017b = context.getApplicationContext();
        this.f19016a = context instanceof Activity ? (Activity) context : null;
        this.f19018c = context;
        super.setBaseContext(this.f19017b);
    }

    public final void startActivity(Intent intent) {
        Activity activity = this.f19016a;
        if (activity != null) {
            activity.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        this.f19017b.startActivity(intent);
    }
}
