package p015cm.aptoide.p016pt.wallet;

import android.os.Build;
import kotlin.C10221n;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.actions.PermissionManager;
import p015cm.aptoide.p016pt.actions.PermissionService;
import p015cm.aptoide.p016pt.ads.MoPubAdsManager;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.promotions.WalletApp;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\b\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020*H\u0002J\b\u0010,\u001a\u00020*H\u0002J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.H\u0002J\u000e\u00100\u001a\b\u0012\u0004\u0012\u00020/0.H\u0002J\b\u00101\u001a\u00020/H\u0002J\b\u00102\u001a\u00020*H\u0002J\u0016\u00103\u001a\b\u0012\u0004\u0012\u0002040.2\u0006\u00105\u001a\u000204H\u0002J\b\u00106\u001a\u00020*H\u0016J\u001e\u00107\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u000109\u0012\u0004\u0012\u00020408\u0018\u00010.H\u0002J\u0010\u0010:\u001a\u00020;2\u0006\u00105\u001a\u000204H\u0002J\u001e\u0010<\u001a\b\u0012\u0004\u0012\u00020=0.2\u0006\u0010>\u001a\u00020=2\u0006\u00105\u001a\u000204H\u0002R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006?"}, mo16641d2 = {"Lcm/aptoide/pt/wallet/WalletInstallPresenter;", "Lcm/aptoide/pt/presenter/Presenter;", "view", "Lcm/aptoide/pt/wallet/WalletInstallView;", "walletInstallManager", "Lcm/aptoide/pt/wallet/WalletInstallManager;", "navigator", "Lcm/aptoide/pt/wallet/WalletInstallNavigator;", "permissionManager", "Lcm/aptoide/pt/actions/PermissionManager;", "permissionService", "Lcm/aptoide/pt/actions/PermissionService;", "viewScheduler", "Lrx/Scheduler;", "io", "configuration", "Lcm/aptoide/pt/wallet/WalletInstallConfiguration;", "walletInstallAnalytics", "Lcm/aptoide/pt/wallet/WalletInstallAnalytics;", "moPubAdsManager", "Lcm/aptoide/pt/ads/MoPubAdsManager;", "(Lcm/aptoide/pt/wallet/WalletInstallView;Lcm/aptoide/pt/wallet/WalletInstallManager;Lcm/aptoide/pt/wallet/WalletInstallNavigator;Lcm/aptoide/pt/actions/PermissionManager;Lcm/aptoide/pt/actions/PermissionService;Lrx/Scheduler;Lrx/Scheduler;Lcm/aptoide/pt/wallet/WalletInstallConfiguration;Lcm/aptoide/pt/wallet/WalletInstallAnalytics;Lcm/aptoide/pt/ads/MoPubAdsManager;)V", "getConfiguration", "()Lcm/aptoide/pt/wallet/WalletInstallConfiguration;", "getIo", "()Lrx/Scheduler;", "getMoPubAdsManager", "()Lcm/aptoide/pt/ads/MoPubAdsManager;", "getNavigator", "()Lcm/aptoide/pt/wallet/WalletInstallNavigator;", "getPermissionManager", "()Lcm/aptoide/pt/actions/PermissionManager;", "getPermissionService", "()Lcm/aptoide/pt/actions/PermissionService;", "getView", "()Lcm/aptoide/pt/wallet/WalletInstallView;", "getViewScheduler", "getWalletInstallAnalytics", "()Lcm/aptoide/pt/wallet/WalletInstallAnalytics;", "getWalletInstallManager", "()Lcm/aptoide/pt/wallet/WalletInstallManager;", "handleAnalyticsContextSetup", "", "handleCancelDownloadButton", "handleCloseButtonClick", "handleInstallDialogCancelButtonPress", "Lrx/Observable;", "", "handleWalletInstallation", "hasMinimumSdk", "loadWalletInstall", "observeDownloadProgress", "Lcm/aptoide/pt/promotions/WalletApp;", "walletApp", "present", "showWalletInitialState", "Lkotlin/Pair;", "", "startWalletDownload", "Lrx/Completable;", "verifyNotEnoughSpaceError", "Lcm/aptoide/pt/app/DownloadModel;", "downloadModel", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.wallet.WalletInstallPresenter */
/* compiled from: WalletInstallPresenter.kt */
public final class WalletInstallPresenter implements Presenter {
    private final WalletInstallConfiguration configuration;

    /* renamed from: io */
    private final C5373h f9816io;
    private final MoPubAdsManager moPubAdsManager;
    private final WalletInstallNavigator navigator;
    private final PermissionManager permissionManager;
    private final PermissionService permissionService;
    private final WalletInstallView view;
    private final C5373h viewScheduler;
    private final WalletInstallAnalytics walletInstallAnalytics;
    private final WalletInstallManager walletInstallManager;

    public WalletInstallPresenter(WalletInstallView walletInstallView, WalletInstallManager walletInstallManager2, WalletInstallNavigator walletInstallNavigator, PermissionManager permissionManager2, PermissionService permissionService2, C5373h hVar, C5373h hVar2, WalletInstallConfiguration walletInstallConfiguration, WalletInstallAnalytics walletInstallAnalytics2, MoPubAdsManager moPubAdsManager2) {
        C10202j.m34178b(walletInstallView, "view");
        C10202j.m34178b(walletInstallManager2, "walletInstallManager");
        C10202j.m34178b(walletInstallNavigator, "navigator");
        C10202j.m34178b(permissionManager2, "permissionManager");
        C10202j.m34178b(permissionService2, "permissionService");
        C10202j.m34178b(hVar, "viewScheduler");
        C10202j.m34178b(hVar2, "io");
        C10202j.m34178b(walletInstallConfiguration, "configuration");
        C10202j.m34178b(walletInstallAnalytics2, "walletInstallAnalytics");
        C10202j.m34178b(moPubAdsManager2, "moPubAdsManager");
        this.view = walletInstallView;
        this.walletInstallManager = walletInstallManager2;
        this.navigator = walletInstallNavigator;
        this.permissionManager = permissionManager2;
        this.permissionService = permissionService2;
        this.viewScheduler = hVar;
        this.f9816io = hVar2;
        this.configuration = walletInstallConfiguration;
        this.walletInstallAnalytics = walletInstallAnalytics2;
        this.moPubAdsManager = moPubAdsManager2;
    }

    private final void handleAnalyticsContextSetup() {
        this.view.getLifecycleEvent().mo18681d(WalletInstallPresenter$handleAnalyticsContextSetup$1.INSTANCE).mo18664b(new WalletInstallPresenter$handleAnalyticsContextSetup$2(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(WalletInstallPresenter$handleAnalyticsContextSetup$3.INSTANCE, (C5378b<Throwable>) new WalletInstallPresenter$handleAnalyticsContextSetup$4(this));
    }

    private final void handleCancelDownloadButton() {
        this.view.getLifecycleEvent().mo18681d(WalletInstallPresenter$handleCancelDownloadButton$1.INSTANCE).mo18687f(new WalletInstallPresenter$handleCancelDownloadButton$2(this)).mo18687f(new WalletInstallPresenter$handleCancelDownloadButton$3(this)).mo18669c().mo18664b(new WalletInstallPresenter$handleCancelDownloadButton$4(this)).mo18644a(this.viewScheduler).mo18648a((C5377a) new WalletInstallPresenter$handleCancelDownloadButton$5(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(WalletInstallPresenter$handleCancelDownloadButton$6.INSTANCE, (C5378b<Throwable>) new WalletInstallPresenter$handleCancelDownloadButton$7(this));
    }

    private final void handleCloseButtonClick() {
        this.view.getLifecycleEvent().mo18681d(WalletInstallPresenter$handleCloseButtonClick$1.INSTANCE).mo18687f(new WalletInstallPresenter$handleCloseButtonClick$2(this)).mo18664b(new WalletInstallPresenter$handleCloseButtonClick$3(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(WalletInstallPresenter$handleCloseButtonClick$4.INSTANCE, (C5378b<Throwable>) new WalletInstallPresenter$handleCloseButtonClick$5(this));
    }

    /* access modifiers changed from: private */
    public final C5368e<Boolean> handleInstallDialogCancelButtonPress() {
        C5368e<Boolean> b = this.walletInstallManager.onWalletInstallationCanceled().mo18669c().mo18664b(new WalletInstallPresenter$handleInstallDialogCancelButtonPress$1(this));
        C10202j.m34174a((Object) b, "walletInstallManager.onW… { view.dismissDialog() }");
        return b;
    }

    /* access modifiers changed from: private */
    public final C5368e<Boolean> handleWalletInstallation() {
        C5368e<Boolean> b = this.walletInstallManager.onWalletInstalled().mo18669c().mo18644a(this.viewScheduler).mo18664b(new WalletInstallPresenter$handleWalletInstallation$1(this));
        C10202j.m34174a((Object) b, "walletInstallManager.onW…stallationSuccessView() }");
        return b;
    }

    /* access modifiers changed from: private */
    public final boolean hasMinimumSdk() {
        return Build.VERSION.SDK_INT >= 21;
    }

    private final void loadWalletInstall() {
        this.view.getLifecycleEvent().mo18681d(WalletInstallPresenter$loadWalletInstall$1.INSTANCE).mo18664b(new WalletInstallPresenter$loadWalletInstall$2(this)).mo18681d(new WalletInstallPresenter$loadWalletInstall$3(this)).mo18687f(new WalletInstallPresenter$loadWalletInstall$4(this)).mo18681d(WalletInstallPresenter$loadWalletInstall$5.INSTANCE).mo18644a(this.viewScheduler).mo18664b(new WalletInstallPresenter$loadWalletInstall$6(this)).mo18687f(new WalletInstallPresenter$loadWalletInstall$7(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(WalletInstallPresenter$loadWalletInstall$8.INSTANCE, (C5378b<Throwable>) new WalletInstallPresenter$loadWalletInstall$9(this));
    }

    /* access modifiers changed from: private */
    public final C5368e<WalletApp> observeDownloadProgress(WalletApp walletApp) {
        C5368e<R> j = this.walletInstallManager.loadDownloadModel(walletApp).mo18687f(new WalletInstallPresenter$observeDownloadProgress$1(this, walletApp)).mo18644a(this.viewScheduler).mo18664b(new WalletInstallPresenter$observeDownloadProgress$2(this)).mo18694j(new WalletInstallPresenter$observeDownloadProgress$3(walletApp));
        C10202j.m34174a((Object) j, "walletInstallManager.loa…e(it) }.map { walletApp }");
        return j;
    }

    /* access modifiers changed from: private */
    public final C5368e<C10221n<String, WalletApp>> showWalletInitialState() {
        return C5368e.m10256b(this.walletInstallManager.getAppIcon(this.configuration.getAppPackageName()), this.walletInstallManager.getWallet(), WalletInstallPresenter$showWalletInitialState$1.INSTANCE).mo18669c().mo18644a(this.viewScheduler).mo18664b(new WalletInstallPresenter$showWalletInitialState$2(this));
    }

    /* access modifiers changed from: private */
    public final C5328b startWalletDownload(WalletApp walletApp) {
        C5328b k = C5368e.m10248a(new WalletInstallPresenter$startWalletDownload$1(this, walletApp)).mo18644a(this.viewScheduler).mo18687f(new WalletInstallPresenter$startWalletDownload$2(this, walletApp)).mo18696k();
        C10202j.m34174a((Object) k, "Observable.defer {\n     …        }.toCompletable()");
        return k;
    }

    /* access modifiers changed from: private */
    public final C5368e<DownloadModel> verifyNotEnoughSpaceError(DownloadModel downloadModel, WalletApp walletApp) {
        if (downloadModel.getDownloadState() == DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR) {
            this.moPubAdsManager.getAdsVisibilityStatus().mo18564b(new WalletInstallPresenter$verifyNotEnoughSpaceError$1(this, downloadModel, walletApp)).mo18567c().mo18694j(new WalletInstallPresenter$verifyNotEnoughSpaceError$2(downloadModel));
        }
        C5368e<DownloadModel> c = C5368e.m10257c(downloadModel);
        C10202j.m34174a((Object) c, "Observable.just(downloadModel)");
        return c;
    }

    public final WalletInstallConfiguration getConfiguration() {
        return this.configuration;
    }

    public final C5373h getIo() {
        return this.f9816io;
    }

    public final MoPubAdsManager getMoPubAdsManager() {
        return this.moPubAdsManager;
    }

    public final WalletInstallNavigator getNavigator() {
        return this.navigator;
    }

    public final PermissionManager getPermissionManager() {
        return this.permissionManager;
    }

    public final PermissionService getPermissionService() {
        return this.permissionService;
    }

    public final WalletInstallView getView() {
        return this.view;
    }

    public final C5373h getViewScheduler() {
        return this.viewScheduler;
    }

    public final WalletInstallAnalytics getWalletInstallAnalytics() {
        return this.walletInstallAnalytics;
    }

    public final WalletInstallManager getWalletInstallManager() {
        return this.walletInstallManager;
    }

    public void present() {
        loadWalletInstall();
        handleCloseButtonClick();
        handleCancelDownloadButton();
        handleAnalyticsContextSetup();
    }
}
