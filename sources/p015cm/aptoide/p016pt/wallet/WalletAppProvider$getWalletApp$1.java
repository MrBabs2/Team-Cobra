package p015cm.aptoide.p016pt.wallet;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.promotions.WalletApp;
import p015cm.aptoide.p016pt.view.app.DetailedAppRequestResult;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo16641d2 = {"<anonymous>", "Lcm/aptoide/pt/promotions/WalletApp;", "app", "Lcm/aptoide/pt/view/app/DetailedAppRequestResult;", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.wallet.WalletAppProvider$getWalletApp$1 */
/* compiled from: WalletAppProvider.kt */
final class WalletAppProvider$getWalletApp$1<T, R> implements C5379n<T, R> {
    final /* synthetic */ WalletAppProvider this$0;

    WalletAppProvider$getWalletApp$1(WalletAppProvider walletAppProvider) {
        this.this$0 = walletAppProvider;
    }

    public final WalletApp call(DetailedAppRequestResult detailedAppRequestResult) {
        WalletAppProvider walletAppProvider = this.this$0;
        C10202j.m34174a((Object) detailedAppRequestResult, "app");
        return walletAppProvider.mapToWalletApp(detailedAppRequestResult);
    }
}
