package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.google.android.gms.common.util.PlatformVersion;

@TargetApi(19)
public final class zzced {

    /* renamed from: a */
    private Context f20052a;

    /* renamed from: b */
    private PopupWindow f20053b;

    /* renamed from: b */
    private static PopupWindow m22431b(Context context, View view) {
        Window window = context instanceof Activity ? ((Activity) context).getWindow() : null;
        if (window == null || window.getDecorView() == null || ((Activity) context).isDestroyed()) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(view, -1, -1);
        PopupWindow popupWindow = new PopupWindow(frameLayout, 1, 1, false);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setClippingEnabled(false);
        zzbad.m20516a("Displaying the 1x1 popup off the screen.");
        try {
            popupWindow.showAtLocation(window.getDecorView(), 0, -1, -1);
            return popupWindow;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo28666a(Context context, View view) {
        if (PlatformVersion.m16290f() && !PlatformVersion.m16292h()) {
            PopupWindow b = m22431b(context, view);
            this.f20053b = b;
            if (b == null) {
                context = null;
            }
            this.f20052a = context;
        }
    }

    /* renamed from: a */
    public final void mo28665a() {
        Context context = this.f20052a;
        if (context != null && this.f20053b != null) {
            if (!(context instanceof Activity) || !((Activity) context).isDestroyed()) {
                if (this.f20053b.isShowing()) {
                    this.f20053b.dismiss();
                }
                this.f20052a = null;
                this.f20053b = null;
                return;
            }
            this.f20052a = null;
            this.f20053b = null;
        }
    }
}
