package com.bumptech.glide.p162p.p163l;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: com.bumptech.glide.p.l.e */
/* compiled from: ImageViewTargetFactory */
public class C6283e {
    /* renamed from: a */
    public <Z> C6288j<ImageView, Z> mo20717a(ImageView imageView, Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new C6280b(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C6281c(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
