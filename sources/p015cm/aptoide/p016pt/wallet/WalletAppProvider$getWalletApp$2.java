package p015cm.aptoide.p016pt.wallet;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.install.Install;
import p015cm.aptoide.p016pt.promotions.WalletApp;
import p123rx.C5368e;
import p123rx.p126m.C12497p;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, mo16641d2 = {"<anonymous>", "Lrx/Observable;", "Lcm/aptoide/pt/promotions/WalletApp;", "kotlin.jvm.PlatformType", "walletApp", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.wallet.WalletAppProvider$getWalletApp$2 */
/* compiled from: WalletAppProvider.kt */
final class WalletAppProvider$getWalletApp$2<T, R> implements C5379n<T, C5368e<? extends R>> {
    final /* synthetic */ WalletAppProvider this$0;

    WalletAppProvider$getWalletApp$2(WalletAppProvider walletAppProvider) {
        this.this$0 = walletAppProvider;
    }

    public final C5368e<WalletApp> call(WalletApp walletApp) {
        return C5368e.m10246a(C5368e.m10257c(walletApp), this.this$0.getAptoideInstalledAppsRepository().isInstalled(walletApp.getPackageName()), this.this$0.getInstallManager().getInstall(walletApp.getMd5sum(), walletApp.getPackageName(), walletApp.getVersionCode()), new C12497p<T1, T2, T3, R>(this) {
            final /* synthetic */ WalletAppProvider$getWalletApp$2 this$0;

            {
                this.this$0 = r1;
            }

            public final WalletApp call(WalletApp walletApp, Boolean bool, Install install) {
                WalletAppProvider walletAppProvider = this.this$0.this$0;
                C10202j.m34174a((Object) walletApp, "walletApp");
                C10202j.m34174a((Object) bool, "isInstalled");
                boolean booleanValue = bool.booleanValue();
                C10202j.m34174a((Object) install, "walletDownload");
                return walletAppProvider.mergeToWalletApp(walletApp, booleanValue, install);
            }
        });
    }
}
