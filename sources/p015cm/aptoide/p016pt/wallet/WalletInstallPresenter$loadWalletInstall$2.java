package p015cm.aptoide.p016pt.wallet;

import kotlin.C4789l;
import p015cm.aptoide.p016pt.presenter.View;
import p123rx.p126m.C5378b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo16641d2 = {"<anonymous>", "", "it", "Lcm/aptoide/pt/presenter/View$LifecycleEvent;", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.wallet.WalletInstallPresenter$loadWalletInstall$2 */
/* compiled from: WalletInstallPresenter.kt */
final class WalletInstallPresenter$loadWalletInstall$2<T> implements C5378b<View.LifecycleEvent> {
    final /* synthetic */ WalletInstallPresenter this$0;

    WalletInstallPresenter$loadWalletInstall$2(WalletInstallPresenter walletInstallPresenter) {
        this.this$0 = walletInstallPresenter;
    }

    public final void call(View.LifecycleEvent lifecycleEvent) {
        if (!this.this$0.hasMinimumSdk()) {
            this.this$0.getView().showSdkErrorView();
        }
    }
}
