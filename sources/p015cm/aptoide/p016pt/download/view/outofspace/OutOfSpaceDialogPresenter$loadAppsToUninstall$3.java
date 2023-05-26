package p015cm.aptoide.p016pt.download.view.outofspace;

import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p123rx.p126m.C5378b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo16641d2 = {"<anonymous>", "", "appsList", "", "Lcm/aptoide/pt/download/view/outofspace/InstalledApp;", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.outofspace.OutOfSpaceDialogPresenter$loadAppsToUninstall$3 */
/* compiled from: OutOfSpaceDialogPresenter.kt */
final class OutOfSpaceDialogPresenter$loadAppsToUninstall$3<T> implements C5378b<List<? extends InstalledApp>> {
    final /* synthetic */ OutOfSpaceDialogPresenter this$0;

    OutOfSpaceDialogPresenter$loadAppsToUninstall$3(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter) {
        this.this$0 = outOfSpaceDialogPresenter;
    }

    public final void call(List<InstalledApp> list) {
        C10202j.m34174a((Object) list, "appsList");
        if (!list.isEmpty()) {
            this.this$0.view.showInstalledApps(list);
        } else {
            this.this$0.view.showGeneralOutOfSpaceError();
        }
    }
}
