package p015cm.aptoide.aptoideviews.skeleton.mask;

import kotlin.C4789l;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0003\u0006\u0007\b¨\u0006\t"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/skeleton/mask/SizeDimension;", "", "()V", "OriginalValue", "PercentValue", "SpecificValue", "Lcm/aptoide/aptoideviews/skeleton/mask/SizeDimension$OriginalValue;", "Lcm/aptoide/aptoideviews/skeleton/mask/SizeDimension$PercentValue;", "Lcm/aptoide/aptoideviews/skeleton/mask/SizeDimension$SpecificValue;", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.skeleton.mask.SizeDimension */
/* compiled from: Size.kt */
public abstract class SizeDimension {

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/skeleton/mask/SizeDimension$OriginalValue;", "Lcm/aptoide/aptoideviews/skeleton/mask/SizeDimension;", "()V", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.aptoideviews.skeleton.mask.SizeDimension$OriginalValue */
    /* compiled from: Size.kt */
    public static final class OriginalValue extends SizeDimension {
        public static final OriginalValue INSTANCE = new OriginalValue();

        private OriginalValue() {
            super((DefaultConstructorMarker) null);
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/skeleton/mask/SizeDimension$PercentValue;", "Lcm/aptoide/aptoideviews/skeleton/mask/SizeDimension;", "fraction", "", "(F)V", "getFraction", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.aptoideviews.skeleton.mask.SizeDimension$PercentValue */
    /* compiled from: Size.kt */
    public static final class PercentValue extends SizeDimension {
        private final float fraction;

        public PercentValue(float f) {
            super((DefaultConstructorMarker) null);
            this.fraction = f;
        }

        public static /* synthetic */ PercentValue copy$default(PercentValue percentValue, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = percentValue.fraction;
            }
            return percentValue.copy(f);
        }

        public final float component1() {
            return this.fraction;
        }

        public final PercentValue copy(float f) {
            return new PercentValue(f);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof PercentValue) && Float.compare(this.fraction, ((PercentValue) obj).fraction) == 0;
            }
            return true;
        }

        public final float getFraction() {
            return this.fraction;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.fraction);
        }

        public String toString() {
            return "PercentValue(fraction=" + this.fraction + ")";
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/skeleton/mask/SizeDimension$SpecificValue;", "Lcm/aptoide/aptoideviews/skeleton/mask/SizeDimension;", "value", "", "(F)V", "getValue", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.aptoideviews.skeleton.mask.SizeDimension$SpecificValue */
    /* compiled from: Size.kt */
    public static final class SpecificValue extends SizeDimension {
        private final float value;

        public SpecificValue(float f) {
            super((DefaultConstructorMarker) null);
            this.value = f;
        }

        public static /* synthetic */ SpecificValue copy$default(SpecificValue specificValue, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                f = specificValue.value;
            }
            return specificValue.copy(f);
        }

        public final float component1() {
            return this.value;
        }

        public final SpecificValue copy(float f) {
            return new SpecificValue(f);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof SpecificValue) && Float.compare(this.value, ((SpecificValue) obj).value) == 0;
            }
            return true;
        }

        public final float getValue() {
            return this.value;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.value);
        }

        public String toString() {
            return "SpecificValue(value=" + this.value + ")";
        }
    }

    private SizeDimension() {
    }

    public /* synthetic */ SizeDimension(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
