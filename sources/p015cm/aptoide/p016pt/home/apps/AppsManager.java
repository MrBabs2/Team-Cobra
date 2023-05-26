package p015cm.aptoide.p016pt.home.apps;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.p016pt.aab.DynamicSplitsManager;
import p015cm.aptoide.p016pt.aab.DynamicSplitsModel;
import p015cm.aptoide.p016pt.ads.MoPubAdsManager;
import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.app.aptoideinstall.AptoideInstallManager;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;
import p015cm.aptoide.p016pt.database.room.RoomUpdate;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;
import p015cm.aptoide.p016pt.download.DownloadFactory;
import p015cm.aptoide.p016pt.download.Origin;
import p015cm.aptoide.p016pt.download.SplitAnalyticsMapper;
import p015cm.aptoide.p016pt.home.apps.model.DownloadApp;
import p015cm.aptoide.p016pt.home.apps.model.InstalledApp;
import p015cm.aptoide.p016pt.home.apps.model.StateApp;
import p015cm.aptoide.p016pt.home.apps.model.UpdateApp;
import p015cm.aptoide.p016pt.install.Install;
import p015cm.aptoide.p016pt.install.InstallAnalytics;
import p015cm.aptoide.p016pt.install.InstallManager;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.notification.UpdatesNotificationManager;
import p015cm.aptoide.p016pt.preferences.secure.SecurePreferences;
import p015cm.aptoide.p016pt.updates.UpdatesAnalytics;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;
import p123rx.p126m.C5379n;
import p322p.p323a.p324a.p325a.C10832d;

/* renamed from: cm.aptoide.pt.home.apps.AppsManager */
public class AppsManager {
    private final AppMapper appMapper;
    private final AptoideInstallManager aptoideInstallManager;
    private final Context context;
    private final DownloadAnalytics downloadAnalytics;
    private final DownloadFactory downloadFactory;
    private final DynamicSplitsManager dynamicSplitsManager;
    private final InstallAnalytics installAnalytics;
    private final InstallManager installManager;
    private final MoPubAdsManager moPubAdsManager;
    private final PackageManager packageManager;
    private final SharedPreferences secureSharedPreferences;
    private final SplitAnalyticsMapper splitAnalyticsMapper;
    private final UpdatesAnalytics updatesAnalytics;
    private final UpdatesManager updatesManager;
    private final UpdatesNotificationManager updatesNotificationManager;

    public AppsManager(UpdatesManager updatesManager2, InstallManager installManager2, AppMapper appMapper2, DownloadAnalytics downloadAnalytics2, InstallAnalytics installAnalytics2, UpdatesAnalytics updatesAnalytics2, PackageManager packageManager2, Context context2, DownloadFactory downloadFactory2, MoPubAdsManager moPubAdsManager2, AptoideInstallManager aptoideInstallManager2, UpdatesNotificationManager updatesNotificationManager2, SharedPreferences sharedPreferences, DynamicSplitsManager dynamicSplitsManager2, SplitAnalyticsMapper splitAnalyticsMapper2) {
        this.updatesManager = updatesManager2;
        this.installManager = installManager2;
        this.appMapper = appMapper2;
        this.downloadAnalytics = downloadAnalytics2;
        this.installAnalytics = installAnalytics2;
        this.updatesAnalytics = updatesAnalytics2;
        this.packageManager = packageManager2;
        this.context = context2;
        this.downloadFactory = downloadFactory2;
        this.moPubAdsManager = moPubAdsManager2;
        this.aptoideInstallManager = aptoideInstallManager2;
        this.updatesNotificationManager = updatesNotificationManager2;
        this.secureSharedPreferences = sharedPreferences;
        this.dynamicSplitsManager = dynamicSplitsManager2;
        this.splitAnalyticsMapper = splitAnalyticsMapper2;
    }

    /* renamed from: a */
    static /* synthetic */ RoomDownload m6100a(RoomDownload roomDownload, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        return roomDownload;
    }

    /* renamed from: b */
    static /* synthetic */ List m6105b(List list, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        return list;
    }

    /* renamed from: d */
    static /* synthetic */ void m6107d(Install install) {
        Logger instance = Logger.getInstance();
        instance.mo12975d("Apps", "filtered installed - is not installed -> " + install.getPackageName() + " " + install.getMd5() + " " + install.getVersionName());
    }

    /* renamed from: e */
    static /* synthetic */ Boolean m6108e(Install install) {
        return Boolean.valueOf(install.getType() == Install.InstallationType.UPDATE);
    }

    /* renamed from: f */
    static /* synthetic */ Iterable m6109f(List list) {
        return list;
    }

    private C5368e<List<UpdateApp>> getAllUpdatesList() {
        return this.updatesManager.getUpdatesList().mo18656b().mo18687f(new C2814r(this));
    }

    private Origin getOrigin(int i) {
        if (i == 1) {
            return Origin.UPDATE;
        }
        if (i != 2) {
            return Origin.INSTALL;
        }
        return Origin.DOWNGRADE;
    }

    private C5368e<List<UpdateApp>> getUpdateDownloadsList() {
        return this.installManager.getInstallations().mo18656b().mo18682e(200, TimeUnit.MILLISECONDS).mo18687f(new C2754f0(this));
    }

    /* renamed from: h */
    static /* synthetic */ Iterable m6111h(List list) {
        return list;
    }

    private void handleNotEnoughSpaceError(String str) {
        this.downloadAnalytics.sendNotEnoughSpaceError(str);
    }

    /* renamed from: i */
    static /* synthetic */ Iterable m6112i(List list) {
        return list;
    }

    /* renamed from: k */
    static /* synthetic */ Iterable m6114k(List list) {
        return list;
    }

    /* access modifiers changed from: private */
    public List<UpdateApp> mergeUpdates(List<UpdateApp> list, List<UpdateApp> list2) {
        ArrayList arrayList = new ArrayList(list);
        for (int i = 0; i < arrayList.size(); i++) {
            UpdateApp updateApp = list.get(i);
            Iterator<UpdateApp> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                UpdateApp next = it.next();
                if (updateApp.getMd5().equals(next.getMd5())) {
                    arrayList.set(i, next);
                    break;
                }
            }
        }
        return arrayList;
    }

    private C5368e<List<UpdateApp>> observeAllUpdates() {
        return C5368e.m10247a(getAllUpdatesList(), getUpdateDownloadsList(), new C2805p0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: setupDownloadEvents */
    public void mo11889a(RoomDownload roomDownload, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, String str) {
        this.downloadAnalytics.downloadStartEvent(roomDownload, AnalyticsManager.Action.CLICK, DownloadAnalytics.AppContext.APPS_FRAGMENT, false);
        this.downloadAnalytics.installClicked(roomDownload.getMd5(), roomDownload.getPackageName(), roomDownload.getVersionCode(), AnalyticsManager.Action.INSTALL, offerResponseStatus, false, roomDownload.hasAppc(), roomDownload.hasSplits(), roomDownload.getTrustedBadge(), (String) null, roomDownload.getStoreName(), str, roomDownload.hasObbs(), this.splitAnalyticsMapper.getSplitTypesAsString(roomDownload.getSplits()));
        this.installAnalytics.installStarted(roomDownload.getPackageName(), roomDownload.getVersionCode(), AnalyticsManager.Action.INSTALL, DownloadAnalytics.AppContext.APPS_FRAGMENT, getOrigin(roomDownload.getAction()), false, roomDownload.hasAppc(), roomDownload.hasSplits(), offerResponseStatus.toString(), roomDownload.getTrustedBadge(), roomDownload.getStoreName(), roomDownload.hasObbs(), this.splitAnalyticsMapper.getSplitTypesAsString(roomDownload.getSplits()));
    }

    private void setupUpdateEvents(RoomDownload roomDownload, Origin origin, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, String str, String str2, String str3, String str4) {
        this.downloadAnalytics.downloadStartEvent(roomDownload, AnalyticsManager.Action.CLICK, DownloadAnalytics.AppContext.APPS_FRAGMENT, false, origin);
        this.downloadAnalytics.installClicked(roomDownload.getMd5(), roomDownload.getPackageName(), roomDownload.getVersionCode(), AnalyticsManager.Action.INSTALL, offerResponseStatus, false, roomDownload.hasAppc(), roomDownload.hasSplits(), str, str2, str3, str4, roomDownload.hasObbs(), this.splitAnalyticsMapper.getSplitTypesAsString(roomDownload.getSplits()));
        this.installAnalytics.installStarted(roomDownload.getPackageName(), roomDownload.getVersionCode(), AnalyticsManager.Action.INSTALL, DownloadAnalytics.AppContext.APPS_FRAGMENT, origin, false, roomDownload.hasAppc(), roomDownload.hasSplits(), offerResponseStatus.toString(), roomDownload.getTrustedBadge(), roomDownload.getStoreName(), roomDownload.hasObbs(), this.splitAnalyticsMapper.getSplitTypesAsString(roomDownload.getSplits()));
    }

    private C5328b startUpdatesNotification() {
        return this.updatesNotificationManager.setUpNotification();
    }

    private C5328b updateFirstLoadUpdatesSettings() {
        return C5328b.m10169d(new C2809q(this));
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo11885a(List list) {
        return C5368e.m10234a(list).mo18667b(new C2854z(this), false, 1).mo18653a(C2839w.f5690f);
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo11891b(List list) {
        if (list == null || list.isEmpty()) {
            return C5368e.m10257c(Collections.emptyList());
        }
        C5368e d = C5368e.m10257c(list).mo18691h(C2726a0.f5559f).mo18681d(C2819s.f5667f);
        InstallManager installManager2 = this.installManager;
        installManager2.getClass();
        C5368e b = d.mo18692i(new C2823s3(installManager2)).mo18681d(C2784l0.f5625f).mo18664b(C2804p.f5652f).mo18698l().mo18664b(C2810q0.f5658f);
        AppMapper appMapper2 = this.appMapper;
        appMapper2.getClass();
        return b.mo18694j(new C2833u3(appMapper2));
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo11892c(List list) {
        if (list == null || list.isEmpty()) {
            return C5368e.m10257c(new ArrayList());
        }
        return C5368e.m10257c(list).mo18691h(C2815r0.f5663f).mo18681d(C2790m0.f5631f).mo18692i(new C2779k0(this)).mo18698l();
    }

    public C5328b cancelDownload(App app) {
        StateApp stateApp = (StateApp) app;
        return this.installManager.cancelInstall(stateApp.getMd5(), stateApp.getPackageName(), stateApp.getVersionCode());
    }

    public C5328b excludeUpdate(App app) {
        return this.updatesManager.excludeUpdate(((UpdateApp) app).getPackageName());
    }

    public C5368e<List<DownloadApp>> getDownloadApps() {
        return this.installManager.getInstallations().mo18682e(200, TimeUnit.MILLISECONDS).mo18687f(new C2824t(this));
    }

    public C5368e<List<InstalledApp>> getInstalledApps() {
        C5368e<R> h = this.installManager.fetchInstalled().mo18656b().mo18691h(C2732b0.f5565f);
        UpdatesManager updatesManager2 = this.updatesManager;
        updatesManager2.getClass();
        C5368e<List<R>> l = h.mo18692i((C5379n<? super R, ? extends Single<? extends R>>) new C2853y3(updatesManager2)).mo18681d(C2749e0.f5585f).mo18698l();
        AppMapper appMapper2 = this.appMapper;
        appMapper2.getClass();
        return l.mo18694j(new C2858z3(appMapper2));
    }

    public C5368e<List<UpdateApp>> getUpdatesList() {
        if (SecurePreferences.isUpdatesFirstLoad(this.secureSharedPreferences)) {
            return this.updatesManager.refreshUpdates().mo18606c(updateFirstLoadUpdatesSettings()).mo18587a(startUpdatesNotification()).mo18593a(observeAllUpdates());
        }
        return observeAllUpdates();
    }

    public C5328b installApp(App app) {
        DownloadApp downloadApp = (DownloadApp) app;
        return this.installManager.getInstall(downloadApp.getMd5(), downloadApp.getPackageName(), downloadApp.getVersionCode()).mo18669c().mo18689g(new C2769i0(this, app)).mo18696k();
    }

    public C5368e<List<String>> observeOutOfSpaceApps() {
        return this.installManager.getDownloadOutOfSpaceMd5List().mo18656b().mo18664b(new C2825t0(this));
    }

    public C5328b pauseDownload(App app) {
        return this.installManager.pauseInstall(((StateApp) app).getMd5());
    }

    public C5328b refreshAllUpdates() {
        return this.updatesManager.refreshUpdates();
    }

    public C5328b resumeDownload(App app, String str) {
        Single<R> a = this.installManager.getDownload(((StateApp) app).getMd5()).mo18559a(new C2764h0(this, str));
        InstallManager installManager2 = this.installManager;
        installManager2.getClass();
        return a.mo18566b((C5379n<? super R, ? extends C5328b>) new C2736b4(installManager2));
    }

    public void setAppViewAnalyticsEvent() {
        this.updatesAnalytics.updates(UpdatesAnalytics.OPEN_APP_VIEW);
    }

    public boolean showWarning() {
        return this.installManager.showWarning();
    }

    public void storeRootAnswer(boolean z) {
        this.installManager.rootInstallAllowed(z);
    }

    public C5328b updateAll() {
        return this.updatesManager.getUpdatesList().mo18669c().mo18681d(C2835v0.f5686f).mo18687f(new C2829u(this)).mo18696k();
    }

    public C5328b updateApp(App app) {
        String packageName = ((UpdateApp) app).getPackageName();
        return this.updatesManager.getUpdate(packageName).mo18566b(new C2844x(this, packageName)).mo18598b();
    }

    /* renamed from: e */
    public /* synthetic */ C5368e mo11895e(List list) {
        return this.moPubAdsManager.getAdsVisibilityStatus().mo18564b(new C2744d0(this)).mo18568c(new C2820s0(this, list));
    }

    /* renamed from: a */
    public /* synthetic */ Single mo11875a(RoomUpdate roomUpdate) {
        return this.aptoideInstallManager.isInstalledWithAptoide(roomUpdate.getPackageName()).mo18569d(new C2794n(this, roomUpdate));
    }

    /* renamed from: a */
    public /* synthetic */ UpdateApp mo11873a(RoomUpdate roomUpdate, Boolean bool) {
        return this.appMapper.mapUpdateToUpdateApp(roomUpdate, bool.booleanValue());
    }

    /* renamed from: d */
    public /* synthetic */ void mo11894d(List list) {
        handleNotEnoughSpaceError((String) list.get(list.size() - 1));
    }

    /* renamed from: c */
    static /* synthetic */ Boolean m6106c(Install install) {
        return Boolean.valueOf(install != null);
    }

    /* renamed from: a */
    static /* synthetic */ Integer m6102a(UpdateApp updateApp, UpdateApp updateApp2) {
        if (updateApp.isInstalledWithAptoide() && !updateApp2.isInstalledWithAptoide()) {
            return -1;
        }
        if (updateApp.isInstalledWithAptoide() || !updateApp2.isInstalledWithAptoide()) {
            return 0;
        }
        return 1;
    }

    /* renamed from: b */
    static /* synthetic */ Boolean m6104b(Install install) {
        return Boolean.valueOf(install.getType() != Install.InstallationType.UPDATE || (install.getType() == Install.InstallationType.UPDATE && install.getState() == Install.InstallationStatus.UNINSTALLED));
    }

    /* renamed from: a */
    public /* synthetic */ Single mo11878a(Install install) {
        return this.aptoideInstallManager.isInstalledWithAptoide(install.getPackageName()).mo18569d(new C2795n0(this, install));
    }

    /* renamed from: a */
    public /* synthetic */ UpdateApp mo11874a(Install install, Boolean bool) {
        return this.appMapper.mapInstallToUpdateApp(install, bool.booleanValue());
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m6101a(RoomInstalled roomInstalled) {
        return Boolean.valueOf(roomInstalled != null);
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo11881a(App app, Install install) {
        if (install.getState() != Install.InstallationStatus.INSTALLED) {
            return resumeDownload(app, install.getType().toString());
        }
        AptoideUtils.SystemU.openApp(((DownloadApp) app).getPackageName(), this.packageManager, this.context);
        return C5328b.m10171g();
    }

    /* renamed from: a */
    public /* synthetic */ Single mo11879a(String str, RoomDownload roomDownload) {
        return this.moPubAdsManager.getAdsVisibilityStatus().mo18564b(new C2783l(this, roomDownload, str)).mo18569d(new C2789m(roomDownload));
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo11882a(String str, RoomUpdate roomUpdate) {
        return this.moPubAdsManager.getAdsVisibilityStatus().mo18559a(new C2799o(this, roomUpdate, str)).mo18566b(new C2774j0(this));
    }

    /* renamed from: a */
    public /* synthetic */ Single mo11876a(RoomUpdate roomUpdate, String str, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        return C10832d.m36727a(this.dynamicSplitsManager.getAppSplitsByMd5(roomUpdate.getMd5())).mo18559a(new C2800o0(this, roomUpdate, str, offerResponseStatus));
    }

    /* renamed from: a */
    public /* synthetic */ Single mo11877a(RoomUpdate roomUpdate, String str, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, DynamicSplitsModel dynamicSplitsModel) {
        RoomDownload create = this.downloadFactory.create(roomUpdate, false, dynamicSplitsModel.getDynamicSplitsList());
        this.updatesAnalytics.sendUpdateClickedEvent(str, roomUpdate.hasSplits(), roomUpdate.hasAppc(), false, roomUpdate.getTrustedBadge(), offerResponseStatus.toString().toLowerCase(), (String) null, roomUpdate.getStoreName(), "update", roomUpdate.getMainObbMd5() != null && !roomUpdate.getMainObbMd5().isEmpty());
        setupUpdateEvents(create, Origin.UPDATE, offerResponseStatus, roomUpdate.getTrustedBadge(), (String) null, roomUpdate.getStoreName(), "update");
        return Single.m10119a(create);
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo11880a(RoomDownload roomDownload) {
        return this.installManager.mo12771h(roomDownload);
    }

    /* renamed from: a */
    public /* synthetic */ void mo11888a(WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        this.updatesAnalytics.sendUpdateAllClickEvent();
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo11886a(List list, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        C5368e l = C5368e.m10257c(offerResponseStatus).mo18694j(new C2849y(list)).mo18691h(C2830u0.f5679f).mo18687f(new C2759g0(this, offerResponseStatus)).mo18698l();
        InstallManager installManager2 = this.installManager;
        installManager2.getClass();
        return l.mo18687f(new C2742c4(installManager2));
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo11883a(WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, RoomUpdate roomUpdate) {
        return C10832d.m36727a(this.dynamicSplitsManager.getAppSplitsByMd5(roomUpdate.getMd5())).mo18568c(new C2738c0(this, roomUpdate, offerResponseStatus));
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo11884a(RoomUpdate roomUpdate, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, DynamicSplitsModel dynamicSplitsModel) {
        return C5368e.m10257c(this.downloadFactory.create(roomUpdate, false, dynamicSplitsModel.getDynamicSplitsList())).mo18664b(new C2834v(this, roomUpdate, offerResponseStatus));
    }

    /* renamed from: a */
    public /* synthetic */ void mo11890a(RoomUpdate roomUpdate, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, RoomDownload roomDownload) {
        this.updatesAnalytics.sendUpdateClickedEvent(roomUpdate.getPackageName(), roomUpdate.hasSplits(), roomUpdate.hasAppc(), false, roomUpdate.getTrustedBadge(), offerResponseStatus.toString().toLowerCase(), (String) null, roomUpdate.getStoreName(), "update_all", roomUpdate.getMainObbMd5() != null && !roomUpdate.getMainObbMd5().isEmpty());
        setupUpdateEvents(roomDownload, Origin.UPDATE_ALL, offerResponseStatus, (String) null, roomUpdate.getTrustedBadge(), roomUpdate.getStoreName(), "update_all");
    }

    /* renamed from: a */
    public /* synthetic */ void mo11887a() {
        SecurePreferences.setUpdatesFirstLoad(false, this.secureSharedPreferences);
    }
}
