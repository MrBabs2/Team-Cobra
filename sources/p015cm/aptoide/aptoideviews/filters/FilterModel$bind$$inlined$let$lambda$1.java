package p015cm.aptoide.aptoideviews.filters;

import android.view.View;
import kotlin.C4789l;
import p015cm.aptoide.aptoideviews.filters.FilterEventListener;
import p015cm.aptoide.aptoideviews.filters.FilterModel;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo16641d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "cm/aptoide/aptoideviews/filters/FilterModel$bind$1$1"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.filters.FilterModel$bind$$inlined$let$lambda$1 */
/* compiled from: FilterModel.kt */
final class FilterModel$bind$$inlined$let$lambda$1 implements View.OnClickListener {

    /* renamed from: $f */
    final /* synthetic */ Filter f3448$f;
    final /* synthetic */ FilterModel.CardHolder $holder$inlined;
    final /* synthetic */ FilterModel this$0;

    FilterModel$bind$$inlined$let$lambda$1(Filter filter, FilterModel filterModel, FilterModel.CardHolder cardHolder) {
        this.f3448$f = filter;
        this.this$0 = filterModel;
        this.$holder$inlined = cardHolder;
    }

    public final void onClick(View view) {
        FilterEventListener eventListener = this.this$0.getEventListener();
        if (eventListener != null) {
            eventListener.onFilterEvent(FilterEventListener.EventType.FILTER_CLICK, this.f3448$f);
        }
    }
}
