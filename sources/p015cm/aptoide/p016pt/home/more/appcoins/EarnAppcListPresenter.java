package p015cm.aptoide.p016pt.home.more.appcoins;

import java.util.List;
import kotlin.C10220m;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.p016pt.actions.PermissionManager;
import p015cm.aptoide.p016pt.actions.PermissionService;
import p015cm.aptoide.p016pt.ads.MoPubAdsManager;
import p015cm.aptoide.p016pt.app.AppNavigator;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.home.bundles.apps.RewardApp;
import p015cm.aptoide.p016pt.home.more.base.ListAppsClickEvent;
import p015cm.aptoide.p016pt.home.more.base.ListAppsPresenter;
import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.promotions.WalletApp;
import p015cm.aptoide.p016pt.repository.request.RewardAppCoinsAppsRepository;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.p126m.C5378b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c¢\u0006\u0002\u0010\u001dJ\u001c\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020 0\u001f2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020$H\u0016J\u0016\u0010%\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020(H\u0016J\b\u0010)\u001a\u00020&H\u0002J\b\u0010*\u001a\u00020&H\u0016J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00020\"0\u001fH\u0002J\b\u0010,\u001a\u00020&H\u0002J\b\u0010-\u001a\u00020&H\u0002J\b\u0010.\u001a\u00020&H\u0002J\b\u0010/\u001a\u00020&H\u0002J\u0014\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020 0\u001fH\u0016J\b\u00101\u001a\u00020&H\u0002J\u000e\u00102\u001a\b\u0012\u0004\u0012\u0002030\u001fH\u0002J\u000e\u00104\u001a\b\u0012\u0004\u0012\u0002030\u001fH\u0002J\b\u00105\u001a\u00020&H\u0016J\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u000207H\u0002J\u0016\u00109\u001a\b\u0012\u0004\u0012\u0002030\u001f2\u0006\u0010:\u001a\u000203H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, mo16641d2 = {"Lcm/aptoide/pt/home/more/appcoins/EarnAppcListPresenter;", "Lcm/aptoide/pt/home/more/base/ListAppsPresenter;", "Lcm/aptoide/pt/home/bundles/apps/RewardApp;", "view", "Lcm/aptoide/pt/home/more/appcoins/EarnAppcListView;", "viewScheduler", "Lrx/Scheduler;", "crashReporter", "Lcm/aptoide/pt/crashreports/CrashReport;", "rewardAppsRepository", "Lcm/aptoide/pt/repository/request/RewardAppCoinsAppsRepository;", "analyticsManager", "Lcm/aptoide/analytics/AnalyticsManager;", "appNavigator", "Lcm/aptoide/pt/app/AppNavigator;", "earnAppcListConfiguration", "Lcm/aptoide/pt/home/more/appcoins/EarnAppcListConfiguration;", "earnAppcListManager", "Lcm/aptoide/pt/home/more/appcoins/EarnAppcListManager;", "permissionManager", "Lcm/aptoide/pt/actions/PermissionManager;", "permissionService", "Lcm/aptoide/pt/actions/PermissionService;", "moPubAdsManager", "Lcm/aptoide/pt/ads/MoPubAdsManager;", "earnAppcListAnalytics", "Lcm/aptoide/pt/home/more/appcoins/EarnAppcListAnalytics;", "earnAppcNavigator", "Lcm/aptoide/pt/home/more/appcoins/EarnAppcNavigator;", "(Lcm/aptoide/pt/home/more/appcoins/EarnAppcListView;Lrx/Scheduler;Lcm/aptoide/pt/crashreports/CrashReport;Lcm/aptoide/pt/repository/request/RewardAppCoinsAppsRepository;Lcm/aptoide/analytics/AnalyticsManager;Lcm/aptoide/pt/app/AppNavigator;Lcm/aptoide/pt/home/more/appcoins/EarnAppcListConfiguration;Lcm/aptoide/pt/home/more/appcoins/EarnAppcListManager;Lcm/aptoide/pt/actions/PermissionManager;Lcm/aptoide/pt/actions/PermissionService;Lcm/aptoide/pt/ads/MoPubAdsManager;Lcm/aptoide/pt/home/more/appcoins/EarnAppcListAnalytics;Lcm/aptoide/pt/home/more/appcoins/EarnAppcNavigator;)V", "getApps", "Lrx/Observable;", "", "refresh", "", "getTitle", "", "handleAppClick", "", "appClickEvent", "Lcm/aptoide/pt/home/more/base/ListAppsClickEvent;", "handleCancelDownload", "handleHeaderClick", "handleOnWalletInstalled", "handleOutOfSpaceDialogResult", "handlePauseDownload", "handleResumeDownload", "handleWalletInstallClick", "loadMoreApps", "loadWalletApp", "observeWalletDownloadError", "Lcm/aptoide/pt/promotions/WalletApp;", "observeWalletState", "present", "startWalletDownload", "Lrx/Completable;", "actionCompletable", "verifyNotEnoughSpaceError", "walletApp", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.appcoins.EarnAppcListPresenter */
/* compiled from: EarnAppcListPresenter.kt */
public final class EarnAppcListPresenter extends ListAppsPresenter<RewardApp> {
    private final AnalyticsManager analyticsManager;
    private final AppNavigator appNavigator;
    /* access modifiers changed from: private */
    public final CrashReport crashReporter;
    /* access modifiers changed from: private */
    public final EarnAppcListAnalytics earnAppcListAnalytics;
    private final EarnAppcListConfiguration earnAppcListConfiguration;
    /* access modifiers changed from: private */
    public final EarnAppcListManager earnAppcListManager;
    /* access modifiers changed from: private */
    public final EarnAppcNavigator earnAppcNavigator;
    private final MoPubAdsManager moPubAdsManager;
    /* access modifiers changed from: private */
    public final PermissionManager permissionManager;
    /* access modifiers changed from: private */
    public final PermissionService permissionService;
    private final RewardAppCoinsAppsRepository rewardAppsRepository;
    /* access modifiers changed from: private */
    public final EarnAppcListView view;
    /* access modifiers changed from: private */
    public final C5373h viewScheduler;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EarnAppcListPresenter(EarnAppcListView earnAppcListView, C5373h hVar, CrashReport crashReport, RewardAppCoinsAppsRepository rewardAppCoinsAppsRepository, AnalyticsManager analyticsManager2, AppNavigator appNavigator2, EarnAppcListConfiguration earnAppcListConfiguration2, EarnAppcListManager earnAppcListManager2, PermissionManager permissionManager2, PermissionService permissionService2, MoPubAdsManager moPubAdsManager2, EarnAppcListAnalytics earnAppcListAnalytics2, EarnAppcNavigator earnAppcNavigator2) {
        super(earnAppcListView, hVar, crashReport);
        C10202j.m34178b(earnAppcListView, "view");
        C10202j.m34178b(hVar, "viewScheduler");
        C10202j.m34178b(crashReport, "crashReporter");
        C10202j.m34178b(rewardAppCoinsAppsRepository, "rewardAppsRepository");
        C10202j.m34178b(analyticsManager2, "analyticsManager");
        C10202j.m34178b(appNavigator2, "appNavigator");
        C10202j.m34178b(earnAppcListConfiguration2, "earnAppcListConfiguration");
        C10202j.m34178b(earnAppcListManager2, "earnAppcListManager");
        C10202j.m34178b(permissionManager2, "permissionManager");
        C10202j.m34178b(permissionService2, "permissionService");
        C10202j.m34178b(moPubAdsManager2, "moPubAdsManager");
        C10202j.m34178b(earnAppcListAnalytics2, "earnAppcListAnalytics");
        C10202j.m34178b(earnAppcNavigator2, "earnAppcNavigator");
        this.view = earnAppcListView;
        this.viewScheduler = hVar;
        this.crashReporter = crashReport;
        this.rewardAppsRepository = rewardAppCoinsAppsRepository;
        this.analyticsManager = analyticsManager2;
        this.appNavigator = appNavigator2;
        this.earnAppcListConfiguration = earnAppcListConfiguration2;
        this.earnAppcListManager = earnAppcListManager2;
        this.permissionManager = permissionManager2;
        this.permissionService = permissionService2;
        this.moPubAdsManager = moPubAdsManager2;
        this.earnAppcListAnalytics = earnAppcListAnalytics2;
        this.earnAppcNavigator = earnAppcNavigator2;
    }

    private final void handleCancelDownload() {
        this.view.getLifecycleEvent().mo18681d(EarnAppcListPresenter$handleCancelDownload$1.INSTANCE).mo18687f(new EarnAppcListPresenter$handleCancelDownload$2(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(EarnAppcListPresenter$handleCancelDownload$3.INSTANCE, (C5378b<Throwable>) new EarnAppcListPresenter$handleCancelDownload$4(this));
    }

    /* access modifiers changed from: private */
    public final C5368e<Boolean> handleOnWalletInstalled() {
        C5368e<Boolean> b = this.earnAppcListManager.onWalletInstalled().mo18669c().mo18644a(this.viewScheduler).mo18664b(new EarnAppcListPresenter$handleOnWalletInstalled$1(this));
        C10202j.m34174a((Object) b, "earnAppcListManager.onWa…{ view.hideWalletArea() }");
        return b;
    }

    private final void handleOutOfSpaceDialogResult() {
        this.view.getLifecycleEvent().mo18681d(EarnAppcListPresenter$handleOutOfSpaceDialogResult$1.INSTANCE).mo18687f(new EarnAppcListPresenter$handleOutOfSpaceDialogResult$2(this)).mo18681d(EarnAppcListPresenter$handleOutOfSpaceDialogResult$3.INSTANCE).mo18689g(new EarnAppcListPresenter$handleOutOfSpaceDialogResult$4(this)).mo18686f().mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(EarnAppcListPresenter$handleOutOfSpaceDialogResult$5.INSTANCE, (C5378b<Throwable>) new EarnAppcListPresenter$handleOutOfSpaceDialogResult$6(this));
    }

    private final void handlePauseDownload() {
        this.view.getLifecycleEvent().mo18681d(EarnAppcListPresenter$handlePauseDownload$1.INSTANCE).mo18687f(new EarnAppcListPresenter$handlePauseDownload$2(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(EarnAppcListPresenter$handlePauseDownload$3.INSTANCE, (C5378b<Throwable>) new EarnAppcListPresenter$handlePauseDownload$4(this));
    }

    private final void handleResumeDownload() {
        this.view.getLifecycleEvent().mo18681d(EarnAppcListPresenter$handleResumeDownload$1.INSTANCE).mo18687f(new EarnAppcListPresenter$handleResumeDownload$2(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(EarnAppcListPresenter$handleResumeDownload$3.INSTANCE, (C5378b<Throwable>) new EarnAppcListPresenter$handleResumeDownload$4(this));
    }

    private final void handleWalletInstallClick() {
        this.view.getLifecycleEvent().mo18681d(EarnAppcListPresenter$handleWalletInstallClick$1.INSTANCE).mo18644a(this.viewScheduler).mo18687f(new EarnAppcListPresenter$handleWalletInstallClick$2(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(EarnAppcListPresenter$handleWalletInstallClick$3.INSTANCE, (C5378b<Throwable>) new EarnAppcListPresenter$handleWalletInstallClick$4(this));
    }

    private final void loadWalletApp() {
        this.view.getLifecycleEvent().mo18681d(EarnAppcListPresenter$loadWalletApp$1.INSTANCE).mo18687f(new EarnAppcListPresenter$loadWalletApp$2(this)).mo18669c().mo18644a(this.viewScheduler).mo18664b(new EarnAppcListPresenter$loadWalletApp$3(this)).mo18687f(new EarnAppcListPresenter$loadWalletApp$4(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(EarnAppcListPresenter$loadWalletApp$5.INSTANCE, (C5378b<Throwable>) new EarnAppcListPresenter$loadWalletApp$6(this));
    }

    /* access modifiers changed from: private */
    public final C5368e<WalletApp> observeWalletDownloadError() {
        C5368e<R> f = C5368e.m10254b(this.view.resumeDownload(), this.view.onWalletInstallClick()).mo18687f(new EarnAppcListPresenter$observeWalletDownloadError$1(this)).mo18687f(new EarnAppcListPresenter$observeWalletDownloadError$2(this)).mo18649a((C5378b<? super Throwable>) EarnAppcListPresenter$observeWalletDownloadError$3.INSTANCE).mo18686f();
        C10202j.m34174a((Object) f, "Observable.merge(view.re…race() }\n        .retry()");
        return f;
    }

    /* access modifiers changed from: private */
    public final C5368e<WalletApp> observeWalletState() {
        C5368e<R> a = this.earnAppcListManager.observeWalletApp().mo18687f(new EarnAppcListPresenter$observeWalletState$1(this)).mo18644a(this.viewScheduler).mo18664b(new EarnAppcListPresenter$observeWalletState$2(this)).mo18649a((C5378b<? super Throwable>) EarnAppcListPresenter$observeWalletState$3.INSTANCE);
        C10202j.m34174a((Object) a, "earnAppcListManager.obse… -> e.printStackTrace() }");
        return a;
    }

    /* access modifiers changed from: private */
    public final C5328b startWalletDownload(C5328b bVar) {
        C5328b k = C5368e.m10248a(new EarnAppcListPresenter$startWalletDownload$1(this)).mo18644a(this.viewScheduler).mo18687f(new EarnAppcListPresenter$startWalletDownload$2(this, bVar)).mo18696k();
        C10202j.m34174a((Object) k, "Observable.defer {\n     …        }.toCompletable()");
        return k;
    }

    /* access modifiers changed from: private */
    public final C5368e<WalletApp> verifyNotEnoughSpaceError(WalletApp walletApp) {
        DownloadModel downloadModel = walletApp.getDownloadModel();
        if (downloadModel != null && downloadModel.getDownloadState() == DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR) {
            this.moPubAdsManager.getAdsVisibilityStatus().mo18564b(new C3074x57c4922e(downloadModel, this, walletApp)).mo18567c().mo18694j(new EarnAppcListPresenter$verifyNotEnoughSpaceError$1$2(downloadModel));
        }
        C5368e<WalletApp> c = C5368e.m10257c(walletApp);
        C10202j.m34174a((Object) c, "Observable.just(walletApp)");
        return c;
    }

    public C5368e<List<RewardApp>> getApps(boolean z) {
        C5368e<List<RewardApp>> freshAppCoinsRewardAppsFromHomeMore = this.rewardAppsRepository.getFreshAppCoinsRewardAppsFromHomeMore("appcoins-ads");
        C10202j.m34174a((Object) freshAppCoinsRewardAppsFromHomeMore, "rewardAppsRepository.get…mHomeMore(\"appcoins-ads\")");
        return freshAppCoinsRewardAppsFromHomeMore;
    }

    public String getTitle() {
        String title = this.earnAppcListConfiguration.getTitle();
        return title != null ? title : "";
    }

    public void handleAppClick(ListAppsClickEvent<RewardApp> listAppsClickEvent) {
        C10202j.m34178b(listAppsClickEvent, "appClickEvent");
        RewardApp application = listAppsClickEvent.getApplication();
        this.analyticsManager.logEvent(listAppsClickEvent.getApplication().getClickUrl());
        AppNavigator appNavigator2 = this.appNavigator;
        long appId = application.getAppId();
        String packageName = application.getPackageName();
        String tag = this.earnAppcListConfiguration.getTag();
        String downloadUrl = application.getDownloadUrl();
        RewardApp.Reward reward = application.getReward();
        appNavigator2.navigateWithDownloadUrlAndReward(appId, packageName, tag, downloadUrl, reward != null ? (float) reward.getAppc() : -1.0f);
    }

    public void handleHeaderClick() {
        throw new C10220m("An operation is not implemented: " + "Not yet implemented");
    }

    public C5368e<List<RewardApp>> loadMoreApps() {
        C5368e<List<RewardApp>> nextAppCoinsRewardAppsFromHomeMore = this.rewardAppsRepository.getNextAppCoinsRewardAppsFromHomeMore("appcoins-ads");
        C10202j.m34174a((Object) nextAppCoinsRewardAppsFromHomeMore, "rewardAppsRepository.get…mHomeMore(\"appcoins-ads\")");
        return nextAppCoinsRewardAppsFromHomeMore;
    }

    public void present() {
        super.present();
        loadWalletApp();
        handleWalletInstallClick();
        handleResumeDownload();
        handlePauseDownload();
        handleCancelDownload();
        handleOutOfSpaceDialogResult();
    }
}
