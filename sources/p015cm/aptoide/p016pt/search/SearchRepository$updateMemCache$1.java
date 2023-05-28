package p015cm.aptoide.p016pt.search;

import java.util.ArrayList;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.search.model.SearchResult;
import p123rx.p126m.C5377a;
import p123rx.p127s.C12871b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo16641d2 = {"<anonymous>", "", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.search.SearchRepository$updateMemCache$1 */
/* compiled from: SearchRepository.kt */
final class SearchRepository$updateMemCache$1 implements C5377a {
    final /* synthetic */ SearchResult $results;
    final /* synthetic */ SearchRepository this$0;

    SearchRepository$updateMemCache$1(SearchRepository searchRepository, SearchResult searchResult) {
        this.this$0 = searchRepository;
        this.$results = searchResult;
    }

    public final void call() {
        SearchResult searchResult = this.$results;
        if (searchResult != null) {
            SearchResult access$getCachedSearchResults$p = this.this$0.cachedSearchResults;
            ArrayList arrayList = new ArrayList(searchResult.getSearchResultsList());
            boolean z = true;
            if (access$getCachedSearchResults$p != null && C10202j.m34176a((Object) access$getCachedSearchResults$p.getQuery(), (Object) searchResult.getQuery()) && C10202j.m34176a((Object) access$getCachedSearchResults$p.getFilters(), (Object) searchResult.getFilters()) && C10202j.m34176a((Object) access$getCachedSearchResults$p.getSpecificStore(), (Object) searchResult.getSpecificStore())) {
                arrayList = new ArrayList(access$getCachedSearchResults$p.getSearchResultsList());
                arrayList.addAll(searchResult.getSearchResultsList());
                z = false;
            }
            C12871b access$getResultsSubject$p = this.this$0.resultsSubject;
            ArrayList arrayList2 = arrayList;
            boolean z2 = z;
            boolean z3 = z;
            SearchResult searchResult2 = r5;
            SearchResult searchResult3 = new SearchResult(searchResult.getQuery(), searchResult.getSpecificStore(), arrayList2, searchResult.getFilters(), searchResult.getCurrentOffset(), searchResult.getNextOffset(), searchResult.getTotal(), searchResult.getLoading(), z2, searchResult.getError());
            access$getResultsSubject$p.onNext(searchResult2);
            this.this$0.cachedSearchResults = new SearchResult(searchResult.getQuery(), searchResult.getSpecificStore(), arrayList2, searchResult.getFilters(), searchResult.getCurrentOffset(), searchResult.getNextOffset(), searchResult.getTotal(), searchResult.getLoading(), z3, searchResult.getError());
        }
    }
}
