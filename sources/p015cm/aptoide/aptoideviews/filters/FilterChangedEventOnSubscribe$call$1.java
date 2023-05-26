package p015cm.aptoide.aptoideviews.filters;

import kotlin.C4789l;
import p123rx.p124l.C12476a;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0014¨\u0006\u0004"}, mo16641d2 = {"cm/aptoide/aptoideviews/filters/FilterChangedEventOnSubscribe$call$1", "Lrx/android/MainThreadSubscription;", "onUnsubscribe", "", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.filters.FilterChangedEventOnSubscribe$call$1 */
/* compiled from: FilterChangedEventOnSubscribe.kt */
public final class FilterChangedEventOnSubscribe$call$1 extends C12476a {
    final /* synthetic */ FilterChangedEventOnSubscribe this$0;

    FilterChangedEventOnSubscribe$call$1(FilterChangedEventOnSubscribe filterChangedEventOnSubscribe) {
        this.this$0 = filterChangedEventOnSubscribe;
    }

    /* access modifiers changed from: protected */
    public void onUnsubscribe() {
        this.this$0.getView().setFiltersChangedEventsListener$aptoide_views_prodRelease((FiltersChangedEventListener) null);
    }
}
