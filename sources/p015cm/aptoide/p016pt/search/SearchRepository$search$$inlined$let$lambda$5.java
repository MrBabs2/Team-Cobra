package p015cm.aptoide.p016pt.search;

import kotlin.C4789l;
import p015cm.aptoide.p016pt.search.model.SearchFilters;
import p123rx.p126m.C5378b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo16641d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call", "cm/aptoide/pt/search/SearchRepository$search$2$5"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.search.SearchRepository$search$$inlined$let$lambda$5 */
/* compiled from: SearchRepository.kt */
final class SearchRepository$search$$inlined$let$lambda$5<T> implements C5378b<Throwable> {
    final /* synthetic */ SearchFilters $filters$inlined;
    final /* synthetic */ boolean $matureEnabled$inlined;
    final /* synthetic */ String $query$inlined;
    final /* synthetic */ String $specificStore$inlined;
    final /* synthetic */ SearchRepository this$0;

    SearchRepository$search$$inlined$let$lambda$5(SearchRepository searchRepository, String str, String str2, SearchFilters searchFilters, boolean z) {
        this.this$0 = searchRepository;
        this.$query$inlined = str;
        this.$specificStore$inlined = str2;
        this.$filters$inlined = searchFilters;
        this.$matureEnabled$inlined = z;
    }

    public final void call(Throwable th) {
        this.this$0.loadingMore = false;
    }
}
