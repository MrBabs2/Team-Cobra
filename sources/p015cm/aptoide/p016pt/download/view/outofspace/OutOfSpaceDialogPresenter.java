package p015cm.aptoide.p016pt.download.view.outofspace;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.presenter.View;
import p123rx.C5373h;
import p123rx.p126m.C5378b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo16641d2 = {"Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceDialogPresenter;", "Lcm/aptoide/pt/presenter/Presenter;", "view", "Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceDialogView;", "crashReporter", "Lcm/aptoide/pt/crashreports/CrashReport;", "viewScheduler", "Lrx/Scheduler;", "ioScheduler", "outOfSpaceManager", "Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceManager;", "outOfSpaceNavigator", "Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceNavigator;", "(Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceDialogView;Lcm/aptoide/pt/crashreports/CrashReport;Lrx/Scheduler;Lrx/Scheduler;Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceManager;Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceNavigator;)V", "handleDismissDialogButtonClick", "", "handleUninstalledEnoughApps", "loadAppsToUninstall", "loadRequiredStorageSize", "present", "uninstallApp", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.outofspace.OutOfSpaceDialogPresenter */
/* compiled from: OutOfSpaceDialogPresenter.kt */
public final class OutOfSpaceDialogPresenter implements Presenter {
    /* access modifiers changed from: private */
    public final CrashReport crashReporter;
    private final C5373h ioScheduler;
    /* access modifiers changed from: private */
    public final OutOfSpaceManager outOfSpaceManager;
    /* access modifiers changed from: private */
    public final OutOfSpaceNavigator outOfSpaceNavigator;
    /* access modifiers changed from: private */
    public final OutOfSpaceDialogView view;
    private final C5373h viewScheduler;

    public OutOfSpaceDialogPresenter(OutOfSpaceDialogView outOfSpaceDialogView, CrashReport crashReport, C5373h hVar, C5373h hVar2, OutOfSpaceManager outOfSpaceManager2, OutOfSpaceNavigator outOfSpaceNavigator2) {
        C10202j.m34178b(outOfSpaceDialogView, "view");
        C10202j.m34178b(crashReport, "crashReporter");
        C10202j.m34178b(hVar, "viewScheduler");
        C10202j.m34178b(hVar2, "ioScheduler");
        C10202j.m34178b(outOfSpaceManager2, "outOfSpaceManager");
        C10202j.m34178b(outOfSpaceNavigator2, "outOfSpaceNavigator");
        this.view = outOfSpaceDialogView;
        this.crashReporter = crashReport;
        this.viewScheduler = hVar;
        this.ioScheduler = hVar2;
        this.outOfSpaceManager = outOfSpaceManager2;
        this.outOfSpaceNavigator = outOfSpaceNavigator2;
    }

    private final void handleDismissDialogButtonClick() {
        this.view.getLifecycleEvent().mo18681d(OutOfSpaceDialogPresenter$handleDismissDialogButtonClick$1.INSTANCE).mo18687f(new OutOfSpaceDialogPresenter$handleDismissDialogButtonClick$2(this)).mo18664b(new OutOfSpaceDialogPresenter$handleDismissDialogButtonClick$3(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(OutOfSpaceDialogPresenter$handleDismissDialogButtonClick$4.INSTANCE, (C5378b<Throwable>) new OutOfSpaceDialogPresenter$handleDismissDialogButtonClick$5(this));
    }

    private final void handleUninstalledEnoughApps() {
        this.view.getLifecycleEvent().mo18681d(OutOfSpaceDialogPresenter$handleUninstalledEnoughApps$1.INSTANCE).mo18687f(new OutOfSpaceDialogPresenter$handleUninstalledEnoughApps$2(this)).mo18664b(new OutOfSpaceDialogPresenter$handleUninstalledEnoughApps$3(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(OutOfSpaceDialogPresenter$handleUninstalledEnoughApps$4.INSTANCE, (C5378b<Throwable>) new OutOfSpaceDialogPresenter$handleUninstalledEnoughApps$5(this));
    }

    private final void loadAppsToUninstall() {
        this.view.getLifecycleEvent().mo18681d(OutOfSpaceDialogPresenter$loadAppsToUninstall$1.INSTANCE).mo18644a(this.ioScheduler).mo18687f(new OutOfSpaceDialogPresenter$loadAppsToUninstall$2(this)).mo18644a(this.viewScheduler).mo18664b(new OutOfSpaceDialogPresenter$loadAppsToUninstall$3(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(OutOfSpaceDialogPresenter$loadAppsToUninstall$4.INSTANCE, (C5378b<Throwable>) new OutOfSpaceDialogPresenter$loadAppsToUninstall$5(this));
    }

    private final void loadRequiredStorageSize() {
        this.view.getLifecycleEvent().mo18681d(OutOfSpaceDialogPresenter$loadRequiredStorageSize$1.INSTANCE).mo18692i(new OutOfSpaceDialogPresenter$loadRequiredStorageSize$2(this)).mo18664b(new OutOfSpaceDialogPresenter$loadRequiredStorageSize$3(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(OutOfSpaceDialogPresenter$loadRequiredStorageSize$4.INSTANCE, (C5378b<Throwable>) new OutOfSpaceDialogPresenter$loadRequiredStorageSize$5(this));
    }

    private final void uninstallApp() {
        this.view.getLifecycleEvent().mo18681d(OutOfSpaceDialogPresenter$uninstallApp$1.INSTANCE).mo18687f(new OutOfSpaceDialogPresenter$uninstallApp$2(this)).mo18692i(new OutOfSpaceDialogPresenter$uninstallApp$3(this)).mo18664b(new OutOfSpaceDialogPresenter$uninstallApp$4(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(OutOfSpaceDialogPresenter$uninstallApp$5.INSTANCE, (C5378b<Throwable>) new OutOfSpaceDialogPresenter$uninstallApp$6(this));
    }

    public void present() {
        loadAppsToUninstall();
        loadRequiredStorageSize();
        uninstallApp();
        handleDismissDialogButtonClick();
        handleUninstalledEnoughApps();
    }
}
