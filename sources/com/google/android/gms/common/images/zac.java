package com.google.android.gms.common.images;

import android.widget.ImageView;
import com.google.android.gms.common.internal.Objects;
import java.lang.ref.WeakReference;

public final class zac extends zaa {

    /* renamed from: b */
    private WeakReference<ImageView> f14057b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zac)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ImageView imageView = (ImageView) this.f14057b.get();
        ImageView imageView2 = (ImageView) ((zac) obj).f14057b.get();
        return (imageView2 == null || imageView == null || !Objects.m16031a(imageView2, imageView)) ? false : true;
    }

    public final int hashCode() {
        return 0;
    }
}
