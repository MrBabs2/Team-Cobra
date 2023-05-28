package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzk;
import java.util.Locale;

@TargetApi(28)
public final class zzaxy extends zzaxx {
    /* renamed from: a */
    public final void mo27816a(Activity activity) {
        if (((Boolean) zzyt.m25670e().mo27163a(zzacu.f17822M0)).booleanValue() && zzk.zzlk().mo27743i().mo27772b() == null && !activity.isInMultiWindowMode()) {
            m20370a(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new C7683l5(this, activity));
        }
    }

    /* renamed from: a */
    private static void m20370a(boolean z, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i = attributes.layoutInDisplayCutoutMode;
        int i2 = z ? 1 : 2;
        if (i2 != i) {
            attributes.layoutInDisplayCutoutMode = i2;
            window.setAttributes(attributes);
        }
    }

    /* renamed from: a */
    static /* synthetic */ WindowInsets m20369a(Activity activity, View view, WindowInsets windowInsets) {
        if (zzk.zzlk().mo27743i().mo27772b() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String str = "";
            if (displayCutout != null) {
                zzaxb i = zzk.zzlk().mo27743i();
                for (Rect next : displayCutout.getBoundingRects()) {
                    String format = String.format(Locale.US, "%d,%d,%d,%d", new Object[]{Integer.valueOf(next.left), Integer.valueOf(next.top), Integer.valueOf(next.right), Integer.valueOf(next.bottom)});
                    if (!TextUtils.isEmpty(str)) {
                        str = String.valueOf(str).concat("|");
                    }
                    String valueOf = String.valueOf(str);
                    String valueOf2 = String.valueOf(format);
                    str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                }
                i.mo27775b(str);
            } else {
                zzk.zzlk().mo27743i().mo27775b(str);
            }
        }
        m20370a(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }
}
