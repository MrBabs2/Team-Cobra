package p015cm.aptoide.p016pt.search.view;

import android.content.DialogInterface;
import android.view.MenuItem;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p015cm.aptoide.aptoideviews.filters.Filter;
import p015cm.aptoide.p016pt.app.view.screenshots.ScreenShotClickEvent;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationItem;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationMapper;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;
import p015cm.aptoide.p016pt.download.view.DownloadViewActionPresenter;
import p015cm.aptoide.p016pt.home.AptoideBottomNavigator;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.search.SearchManager;
import p015cm.aptoide.p016pt.search.SearchNavigator;
import p015cm.aptoide.p016pt.search.analytics.SearchAnalytics;
import p015cm.aptoide.p016pt.search.analytics.SearchSource;
import p015cm.aptoide.p016pt.search.model.SearchAppResultWrapper;
import p015cm.aptoide.p016pt.search.model.SearchQueryModel;
import p015cm.aptoide.p016pt.search.model.SearchResult;
import p015cm.aptoide.p016pt.search.model.Source;
import p015cm.aptoide.p016pt.search.suggestions.SearchQueryEvent;
import p015cm.aptoide.p016pt.search.suggestions.SearchSuggestionManager;
import p015cm.aptoide.p016pt.search.suggestions.TrendingManager;
import p015cm.aptoide.p016pt.search.view.SearchResultView;
import p050l.p075h.p083k.C5004d;
import p112n.p118g.p301a.p303b.p308c.p309a.C10691g;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.Single;
import p123rx.exceptions.OnErrorNotImplementedException;
import p123rx.p126m.C5378b;
import p123rx.schedulers.Schedulers;

/* renamed from: cm.aptoide.pt.search.view.SearchResultPresenter */
public class SearchResultPresenter implements Presenter {
    private static final String TAG = "cm.aptoide.pt.search.view.SearchResultPresenter";
    private final SearchAnalytics analytics;
    private final BottomNavigationMapper bottomNavigationMapper;
    private final AptoideBottomNavigator bottomNavigator;
    private final CrashReport crashReport;
    private final DownloadViewActionPresenter downloadActionPresenter;
    private final C5373h ioScheduler;
    private final SearchNavigator navigator;
    private final SearchManager searchManager;
    private final SearchSuggestionManager suggestionManager;
    private final TrendingManager trendingManager;
    private final SearchResultView view;
    private final C5373h viewScheduler;

    public SearchResultPresenter(SearchResultView searchResultView, SearchAnalytics searchAnalytics, SearchNavigator searchNavigator, CrashReport crashReport2, C5373h hVar, SearchManager searchManager2, TrendingManager trendingManager2, SearchSuggestionManager searchSuggestionManager, AptoideBottomNavigator aptoideBottomNavigator, BottomNavigationMapper bottomNavigationMapper2, C5373h hVar2, DownloadViewActionPresenter downloadViewActionPresenter) {
        this.view = searchResultView;
        this.analytics = searchAnalytics;
        this.navigator = searchNavigator;
        this.crashReport = crashReport2;
        this.viewScheduler = hVar;
        this.searchManager = searchManager2;
        this.trendingManager = trendingManager2;
        this.suggestionManager = searchSuggestionManager;
        this.bottomNavigator = aptoideBottomNavigator;
        this.bottomNavigationMapper = bottomNavigationMapper2;
        this.ioScheduler = hVar2;
        this.downloadActionPresenter = downloadViewActionPresenter;
    }

    /* renamed from: S */
    static /* synthetic */ Boolean m7087S(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.RESUME);
    }

    /* renamed from: U */
    static /* synthetic */ Boolean m7089U(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: V */
    static /* synthetic */ Boolean m7090V(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.RESUME);
    }

    /* renamed from: b */
    static /* synthetic */ void m7095b(SearchAppResultWrapper searchAppResultWrapper) {
    }

    /* renamed from: b */
    static /* synthetic */ void m7096b(SearchResult searchResult) {
    }

    /* renamed from: b */
    static /* synthetic */ void m7097b(Object obj) {
    }

    /* renamed from: b */
    static /* synthetic */ void m7098b(C10691g gVar) {
    }

    /* renamed from: c */
    static /* synthetic */ void m7100c(DialogInterface dialogInterface) {
    }

    /* renamed from: c */
    static /* synthetic */ void m7101c(MenuItem menuItem) {
    }

    /* renamed from: c */
    static /* synthetic */ void m7102c(ScreenShotClickEvent screenShotClickEvent) {
    }

    /* renamed from: c */
    static /* synthetic */ void m7103c(C5004d dVar) {
    }

    /* renamed from: d */
    static /* synthetic */ void m7105d(DialogInterface dialogInterface) {
    }

    /* renamed from: d */
    static /* synthetic */ void m7106d(List list) {
    }

    /* renamed from: e */
    static /* synthetic */ Boolean m7107e(Boolean bool) {
        return bool;
    }

    /* renamed from: e */
    static /* synthetic */ void m7109e(List list) {
    }

    /* renamed from: f */
    static /* synthetic */ void m7110f(SearchQueryEvent searchQueryEvent) {
    }

    /* renamed from: f */
    static /* synthetic */ void m7111f(Boolean bool) {
    }

    /* renamed from: g */
    static /* synthetic */ void m7113g(Boolean bool) {
    }

    /* renamed from: g */
    static /* synthetic */ void m7114g(Integer num) {
    }

    private C5368e<SearchQueryEvent> getDebouncedQueryChanges() {
        return this.view.onQueryTextChanged().mo18634a(250, TimeUnit.MILLISECONDS);
    }

    /* renamed from: h */
    static /* synthetic */ void m7115h(SearchQueryEvent searchQueryEvent) {
    }

    /* renamed from: h */
    static /* synthetic */ void m7116h(Integer num) {
    }

    private void handleAdultContentDialogNegativeClick() {
        this.view.getLifecycleEvent().mo18681d(C4025b5.f7104f).mo18687f(new C4107k5(this)).mo18664b(new C4208w4(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C4087i4.f7167f, (C5378b<Throwable>) new C4030c1(this));
    }

    private void handleAdultContentDialogPositiveClick() {
        this.view.getLifecycleEvent().mo18681d(C4051e4.f7130f).mo18687f(new C4180t0(this)).mo18644a(Schedulers.m10352io()).mo18689g(new C4165r1(this)).mo18644a(this.viewScheduler).mo18649a((C5378b<? super Throwable>) new C4160q4(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C4159q3.f7242f, (C5378b<Throwable>) new C4190u2(this));
    }

    private void handleAdultContentDialogWithPinPositiveClick() {
        this.view.getLifecycleEvent().mo18681d(C4181t1.f7264f).mo18687f(new C4151p4(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C4167r3.f7250f, (C5378b<Throwable>) new C4225y5(this));
    }

    private void handleClickOnScreenshot() {
        this.view.getLifecycleEvent().mo18681d(C4173s1.f7256f).mo18687f(new C4056f0(this)).mo18681d(C4078h4.f7158f).mo18664b(new C4114l3(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C4133n4.f7216f, (C5378b<Throwable>) new C4108k6(this));
    }

    private void handleErrorRetryClick() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C4096j3.f7178f).mo18687f(new C4039d1(this)).mo18644a(this.viewScheduler).mo18694j(new C4057f1(this)).mo18689g(new C4129n0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C4223y3 y3Var = C4223y3.f7306f;
        CrashReport crashReport2 = this.crashReport;
        crashReport2.getClass();
        a.mo18655a((C5378b<? super R>) y3Var, (C5378b<Throwable>) new C4010a(crashReport2));
    }

    private void handleFiltersClick() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C4026b6.f7105f).mo18687f(new C4152p5(this)).mo18664b(new C4166r2(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C4094j1 j1Var = C4094j1.f7176f;
        CrashReport crashReport2 = this.crashReport;
        crashReport2.getClass();
        a.mo18655a((C5378b<? super R>) j1Var, (C5378b<Throwable>) new C4010a(crashReport2));
    }

    private void handleNewSearchResults() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C4196v0.f7279f).mo18694j(new C4125m5(this)).mo18687f(new C4142o4(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C4053e6 e6Var = C4053e6.f7132f;
        CrashReport crashReport2 = this.crashReport;
        crashReport2.getClass();
        a.mo18655a((C5378b<? super R>) e6Var, (C5378b<Throwable>) new C4010a(crashReport2));
    }

    private C5328b loadData(String str, String str2, List<Filter> list, boolean z) {
        if (str2 == null || str2.trim().equals("")) {
            return this.searchManager.searchAppInStores(str, list, z);
        }
        return this.searchManager.searchInStore(str, str2, list, z);
    }

    /* renamed from: m */
    static /* synthetic */ void m7117m(SearchResultView.Model model) {
    }

    /* renamed from: n */
    static /* synthetic */ void m7118n(SearchResultView.Model model) {
    }

    /* renamed from: n */
    static /* synthetic */ void m7119n(Void voidR) {
    }

    /* renamed from: o */
    static /* synthetic */ void m7120o(SearchResultView.Model model) {
    }

    /* renamed from: o */
    static /* synthetic */ void m7121o(Void voidR) {
    }

    /* access modifiers changed from: private */
    /* renamed from: openAppView */
    public void mo14393a(SearchAppResultWrapper searchAppResultWrapper) {
        String packageName = searchAppResultWrapper.getSearchAppResult().getPackageName();
        long appId = searchAppResultWrapper.getSearchAppResult().getAppId();
        String storeName = searchAppResultWrapper.getSearchAppResult().getStoreName();
        this.analytics.searchAppClick(this.view.getViewModel().getSearchQueryModel(), packageName, searchAppResultWrapper.getPosition(), searchAppResultWrapper.getSearchAppResult().isAppcApp());
        this.navigator.goToAppView(appId, packageName, this.view.getViewModel().getStoreTheme(), storeName);
    }

    /* renamed from: p */
    static /* synthetic */ void m7122p(SearchResultView.Model model) {
    }

    /* renamed from: p */
    static /* synthetic */ void m7123p(Void voidR) {
    }

    /* renamed from: q */
    static /* synthetic */ void m7124q(SearchResultView.Model model) {
    }

    /* renamed from: a */
    public /* synthetic */ void mo14394a(SearchResult searchResult) {
        this.view.addAllStoresResult(searchResult.getQuery(), searchResult.getSearchResultsList(), searchResult.isFreshResult(), searchResult.hasMore(), searchResult.hasError(), searchResult.getError());
    }

    /* renamed from: b */
    public /* synthetic */ SearchResultView.Model mo14401b(List list) {
        return this.view.getViewModel();
    }

    /* renamed from: c */
    public /* synthetic */ void mo14415c(SearchResultView.Model model) {
        this.view.getViewModel();
    }

    /* renamed from: d */
    public /* synthetic */ void mo14423d(SearchResultView.Model model) {
        this.view.showResultsLoading();
    }

    public void doFirstSearch() {
        this.view.getLifecycleEvent().mo18681d(C4112l1.f7195f).mo18694j(new C4182t2(this)).mo18689g(new C4188u0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C4177s5.f7260f, (C5378b<Throwable>) new C4076h2(this));
    }

    /* renamed from: e */
    public /* synthetic */ C5328b mo14429e(SearchResultView.Model model) {
        return loadData(model.getSearchQueryModel().getFinalQuery(), model.getStoreName(), model.getFilters(), false);
    }

    /* renamed from: f */
    public /* synthetic */ C5368e mo14433f(SearchResultView.Model model) {
        return this.searchManager.observeSearchResults().mo18644a(this.viewScheduler).mo18664b(new C4207w3(this)).mo18664b(new C4061f5(this, model));
    }

    public void focusInSearchBar() {
        this.view.getLifecycleEvent().mo18681d(C4049e2.f7128f).mo18687f(new C4021b1(this)).mo18669c().mo18681d(new C4183t3(this)).mo18644a(this.viewScheduler).mo18664b(new C4150p3(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C4113l2.f7196f, (C5378b<Throwable>) new C4038d0(this));
    }

    /* renamed from: g */
    public /* synthetic */ void mo14440g(SearchResultView.Model model) {
        this.view.showMoreLoading();
    }

    public void getTrendingOnStart() {
        this.view.getLifecycleEvent().mo18681d(C4083i0.f7163f).mo18687f(new C4232z4(this)).mo18692i(new C4229z1(this)).mo18686f().mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C4042d4.f7121f, (C5378b<Throwable>) new C4217x5(this));
    }

    /* renamed from: h */
    public /* synthetic */ C5328b mo14443h(SearchResultView.Model model) {
        return loadData(model.getSearchQueryModel().getFinalQuery(), model.getStoreName(), model.getFilters(), false);
    }

    public void handleClickOnAdultContentSwitch() {
        this.view.getLifecycleEvent().mo18681d(C4080h6.f7160f).mo18644a(this.viewScheduler).mo18687f(new C4147p0(this)).mo18644a(Schedulers.m10352io()).mo18687f(new C4079h5(this)).mo18644a(this.viewScheduler).mo18681d(C4043d5.f7122f).mo18687f(new C4176s4(this)).mo18664b(new C4048e1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C4085i2.f7165f, (C5378b<Throwable>) new C4214x2(this));
    }

    public void handleClickOnBottomNavWithResults() {
        this.view.getLifecycleEvent().mo18681d(C4228z0.f7311f).mo18687f(new C4024b4(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C4169r5.f7252f, (C5378b<Throwable>) C4130n1.f7213f);
    }

    public void handleClickOnBottomNavWithoutResults() {
        this.view.getLifecycleEvent().mo18681d(C4014a3.f7093f).mo18687f(new C4221y1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C4123m3.f7206f, (C5378b<Throwable>) C4185t5.f7268f);
    }

    public void handleClickToOpenAppViewFromItem() {
        this.view.getLifecycleEvent().mo18681d(C4138o0.f7221f).mo18644a(this.viewScheduler).mo18687f(new C4044d6(this)).mo18664b(new C4050e3(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C4161q5.f7244f, (C5378b<Throwable>) new C4131n2(this));
    }

    public void handleFragmentRestorationVisibility() {
        this.view.getLifecycleEvent().mo18681d(C4230z2.f7313f).mo18687f(new C4124m4(this)).mo18681d(new C4040d2(this)).mo18664b(new C4189u1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C4198v2.f7281f, (C5378b<Throwable>) new C4139o1(this));
    }

    public void handleQueryTextChanged() {
        this.view.getLifecycleEvent().mo18681d(C4111l0.f7194f).mo18687f(new C4168r4(this)).mo18669c().mo18687f(new C4140o2(this)).mo18681d(C4074h0.f7154f).mo18694j(C4033c4.f7112f).mo18664b(new C4134n5(this)).mo18692i(new C4200v4(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C4215x3.f7298f, (C5378b<Throwable>) new C4132n3(this));
    }

    public void handleQueryTextCleaned() {
        this.view.getLifecycleEvent().mo18681d(C4084i1.f7164f).mo18687f(new C4077h3(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C4204w0.f7287f, (C5378b<Throwable>) new C4184t4(this));
    }

    public void handleQueryTextSubmitted() {
        this.view.getLifecycleEvent().mo18681d(C4041d3.f7120f).mo18687f(new C4099j6(this)).mo18669c().mo18687f(new C4095j2(this)).mo18681d(C4120m0.f7203f).mo18644a(this.viewScheduler).mo18664b(new C4035c6(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C4089i6.f7169f, (C5378b<Throwable>) new C4075h1(this));
    }

    public void handleSearchListReachedBottom() {
        this.view.getLifecycleEvent().mo18681d(C4205w1.f7288f).mo18644a(this.viewScheduler).mo18687f(new C4193u5(this)).mo18694j(new C4212x0(this)).mo18644a(this.viewScheduler).mo18664b(new C4231z3(this)).mo18689g(new C4164r0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C4116l5.f7199f, (C5378b<Throwable>) new C4058f2(this));
    }

    public void handleSearchMenuItemClick() {
        this.view.getLifecycleEvent().mo18681d(C4068g3.f7148f).mo18687f(new C4015a4(this)).mo18664b(new C4098j5(this)).mo18664b(new C4105k3(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.PAUSE)).mo18655a(C4209w5.f7292f, (C5378b<Throwable>) new C4216x4(this));
    }

    public void handleSuggestionClicked() {
        this.view.getLifecycleEvent().mo18681d(C4206w2.f7289f).mo18687f(new C4069g4(this)).mo18681d(C4088i5.f7168f).mo18664b(new C4141o3(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C4067g2.f7147f, (C5378b<Throwable>) new C4143o5(this));
    }

    public void handleToolbarClick() {
        this.view.getLifecycleEvent().mo18681d(C4086i3.f7166f).mo18687f(new C4224y4(this)).mo18664b(new C4122m2(this)).mo18664b(new C4157q1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C4103k1.f7185f, (C5378b<Throwable>) new C4156q0(this));
    }

    public boolean hasValidQuery(SearchResultView.Model model) {
        return model.getSearchQueryModel() != null && !model.getSearchQueryModel().getFinalQuery().isEmpty();
    }

    /* renamed from: i */
    public /* synthetic */ SearchResultView.Model mo14460i(Void voidR) {
        return this.view.getViewModel();
    }

    /* renamed from: j */
    public /* synthetic */ C5368e mo14464j(View.LifecycleEvent lifecycleEvent) {
        return this.view.getScreenshotClickEvent();
    }

    /* renamed from: k */
    public /* synthetic */ void mo14470k(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: l */
    public /* synthetic */ C5368e mo14472l(View.LifecycleEvent lifecycleEvent) {
        return this.view.retryClicked();
    }

    public void listenToSearchQueries() {
        this.view.getLifecycleEvent().mo18681d(C4034c5.f7113f).mo18687f(new C4016a5(this)).mo18669c().mo18687f(new C4070g5(this)).mo18664b(new C4022b2(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C4012a1.f7091f, (C5378b<Throwable>) new C4032c3(this));
    }

    /* renamed from: m */
    public /* synthetic */ C5368e mo14477m(View.LifecycleEvent lifecycleEvent) {
        return this.view.filtersChangeEvents().mo18694j(new C4047e0(this)).mo18664b(new C4192u4(this)).mo18689g(new C4013a2(this)).mo18686f();
    }

    /* renamed from: n */
    public /* synthetic */ C5368e mo14480n(View.LifecycleEvent lifecycleEvent) {
        return this.view.searchSetup();
    }

    /* renamed from: o */
    public /* synthetic */ SearchResultView.Model mo14482o(View.LifecycleEvent lifecycleEvent) {
        return this.view.getViewModel();
    }

    /* renamed from: p */
    public /* synthetic */ C5368e mo14484p(View.LifecycleEvent lifecycleEvent) {
        return this.view.searchSetup();
    }

    public void present() {
        handleNewSearchResults();
        getTrendingOnStart();
        handleToolbarClick();
        handleSearchMenuItemClick();
        focusInSearchBar();
        handleSuggestionClicked();
        handleFragmentRestorationVisibility();
        doFirstSearch();
        handleClickToOpenAppViewFromItem();
        handleSearchListReachedBottom();
        handleQueryTextSubmitted();
        handleQueryTextChanged();
        handleQueryTextCleaned();
        handleClickOnBottomNavWithResults();
        handleClickOnBottomNavWithoutResults();
        handleErrorRetryClick();
        handleFiltersClick();
        handleClickOnScreenshot();
        listenToSearchQueries();
        handleClickOnAdultContentSwitch();
        handleAdultContentDialogPositiveClick();
        handleAdultContentDialogNegativeClick();
        handleAdultContentDialogWithPinPositiveClick();
        redoSearchAfterAdultContentSwitch();
        updateAdultContentSwitchOnNoResults();
        this.downloadActionPresenter.setContextParams(DownloadAnalytics.AppContext.SEARCH, false, (String) null);
        this.downloadActionPresenter.present(this.view.getDownloadClickEvents(), this.view);
    }

    /* renamed from: q */
    public /* synthetic */ void mo14487q(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: r */
    public /* synthetic */ C5368e mo14488r(View.LifecycleEvent lifecycleEvent) {
        return this.view.searchSetup();
    }

    public void redoSearchAfterAdultContentSwitch() {
        this.view.getLifecycleEvent().mo18681d(C4158q2.f7241f).mo18687f(new C4023b3(this)).mo18694j(new C4222y2(this)).mo18689g(new C4097j4(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C4104k2.f7186f, (C5378b<Throwable>) new C4062f6(this));
    }

    /* renamed from: s */
    public /* synthetic */ C5368e mo14491s(View.LifecycleEvent lifecycleEvent) {
        return this.view.searchResultsReachedBottom();
    }

    public C5328b search(SearchResultView.Model model, boolean z) {
        return C5368e.m10257c(model).mo18681d(new C4093j0(this)).mo18644a(this.viewScheduler).mo18664b(new C4174s2(this)).mo18664b(new C4115l4(this)).mo18644a(this.ioScheduler).mo18669c().mo18700m().mo18566b(new C4106k4(this, z));
    }

    /* renamed from: t */
    public /* synthetic */ void mo14495t(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: u */
    public /* synthetic */ C5368e mo14496u(View.LifecycleEvent lifecycleEvent) {
        return this.view.listenToSuggestionClick();
    }

    public void updateAdultContentSwitchOnNoResults() {
        this.view.getLifecycleEvent().mo18681d(C4175s3.f7258f).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18687f(new C4031c2(this)).mo18687f(new C4059f3(this)).mo18664b(new C4066g1(this)).mo18655a(C4172s0.f7255f, (C5378b<Throwable>) new C4017a6(this));
    }

    /* renamed from: v */
    public /* synthetic */ void mo14500v(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: w */
    public /* synthetic */ void mo14502w(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: x */
    public /* synthetic */ C5368e mo14503x(View.LifecycleEvent lifecycleEvent) {
        return C5368e.m10254b(this.view.adultContentDialogPositiveClick(), (C5368e<DialogInterface>) this.view.adultContentWithPinDialogPositiveClick());
    }

    /* renamed from: y */
    public /* synthetic */ C5368e mo14504y(View.LifecycleEvent lifecycleEvent) {
        return this.view.viewHasNoResults();
    }

    /* renamed from: y */
    static /* synthetic */ void m7126y(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: z */
    static /* synthetic */ Single m7128z(Throwable th) {
        if (th instanceof TimeoutException) {
            Logger.getInstance().mo12984i(TAG, "Timeout reached while waiting for application suggestions");
        }
        return Single.m10120a(th);
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo14413c(View.LifecycleEvent lifecycleEvent) {
        return this.view.searchSetup();
    }

    /* renamed from: d */
    public /* synthetic */ SearchResultView.Model mo14420d(Void voidR) {
        return this.view.getViewModel();
    }

    /* renamed from: g */
    public /* synthetic */ C5368e mo14438g(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickAdultContentSwitch();
    }

    /* renamed from: i */
    public /* synthetic */ void mo14463i(Throwable th) {
        this.view.enableAdultContent();
    }

    /* renamed from: j */
    public /* synthetic */ void mo14466j(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: k */
    public /* synthetic */ C5368e mo14469k(View.LifecycleEvent lifecycleEvent) {
        return this.view.onViewItemClicked();
    }

    /* renamed from: l */
    public /* synthetic */ void mo14475l(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: n */
    public /* synthetic */ void mo14481n(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: o */
    public /* synthetic */ void mo14483o(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: p */
    public /* synthetic */ void mo14485p(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: q */
    public /* synthetic */ C5368e mo14486q(View.LifecycleEvent lifecycleEvent) {
        return getDebouncedQueryChanges().mo18681d(new C4052e5(this)).mo18644a(this.viewScheduler).mo18664b(new C4220y0(this));
    }

    /* renamed from: r */
    public /* synthetic */ void mo14489r(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: s */
    public /* synthetic */ void mo14492s(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: t */
    public /* synthetic */ C5368e mo14494t(View.LifecycleEvent lifecycleEvent) {
        return this.view.searchMenuItemClick();
    }

    /* renamed from: u */
    public /* synthetic */ void mo14497u(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: v */
    public /* synthetic */ C5368e mo14499v(View.LifecycleEvent lifecycleEvent) {
        return this.view.toolbarClick();
    }

    /* renamed from: w */
    public /* synthetic */ C5368e mo14501w(View.LifecycleEvent lifecycleEvent) {
        return this.view.searchSetup();
    }

    /* renamed from: b */
    public /* synthetic */ C5328b mo14405b(SearchResultView.Model model) {
        return search(model, false);
    }

    /* renamed from: c */
    public /* synthetic */ Single mo14412c(Void voidR) {
        return this.trendingManager.getTrendingListSuggestions().mo18556a(this.viewScheduler).mo18564b(new C4121m1(this));
    }

    /* renamed from: d */
    public /* synthetic */ C5368e mo14422d(View.LifecycleEvent lifecycleEvent) {
        return C5368e.m10254b(this.view.adultContentPinDialogNegativeClick(), this.view.adultContentDialogNegativeClick());
    }

    /* renamed from: g */
    public /* synthetic */ void mo14441g(Throwable th) {
        if (th instanceof SecurityException) {
            this.view.showWrongPinErrorMessage();
        }
    }

    /* renamed from: i */
    public /* synthetic */ C5328b mo14461i(SearchResultView.Model model) {
        return search(model, false);
    }

    /* renamed from: j */
    public /* synthetic */ void mo14465j(SearchResultView.Model model) {
        this.view.showLoading();
    }

    /* renamed from: k */
    public /* synthetic */ Boolean mo14468k(SearchResultView.Model model) {
        return Boolean.valueOf(hasValidQuery(model));
    }

    /* renamed from: l */
    public /* synthetic */ void mo14474l(SearchResultView.Model model) {
        this.view.hideSuggestionsViews();
    }

    /* renamed from: x */
    static /* synthetic */ void m7125x(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: a */
    public /* synthetic */ void mo14395a(SearchResultView.Model model, SearchResult searchResult) {
        if (!searchResult.hasError() && searchResult.getSearchResultsList().size() == 0) {
            this.analytics.searchNoResults(model.getSearchQueryModel());
        }
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo14406b(View.LifecycleEvent lifecycleEvent) {
        return this.view.searchSetup();
    }

    /* renamed from: e */
    public /* synthetic */ Boolean mo14428e(Void voidR) {
        return Boolean.valueOf(!this.view.shouldFocusInSearchBar() && this.view.shouldShowSuggestions());
    }

    /* renamed from: h */
    public /* synthetic */ void mo14446h(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: i */
    public /* synthetic */ C5368e mo14462i(View.LifecycleEvent lifecycleEvent) {
        return this.bottomNavigator.navigationEvent().mo18681d(new C4065g0(this)).mo18644a(this.viewScheduler).mo18681d(new C4201v5(this)).mo18664b(new C4149p2(this)).mo18686f();
    }

    /* renamed from: j */
    public /* synthetic */ void mo14467j(Void voidR) {
        if (!this.view.shouldFocusInSearchBar()) {
            this.analytics.searchStart(SearchSource.SEARCH_TOOLBAR, true);
        }
    }

    /* renamed from: k */
    public /* synthetic */ void mo14471k(Void voidR) {
        this.view.focusInSearchBar();
    }

    /* renamed from: l */
    public /* synthetic */ C5368e mo14473l(Void voidR) {
        return this.view.queryChanged();
    }

    /* renamed from: b */
    public /* synthetic */ void mo14411b(Void voidR) {
        this.view.focusInSearchBar();
    }

    /* renamed from: e */
    public /* synthetic */ C5368e mo14430e(View.LifecycleEvent lifecycleEvent) {
        return this.view.adultContentDialogPositiveClick();
    }

    /* renamed from: f */
    public /* synthetic */ void mo14436f(Void voidR) {
        this.view.setVisibilityOnRestore();
    }

    /* renamed from: g */
    public /* synthetic */ C5368e mo14439g(Void voidR) {
        return getDebouncedQueryChanges();
    }

    /* renamed from: h */
    public /* synthetic */ C5368e mo14445h(Void voidR) {
        return getDebouncedQueryChanges();
    }

    /* renamed from: g */
    static /* synthetic */ Boolean m7112g(SearchQueryEvent searchQueryEvent) {
        return Boolean.valueOf(searchQueryEvent.hasQuery() && searchQueryEvent.isSubmitted());
    }

    /* renamed from: b */
    public /* synthetic */ void mo14410b(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: c */
    public /* synthetic */ void mo14418c(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: d */
    public /* synthetic */ void mo14425d(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: e */
    public /* synthetic */ void mo14431e(Throwable th) {
        this.view.disableAdultContent();
    }

    /* renamed from: f */
    public /* synthetic */ void mo14435f(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: h */
    public /* synthetic */ C5368e mo14444h(View.LifecycleEvent lifecycleEvent) {
        return this.bottomNavigator.navigationEvent().mo18681d(new C4199v3(this)).mo18644a(this.viewScheduler).mo18681d(new C4191u3(this)).mo18664b(new C4102k0(this)).mo18686f();
    }

    /* renamed from: m */
    public /* synthetic */ void mo14479m(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: c */
    static /* synthetic */ Boolean m7099c(Object obj) {
        return false;
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo14407b(Boolean bool) {
        return this.searchManager.isAdultContentPinRequired();
    }

    /* renamed from: d */
    public /* synthetic */ void mo14424d(Boolean bool) {
        this.view.setAdultContentSwitch(bool);
    }

    /* renamed from: f */
    public /* synthetic */ C5368e mo14432f(View.LifecycleEvent lifecycleEvent) {
        return this.view.adultContentWithPinDialogPositiveClick().mo18644a(Schedulers.m10352io()).mo18687f(new C4148p1(this)).mo18686f();
    }

    /* renamed from: m */
    public /* synthetic */ C5368e mo14478m(Void voidR) {
        return this.searchManager.isAdultContentEnabled();
    }

    /* renamed from: d */
    static /* synthetic */ Boolean m7104d(SearchQueryEvent searchQueryEvent) {
        return Boolean.valueOf(searchQueryEvent.hasQuery() && !searchQueryEvent.isSubmitted());
    }

    /* renamed from: a */
    public /* synthetic */ void mo14392a(ScreenShotClickEvent screenShotClickEvent) {
        this.navigator.navigateToScreenshots(screenShotClickEvent.getImagesUris(), screenShotClickEvent.getImagesIndex());
    }

    /* renamed from: b */
    public /* synthetic */ C5328b mo14404b(DialogInterface dialogInterface) {
        return this.searchManager.enableAdultContent();
    }

    /* renamed from: c */
    public /* synthetic */ void mo14416c(Boolean bool) {
        if (bool.booleanValue()) {
            this.view.showAdultContentConfirmationDialogWithPin();
        } else {
            this.view.showAdultContentConfirmationDialog();
        }
    }

    /* renamed from: e */
    public /* synthetic */ Boolean mo14427e(Integer num) {
        return Boolean.valueOf(!this.view.hasResults());
    }

    /* renamed from: a */
    public /* synthetic */ void mo14398a(List list) {
        this.view.setTrendingList(list);
    }

    /* renamed from: b */
    public /* synthetic */ void mo14409b(SearchQueryEvent searchQueryEvent) {
        this.view.clearUnsubmittedQuery();
        this.view.toggleTrendingView();
    }

    /* renamed from: d */
    public /* synthetic */ Boolean mo14421d(Integer num) {
        return Boolean.valueOf(this.bottomNavigationMapper.mapItemClicked(num).equals(BottomNavigationItem.SEARCH));
    }

    /* renamed from: a */
    public /* synthetic */ Boolean mo14385a(Void voidR) {
        return Boolean.valueOf(this.view.shouldFocusInSearchBar());
    }

    /* renamed from: b */
    public /* synthetic */ Single mo14403b(String str) {
        return this.suggestionManager.getSuggestionsForApp(str).mo18570e(C4071g6.f7151f).mo18556a(this.viewScheduler).mo18564b(new C4060f4(this));
    }

    /* renamed from: c */
    public /* synthetic */ void mo14419c(List list) {
        this.view.setSuggestionsList(list);
        this.view.toggleSuggestionsView();
    }

    /* renamed from: f */
    public /* synthetic */ void mo14434f(Integer num) {
        this.view.focusInSearchBar();
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo14388a(Boolean bool) {
        if (!bool.booleanValue()) {
            return this.searchManager.disableAdultContent().mo18588a(this.viewScheduler).mo18590a((C5378b<? super Throwable>) new C4197v1(this)).mo18610e().mo18694j(C4233z5.f7316f);
        }
        return C5368e.m10257c(true);
    }

    /* renamed from: c */
    public /* synthetic */ void mo14414c(SearchQueryEvent searchQueryEvent) {
        this.view.collapseSearchBar(false);
        this.view.hideSuggestionsViews();
        SearchQueryModel searchQueryModel = new SearchQueryModel(searchQueryEvent.getQuery());
        this.analytics.search(searchQueryModel);
        this.navigator.navigate(searchQueryModel);
    }

    /* renamed from: b */
    static /* synthetic */ Boolean m7094b(C5004d dVar) {
        return Boolean.valueOf(((SearchQueryEvent) dVar.f8863b).hasQuery() && ((SearchQueryEvent) dVar.f8863b).isSubmitted());
    }

    /* renamed from: b */
    public /* synthetic */ void mo14408b(MenuItem menuItem) {
        this.view.focusInSearchBar();
    }

    /* renamed from: b */
    public /* synthetic */ Boolean mo14402b(Integer num) {
        return Boolean.valueOf(this.view.hasResults());
    }

    /* renamed from: c */
    public /* synthetic */ void mo14417c(Integer num) {
        this.view.scrollToTop();
    }

    /* renamed from: a */
    public /* synthetic */ void mo14390a(DialogInterface dialogInterface) {
        this.view.disableAdultContent();
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo14389a(CharSequence charSequence) {
        return this.searchManager.enableAdultContentWithPin(charSequence.toString().isEmpty() ? 0 : Integer.valueOf(charSequence.toString()).intValue()).mo18610e().mo18644a(this.viewScheduler).mo18649a((C5378b<? super Throwable>) new C4213x1(this));
    }

    /* renamed from: a */
    public /* synthetic */ SearchResultView.Model mo14381a(View.LifecycleEvent lifecycleEvent) {
        return this.view.getViewModel();
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo14386a(SearchResultView.Model model) {
        return search(model, model.hasLoadedResults());
    }

    /* renamed from: a */
    public /* synthetic */ void mo14397a(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: a */
    public /* synthetic */ SearchResultView.Model mo14382a(Object obj) {
        return this.view.getViewModel();
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo14387a(boolean z, SearchResultView.Model model) {
        return loadData(model.getSearchQueryModel().getFinalQuery(), model.getStoreName(), model.getFilters(), z);
    }

    /* renamed from: a */
    public /* synthetic */ Boolean mo14383a(SearchQueryEvent searchQueryEvent) {
        return Boolean.valueOf(!searchQueryEvent.hasQuery() && this.view.isSearchViewExpanded());
    }

    /* renamed from: a */
    public /* synthetic */ void mo14396a(String str) {
        this.view.setUnsubmittedQuery(str);
    }

    /* renamed from: a */
    public /* synthetic */ void mo14399a(C5004d dVar) {
        this.view.collapseSearchBar(false);
        this.view.hideSuggestionsViews();
        SearchQueryModel searchQueryModel = new SearchQueryModel((String) dVar.f8862a, ((SearchQueryEvent) dVar.f8863b).getQuery(), ((String) dVar.f8862a).isEmpty() ? Source.FROM_TRENDING : Source.FROM_AUTOCOMPLETE);
        this.navigator.navigate(searchQueryModel);
        this.analytics.searchFromSuggestion(searchQueryModel, ((SearchQueryEvent) dVar.f8863b).getPosition());
    }

    /* renamed from: a */
    public /* synthetic */ void mo14391a(MenuItem menuItem) {
        if (!this.view.shouldFocusInSearchBar()) {
            this.analytics.searchStart(SearchSource.SEARCH_ICON, true);
        }
    }

    /* renamed from: a */
    public /* synthetic */ Boolean mo14384a(Integer num) {
        return Boolean.valueOf(this.bottomNavigationMapper.mapItemClicked(num).equals(BottomNavigationItem.SEARCH));
    }

    /* renamed from: a */
    public /* synthetic */ void mo14400a(C10691g gVar) {
        this.view.queryEvent(gVar);
    }
}
