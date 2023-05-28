package p015cm.aptoide.aptoideviews.filters;

import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p123rx.C12475j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0007"}, mo16641d2 = {"cm/aptoide/aptoideviews/filters/FilterChangedEventOnSubscribe$call$eventListener$1", "Lcm/aptoide/aptoideviews/filters/FiltersChangedEventListener;", "onFiltersChanged", "", "filters", "", "Lcm/aptoide/aptoideviews/filters/Filter;", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.filters.FilterChangedEventOnSubscribe$call$eventListener$1 */
/* compiled from: FilterChangedEventOnSubscribe.kt */
public final class FilterChangedEventOnSubscribe$call$eventListener$1 implements FiltersChangedEventListener {
    final /* synthetic */ C12475j $subscriber;

    FilterChangedEventOnSubscribe$call$eventListener$1(C12475j jVar) {
        this.$subscriber = jVar;
    }

    public void onFiltersChanged(List<Filter> list) {
        C10202j.m34178b(list, "filters");
        if (!this.$subscriber.isUnsubscribed()) {
            this.$subscriber.onNext(list);
        }
    }
}
