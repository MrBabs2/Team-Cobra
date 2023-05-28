package com.airbnb.epoxy;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import kotlin.jvm.internal.C10202j;
import p050l.p075h.p084l.C5071v;

/* renamed from: com.airbnb.epoxy.b */
/* compiled from: ActivityRecyclerPool.kt */
public final class C5568b {
    /* renamed from: a */
    public static final boolean m10541a(Context context) {
        if (context == null) {
            return true;
        }
        if (!(context instanceof Activity)) {
            return false;
        }
        Activity activity = (Activity) context;
        if (activity.isFinishing()) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            return activity.isDestroyed();
        }
        Window window = activity.getWindow();
        C10202j.m34174a((Object) window, "window");
        if (!C5071v.m9139D(window.getDecorView())) {
            return true;
        }
        return false;
    }
}
