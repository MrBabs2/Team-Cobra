package p015cm.aptoide.p016pt.search;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.search.model.SearchResult;
import p123rx.Single;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, mo16641d2 = {"<anonymous>", "Lrx/Single;", "Lcm/aptoide/pt/search/model/SearchResult;", "throwable", "", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.search.SearchRepository$requestSearchResults$3 */
/* compiled from: SearchRepository.kt */
final class SearchRepository$requestSearchResults$3<T, R> implements C5379n<Throwable, Single<? extends SearchResult>> {
    final /* synthetic */ String $query;
    final /* synthetic */ String $specificStore;
    final /* synthetic */ SearchRepository this$0;

    SearchRepository$requestSearchResults$3(SearchRepository searchRepository, String str, String str2) {
        this.this$0 = searchRepository;
        this.$query = str;
        this.$specificStore = str2;
    }

    public final Single<SearchResult> call(Throwable th) {
        th.printStackTrace();
        SearchRepository searchRepository = this.this$0;
        String str = this.$query;
        String str2 = this.$specificStore;
        C10202j.m34174a((Object) th, "throwable");
        return searchRepository.handleSearchError(str, str2, th);
    }
}
