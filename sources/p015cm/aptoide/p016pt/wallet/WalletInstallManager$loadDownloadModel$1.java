package p015cm.aptoide.p016pt.wallet;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.app.DownloadStateParser;
import p015cm.aptoide.p016pt.install.Install;
import p015cm.aptoide.p016pt.install.InstallAnalytics;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo16641d2 = {"<anonymous>", "Lcm/aptoide/pt/app/DownloadModel;", "install", "Lcm/aptoide/pt/install/Install;", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.wallet.WalletInstallManager$loadDownloadModel$1 */
/* compiled from: WalletInstallManager.kt */
final class WalletInstallManager$loadDownloadModel$1<T, R> implements C5379n<T, R> {
    final /* synthetic */ WalletInstallManager this$0;

    WalletInstallManager$loadDownloadModel$1(WalletInstallManager walletInstallManager) {
        this.this$0 = walletInstallManager;
    }

    public final DownloadModel call(Install install) {
        DownloadStateParser downloadStateParser = this.this$0.getDownloadStateParser();
        C10202j.m34174a((Object) install, InstallAnalytics.RAKAM_INSTALL_EVENT);
        return new DownloadModel(downloadStateParser.parseDownloadType(install.getType(), false), install.getProgress(), this.this$0.getDownloadStateParser().parseDownloadState(install.getState(), install.isIndeterminate()), install.getAppSize());
    }
}
