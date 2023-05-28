package p015cm.aptoide.p016pt.search;

import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.search.SearchApp;
import p015cm.aptoide.p016pt.search.model.SearchAppResult;
import p015cm.aptoide.p016pt.search.model.SearchFilters;
import p123rx.C5368e;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012*\u0010\u0004\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00020\u0005H\n¢\u0006\u0002\b\b¨\u0006\t"}, mo16641d2 = {"<anonymous>", "Lrx/Observable;", "", "Lcm/aptoide/pt/search/model/SearchAppResult;", "list", "", "Lcm/aptoide/pt/dataprovider/model/v7/search/SearchApp;", "kotlin.jvm.PlatformType", "call", "cm/aptoide/pt/search/SearchRepository$mapToSearchResult$1$1"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.search.SearchRepository$mapToSearchResult$$inlined$let$lambda$1 */
/* compiled from: SearchRepository.kt */
final class SearchRepository$mapToSearchResult$$inlined$let$lambda$1<T, R> implements C5379n<T, C5368e<? extends R>> {
    final /* synthetic */ SearchFilters $filters$inlined;
    final /* synthetic */ String $query$inlined;
    final /* synthetic */ String $specificStore$inlined;
    final /* synthetic */ SearchRepository this$0;

    SearchRepository$mapToSearchResult$$inlined$let$lambda$1(SearchRepository searchRepository, String str, String str2, SearchFilters searchFilters) {
        this.this$0 = searchRepository;
        this.$query$inlined = str;
        this.$specificStore$inlined = str2;
        this.$filters$inlined = searchFilters;
    }

    public final C5368e<List<SearchAppResult>> call(List<SearchApp> list) {
        SearchRepository searchRepository = this.this$0;
        C10202j.m34174a((Object) list, "list");
        return searchRepository.mapToSearchAppResultList(list, this.$query$inlined);
    }
}
