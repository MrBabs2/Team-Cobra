package p015cm.aptoide.p016pt.home.more.appcoins;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.promotions.WalletApp;
import p123rx.p126m.C5378b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo16641d2 = {"<anonymous>", "", "walletApp", "Lcm/aptoide/pt/promotions/WalletApp;", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.appcoins.EarnAppcListPresenter$loadWalletApp$3 */
/* compiled from: EarnAppcListPresenter.kt */
final class EarnAppcListPresenter$loadWalletApp$3<T> implements C5378b<WalletApp> {
    final /* synthetic */ EarnAppcListPresenter this$0;

    EarnAppcListPresenter$loadWalletApp$3(EarnAppcListPresenter earnAppcListPresenter) {
        this.this$0 = earnAppcListPresenter;
    }

    public final void call(WalletApp walletApp) {
        EarnAppcListView access$getView$p = this.this$0.view;
        C10202j.m34174a((Object) walletApp, "walletApp");
        access$getView$p.setupWallet(walletApp);
    }
}
