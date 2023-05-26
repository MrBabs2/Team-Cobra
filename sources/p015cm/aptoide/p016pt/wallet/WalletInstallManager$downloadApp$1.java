package p015cm.aptoide.p016pt.wallet;

import kotlin.C4789l;
import p015cm.aptoide.p016pt.aab.DynamicSplitsModel;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p015cm.aptoide.p016pt.promotions.WalletApp;
import p123rx.C5368e;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, mo16641d2 = {"<anonymous>", "Lrx/Observable;", "Lcm/aptoide/pt/database/room/RoomDownload;", "kotlin.jvm.PlatformType", "it", "Lcm/aptoide/pt/aab/DynamicSplitsModel;", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.wallet.WalletInstallManager$downloadApp$1 */
/* compiled from: WalletInstallManager.kt */
final class WalletInstallManager$downloadApp$1<T, R> implements C5379n<T, C5368e<? extends R>> {
    final /* synthetic */ WalletApp $walletApp;
    final /* synthetic */ WalletInstallManager this$0;

    WalletInstallManager$downloadApp$1(WalletInstallManager walletInstallManager, WalletApp walletApp) {
        this.this$0 = walletInstallManager;
        this.$walletApp = walletApp;
    }

    public final C5368e<RoomDownload> call(DynamicSplitsModel dynamicSplitsModel) {
        return C5368e.m10257c(this.this$0.getDownloadFactory().create(this.this$0.getDownloadStateParser().parseDownloadAction(DownloadModel.Action.INSTALL), this.$walletApp.getAppName(), this.$walletApp.getPackageName(), this.$walletApp.getMd5sum(), this.$walletApp.getIcon(), this.$walletApp.getVersionName(), this.$walletApp.getVersionCode(), this.$walletApp.getPath(), this.$walletApp.getPathAlt(), this.$walletApp.getObb(), false, this.$walletApp.getSize(), this.$walletApp.getSplits(), this.$walletApp.getRequiredSplits(), this.$walletApp.getTrustedBadge(), this.$walletApp.getStoreName(), dynamicSplitsModel.getDynamicSplitsList()));
    }
}
