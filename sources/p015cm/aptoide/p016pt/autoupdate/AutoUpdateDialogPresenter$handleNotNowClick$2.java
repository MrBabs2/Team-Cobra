package p015cm.aptoide.p016pt.autoupdate;

import kotlin.C4789l;
import p015cm.aptoide.p016pt.presenter.View;
import p123rx.C5368e;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, mo16641d2 = {"<anonymous>", "Lrx/Observable;", "Ljava/lang/Void;", "it", "Lcm/aptoide/pt/presenter/View$LifecycleEvent;", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.autoupdate.AutoUpdateDialogPresenter$handleNotNowClick$2 */
/* compiled from: AutoUpdateDialogPresenter.kt */
final class AutoUpdateDialogPresenter$handleNotNowClick$2<T, R> implements C5379n<T, C5368e<? extends R>> {
    final /* synthetic */ AutoUpdateDialogPresenter this$0;

    AutoUpdateDialogPresenter$handleNotNowClick$2(AutoUpdateDialogPresenter autoUpdateDialogPresenter) {
        this.this$0 = autoUpdateDialogPresenter;
    }

    public final C5368e<Void> call(View.LifecycleEvent lifecycleEvent) {
        return this.this$0.view.notNowClicked();
    }
}
