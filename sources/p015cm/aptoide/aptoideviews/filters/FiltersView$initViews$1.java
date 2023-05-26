package p015cm.aptoide.aptoideviews.filters;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.aptoideviews.C1033R;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J \u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\n"}, mo16641d2 = {"cm/aptoide/aptoideviews/filters/FiltersView$initViews$1", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "onItemRangeInserted", "", "positionStart", "", "itemCount", "onItemRangeMoved", "fromPosition", "toPosition", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.filters.FiltersView$initViews$1 */
/* compiled from: FiltersView.kt */
public final class FiltersView$initViews$1 extends RecyclerView.C0635i {
    final /* synthetic */ FiltersView this$0;

    FiltersView$initViews$1(FiltersView filtersView) {
        this.this$0 = filtersView;
    }

    public void onItemRangeInserted(int i, int i2) {
        if (i == 0) {
            FiltersRecyclerView filtersRecyclerView = (FiltersRecyclerView) this.this$0._$_findCachedViewById(C1033R.C1035id.filters_recycler_view);
            C10202j.m34174a((Object) filtersRecyclerView, "filters_recycler_view");
            RecyclerView.C0644o layoutManager = filtersRecyclerView.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.scrollToPosition(0);
            }
        }
    }

    public void onItemRangeMoved(int i, int i2, int i3) {
        if (i > i2) {
            FiltersRecyclerView filtersRecyclerView = (FiltersRecyclerView) this.this$0._$_findCachedViewById(C1033R.C1035id.filters_recycler_view);
            C10202j.m34174a((Object) filtersRecyclerView, "filters_recycler_view");
            RecyclerView.C0644o layoutManager = filtersRecyclerView.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.scrollToPosition(i2);
            }
        }
    }
}
