package p015cm.aptoide.p016pt.wallet;

import kotlin.C10221n;
import kotlin.C4789l;
import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.promotions.WalletApp;
import p123rx.C5368e;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0018\u00010\u00012\u000e\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\b"}, mo16641d2 = {"<anonymous>", "Lrx/Observable;", "Lkotlin/Pair;", "", "Lcm/aptoide/pt/promotions/WalletApp;", "it", "Lcm/aptoide/pt/presenter/View$LifecycleEvent;", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.wallet.WalletInstallPresenter$loadWalletInstall$4 */
/* compiled from: WalletInstallPresenter.kt */
final class WalletInstallPresenter$loadWalletInstall$4<T, R> implements C5379n<T, C5368e<? extends R>> {
    final /* synthetic */ WalletInstallPresenter this$0;

    WalletInstallPresenter$loadWalletInstall$4(WalletInstallPresenter walletInstallPresenter) {
        this.this$0 = walletInstallPresenter;
    }

    public final C5368e<C10221n<String, WalletApp>> call(View.LifecycleEvent lifecycleEvent) {
        return this.this$0.showWalletInitialState();
    }
}
