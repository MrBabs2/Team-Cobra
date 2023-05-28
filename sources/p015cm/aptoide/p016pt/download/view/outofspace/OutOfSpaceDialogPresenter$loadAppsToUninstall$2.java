package p015cm.aptoide.p016pt.download.view.outofspace;

import java.util.List;
import kotlin.C4789l;
import p015cm.aptoide.p016pt.presenter.View;
import p123rx.C5368e;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, mo16641d2 = {"<anonymous>", "Lrx/Observable;", "", "Lcm/aptoide/pt/download/view/outofspace/InstalledApp;", "it", "Lcm/aptoide/pt/presenter/View$LifecycleEvent;", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.outofspace.OutOfSpaceDialogPresenter$loadAppsToUninstall$2 */
/* compiled from: OutOfSpaceDialogPresenter.kt */
final class OutOfSpaceDialogPresenter$loadAppsToUninstall$2<T, R> implements C5379n<T, C5368e<? extends R>> {
    final /* synthetic */ OutOfSpaceDialogPresenter this$0;

    OutOfSpaceDialogPresenter$loadAppsToUninstall$2(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter) {
        this.this$0 = outOfSpaceDialogPresenter;
    }

    public final C5368e<List<InstalledApp>> call(View.LifecycleEvent lifecycleEvent) {
        return this.this$0.outOfSpaceManager.getInstalledApps();
    }
}
