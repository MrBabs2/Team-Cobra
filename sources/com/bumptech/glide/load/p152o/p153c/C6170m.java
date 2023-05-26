package com.bumptech.glide.load.p152o.p153c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.load.engine.C5992u;
import com.bumptech.glide.load.engine.p147z.C6004e;
import com.bumptech.glide.load.engine.p147z.C6005f;
import java.util.concurrent.locks.Lock;

/* renamed from: com.bumptech.glide.load.o.c.m */
/* compiled from: DrawableToBitmapConverter */
final class C6170m {

    /* renamed from: a */
    private static final C6004e f11282a = new C6171a();

    /* renamed from: com.bumptech.glide.load.o.c.m$a */
    /* compiled from: DrawableToBitmapConverter */
    class C6171a extends C6005f {
        C6171a() {
        }

        /* renamed from: a */
        public void mo20283a(Bitmap bitmap) {
        }
    }

    /* renamed from: a */
    static C5992u<Bitmap> m12472a(C6004e eVar, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            bitmap = m12473b(eVar, current, i, i2);
            z = true;
        } else {
            bitmap = null;
        }
        if (!z) {
            eVar = f11282a;
        }
        return C6148d.m12395a(bitmap, eVar);
    }

    /* renamed from: b */
    private static Bitmap m12473b(C6004e eVar, Drawable drawable, int i, int i2) {
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        } else if (i2 != Integer.MIN_VALUE || drawable.getIntrinsicHeight() > 0) {
            if (drawable.getIntrinsicWidth() > 0) {
                i = drawable.getIntrinsicWidth();
            }
            if (drawable.getIntrinsicHeight() > 0) {
                i2 = drawable.getIntrinsicHeight();
            }
            Lock a = C6183w.m12507a();
            a.lock();
            Bitmap a2 = eVar.mo20280a(i, i2, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(a2);
                drawable.setBounds(0, 0, i, i2);
                drawable.draw(canvas);
                canvas.setBitmap((Bitmap) null);
                return a2;
            } finally {
                a.unlock();
            }
        } else {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
    }
}
