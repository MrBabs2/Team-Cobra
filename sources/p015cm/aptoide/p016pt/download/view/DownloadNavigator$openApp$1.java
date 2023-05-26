package p015cm.aptoide.p016pt.download.view;

import kotlin.C4789l;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p123rx.p126m.C5377a;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo16641d2 = {"<anonymous>", "", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.DownloadNavigator$openApp$1 */
/* compiled from: DownloadNavigator.kt */
final class DownloadNavigator$openApp$1 implements C5377a {
    final /* synthetic */ String $packageName;
    final /* synthetic */ DownloadNavigator this$0;

    DownloadNavigator$openApp$1(DownloadNavigator downloadNavigator, String str) {
        this.this$0 = downloadNavigator;
        this.$packageName = str;
    }

    public final void call() {
        AptoideUtils.SystemU.openApp(this.$packageName, this.this$0.getPackageManager(), this.this$0.getFragment().getContext());
    }
}
