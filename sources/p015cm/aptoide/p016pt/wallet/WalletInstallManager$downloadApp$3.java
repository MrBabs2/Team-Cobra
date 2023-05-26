package p015cm.aptoide.p016pt.wallet;

import kotlin.C4789l;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p123rx.C5328b;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, mo16641d2 = {"<anonymous>", "Lrx/Completable;", "kotlin.jvm.PlatformType", "download", "Lcm/aptoide/pt/database/room/RoomDownload;", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.wallet.WalletInstallManager$downloadApp$3 */
/* compiled from: WalletInstallManager.kt */
final class WalletInstallManager$downloadApp$3<T, R> implements C5379n<RoomDownload, C5328b> {
    final /* synthetic */ WalletInstallManager this$0;

    WalletInstallManager$downloadApp$3(WalletInstallManager walletInstallManager) {
        this.this$0 = walletInstallManager;
    }

    public final C5328b call(RoomDownload roomDownload) {
        return this.this$0.getInstallManager().splitInstall(roomDownload);
    }
}
