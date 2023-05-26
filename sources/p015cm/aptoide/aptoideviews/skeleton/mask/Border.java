package p015cm.aptoide.aptoideviews.skeleton.mask;

import kotlin.C4789l;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/skeleton/mask/Border;", "", "size", "", "color", "(II)V", "getColor", "()I", "getSize", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.skeleton.mask.Border */
/* compiled from: Border.kt */
public final class Border {
    private final int color;
    private final int size;

    public Border(int i, int i2) {
        this.size = i;
        this.color = i2;
    }

    public static /* synthetic */ Border copy$default(Border border, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = border.size;
        }
        if ((i3 & 2) != 0) {
            i2 = border.color;
        }
        return border.copy(i, i2);
    }

    public final int component1() {
        return this.size;
    }

    public final int component2() {
        return this.color;
    }

    public final Border copy(int i, int i2) {
        return new Border(i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Border)) {
            return false;
        }
        Border border = (Border) obj;
        return this.size == border.size && this.color == border.color;
    }

    public final int getColor() {
        return this.color;
    }

    public final int getSize() {
        return this.size;
    }

    public int hashCode() {
        return (this.size * 31) + this.color;
    }

    public String toString() {
        return "Border(size=" + this.size + ", color=" + this.color + ")";
    }
}
