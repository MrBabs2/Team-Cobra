package p015cm.aptoide.p016pt.home.more.appcoins;

import kotlin.C4789l;
import p015cm.aptoide.p016pt.promotions.WalletApp;
import p123rx.C5368e;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0006"}, mo16641d2 = {"<anonymous>", "Lrx/Observable;", "", "kotlin.jvm.PlatformType", "it", "Lcm/aptoide/pt/promotions/WalletApp;", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.appcoins.EarnAppcListPresenter$loadWalletApp$4 */
/* compiled from: EarnAppcListPresenter.kt */
final class EarnAppcListPresenter$loadWalletApp$4<T, R> implements C5379n<T, C5368e<? extends R>> {
    final /* synthetic */ EarnAppcListPresenter this$0;

    EarnAppcListPresenter$loadWalletApp$4(EarnAppcListPresenter earnAppcListPresenter) {
        this.this$0 = earnAppcListPresenter;
    }

    public final C5368e<Object> call(WalletApp walletApp) {
        return C5368e.m10255b(this.this$0.observeWalletState(), this.this$0.handleOnWalletInstalled(), this.this$0.observeWalletDownloadError());
    }
}
