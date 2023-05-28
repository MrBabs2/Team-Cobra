package p015cm.aptoide.aptoideviews.recyclerview;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p215c0.p216c.C9117p;
import p015cm.aptoide.aptoideviews.recyclerview.GridRecyclerView;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo16641d2 = {"<anonymous>", "", "itemSize", "Lcm/aptoide/aptoideviews/recyclerview/GridRecyclerView$Size;", "adaptStrategy", "Lcm/aptoide/aptoideviews/recyclerview/GridRecyclerView$AdaptStrategy;", "invoke"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.recyclerview.GridRecyclerView$onMeasure$1 */
/* compiled from: GridRecyclerView.kt */
final class GridRecyclerView$onMeasure$1 extends C10203k implements C9117p<GridRecyclerView.Size, GridRecyclerView.AdaptStrategy, C10483v> {
    final /* synthetic */ GridRecyclerView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GridRecyclerView$onMeasure$1(GridRecyclerView gridRecyclerView) {
        super(2);
        this.this$0 = gridRecyclerView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((GridRecyclerView.Size) obj, (GridRecyclerView.AdaptStrategy) obj2);
        return C10483v.f28357a;
    }

    public final void invoke(GridRecyclerView.Size size, GridRecyclerView.AdaptStrategy adaptStrategy) {
        C10202j.m34178b(size, "itemSize");
        C10202j.m34178b(adaptStrategy, "adaptStrategy");
        RecyclerView.C0644o layoutManager = this.this$0.getLayoutManager();
        if (layoutManager != null) {
            int spacingPx = this.this$0.spacingItemDecorator.getSpacingPx();
            double access$getTotalWidth = (double) ((this.this$0.getTotalWidth() - this.this$0.getTotalHorizontalPadding()) + spacingPx);
            double width = (double) size.getWidth();
            double d = (double) spacingPx;
            Double.isNaN(width);
            Double.isNaN(d);
            Double.isNaN(access$getTotalWidth);
            ((GridLayoutManager) layoutManager).setSpanCount((int) (access$getTotalWidth / (width + d)));
            if (adaptStrategy == GridRecyclerView.AdaptStrategy.ADJUST_PADDING) {
                int access$getAdaptiveMeasuredPadding = this.this$0.getAdaptiveMeasuredPadding(size.getWidth()) / 2;
                GridRecyclerView gridRecyclerView = this.this$0;
                gridRecyclerView.setPadding(access$getAdaptiveMeasuredPadding, gridRecyclerView.getPaddingTop(), access$getAdaptiveMeasuredPadding, this.this$0.getPaddingBottom());
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
    }
}
