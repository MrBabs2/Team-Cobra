package p015cm.aptoide.p016pt.home.more.base;

import kotlin.C4789l;
import p015cm.aptoide.aptoideviews.recyclerview.GridRecyclerView;
import p015cm.aptoide.p016pt.C1086R;
import p112n.p118g.p301a.p303b.p308c.p309a.C10681a;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00052\u000e\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007H\n¢\u0006\u0002\b\t"}, mo16641d2 = {"<anonymous>", "", "T", "Lcm/aptoide/pt/view/app/Application;", "V", "Lcm/aptoide/pt/home/more/base/ListAppsViewHolder;", "it", "Lcom/jakewharton/rxbinding/support/v7/widget/RecyclerViewScrollEvent;", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.base.ListAppsFragment$onBottomReached$1 */
/* compiled from: ListAppsFragment.kt */
final class ListAppsFragment$onBottomReached$1<T, R> implements C5379n<T, R> {
    final /* synthetic */ ListAppsFragment this$0;

    ListAppsFragment$onBottomReached$1(ListAppsFragment listAppsFragment) {
        this.this$0 = listAppsFragment;
    }

    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return Boolean.valueOf(call((C10681a) obj));
    }

    public final boolean call(C10681a aVar) {
        return ((GridRecyclerView) this.this$0._$_findCachedViewById(C1086R.C1088id.apps_list)).isEndReached(2);
    }
}
