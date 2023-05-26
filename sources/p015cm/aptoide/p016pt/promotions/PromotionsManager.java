package p015cm.aptoide.p016pt.promotions;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.util.List;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.p016pt.aab.DynamicSplitsManager;
import p015cm.aptoide.p016pt.aab.DynamicSplitsModel;
import p015cm.aptoide.p016pt.ads.MoPubAdsManager;
import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.app.DownloadStateParser;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;
import p015cm.aptoide.p016pt.download.DownloadFactory;
import p015cm.aptoide.p016pt.download.SplitAnalyticsMapper;
import p015cm.aptoide.p016pt.install.AptoideInstalledAppsRepository;
import p015cm.aptoide.p016pt.install.Install;
import p015cm.aptoide.p016pt.install.InstallAnalytics;
import p015cm.aptoide.p016pt.install.InstallManager;
import p015cm.aptoide.p016pt.notification.NotificationAnalytics;
import p015cm.aptoide.p016pt.promotions.Promotion;
import p015cm.aptoide.p016pt.wallet.WalletAppProvider;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;
import p322p.p323a.p324a.p325a.C10832d;

/* renamed from: cm.aptoide.pt.promotions.PromotionsManager */
public class PromotionsManager {
    private static final String WALLET_PACKAGE_NAME = "com.appcoins.wallet";
    private final AptoideInstalledAppsRepository aptoideInstalledAppsRepository;
    private final DownloadFactory downloadFactory;
    private final DownloadStateParser downloadStateParser;
    private final DynamicSplitsManager dynamicSplitsManager;
    private final InstallAnalytics installAnalytics;
    private final InstallManager installManager;
    private final MoPubAdsManager moPubAdsManager;
    private final NotificationAnalytics notificationAnalytics;
    private final PackageManager packageManager;
    private final PromotionViewAppMapper promotionViewAppMapper;
    private final PromotionsAnalytics promotionsAnalytics;
    private final PromotionsService promotionsService;
    private final SplitAnalyticsMapper splitAnalyticsMapper;
    private final WalletAppProvider walletAppProvider;

    public PromotionsManager(PromotionViewAppMapper promotionViewAppMapper2, InstallManager installManager2, DownloadFactory downloadFactory2, DownloadStateParser downloadStateParser2, PromotionsAnalytics promotionsAnalytics2, NotificationAnalytics notificationAnalytics2, InstallAnalytics installAnalytics2, PackageManager packageManager2, PromotionsService promotionsService2, AptoideInstalledAppsRepository aptoideInstalledAppsRepository2, MoPubAdsManager moPubAdsManager2, WalletAppProvider walletAppProvider2, DynamicSplitsManager dynamicSplitsManager2, SplitAnalyticsMapper splitAnalyticsMapper2) {
        this.promotionViewAppMapper = promotionViewAppMapper2;
        this.installManager = installManager2;
        this.downloadFactory = downloadFactory2;
        this.downloadStateParser = downloadStateParser2;
        this.promotionsAnalytics = promotionsAnalytics2;
        this.notificationAnalytics = notificationAnalytics2;
        this.installAnalytics = installAnalytics2;
        this.packageManager = packageManager2;
        this.promotionsService = promotionsService2;
        this.aptoideInstalledAppsRepository = aptoideInstalledAppsRepository2;
        this.moPubAdsManager = moPubAdsManager2;
        this.walletAppProvider = walletAppProvider2;
        this.dynamicSplitsManager = dynamicSplitsManager2;
        this.splitAnalyticsMapper = splitAnalyticsMapper2;
    }

    /* renamed from: a */
    static /* synthetic */ RoomDownload m6882a(RoomDownload roomDownload, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        return roomDownload;
    }

    /* renamed from: b */
    static /* synthetic */ RoomDownload m6885b(RoomDownload roomDownload, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        return roomDownload;
    }

    /* renamed from: b */
    static /* synthetic */ Iterable m6886b(List list) {
        return list;
    }

    private int getTotalAppc(List<PromotionApp> list) {
        int i = 0;
        for (PromotionApp appcValue : list) {
            i = (int) (((float) i) + appcValue.getAppcValue());
        }
        return i;
    }

    private boolean isWalletInstalled() {
        for (ApplicationInfo applicationInfo : this.packageManager.getInstalledApplications(0)) {
            if (applicationInfo.packageName.equals(WALLET_PACKAGE_NAME)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p015cm.aptoide.p016pt.promotions.Promotion mapPromotionAction(p015cm.aptoide.p016pt.promotions.Promotion r6) {
        /*
            r5 = this;
            java.lang.String r0 = r6.getPromotionId()
            int r1 = r0.hashCode()
            r2 = 546494617(0x2092d899, float:2.4876694E-19)
            r3 = 0
            r4 = 1
            if (r1 == r2) goto L_0x001f
            r2 = 1299041924(0x4d6dce84, float:2.493584E8)
            if (r1 == r2) goto L_0x0015
            goto L_0x0029
        L_0x0015:
            java.lang.String r1 = "BONUS_GAME_WALLET_OFFER_19"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0029
            r0 = 1
            goto L_0x002a
        L_0x001f:
            java.lang.String r1 = "BONUS_MIGRATION_19"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0029
            r0 = 0
            goto L_0x002a
        L_0x0029:
            r0 = -1
        L_0x002a:
            if (r0 == 0) goto L_0x0042
            if (r0 == r4) goto L_0x002f
            goto L_0x004b
        L_0x002f:
            r0 = 2
            cm.aptoide.pt.promotions.Promotion$ClaimAction[] r0 = new p015cm.aptoide.p016pt.promotions.Promotion.ClaimAction[r0]
            cm.aptoide.pt.promotions.Promotion$ClaimAction r1 = p015cm.aptoide.p016pt.promotions.Promotion.ClaimAction.INSTALL
            r0[r3] = r1
            cm.aptoide.pt.promotions.Promotion$ClaimAction r1 = p015cm.aptoide.p016pt.promotions.Promotion.ClaimAction.MIGRATE
            r0[r4] = r1
            java.util.List r0 = java.util.Arrays.asList(r0)
            r6.setClaimActions(r0)
            goto L_0x004b
        L_0x0042:
            cm.aptoide.pt.promotions.Promotion$ClaimAction r0 = p015cm.aptoide.p016pt.promotions.Promotion.ClaimAction.MIGRATE
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r6.setClaimActions(r0)
        L_0x004b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.promotions.PromotionsManager.mapPromotionAction(cm.aptoide.pt.promotions.Promotion):cm.aptoide.pt.promotions.Promotion");
    }

    /* access modifiers changed from: private */
    /* renamed from: setupDownloadEvents */
    public void mo13738a(RoomDownload roomDownload, String str, long j, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        String str2 = str;
        long j2 = j;
        int campaignId = this.notificationAnalytics.getCampaignId(str2, j2);
        String abTestingGroup = this.notificationAnalytics.getAbTestingGroup(str2, j2);
        this.promotionsAnalytics.setupDownloadEvents(roomDownload, campaignId, abTestingGroup, AnalyticsManager.Action.CLICK, offerResponseStatus, this.downloadStateParser.getOrigin(roomDownload.getAction()), roomDownload.hasSplits());
        this.installAnalytics.installStarted(roomDownload.getPackageName(), roomDownload.getVersionCode(), AnalyticsManager.Action.INSTALL, DownloadAnalytics.AppContext.PROMOTIONS, this.downloadStateParser.getOrigin(roomDownload.getAction()), campaignId, abTestingGroup, false, roomDownload.hasAppc(), roomDownload.hasSplits(), offerResponseStatus.toString(), roomDownload.getTrustedBadge(), roomDownload.getStoreName(), false, roomDownload.hasObbs(), this.splitAnalyticsMapper.getSplitTypesAsString(roomDownload.getSplits()));
    }

    /* renamed from: a */
    public /* synthetic */ Single mo13734a(List list) {
        if (list.isEmpty()) {
            return Single.m10119a(PromotionsModel.ofError());
        }
        PromotionMeta promotionMeta = (PromotionMeta) list.get(0);
        return getPromotionApps(promotionMeta.getPromotionId()).mo18569d(new C3851o2(this, promotionMeta));
    }

    public void allowRootInstall(Boolean bool) {
        this.installManager.rootInstallAllowed(bool.booleanValue());
    }

    /* renamed from: b */
    public /* synthetic */ C5328b mo13740b(RoomDownload roomDownload) {
        return this.installManager.mo12771h(roomDownload);
    }

    public C5328b cancelDownload(String str, String str2, int i) {
        return this.installManager.cancelInstall(str, str2, i);
    }

    public Single<ClaimStatusWrapper> claimPromotion(String str, String str2, String str3) {
        return this.promotionsService.claimPromotion(str, str2, str3);
    }

    public C5328b downloadApp(PromotionViewApp promotionViewApp) {
        return C10832d.m36727a(this.dynamicSplitsManager.getAppSplitsByMd5(promotionViewApp.getMd5())).mo18568c(new C3803i2(this, promotionViewApp)).mo18692i(new C3819k2(this, promotionViewApp)).mo18689g(new C3891t2(this)).mo18696k();
    }

    public Promotion getClaimablePromotion(List<Promotion> list, Promotion.ClaimAction claimAction) {
        for (Promotion next : list) {
            if (next.getClaimActions().contains(claimAction) && next.isClaimable()) {
                return next;
            }
        }
        return null;
    }

    public C5368e<PromotionViewApp> getDownload(PromotionApp promotionApp) {
        return this.installManager.getInstall(promotionApp.getMd5(), promotionApp.getPackageName(), promotionApp.getVersionCode()).mo18694j(new C3827l2(this, promotionApp));
    }

    public C5368e<String> getPackageSignature(String str) {
        return this.aptoideInstalledAppsRepository.getInstalled(str).mo18694j(C3907v2.f6986f);
    }

    public Single<List<PromotionApp>> getPromotionApps(String str) {
        return this.promotionsService.getPromotionApps(str);
    }

    public C5368e<List<Promotion>> getPromotionsForPackage(String str) {
        return this.promotionsService.getPromotionsForPackage(str).mo18567c().mo18691h(C3867q2.f6942f).mo18694j(new C3843n2(this)).mo18698l();
    }

    public Single<PromotionsModel> getPromotionsModel(String str) {
        return this.promotionsService.getPromotions(str).mo18559a(new C3875r2(this));
    }

    public String getWalletAddress() {
        return this.promotionsService.getWalletAddress();
    }

    public C5368e<WalletApp> getWalletApp() {
        return this.walletAppProvider.getWalletApp();
    }

    public C5328b pauseDownload(String str) {
        return this.installManager.pauseInstall(str);
    }

    public C5328b resumeDownload(String str, String str2, long j) {
        return this.installManager.getDownload(str).mo18559a(new C3811j2(this, str2, j)).mo18566b(new C3915w2(this));
    }

    public void saveWalletAddress(String str) {
        this.promotionsService.saveWalletAddress(str);
    }

    public boolean shouldShowRootInstallWarningPopup() {
        return this.installManager.showWarning();
    }

    /* renamed from: a */
    public /* synthetic */ PromotionsModel mo13731a(PromotionMeta promotionMeta, List list) {
        return new PromotionsModel(promotionMeta.getPromotionId(), list, promotionMeta.getTitle(), promotionMeta.getBackground(), isWalletInstalled(), false, promotionMeta.getDescription(), promotionMeta.getDialogDescription());
    }

    /* renamed from: a */
    public /* synthetic */ PromotionViewApp mo13730a(PromotionApp promotionApp, Install install) {
        return this.promotionViewAppMapper.mapInstallToPromotionApp(install, promotionApp);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo13736a(PromotionViewApp promotionViewApp, DynamicSplitsModel dynamicSplitsModel) {
        return C5368e.m10257c(this.downloadFactory.create(this.downloadStateParser.parseDownloadAction(promotionViewApp.getDownloadModel().getAction()), promotionViewApp.getName(), promotionViewApp.getPackageName(), promotionViewApp.getMd5(), promotionViewApp.getAppIcon(), promotionViewApp.getVersionName(), promotionViewApp.getVersionCode(), promotionViewApp.getDownloadPath(), promotionViewApp.getAlternativePath(), promotionViewApp.getObb(), promotionViewApp.hasAppc(), promotionViewApp.getSize(), promotionViewApp.getSplits(), promotionViewApp.getRequiredSplits(), promotionViewApp.getRank(), promotionViewApp.getStoreName(), dynamicSplitsModel.getDynamicSplitsList()));
    }

    /* renamed from: a */
    public /* synthetic */ Single mo13732a(PromotionViewApp promotionViewApp, RoomDownload roomDownload) {
        return this.moPubAdsManager.getAdsVisibilityStatus().mo18564b(new C3835m2(this, roomDownload, promotionViewApp)).mo18569d(new C3899u2(roomDownload));
    }

    /* renamed from: a */
    public /* synthetic */ void mo13737a(RoomDownload roomDownload, PromotionViewApp promotionViewApp, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        mo13738a(roomDownload, promotionViewApp.getPackageName(), promotionViewApp.getAppId(), offerResponseStatus);
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo13735a(RoomDownload roomDownload) {
        return this.installManager.mo12771h(roomDownload);
    }

    /* renamed from: a */
    public /* synthetic */ Single mo13733a(String str, long j, RoomDownload roomDownload) {
        return this.moPubAdsManager.getAdsVisibilityStatus().mo18564b(new C3859p2(this, roomDownload, str, j)).mo18569d(new C3883s2(roomDownload));
    }

    /* renamed from: a */
    static /* synthetic */ String m6884a(RoomInstalled roomInstalled) {
        return roomInstalled != null ? roomInstalled.getSignature() : "";
    }
}
