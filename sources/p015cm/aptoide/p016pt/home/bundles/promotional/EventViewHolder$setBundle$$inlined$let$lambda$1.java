package p015cm.aptoide.p016pt.home.bundles.promotional;

import android.view.View;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.home.bundles.base.ActionItem;
import p015cm.aptoide.p016pt.home.bundles.base.EditorialActionBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p015cm.aptoide.p016pt.home.bundles.editorial.EditorialHomeEvent;
import p123rx.p127s.C12871b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo16641d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "cm/aptoide/pt/home/bundles/promotional/EventViewHolder$setBundle$1$1"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.bundles.promotional.EventViewHolder$setBundle$$inlined$let$lambda$1 */
/* compiled from: EventViewHolder.kt */
final class EventViewHolder$setBundle$$inlined$let$lambda$1 implements View.OnClickListener {
    final /* synthetic */ HomeBundle $homeBundle$inlined;
    final /* synthetic */ int $position$inlined;
    final /* synthetic */ EventViewHolder this$0;

    EventViewHolder$setBundle$$inlined$let$lambda$1(EventViewHolder eventViewHolder, HomeBundle homeBundle, int i) {
        this.this$0 = eventViewHolder;
        this.$homeBundle$inlined = homeBundle;
        this.$position$inlined = i;
    }

    public final void onClick(View view) {
        C12871b<HomeEvent> uiEventsListener = this.this$0.getUiEventsListener();
        ActionItem actionItem = ((EditorialActionBundle) this.$homeBundle$inlined).getActionItem();
        C10202j.m34174a((Object) actionItem, "homeBundle.actionItem");
        String cardId = actionItem.getCardId();
        ActionItem actionItem2 = ((EditorialActionBundle) this.$homeBundle$inlined).getActionItem();
        C10202j.m34174a((Object) actionItem2, "homeBundle.actionItem");
        uiEventsListener.onNext(new EditorialHomeEvent(cardId, actionItem2.getType(), this.$homeBundle$inlined, this.$position$inlined, HomeEvent.Type.EDITORIAL));
    }
}
