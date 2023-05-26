package p015cm.aptoide.aptoideviews.filters;

import kotlin.C4789l;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\bJ\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\t"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/filters/FilterEventListener;", "", "onFilterEvent", "", "eventType", "Lcm/aptoide/aptoideviews/filters/FilterEventListener$EventType;", "filter", "Lcm/aptoide/aptoideviews/filters/Filter;", "EventType", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.filters.FilterEventListener */
/* compiled from: FilterEventListener.kt */
public interface FilterEventListener {

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/filters/FilterEventListener$EventType;", "", "(Ljava/lang/String;I)V", "FILTER_CLICK", "CLEAR_EVENT_CLICK", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.aptoideviews.filters.FilterEventListener$EventType */
    /* compiled from: FilterEventListener.kt */
    public enum EventType {
        FILTER_CLICK,
        CLEAR_EVENT_CLICK
    }

    void onFilterEvent(EventType eventType, Filter filter);
}
