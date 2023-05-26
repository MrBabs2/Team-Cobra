package p015cm.aptoide.p016pt.download.view.outofspace;

import kotlin.C4789l;
import p123rx.Single;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, mo16641d2 = {"<anonymous>", "Lrx/Single;", "", "it", "", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.outofspace.OutOfSpaceDialogPresenter$uninstallApp$3 */
/* compiled from: OutOfSpaceDialogPresenter.kt */
final class OutOfSpaceDialogPresenter$uninstallApp$3<T, R> implements C5379n<T, Single<? extends R>> {
    final /* synthetic */ OutOfSpaceDialogPresenter this$0;

    OutOfSpaceDialogPresenter$uninstallApp$3(OutOfSpaceDialogPresenter outOfSpaceDialogPresenter) {
        this.this$0 = outOfSpaceDialogPresenter;
    }

    public final Single<Long> call(String str) {
        return this.this$0.outOfSpaceManager.uninstallApp(str);
    }
}
