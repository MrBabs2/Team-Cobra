package p015cm.aptoide.p016pt.home.more.appcoins;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.promotions.WalletApp;
import p123rx.C5368e;
import p123rx.p126m.C5378b;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, mo16641d2 = {"<anonymous>", "Lrx/Observable;", "Lcm/aptoide/pt/promotions/WalletApp;", "kotlin.jvm.PlatformType", "it", "Ljava/lang/Void;", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.appcoins.EarnAppcListPresenter$observeWalletDownloadError$1 */
/* compiled from: EarnAppcListPresenter.kt */
final class EarnAppcListPresenter$observeWalletDownloadError$1<T, R> implements C5379n<T, C5368e<? extends R>> {
    final /* synthetic */ EarnAppcListPresenter this$0;

    EarnAppcListPresenter$observeWalletDownloadError$1(EarnAppcListPresenter earnAppcListPresenter) {
        this.this$0 = earnAppcListPresenter;
    }

    public final C5368e<WalletApp> call(Void voidR) {
        return this.this$0.earnAppcListManager.observeWalletApp().mo18681d(C30791.INSTANCE).mo18644a(this.this$0.viewScheduler).mo18664b(new C5378b<WalletApp>(this) {
            final /* synthetic */ EarnAppcListPresenter$observeWalletDownloadError$1 this$0;

            {
                this.this$0 = r1;
            }

            public final void call(WalletApp walletApp) {
                C10202j.m34178b(walletApp, "walletApp");
                DownloadModel downloadModel = walletApp.getDownloadModel();
                if ((downloadModel != null ? downloadModel.getDownloadState() : null) == DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR) {
                    this.this$0.this$0.earnAppcNavigator.openOutOfSpaceDialog(walletApp.getSize(), walletApp.getPackageName());
                } else {
                    this.this$0.this$0.view.showDownloadError(walletApp);
                }
            }
        });
    }
}
