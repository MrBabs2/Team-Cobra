package p015cm.aptoide.p016pt.home.bundles.promotional;

import android.view.View;
import kotlin.C4789l;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.home.bundles.base.PromotionalBundle;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo16641d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "cm/aptoide/pt/home/bundles/promotional/NewAppViewHolder$setBundle$1$2"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.bundles.promotional.NewAppViewHolder$setBundle$$inlined$let$lambda$2 */
/* compiled from: NewAppViewHolder.kt */
final class NewAppViewHolder$setBundle$$inlined$let$lambda$2 implements View.OnClickListener {
    final /* synthetic */ HomeBundle $homeBundle$inlined;
    final /* synthetic */ NewAppViewHolder this$0;

    NewAppViewHolder$setBundle$$inlined$let$lambda$2(NewAppViewHolder newAppViewHolder, HomeBundle homeBundle) {
        this.this$0 = newAppViewHolder;
        this.$homeBundle$inlined = homeBundle;
    }

    public final void onClick(View view) {
        this.this$0.fireAppClickEvent((PromotionalBundle) this.$homeBundle$inlined);
    }
}
