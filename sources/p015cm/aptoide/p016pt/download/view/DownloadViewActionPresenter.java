package p015cm.aptoide.p016pt.download.view;

import java.util.List;
import kotlin.C4789l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.p016pt.aab.DynamicSplit;
import p015cm.aptoide.p016pt.aab.DynamicSplitsManager;
import p015cm.aptoide.p016pt.actions.PermissionManager;
import p015cm.aptoide.p016pt.actions.PermissionService;
import p015cm.aptoide.p016pt.ads.MoPubAdsManager;
import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.app.migration.AppcMigrationManager;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.database.room.RoomDownload;
import p015cm.aptoide.p016pt.database.room.RoomFileToDownload;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;
import p015cm.aptoide.p016pt.download.DownloadFactory;
import p015cm.aptoide.p016pt.download.InstallType;
import p015cm.aptoide.p016pt.download.Origin;
import p015cm.aptoide.p016pt.download.SplitAnalyticsMapper;
import p015cm.aptoide.p016pt.download.view.DownloadStatusModel;
import p015cm.aptoide.p016pt.install.InstallAnalytics;
import p015cm.aptoide.p016pt.install.InstallManager;
import p015cm.aptoide.p016pt.notification.NotificationAnalytics;
import p015cm.aptoide.p016pt.presenter.ActionPresenter;
import p015cm.aptoide.p016pt.presenter.View;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.p126m.C5378b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!¢\u0006\u0002\u0010\"J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0002H\u0002J,\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\f\u00103\u001a\b\u0012\u0004\u0012\u00020504H\u0002J\u0018\u00106\u001a\u00020*2\u0006\u0010/\u001a\u0002002\u0006\u00107\u001a\u000202H\u0002J\u0018\u00108\u001a\u00020*2\u0006\u0010/\u001a\u0002002\u0006\u00107\u001a\u000202H\u0002J\u0012\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010=\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0002H\u0002J\u0010\u0010>\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0002H\u0002J\u0010\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BH\u0002J\u000e\u0010C\u001a\u00020<2\u0006\u0010;\u001a\u00020BJ\u0010\u0010D\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0002H\u0002J\b\u0010E\u001a\u00020FH\u0014J\u0010\u0010G\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0002H\u0002J \u0010H\u001a\u00020F2\u0006\u0010I\u001a\u00020$2\u0006\u0010J\u001a\u00020(2\b\u0010%\u001a\u0004\u0018\u00010&J:\u0010K\u001a\u00020F2\u0006\u0010/\u001a\u00020.2\u0006\u0010L\u001a\u00020M2\u0006\u0010A\u001a\u00020B2\b\u00101\u001a\u0004\u0018\u0001022\b\u0010N\u001a\u0004\u0018\u00010&2\u0006\u0010O\u001a\u00020&R\u000e\u0010#\u001a\u00020$X.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000¨\u0006P"}, mo16641d2 = {"Lcm/aptoide/pt/download/view/DownloadViewActionPresenter;", "Lcm/aptoide/pt/presenter/ActionPresenter;", "Lcm/aptoide/pt/download/view/DownloadClick;", "installManager", "Lcm/aptoide/pt/install/InstallManager;", "moPubAdsManager", "Lcm/aptoide/pt/ads/MoPubAdsManager;", "permissionManager", "Lcm/aptoide/pt/actions/PermissionManager;", "appcMigrationManager", "Lcm/aptoide/pt/app/migration/AppcMigrationManager;", "downloadDialogProvider", "Lcm/aptoide/pt/download/view/DownloadDialogProvider;", "downloadNavigator", "Lcm/aptoide/pt/download/view/DownloadNavigator;", "permissionService", "Lcm/aptoide/pt/actions/PermissionService;", "ioScheduler", "Lrx/Scheduler;", "viewScheduler", "downloadFactory", "Lcm/aptoide/pt/download/DownloadFactory;", "downloadAnalytics", "Lcm/aptoide/pt/download/DownloadAnalytics;", "installAnalytics", "Lcm/aptoide/pt/install/InstallAnalytics;", "notificationAnalytics", "Lcm/aptoide/pt/notification/NotificationAnalytics;", "crashReport", "Lcm/aptoide/pt/crashreports/CrashReport;", "dynamicSplitsManager", "Lcm/aptoide/pt/aab/DynamicSplitsManager;", "splitAnalyticsMapper", "Lcm/aptoide/pt/download/SplitAnalyticsMapper;", "(Lcm/aptoide/pt/install/InstallManager;Lcm/aptoide/pt/ads/MoPubAdsManager;Lcm/aptoide/pt/actions/PermissionManager;Lcm/aptoide/pt/app/migration/AppcMigrationManager;Lcm/aptoide/pt/download/view/DownloadDialogProvider;Lcm/aptoide/pt/download/view/DownloadNavigator;Lcm/aptoide/pt/actions/PermissionService;Lrx/Scheduler;Lrx/Scheduler;Lcm/aptoide/pt/download/DownloadFactory;Lcm/aptoide/pt/download/DownloadAnalytics;Lcm/aptoide/pt/install/InstallAnalytics;Lcm/aptoide/pt/notification/NotificationAnalytics;Lcm/aptoide/pt/crashreports/CrashReport;Lcm/aptoide/pt/aab/DynamicSplitsManager;Lcm/aptoide/pt/download/SplitAnalyticsMapper;)V", "analyticsContext", "Lcm/aptoide/pt/download/DownloadAnalytics$AppContext;", "editorsChoicePosition", "", "isInApkfyContext", "", "cancelDownload", "Lrx/Completable;", "downloadClick", "createDownload", "Lrx/Observable;", "Lcm/aptoide/pt/database/room/RoomDownload;", "download", "Lcm/aptoide/pt/download/view/Download;", "offerResponseStatus", "Lcm/aptoide/pt/ads/WalletAdsOfferManager$OfferResponseStatus;", "dynamicSplitsList", "", "Lcm/aptoide/pt/aab/DynamicSplit;", "downgradeApp", "status", "downloadApp", "getOrigin", "Lcm/aptoide/pt/download/Origin;", "action", "", "handleOutOfSpaceError", "installApp", "mapDownloadAction", "Lcm/aptoide/pt/download/InstallType;", "downloadAction", "Lcm/aptoide/pt/download/view/DownloadStatusModel$Action;", "parseDownloadAction", "pauseDownload", "present", "", "resumeDownload", "setContextParams", "context", "isApkfy", "setupDownloadEvents", "appId", "", "storeName", "malwareRank", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.DownloadViewActionPresenter */
/* compiled from: DownloadViewActionPresenter.kt */
public class DownloadViewActionPresenter extends ActionPresenter<DownloadClick> {
    /* access modifiers changed from: private */
    public DownloadAnalytics.AppContext analyticsContext;
    /* access modifiers changed from: private */
    public final AppcMigrationManager appcMigrationManager;
    /* access modifiers changed from: private */
    public final CrashReport crashReport;
    /* access modifiers changed from: private */
    public final DownloadAnalytics downloadAnalytics;
    /* access modifiers changed from: private */
    public final DownloadDialogProvider downloadDialogProvider;
    /* access modifiers changed from: private */
    public final DownloadFactory downloadFactory;
    private final DownloadNavigator downloadNavigator;
    /* access modifiers changed from: private */
    public final DynamicSplitsManager dynamicSplitsManager;
    private String editorsChoicePosition;
    /* access modifiers changed from: private */
    public final InstallAnalytics installAnalytics;
    /* access modifiers changed from: private */
    public final InstallManager installManager;
    /* access modifiers changed from: private */
    public final C5373h ioScheduler;
    /* access modifiers changed from: private */
    public boolean isInApkfyContext;
    /* access modifiers changed from: private */
    public final MoPubAdsManager moPubAdsManager;
    private final NotificationAnalytics notificationAnalytics;
    /* access modifiers changed from: private */
    public final PermissionManager permissionManager;
    /* access modifiers changed from: private */
    public final PermissionService permissionService;
    /* access modifiers changed from: private */
    public final SplitAnalyticsMapper splitAnalyticsMapper;
    private final C5373h viewScheduler;

    @C4789l(mo16639bv = {1, 0, 3}, mo16642k = 3, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.download.view.DownloadViewActionPresenter$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[DownloadEvent.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[DownloadEvent.INSTALL.ordinal()] = 1;
            $EnumSwitchMapping$0[DownloadEvent.RESUME.ordinal()] = 2;
            $EnumSwitchMapping$0[DownloadEvent.PAUSE.ordinal()] = 3;
            $EnumSwitchMapping$0[DownloadEvent.CANCEL.ordinal()] = 4;
            $EnumSwitchMapping$0[DownloadEvent.GENERIC_ERROR.ordinal()] = 5;
            $EnumSwitchMapping$0[DownloadEvent.OUT_OF_SPACE_ERROR.ordinal()] = 6;
            int[] iArr2 = new int[DownloadStatusModel.Action.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[DownloadStatusModel.Action.MIGRATE.ordinal()] = 1;
            $EnumSwitchMapping$1[DownloadStatusModel.Action.UPDATE.ordinal()] = 2;
            $EnumSwitchMapping$1[DownloadStatusModel.Action.INSTALL.ordinal()] = 3;
            $EnumSwitchMapping$1[DownloadStatusModel.Action.DOWNGRADE.ordinal()] = 4;
            $EnumSwitchMapping$1[DownloadStatusModel.Action.OPEN.ordinal()] = 5;
            int[] iArr3 = new int[DownloadStatusModel.Action.values().length];
            $EnumSwitchMapping$2 = iArr3;
            iArr3[DownloadStatusModel.Action.DOWNGRADE.ordinal()] = 1;
            $EnumSwitchMapping$2[DownloadStatusModel.Action.INSTALL.ordinal()] = 2;
            $EnumSwitchMapping$2[DownloadStatusModel.Action.UPDATE.ordinal()] = 3;
            $EnumSwitchMapping$2[DownloadStatusModel.Action.MIGRATE.ordinal()] = 4;
            $EnumSwitchMapping$2[DownloadStatusModel.Action.OPEN.ordinal()] = 5;
            int[] iArr4 = new int[DownloadStatusModel.Action.values().length];
            $EnumSwitchMapping$3 = iArr4;
            iArr4[DownloadStatusModel.Action.INSTALL.ordinal()] = 1;
            $EnumSwitchMapping$3[DownloadStatusModel.Action.UPDATE.ordinal()] = 2;
            $EnumSwitchMapping$3[DownloadStatusModel.Action.DOWNGRADE.ordinal()] = 3;
            $EnumSwitchMapping$3[DownloadStatusModel.Action.MIGRATE.ordinal()] = 4;
        }
    }

    public DownloadViewActionPresenter(InstallManager installManager2, MoPubAdsManager moPubAdsManager2, PermissionManager permissionManager2, AppcMigrationManager appcMigrationManager2, DownloadDialogProvider downloadDialogProvider2, DownloadNavigator downloadNavigator2, PermissionService permissionService2, C5373h hVar, C5373h hVar2, DownloadFactory downloadFactory2, DownloadAnalytics downloadAnalytics2, InstallAnalytics installAnalytics2, NotificationAnalytics notificationAnalytics2, CrashReport crashReport2, DynamicSplitsManager dynamicSplitsManager2, SplitAnalyticsMapper splitAnalyticsMapper2) {
        InstallManager installManager3 = installManager2;
        MoPubAdsManager moPubAdsManager3 = moPubAdsManager2;
        PermissionManager permissionManager3 = permissionManager2;
        AppcMigrationManager appcMigrationManager3 = appcMigrationManager2;
        DownloadDialogProvider downloadDialogProvider3 = downloadDialogProvider2;
        DownloadNavigator downloadNavigator3 = downloadNavigator2;
        PermissionService permissionService3 = permissionService2;
        C5373h hVar3 = hVar;
        C5373h hVar4 = hVar2;
        DownloadFactory downloadFactory3 = downloadFactory2;
        DownloadAnalytics downloadAnalytics3 = downloadAnalytics2;
        InstallAnalytics installAnalytics3 = installAnalytics2;
        NotificationAnalytics notificationAnalytics3 = notificationAnalytics2;
        CrashReport crashReport3 = crashReport2;
        C10202j.m34178b(installManager3, "installManager");
        C10202j.m34178b(moPubAdsManager3, "moPubAdsManager");
        C10202j.m34178b(permissionManager3, "permissionManager");
        C10202j.m34178b(appcMigrationManager3, "appcMigrationManager");
        C10202j.m34178b(downloadDialogProvider3, "downloadDialogProvider");
        C10202j.m34178b(downloadNavigator3, "downloadNavigator");
        C10202j.m34178b(permissionService3, "permissionService");
        C10202j.m34178b(hVar3, "ioScheduler");
        C10202j.m34178b(hVar4, "viewScheduler");
        C10202j.m34178b(downloadFactory3, "downloadFactory");
        C10202j.m34178b(downloadAnalytics3, "downloadAnalytics");
        C10202j.m34178b(installAnalytics3, "installAnalytics");
        C10202j.m34178b(notificationAnalytics3, "notificationAnalytics");
        C10202j.m34178b(crashReport3, "crashReport");
        C10202j.m34178b(dynamicSplitsManager2, "dynamicSplitsManager");
        SplitAnalyticsMapper splitAnalyticsMapper3 = splitAnalyticsMapper2;
        C10202j.m34178b(splitAnalyticsMapper3, "splitAnalyticsMapper");
        this.installManager = installManager3;
        this.moPubAdsManager = moPubAdsManager3;
        this.permissionManager = permissionManager3;
        this.appcMigrationManager = appcMigrationManager3;
        this.downloadDialogProvider = downloadDialogProvider3;
        this.downloadNavigator = downloadNavigator3;
        this.permissionService = permissionService3;
        this.ioScheduler = hVar3;
        this.viewScheduler = hVar4;
        this.downloadFactory = downloadFactory3;
        this.downloadAnalytics = downloadAnalytics3;
        this.installAnalytics = installAnalytics3;
        this.notificationAnalytics = notificationAnalytics3;
        this.crashReport = crashReport3;
        this.dynamicSplitsManager = dynamicSplitsManager2;
        this.splitAnalyticsMapper = splitAnalyticsMapper3;
    }

    public static final /* synthetic */ DownloadAnalytics.AppContext access$getAnalyticsContext$p(DownloadViewActionPresenter downloadViewActionPresenter) {
        DownloadAnalytics.AppContext appContext = downloadViewActionPresenter.analyticsContext;
        if (appContext != null) {
            return appContext;
        }
        C10202j.m34181d("analyticsContext");
        throw null;
    }

    /* access modifiers changed from: private */
    public final C5328b cancelDownload(DownloadClick downloadClick) {
        C5328b a = C5328b.m10169d(new DownloadViewActionPresenter$cancelDownload$1(this, downloadClick)).mo18587a(this.installManager.cancelInstall(downloadClick.getDownload().getMd5(), downloadClick.getDownload().getPackageName(), downloadClick.getDownload().getVersionCode()));
        C10202j.m34174a((Object) a, "Completable.fromAction {…versionCode\n      )\n    )");
        return a;
    }

    /* access modifiers changed from: private */
    public final C5368e<RoomDownload> createDownload(Download download, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, List<DynamicSplit> list) {
        C5368e<R> a = C5368e.m10257c(list).mo18687f(new DownloadViewActionPresenter$createDownload$1(this, download, list)).mo18649a((C5378b<? super Throwable>) new DownloadViewActionPresenter$createDownload$2(this, download, offerResponseStatus, list));
        C10202j.m34174a((Object) a, "Observable.just(dynamicS…      )\n        }\n      }");
        return a;
    }

    /* access modifiers changed from: private */
    public final C5328b downgradeApp(Download download, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        C5328b k = this.downloadDialogProvider.showDowngradeDialog().mo18681d(DownloadViewActionPresenter$downgradeApp$1.INSTANCE).mo18664b(new DownloadViewActionPresenter$downgradeApp$2(this)).mo18689g(new DownloadViewActionPresenter$downgradeApp$3(this, download, offerResponseStatus)).mo18696k();
        C10202j.m34174a((Object) k, "downloadDialogProvider.s… }\n      .toCompletable()");
        return k;
    }

    /* access modifiers changed from: private */
    public final C5328b downloadApp(Download download, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        C5328b k = C5368e.m10248a(new DownloadViewActionPresenter$downloadApp$1(this, download)).mo18644a(this.viewScheduler).mo18687f(new DownloadViewActionPresenter$downloadApp$2(this, download, offerResponseStatus)).mo18696k();
        C10202j.m34174a((Object) k, "Observable.defer {\n     … }\n      .toCompletable()");
        return k;
    }

    private final Origin getOrigin(int i) {
        if (i == 0) {
            return Origin.INSTALL;
        }
        if (i == 1) {
            return Origin.UPDATE;
        }
        if (i != 2) {
            return Origin.INSTALL;
        }
        return Origin.DOWNGRADE;
    }

    /* access modifiers changed from: private */
    public final C5328b handleOutOfSpaceError(DownloadClick downloadClick) {
        C5328b a = C5328b.m10169d(new DownloadViewActionPresenter$handleOutOfSpaceError$1(this, downloadClick)).mo18587a(this.downloadNavigator.openOutOfSpaceDialog(downloadClick.getDownload().getSize(), downloadClick.getDownload().getPackageName())).mo18593a(this.downloadNavigator.outOfSpaceDialogResult().mo18681d(DownloadViewActionPresenter$handleOutOfSpaceError$2.INSTANCE)).mo18669c().mo18696k().mo18587a(resumeDownload(downloadClick)).mo18590a((C5378b<? super Throwable>) DownloadViewActionPresenter$handleOutOfSpaceError$3.INSTANCE);
        C10202j.m34174a((Object) a, "Completable.fromAction {…printStackTrace()\n      }");
        return a;
    }

    /* access modifiers changed from: private */
    public final C5328b installApp(DownloadClick downloadClick) {
        DownloadStatusModel downloadModel = downloadClick.getDownload().getDownloadModel();
        DownloadStatusModel.Action action = downloadModel != null ? downloadModel.getAction() : null;
        if (action != null) {
            int i = WhenMappings.$EnumSwitchMapping$1[action.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                C5328b b = this.moPubAdsManager.getAdsVisibilityStatus().mo18566b(new DownloadViewActionPresenter$installApp$1(this, downloadClick));
                C10202j.m34174a((Object) b, "moPubAdsManager.adsVisib…Click.download, status) }");
                return b;
            } else if (i == 4) {
                C5328b b2 = this.moPubAdsManager.getAdsVisibilityStatus().mo18566b(new DownloadViewActionPresenter$installApp$2(this, downloadClick));
                C10202j.m34174a((Object) b2, "moPubAdsManager.adsVisib…Click.download, status) }");
                return b2;
            } else if (i == 5) {
                return this.downloadNavigator.openApp(downloadClick.getDownload().getPackageName());
            }
        }
        C5328b f = C5328b.m10170f();
        C10202j.m34174a((Object) f, "Completable.complete()");
        return f;
    }

    /* access modifiers changed from: private */
    public final InstallType mapDownloadAction(DownloadStatusModel.Action action) {
        int i = WhenMappings.$EnumSwitchMapping$2[action.ordinal()];
        if (i == 1) {
            return InstallType.DOWNGRADE;
        }
        if (i == 2) {
            return InstallType.INSTALL;
        }
        if (i == 3) {
            return InstallType.UPDATE;
        }
        if (i == 4 || i == 5) {
            throw new IllegalStateException("Mapping an invalid download action " + action.name());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* access modifiers changed from: private */
    public final C5328b pauseDownload(DownloadClick downloadClick) {
        C5328b a = C5328b.m10169d(new DownloadViewActionPresenter$pauseDownload$1(this, downloadClick)).mo18587a(this.installManager.pauseInstall(downloadClick.getDownload().getMd5()));
        C10202j.m34174a((Object) a, "Completable.fromAction {…nloadClick.download.md5))");
        return a;
    }

    /* access modifiers changed from: private */
    public final C5328b resumeDownload(DownloadClick downloadClick) {
        C5328b b = this.installManager.getDownload(downloadClick.getDownload().getMd5()).mo18559a(new DownloadViewActionPresenter$resumeDownload$1(this, downloadClick)).mo18558a((C5378b<Throwable>) DownloadViewActionPresenter$resumeDownload$2.INSTANCE).mo18566b(new DownloadViewActionPresenter$resumeDownload$3(this));
        C10202j.m34174a((Object) b, "installManager.getDownlo…nager.install(download) }");
        return b;
    }

    public final int parseDownloadAction(DownloadStatusModel.Action action) {
        C10202j.m34178b(action, "action");
        int i = WhenMappings.$EnumSwitchMapping$3[action.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3 || i == 4) {
            return 2;
        }
        throw new IllegalArgumentException("Invalid action " + action);
    }

    /* access modifiers changed from: protected */
    public void present() {
        if (this.analyticsContext != null) {
            getLifecycleView().getLifecycleEvent().mo18681d(DownloadViewActionPresenter$present$2.INSTANCE).mo18687f(new DownloadViewActionPresenter$present$3(this)).mo18641a(getLifecycleView().bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(DownloadViewActionPresenter$present$4.INSTANCE, (C5378b<Throwable>) new DownloadViewActionPresenter$present$5(this));
            return;
        }
        throw new IllegalStateException("setContextParams must be called!");
    }

    public final void setContextParams(DownloadAnalytics.AppContext appContext, boolean z, String str) {
        C10202j.m34178b(appContext, "context");
        this.analyticsContext = appContext;
        this.isInApkfyContext = z;
        this.editorsChoicePosition = str;
    }

    public final void setupDownloadEvents(RoomDownload roomDownload, long j, DownloadStatusModel.Action action, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, String str, String str2) {
        long j2 = j;
        DownloadStatusModel.Action action2 = action;
        C10202j.m34178b(roomDownload, DownloadAnalytics.RAKAM_DOWNLOAD_EVENT);
        C10202j.m34178b(action2, "downloadAction");
        C10202j.m34178b(str2, "malwareRank");
        int campaignId = this.notificationAnalytics.getCampaignId(roomDownload.getPackageName(), j2);
        String abTestingGroup = this.notificationAnalytics.getAbTestingGroup(roomDownload.getPackageName(), j2);
        InstallAnalytics installAnalytics2 = this.installAnalytics;
        String packageName = roomDownload.getPackageName();
        int versionCode = roomDownload.getVersionCode();
        AnalyticsManager.Action action3 = AnalyticsManager.Action.INSTALL;
        DownloadAnalytics.AppContext appContext = this.analyticsContext;
        if (appContext != null) {
            Origin origin = getOrigin(roomDownload.getAction());
            boolean z = action2 == DownloadStatusModel.Action.MIGRATE;
            boolean hasAppc = roomDownload.hasAppc();
            boolean hasSplits = roomDownload.hasSplits();
            String valueOf = String.valueOf(offerResponseStatus);
            boolean z2 = this.isInApkfyContext;
            boolean hasObbs = roomDownload.hasObbs();
            SplitAnalyticsMapper splitAnalyticsMapper2 = this.splitAnalyticsMapper;
            List<RoomFileToDownload> splits = roomDownload.getSplits();
            C10202j.m34174a((Object) splits, "download.splits");
            installAnalytics2.installStarted(packageName, versionCode, action3, appContext, origin, campaignId, abTestingGroup, z, hasAppc, hasSplits, valueOf, str2, str, z2, hasObbs, splitAnalyticsMapper2.getSplitTypesAsString(splits));
            if (DownloadStatusModel.Action.MIGRATE == action2) {
                DownloadAnalytics downloadAnalytics2 = this.downloadAnalytics;
                String md5 = roomDownload.getMd5();
                int versionCode2 = roomDownload.getVersionCode();
                String packageName2 = roomDownload.getPackageName();
                String str3 = this.editorsChoicePosition;
                InstallType installType = InstallType.UPDATE_TO_APPC;
                AnalyticsManager.Action action4 = AnalyticsManager.Action.INSTALL;
                boolean hasAppc2 = roomDownload.hasAppc();
                boolean hasSplits2 = roomDownload.hasSplits();
                boolean z3 = this.isInApkfyContext;
                boolean hasObbs2 = roomDownload.hasObbs();
                SplitAnalyticsMapper splitAnalyticsMapper3 = this.splitAnalyticsMapper;
                List<RoomFileToDownload> splits2 = roomDownload.getSplits();
                C10202j.m34174a((Object) splits2, "download.splits");
                downloadAnalytics2.migrationClicked(md5, versionCode2, packageName2, str2, str3, installType, action4, offerResponseStatus, hasAppc2, hasSplits2, str, z3, hasObbs2, splitAnalyticsMapper3.getSplitTypesAsString(splits2));
                DownloadAnalytics downloadAnalytics3 = this.downloadAnalytics;
                DownloadAnalytics.AppContext appContext2 = this.analyticsContext;
                if (appContext2 != null) {
                    downloadAnalytics3.downloadStartEvent(roomDownload, campaignId, abTestingGroup, appContext2, AnalyticsManager.Action.INSTALL, true, this.isInApkfyContext);
                } else {
                    C10202j.m34181d("analyticsContext");
                    throw null;
                }
            } else {
                DownloadAnalytics downloadAnalytics4 = this.downloadAnalytics;
                String md52 = roomDownload.getMd5();
                int versionCode3 = roomDownload.getVersionCode();
                String packageName3 = roomDownload.getPackageName();
                String str4 = this.editorsChoicePosition;
                InstallType mapDownloadAction = mapDownloadAction(action2);
                AnalyticsManager.Action action5 = AnalyticsManager.Action.INSTALL;
                boolean hasAppc3 = roomDownload.hasAppc();
                boolean hasSplits3 = roomDownload.hasSplits();
                boolean z4 = this.isInApkfyContext;
                boolean hasObbs3 = roomDownload.hasObbs();
                SplitAnalyticsMapper splitAnalyticsMapper4 = this.splitAnalyticsMapper;
                List<RoomFileToDownload> splits3 = roomDownload.getSplits();
                C10202j.m34174a((Object) splits3, "download.splits");
                downloadAnalytics4.installClicked(md52, versionCode3, packageName3, str2, str4, mapDownloadAction, action5, offerResponseStatus, hasAppc3, hasSplits3, str, z4, hasObbs3, splitAnalyticsMapper4.getSplitTypesAsString(splits3));
                DownloadAnalytics downloadAnalytics5 = this.downloadAnalytics;
                DownloadAnalytics.AppContext appContext3 = this.analyticsContext;
                if (appContext3 != null) {
                    downloadAnalytics5.downloadStartEvent(roomDownload, campaignId, abTestingGroup, appContext3, AnalyticsManager.Action.INSTALL, false, this.isInApkfyContext);
                } else {
                    C10202j.m34181d("analyticsContext");
                    throw null;
                }
            }
        } else {
            C10202j.m34181d("analyticsContext");
            throw null;
        }
    }
}
