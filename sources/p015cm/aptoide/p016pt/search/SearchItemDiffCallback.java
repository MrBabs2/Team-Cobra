package p015cm.aptoide.p016pt.search;

import androidx.recyclerview.widget.C0688f;
import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.search.model.SearchItem;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo16641d2 = {"Lcm/aptoide/pt/search/SearchItemDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "oldSearchResultList", "", "Lcm/aptoide/pt/search/model/SearchItem;", "newSearchResultList", "(Ljava/util/List;Ljava/util/List;)V", "areContentsTheSame", "", "oldItemPosition", "", "newItemPosition", "areItemsTheSame", "getChangePayload", "", "getNewListSize", "getOldListSize", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.search.SearchItemDiffCallback */
/* compiled from: SearchItemDiffCallback.kt */
public final class SearchItemDiffCallback extends C0688f.C0690b {
    private final List<SearchItem> newSearchResultList;
    private final List<SearchItem> oldSearchResultList;

    public SearchItemDiffCallback(List<? extends SearchItem> list, List<? extends SearchItem> list2) {
        this.oldSearchResultList = list;
        this.newSearchResultList = list2;
    }

    public boolean areContentsTheSame(int i, int i2) {
        List<SearchItem> list = this.oldSearchResultList;
        SearchItem searchItem = null;
        SearchItem searchItem2 = list != null ? list.get(i) : null;
        List<SearchItem> list2 = this.newSearchResultList;
        if (list2 != null) {
            searchItem = list2.get(i2);
        }
        return C10202j.m34176a((Object) searchItem2, (Object) searchItem);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r5 = r0.get(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean areItemsTheSame(int r5, int r6) {
        /*
            r4 = this;
            java.util.List<cm.aptoide.pt.search.model.SearchItem> r0 = r4.oldSearchResultList
            r1 = 0
            if (r0 == 0) goto L_0x0016
            java.lang.Object r5 = r0.get(r5)
            cm.aptoide.pt.search.model.SearchItem r5 = (p015cm.aptoide.p016pt.search.model.SearchItem) r5
            if (r5 == 0) goto L_0x0016
            long r2 = r5.getId()
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            goto L_0x0017
        L_0x0016:
            r5 = r1
        L_0x0017:
            java.util.List<cm.aptoide.pt.search.model.SearchItem> r0 = r4.newSearchResultList
            if (r0 == 0) goto L_0x002b
            java.lang.Object r6 = r0.get(r6)
            cm.aptoide.pt.search.model.SearchItem r6 = (p015cm.aptoide.p016pt.search.model.SearchItem) r6
            if (r6 == 0) goto L_0x002b
            long r0 = r6.getId()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x002b:
            boolean r5 = kotlin.jvm.internal.C10202j.m34176a((java.lang.Object) r5, (java.lang.Object) r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.search.SearchItemDiffCallback.areItemsTheSame(int, int):boolean");
    }

    public Object getChangePayload(int i, int i2) {
        List<SearchItem> list = this.newSearchResultList;
        if (list != null) {
            return list.get(i2);
        }
        return null;
    }

    public int getNewListSize() {
        List<SearchItem> list = this.newSearchResultList;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public int getOldListSize() {
        List<SearchItem> list = this.oldSearchResultList;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
