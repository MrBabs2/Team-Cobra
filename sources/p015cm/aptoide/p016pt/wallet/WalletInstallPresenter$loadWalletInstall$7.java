package p015cm.aptoide.p016pt.wallet;

import kotlin.C10221n;
import kotlin.C4789l;
import p015cm.aptoide.p016pt.promotions.WalletApp;
import p123rx.C5368e;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012*\u0010\u0004\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u0007 \u0003*\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\b"}, mo16641d2 = {"<anonymous>", "Lrx/Observable;", "", "kotlin.jvm.PlatformType", "walletInitialState", "Lkotlin/Pair;", "", "Lcm/aptoide/pt/promotions/WalletApp;", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.wallet.WalletInstallPresenter$loadWalletInstall$7 */
/* compiled from: WalletInstallPresenter.kt */
final class WalletInstallPresenter$loadWalletInstall$7<T, R> implements C5379n<T, C5368e<? extends R>> {
    final /* synthetic */ WalletInstallPresenter this$0;

    WalletInstallPresenter$loadWalletInstall$7(WalletInstallPresenter walletInstallPresenter) {
        this.this$0 = walletInstallPresenter;
    }

    public final C5368e<Object> call(C10221n<String, WalletApp> nVar) {
        return this.this$0.startWalletDownload(nVar.mo35392d()).mo18593a(C5368e.m10243a(this.this$0.handleWalletInstallation(), this.this$0.observeDownloadProgress(nVar.mo35392d()), this.this$0.handleInstallDialogCancelButtonPress()));
    }
}
