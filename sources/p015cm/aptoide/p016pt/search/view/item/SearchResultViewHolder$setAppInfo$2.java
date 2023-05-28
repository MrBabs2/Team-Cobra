package p015cm.aptoide.p016pt.search.view.item;

import android.view.View;
import kotlin.C4789l;
import p015cm.aptoide.p016pt.search.model.SearchAppResult;
import p015cm.aptoide.p016pt.search.model.SearchAppResultWrapper;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo16641d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.search.view.item.SearchResultViewHolder$setAppInfo$2 */
/* compiled from: SearchResultViewHolder.kt */
final class SearchResultViewHolder$setAppInfo$2 implements View.OnClickListener {
    final /* synthetic */ SearchAppResult $result;
    final /* synthetic */ SearchResultViewHolder this$0;

    SearchResultViewHolder$setAppInfo$2(SearchResultViewHolder searchResultViewHolder, SearchAppResult searchAppResult) {
        this.this$0 = searchResultViewHolder;
        this.$result = searchAppResult;
    }

    public final void onClick(View view) {
        this.this$0.itemClickSubject.onNext(new SearchAppResultWrapper(this.this$0.query, this.$result, this.this$0.getAdapterPosition()));
    }
}
