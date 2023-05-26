package p015cm.aptoide.p016pt.home.more.appcoins;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.promotions.WalletApp;
import p015cm.aptoide.p016pt.wallet.WalletInstallManager;
import p123rx.C5328b;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo16641d2 = {"<anonymous>", "Lrx/Completable;", "app", "Lcm/aptoide/pt/promotions/WalletApp;", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.appcoins.EarnAppcListManager$cancelWalletDownload$1 */
/* compiled from: EarnAppcListManager.kt */
final class EarnAppcListManager$cancelWalletDownload$1<T, R> implements C5379n<WalletApp, C5328b> {
    final /* synthetic */ EarnAppcListManager this$0;

    EarnAppcListManager$cancelWalletDownload$1(EarnAppcListManager earnAppcListManager) {
        this.this$0 = earnAppcListManager;
    }

    public final C5328b call(WalletApp walletApp) {
        WalletInstallManager access$getWalletInstallManager$p = this.this$0.walletInstallManager;
        C10202j.m34174a((Object) walletApp, "app");
        return access$getWalletInstallManager$p.cancelDownload(walletApp);
    }
}
