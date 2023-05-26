package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

/* renamed from: androidx.core.widget.l */
/* compiled from: TintableImageSourceView */
public interface C0440l {
    ColorStateList getSupportImageTintList();

    PorterDuff.Mode getSupportImageTintMode();

    void setSupportImageTintList(ColorStateList colorStateList);

    void setSupportImageTintMode(PorterDuff.Mode mode);
}
