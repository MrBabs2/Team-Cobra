package p015cm.aptoide.p016pt.download.view;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.p016pt.aab.DynamicSplitsModel;
import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p015cm.aptoide.p016pt.download.view.DownloadStatusModel;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;
import p123rx.p126m.C5378b;
import p123rx.p126m.C5379n;
import p322p.p323a.p324a.p325a.C10832d;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, mo16641d2 = {"<anonymous>", "Lrx/Observable;", "Lcm/aptoide/pt/aab/DynamicSplitsModel;", "kotlin.jvm.PlatformType", "it", "Lcm/aptoide/pt/download/view/Download;", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.DownloadViewActionPresenter$downloadApp$2 */
/* compiled from: DownloadViewActionPresenter.kt */
final class DownloadViewActionPresenter$downloadApp$2<T, R> implements C5379n<T, C5368e<? extends R>> {
    final /* synthetic */ Download $download;
    final /* synthetic */ WalletAdsOfferManager.OfferResponseStatus $status;
    final /* synthetic */ DownloadViewActionPresenter this$0;

    DownloadViewActionPresenter$downloadApp$2(DownloadViewActionPresenter downloadViewActionPresenter, Download download, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        this.this$0 = downloadViewActionPresenter;
        this.$download = download;
        this.$status = offerResponseStatus;
    }

    public final C5368e<DynamicSplitsModel> call(Download download) {
        return this.this$0.permissionManager.requestDownloadAccessWithWifiBypass(this.this$0.permissionService, this.$download.getSize()).mo18687f(new C5379n<T, C5368e<? extends R>>(this) {
            final /* synthetic */ DownloadViewActionPresenter$downloadApp$2 this$0;

            {
                this.this$0 = r1;
            }

            public final C5368e<Void> call(Void voidR) {
                return this.this$0.this$0.permissionManager.requestExternalStoragePermission(this.this$0.this$0.permissionService);
            }
        }).mo18692i(new C5379n<T, Single<? extends R>>(this) {
            final /* synthetic */ DownloadViewActionPresenter$downloadApp$2 this$0;

            {
                this.this$0 = r1;
            }

            public final Single<DynamicSplitsModel> call(Void voidR) {
                return C10832d.m36727a(this.this$0.this$0.dynamicSplitsManager.getAppSplitsByMd5(this.this$0.$download.getMd5()));
            }
        }).mo18644a(this.this$0.ioScheduler).mo18689g(new C5379n<DynamicSplitsModel, C5328b>(this) {
            final /* synthetic */ DownloadViewActionPresenter$downloadApp$2 this$0;

            {
                this.this$0 = r1;
            }

            public final C5328b call(DynamicSplitsModel dynamicSplitsModel) {
                DownloadViewActionPresenter$downloadApp$2 downloadViewActionPresenter$downloadApp$2 = this.this$0;
                return downloadViewActionPresenter$downloadApp$2.this$0.createDownload(downloadViewActionPresenter$downloadApp$2.$download, downloadViewActionPresenter$downloadApp$2.$status, dynamicSplitsModel.getDynamicSplitsList()).mo18664b(new C5378b<RoomDownload>(this) {
                    final /* synthetic */ C22883 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void call(RoomDownload roomDownload) {
                        DownloadViewActionPresenter downloadViewActionPresenter = this.this$0.this$0.this$0;
                        C10202j.m34174a((Object) roomDownload, "roomDownload");
                        long appId = this.this$0.this$0.$download.getAppId();
                        DownloadStatusModel downloadModel = this.this$0.this$0.$download.getDownloadModel();
                        if (downloadModel != null) {
                            DownloadStatusModel.Action action = downloadModel.getAction();
                            DownloadViewActionPresenter$downloadApp$2 downloadViewActionPresenter$downloadApp$2 = this.this$0.this$0;
                            downloadViewActionPresenter.setupDownloadEvents(roomDownload, appId, action, downloadViewActionPresenter$downloadApp$2.$status, downloadViewActionPresenter$downloadApp$2.$download.getStoreName(), this.this$0.this$0.$download.getMalware().getRank().name());
                            if (DownloadStatusModel.Action.MIGRATE == this.this$0.this$0.$download.getDownloadModel().getAction()) {
                                this.this$0.this$0.this$0.installAnalytics.uninstallStarted(this.this$0.this$0.$download.getPackageName(), AnalyticsManager.Action.INSTALL, DownloadViewActionPresenter.access$getAnalyticsContext$p(this.this$0.this$0.this$0));
                                this.this$0.this$0.this$0.appcMigrationManager.addMigrationCandidate(this.this$0.this$0.$download.getPackageName());
                                return;
                            }
                            return;
                        }
                        C10202j.m34172a();
                        throw null;
                    }
                }).mo18689g(new C5379n<RoomDownload, C5328b>(this) {
                    final /* synthetic */ C22883 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final C5328b call(RoomDownload roomDownload) {
                        return this.this$0.this$0.this$0.installManager.mo12771h(roomDownload);
                    }
                }).mo18696k();
            }
        });
    }
}
