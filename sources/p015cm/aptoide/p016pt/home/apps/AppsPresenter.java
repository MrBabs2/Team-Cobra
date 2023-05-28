package p015cm.aptoide.p016pt.home.apps;

import java.util.List;
import p015cm.aptoide.accountmanager.Account;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.actions.PermissionManager;
import p015cm.aptoide.p016pt.actions.PermissionService;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.home.apps.App;
import p015cm.aptoide.p016pt.home.apps.model.StateApp;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.view.p031rx.RxAlertDialog;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.exceptions.OnErrorNotImplementedException;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.home.apps.AppsPresenter */
public class AppsPresenter implements Presenter {
    private final AptoideAccountManager accountManager;
    private final AppsManager appsManager;
    private final AppsNavigator appsNavigator;
    private final CrashReport crashReport;
    private final C5373h ioScheduler;
    private final PermissionManager permissionManager;
    private final PermissionService permissionService;
    private final AppsFragmentView view;
    private final C5373h viewScheduler;

    public AppsPresenter(AppsFragmentView appsFragmentView, AppsManager appsManager2, C5373h hVar, C5373h hVar2, CrashReport crashReport2, PermissionManager permissionManager2, PermissionService permissionService2, AptoideAccountManager aptoideAccountManager, AppsNavigator appsNavigator2) {
        this.view = appsFragmentView;
        this.appsManager = appsManager2;
        this.viewScheduler = hVar;
        this.ioScheduler = hVar2;
        this.crashReport = crashReport2;
        this.permissionManager = permissionManager2;
        this.permissionService = permissionService2;
        this.accountManager = aptoideAccountManager;
        this.appsNavigator = appsNavigator2;
    }

    /* renamed from: B */
    static /* synthetic */ Boolean m6139B(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: a */
    static /* synthetic */ void m6141a(AppsModel appsModel) {
    }

    /* renamed from: a */
    static /* synthetic */ void m6142a(List list) {
    }

    /* renamed from: b */
    static /* synthetic */ void m6143b(Integer num) {
    }

    /* renamed from: b */
    static /* synthetic */ void m6144b(String str) {
    }

    /* renamed from: e */
    static /* synthetic */ void m6145e(App app) {
    }

    /* renamed from: f */
    static /* synthetic */ void m6146f(App app) {
    }

    /* renamed from: g */
    static /* synthetic */ void m6147g(App app) {
    }

    /* renamed from: g */
    static /* synthetic */ void m6148g(Void voidR) {
    }

    private C5368e<AppsModel> getAppsModel() {
        return C5368e.m10246a(this.appsManager.getDownloadApps(), this.appsManager.getInstalledApps(), this.appsManager.getUpdatesList(), C2727a1.f5560a);
    }

    /* access modifiers changed from: private */
    /* renamed from: getUserAvatar */
    public C5368e<String> mo11928a(Account account) {
        return C5368e.m10257c((account == null || !account.isLoggedIn()) ? null : account.getAvatar());
    }

    /* renamed from: h */
    static /* synthetic */ void m6149h(App app) {
    }

    /* renamed from: h */
    static /* synthetic */ void m6150h(Void voidR) {
    }

    private void handleBottomNavigationEvents() {
        this.view.getLifecycleEvent().mo18681d(C2822s2.f5671f).mo18687f(new C2741c3(this)).mo18644a(this.viewScheduler).mo18664b(new C2767h3(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C2852y2.f5704f, (C5378b<Throwable>) C2821s1.f5670f);
    }

    private void handleCancelDownloadClick() {
        this.view.getLifecycleEvent().mo18681d(C2806p1.f5654f).mo18644a(this.viewScheduler).mo18687f(new C2756f2(this)).mo18644a(this.viewScheduler).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C2780k1.f5619f, (C5378b<Throwable>) new C2817r2(this));
    }

    private void handleCardClick() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C2812q2.f5660f).mo18644a(this.viewScheduler).mo18687f(new C2757f3(this)).mo18664b(new C2856z1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2781k2 k2Var = C2781k2.f5620f;
        CrashReport crashReport2 = this.crashReport;
        crashReport2.getClass();
        a.mo18655a((C5378b<? super R>) k2Var, (C5378b<Throwable>) new C2731b(crashReport2));
    }

    private void handleInstallAppClick() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C2836v1.f5687f).mo18644a(this.viewScheduler).mo18687f(new C2770i1(this)).mo18644a(this.ioScheduler);
        AppsManager appsManager2 = this.appsManager;
        appsManager2.getClass();
        a.mo18689g((C5379n<? super R, ? extends C5328b>) new C2818r3(appsManager2)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C2777j3.f5616f, (C5378b<Throwable>) new C2811q1(this));
    }

    private void handleOutOfSpaceAnalytics() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C2807p2.f5655f).mo18687f(new C2782k3(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2798n3 n3Var = C2798n3.f5641f;
        CrashReport crashReport2 = this.crashReport;
        crashReport2.getClass();
        a.mo18655a((C5378b<? super R>) n3Var, (C5378b<Throwable>) new C2731b(crashReport2));
    }

    private void handlePauseDownloadClick() {
        this.view.getLifecycleEvent().mo18681d(C2745d1.f5580f).mo18644a(this.viewScheduler).mo18687f(new C2793m3(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C2816r1.f5664f, (C5378b<Throwable>) new C2762g3(this));
    }

    private void handleRefreshApps() {
        this.view.getLifecycleEvent().mo18681d(C2734b2.f5567f).mo18687f(new C2785l1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(new C2772i3(this), (C5378b<Throwable>) new C2851y1(this));
    }

    private void handleResumeClick() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C2826t1.f5675f).mo18644a(this.viewScheduler).mo18687f(new C2802o2(this)).mo18644a(this.ioScheduler).mo18689g(new C2846x1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2761g2 g2Var = C2761g2.f5598f;
        CrashReport crashReport2 = this.crashReport;
        crashReport2.getClass();
        a.mo18655a((C5378b<? super R>) g2Var, (C5378b<Throwable>) new C2731b(crashReport2));
    }

    private void handleStartDownloadClick() {
        this.view.getLifecycleEvent().mo18681d(C2796n1.f5639f).mo18644a(this.viewScheduler).mo18687f(new C2735b3(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C2746d2.f5581f, (C5378b<Throwable>) new C2857z2(this));
    }

    private void handleUpdateAllClick() {
        this.view.getLifecycleEvent().mo18681d(C2751e2.f5587f).mo18644a(this.viewScheduler).mo18687f(new C2739c1(this)).mo18644a(this.ioScheduler).mo18689g(new C2845x0(this)).mo18644a(this.viewScheduler).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C2750e1.f5586f, (C5378b<Throwable>) new C2728a2(this));
    }

    private void handleUpdateCardLongClick() {
        this.view.getLifecycleEvent().mo18681d(C2842w2.f5693f).mo18644a(this.viewScheduler).mo18687f(new C2755f1(this)).mo18689g(new C2729a3(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C2792m2.f5633f, (C5378b<Throwable>) new C2765h1(this));
    }

    private void handleUserAvatarClick() {
        this.view.getLifecycleEvent().mo18681d(C2776j2.f5615f).mo18687f(new C2801o1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C2740c2.f5575f, (C5378b<Throwable>) C2847x2.f5699f);
    }

    /* renamed from: i */
    static /* synthetic */ void m6151i(App app) {
    }

    /* renamed from: i */
    static /* synthetic */ void m6152i(Void voidR) {
    }

    /* renamed from: j */
    static /* synthetic */ void m6153j(App app) {
    }

    /* renamed from: j */
    static /* synthetic */ void m6154j(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: l */
    static /* synthetic */ void m6156l(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    private void loadUserImage() {
        this.view.getLifecycleEvent().mo18681d(C2808p3.f5656f).mo18687f(new C2850y0(this)).mo18687f(new C2766h2(this)).mo18644a(this.viewScheduler).mo18664b(new C2760g1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C2827t2.f5676f, (C5378b<Throwable>) C2791m1.f5632f);
    }

    private void observeAppModelState() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C2841w1.f5692f).mo18644a(this.ioScheduler).mo18687f(new C2832u2(this)).mo18644a(this.viewScheduler);
        AppsFragmentView appsFragmentView = this.view;
        appsFragmentView.getClass();
        a.mo18664b((C5378b<? super R>) new C2828t3(appsFragmentView)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C2733b1.f5566f, (C5378b<Throwable>) new C2855z0(this));
    }

    /* renamed from: p */
    static /* synthetic */ Boolean m6158p(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: q */
    static /* synthetic */ Boolean m6159q(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: r */
    static /* synthetic */ Boolean m6160r(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: s */
    static /* synthetic */ Boolean m6161s(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: t */
    static /* synthetic */ Boolean m6162t(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: u */
    static /* synthetic */ Boolean m6163u(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: v */
    static /* synthetic */ Boolean m6164v(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: w */
    static /* synthetic */ Boolean m6165w(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: x */
    static /* synthetic */ Boolean m6166x(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: y */
    static /* synthetic */ Boolean m6167y(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo11927a(Void voidR) {
        return this.appsManager.refreshAllUpdates().mo18588a(this.viewScheduler).mo18589a((C5377a) new C2787l3(this)).mo18590a((C5378b<? super Throwable>) new C2775j1(this));
    }

    /* renamed from: b */
    public /* synthetic */ void mo11940b(Void voidR) {
        this.view.hidePullToRefresh();
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo11942c(View.LifecycleEvent lifecycleEvent) {
        return this.view.cardClick();
    }

    /* renamed from: d */
    public /* synthetic */ void mo11948d(Throwable th) {
        this.view.hidePullToRefresh();
        th.printStackTrace();
    }

    /* renamed from: e */
    public /* synthetic */ C5368e mo11950e(View.LifecycleEvent lifecycleEvent) {
        return this.appsManager.observeOutOfSpaceApps();
    }

    /* renamed from: f */
    public /* synthetic */ void mo11953f(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: g */
    public /* synthetic */ C5368e mo11955g(View.LifecycleEvent lifecycleEvent) {
        return this.view.refreshApps().mo18644a(this.ioScheduler).mo18689g(new C2771i2(this)).mo18686f();
    }

    /* renamed from: h */
    public /* synthetic */ void mo11958h(Throwable th) {
        this.view.showUnknownErrorMessage();
        this.crashReport.log(th);
    }

    /* renamed from: i */
    public /* synthetic */ C5368e mo11959i(View.LifecycleEvent lifecycleEvent) {
        return this.view.startDownload().mo18687f(new C2797n2(this)).mo18686f();
    }

    /* renamed from: k */
    public /* synthetic */ C5368e mo11962k(View.LifecycleEvent lifecycleEvent) {
        return this.view.updateLongClick();
    }

    /* renamed from: m */
    public /* synthetic */ C5368e mo11964m(View.LifecycleEvent lifecycleEvent) {
        return this.accountManager.accountStatus();
    }

    /* renamed from: n */
    public /* synthetic */ C5368e mo11965n(View.LifecycleEvent lifecycleEvent) {
        return getAppsModel();
    }

    public void present() {
        observeAppModelState();
        handlePauseDownloadClick();
        handleResumeClick();
        handleCancelDownloadClick();
        handleInstallAppClick();
        handleUpdateAllClick();
        handleStartDownloadClick();
        handleCardClick();
        handleUpdateCardLongClick();
        loadUserImage();
        handleUserAvatarClick();
        handleBottomNavigationEvents();
        handleRefreshApps();
        handleOutOfSpaceAnalytics();
    }

    /* renamed from: k */
    static /* synthetic */ void m6155k(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: b */
    public /* synthetic */ C5328b mo11936b(App app) {
        return this.appsManager.resumeDownload(app, app.getType().toString());
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo11941c(App app) {
        return this.permissionManager.requestExternalStoragePermission(this.permissionService).mo18687f(new C2837v2(this)).mo18687f(new C2752e3(this)).mo18644a(this.ioScheduler).mo18689g(new C2786l2(this, app));
    }

    /* renamed from: e */
    public /* synthetic */ void mo11951e(Throwable th) {
        this.view.hidePullToRefresh();
        this.crashReport.log(th);
    }

    /* renamed from: f */
    public /* synthetic */ C5368e mo11952f(View.LifecycleEvent lifecycleEvent) {
        C5368e<App> a = this.view.pauseDownload().mo18644a(this.ioScheduler);
        AppsManager appsManager2 = this.appsManager;
        appsManager2.getClass();
        return a.mo18689g((C5379n<? super App, ? extends C5328b>) new C2725a(appsManager2)).mo18686f();
    }

    /* renamed from: j */
    public /* synthetic */ C5368e mo11961j(View.LifecycleEvent lifecycleEvent) {
        return this.view.updateAll().mo18687f(new C2813q3(this)).mo18686f();
    }

    /* renamed from: l */
    public /* synthetic */ C5368e mo11963l(View.LifecycleEvent lifecycleEvent) {
        return this.view.imageClick().mo18644a(this.viewScheduler).mo18664b(new C2803o3(this)).mo18686f();
    }

    /* renamed from: d */
    public /* synthetic */ C5328b mo11945d(App app) {
        return this.view.showIgnoreUpdateDialog().mo18566b(new C2747d3(this, app));
    }

    /* renamed from: h */
    public /* synthetic */ C5368e mo11957h(View.LifecycleEvent lifecycleEvent) {
        return this.view.resumeDownload();
    }

    /* renamed from: e */
    public /* synthetic */ C5328b mo11949e(Void voidR) {
        return this.appsManager.updateAll();
    }

    /* renamed from: i */
    public /* synthetic */ void mo11960i(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: a */
    public /* synthetic */ void mo11930a() {
        this.view.hidePullToRefresh();
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo11938b(Boolean bool) {
        return this.permissionManager.requestDownloadAccess(this.permissionService);
    }

    /* renamed from: d */
    public /* synthetic */ C5368e mo11947d(Void voidR) {
        return this.permissionManager.requestExternalStoragePermission(this.permissionService);
    }

    /* renamed from: g */
    public /* synthetic */ void mo11956g(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: a */
    public /* synthetic */ void mo11931a(App app) {
        if (app.getType() == App.Type.DOWNLOAD || app.getType() == App.Type.UPDATE) {
            this.appsManager.setAppViewAnalyticsEvent();
        }
        this.appsNavigator.navigateToAppView(((StateApp) app).getMd5());
    }

    /* renamed from: b */
    public /* synthetic */ void mo11939b(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: d */
    public /* synthetic */ C5368e mo11946d(View.LifecycleEvent lifecycleEvent) {
        return this.view.installApp();
    }

    /* renamed from: f */
    public /* synthetic */ void mo11954f(Void voidR) {
        this.appsNavigator.navigateToMyAccount();
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo11937b(View.LifecycleEvent lifecycleEvent) {
        C5368e<App> a = this.view.cancelDownload().mo18644a(this.ioScheduler);
        AppsManager appsManager2 = this.appsManager;
        appsManager2.getClass();
        return a.mo18689g((C5379n<? super App, ? extends C5328b>) new C2730a4(appsManager2)).mo18686f();
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo11943c(Void voidR) {
        if (this.appsManager.showWarning()) {
            return this.view.showRootWarning().mo18664b(new C2831u1(this));
        }
        return C5368e.m10257c(true);
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo11925a(App app, RxAlertDialog.Result result) {
        if (result == RxAlertDialog.Result.POSITIVE) {
            return this.appsManager.excludeUpdate(app);
        }
        return C5328b.m10170f();
    }

    /* renamed from: c */
    public /* synthetic */ void mo11944c(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: a */
    public /* synthetic */ void mo11932a(Boolean bool) {
        this.appsManager.storeRootAnswer(bool.booleanValue());
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo11926a(App app, Void voidR) {
        return this.appsManager.updateApp(app);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo11929a(View.LifecycleEvent lifecycleEvent) {
        return this.appsNavigator.bottomNavigation();
    }

    /* renamed from: a */
    public /* synthetic */ void mo11933a(Integer num) {
        this.view.scrollToTop();
    }

    /* renamed from: a */
    public /* synthetic */ void mo11935a(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: a */
    static /* synthetic */ AppsModel m6140a(List list, List list2, List list3) {
        return new AppsModel(list3, list2, list);
    }

    /* renamed from: a */
    public /* synthetic */ void mo11934a(String str) {
        if (str != null) {
            this.view.setUserImage(str);
        } else {
            this.view.setDefaultUserImage();
        }
        this.view.showAvatar();
    }
}
