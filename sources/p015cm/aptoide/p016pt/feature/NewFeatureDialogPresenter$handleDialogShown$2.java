package p015cm.aptoide.p016pt.feature;

import kotlin.C4789l;
import p015cm.aptoide.p016pt.presenter.View;
import p123rx.p126m.C5378b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo16641d2 = {"<anonymous>", "", "it", "Lcm/aptoide/pt/presenter/View$LifecycleEvent;", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.feature.NewFeatureDialogPresenter$handleDialogShown$2 */
/* compiled from: NewFeatureDialogPresenter.kt */
final class NewFeatureDialogPresenter$handleDialogShown$2<T> implements C5378b<View.LifecycleEvent> {
    final /* synthetic */ NewFeatureDialogPresenter this$0;

    NewFeatureDialogPresenter$handleDialogShown$2(NewFeatureDialogPresenter newFeatureDialogPresenter) {
        this.this$0 = newFeatureDialogPresenter;
    }

    public final void call(View.LifecycleEvent lifecycleEvent) {
        this.this$0.newFeatureManager.setFeatureAsShown();
        this.this$0.newFeatureManager.unscheduleNotification();
    }
}
