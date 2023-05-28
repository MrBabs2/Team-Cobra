package p015cm.aptoide.aptoideviews.skeleton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import java.util.HashMap;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.aptoideviews.C1033R;
import p015cm.aptoide.aptoideviews.skeleton.mask.Border;
import p015cm.aptoide.aptoideviews.skeleton.mask.Shape;
import p015cm.aptoide.aptoideviews.skeleton.mask.SkeletonMask;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/skeleton/SkeletonView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mask", "Lcm/aptoide/aptoideviews/skeleton/mask/SkeletonMask;", "viewPreferences", "Lcm/aptoide/aptoideviews/skeleton/SkeletonViewPreferences;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "Companion", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.skeleton.SkeletonView */
/* compiled from: SkeletonView.kt */
public final class SkeletonView extends View {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    private SkeletonMask mask;
    private SkeletonViewPreferences viewPreferences;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u001a\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0002¨\u0006\u0012"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/skeleton/SkeletonView$Companion;", "", "()V", "getSkeletonBorder", "Lcm/aptoide/aptoideviews/skeleton/mask/Border;", "t", "Landroid/content/res/TypedArray;", "defaultBorder", "getSkeletonShape", "Lcm/aptoide/aptoideviews/skeleton/mask/Shape;", "defaultShape", "getSkeletonViewPreferences", "Lcm/aptoide/aptoideviews/skeleton/SkeletonViewPreferences;", "c", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defaultPrefs", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.aptoideviews.skeleton.SkeletonView$Companion */
    /* compiled from: SkeletonView.kt */
    public static final class Companion {
        private Companion() {
        }

        private final Border getSkeletonBorder(TypedArray typedArray, Border border) {
            int i;
            ColorStateList colorStateList = typedArray.getColorStateList(C1033R.styleable.SkeletonView_skeleton_border_color);
            if (colorStateList != null) {
                i = colorStateList.getDefaultColor();
            } else {
                i = border.getColor();
            }
            return new Border((int) typedArray.getDimension(C1033R.styleable.SkeletonView_skeleton_border_thickness, 0.0f), i);
        }

        private final Shape getSkeletonShape(TypedArray typedArray, Shape shape) {
            int i;
            ColorStateList colorStateList = typedArray.getColorStateList(C1033R.styleable.SkeletonView_skeleton_color);
            if (colorStateList != null) {
                i = colorStateList.getDefaultColor();
            } else {
                i = shape.getColor();
            }
            int i2 = typedArray.getInt(C1033R.styleable.SkeletonView_skeleton_shape, 0);
            float dimension = typedArray.getDimension(C1033R.styleable.SkeletonView_skeleton_corner_radius, 0.0f);
            if (i2 == 0) {
                return new Shape.Rect(i, (int) dimension);
            }
            if (i2 != 1) {
                return shape;
            }
            return new Shape.Circle(i);
        }

        /* access modifiers changed from: private */
        public final SkeletonViewPreferences getSkeletonViewPreferences(Context context, AttributeSet attributeSet, SkeletonViewPreferences skeletonViewPreferences) {
            if (attributeSet == null) {
                return skeletonViewPreferences;
            }
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1033R.styleable.SkeletonView, 0, 0);
            Companion companion = SkeletonView.Companion;
            C10202j.m34174a((Object) obtainStyledAttributes, "t");
            SkeletonViewPreferences skeletonViewPreferences2 = new SkeletonViewPreferences(companion.getSkeletonShape(obtainStyledAttributes, skeletonViewPreferences.getShape()), SkeletonView.Companion.getSkeletonBorder(obtainStyledAttributes, skeletonViewPreferences.getBorder()));
            obtainStyledAttributes.recycle();
            return skeletonViewPreferences2;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SkeletonView(Context context) {
        this(context, (AttributeSet) null);
        C10202j.m34178b(context, "context");
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        C10202j.m34178b(canvas, "canvas");
        super.onDraw(canvas);
        SkeletonMask skeletonMask = this.mask;
        if (skeletonMask != null) {
            skeletonMask.draw(canvas);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SkeletonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C10202j.m34178b(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SkeletonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C10202j.m34178b(context, "context");
        SkeletonViewPreferences skeletonViewPreferences = new SkeletonViewPreferences((Shape) null, (Border) null, 3, (DefaultConstructorMarker) null);
        this.viewPreferences = skeletonViewPreferences;
        SkeletonViewPreferences access$getSkeletonViewPreferences = Companion.getSkeletonViewPreferences(context, attributeSet, skeletonViewPreferences);
        this.viewPreferences = access$getSkeletonViewPreferences;
        this.mask = new SkeletonMask(this, access$getSkeletonViewPreferences);
    }
}
