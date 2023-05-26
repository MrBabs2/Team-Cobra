package p015cm.aptoide.p016pt.wallet;

import kotlin.C10221n;
import kotlin.C4789l;
import p015cm.aptoide.p016pt.promotions.WalletApp;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, mo16641d2 = {"<anonymous>", "", "walletInitialState", "Lkotlin/Pair;", "", "Lcm/aptoide/pt/promotions/WalletApp;", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.wallet.WalletInstallPresenter$loadWalletInstall$5 */
/* compiled from: WalletInstallPresenter.kt */
final class WalletInstallPresenter$loadWalletInstall$5<T, R> implements C5379n<C10221n<? extends String, ? extends WalletApp>, Boolean> {
    public static final WalletInstallPresenter$loadWalletInstall$5 INSTANCE = new WalletInstallPresenter$loadWalletInstall$5();

    WalletInstallPresenter$loadWalletInstall$5() {
    }

    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return Boolean.valueOf(call((C10221n<String, WalletApp>) (C10221n) obj));
    }

    public final boolean call(C10221n<String, WalletApp> nVar) {
        return !nVar.mo35392d().isInstalled();
    }
}
