package p015cm.aptoide.p016pt.download.view;

import kotlin.C4789l;
import p123rx.p126m.C5378b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo16641d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Boolean;)V"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.DownloadViewActionPresenter$downgradeApp$2 */
/* compiled from: DownloadViewActionPresenter.kt */
final class DownloadViewActionPresenter$downgradeApp$2<T> implements C5378b<Boolean> {
    final /* synthetic */ DownloadViewActionPresenter this$0;

    DownloadViewActionPresenter$downgradeApp$2(DownloadViewActionPresenter downloadViewActionPresenter) {
        this.this$0 = downloadViewActionPresenter;
    }

    public final void call(Boolean bool) {
        this.this$0.downloadDialogProvider.showDowngradingSnackBar();
    }
}
