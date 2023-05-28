package p015cm.aptoide.p016pt.home.more.base;

import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.view.app.Application;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.p126m.C5378b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0016\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H&J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\b\u0010\u0018\u001a\u00020\u0013H&J\b\u0010\u0019\u001a\u00020\u0013H\u0002J\b\u0010\u001a\u001a\u00020\u0013H\u0002J\b\u0010\u001b\u001a\u00020\u0013H\u0002J\u001c\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0014\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\fH\u0016J\b\u0010\u001e\u001a\u00020\u0013H\u0016J\b\u0010\u001f\u001a\u00020\u0013H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, mo16641d2 = {"Lcm/aptoide/pt/home/more/base/ListAppsPresenter;", "T", "Lcm/aptoide/pt/view/app/Application;", "Lcm/aptoide/pt/presenter/Presenter;", "view", "Lcm/aptoide/pt/home/more/base/ListAppsView;", "viewScheduler", "Lrx/Scheduler;", "crashReporter", "Lcm/aptoide/pt/crashreports/CrashReport;", "(Lcm/aptoide/pt/home/more/base/ListAppsView;Lrx/Scheduler;Lcm/aptoide/pt/crashreports/CrashReport;)V", "getApps", "Lrx/Observable;", "", "refresh", "", "getTitle", "", "handleAppClick", "", "appClickEvent", "Lcm/aptoide/pt/home/more/base/ListAppsClickEvent;", "handleBottomReached", "handleBundleHeaderClick", "handleHeaderClick", "handleRefreshSwipe", "handleRetryClick", "loadAppList", "loadApps", "loadMoreApps", "present", "setupToolbar", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.base.ListAppsPresenter */
/* compiled from: ListAppsPresenter.kt */
public abstract class ListAppsPresenter<T extends Application> implements Presenter {
    /* access modifiers changed from: private */
    public final CrashReport crashReporter;
    /* access modifiers changed from: private */
    public final ListAppsView<T> view;
    /* access modifiers changed from: private */
    public final C5373h viewScheduler;

    public ListAppsPresenter(ListAppsView<T> listAppsView, C5373h hVar, CrashReport crashReport) {
        C10202j.m34178b(listAppsView, "view");
        C10202j.m34178b(hVar, "viewScheduler");
        C10202j.m34178b(crashReport, "crashReporter");
        this.view = listAppsView;
        this.viewScheduler = hVar;
        this.crashReporter = crashReport;
    }

    private final void handleAppClick() {
        this.view.getLifecycleEvent().mo18681d(ListAppsPresenter$handleAppClick$1.INSTANCE).mo18687f(new ListAppsPresenter$handleAppClick$2(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(ListAppsPresenter$handleAppClick$3.INSTANCE, (C5378b<Throwable>) new ListAppsPresenter$handleAppClick$4(this));
    }

    private final void handleBottomReached() {
        this.view.getLifecycleEvent().mo18681d(ListAppsPresenter$handleBottomReached$1.INSTANCE).mo18687f(new ListAppsPresenter$handleBottomReached$2(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(ListAppsPresenter$handleBottomReached$3.INSTANCE, (C5378b<Throwable>) new ListAppsPresenter$handleBottomReached$4(this));
    }

    private final void handleBundleHeaderClick() {
        this.view.getLifecycleEvent().mo18681d(ListAppsPresenter$handleBundleHeaderClick$1.INSTANCE).mo18687f(new ListAppsPresenter$handleBundleHeaderClick$2(this)).mo18664b(new ListAppsPresenter$handleBundleHeaderClick$3(this)).mo18686f().mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(ListAppsPresenter$handleBundleHeaderClick$4.INSTANCE, (C5378b<Throwable>) new ListAppsPresenter$handleBundleHeaderClick$5(this));
    }

    private final void handleRefreshSwipe() {
        this.view.getLifecycleEvent().mo18681d(ListAppsPresenter$handleRefreshSwipe$1.INSTANCE).mo18644a(this.viewScheduler).mo18687f(new ListAppsPresenter$handleRefreshSwipe$2(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(ListAppsPresenter$handleRefreshSwipe$3.INSTANCE, (C5378b<Throwable>) new ListAppsPresenter$handleRefreshSwipe$4(this));
    }

    private final void handleRetryClick() {
        this.view.getLifecycleEvent().mo18681d(ListAppsPresenter$handleRetryClick$1.INSTANCE).mo18644a(this.viewScheduler).mo18687f(new ListAppsPresenter$handleRetryClick$2(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(ListAppsPresenter$handleRetryClick$3.INSTANCE, (C5378b<Throwable>) new ListAppsPresenter$handleRetryClick$4(this));
    }

    private final void loadAppList() {
        this.view.getLifecycleEvent().mo18681d(ListAppsPresenter$loadAppList$1.INSTANCE).mo18644a(this.viewScheduler).mo18664b(new ListAppsPresenter$loadAppList$2(this)).mo18687f(new ListAppsPresenter$loadAppList$3(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(ListAppsPresenter$loadAppList$4.INSTANCE, (C5378b<Throwable>) new ListAppsPresenter$loadAppList$5(this));
    }

    /* access modifiers changed from: private */
    public final C5368e<List<T>> loadApps(boolean z) {
        C5368e<List<T>> a = getApps(z).mo18644a(this.viewScheduler).mo18664b(new ListAppsPresenter$loadApps$1(this)).mo18649a((C5378b<? super Throwable>) new ListAppsPresenter$loadApps$2(this));
        C10202j.m34174a((Object) a, "getApps(refresh)\n       …r()\n          }\n        }");
        return a;
    }

    private final void setupToolbar() {
        this.view.getLifecycleEvent().mo18681d(ListAppsPresenter$setupToolbar$1.INSTANCE).mo18644a(this.viewScheduler).mo18664b(new ListAppsPresenter$setupToolbar$2(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(ListAppsPresenter$setupToolbar$3.INSTANCE, (C5378b<Throwable>) new ListAppsPresenter$setupToolbar$4(this));
    }

    public abstract C5368e<List<T>> getApps(boolean z);

    public abstract String getTitle();

    public abstract void handleAppClick(ListAppsClickEvent<T> listAppsClickEvent);

    public abstract void handleHeaderClick();

    public C5368e<List<T>> loadMoreApps() {
        C5368e<List<T>> c = C5368e.m10257c(null);
        C10202j.m34174a((Object) c, "Observable.just(null)");
        return c;
    }

    public void present() {
        loadAppList();
        setupToolbar();
        handleAppClick();
        handleRetryClick();
        handleRefreshSwipe();
        handleBottomReached();
        handleBundleHeaderClick();
    }
}
