package p015cm.aptoide.p016pt.feature;

import kotlin.C4789l;
import p123rx.p126m.C5378b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo16641d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.feature.NewFeatureDialogPresenter$handleTurnItOnClick$3 */
/* compiled from: NewFeatureDialogPresenter.kt */
final class NewFeatureDialogPresenter$handleTurnItOnClick$3<T> implements C5378b<Void> {
    final /* synthetic */ NewFeatureDialogPresenter this$0;

    NewFeatureDialogPresenter$handleTurnItOnClick$3(NewFeatureDialogPresenter newFeatureDialogPresenter) {
        this.this$0 = newFeatureDialogPresenter;
    }

    public final void call(Void voidR) {
        this.this$0.getView().dismissView();
        this.this$0.newFeatureListener.onActivateFeature();
    }
}
