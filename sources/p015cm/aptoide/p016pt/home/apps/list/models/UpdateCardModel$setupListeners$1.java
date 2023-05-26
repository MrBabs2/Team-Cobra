package p015cm.aptoide.p016pt.home.apps.list.models;

import android.view.View;
import kotlin.C4789l;
import p015cm.aptoide.p016pt.home.apps.AppClick;
import p015cm.aptoide.p016pt.home.apps.model.UpdateApp;
import p123rx.p127s.C12871b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo16641d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.apps.list.models.UpdateCardModel$setupListeners$1 */
/* compiled from: UpdateCardModel.kt */
final class UpdateCardModel$setupListeners$1 implements View.OnClickListener {
    final /* synthetic */ UpdateApp $app;
    final /* synthetic */ UpdateCardModel this$0;

    UpdateCardModel$setupListeners$1(UpdateCardModel updateCardModel, UpdateApp updateApp) {
        this.this$0 = updateCardModel;
        this.$app = updateApp;
    }

    public final void onClick(View view) {
        C12871b<AppClick> eventSubject = this.this$0.getEventSubject();
        if (eventSubject != null) {
            eventSubject.onNext(new AppClick(this.$app, AppClick.ClickType.DOWNLOAD_ACTION_CLICK));
        }
    }
}
