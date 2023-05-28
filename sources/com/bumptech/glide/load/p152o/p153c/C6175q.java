package com.bumptech.glide.load.p152o.p153c;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.load.C5902b;
import java.io.File;

/* renamed from: com.bumptech.glide.load.o.c.q */
/* compiled from: HardwareConfigState */
final class C6175q {

    /* renamed from: c */
    private static final File f11286c = new File("/proc/self/fd");

    /* renamed from: d */
    private static volatile C6175q f11287d;

    /* renamed from: a */
    private volatile int f11288a;

    /* renamed from: b */
    private volatile boolean f11289b = true;

    private C6175q() {
    }

    /* renamed from: a */
    static C6175q m12480a() {
        if (f11287d == null) {
            synchronized (C6175q.class) {
                if (f11287d == null) {
                    f11287d = new C6175q();
                }
            }
        }
        return f11287d;
    }

    /* renamed from: b */
    private synchronized boolean m12481b() {
        boolean z = true;
        int i = this.f11288a + 1;
        this.f11288a = i;
        if (i >= 50) {
            this.f11288a = 0;
            int length = f11286c.list().length;
            if (length >= 700) {
                z = false;
            }
            this.f11289b = z;
            if (!this.f11289b && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + 700);
            }
        }
        return this.f11289b;
    }

    /* access modifiers changed from: package-private */
    @TargetApi(26)
    /* renamed from: a */
    public boolean mo20463a(int i, int i2, BitmapFactory.Options options, C5902b bVar, boolean z, boolean z2) {
        if (!z || Build.VERSION.SDK_INT < 26 || z2) {
            return false;
        }
        boolean z3 = i >= 128 && i2 >= 128 && m12481b();
        if (z3) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return z3;
    }
}
