package p015cm.aptoide.p016pt.autoupdate;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.presenter.View;
import p123rx.p126m.C5378b;
import p123rx.schedulers.Schedulers;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo16641d2 = {"Lcm/aptoide/pt/autoupdate/AutoUpdateDialogPresenter;", "Lcm/aptoide/pt/presenter/Presenter;", "view", "Lcm/aptoide/pt/autoupdate/AutoUpdateDialogView;", "crashReporter", "Lcm/aptoide/pt/crashreports/CrashReport;", "autoUpdateManager", "Lcm/aptoide/pt/autoupdate/AutoUpdateManager;", "(Lcm/aptoide/pt/autoupdate/AutoUpdateDialogView;Lcm/aptoide/pt/crashreports/CrashReport;Lcm/aptoide/pt/autoupdate/AutoUpdateManager;)V", "handleNotNowClick", "", "handleUpdateClick", "present", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.autoupdate.AutoUpdateDialogPresenter */
/* compiled from: AutoUpdateDialogPresenter.kt */
public final class AutoUpdateDialogPresenter implements Presenter {
    /* access modifiers changed from: private */
    public final AutoUpdateManager autoUpdateManager;
    /* access modifiers changed from: private */
    public final CrashReport crashReporter;
    /* access modifiers changed from: private */
    public final AutoUpdateDialogView view;

    public AutoUpdateDialogPresenter(AutoUpdateDialogView autoUpdateDialogView, CrashReport crashReport, AutoUpdateManager autoUpdateManager2) {
        C10202j.m34178b(autoUpdateDialogView, "view");
        C10202j.m34178b(crashReport, "crashReporter");
        C10202j.m34178b(autoUpdateManager2, "autoUpdateManager");
        this.view = autoUpdateDialogView;
        this.crashReporter = crashReport;
        this.autoUpdateManager = autoUpdateManager2;
    }

    private final void handleNotNowClick() {
        this.view.getLifecycleEvent().mo18681d(AutoUpdateDialogPresenter$handleNotNowClick$1.INSTANCE).mo18687f(new AutoUpdateDialogPresenter$handleNotNowClick$2(this)).mo18664b(new AutoUpdateDialogPresenter$handleNotNowClick$3(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(AutoUpdateDialogPresenter$handleNotNowClick$4.INSTANCE, (C5378b<Throwable>) new AutoUpdateDialogPresenter$handleNotNowClick$5(this));
    }

    private final void handleUpdateClick() {
        this.view.getLifecycleEvent().mo18681d(AutoUpdateDialogPresenter$handleUpdateClick$1.INSTANCE).mo18687f(new AutoUpdateDialogPresenter$handleUpdateClick$2(this)).mo18644a(Schedulers.m10352io()).mo18687f(new AutoUpdateDialogPresenter$handleUpdateClick$3(this)).mo18664b(new AutoUpdateDialogPresenter$handleUpdateClick$4(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(AutoUpdateDialogPresenter$handleUpdateClick$5.INSTANCE, (C5378b<Throwable>) new AutoUpdateDialogPresenter$handleUpdateClick$6(this));
    }

    public void present() {
        handleUpdateClick();
        handleNotNowClick();
    }
}
