package p015cm.aptoide.aptoideviews.recyclerview;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0012"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/recyclerview/GridItemSpacingDecorator;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "spacingPx", "", "(I)V", "getSpacingPx", "()I", "setSpacingPx", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.recyclerview.GridItemSpacingDecorator */
/* compiled from: GridItemSpacingDecorator.kt */
public final class GridItemSpacingDecorator extends RecyclerView.C0643n {
    private int spacingPx;

    public GridItemSpacingDecorator() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public GridItemSpacingDecorator(int i) {
        this.spacingPx = i;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0662z zVar) {
        C10202j.m34178b(rect, "outRect");
        C10202j.m34178b(view, "view");
        C10202j.m34178b(recyclerView, "parent");
        C10202j.m34178b(zVar, "state");
        rect.setEmpty();
        RecyclerView.C0644o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            rect.set(childAdapterPosition % gridLayoutManager.getSpanCount() != 0 ? this.spacingPx : 0, childAdapterPosition / gridLayoutManager.getSpanCount() != 0 ? this.spacingPx : 0, 0, 0);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
    }

    public final int getSpacingPx() {
        return this.spacingPx;
    }

    public final void setSpacingPx(int i) {
        this.spacingPx = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GridItemSpacingDecorator(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
