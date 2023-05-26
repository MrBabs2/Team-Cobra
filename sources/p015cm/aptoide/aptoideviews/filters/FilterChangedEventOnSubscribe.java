package p015cm.aptoide.aptoideviews.filters;

import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.p124l.C12476a;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\u00020\n2\u0014\u0010\u000b\u001a\u0010\u0012\f\b\u0000\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/filters/FilterChangedEventOnSubscribe;", "Lrx/Observable$OnSubscribe;", "", "Lcm/aptoide/aptoideviews/filters/Filter;", "view", "Lcm/aptoide/aptoideviews/filters/FiltersView;", "(Lcm/aptoide/aptoideviews/filters/FiltersView;)V", "getView", "()Lcm/aptoide/aptoideviews/filters/FiltersView;", "call", "", "subscriber", "Lrx/Subscriber;", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.filters.FilterChangedEventOnSubscribe */
/* compiled from: FilterChangedEventOnSubscribe.kt */
public final class FilterChangedEventOnSubscribe implements C5368e.C5370a<List<? extends Filter>> {
    private final FiltersView view;

    public FilterChangedEventOnSubscribe(FiltersView filtersView) {
        C10202j.m34178b(filtersView, "view");
        this.view = filtersView;
    }

    public final FiltersView getView() {
        return this.view;
    }

    public void call(C12475j<? super List<Filter>> jVar) {
        C10202j.m34178b(jVar, "subscriber");
        C12476a.verifyMainThread();
        FilterChangedEventOnSubscribe$call$eventListener$1 filterChangedEventOnSubscribe$call$eventListener$1 = new FilterChangedEventOnSubscribe$call$eventListener$1(jVar);
        jVar.add(new FilterChangedEventOnSubscribe$call$1(this));
        this.view.setFiltersChangedEventsListener$aptoide_views_prodRelease(filterChangedEventOnSubscribe$call$eventListener$1);
    }
}
