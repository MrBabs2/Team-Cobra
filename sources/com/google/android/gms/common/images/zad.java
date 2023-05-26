package com.google.android.gms.common.images;

import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.Objects;
import java.lang.ref.WeakReference;

public final class zad extends zaa {

    /* renamed from: b */
    private WeakReference<ImageManager.OnImageLoadedListener> f14058b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zad)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        zad zad = (zad) obj;
        ImageManager.OnImageLoadedListener onImageLoadedListener = (ImageManager.OnImageLoadedListener) this.f14058b.get();
        ImageManager.OnImageLoadedListener onImageLoadedListener2 = (ImageManager.OnImageLoadedListener) zad.f14058b.get();
        return onImageLoadedListener2 != null && onImageLoadedListener != null && Objects.m16031a(onImageLoadedListener2, onImageLoadedListener) && Objects.m16031a(zad.f14056a, this.f14056a);
    }

    public final int hashCode() {
        return Objects.m16029a(this.f14056a);
    }
}
