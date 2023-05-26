package p015cm.aptoide.p016pt.home.apps.list.models;

import android.view.View;
import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.p215c0.p216c.C9102a;
import p015cm.aptoide.p016pt.home.apps.AppClick;
import p015cm.aptoide.p016pt.home.apps.model.DownloadApp;
import p015cm.aptoide.p016pt.home.apps.model.StateApp;
import p123rx.p127s.C12871b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo16641d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.apps.list.models.DownloadCardModel$setupListeners$1 */
/* compiled from: DownloadCardModel.kt */
final class DownloadCardModel$setupListeners$1 implements View.OnClickListener {
    final /* synthetic */ DownloadApp $app;
    final /* synthetic */ DownloadCardModel this$0;

    DownloadCardModel$setupListeners$1(DownloadCardModel downloadCardModel, DownloadApp downloadApp) {
        this.this$0 = downloadCardModel;
        this.$app = downloadApp;
    }

    public final void onClick(View view) {
        this.this$0.debouncer.execute(new C9102a<C10483v>(this) {
            final /* synthetic */ DownloadCardModel$setupListeners$1 this$0;

            {
                this.this$0 = r1;
            }

            public final void invoke() {
                AppClick.ClickType clickType = AppClick.ClickType.CARD_CLICK;
                StateApp.Status status = this.this$0.$app.getStatus();
                if (status != null && status == StateApp.Status.STANDBY) {
                    clickType = AppClick.ClickType.INSTALL_CLICK;
                }
                C12871b<AppClick> eventSubject = this.this$0.this$0.getEventSubject();
                if (eventSubject != null) {
                    eventSubject.onNext(new AppClick(this.this$0.$app, clickType));
                }
            }
        });
    }
}
