package p015cm.aptoide.p016pt.wallet;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.packageinstaller.InstallStatus;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo16641d2 = {"<anonymous>", "", "installStatus", "Lcm/aptoide/pt/packageinstaller/InstallStatus;", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.wallet.WalletInstallManager$onWalletInstallationCanceled$1 */
/* compiled from: WalletInstallManager.kt */
final class WalletInstallManager$onWalletInstallationCanceled$1<T, R> implements C5379n<T, R> {
    public static final WalletInstallManager$onWalletInstallationCanceled$1 INSTANCE = new WalletInstallManager$onWalletInstallationCanceled$1();

    WalletInstallManager$onWalletInstallationCanceled$1() {
    }

    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return Boolean.valueOf(call((InstallStatus) obj));
    }

    public final boolean call(InstallStatus installStatus) {
        InstallStatus.Status status = InstallStatus.Status.CANCELED;
        C10202j.m34174a((Object) installStatus, "installStatus");
        return status.equals(installStatus.getStatus());
    }
}
