package p015cm.aptoide.p016pt.home.more.appcoins;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.promotions.WalletApp;
import p123rx.C5368e;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, mo16641d2 = {"<anonymous>", "Lrx/Observable;", "Lcm/aptoide/pt/promotions/WalletApp;", "walletApp", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.appcoins.EarnAppcListPresenter$observeWalletDownloadError$2 */
/* compiled from: EarnAppcListPresenter.kt */
final class EarnAppcListPresenter$observeWalletDownloadError$2<T, R> implements C5379n<T, C5368e<? extends R>> {
    final /* synthetic */ EarnAppcListPresenter this$0;

    EarnAppcListPresenter$observeWalletDownloadError$2(EarnAppcListPresenter earnAppcListPresenter) {
        this.this$0 = earnAppcListPresenter;
    }

    public final C5368e<WalletApp> call(WalletApp walletApp) {
        EarnAppcListPresenter earnAppcListPresenter = this.this$0;
        C10202j.m34174a((Object) walletApp, "walletApp");
        return earnAppcListPresenter.verifyNotEnoughSpaceError(walletApp);
    }
}
