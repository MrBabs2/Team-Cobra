package p015cm.aptoide.aptoideviews.filters;

import java.util.ArrayList;
import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.aptoideviews.filters.FilterEventListener;
import p015cm.aptoide.aptoideviews.filters.FiltersView;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, mo16641d2 = {"cm/aptoide/aptoideviews/filters/FiltersView$filterEventListener$1", "Lcm/aptoide/aptoideviews/filters/FilterEventListener;", "onFilterEvent", "", "eventType", "Lcm/aptoide/aptoideviews/filters/FilterEventListener$EventType;", "filter", "Lcm/aptoide/aptoideviews/filters/Filter;", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.filters.FiltersView$filterEventListener$1 */
/* compiled from: FiltersView.kt */
public final class FiltersView$filterEventListener$1 implements FilterEventListener {
    final /* synthetic */ FiltersView this$0;

    FiltersView$filterEventListener$1(FiltersView filtersView) {
        this.this$0 = filtersView;
    }

    public void onFilterEvent(FilterEventListener.EventType eventType, Filter filter) {
        int a;
        C10202j.m34178b(eventType, "eventType");
        int i = FiltersView.WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()];
        if (i == 1) {
            this.this$0.clearFilters();
        } else if (i == 2 && (a = C10539w.m35769a(this.this$0.filters, filter)) >= 0) {
            ArrayList arrayList = new ArrayList(this.this$0.filters);
            arrayList.set(a, new Filter(((Filter) this.this$0.filters.get(a)).getName(), true ^ ((Filter) this.this$0.filters.get(a)).getSelected(), ((Filter) this.this$0.filters.get(a)).getIdentifier()));
            List n = C10539w.m35815n(arrayList);
            this.this$0.setFilters(n);
            FiltersChangedEventListener access$getFilterChangedEventsListener$p = this.this$0.filterChangedEventsListener;
            if (access$getFilterChangedEventsListener$p != null) {
                access$getFilterChangedEventsListener$p.onFiltersChanged(n);
            }
        }
    }
}
