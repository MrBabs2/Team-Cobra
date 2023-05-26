package p015cm.aptoide.aptoideviews.recyclerview;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.GridLayoutAnimationController;
import android.view.animation.LayoutAnimationController;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.aptoideviews.ExtensionsKt;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u000201B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ*\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0014J\u0012\u0010\u0019\u001a\u00020\t2\b\b\u0001\u0010\u001a\u001a\u00020\tH\u0003J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\tH\u0003J\b\u0010\u001d\u001a\u00020\tH\u0003J\b\u0010\u001e\u001a\u00020\tH\u0003J\b\u0010\u001f\u001a\u00020\tH\u0003J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\tJ\u0010\u0010#\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\tH\u0014J\"\u0010'\u001a\u00020\u00122\b\b\u0001\u0010(\u001a\u00020\t2\b\b\u0001\u0010)\u001a\u00020\t2\u0006\u0010*\u001a\u00020\fJ\u0010\u0010+\u001a\u00020\u00122\b\b\u0001\u0010,\u001a\u00020\tJ\u0012\u0010-\u001a\u00020\u00122\b\u0010.\u001a\u0004\u0018\u00010/H\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000¨\u00062"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/recyclerview/GridRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "adaptStrategy", "Lcm/aptoide/aptoideviews/recyclerview/GridRecyclerView$AdaptStrategy;", "intendedItemSize", "Lcm/aptoide/aptoideviews/recyclerview/GridRecyclerView$Size;", "spacingItemDecorator", "Lcm/aptoide/aptoideviews/recyclerview/GridItemSpacingDecorator;", "attachLayoutAnimationParameters", "", "child", "Landroid/view/View;", "params", "Landroid/view/ViewGroup$LayoutParams;", "index", "count", "dpToPx", "dp", "getAdaptiveMeasuredPadding", "itemWidth", "getItemMeasuredWidth", "getTotalHorizontalPadding", "getTotalWidth", "isEndReached", "", "thresholdRow", "onChildAttachedToWindow", "onMeasure", "widthSpec", "heightSpec", "setAdaptiveLayout", "intendedItemWidth", "intendedItemHeight", "strategy", "setIntendedItemSpacing", "spacing", "setLayoutManager", "layout", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "AdaptStrategy", "Size", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.recyclerview.GridRecyclerView */
/* compiled from: GridRecyclerView.kt */
public final class GridRecyclerView extends RecyclerView {
    private HashMap _$_findViewCache;
    private AdaptStrategy adaptStrategy;
    private Size intendedItemSize;
    /* access modifiers changed from: private */
    public GridItemSpacingDecorator spacingItemDecorator;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/recyclerview/GridRecyclerView$AdaptStrategy;", "", "(Ljava/lang/String;I)V", "SCALE_WIDTH_ONLY", "SCALE_KEEP_ASPECT_RATIO", "ADJUST_PADDING", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.aptoideviews.recyclerview.GridRecyclerView$AdaptStrategy */
    /* compiled from: GridRecyclerView.kt */
    public enum AdaptStrategy {
        SCALE_WIDTH_ONLY,
        SCALE_KEEP_ASPECT_RATIO,
        ADJUST_PADDING
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u000f\u001a\u00020\u0010J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/recyclerview/GridRecyclerView$Size;", "", "width", "", "height", "(II)V", "getHeight", "()I", "getWidth", "component1", "component2", "copy", "equals", "", "other", "getRatio", "", "hashCode", "toString", "", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.aptoideviews.recyclerview.GridRecyclerView$Size */
    /* compiled from: GridRecyclerView.kt */
    private static final class Size {
        private final int height;
        private final int width;

        public Size(int i, int i2) {
            this.width = i;
            this.height = i2;
        }

        public static /* synthetic */ Size copy$default(Size size, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = size.width;
            }
            if ((i3 & 2) != 0) {
                i2 = size.height;
            }
            return size.copy(i, i2);
        }

        public final int component1() {
            return this.width;
        }

        public final int component2() {
            return this.height;
        }

        public final Size copy(int i, int i2) {
            return new Size(i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Size)) {
                return false;
            }
            Size size = (Size) obj;
            return this.width == size.width && this.height == size.height;
        }

        public final int getHeight() {
            return this.height;
        }

        public final double getRatio() {
            double d = (double) this.width;
            double d2 = (double) this.height;
            Double.isNaN(d);
            Double.isNaN(d2);
            return d / d2;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return (this.width * 31) + this.height;
        }

        public String toString() {
            return "Size(width=" + this.width + ", height=" + this.height + ")";
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GridRecyclerView(Context context) {
        this(context, (AttributeSet) null);
        C10202j.m34178b(context, "context");
    }

    private final int dpToPx(int i) {
        Resources resources = getResources();
        C10202j.m34174a((Object) resources, "resources");
        return (int) TypedValue.applyDimension(1, (float) i, resources.getDisplayMetrics());
    }

    /* access modifiers changed from: private */
    public final int getAdaptiveMeasuredPadding(int i) {
        RecyclerView.C0644o layoutManager = getLayoutManager();
        if (layoutManager != null) {
            int spanCount = ((GridLayoutManager) layoutManager).getSpanCount();
            int spacingPx = this.spacingItemDecorator.getSpacingPx();
            double totalWidth = (double) getTotalWidth();
            double d = (double) (i + spacingPx);
            double d2 = (double) spanCount;
            Double.isNaN(d);
            Double.isNaN(d2);
            Double.isNaN(totalWidth);
            double d3 = (double) spacingPx;
            Double.isNaN(d3);
            return (int) ((totalWidth - (d * d2)) + d3);
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
    }

    /* access modifiers changed from: private */
    public final int getItemMeasuredWidth() {
        RecyclerView.C0644o layoutManager = getLayoutManager();
        if (layoutManager != null) {
            int spanCount = ((GridLayoutManager) layoutManager).getSpanCount();
            int spacingPx = this.spacingItemDecorator.getSpacingPx();
            double totalWidth = (double) ((getTotalWidth() - getTotalHorizontalPadding()) + spacingPx);
            double d = (double) spanCount;
            Double.isNaN(totalWidth);
            Double.isNaN(d);
            double d2 = (double) spacingPx;
            Double.isNaN(d2);
            return (int) ((totalWidth / d) - d2);
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
    }

    /* access modifiers changed from: private */
    public final int getTotalHorizontalPadding() {
        return getPaddingLeft() + getPaddingRight();
    }

    /* access modifiers changed from: private */
    public final int getTotalWidth() {
        if (getWidth() > 0) {
            return getWidth();
        }
        Context context = getContext();
        C10202j.m34174a((Object) context, "context");
        Resources resources = context.getResources();
        C10202j.m34174a((Object) resources, "context.resources");
        return resources.getDisplayMetrics().widthPixels;
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
    public void attachLayoutAnimationParameters(View view, ViewGroup.LayoutParams layoutParams, int i, int i2) {
        C10202j.m34178b(layoutParams, "params");
        RecyclerView.C0644o layoutManager = getLayoutManager();
        if (getAdapter() == null || !(layoutManager instanceof GridLayoutManager)) {
            super.attachLayoutAnimationParameters(view, layoutParams, i, i2);
            return;
        }
        LayoutAnimationController.AnimationParameters animationParameters = layoutParams.layoutAnimationParameters;
        if (!(animationParameters instanceof GridLayoutAnimationController.AnimationParameters)) {
            animationParameters = null;
        }
        GridLayoutAnimationController.AnimationParameters animationParameters2 = (GridLayoutAnimationController.AnimationParameters) animationParameters;
        if (animationParameters2 == null) {
            animationParameters2 = new GridLayoutAnimationController.AnimationParameters();
            layoutParams.layoutAnimationParameters = animationParameters2;
        }
        int spanCount = ((GridLayoutManager) layoutManager).getSpanCount();
        animationParameters2.count = i2;
        animationParameters2.index = i;
        animationParameters2.columnsCount = spanCount;
        int i3 = i2 / spanCount;
        animationParameters2.rowsCount = i3;
        int i4 = (i2 - 1) - i;
        animationParameters2.column = (spanCount - 1) - (i4 % spanCount);
        animationParameters2.row = (i3 - 1) - (i4 / spanCount);
    }

    public final boolean isEndReached(int i) {
        RecyclerView.C0644o layoutManager = getLayoutManager();
        if (layoutManager != null) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            return gridLayoutManager.getItemCount() - (gridLayoutManager.getSpanCount() * i) <= gridLayoutManager.findLastCompletelyVisibleItemPosition();
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
    }

    public void onChildAttachedToWindow(View view) {
        C10202j.m34178b(view, "child");
        if (((C10483v) ExtensionsKt.safeLet(this.intendedItemSize, this.adaptStrategy, new GridRecyclerView$onChildAttachedToWindow$1(this, view))) == null) {
            super.onChildAttachedToWindow(view);
            C10483v vVar = C10483v.f28357a;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        ExtensionsKt.safeLet(this.intendedItemSize, this.adaptStrategy, new GridRecyclerView$onMeasure$1(this));
    }

    public final void setAdaptiveLayout(int i, int i2, AdaptStrategy adaptStrategy2) {
        C10202j.m34178b(adaptStrategy2, "strategy");
        this.intendedItemSize = new Size(dpToPx(i), dpToPx(i2));
        this.adaptStrategy = adaptStrategy2;
    }

    public final void setIntendedItemSpacing(int i) {
        removeItemDecoration(this.spacingItemDecorator);
        this.spacingItemDecorator.setSpacingPx(dpToPx(i));
        if (i > 0) {
            addItemDecoration(this.spacingItemDecorator);
        }
    }

    public void setLayoutManager(RecyclerView.C0644o oVar) {
        if (oVar instanceof GridLayoutManager) {
            super.setLayoutManager(oVar);
            return;
        }
        throw new ClassCastException("This GridRecyclerView should only be used with a CustomGridLayoutManager");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GridRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C10202j.m34178b(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GridRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C10202j.m34178b(context, "context");
        this.spacingItemDecorator = new GridItemSpacingDecorator(0, 1, (DefaultConstructorMarker) null);
    }
}
