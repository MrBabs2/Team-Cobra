package p015cm.aptoide.p016pt.app.view;

import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.home.ChipManager;
import p015cm.aptoide.p016pt.home.HomeAnalytics;
import p015cm.aptoide.p016pt.home.HomeNavigator;
import p015cm.aptoide.p016pt.home.bundles.HomeBundlesModel;
import p015cm.aptoide.p016pt.home.bundles.ads.AdMapper;
import p015cm.aptoide.p016pt.home.bundles.ads.SearchAdNavigationResult;
import p015cm.aptoide.p016pt.home.bundles.base.AppHomeEvent;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.view.BundleEvent;
import p015cm.aptoide.p016pt.view.app.Application;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.Single;
import p123rx.exceptions.OnErrorNotImplementedException;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.app.view.MoreBundlePresenter */
public class MoreBundlePresenter implements Presenter {
    private final AdMapper adMapper;
    private final BundleEvent bundleEvent;
    private final ChipManager chipManager;
    private final CrashReport crashReporter;
    private final HomeAnalytics homeAnalytics;
    private final HomeNavigator homeNavigator;
    private final MoreBundleManager moreBundleManager;
    private final MoreBundleView view;
    private final C5373h viewScheduler;

    /* renamed from: cm.aptoide.pt.app.view.MoreBundlePresenter$1 */
    static /* synthetic */ class C14381 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$home$bundles$HomeBundlesModel$Error;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                cm.aptoide.pt.home.bundles.HomeBundlesModel$Error[] r0 = p015cm.aptoide.p016pt.home.bundles.HomeBundlesModel.Error.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$cm$aptoide$pt$home$bundles$HomeBundlesModel$Error = r0
                cm.aptoide.pt.home.bundles.HomeBundlesModel$Error r1 = p015cm.aptoide.p016pt.home.bundles.HomeBundlesModel.Error.NETWORK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$cm$aptoide$pt$home$bundles$HomeBundlesModel$Error     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.home.bundles.HomeBundlesModel$Error r1 = p015cm.aptoide.p016pt.home.bundles.HomeBundlesModel.Error.GENERIC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.app.view.MoreBundlePresenter.C14381.<clinit>():void");
        }
    }

    public MoreBundlePresenter(MoreBundleView moreBundleView, MoreBundleManager moreBundleManager2, C5373h hVar, CrashReport crashReport, HomeNavigator homeNavigator2, AdMapper adMapper2, BundleEvent bundleEvent2, HomeAnalytics homeAnalytics2, ChipManager chipManager2) {
        this.view = moreBundleView;
        this.moreBundleManager = moreBundleManager2;
        this.viewScheduler = hVar;
        this.crashReporter = crashReport;
        this.homeNavigator = homeNavigator2;
        this.adMapper = adMapper2;
        this.bundleEvent = bundleEvent2;
        this.homeAnalytics = homeAnalytics2;
        this.chipManager = chipManager2;
    }

    /* renamed from: b */
    static /* synthetic */ void m5007b(SearchAdNavigationResult searchAdNavigationResult) {
    }

    /* renamed from: c */
    static /* synthetic */ void m5009c(AppHomeEvent appHomeEvent) {
    }

    /* renamed from: c */
    static /* synthetic */ void m5010c(HomeEvent homeEvent) {
    }

    /* renamed from: d */
    static /* synthetic */ void m5012d(HomeEvent homeEvent) {
    }

    /* renamed from: e */
    static /* synthetic */ void m5014e(HomeBundlesModel homeBundlesModel) {
    }

    /* renamed from: f */
    static /* synthetic */ void m5016f(HomeBundlesModel homeBundlesModel) {
    }

    /* renamed from: g */
    static /* synthetic */ void m5018g(HomeBundlesModel homeBundlesModel) {
    }

    /* renamed from: h */
    static /* synthetic */ void m5019h(HomeBundlesModel homeBundlesModel) {
    }

    private void handleError(HomeBundlesModel.Error error) {
        int i = C14381.$SwitchMap$cm$aptoide$pt$home$bundles$HomeBundlesModel$Error[error.ordinal()];
        if (i == 1) {
            this.view.showNetworkError();
        } else if (i == 2) {
            this.view.showGenericError();
        }
    }

    private Single<HomeBundlesModel> loadBundles() {
        return this.moreBundleManager.loadBundle(this.bundleEvent.getTitle(), this.bundleEvent.getAction()).mo18556a(this.viewScheduler).mo18564b(new C1880we(this));
    }

    private Single<HomeBundlesModel> loadFreshBundles() {
        return this.moreBundleManager.loadFreshBundles(this.bundleEvent.getTitle(), this.bundleEvent.getAction()).mo18556a(this.viewScheduler).mo18564b(new C1571fg(this));
    }

    private Single<HomeBundlesModel> loadNextBundles() {
        return this.moreBundleManager.loadNextBundles(this.bundleEvent.getTitle(), this.bundleEvent.getAction()).mo18556a(this.viewScheduler).mo18564b(new C1588gf(this));
    }

    /* renamed from: t */
    static /* synthetic */ void m5029t(View.LifecycleEvent lifecycleEvent) {
    }

    /* renamed from: a */
    public /* synthetic */ void mo7573a(AppHomeEvent appHomeEvent) {
        Application app = appHomeEvent.getApp();
        this.homeNavigator.navigateToAppView(app.getAppId(), app.getPackageName(), app.getTag());
    }

    /* renamed from: b */
    public /* synthetic */ void mo7578b(HomeBundlesModel homeBundlesModel) {
        if (homeBundlesModel.hasErrors()) {
            handleError(homeBundlesModel.getError());
        } else if (!homeBundlesModel.isLoading()) {
            this.view.showBundles(homeBundlesModel.getList());
            this.view.hideLoading();
        }
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo7583c(View.LifecycleEvent lifecycleEvent) {
        return this.view.reachesBottom().mo18681d(new C1624if(this)).mo18644a(this.viewScheduler).mo18664b(new C1696mf(this)).mo18692i(new C1768qf(this)).mo18664b(new C1552ef(this)).mo18686f();
    }

    /* renamed from: d */
    public /* synthetic */ C5368e mo7587d(View.LifecycleEvent lifecycleEvent) {
        C5368e<HomeEvent> b = this.view.bundleScrolled().mo18664b(new C1570ff(this));
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        return b.mo18649a((C5378b<? super Throwable>) new C1441a(crashReport)).mo18686f();
    }

    /* renamed from: e */
    public /* synthetic */ C5368e mo7589e(View.LifecycleEvent lifecycleEvent) {
        C5368e<HomeEvent> a = this.view.moreClicked().mo18664b(new C1607hg(this)).mo18644a(this.viewScheduler);
        HomeNavigator homeNavigator2 = this.homeNavigator;
        homeNavigator2.getClass();
        return a.mo18664b((C5378b<? super HomeEvent>) new C1902xg(homeNavigator2)).mo18686f();
    }

    /* renamed from: f */
    public /* synthetic */ C5368e mo7590f(View.LifecycleEvent lifecycleEvent) {
        return this.view.refreshes().mo18664b(new C1513dg(this)).mo18692i(new C1714nf(this)).mo18686f();
    }

    /* renamed from: g */
    public /* synthetic */ C5368e mo7591g(View.LifecycleEvent lifecycleEvent) {
        return this.view.retryClicked().mo18644a(this.viewScheduler).mo18664b(new C1589gg(this)).mo18692i(new C1642jf(this)).mo18686f();
    }

    /* renamed from: h */
    public /* synthetic */ void mo7592h(View.LifecycleEvent lifecycleEvent) {
        this.view.showLoading();
    }

    public void handleAdClick() {
        this.view.getLifecycleEvent().mo18681d(C1844ue.f4439f).mo18687f(new C1787rg(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1678lf.f4233f, (C5378b<Throwable>) C1786rf.f4367f);
    }

    public void handleAppClick() {
        this.view.getLifecycleEvent().mo18681d(C1458ag.f3964f).mo18687f(new C1679lg(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1862ve.f4459f, (C5378b<Throwable>) C1494cf.f4005f);
    }

    public void handleBottomReached() {
        this.view.getLifecycleEvent().mo18681d(C1606hf.f4148f).mo18687f(new C1863vf(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1918ye.f4520f, (C5378b<Throwable>) C1697mg.f4261f);
    }

    public void handleBundleScrolledRight() {
        this.view.getLifecycleEvent().mo18681d(C1625ig.f4173f).mo18687f(new C1477bg(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1936ze.f4541f, (C5378b<Throwable>) C1553eg.f4077f);
    }

    public void handleMoreClick() {
        this.view.getLifecycleEvent().mo18681d(C1901xf.f4502f).mo18687f(new C1732of(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1807sf.f4395f, (C5378b<Throwable>) C1769qg.f4346f);
    }

    public void handlePullToRefresh() {
        this.view.getLifecycleEvent().mo18681d(C1919yf.f4521f).mo18687f(new C1827tf(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1457af.f3963f, (C5378b<Throwable>) C1881wf.f4482f);
    }

    public void handleRetryClick() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C1495cg.f4006f).mo18687f(new C1733og(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C1660kf kfVar = C1660kf.f4212f;
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        a.mo18655a((C5378b<? super R>) kfVar, (C5378b<Throwable>) new C1441a(crashReport));
    }

    /* renamed from: i */
    public /* synthetic */ Single mo7600i(View.LifecycleEvent lifecycleEvent) {
        return loadBundles();
    }

    /* renamed from: j */
    public /* synthetic */ void mo7601j(View.LifecycleEvent lifecycleEvent) {
        this.view.setToolbarInfo(this.bundleEvent.getTitle());
    }

    public void onCreateLoadBundles() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C1512df.f4029f).mo18644a(this.viewScheduler).mo18664b(new C1715ng(this)).mo18692i(new C1476bf(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C1661kg kgVar = C1661kg.f4213f;
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        a.mo18655a((C5378b<? super R>) kgVar, (C5378b<Throwable>) new C1441a(crashReport));
    }

    public void onCreateSetupToolbar() {
        C5368e<View.LifecycleEvent> b = this.view.getLifecycleEvent().mo18681d(C1937zf.f4542f).mo18644a(this.viewScheduler).mo18664b(new C1845uf(this));
        C1751pg pgVar = C1751pg.f4325f;
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        b.mo18655a((C5378b<? super View.LifecycleEvent>) pgVar, (C5378b<Throwable>) new C1441a(crashReport));
    }

    public void present() {
        onCreateSetupToolbar();
        onCreateLoadBundles();
        handleAppClick();
        handleAdClick();
        handleMoreClick();
        handleBottomReached();
        handlePullToRefresh();
        handleRetryClick();
        handleBundleScrolledRight();
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo7570a(View.LifecycleEvent lifecycleEvent) {
        C5368e<R> j = this.view.adClicked().mo18694j(C1511de.f4028f);
        AdMapper adMapper2 = this.adMapper;
        adMapper2.getClass();
        return j.mo18694j(new C1938zg(adMapper2)).mo18644a(this.viewScheduler).mo18664b(new C1750pf(this)).mo18686f();
    }

    /* renamed from: d */
    static /* synthetic */ void m5013d(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: f */
    static /* synthetic */ void m5017f(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: e */
    static /* synthetic */ void m5015e(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo7577b(View.LifecycleEvent lifecycleEvent) {
        return this.view.appClicked().mo18664b(new C1900xe(this)).mo18644a(this.viewScheduler).mo18664b(new C1643jg(this)).mo18686f();
    }

    /* renamed from: d */
    public /* synthetic */ void mo7588d(HomeBundlesModel homeBundlesModel) {
        if (homeBundlesModel.hasErrors()) {
            handleError(homeBundlesModel.getError());
        } else if (!homeBundlesModel.isLoading()) {
            this.view.showMoreHomeBundles(homeBundlesModel.getList());
            this.view.hideLoading();
        }
        this.view.hideShowMore();
    }

    /* renamed from: c */
    public /* synthetic */ Single mo7582c(Object obj) {
        return loadNextBundles();
    }

    /* renamed from: c */
    static /* synthetic */ void m5011c(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7572a(SearchAdNavigationResult searchAdNavigationResult) {
        this.homeNavigator.navigateToAppView(searchAdNavigationResult.getTag(), searchAdNavigationResult.getSearchAdResult());
    }

    /* renamed from: c */
    public /* synthetic */ void mo7584c(HomeBundlesModel homeBundlesModel) {
        this.view.hideRefresh();
        if (homeBundlesModel.hasErrors()) {
            handleError(homeBundlesModel.getError());
        } else if (!homeBundlesModel.isLoading()) {
            this.view.showBundles(homeBundlesModel.getList());
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo7579b(AppHomeEvent appHomeEvent) {
        ChipManager.Chip currentChip = this.chipManager.getCurrentChip();
        this.homeAnalytics.sendTapOnAppInteractEvent((double) appHomeEvent.getApp().getRating(), appHomeEvent.getApp().getPackageName(), appHomeEvent.getAppPosition(), appHomeEvent.getBundlePosition(), appHomeEvent.getBundle().getTag(), appHomeEvent.getBundle().getContent().size(), currentChip != null ? currentChip.getName() : null);
        if (currentChip != null) {
            this.homeAnalytics.sendChipTapOnApp(appHomeEvent.getBundle().getTag(), appHomeEvent.getApp().getPackageName(), currentChip.getName());
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m5006a(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: d */
    public /* synthetic */ Single mo7586d(Void voidR) {
        return loadNextBundles();
    }

    /* renamed from: a */
    public /* synthetic */ void mo7574a(HomeEvent homeEvent) {
        this.homeAnalytics.sendScrollRightInteractEvent(homeEvent.getBundlePosition(), homeEvent.getBundle().getTag(), homeEvent.getBundle().getContent().size());
    }

    /* renamed from: c */
    public /* synthetic */ void mo7585c(Void voidR) {
        this.view.showLoading();
    }

    /* renamed from: a */
    public /* synthetic */ Boolean mo7569a(Object obj) {
        return Boolean.valueOf(this.moreBundleManager.hasMore(this.bundleEvent.getTitle()));
    }

    /* renamed from: a */
    public /* synthetic */ void mo7571a(HomeBundlesModel homeBundlesModel) {
        this.homeAnalytics.sendLoadMoreInteractEvent();
    }

    /* renamed from: a */
    public /* synthetic */ void mo7575a(Void voidR) {
        this.homeAnalytics.sendPullRefreshInteractEvent();
    }

    /* renamed from: b */
    static /* synthetic */ void m5008b(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: b */
    public /* synthetic */ void mo7580b(HomeEvent homeEvent) {
        ChipManager.Chip currentChip = this.chipManager.getCurrentChip();
        this.homeAnalytics.sendTapOnMoreInteractEvent(homeEvent.getBundlePosition(), homeEvent.getBundle().getTag(), homeEvent.getBundle().getContent().size(), currentChip != null ? currentChip.getName() : null);
        if (currentChip != null) {
            this.homeAnalytics.sendChipTapOnMore(homeEvent.getBundle().getTag(), currentChip.getName());
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo7581b(Object obj) {
        this.view.showLoadMore();
    }

    /* renamed from: b */
    public /* synthetic */ Single mo7576b(Void voidR) {
        return loadFreshBundles();
    }
}
