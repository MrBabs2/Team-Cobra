package p015cm.aptoide.aptoideviews.filters;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.aptoideviews.C1033R;
import p015cm.aptoide.aptoideviews.filters.FilterEventListener;
import p123rx.C5368e;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000I\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r*\u0001\u000e\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0016H\u0007J\u0016\u0010\u0017\u001a\u00020\u00142\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\u0014\u0010\u001b\u001a\u00020\u00142\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u0010\u0010\u001c\u001a\u00020\u00142\b\b\u0001\u0010\u001d\u001a\u00020\u0007J\u0017\u0010\u001e\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0002\b J\u0010\u0010!\u001a\u00020\u00142\b\b\u0001\u0010\"\u001a\u00020\u0007R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/filters/FiltersView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "controller", "Lcm/aptoide/aptoideviews/filters/FiltersController;", "filterChangedEventsListener", "Lcm/aptoide/aptoideviews/filters/FiltersChangedEventListener;", "filterEventListener", "cm/aptoide/aptoideviews/filters/FiltersView$filterEventListener$1", "Lcm/aptoide/aptoideviews/filters/FiltersView$filterEventListener$1;", "filters", "", "Lcm/aptoide/aptoideviews/filters/Filter;", "clearFilters", "", "filtersChangedEvents", "Lrx/Observable;", "generateIds", "getFilters", "initViews", "refreshData", "setFilters", "setFiltersBackgroundRes", "background", "setFiltersChangedEventsListener", "listener", "setFiltersChangedEventsListener$aptoide_views_prodRelease", "setFiltersTextColorStateList", "color", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.filters.FiltersView */
/* compiled from: FiltersView.kt */
public final class FiltersView extends FrameLayout {
    private HashMap _$_findViewCache;
    private FiltersController controller;
    /* access modifiers changed from: private */
    public FiltersChangedEventListener filterChangedEventsListener;
    private final FiltersView$filterEventListener$1 filterEventListener;
    /* access modifiers changed from: private */
    public List<Filter> filters;

    @C4789l(mo16639bv = {1, 0, 3}, mo16642k = 3, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.aptoideviews.filters.FiltersView$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FilterEventListener.EventType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[FilterEventListener.EventType.CLEAR_EVENT_CLICK.ordinal()] = 1;
            $EnumSwitchMapping$0[FilterEventListener.EventType.FILTER_CLICK.ordinal()] = 2;
        }
    }

    public FiltersView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    public FiltersView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FiltersView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* access modifiers changed from: private */
    public final void clearFilters() {
        ArrayList arrayList = new ArrayList(this.filters);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, new Filter(this.filters.get(i).getName(), false, this.filters.get(i).getIdentifier()));
        }
        setFilters(C10539w.m35815n(arrayList));
        FiltersChangedEventListener filtersChangedEventListener = this.filterChangedEventsListener;
        if (filtersChangedEventListener != null) {
            filtersChangedEventListener.onFiltersChanged(C10539w.m35815n(arrayList));
        }
    }

    private final void generateIds(List<Filter> list) {
        int i = 0;
        for (Filter id$aptoide_views_prodRelease : list) {
            id$aptoide_views_prodRelease.setId$aptoide_views_prodRelease(i);
            i++;
        }
    }

    private final void initViews() {
        ((FiltersRecyclerView) _$_findCachedViewById(C1033R.C1035id.filters_recycler_view)).setController(this.controller);
        this.controller.getAdapter().registerAdapterDataObserver(new FiltersView$initViews$1(this));
    }

    private final void refreshData() {
        this.controller.setData(this.filters);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final C5368e<List<Filter>> filtersChangedEvents() {
        C5368e<List<Filter>> a = C5368e.m10241a(new FilterChangedEventOnSubscribe(this));
        C10202j.m34174a((Object) a, "Observable.create(Filter…edEventOnSubscribe(this))");
        return a;
    }

    public final List<Filter> getFilters() {
        return this.filters;
    }

    public final void setFilters(List<Filter> list) {
        C10202j.m34178b(list, "filters");
        generateIds(list);
        this.filters = list;
        refreshData();
    }

    public final void setFiltersBackgroundRes(int i) {
        this.controller.setBackgroundRes(Integer.valueOf(i));
    }

    public final void setFiltersChangedEventsListener$aptoide_views_prodRelease(FiltersChangedEventListener filtersChangedEventListener) {
        this.filterChangedEventsListener = filtersChangedEventListener;
    }

    public final void setFiltersTextColorStateList(int i) {
        this.controller.setTextColor(Integer.valueOf(i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FiltersView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C10202j.m34178b(context, "context");
        this.filters = new ArrayList();
        this.filterEventListener = new FiltersView$filterEventListener$1(this);
        this.controller = new FiltersController(this.filterEventListener);
        FrameLayout.inflate(context, C1033R.layout.filters_view_layout, this);
        initViews();
    }
}
