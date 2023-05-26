package p015cm.aptoide.p016pt.wallet;

import java.util.concurrent.Callable;
import kotlin.C4789l;
import p015cm.aptoide.p016pt.utils.AptoideUtils;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo16641d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.wallet.WalletInstallManager$getAppIcon$1 */
/* compiled from: WalletInstallManager.kt */
final class WalletInstallManager$getAppIcon$1<V> implements Callable<T> {
    final /* synthetic */ String $packageName;
    final /* synthetic */ WalletInstallManager this$0;

    WalletInstallManager$getAppIcon$1(WalletInstallManager walletInstallManager, String str) {
        this.this$0 = walletInstallManager;
        this.$packageName = str;
    }

    public final String call() {
        return AptoideUtils.SystemU.getApkIconPath(this.this$0.getPackageManager().getPackageInfo(this.$packageName, 0));
    }
}
