package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

@TargetApi(17)
public final class zztd extends Surface {

    /* renamed from: h */
    private static boolean f22684h;

    /* renamed from: i */
    private static boolean f22685i;

    /* renamed from: f */
    private final t30 f22686f;

    /* renamed from: g */
    private boolean f22687g;

    private zztd(t30 t30, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f22686f = t30;
    }

    /* renamed from: a */
    public static synchronized boolean m25300a(Context context) {
        boolean z;
        synchronized (zztd.class) {
            if (!f22685i) {
                if (zzsy.f22671a >= 17) {
                    boolean z2 = false;
                    String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                        if (!(zzsy.f22671a == 24 && (zzsy.f22674d.startsWith("SM-G950") || zzsy.f22674d.startsWith("SM-G955")) && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))) {
                            z2 = true;
                        }
                    }
                    f22684h = z2;
                }
                f22685i = true;
            }
            z = f22684h;
        }
        return z;
    }

    public final void release() {
        super.release();
        synchronized (this.f22686f) {
            if (!this.f22687g) {
                this.f22686f.mo26566a();
                this.f22687g = true;
            }
        }
    }

    /* renamed from: a */
    public static zztd m25299a(Context context, boolean z) {
        if (zzsy.f22671a >= 17) {
            zzsk.m25218b(!z || m25300a(context));
            return new t30().mo26565a(z);
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }
}
