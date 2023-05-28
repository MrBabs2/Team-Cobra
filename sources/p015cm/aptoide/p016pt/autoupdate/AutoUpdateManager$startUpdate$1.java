package p015cm.aptoide.p016pt.autoupdate;

import kotlin.C4789l;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;
import p015cm.aptoide.p016pt.install.Install;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.C5375k;
import p123rx.p126m.C5378b;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, mo16641d2 = {"<anonymous>", "Lrx/Observable;", "Lcm/aptoide/pt/install/Install;", "kotlin.jvm.PlatformType", "it", "Lcm/aptoide/pt/autoupdate/AutoUpdateModel;", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.autoupdate.AutoUpdateManager$startUpdate$1 */
/* compiled from: AutoUpdateManager.kt */
final class AutoUpdateManager$startUpdate$1<T, R> implements C5379n<T, C5368e<? extends R>> {
    final /* synthetic */ boolean $shouldInstall;
    final /* synthetic */ AutoUpdateManager this$0;

    AutoUpdateManager$startUpdate$1(AutoUpdateManager autoUpdateManager, boolean z) {
        this.this$0 = autoUpdateManager;
        this.$shouldInstall = z;
    }

    public final C5368e<Install> call(AutoUpdateModel autoUpdateModel) {
        return C5368e.m10257c(this.this$0.downloadFactory.create(autoUpdateModel.getMd5(), autoUpdateModel.getVersionCode(), autoUpdateModel.getPackageName(), autoUpdateModel.getUri(), false)).mo18689g(new C5379n<RoomDownload, C5328b>(this) {
            final /* synthetic */ AutoUpdateManager$startUpdate$1 this$0;

            {
                this.this$0 = r1;
            }

            public final C5328b call(final RoomDownload roomDownload) {
                return this.this$0.this$0.installManager.install(roomDownload, this.this$0.$shouldInstall).mo18602b((C5378b<? super C5375k>) new C5378b<C5375k>(this) {
                    final /* synthetic */ C19481 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void call(C5375k kVar) {
                        this.this$0.this$0.this$0.downloadAnalytics.downloadStartEvent(roomDownload, AnalyticsManager.Action.CLICK, DownloadAnalytics.AppContext.AUTO_UPDATE, false);
                    }
                });
            }
        }).mo18696k().mo18593a(this.this$0.getInstall());
    }
}
