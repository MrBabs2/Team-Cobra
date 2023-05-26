package p015cm.aptoide.p016pt.search;

import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.DataList;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.search.ListSearchApps;
import p015cm.aptoide.p016pt.search.model.SearchAppResult;
import p015cm.aptoide.p016pt.search.model.SearchFilters;
import p015cm.aptoide.p016pt.search.model.SearchResult;
import p015cm.aptoide.p016pt.search.model.SearchResultError;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, mo16641d2 = {"<anonymous>", "Lcm/aptoide/pt/search/model/SearchResult;", "list", "", "Lcm/aptoide/pt/search/model/SearchAppResult;", "kotlin.jvm.PlatformType", "call", "cm/aptoide/pt/search/SearchRepository$mapToSearchResult$1$2"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.search.SearchRepository$mapToSearchResult$$inlined$let$lambda$2 */
/* compiled from: SearchRepository.kt */
final class SearchRepository$mapToSearchResult$$inlined$let$lambda$2<T, R> implements C5379n<T, R> {
    final /* synthetic */ SearchFilters $filters$inlined;
    final /* synthetic */ String $query$inlined;

    /* renamed from: $r */
    final /* synthetic */ ListSearchApps f7068$r;
    final /* synthetic */ String $specificStore$inlined;
    final /* synthetic */ SearchRepository this$0;

    SearchRepository$mapToSearchResult$$inlined$let$lambda$2(ListSearchApps listSearchApps, SearchRepository searchRepository, String str, String str2, SearchFilters searchFilters) {
        this.f7068$r = listSearchApps;
        this.this$0 = searchRepository;
        this.$query$inlined = str;
        this.$specificStore$inlined = str2;
        this.$filters$inlined = searchFilters;
    }

    public final SearchResult call(List<? extends SearchAppResult> list) {
        String str = this.$query$inlined;
        String str2 = this.$specificStore$inlined;
        C10202j.m34174a((Object) list, "list");
        SearchFilters searchFilters = this.$filters$inlined;
        DataList dataList = this.f7068$r.getDataList();
        C10202j.m34174a((Object) dataList, "r.dataList");
        int offset = dataList.getOffset();
        DataList dataList2 = this.f7068$r.getDataList();
        C10202j.m34174a((Object) dataList2, "r.dataList");
        int next = dataList2.getNext();
        DataList dataList3 = this.f7068$r.getDataList();
        C10202j.m34174a((Object) dataList3, "r.dataList");
        int total = dataList3.getTotal();
        DataList dataList4 = this.f7068$r.getDataList();
        C10202j.m34174a((Object) dataList4, "r.dataList");
        return new SearchResult(str, str2, list, searchFilters, offset, next, total, !dataList4.isLoaded(), false, (SearchResultError) null);
    }
}
