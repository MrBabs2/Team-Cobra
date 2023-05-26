package p015cm.aptoide.p016pt.feature;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.themes.NewFeatureDialogView;
import p015cm.aptoide.p016pt.themes.NewFeatureManager;
import p123rx.p126m.C5378b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, mo16641d2 = {"Lcm/aptoide/pt/feature/NewFeatureDialogPresenter;", "Lcm/aptoide/pt/presenter/Presenter;", "view", "Lcm/aptoide/pt/themes/NewFeatureDialogView;", "newFeatureManager", "Lcm/aptoide/pt/themes/NewFeatureManager;", "newFeatureListener", "Lcm/aptoide/pt/feature/NewFeatureListener;", "(Lcm/aptoide/pt/themes/NewFeatureDialogView;Lcm/aptoide/pt/themes/NewFeatureManager;Lcm/aptoide/pt/feature/NewFeatureListener;)V", "getView", "()Lcm/aptoide/pt/themes/NewFeatureDialogView;", "handleDialogShown", "", "handleDismissClick", "handleTurnItOnClick", "present", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.feature.NewFeatureDialogPresenter */
/* compiled from: NewFeatureDialogPresenter.kt */
public final class NewFeatureDialogPresenter implements Presenter {
    /* access modifiers changed from: private */
    public final NewFeatureListener newFeatureListener;
    /* access modifiers changed from: private */
    public final NewFeatureManager newFeatureManager;
    private final NewFeatureDialogView view;

    public NewFeatureDialogPresenter(NewFeatureDialogView newFeatureDialogView, NewFeatureManager newFeatureManager2, NewFeatureListener newFeatureListener2) {
        C10202j.m34178b(newFeatureDialogView, "view");
        C10202j.m34178b(newFeatureManager2, "newFeatureManager");
        C10202j.m34178b(newFeatureListener2, "newFeatureListener");
        this.view = newFeatureDialogView;
        this.newFeatureManager = newFeatureManager2;
        this.newFeatureListener = newFeatureListener2;
    }

    private final void handleDialogShown() {
        this.view.getLifecycleEvent().mo18681d(NewFeatureDialogPresenter$handleDialogShown$1.INSTANCE).mo18664b(new NewFeatureDialogPresenter$handleDialogShown$2(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(NewFeatureDialogPresenter$handleDialogShown$3.INSTANCE, (C5378b<Throwable>) NewFeatureDialogPresenter$handleDialogShown$4.INSTANCE);
    }

    private final void handleDismissClick() {
        this.view.getLifecycleEvent().mo18681d(NewFeatureDialogPresenter$handleDismissClick$1.INSTANCE).mo18687f(new NewFeatureDialogPresenter$handleDismissClick$2(this)).mo18664b(new NewFeatureDialogPresenter$handleDismissClick$3(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(NewFeatureDialogPresenter$handleDismissClick$4.INSTANCE, (C5378b<Throwable>) NewFeatureDialogPresenter$handleDismissClick$5.INSTANCE);
    }

    private final void handleTurnItOnClick() {
        this.view.getLifecycleEvent().mo18681d(NewFeatureDialogPresenter$handleTurnItOnClick$1.INSTANCE).mo18687f(new NewFeatureDialogPresenter$handleTurnItOnClick$2(this)).mo18664b(new NewFeatureDialogPresenter$handleTurnItOnClick$3(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(NewFeatureDialogPresenter$handleTurnItOnClick$4.INSTANCE, (C5378b<Throwable>) NewFeatureDialogPresenter$handleTurnItOnClick$5.INSTANCE);
    }

    public final NewFeatureDialogView getView() {
        return this.view;
    }

    public void present() {
        handleDialogShown();
        handleDismissClick();
        handleTurnItOnClick();
    }
}
