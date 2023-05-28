package p015cm.aptoide.p016pt.home.more.appcoins;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.promotions.WalletApp;
import p015cm.aptoide.p016pt.wallet.WalletInstallManager;
import p123rx.C5368e;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, mo16641d2 = {"<anonymous>", "Lrx/Observable;", "Lcm/aptoide/pt/app/DownloadModel;", "app", "Lcm/aptoide/pt/promotions/WalletApp;", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.appcoins.EarnAppcListManager$loadWalletDownloadModel$1 */
/* compiled from: EarnAppcListManager.kt */
final class EarnAppcListManager$loadWalletDownloadModel$1<T, R> implements C5379n<T, C5368e<? extends R>> {
    final /* synthetic */ EarnAppcListManager this$0;

    EarnAppcListManager$loadWalletDownloadModel$1(EarnAppcListManager earnAppcListManager) {
        this.this$0 = earnAppcListManager;
    }

    public final C5368e<DownloadModel> call(WalletApp walletApp) {
        WalletInstallManager access$getWalletInstallManager$p = this.this$0.walletInstallManager;
        C10202j.m34174a((Object) walletApp, "app");
        return access$getWalletInstallManager$p.loadDownloadModel(walletApp);
    }
}
