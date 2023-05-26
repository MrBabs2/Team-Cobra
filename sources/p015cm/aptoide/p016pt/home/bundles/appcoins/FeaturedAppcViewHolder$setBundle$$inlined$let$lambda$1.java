package p015cm.aptoide.p016pt.home.bundles.appcoins;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t¸\u0006\u0000"}, mo16641d2 = {"cm/aptoide/pt/home/bundles/appcoins/FeaturedAppcViewHolder$setBundle$1$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.bundles.appcoins.FeaturedAppcViewHolder$setBundle$$inlined$let$lambda$1 */
/* compiled from: FeaturedAppcViewHolder.kt */
public final class FeaturedAppcViewHolder$setBundle$$inlined$let$lambda$1 extends RecyclerView.C0653t {
    final /* synthetic */ HomeBundle $homeBundle$inlined;
    final /* synthetic */ int $position$inlined;
    final /* synthetic */ FeaturedAppcViewHolder this$0;

    FeaturedAppcViewHolder$setBundle$$inlined$let$lambda$1(FeaturedAppcViewHolder featuredAppcViewHolder, HomeBundle homeBundle, int i) {
        this.this$0 = featuredAppcViewHolder;
        this.$homeBundle$inlined = homeBundle;
        this.$position$inlined = i;
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        C10202j.m34178b(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        if (i > 0) {
            this.this$0.getUiEventsListener().onNext(new HomeEvent(this.$homeBundle$inlined, this.this$0.getAdapterPosition(), HomeEvent.Type.SCROLL_RIGHT));
        }
    }
}
