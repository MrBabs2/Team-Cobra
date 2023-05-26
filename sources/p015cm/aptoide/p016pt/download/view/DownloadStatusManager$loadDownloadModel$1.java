package p015cm.aptoide.p016pt.download.view;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.install.Install;
import p015cm.aptoide.p016pt.install.InstallAnalytics;
import p123rx.p126m.C12496o;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo16641d2 = {"<anonymous>", "Lcm/aptoide/pt/download/view/DownloadStatusModel;", "install", "Lcm/aptoide/pt/install/Install;", "kotlin.jvm.PlatformType", "isMigration", "", "call", "(Lcm/aptoide/pt/install/Install;Ljava/lang/Boolean;)Lcm/aptoide/pt/download/view/DownloadStatusModel;"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.DownloadStatusManager$loadDownloadModel$1 */
/* compiled from: DownloadStatusManager.kt */
final class DownloadStatusManager$loadDownloadModel$1<T1, T2, R> implements C12496o<T1, T2, R> {
    final /* synthetic */ DownloadStatusManager this$0;

    DownloadStatusManager$loadDownloadModel$1(DownloadStatusManager downloadStatusManager) {
        this.this$0 = downloadStatusManager;
    }

    public final DownloadStatusModel call(Install install, Boolean bool) {
        DownloadStatusManager downloadStatusManager = this.this$0;
        C10202j.m34174a((Object) install, InstallAnalytics.RAKAM_INSTALL_EVENT);
        Install.InstallationType type = install.getType();
        C10202j.m34174a((Object) bool, "isMigration");
        return new DownloadStatusModel(downloadStatusManager.parseStatusDownloadType(type, bool.booleanValue()), install.getProgress(), this.this$0.parseStatusDownloadState(install.getState(), install.isIndeterminate()));
    }
}
