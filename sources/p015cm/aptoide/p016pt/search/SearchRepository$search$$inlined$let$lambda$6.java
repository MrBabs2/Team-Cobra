package p015cm.aptoide.p016pt.search;

import kotlin.C4789l;
import p015cm.aptoide.p016pt.search.model.SearchFilters;
import p015cm.aptoide.p016pt.search.model.SearchResult;
import p123rx.p126m.C5377a;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, mo16641d2 = {"<anonymous>", "", "call", "cm/aptoide/pt/search/SearchRepository$search$2$6"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.search.SearchRepository$search$$inlined$let$lambda$6 */
/* compiled from: SearchRepository.kt */
final class SearchRepository$search$$inlined$let$lambda$6 implements C5377a {
    final /* synthetic */ SearchResult $activeResults;
    final /* synthetic */ SearchFilters $filters$inlined;
    final /* synthetic */ boolean $matureEnabled$inlined;
    final /* synthetic */ String $query$inlined;
    final /* synthetic */ String $specificStore$inlined;
    final /* synthetic */ SearchRepository this$0;

    SearchRepository$search$$inlined$let$lambda$6(SearchResult searchResult, SearchRepository searchRepository, String str, String str2, SearchFilters searchFilters, boolean z) {
        this.$activeResults = searchResult;
        this.this$0 = searchRepository;
        this.$query$inlined = str;
        this.$specificStore$inlined = str2;
        this.$filters$inlined = searchFilters;
        this.$matureEnabled$inlined = z;
    }

    public final void call() {
        this.this$0.resultsSubject.onNext(this.$activeResults);
    }
}
