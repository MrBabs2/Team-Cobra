package p015cm.aptoide.p016pt.promotions;

import java.util.List;
import p015cm.aptoide.p016pt.actions.PermissionManager;
import p015cm.aptoide.p016pt.actions.PermissionService;
import p015cm.aptoide.p016pt.ads.MoPubAdsManager;
import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.download.view.outofspace.OutOfSpaceNavigatorWrapper;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.presenter.View;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.Single;
import p123rx.exceptions.OnErrorNotImplementedException;
import p123rx.p126m.C5378b;
import p123rx.schedulers.Schedulers;

/* renamed from: cm.aptoide.pt.promotions.PromotionsPresenter */
public class PromotionsPresenter implements Presenter {
    private final MoPubAdsManager moPubAdsManager;
    private final PermissionManager permissionManager;
    private final PermissionService permissionService;
    private String promotionId;
    private final String promotionType;
    private final PromotionsAnalytics promotionsAnalytics;
    private final PromotionsManager promotionsManager;
    private final PromotionsNavigator promotionsNavigator;
    private final PromotionsView view;
    private final C5373h viewScheduler;

    public PromotionsPresenter(PromotionsView promotionsView, PromotionsManager promotionsManager2, PermissionManager permissionManager2, PermissionService permissionService2, C5373h hVar, PromotionsAnalytics promotionsAnalytics2, PromotionsNavigator promotionsNavigator2, String str, MoPubAdsManager moPubAdsManager2) {
        this.view = promotionsView;
        this.promotionsManager = promotionsManager2;
        this.permissionManager = permissionManager2;
        this.permissionService = permissionService2;
        this.viewScheduler = hVar;
        this.promotionsAnalytics = promotionsAnalytics2;
        this.promotionsNavigator = promotionsNavigator2;
        this.promotionType = str;
        this.moPubAdsManager = moPubAdsManager2;
    }

    /* renamed from: a */
    static /* synthetic */ PromotionsModel m6899a(PromotionsModel promotionsModel, Boolean bool) {
        return promotionsModel;
    }

    /* renamed from: a */
    static /* synthetic */ Iterable m6901a(List list) {
        return list;
    }

    /* renamed from: a */
    static /* synthetic */ void m6904a(String str) {
    }

    /* renamed from: b */
    static /* synthetic */ PromotionViewApp m6905b(PromotionViewApp promotionViewApp, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        return promotionViewApp;
    }

    /* renamed from: b */
    static /* synthetic */ PromotionsModel m6906b(PromotionsModel promotionsModel, PromotionApp promotionApp) {
        return promotionsModel;
    }

    /* renamed from: b */
    static /* synthetic */ void m6910b(ClaimDialogResultWrapper claimDialogResultWrapper) {
    }

    /* renamed from: b */
    static /* synthetic */ void m6911b(PromotionAppClick promotionAppClick) {
    }

    /* renamed from: c */
    static /* synthetic */ PromotionsModel m6912c(PromotionsModel promotionsModel, PromotionViewApp promotionViewApp) {
        return promotionsModel;
    }

    /* renamed from: c */
    static /* synthetic */ void m6915c(Throwable th) {
    }

    private void cancelDownload() {
        this.view.getLifecycleEvent().mo18681d(C3924x3.f7004f).mo18687f(new C3783f6(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3806i5.f6868f, (C5378b<Throwable>) C3781f4.f6838f);
    }

    private void claimApp() {
        this.view.getLifecycleEvent().mo18681d(C3764d3.f6815f).mo18687f(new C3759c6(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3765d4.f6816f, (C5378b<Throwable>) C3916w3.f6995f);
    }

    /* renamed from: d */
    static /* synthetic */ void m6916d(PromotionApp promotionApp) {
    }

    /* renamed from: d */
    static /* synthetic */ void m6917d(PromotionsModel promotionsModel) {
    }

    /* renamed from: d */
    static /* synthetic */ void m6918d(Throwable th) {
    }

    /* access modifiers changed from: private */
    /* renamed from: downloadApp */
    public C5328b mo13811f(PromotionViewApp promotionViewApp) {
        return C5368e.m10248a(new C3822k5(this)).mo18644a(this.viewScheduler).mo18687f(new C3813j4(this)).mo18687f(new C3820k3(this)).mo18644a(Schedulers.m10352io()).mo18689g(new C3860p3(this, promotionViewApp)).mo18696k();
    }

    /* renamed from: e */
    static /* synthetic */ void m6920e(PromotionsModel promotionsModel) {
    }

    /* renamed from: f */
    static /* synthetic */ void m6923f(Void voidR) {
    }

    /* renamed from: g */
    static /* synthetic */ void m6925g(Void voidR) {
    }

    private void getPromotionApps() {
        this.view.getLifecycleEvent().mo18681d(C3942z5.f7025f).mo18664b(new C3830l5(this)).mo18692i(new C3845n4(this)).mo18664b(new C3796h3(this)).mo18664b(new C3932y3(this)).mo18644a(this.viewScheduler).mo18687f(new C3878r5(this)).mo18649a((C5378b<? super Throwable>) new C3740a5(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3797h4.f6856f, (C5378b<Throwable>) C3742a7.f6788f);
    }

    /* renamed from: h */
    static /* synthetic */ void m6926h(Throwable th) {
    }

    private void handleClickOnAppCard() {
        this.view.getLifecycleEvent().mo18681d(C3917w4.f6996f).mo18687f(new C3877r4(this)).mo18664b(new C3869q4(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3757c4.f6807f, (C5378b<Throwable>) C3814j5.f6878f);
    }

    private C5368e<PromotionsModel> handleDownloadErrors(PromotionsModel promotionsModel) {
        return C5368e.m10254b(this.view.installButtonClick(), this.view.resumeDownload()).mo18687f(new C3767d6(this, promotionsModel)).mo18694j(new C3863p6(promotionsModel));
    }

    private void handleOutOfSpaceDialog() {
        this.view.getLifecycleEvent().mo18681d(C3838m5.f6908f).mo18687f(new C3886s5(this)).mo18681d(C3774e5.f6828f).mo18687f(new C3812j3(this)).mo18686f().mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3837m4.f6907f, (C5378b<Throwable>) C3925x4.f7005f);
    }

    private C5368e<PromotionsModel> handlePromotionApps(PromotionsModel promotionsModel) {
        return C5368e.m10257c(promotionsModel).mo18691h(new C3799h6(promotionsModel)).mo18681d(C3893t4.f6972f).mo18664b(new C3780f3(this, promotionsModel)).mo18694j(new C3876r3(promotionsModel)).mo18687f(new C3885s4(this, promotionsModel));
    }

    private void handlePromotionClaimResult() {
        this.view.getLifecycleEvent().mo18681d(C3791g6.f6849f).mo18687f(new C3839m6(this)).mo18681d(C3751b7.f6800f).mo18664b(new C3910v5(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3871q6.f6946f, (C5378b<Throwable>) C3836m3.f6906f);
    }

    private void handlePromotionOverDialogClick() {
        this.view.getLifecycleEvent().mo18681d(C3887s6.f6964f).mo18687f(new C3741a6(this)).mo18664b(new C3852o3(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3855o6.f6926f, (C5378b<Throwable>) C3862p5.f6937f);
    }

    private void handleRetryClick() {
        this.view.getLifecycleEvent().mo18681d(C3807i6.f6869f).mo18687f(new C3854o5(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3918w5.f6997f, (C5378b<Throwable>) C3742a7.f6788f);
    }

    /* renamed from: i */
    static /* synthetic */ void m6927i(PromotionViewApp promotionViewApp) {
    }

    private void installButtonClick() {
        this.view.getLifecycleEvent().mo18681d(C3750b6.f6799f).mo18687f(new C3853o4(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3868q3.f6943f, (C5378b<Throwable>) C3895t6.f6974f);
    }

    /* renamed from: m */
    static /* synthetic */ Boolean m6935m(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: m */
    static /* synthetic */ void m6936m(PromotionViewApp promotionViewApp) {
    }

    /* renamed from: m */
    static /* synthetic */ void m6937m(Throwable th) {
    }

    /* renamed from: n */
    static /* synthetic */ Boolean m6938n(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: n */
    static /* synthetic */ void m6939n(PromotionViewApp promotionViewApp) {
    }

    private void pauseDownload() {
        this.view.getLifecycleEvent().mo18681d(C3758c5.f6808f).mo18687f(new C3766d5(this)).mo18644a(this.viewScheduler).mo18649a((C5378b<? super Throwable>) C3934y5.f7016f).mo18686f().mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3901u4.f6980f, (C5378b<Throwable>) C3847n6.f6917f);
    }

    private void resumeDownload() {
        this.view.getLifecycleEvent().mo18681d(C3823k6.f6888f).mo18687f(new C3789g4(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3884s3.f6960f, (C5378b<Throwable>) C3788g3.f6846f);
    }

    /* access modifiers changed from: private */
    public Single<? extends String> showClaimView(PromotionViewApp promotionViewApp) {
        String str = this.promotionId;
        if (str != null) {
            return Single.m10119a(str).mo18564b(new C3940z3(this, promotionViewApp));
        }
        return this.promotionsManager.getPromotionsModel(this.promotionType).mo18569d(C3734a.f6778f).mo18564b(new C3892t3(this, promotionViewApp));
    }

    /* access modifiers changed from: private */
    public C5368e<? extends PromotionsModel> showPromotions(PromotionsModel promotionsModel) {
        if (promotionsModel.getAppsList().isEmpty()) {
            this.view.showPromotionOverDialog();
            return C5368e.m10265n();
        }
        this.view.setPromotionMessage(promotionsModel.getDescription());
        this.view.showPromotionTitle(promotionsModel.getTitle());
        this.view.showPromotionFeatureGraphic(promotionsModel.getFeatureGraphic());
        return C5368e.m10258c(handlePromotionApps(promotionsModel), handleDownloadErrors(promotionsModel));
    }

    /* access modifiers changed from: private */
    public C5368e<PromotionViewApp> verifyNotEnoughSpaceError(PromotionViewApp promotionViewApp) {
        if (promotionViewApp.getDownloadModel().getDownloadState() == DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR) {
            return this.moPubAdsManager.getAdsVisibilityStatus().mo18564b(new C3926x5(this, promotionViewApp)).mo18567c().mo18694j(new C3756c3(promotionViewApp));
        }
        return C5368e.m10257c(promotionViewApp);
    }

    /* renamed from: w */
    static /* synthetic */ Boolean m6948w(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo13775a(OutOfSpaceNavigatorWrapper outOfSpaceNavigatorWrapper) {
        return this.promotionsManager.getPromotionApps(this.promotionId).mo18567c().mo18691h(C3879r6.f6954f).mo18681d(new C3846n5(outOfSpaceNavigatorWrapper)).mo18689g(new C3798h5(this));
    }

    /* renamed from: c */
    public /* synthetic */ void mo13801c(View.LifecycleEvent lifecycleEvent) {
        this.view.showLoading();
    }

    /* renamed from: d */
    public /* synthetic */ Single mo13805d(View.LifecycleEvent lifecycleEvent) {
        return this.promotionsManager.getPromotionsModel(this.promotionType);
    }

    /* renamed from: e */
    public /* synthetic */ C5368e mo13809e(Void voidR) {
        return this.permissionManager.requestExternalStoragePermission(this.permissionService);
    }

    /* renamed from: f */
    public /* synthetic */ C5368e mo13812f(View.LifecycleEvent lifecycleEvent) {
        return this.promotionsNavigator.outOfSpaceDialogResult();
    }

    /* renamed from: g */
    public /* synthetic */ C5328b mo13813g(PromotionViewApp promotionViewApp) {
        return this.promotionsManager.pauseDownload(promotionViewApp.getMd5());
    }

    /* renamed from: h */
    public /* synthetic */ C5368e mo13816h(PromotionViewApp promotionViewApp) {
        return this.permissionManager.requestDownloadAccess(this.permissionService).mo18687f(new C3844n3(this)).mo18689g(new C3804i3(this, promotionViewApp)).mo18686f();
    }

    /* renamed from: j */
    public /* synthetic */ C5368e mo13818j(View.LifecycleEvent lifecycleEvent) {
        return this.view.installButtonClick().mo18681d(C3738a3.f6783f).mo18664b(new C3829l4(this)).mo18689g(new C3790g5(this)).mo18644a(this.viewScheduler).mo18649a((C5378b<? super Throwable>) C3821k4.f6886f).mo18686f();
    }

    /* renamed from: k */
    public /* synthetic */ C5368e mo13819k(View.LifecycleEvent lifecycleEvent) {
        return this.view.pauseDownload().mo18689g(new C3773e4(this)).mo18686f();
    }

    /* renamed from: l */
    public /* synthetic */ C5368e mo13820l(View.LifecycleEvent lifecycleEvent) {
        return this.view.resumeDownload().mo18687f(new C3902u5(this));
    }

    public void present() {
        getPromotionApps();
        installButtonClick();
        handleClickOnAppCard();
        pauseDownload();
        cancelDownload();
        resumeDownload();
        claimApp();
        handlePromotionClaimResult();
        handleRetryClick();
        handlePromotionOverDialogClick();
        handleOutOfSpaceDialog();
    }

    /* renamed from: b */
    public /* synthetic */ C5328b mo13790b(PromotionApp promotionApp) {
        return this.promotionsManager.resumeDownload(promotionApp.getMd5(), promotionApp.getPackageName(), promotionApp.getAppId());
    }

    /* renamed from: c */
    public /* synthetic */ void mo13804c(Void voidR) {
        this.view.showLoading();
    }

    /* renamed from: d */
    public /* synthetic */ Single mo13806d(Void voidR) {
        return this.promotionsManager.getPromotionsModel(this.promotionType);
    }

    /* renamed from: e */
    public /* synthetic */ void mo13810e(PromotionViewApp promotionViewApp) {
        this.promotionsAnalytics.sendPromotionsAppInteractInstallEvent(promotionViewApp.getPackageName(), promotionViewApp.getAppcValue(), promotionViewApp.getDownloadModel().getAction(), promotionViewApp.hasSplits(), promotionViewApp.hasAppc(), promotionViewApp.getRank(), (String) null, promotionViewApp.getStoreName(), promotionViewApp.getObb() != null);
    }

    /* renamed from: g */
    public /* synthetic */ C5368e mo13814g(View.LifecycleEvent lifecycleEvent) {
        return this.promotionsNavigator.claimDialogResults();
    }

    /* renamed from: i */
    public /* synthetic */ C5368e mo13817i(View.LifecycleEvent lifecycleEvent) {
        return this.view.retryClicked().mo18664b(new C3747b3(this)).mo18692i(new C3749b5(this)).mo18664b(new C3805i4(this)).mo18644a(this.viewScheduler).mo18687f(new C3878r5(this)).mo18649a((C5378b<? super Throwable>) new C3908v3(this)).mo18686f();
    }

    /* renamed from: g */
    static /* synthetic */ void m6924g(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: l */
    static /* synthetic */ void m6934l(Throwable th) {
        throw new IllegalStateException(th);
    }

    /* renamed from: c */
    public /* synthetic */ void mo13803c(PromotionsModel promotionsModel) {
        this.promotionId = promotionsModel.getPromotionId();
    }

    /* renamed from: d */
    public /* synthetic */ void mo13807d(PromotionViewApp promotionViewApp) {
        this.view.showPromotionApp(promotionViewApp, true);
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo13792b(View.LifecycleEvent lifecycleEvent) {
        return this.view.claimAppClick().mo18664b(new C3815j6(this)).mo18692i(new C3870q5(this)).mo18686f();
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo13800c(PromotionApp promotionApp) {
        return this.promotionsManager.getDownload(promotionApp);
    }

    /* renamed from: h */
    public /* synthetic */ C5368e mo13815h(View.LifecycleEvent lifecycleEvent) {
        return this.view.promotionOverDialogClick();
    }

    /* renamed from: j */
    static /* synthetic */ void m6930j(Throwable th) {
        throw new IllegalStateException(th);
    }

    /* renamed from: a */
    public /* synthetic */ void mo13785a(PromotionViewApp promotionViewApp, String str) {
        this.promotionsNavigator.navigateToClaimDialog(promotionViewApp.getPackageName(), this.promotionId);
    }

    /* renamed from: b */
    public /* synthetic */ void mo13795b(PromotionViewApp promotionViewApp) {
        this.promotionsAnalytics.sendPromotionsAppInteractClaimEvent(promotionViewApp.getPackageName(), promotionViewApp.getAppcValue());
    }

    /* renamed from: c */
    public /* synthetic */ void mo13802c(PromotionViewApp promotionViewApp) {
        if (promotionViewApp.getDownloadModel().getDownloadState().equals(DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR)) {
            this.promotionsNavigator.navigateToOutOfSpaceDialog(promotionViewApp.getSize(), promotionViewApp.getPackageName());
        } else {
            this.view.showDownloadError(promotionViewApp);
        }
    }

    /* renamed from: e */
    public /* synthetic */ C5368e mo13808e(View.LifecycleEvent lifecycleEvent) {
        return this.view.appCardClick();
    }

    /* renamed from: e */
    static /* synthetic */ void m6921e(Throwable th) {
        throw new IllegalStateException(th);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo13776a(View.LifecycleEvent lifecycleEvent) {
        return this.view.cancelDownload().mo18689g(new C3782f5(this)).mo18686f();
    }

    /* renamed from: b */
    public /* synthetic */ void mo13796b(PromotionViewApp promotionViewApp, String str) {
        this.promotionsNavigator.navigateToClaimDialog(promotionViewApp.getPackageName(), this.promotionId);
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo13772a(PromotionViewApp promotionViewApp) {
        return this.promotionsManager.cancelDownload(promotionViewApp.getMd5(), promotionViewApp.getPackageName(), promotionViewApp.getVersionCode());
    }

    /* renamed from: b */
    public /* synthetic */ C5328b mo13791b(PromotionViewApp promotionViewApp, Void voidR) {
        return this.promotionsManager.resumeDownload(promotionViewApp.getMd5(), promotionViewApp.getPackageName(), promotionViewApp.getAppId());
    }

    /* renamed from: a */
    public /* synthetic */ void mo13782a(PromotionAppClick promotionAppClick) {
        this.promotionsNavigator.navigateToAppView(promotionAppClick.getApp().getAppId(), promotionAppClick.getApp().getPackageName());
    }

    /* renamed from: b */
    public /* synthetic */ void mo13799b(Void voidR) {
        this.promotionsNavigator.navigateToHome();
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo13794b(Boolean bool) {
        return this.permissionManager.requestDownloadAccess(this.permissionService);
    }

    /* renamed from: b */
    public /* synthetic */ void mo13797b(PromotionsModel promotionsModel) {
        this.promotionsAnalytics.sendOpenPromotionsFragmentEvent();
    }

    /* renamed from: b */
    public /* synthetic */ void mo13798b(Throwable th) {
        this.view.showErrorView();
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo13774a() {
        if (this.promotionsManager.shouldShowRootInstallWarningPopup()) {
            return this.view.showRootInstallWarningPopup().mo18664b(new C3894t5(this));
        }
        return C5368e.m10257c(null);
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo13793b(PromotionsModel promotionsModel, PromotionViewApp promotionViewApp) {
        return this.promotionsManager.getPackageSignature(promotionViewApp.getPackageName()).mo18644a(this.viewScheduler).mo18694j(new C3828l3(promotionViewApp)).mo18664b(new C3739a4(this, promotionViewApp)).mo18694j(new C3775e6(promotionsModel));
    }

    /* renamed from: a */
    public /* synthetic */ void mo13788a(Boolean bool) {
        this.promotionsManager.allowRootInstall(bool);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo13780a(Void voidR) {
        return this.permissionManager.requestExternalStoragePermission(this.permissionService);
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo13773a(PromotionViewApp promotionViewApp, Void voidR) {
        return this.promotionsManager.downloadApp(promotionViewApp);
    }

    /* renamed from: a */
    public /* synthetic */ void mo13786a(PromotionsModel promotionsModel) {
        this.promotionId = promotionsModel.getPromotionId();
    }

    /* renamed from: a */
    public /* synthetic */ void mo13789a(Throwable th) {
        this.view.showErrorView();
    }

    /* renamed from: a */
    public /* synthetic */ void mo13781a(ClaimDialogResultWrapper claimDialogResultWrapper) {
        this.view.updateClaimStatus(claimDialogResultWrapper.getPackageName());
    }

    /* renamed from: a */
    public /* synthetic */ void mo13787a(PromotionsModel promotionsModel, PromotionApp promotionApp) {
        this.view.lockPromotionApps(promotionsModel.isWalletInstalled() && promotionApp.isClaimed());
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo13779a(PromotionsModel promotionsModel, PromotionsModel promotionsModel2) {
        return C5368e.m10257c(promotionsModel).mo18691h(new C3939z2(promotionsModel)).mo18687f(new C3861p4(this)).mo18644a(this.viewScheduler).mo18664b(new C3900u3(this)).mo18681d(C3831l6.f6898f).mo18687f(new C3748b4(this, promotionsModel));
    }

    /* renamed from: a */
    public /* synthetic */ void mo13784a(PromotionViewApp promotionViewApp, Boolean bool) {
        this.promotionsAnalytics.sendValentineMigratorEvent(promotionViewApp.getPackageName(), bool);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo13778a(PromotionsModel promotionsModel, PromotionViewApp promotionViewApp) {
        return C5368e.m10234a(promotionsModel.getAppsList()).mo18687f(new C3909v4(this));
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo13777a(PromotionApp promotionApp) {
        return this.promotionsManager.getDownload(promotionApp).mo18681d(C3941z4.f7024f).mo18669c().mo18644a(this.viewScheduler).mo18664b(new C3772e3(this)).mo18687f(new C3933y4(this));
    }

    /* renamed from: a */
    public /* synthetic */ void mo13783a(PromotionViewApp promotionViewApp, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        this.promotionsAnalytics.sendNotEnoughSpaceErrorEvent(promotionViewApp.getMd5());
    }
}
