package p015cm.aptoide.p016pt.editorial;

import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.p016pt.aab.DynamicSplitsManager;
import p015cm.aptoide.p016pt.aab.DynamicSplitsModel;
import p015cm.aptoide.p016pt.ads.MoPubAdsManager;
import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.app.DownloadStateParser;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;
import p015cm.aptoide.p016pt.download.DownloadFactory;
import p015cm.aptoide.p016pt.download.SplitAnalyticsMapper;
import p015cm.aptoide.p016pt.install.Install;
import p015cm.aptoide.p016pt.install.InstallAnalytics;
import p015cm.aptoide.p016pt.install.InstallManager;
import p015cm.aptoide.p016pt.notification.NotificationAnalytics;
import p015cm.aptoide.p016pt.reactions.ReactionsManager;
import p015cm.aptoide.p016pt.reactions.network.LoadReactionModel;
import p015cm.aptoide.p016pt.reactions.network.ReactionsResponse;
import p015cm.aptoide.p016pt.view.EditorialConfiguration;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;
import p322p.p323a.p324a.p325a.C10832d;

/* renamed from: cm.aptoide.pt.editorial.EditorialManager */
public class EditorialManager {
    private final DownloadFactory downloadFactory;
    private final DownloadStateParser downloadStateParser;
    private final DynamicSplitsManager dynamicSplitsManager;
    private final EditorialAnalytics editorialAnalytics;
    private final EditorialConfiguration editorialConfiguration;
    private final EditorialRepository editorialRepository;
    private final InstallAnalytics installAnalytics;
    private final InstallManager installManager;
    private final MoPubAdsManager moPubAdsManager;
    private final NotificationAnalytics notificationAnalytics;
    private final ReactionsManager reactionsManager;
    private final SplitAnalyticsMapper splitAnalyticsMapper;

    public EditorialManager(EditorialRepository editorialRepository2, EditorialConfiguration editorialConfiguration2, InstallManager installManager2, DownloadFactory downloadFactory2, DownloadStateParser downloadStateParser2, NotificationAnalytics notificationAnalytics2, InstallAnalytics installAnalytics2, EditorialAnalytics editorialAnalytics2, ReactionsManager reactionsManager2, MoPubAdsManager moPubAdsManager2, DynamicSplitsManager dynamicSplitsManager2, SplitAnalyticsMapper splitAnalyticsMapper2) {
        this.editorialRepository = editorialRepository2;
        this.editorialConfiguration = editorialConfiguration2;
        this.installManager = installManager2;
        this.downloadFactory = downloadFactory2;
        this.downloadStateParser = downloadStateParser2;
        this.notificationAnalytics = notificationAnalytics2;
        this.installAnalytics = installAnalytics2;
        this.editorialAnalytics = editorialAnalytics2;
        this.reactionsManager = reactionsManager2;
        this.moPubAdsManager = moPubAdsManager2;
        this.dynamicSplitsManager = dynamicSplitsManager2;
        this.splitAnalyticsMapper = splitAnalyticsMapper2;
    }

    /* renamed from: a */
    static /* synthetic */ RoomDownload m5515a(RoomDownload roomDownload, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        return roomDownload;
    }

    /* renamed from: b */
    static /* synthetic */ RoomDownload m5516b(RoomDownload roomDownload, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        return roomDownload;
    }

    private void setupDownloadEvents(RoomDownload roomDownload, String str, long j, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, String str2, String str3, String str4) {
        String str5 = str;
        long j2 = j;
        int campaignId = this.notificationAnalytics.getCampaignId(str5, j2);
        String abTestingGroup = this.notificationAnalytics.getAbTestingGroup(str5, j2);
        this.editorialAnalytics.setupDownloadEvents(roomDownload, campaignId, abTestingGroup, AnalyticsManager.Action.CLICK, offerResponseStatus, str2, str3, str4);
        this.installAnalytics.installStarted(roomDownload.getPackageName(), roomDownload.getVersionCode(), AnalyticsManager.Action.INSTALL, DownloadAnalytics.AppContext.EDITORIAL, this.downloadStateParser.getOrigin(roomDownload.getAction()), campaignId, abTestingGroup, false, roomDownload.hasAppc(), roomDownload.hasSplits(), offerResponseStatus.toString(), roomDownload.getTrustedBadge(), roomDownload.getStoreName(), false, roomDownload.hasObbs(), this.splitAnalyticsMapper.getSplitTypesAsString(roomDownload.getSplits()));
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo11122a(EditorialDownloadEvent editorialDownloadEvent, DynamicSplitsModel dynamicSplitsModel) {
        return C5368e.m10257c(this.downloadFactory.create(this.downloadStateParser.parseDownloadAction(editorialDownloadEvent.getAction()), editorialDownloadEvent.getAppName(), editorialDownloadEvent.getPackageName(), editorialDownloadEvent.getMd5(), editorialDownloadEvent.getIcon(), editorialDownloadEvent.getVerName(), editorialDownloadEvent.getVerCode(), editorialDownloadEvent.getPath(), editorialDownloadEvent.getPathAlt(), editorialDownloadEvent.getObb(), false, editorialDownloadEvent.getSize(), editorialDownloadEvent.getSplits(), editorialDownloadEvent.getRequiredSplits(), editorialDownloadEvent.getTrustedBadge(), editorialDownloadEvent.getTrustedBadge(), dynamicSplitsModel.getDynamicSplitsList()));
    }

    public void allowRootInstall(Boolean bool) {
        this.installManager.rootInstallAllowed(bool.booleanValue());
    }

    /* renamed from: b */
    public /* synthetic */ C5328b mo11126b(RoomDownload roomDownload) {
        return this.installManager.mo12771h(roomDownload);
    }

    public C5328b cancelDownload(String str, String str2, int i) {
        return this.installManager.cancelInstall(str, str2, i);
    }

    public Single<ReactionsResponse> deleteReaction(String str, String str2) {
        return this.reactionsManager.deleteReaction(str, str2);
    }

    public C5328b downloadApp(EditorialDownloadEvent editorialDownloadEvent) {
        return C10832d.m36727a(this.dynamicSplitsManager.getAppSplitsByMd5(editorialDownloadEvent.getMd5())).mo18568c(new C2512p0(this, editorialDownloadEvent)).mo18692i(new C2456i0(this, editorialDownloadEvent)).mo18689g(new C2480l0(this)).mo18696k();
    }

    public Single<Boolean> isFirstReaction(String str, String str2) {
        return this.reactionsManager.isFirstReaction(str, str2);
    }

    public C5368e<EditorialDownloadModel> loadDownloadModel(String str, String str2, int i, int i2) {
        return this.installManager.getInstall(str, str2, i).mo18694j(new C2464j0(this, i2));
    }

    public Single<EditorialViewModel> loadEditorialViewModel() {
        return this.editorialRepository.loadEditorialViewModel(this.editorialConfiguration.getLoadSource());
    }

    public Single<LoadReactionModel> loadReactionModel(String str, String str2) {
        return this.reactionsManager.loadReactionModel(str, str2);
    }

    public C5328b pauseDownload(String str) {
        return this.installManager.pauseInstall(str);
    }

    public C5328b resumeDownload(String str, String str2, long j, String str3) {
        return this.installManager.getDownload(str).mo18559a(new C2520q0(this, str2, j, str3)).mo18566b(new C2488m0(this));
    }

    public Single<ReactionsResponse> setReaction(String str, String str2, String str3) {
        return this.reactionsManager.setReaction(str, str2, str3);
    }

    public boolean shouldShowRootInstallWarningPopup() {
        return this.installManager.showWarning();
    }

    /* renamed from: a */
    public /* synthetic */ Single mo11119a(EditorialDownloadEvent editorialDownloadEvent, RoomDownload roomDownload) {
        return this.moPubAdsManager.getAdsVisibilityStatus().mo18564b(new C2504o0(this, roomDownload, editorialDownloadEvent)).mo18569d(new C2496n0(roomDownload));
    }

    /* renamed from: a */
    public /* synthetic */ void mo11123a(RoomDownload roomDownload, EditorialDownloadEvent editorialDownloadEvent, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        setupDownloadEvents(roomDownload, editorialDownloadEvent.getPackageName(), editorialDownloadEvent.getAppId(), offerResponseStatus, editorialDownloadEvent.getTrustedBadge(), editorialDownloadEvent.getStoreName(), editorialDownloadEvent.getAction().toString());
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo11121a(RoomDownload roomDownload) {
        return this.installManager.mo12771h(roomDownload);
    }

    /* renamed from: a */
    public /* synthetic */ EditorialDownloadModel mo11118a(int i, Install install) {
        return new EditorialDownloadModel(this.downloadStateParser.parseDownloadType(install.getType(), false), install.getProgress(), this.downloadStateParser.parseDownloadState(install.getState(), install.isIndeterminate()), i, install.getAppSize());
    }

    /* renamed from: a */
    public /* synthetic */ Single mo11120a(String str, long j, String str2, RoomDownload roomDownload) {
        return this.moPubAdsManager.getAdsVisibilityStatus().mo18564b(new C2528r0(this, roomDownload, str, j, str2)).mo18569d(new C2472k0(roomDownload));
    }

    /* renamed from: a */
    public /* synthetic */ void mo11124a(RoomDownload roomDownload, String str, long j, String str2, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        setupDownloadEvents(roomDownload, str, j, offerResponseStatus, roomDownload.getTrustedBadge(), roomDownload.getStoreName(), str2);
    }
}
