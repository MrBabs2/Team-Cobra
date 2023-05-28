package com.bumptech.glide.load.p152o.p153c;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.C5874c;
import com.bumptech.glide.load.C6030l;
import com.bumptech.glide.load.engine.C5992u;
import com.bumptech.glide.load.engine.p147z.C6004e;
import com.bumptech.glide.p166r.C6316k;

/* renamed from: com.bumptech.glide.load.o.c.e */
/* compiled from: BitmapTransformation */
public abstract class C6149e implements C6030l<Bitmap> {
    /* access modifiers changed from: protected */
    public abstract Bitmap transform(C6004e eVar, Bitmap bitmap, int i, int i2);

    public final C5992u<Bitmap> transform(Context context, C5992u<Bitmap> uVar, int i, int i2) {
        if (C6316k.m12999b(i, i2)) {
            C6004e c = C5874c.m11487b(context).mo19958c();
            Bitmap bitmap = uVar.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap transform = transform(c, bitmap, i, i2);
            return bitmap.equals(transform) ? uVar : C6148d.m12395a(transform, c);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }
}
