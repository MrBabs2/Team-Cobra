package p015cm.aptoide.p016pt.download.view;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.install.InstallManager;
import p123rx.C5368e;
import p123rx.p126m.C12495m;
import p123rx.p126m.C5378b;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, mo16641d2 = {"<anonymous>", "Lrx/Observable;", "Lcm/aptoide/pt/download/view/Download;", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.DownloadViewActionPresenter$downloadApp$1 */
/* compiled from: DownloadViewActionPresenter.kt */
final class DownloadViewActionPresenter$downloadApp$1<R> implements C12495m<C5368e<T>> {
    final /* synthetic */ Download $download;
    final /* synthetic */ DownloadViewActionPresenter this$0;

    DownloadViewActionPresenter$downloadApp$1(DownloadViewActionPresenter downloadViewActionPresenter, Download download) {
        this.this$0 = downloadViewActionPresenter;
        this.$download = download;
    }

    public final C5368e<Download> call() {
        if (this.this$0.installManager.showWarning()) {
            return this.this$0.downloadDialogProvider.showRootInstallWarningPopup().mo18664b(new C5378b<Boolean>(this) {
                final /* synthetic */ DownloadViewActionPresenter$downloadApp$1 this$0;

                {
                    this.this$0 = r1;
                }

                public final void call(Boolean bool) {
                    InstallManager access$getInstallManager$p = this.this$0.this$0.installManager;
                    C10202j.m34174a((Object) bool, "answer");
                    access$getInstallManager$p.rootInstallAllowed(bool.booleanValue());
                }
            }).mo18694j(new C5379n<T, R>(this) {
                final /* synthetic */ DownloadViewActionPresenter$downloadApp$1 this$0;

                {
                    this.this$0 = r1;
                }

                public final Download call(Boolean bool) {
                    return this.this$0.$download;
                }
            });
        }
        return C5368e.m10257c(this.$download);
    }
}
