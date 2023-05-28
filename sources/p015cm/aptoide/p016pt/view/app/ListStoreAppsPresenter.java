package p015cm.aptoide.p016pt.view.app;

import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.view.app.AppsList;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.Single;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.view.app.ListStoreAppsPresenter */
public class ListStoreAppsPresenter implements Presenter {
    private final AppCenter appCenter;
    private final CrashReport crashReport;
    private final int limit;
    private final ListStoreAppsNavigator navigator;
    private final long storeId;
    private final ListStoreAppsView view;
    private final C5373h viewScheduler;

    /* renamed from: cm.aptoide.pt.view.app.ListStoreAppsPresenter$1 */
    static /* synthetic */ class C45021 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$view$app$AppsList$Error;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                cm.aptoide.pt.view.app.AppsList$Error[] r0 = p015cm.aptoide.p016pt.view.app.AppsList.Error.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$cm$aptoide$pt$view$app$AppsList$Error = r0
                cm.aptoide.pt.view.app.AppsList$Error r1 = p015cm.aptoide.p016pt.view.app.AppsList.Error.NETWORK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$cm$aptoide$pt$view$app$AppsList$Error     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.view.app.AppsList$Error r1 = p015cm.aptoide.p016pt.view.app.AppsList.Error.GENERIC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.view.app.ListStoreAppsPresenter.C45021.<clinit>():void");
        }
    }

    public ListStoreAppsPresenter(ListStoreAppsView listStoreAppsView, long j, C5373h hVar, AppCenter appCenter2, CrashReport crashReport2, ListStoreAppsNavigator listStoreAppsNavigator, int i) {
        this.view = listStoreAppsView;
        this.storeId = j;
        this.viewScheduler = hVar;
        this.appCenter = appCenter2;
        this.crashReport = crashReport2;
        this.navigator = listStoreAppsNavigator;
        this.limit = i;
    }

    /* renamed from: b */
    static /* synthetic */ void m7600b(Application application) {
    }

    /* renamed from: d */
    static /* synthetic */ void m7601d(AppsList appsList) {
    }

    /* renamed from: e */
    static /* synthetic */ void m7602e(AppsList appsList) {
    }

    /* renamed from: f */
    static /* synthetic */ void m7604f(AppsList appsList) {
    }

    /* renamed from: g */
    static /* synthetic */ void m7606g(AppsList appsList) {
    }

    private Single<AppsList> getApps() {
        return this.appCenter.getApps(this.storeId, this.limit).mo18556a(this.viewScheduler).mo18564b(new C4532h1(this));
    }

    private void handleError(AppsList.Error error) {
        int i = C45021.$SwitchMap$cm$aptoide$pt$view$app$AppsList$Error[error.ordinal()];
        if (i == 1) {
            this.view.showNetworkError();
        } else if (i == 2) {
            this.view.showGenericError();
        }
    }

    private Single<AppsList> loadFreshApps() {
        return this.appCenter.loadFreshApps(this.storeId, this.limit).mo18556a(this.viewScheduler).mo18564b(new C4517d1(this));
    }

    private Single<AppsList> loadShowNextApps() {
        return this.appCenter.loadNextApps(this.storeId, this.limit).mo18556a(this.viewScheduler).mo18564b(new C4521e1(this));
    }

    private void onCreateHandleAppClicks() {
        this.view.getLifecycleEvent().mo18681d(C4565s1.f7799f).mo18687f(new C4535i1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C4574v1.f7809f, (C5378b<Throwable>) new C4506a2(this));
    }

    private void onCreateHandleBottomReached() {
        this.view.getLifecycleEvent().mo18681d(C4553o1.f7787f).mo18687f(new C4559q1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C4562r1.f7796f, (C5378b<Throwable>) new C4518d2(this));
    }

    private void onCreateHandleRefresh() {
        this.view.getLifecycleEvent().mo18681d(C4586z1.f7821f).mo18687f(new C4547m1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C4510b2.f7742f, (C5378b<Throwable>) new C4529g1(this));
    }

    private void onCreateHandleRetry() {
        this.view.getLifecycleEvent().mo18681d(C4571u1.f7806f).mo18687f(new C4556p1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C4522e2.f7754f, (C5378b<Throwable>) new C4550n1(this));
    }

    private void onCreateLoadApps() {
        this.view.getLifecycleEvent().mo18681d(C4583y1.f7818f).mo18692i(new C4544l1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C4525f1.f7757f, (C5378b<Throwable>) new C4514c2(this));
    }

    /* renamed from: a */
    public /* synthetic */ Single mo15475a(Void voidR) {
        return loadFreshApps();
    }

    /* renamed from: b */
    public /* synthetic */ void mo15485b(Void voidR) {
        this.view.showStartingLoading();
    }

    /* renamed from: c */
    public /* synthetic */ Single mo15486c(Void voidR) {
        return loadShowNextApps();
    }

    /* renamed from: d */
    public /* synthetic */ C5368e mo15490d(View.LifecycleEvent lifecycleEvent) {
        return this.view.getRetryEvent().mo18644a(this.viewScheduler).mo18664b(new C4538j1(this)).mo18692i(new C4526f2(this)).mo18686f();
    }

    /* renamed from: e */
    public /* synthetic */ Single mo15492e(View.LifecycleEvent lifecycleEvent) {
        return getApps();
    }

    public void present() {
        onCreateLoadApps();
        onCreateHandleAppClicks();
        onCreateHandleBottomReached();
        onCreateHandleRefresh();
        onCreateHandleRetry();
    }

    /* renamed from: a */
    public /* synthetic */ void mo15478a(AppsList appsList) {
        if (appsList.hasErrors()) {
            handleError(appsList.getError());
        } else if (!appsList.isLoading()) {
            this.view.setApps(appsList.getList());
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo15483b(AppsList appsList) {
        this.view.hideRefreshLoading();
        if (appsList.hasErrors()) {
            handleError(appsList.getError());
        } else if (!appsList.isLoading()) {
            this.view.setApps(appsList.getList());
        }
    }

    /* renamed from: c */
    public /* synthetic */ void mo15488c(AppsList appsList) {
        this.view.hideLoading();
        if (appsList.hasErrors()) {
            handleError(appsList.getError());
        } else if (!appsList.isLoading()) {
            this.view.addApps(appsList.getList());
        }
    }

    /* renamed from: e */
    public /* synthetic */ void mo15493e(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: a */
    public /* synthetic */ void mo15479a(Object obj) {
        this.view.showLoading();
    }

    /* renamed from: d */
    public /* synthetic */ void mo15491d(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo15476a(View.LifecycleEvent lifecycleEvent) {
        return this.view.getAppClick().mo18664b(new C4580x1(this));
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo15482b(View.LifecycleEvent lifecycleEvent) {
        return this.view.reachesBottom().mo18644a(this.viewScheduler).mo18664b(new C4577w1(this)).mo18692i(new C4568t1(this)).mo18686f();
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo15487c(View.LifecycleEvent lifecycleEvent) {
        return this.view.getRefreshEvent().mo18644a(this.viewScheduler).mo18692i(new C4541k1(this)).mo18686f();
    }

    /* renamed from: a */
    public /* synthetic */ void mo15477a(Application application) {
        this.navigator.navigateToAppView(application.getAppId(), application.getPackageName());
    }

    /* renamed from: a */
    public /* synthetic */ void mo15480a(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: c */
    public /* synthetic */ void mo15489c(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: b */
    public /* synthetic */ Single mo15481b(Object obj) {
        return loadShowNextApps();
    }

    /* renamed from: b */
    public /* synthetic */ void mo15484b(Throwable th) {
        this.crashReport.log(th);
    }
}
