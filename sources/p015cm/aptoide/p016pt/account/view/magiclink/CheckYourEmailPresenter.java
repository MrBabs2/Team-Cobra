package p015cm.aptoide.p016pt.account.view.magiclink;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.presenter.View;
import p123rx.p126m.C5378b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, mo16641d2 = {"Lcm/aptoide/pt/account/view/magiclink/CheckYourEmailPresenter;", "Lcm/aptoide/pt/presenter/Presenter;", "view", "Lcm/aptoide/pt/account/view/magiclink/CheckYourEmailView;", "navigator", "Lcm/aptoide/pt/account/view/magiclink/CheckYourEmailNavigator;", "(Lcm/aptoide/pt/account/view/magiclink/CheckYourEmailView;Lcm/aptoide/pt/account/view/magiclink/CheckYourEmailNavigator;)V", "handleCheckEmailAppClick", "", "present", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.account.view.magiclink.CheckYourEmailPresenter */
/* compiled from: CheckYourEmailPresenter.kt */
public final class CheckYourEmailPresenter implements Presenter {
    /* access modifiers changed from: private */
    public final CheckYourEmailNavigator navigator;
    /* access modifiers changed from: private */
    public final CheckYourEmailView view;

    public CheckYourEmailPresenter(CheckYourEmailView checkYourEmailView, CheckYourEmailNavigator checkYourEmailNavigator) {
        C10202j.m34178b(checkYourEmailView, "view");
        C10202j.m34178b(checkYourEmailNavigator, "navigator");
        this.view = checkYourEmailView;
        this.navigator = checkYourEmailNavigator;
    }

    private final void handleCheckEmailAppClick() {
        this.view.getLifecycleEvent().mo18681d(CheckYourEmailPresenter$handleCheckEmailAppClick$1.INSTANCE).mo18687f(new CheckYourEmailPresenter$handleCheckEmailAppClick$2(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(CheckYourEmailPresenter$handleCheckEmailAppClick$3.INSTANCE, (C5378b<Throwable>) CheckYourEmailPresenter$handleCheckEmailAppClick$4.INSTANCE);
    }

    public void present() {
        handleCheckEmailAppClick();
    }
}
