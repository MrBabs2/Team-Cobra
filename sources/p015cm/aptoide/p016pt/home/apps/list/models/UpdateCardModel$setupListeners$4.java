package p015cm.aptoide.p016pt.home.apps.list.models;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.aptoideviews.downloadprogressview.DownloadEventListener;
import p015cm.aptoide.p016pt.home.apps.AppClick;
import p015cm.aptoide.p016pt.home.apps.list.models.UpdateCardModel;
import p015cm.aptoide.p016pt.home.apps.model.UpdateApp;
import p123rx.p127s.C12871b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo16641d2 = {"cm/aptoide/pt/home/apps/list/models/UpdateCardModel$setupListeners$4", "Lcm/aptoide/aptoideviews/downloadprogressview/DownloadEventListener;", "onActionClick", "", "action", "Lcm/aptoide/aptoideviews/downloadprogressview/DownloadEventListener$Action;", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.apps.list.models.UpdateCardModel$setupListeners$4 */
/* compiled from: UpdateCardModel.kt */
public final class UpdateCardModel$setupListeners$4 implements DownloadEventListener {
    final /* synthetic */ UpdateApp $app;
    final /* synthetic */ UpdateCardModel.CardHolder $holder;
    final /* synthetic */ UpdateCardModel this$0;

    UpdateCardModel$setupListeners$4(UpdateCardModel updateCardModel, UpdateApp updateApp, UpdateCardModel.CardHolder cardHolder) {
        this.this$0 = updateCardModel;
        this.$app = updateApp;
        this.$holder = cardHolder;
    }

    public void onActionClick(DownloadEventListener.Action action) {
        C12871b<AppClick> eventSubject;
        C10202j.m34178b(action, "action");
        int i = UpdateCardModel.WhenMappings.$EnumSwitchMapping$0[action.getType().ordinal()];
        if (i == 1) {
            C12871b<AppClick> eventSubject2 = this.this$0.getEventSubject();
            if (eventSubject2 != null) {
                eventSubject2.onNext(new AppClick(this.$app, AppClick.ClickType.CANCEL_CLICK));
            }
            this.this$0.setDownloadViewVisibility(this.$holder, this.$app, false, false);
        } else if (i == 2) {
            C12871b<AppClick> eventSubject3 = this.this$0.getEventSubject();
            if (eventSubject3 != null) {
                eventSubject3.onNext(new AppClick(this.$app, AppClick.ClickType.RESUME_CLICK));
            }
        } else if (i == 3 && (eventSubject = this.this$0.getEventSubject()) != null) {
            eventSubject.onNext(new AppClick(this.$app, AppClick.ClickType.PAUSE_CLICK));
        }
    }
}
