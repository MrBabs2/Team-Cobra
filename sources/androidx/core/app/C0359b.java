package androidx.core.app;

import android.app.ActivityOptions;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;

/* renamed from: androidx.core.app.b */
/* compiled from: ActivityOptionsCompat */
public class C0359b {

    /* renamed from: androidx.core.app.b$a */
    /* compiled from: ActivityOptionsCompat */
    private static class C0360a extends C0359b {

        /* renamed from: a */
        private final ActivityOptions f1648a;

        C0360a(ActivityOptions activityOptions) {
            this.f1648a = activityOptions;
        }

        /* renamed from: a */
        public Bundle mo2209a() {
            return this.f1648a.toBundle();
        }
    }

    protected C0359b() {
    }

    /* renamed from: a */
    public static C0359b m1782a(Context context, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 16) {
            return new C0360a(ActivityOptions.makeCustomAnimation(context, i, i2));
        }
        return new C0359b();
    }

    /* renamed from: a */
    public Bundle mo2209a() {
        return null;
    }
}
