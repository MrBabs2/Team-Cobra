package p015cm.aptoide.aptoideviews.filters;

import com.airbnb.epoxy.TypedEpoxyController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0016\u0010\u0018\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\f¨\u0006\u001a"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/filters/FiltersController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "", "Lcm/aptoide/aptoideviews/filters/Filter;", "eventListener", "Lcm/aptoide/aptoideviews/filters/FilterEventListener;", "(Lcm/aptoide/aptoideviews/filters/FilterEventListener;)V", "backgroundRes", "", "getBackgroundRes", "()Ljava/lang/Integer;", "setBackgroundRes", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getEventListener", "()Lcm/aptoide/aptoideviews/filters/FilterEventListener;", "selectionList", "textColor", "getTextColor", "setTextColor", "buildModels", "", "list", "sortList", "updateSelectionList", "newList", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.filters.FiltersController */
/* compiled from: FiltersController.kt */
public final class FiltersController extends TypedEpoxyController<List<? extends Filter>> {
    private Integer backgroundRes;
    private final FilterEventListener eventListener;
    private List<Filter> selectionList;
    private Integer textColor;

    public FiltersController(FilterEventListener filterEventListener) {
        C10202j.m34178b(filterEventListener, "eventListener");
        this.eventListener = filterEventListener;
    }

    private final List<Filter> sortList(List<Filter> list) {
        updateSelectionList(list);
        Collection collection = this.selectionList;
        if (collection == null) {
            collection = new ArrayList();
        }
        ArrayList arrayList = new ArrayList(collection);
        arrayList.addAll(list);
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            if (hashSet.add(Integer.valueOf(((Filter) next).getId$aptoide_views_prodRelease()))) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    private final void updateSelectionList(List<Filter> list) {
        boolean z;
        T t;
        boolean z2;
        Collection collection = this.selectionList;
        if (collection == null) {
            collection = new ArrayList();
        }
        ArrayList arrayList = new ArrayList(collection);
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            Filter filter = (Filter) next;
            Iterator<T> it = list.iterator();
            while (true) {
                z = false;
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (filter.getId$aptoide_views_prodRelease() == ((Filter) t).getId$aptoide_views_prodRelease()) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            Filter filter2 = (Filter) t;
            if (filter2 != null && filter2.getSelected()) {
                z = true;
            }
            if (z) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (T next2 : list) {
            if (((Filter) next2).getSelected()) {
                arrayList3.add(next2);
            }
        }
        arrayList2.addAll(arrayList3);
        HashSet hashSet = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        for (Object next3 : arrayList2) {
            if (hashSet.add(Integer.valueOf(((Filter) next3).getId$aptoide_views_prodRelease()))) {
                arrayList4.add(next3);
            }
        }
        this.selectionList = arrayList4;
    }

    public final Integer getBackgroundRes() {
        return this.backgroundRes;
    }

    public final FilterEventListener getEventListener() {
        return this.eventListener;
    }

    public final Integer getTextColor() {
        return this.textColor;
    }

    public final void setBackgroundRes(Integer num) {
        this.backgroundRes = num;
    }

    public final void setTextColor(Integer num) {
        this.textColor = num;
    }

    /* access modifiers changed from: protected */
    public void buildModels(List<Filter> list) {
        T t;
        C10202j.m34178b(list, "list");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((Filter) t).getSelected()) {
                break;
            }
        }
        if (t != null) {
            new ClearFiltersModel_().m4223id((CharSequence) "clear_filter").textColorStateList(this.textColor).eventListener(this.eventListener).addTo(this);
        }
        for (Filter next : sortList(list)) {
            new FilterModel_().m4250id(new Number[]{Integer.valueOf(next.getId$aptoide_views_prodRelease())}).filter(next).textColorStateList(this.textColor).backgroundRes(this.backgroundRes).eventListener(this.eventListener).addTo(this);
        }
    }
}
