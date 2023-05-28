package p015cm.aptoide.aptoideviews.filters;

import android.view.View;
import kotlin.C4789l;
import p015cm.aptoide.aptoideviews.filters.FilterEventListener;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo16641d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.filters.ClearFiltersModel$bind$1 */
/* compiled from: ClearFiltersModel.kt */
final class ClearFiltersModel$bind$1 implements View.OnClickListener {
    final /* synthetic */ ClearFiltersModel this$0;

    ClearFiltersModel$bind$1(ClearFiltersModel clearFiltersModel) {
        this.this$0 = clearFiltersModel;
    }

    public final void onClick(View view) {
        FilterEventListener eventListener = this.this$0.getEventListener();
        if (eventListener != null) {
            eventListener.onFilterEvent(FilterEventListener.EventType.CLEAR_EVENT_CLICK, (Filter) null);
        }
    }
}
