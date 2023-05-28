package p015cm.aptoide.p016pt.search;

import kotlin.C4789l;
import p015cm.aptoide.p016pt.search.model.SearchFilters;
import p123rx.C5328b;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo16641d2 = {"<anonymous>", "Lrx/Completable;", "it", "", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.search.SearchRepository$generalSearch$1 */
/* compiled from: SearchRepository.kt */
final class SearchRepository$generalSearch$1<T, R> implements C5379n<String, C5328b> {
    final /* synthetic */ SearchFilters $filters;
    final /* synthetic */ boolean $matureEnabled;
    final /* synthetic */ String $query;
    final /* synthetic */ boolean $useCachedValues;
    final /* synthetic */ SearchRepository this$0;

    SearchRepository$generalSearch$1(SearchRepository searchRepository, String str, SearchFilters searchFilters, boolean z, boolean z2) {
        this.this$0 = searchRepository;
        this.$query = str;
        this.$filters = searchFilters;
        this.$matureEnabled = z;
        this.$useCachedValues = z2;
    }

    public final C5328b call(String str) {
        return this.this$0.search(this.$query, this.$filters, this.$matureEnabled, (String) null, this.$useCachedValues);
    }
}
