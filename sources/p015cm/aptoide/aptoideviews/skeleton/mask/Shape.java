package p015cm.aptoide.aptoideviews.skeleton.mask;

import kotlin.C4789l;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0011\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0001\u0002\t\n¨\u0006\u000b"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/skeleton/mask/Shape;", "", "color", "", "(I)V", "getColor", "()I", "Circle", "Rect", "Lcm/aptoide/aptoideviews/skeleton/mask/Shape$Rect;", "Lcm/aptoide/aptoideviews/skeleton/mask/Shape$Circle;", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.skeleton.mask.Shape */
/* compiled from: Shape.kt */
public abstract class Shape {
    private final int color;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/skeleton/mask/Shape$Circle;", "Lcm/aptoide/aptoideviews/skeleton/mask/Shape;", "color", "", "(I)V", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.aptoideviews.skeleton.mask.Shape$Circle */
    /* compiled from: Shape.kt */
    public static final class Circle extends Shape {
        public Circle(int i) {
            super(i, (DefaultConstructorMarker) null);
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/skeleton/mask/Shape$Rect;", "Lcm/aptoide/aptoideviews/skeleton/mask/Shape;", "color", "", "cornerRadius", "(II)V", "getCornerRadius", "()I", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.aptoideviews.skeleton.mask.Shape$Rect */
    /* compiled from: Shape.kt */
    public static final class Rect extends Shape {
        private final int cornerRadius;

        public Rect(int i, int i2) {
            super(i, (DefaultConstructorMarker) null);
            this.cornerRadius = i2;
        }

        public final int getCornerRadius() {
            return this.cornerRadius;
        }
    }

    private Shape(int i) {
        this.color = i;
    }

    public final int getColor() {
        return this.color;
    }

    public /* synthetic */ Shape(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }
}
