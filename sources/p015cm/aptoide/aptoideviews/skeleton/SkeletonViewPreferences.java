package p015cm.aptoide.aptoideviews.skeleton;

import android.graphics.Color;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.aptoideviews.skeleton.mask.Border;
import p015cm.aptoide.aptoideviews.skeleton.mask.Shape;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/skeleton/SkeletonViewPreferences;", "", "shape", "Lcm/aptoide/aptoideviews/skeleton/mask/Shape;", "border", "Lcm/aptoide/aptoideviews/skeleton/mask/Border;", "(Lcm/aptoide/aptoideviews/skeleton/mask/Shape;Lcm/aptoide/aptoideviews/skeleton/mask/Border;)V", "getBorder", "()Lcm/aptoide/aptoideviews/skeleton/mask/Border;", "setBorder", "(Lcm/aptoide/aptoideviews/skeleton/mask/Border;)V", "getShape", "()Lcm/aptoide/aptoideviews/skeleton/mask/Shape;", "setShape", "(Lcm/aptoide/aptoideviews/skeleton/mask/Shape;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.skeleton.SkeletonViewPreferences */
/* compiled from: SkeletonViewPreferences.kt */
public final class SkeletonViewPreferences {
    private Border border;
    private Shape shape;

    public SkeletonViewPreferences() {
        this((Shape) null, (Border) null, 3, (DefaultConstructorMarker) null);
    }

    public SkeletonViewPreferences(Shape shape2, Border border2) {
        C10202j.m34178b(shape2, "shape");
        C10202j.m34178b(border2, "border");
        this.shape = shape2;
        this.border = border2;
    }

    public static /* synthetic */ SkeletonViewPreferences copy$default(SkeletonViewPreferences skeletonViewPreferences, Shape shape2, Border border2, int i, Object obj) {
        if ((i & 1) != 0) {
            shape2 = skeletonViewPreferences.shape;
        }
        if ((i & 2) != 0) {
            border2 = skeletonViewPreferences.border;
        }
        return skeletonViewPreferences.copy(shape2, border2);
    }

    public final Shape component1() {
        return this.shape;
    }

    public final Border component2() {
        return this.border;
    }

    public final SkeletonViewPreferences copy(Shape shape2, Border border2) {
        C10202j.m34178b(shape2, "shape");
        C10202j.m34178b(border2, "border");
        return new SkeletonViewPreferences(shape2, border2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkeletonViewPreferences)) {
            return false;
        }
        SkeletonViewPreferences skeletonViewPreferences = (SkeletonViewPreferences) obj;
        return C10202j.m34176a((Object) this.shape, (Object) skeletonViewPreferences.shape) && C10202j.m34176a((Object) this.border, (Object) skeletonViewPreferences.border);
    }

    public final Border getBorder() {
        return this.border;
    }

    public final Shape getShape() {
        return this.shape;
    }

    public int hashCode() {
        Shape shape2 = this.shape;
        int i = 0;
        int hashCode = (shape2 != null ? shape2.hashCode() : 0) * 31;
        Border border2 = this.border;
        if (border2 != null) {
            i = border2.hashCode();
        }
        return hashCode + i;
    }

    public final void setBorder(Border border2) {
        C10202j.m34178b(border2, "<set-?>");
        this.border = border2;
    }

    public final void setShape(Shape shape2) {
        C10202j.m34178b(shape2, "<set-?>");
        this.shape = shape2;
    }

    public String toString() {
        return "SkeletonViewPreferences(shape=" + this.shape + ", border=" + this.border + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SkeletonViewPreferences(Shape shape2, Border border2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Shape.Rect(Color.parseColor("#EDEEF2"), 0) : shape2, (i & 2) != 0 ? new Border(0, -1) : border2);
    }
}
