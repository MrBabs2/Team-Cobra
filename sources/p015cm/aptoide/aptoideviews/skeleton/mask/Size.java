package p015cm.aptoide.aptoideviews.skeleton.mask;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/skeleton/mask/Size;", "", "width", "Lcm/aptoide/aptoideviews/skeleton/mask/SizeDimension;", "height", "(Lcm/aptoide/aptoideviews/skeleton/mask/SizeDimension;Lcm/aptoide/aptoideviews/skeleton/mask/SizeDimension;)V", "getHeight", "()Lcm/aptoide/aptoideviews/skeleton/mask/SizeDimension;", "getWidth", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.skeleton.mask.Size */
/* compiled from: Size.kt */
public final class Size {
    private final SizeDimension height;
    private final SizeDimension width;

    public Size(SizeDimension sizeDimension, SizeDimension sizeDimension2) {
        C10202j.m34178b(sizeDimension, "width");
        C10202j.m34178b(sizeDimension2, "height");
        this.width = sizeDimension;
        this.height = sizeDimension2;
    }

    public final SizeDimension getHeight() {
        return this.height;
    }

    public final SizeDimension getWidth() {
        return this.width;
    }
}
