package p015cm.aptoide.p016pt.home.bundles.appcoins;

import android.view.View;
import kotlin.C4789l;
import p015cm.aptoide.p016pt.home.bundles.apps.RewardApp;
import p015cm.aptoide.p016pt.home.bundles.base.AppHomeEvent;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo16641d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.bundles.appcoins.EarnAppCoinsItemViewHolder$setApp$2 */
/* compiled from: EarnAppCoinsItemViewHolder.kt */
final class EarnAppCoinsItemViewHolder$setApp$2 implements View.OnClickListener {
    final /* synthetic */ RewardApp $app;
    final /* synthetic */ int $bundlePosition;
    final /* synthetic */ HomeBundle $homeBundle;
    final /* synthetic */ EarnAppCoinsItemViewHolder this$0;

    EarnAppCoinsItemViewHolder$setApp$2(EarnAppCoinsItemViewHolder earnAppCoinsItemViewHolder, RewardApp rewardApp, HomeBundle homeBundle, int i) {
        this.this$0 = earnAppCoinsItemViewHolder;
        this.$app = rewardApp;
        this.$homeBundle = homeBundle;
        this.$bundlePosition = i;
    }

    public final void onClick(View view) {
        this.this$0.getAppClicks().onNext(new AppHomeEvent(this.$app, this.this$0.getAdapterPosition(), this.$homeBundle, this.$bundlePosition, HomeEvent.Type.APP));
    }
}
