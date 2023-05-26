package p015cm.aptoide.p016pt.home.bundles.appcoins;

import android.view.View;
import kotlin.C4789l;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo16641d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.bundles.appcoins.EarnAppCoinsViewHolder$setBundle$3 */
/* compiled from: EarnAppCoinsViewHolder.kt */
final class EarnAppCoinsViewHolder$setBundle$3 implements View.OnClickListener {
    final /* synthetic */ HomeBundle $homeBundle;
    final /* synthetic */ EarnAppCoinsViewHolder this$0;

    EarnAppCoinsViewHolder$setBundle$3(EarnAppCoinsViewHolder earnAppCoinsViewHolder, HomeBundle homeBundle) {
        this.this$0 = earnAppCoinsViewHolder;
        this.$homeBundle = homeBundle;
    }

    public final void onClick(View view) {
        this.this$0.getUiEventsListener().onNext(new HomeEvent(this.$homeBundle, this.this$0.getAdapterPosition(), HomeEvent.Type.MORE));
    }
}
