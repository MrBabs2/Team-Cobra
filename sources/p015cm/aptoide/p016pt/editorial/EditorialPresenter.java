package p015cm.aptoide.p016pt.editorial;

import p015cm.aptoide.aptoideviews.socialmedia.SocialMediaView;
import p015cm.aptoide.p016pt.UserFeedbackAnalytics;
import p015cm.aptoide.p016pt.actions.PermissionManager;
import p015cm.aptoide.p016pt.actions.PermissionService;
import p015cm.aptoide.p016pt.ads.MoPubAdsManager;
import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.download.view.outofspace.OutOfSpaceNavigatorWrapper;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.reactions.ReactionEvent;
import p015cm.aptoide.p016pt.reactions.network.LoadReactionModel;
import p015cm.aptoide.p016pt.reactions.network.ReactionsResponse;
import p015cm.aptoide.p016pt.socialmedia.SocialMediaAnalytics;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.Single;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;
import p123rx.p126m.C5379n;
import p123rx.schedulers.Schedulers;

/* renamed from: cm.aptoide.pt.editorial.EditorialPresenter */
public class EditorialPresenter implements Presenter {
    private final CrashReport crashReporter;
    private final EditorialAnalytics editorialAnalytics;
    private final EditorialManager editorialManager;
    private final EditorialNavigator editorialNavigator;
    private final MoPubAdsManager moPubAdsManager;
    private final PermissionManager permissionManager;
    private final PermissionService permissionService;
    private final SocialMediaAnalytics socialMediaAnalytics;
    private final UserFeedbackAnalytics userFeedbackAnalytics;
    private final EditorialView view;
    private final C5373h viewScheduler;

    /* renamed from: cm.aptoide.pt.editorial.EditorialPresenter$1 */
    static /* synthetic */ class C23901 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                cm.aptoide.pt.app.DownloadModel$Action[] r0 = p015cm.aptoide.p016pt.app.DownloadModel.Action.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action = r0
                cm.aptoide.pt.app.DownloadModel$Action r1 = p015cm.aptoide.p016pt.app.DownloadModel.Action.INSTALL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.app.DownloadModel$Action r1 = p015cm.aptoide.p016pt.app.DownloadModel.Action.UPDATE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action     // Catch:{ NoSuchFieldError -> 0x0028 }
                cm.aptoide.pt.app.DownloadModel$Action r1 = p015cm.aptoide.p016pt.app.DownloadModel.Action.OPEN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action     // Catch:{ NoSuchFieldError -> 0x0033 }
                cm.aptoide.pt.app.DownloadModel$Action r1 = p015cm.aptoide.p016pt.app.DownloadModel.Action.DOWNGRADE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.editorial.EditorialPresenter.C23901.<clinit>():void");
        }
    }

    public EditorialPresenter(EditorialView editorialView, EditorialManager editorialManager2, C5373h hVar, CrashReport crashReport, PermissionManager permissionManager2, PermissionService permissionService2, EditorialAnalytics editorialAnalytics2, EditorialNavigator editorialNavigator2, UserFeedbackAnalytics userFeedbackAnalytics2, MoPubAdsManager moPubAdsManager2, SocialMediaAnalytics socialMediaAnalytics2) {
        this.view = editorialView;
        this.editorialManager = editorialManager2;
        this.viewScheduler = hVar;
        this.crashReporter = crashReport;
        this.permissionManager = permissionManager2;
        this.permissionService = permissionService2;
        this.editorialAnalytics = editorialAnalytics2;
        this.editorialNavigator = editorialNavigator2;
        this.userFeedbackAnalytics = userFeedbackAnalytics2;
        this.moPubAdsManager = moPubAdsManager2;
        this.socialMediaAnalytics = socialMediaAnalytics2;
    }

    /* renamed from: G */
    static /* synthetic */ Boolean m5532G(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: N */
    static /* synthetic */ Boolean m5539N(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: O */
    static /* synthetic */ Boolean m5540O(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: R */
    static /* synthetic */ Boolean m5543R(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: S */
    static /* synthetic */ Boolean m5544S(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: a */
    static /* synthetic */ EditorialDownloadModel m5545a(EditorialDownloadModel editorialDownloadModel, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        return editorialDownloadModel;
    }

    /* renamed from: a */
    static /* synthetic */ EditorialViewModel m5546a(EditorialViewModel editorialViewModel, EditorialDownloadEvent editorialDownloadEvent) {
        return editorialViewModel;
    }

    /* renamed from: a */
    static /* synthetic */ void m5547a(EditorialDownloadModel editorialDownloadModel) {
    }

    /* renamed from: b */
    static /* synthetic */ EditorialDownloadEvent m5548b(EditorialDownloadEvent editorialDownloadEvent, Boolean bool) {
        return editorialDownloadEvent;
    }

    /* renamed from: b */
    static /* synthetic */ Boolean m5550b(Boolean bool) {
        return bool;
    }

    /* renamed from: b */
    static /* synthetic */ void m5551b(SocialMediaView.SocialMediaType socialMediaType) {
    }

    /* renamed from: b */
    static /* synthetic */ void m5552b(EditorialDownloadModel editorialDownloadModel) {
    }

    /* renamed from: b */
    static /* synthetic */ void m5553b(ScrollEvent scrollEvent) {
    }

    /* renamed from: b */
    static /* synthetic */ void m5554b(LoadReactionModel loadReactionModel) {
    }

    /* renamed from: c */
    static /* synthetic */ void m5555c(LoadReactionModel loadReactionModel) {
    }

    /* renamed from: c */
    static /* synthetic */ void m5556c(Boolean bool) {
    }

    private void cancelDownload() {
        this.view.getLifecycleEvent().mo18681d(C2422d6.f5179f).mo18687f(new C2591z0(this)).mo18687f(new C2571w3(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C2465j1.f5260f, (C5378b<Throwable>) C2414c6.f5155f);
    }

    /* renamed from: d */
    static /* synthetic */ void m5557d(LoadReactionModel loadReactionModel) {
    }

    private C5328b downgradeApp(EditorialDownloadEvent editorialDownloadEvent) {
        return this.view.showDowngradeMessage().mo18681d(C2532r4.f5348f).mo18689g(new C2467j3(this, editorialDownloadEvent)).mo18696k();
    }

    private C5328b downloadApp(EditorialDownloadEvent editorialDownloadEvent) {
        return C5368e.m10248a(new C2421d5(this, editorialDownloadEvent)).mo18644a(this.viewScheduler).mo18687f(new C2442g2(this)).mo18687f(new C2438f6(this)).mo18644a(Schedulers.m10352io()).mo18689g(new C2458i2(this, editorialDownloadEvent)).mo18696k();
    }

    /* renamed from: e */
    static /* synthetic */ void m5558e(EditorialEvent editorialEvent) {
    }

    /* renamed from: f */
    static /* synthetic */ void m5559f(EditorialEvent editorialEvent) {
    }

    /* renamed from: f */
    static /* synthetic */ void m5560f(Throwable th) {
    }

    /* renamed from: g */
    static /* synthetic */ void m5561g(EditorialEvent editorialEvent) {
    }

    /* renamed from: h */
    static /* synthetic */ void m5564h(Throwable th) {
        throw new IllegalStateException(th);
    }

    private void handleInstallClick() {
        this.view.getLifecycleEvent().mo18681d(C2499n3.f5298f).mo18687f(new C2513p1(this)).mo18687f(new C2417d1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C2493m5.f5292f, (C5378b<Throwable>) C2565v5.f5387f);
    }

    private void handleOutOfSpaceDialogResult() {
        this.view.getLifecycleEvent().mo18681d(C2427e3.f5196f).mo18687f(new C2434f2(this)).mo18681d(C2533r5.f5349f).mo18692i(new C2397a5(this)).mo18689g(new C2426e2(this)).mo18686f().mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C2545t1.f5361f, (C5378b<Throwable>) new C2430e6(this));
    }

    private void handleReactionsResponse(ReactionsResponse reactionsResponse, boolean z) {
        if (reactionsResponse.wasSuccess()) {
            if (z) {
                this.editorialAnalytics.sendDeletedEvent();
            } else {
                this.editorialAnalytics.sendReactedEvent();
            }
        } else if (reactionsResponse.reactionsExceeded()) {
            this.view.showLoginDialog();
        } else if (reactionsResponse.wasNetworkError()) {
            this.view.showNetworkErrorToast();
        } else if (reactionsResponse.wasGeneralError()) {
            this.view.showGenericErrorToast();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: handleSinglePressReactionButton */
    public C5368e<LoadReactionModel> mo11204e(EditorialViewModel editorialViewModel) {
        return this.editorialManager.isFirstReaction(editorialViewModel.getCardId(), editorialViewModel.getGroupId()).mo18568c(new C2395a3(this, editorialViewModel));
    }

    private void handleSocialMediaPromotionClick() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C2403b3.f5131f).mo18687f(new C2444g4(this)).mo18664b(new C2568w0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2490m2 m2Var = C2490m2.f5289f;
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        a.mo18655a((C5378b<? super R>) m2Var, (C5378b<Throwable>) new C2415d(crashReport));
    }

    /* renamed from: i */
    static /* synthetic */ void m5565i(EditorialDownloadEvent editorialDownloadEvent) {
    }

    /* renamed from: i */
    static /* synthetic */ void m5566i(EditorialEvent editorialEvent) {
    }

    /* renamed from: i */
    static /* synthetic */ void m5567i(Throwable th) {
    }

    private boolean isOnlyOneMediaVisible(int i, int i2) {
        return i == i2;
    }

    /* renamed from: j */
    static /* synthetic */ void m5568j(EditorialDownloadEvent editorialDownloadEvent) {
    }

    /* renamed from: j */
    static /* synthetic */ void m5569j(Throwable th) {
    }

    /* renamed from: k */
    static /* synthetic */ void m5570k(EditorialDownloadEvent editorialDownloadEvent) {
    }

    /* renamed from: k */
    static /* synthetic */ void m5571k(EditorialViewModel editorialViewModel) {
    }

    /* renamed from: k */
    static /* synthetic */ void m5572k(Void voidR) {
    }

    /* renamed from: l */
    static /* synthetic */ void m5573l(EditorialViewModel editorialViewModel) {
    }

    /* renamed from: l */
    static /* synthetic */ void m5574l(Void voidR) {
    }

    private Single<EditorialViewModel> loadEditorialViewModel() {
        return this.editorialManager.loadEditorialViewModel().mo18556a(this.viewScheduler).mo18564b(new C2516p4(this)).mo18569d(C2554u2.f5376f);
    }

    private Single<LoadReactionModel> loadReactionModel(String str, String str2) {
        return this.editorialManager.loadReactionModel(str, str2).mo18556a(this.viewScheduler).mo18564b(new C2509o5(this));
    }

    /* renamed from: m */
    static /* synthetic */ void m5575m(EditorialViewModel editorialViewModel) {
    }

    /* renamed from: m */
    static /* synthetic */ void m5576m(Void voidR) {
    }

    /* renamed from: o */
    static /* synthetic */ EditorialViewModel m5578o(EditorialViewModel editorialViewModel) {
        return editorialViewModel;
    }

    private C5328b openInstalledApp(String str) {
        return C5328b.m10169d(new C2461i5(this, str));
    }

    /* renamed from: p */
    static /* synthetic */ void m5579p(EditorialViewModel editorialViewModel) {
    }

    private void pauseDownload() {
        this.view.getLifecycleEvent().mo18681d(C2429e5.f5198f).mo18687f(new C2540s4(this)).mo18687f(new C2441g1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C2396a4.f5123f, (C5378b<Throwable>) C2489m1.f5288f);
    }

    private void resumeDownload() {
        this.view.getLifecycleEvent().mo18681d(C2529r1.f5345f).mo18687f(new C2506o2(this)).mo18687f(new C2594z3(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C2553u1.f5375f, (C5378b<Throwable>) C2473k1.f5269f);
    }

    private C5368e<EditorialViewModel> setUpViewModelOnViewReady() {
        return this.view.isViewReady().mo18687f(new C2451h3(this)).mo18644a(this.viewScheduler);
    }

    /* access modifiers changed from: private */
    /* renamed from: verifyNotEnoughSpaceError */
    public C5368e<EditorialDownloadModel> mo11160a(EditorialContent editorialContent, EditorialDownloadModel editorialDownloadModel) {
        if (editorialDownloadModel.getDownloadState() == DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR) {
            return this.moPubAdsManager.getAdsVisibilityStatus().mo18564b(new C2419d3(this, editorialContent)).mo18567c().mo18694j(new C2405b5(editorialDownloadModel));
        }
        return C5368e.m10257c(editorialDownloadModel);
    }

    /* renamed from: x */
    static /* synthetic */ Boolean m5580x(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: a */
    public /* synthetic */ Single mo11154a(OutOfSpaceNavigatorWrapper outOfSpaceNavigatorWrapper) {
        return this.editorialManager.loadEditorialViewModel();
    }

    /* renamed from: c */
    public /* synthetic */ void mo11192c(EditorialEvent editorialEvent) {
        this.editorialNavigator.navigateToUri(editorialEvent.getUrl());
    }

    /* renamed from: d */
    public /* synthetic */ C5328b mo11198d(EditorialViewModel editorialViewModel) {
        return this.editorialManager.resumeDownload(editorialViewModel.getBottomCardMd5(), editorialViewModel.getBottomCardPackageName(), editorialViewModel.getBottomCardAppId(), this.view.getAction());
    }

    /* renamed from: e */
    public /* synthetic */ void mo11208e(Void voidR) {
        this.view.showLoading();
    }

    /* renamed from: f */
    public /* synthetic */ void mo11213f(EditorialViewModel editorialViewModel) {
        if (!editorialViewModel.isLoading()) {
            this.view.hideLoading();
        }
        if (editorialViewModel.hasError()) {
            this.view.showError(editorialViewModel.getError());
        } else {
            this.view.populateView(editorialViewModel);
        }
    }

    public void handleClickActionButtonCard() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C2425e1.f5194f).mo18687f(new C2557u5(this)).mo18664b(new C2556u4(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2595z4 z4Var = C2595z4.f5421f;
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        a.mo18655a((C5378b<? super R>) z4Var, (C5378b<Throwable>) new C2415d(crashReport));
    }

    public void handleClickOnAppCard() {
        C5368e<R> f = this.view.getLifecycleEvent().mo18681d(C2452h4.f5241f).mo18687f(new C2539s3(this));
        EditorialView editorialView = this.view;
        editorialView.getClass();
        C5368e<R> a = f.mo18687f((C5379n<? super R, ? extends C5368e<? extends R>>) new C2407c(editorialView)).mo18664b(new C2450h2(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2406b6 b6Var = C2406b6.f5135f;
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        a.mo18655a((C5378b<? super R>) b6Var, (C5378b<Throwable>) new C2415d(crashReport));
    }

    public void handleClickOnMedia() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C2491m3.f5290f).mo18687f(new C2460i4(this)).mo18664b(new C2446g6(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2517p5 p5Var = C2517p5.f5323f;
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        a.mo18655a((C5378b<? super R>) p5Var, (C5378b<Throwable>) new C2415d(crashReport));
    }

    public void handleLongPressReactionButton() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C2497n1.f5296f).mo18687f(new C2514p2(this)).mo18687f(new C2482l2(this)).mo18664b(new C2394a2(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2484l4 l4Var = C2484l4.f5282f;
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        a.mo18655a((C5378b<? super R>) l4Var, (C5378b<Throwable>) new C2415d(crashReport));
    }

    public void handleMediaListDescriptionVisibility() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C2584y0.f5410f).mo18687f(new C2570w2(this)).mo18644a(this.viewScheduler).mo18681d(C2459i3.f5251f).mo18664b(new C2581x5(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2546t2 t2Var = C2546t2.f5362f;
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        a.mo18655a((C5378b<? super R>) t2Var, (C5378b<Throwable>) new C2415d(crashReport));
    }

    public void handleMovingCollapse() {
        this.view.getLifecycleEvent().mo18681d(C2481l1.f5279f).mo18687f(new C2537s1(this)).mo18644a(this.viewScheduler).mo18664b(new C2435f3(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C2549t5.f5367f, (C5378b<Throwable>) new C2531r3(this));
    }

    public void handlePlaceHolderVisibility() {
        this.view.getLifecycleEvent().mo18681d(C2466j2.f5261f).mo18687f(new C2428e4(this)).mo18644a(this.viewScheduler).mo18664b(new C2564v4(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C2562v2.f5384f, (C5378b<Throwable>) new C2560v0(this));
    }

    public void handlePlaceHolderVisibilityChange() {
        this.view.getLifecycleEvent().mo18681d(C2588y4.f5414f).mo18687f(new C2515p3(this)).mo18664b(new C2469j5(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C2468j4.f5264f, (C5378b<Throwable>) new C2541s5(this));
    }

    public void handleReactionButtonClick() {
        this.view.getLifecycleEvent().mo18681d(C2398a6.f5125f).mo18687f(new C2576x0(this)).mo18692i(new C2521q1(this)).mo18644a(this.viewScheduler).mo18687f(new C2401b1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C2593z2.f5419f, (C5378b<Throwable>) new C2437f5(this));
    }

    public void handleRetryClick() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C2524q4.f5335f).mo18687f(new C2411c3(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2500n4 n4Var = C2500n4.f5299f;
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        a.mo18655a((C5378b<? super R>) n4Var, (C5378b<Throwable>) new C2415d(crashReport));
    }

    public void handleSnackLogInClick() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C2555u3.f5377f).mo18687f(new C2501n5(this)).mo18664b(new C2547t3(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2453h5 h5Var = C2453h5.f5242f;
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        a.mo18655a((C5378b<? super R>) h5Var, (C5378b<Throwable>) new C2415d(crashReport));
    }

    public void handleUserReaction() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C2589y5.f5415f).mo18687f(new C2563v3(this)).mo18664b(new C2420d4(this)).mo18687f(new C2573w5(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2569w1 w1Var = C2569w1.f5391f;
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        a.mo18655a((C5378b<? super R>) w1Var, (C5378b<Throwable>) new C2415d(crashReport));
    }

    /* renamed from: i */
    public /* synthetic */ C5368e mo11235i(View.LifecycleEvent lifecycleEvent) {
        return this.editorialNavigator.outOfSpaceDialogResult();
    }

    /* renamed from: j */
    public /* synthetic */ C5368e mo11237j(EditorialViewModel editorialViewModel) {
        return this.view.resumeDownload(editorialViewModel).mo18687f(new C2587y3(this));
    }

    /* renamed from: k */
    public /* synthetic */ C5368e mo11240k(View.LifecycleEvent lifecycleEvent) {
        return this.view.placeHolderVisibilityChange();
    }

    /* renamed from: l */
    public /* synthetic */ C5368e mo11241l(View.LifecycleEvent lifecycleEvent) {
        return this.view.reactionsButtonClicked();
    }

    public void loadDownloadApp() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C2580x4.f5406f).mo18687f(new C2544t0(this)).mo18687f(new C2402b2(this)).mo18691h(C2413c5.f5154f).mo18687f(new C2443g3(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2483l3 l3Var = C2483l3.f5281f;
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        a.mo18655a((C5378b<? super R>) l3Var, (C5378b<Throwable>) new C2415d(crashReport));
    }

    /* renamed from: m */
    public /* synthetic */ C5368e mo11243m(View.LifecycleEvent lifecycleEvent) {
        return this.view.retryClicked().mo18644a(this.viewScheduler).mo18664b(new C2393a1(this)).mo18692i(new C2523q3(this));
    }

    /* renamed from: o */
    public /* synthetic */ C5368e mo11245o(View.LifecycleEvent lifecycleEvent) {
        return this.view.socialMediaClick();
    }

    public void observeDownloadErrors() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C2586y2.f5412f).mo18687f(new C2418d2(this)).mo18687f(new C2505o1(this)).mo18691h(C2574w6.f5397f).mo18687f(new C2538s2(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2475k3 k3Var = C2475k3.f5271f;
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        a.mo18655a((C5378b<? super R>) k3Var, (C5378b<Throwable>) new C2415d(crashReport));
    }

    public void onCreateLoadAppOfTheWeek() {
        C5368e<R> i = this.view.getLifecycleEvent().mo18681d(C2577x1.f5400f).mo18664b(new C2409c1(this)).mo18692i(new C2477k5(this));
        C2445g5 g5Var = C2445g5.f5220f;
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        i.mo18655a((C5378b<? super R>) g5Var, (C5378b<Throwable>) new C2415d(crashReport));
    }

    public void onCreateLoadReactionModel() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C2492m4.f5291f).mo18687f(new C2525q5(this)).mo18692i(new C2457i1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2530r2 r2Var = C2530r2.f5346f;
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        a.mo18655a((C5378b<? super R>) r2Var, (C5378b<Throwable>) new C2415d(crashReport));
    }

    /* renamed from: p */
    public /* synthetic */ C5368e mo11249p(View.LifecycleEvent lifecycleEvent) {
        return this.view.reactionClicked();
    }

    public void present() {
        onCreateLoadAppOfTheWeek();
        handleRetryClick();
        handleClickOnMedia();
        handleClickOnAppCard();
        handleInstallClick();
        observeDownloadErrors();
        pauseDownload();
        resumeDownload();
        cancelDownload();
        loadDownloadApp();
        handlePlaceHolderVisibilityChange();
        handlePlaceHolderVisibility();
        handleMediaListDescriptionVisibility();
        handleClickActionButtonCard();
        handleMovingCollapse();
        handleReactionButtonClick();
        handleUserReaction();
        handleLongPressReactionButton();
        handleSnackLogInClick();
        onCreateLoadReactionModel();
        handleSocialMediaPromotionClick();
        handleOutOfSpaceDialogResult();
    }

    /* renamed from: q */
    public /* synthetic */ C5368e mo11250q(View.LifecycleEvent lifecycleEvent) {
        return this.view.isViewReady();
    }

    /* renamed from: r */
    public /* synthetic */ C5368e mo11251r(View.LifecycleEvent lifecycleEvent) {
        return setUpViewModelOnViewReady();
    }

    /* renamed from: s */
    public /* synthetic */ void mo11252s(View.LifecycleEvent lifecycleEvent) {
        this.view.showLoading();
    }

    /* renamed from: t */
    public /* synthetic */ Single mo11253t(View.LifecycleEvent lifecycleEvent) {
        return loadEditorialViewModel();
    }

    /* renamed from: u */
    public /* synthetic */ C5368e mo11254u(View.LifecycleEvent lifecycleEvent) {
        return setUpViewModelOnViewReady();
    }

    /* renamed from: v */
    public /* synthetic */ C5368e mo11255v(View.LifecycleEvent lifecycleEvent) {
        return setUpViewModelOnViewReady();
    }

    /* renamed from: w */
    public /* synthetic */ C5368e mo11256w(View.LifecycleEvent lifecycleEvent) {
        return setUpViewModelOnViewReady();
    }

    /* renamed from: a */
    public /* synthetic */ void mo11165a(SocialMediaView.SocialMediaType socialMediaType) {
        this.editorialNavigator.navigateToSocialMedia(socialMediaType);
        this.socialMediaAnalytics.sendPromoteSocialMediaClickEvent(socialMediaType);
    }

    /* renamed from: b */
    public /* synthetic */ void mo11188b(Throwable th) {
        this.crashReporter.log(th);
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo11190c(View.LifecycleEvent lifecycleEvent) {
        return setUpViewModelOnViewReady();
    }

    /* renamed from: e */
    public /* synthetic */ C5368e mo11205e(View.LifecycleEvent lifecycleEvent) {
        return setUpViewModelOnViewReady();
    }

    /* renamed from: g */
    public /* synthetic */ C5328b mo11214g(EditorialDownloadEvent editorialDownloadEvent) {
        return this.editorialManager.pauseDownload(editorialDownloadEvent.getMd5());
    }

    /* renamed from: h */
    public /* synthetic */ C5368e mo11219h(EditorialDownloadEvent editorialDownloadEvent) {
        return this.permissionManager.requestDownloadAccess(this.permissionService).mo18687f(new C2508o4(this)).mo18689g(new C2572w4(this, editorialDownloadEvent)).mo18686f();
    }

    /* renamed from: i */
    public /* synthetic */ C5368e mo11236i(Void voidR) {
        return this.permissionManager.requestExternalStoragePermission(this.permissionService);
    }

    /* renamed from: n */
    public /* synthetic */ C5368e mo11244n(View.LifecycleEvent lifecycleEvent) {
        return this.view.snackLoginClick();
    }

    /* renamed from: b */
    public /* synthetic */ void mo11186b(EditorialEvent editorialEvent) {
        this.editorialNavigator.navigateToAppView(editorialEvent.getId(), editorialEvent.getPackageName());
    }

    /* renamed from: c */
    public /* synthetic */ void mo11191c(EditorialDownloadEvent editorialDownloadEvent, DownloadModel.Action action, EditorialViewModel editorialViewModel) {
        this.editorialAnalytics.clickOnInstallButton(editorialDownloadEvent.getPackageName(), action.toString(), editorialViewModel.hasSplits(), editorialViewModel.hasAppc(), false, editorialViewModel.getRank(), (String) null, editorialViewModel.getStoreName(), editorialViewModel.getBottomCardObb() != null);
    }

    /* renamed from: e */
    public /* synthetic */ C5328b mo11203e(EditorialDownloadEvent editorialDownloadEvent) {
        DownloadModel.Action action = editorialDownloadEvent.getAction();
        int i = C23901.$SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[action.ordinal()];
        if (i == 1 || i == 2) {
            return this.editorialManager.loadEditorialViewModel().mo18566b(new C2522q2(this, editorialDownloadEvent, action));
        }
        if (i == 3) {
            return this.editorialManager.loadEditorialViewModel().mo18556a(this.viewScheduler).mo18566b(new C2476k4(this, editorialDownloadEvent, action));
        }
        if (i != 4) {
            return null;
        }
        return this.editorialManager.loadEditorialViewModel().mo18556a(this.viewScheduler).mo18566b(new C2548t4(this, editorialDownloadEvent, action));
    }

    /* renamed from: g */
    public /* synthetic */ C5368e mo11215g(EditorialViewModel editorialViewModel) {
        return C5368e.m10254b(this.view.installButtonClick(editorialViewModel), this.view.resumeDownload(editorialViewModel)).mo18694j(new C2585y1(editorialViewModel));
    }

    /* renamed from: i */
    public /* synthetic */ C5368e mo11234i(EditorialViewModel editorialViewModel) {
        return this.view.pauseDownload(editorialViewModel).mo18664b(new C2474k2(this)).mo18689g(new C2433f1(this)).mo18686f();
    }

    /* renamed from: j */
    public /* synthetic */ C5368e mo11238j(View.LifecycleEvent lifecycleEvent) {
        return this.view.isViewReady();
    }

    /* renamed from: a */
    public /* synthetic */ void mo11169a(EditorialEvent editorialEvent) {
        this.editorialNavigator.navigateToUri(editorialEvent.getUrl());
    }

    /* renamed from: j */
    public /* synthetic */ C5368e mo11239j(Void voidR) {
        return this.editorialManager.loadEditorialViewModel().mo18567c();
    }

    /* renamed from: a */
    public /* synthetic */ void mo11168a(EditorialDownloadEvent editorialDownloadEvent, DownloadModel.Action action, EditorialViewModel editorialViewModel) {
        this.editorialAnalytics.clickOnInstallButton(editorialDownloadEvent.getPackageName(), action.toString(), editorialViewModel.hasSplits(), editorialViewModel.hasAppc(), false, editorialViewModel.getRank(), (String) null, editorialViewModel.getStoreName(), editorialViewModel.getBottomCardObb() != null);
    }

    /* renamed from: d */
    public /* synthetic */ C5368e mo11200d(View.LifecycleEvent lifecycleEvent) {
        return this.view.mediaContentClicked();
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo11182b(View.LifecycleEvent lifecycleEvent) {
        return this.view.actionButtonClicked();
    }

    /* renamed from: d */
    public /* synthetic */ C5328b mo11197d(EditorialDownloadEvent editorialDownloadEvent, DownloadModel.Action action, EditorialViewModel editorialViewModel) {
        return openInstalledApp(editorialDownloadEvent.getPackageName()).mo18589a((C5377a) new C2436f4(this, editorialDownloadEvent, action, editorialViewModel));
    }

    /* renamed from: f */
    public /* synthetic */ Single mo11209f(Void voidR) {
        return loadEditorialViewModel();
    }

    /* renamed from: h */
    public /* synthetic */ C5368e mo11221h(Void voidR) {
        return this.editorialManager.loadEditorialViewModel().mo18567c();
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo11181b(EditorialViewModel editorialViewModel) {
        return this.view.installButtonClick(editorialViewModel).mo18689g(new C2498n2(this)).mo18649a((C5378b<? super Throwable>) C2412c4.f5153f).mo18686f();
    }

    /* renamed from: f */
    public /* synthetic */ C5328b mo11210f(EditorialDownloadEvent editorialDownloadEvent, DownloadModel.Action action, EditorialViewModel editorialViewModel) {
        return downgradeApp(editorialDownloadEvent).mo18589a((C5377a) new C2552u0(this, editorialDownloadEvent, action, editorialViewModel));
    }

    /* renamed from: g */
    public /* synthetic */ C5368e mo11216g(View.LifecycleEvent lifecycleEvent) {
        return this.view.mediaListDescriptionChanged();
    }

    /* renamed from: h */
    static /* synthetic */ Boolean m5563h(EditorialEvent editorialEvent) {
        return Boolean.valueOf(editorialEvent.getFirstVisiblePosition() >= 0);
    }

    /* renamed from: f */
    public /* synthetic */ void mo11212f(EditorialDownloadEvent editorialDownloadEvent) {
        this.editorialAnalytics.sendDownloadPauseEvent(editorialDownloadEvent.getPackageName());
    }

    /* renamed from: g */
    public /* synthetic */ void mo11217g(Void voidR) {
        this.editorialNavigator.navigateToLogIn();
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo11189c(EditorialDownloadEvent editorialDownloadEvent) {
        if (!this.editorialManager.shouldShowRootInstallWarningPopup()) {
            return C5368e.m10257c(editorialDownloadEvent);
        }
        C5368e<Boolean> showRootInstallWarningPopup = this.view.showRootInstallWarningPopup();
        EditorialManager editorialManager2 = this.editorialManager;
        editorialManager2.getClass();
        return showRootInstallWarningPopup.mo18664b((C5378b<? super Boolean>) new C2542s6(editorialManager2)).mo18694j(new C2449h1(editorialDownloadEvent));
    }

    /* renamed from: d */
    public /* synthetic */ C5368e mo11199d(EditorialDownloadEvent editorialDownloadEvent) {
        return this.permissionManager.requestDownloadAccess(this.permissionService);
    }

    /* renamed from: h */
    public /* synthetic */ C5368e mo11220h(View.LifecycleEvent lifecycleEvent) {
        return this.view.handleMovingCollapse();
    }

    /* renamed from: d */
    public /* synthetic */ void mo11202d(Throwable th) {
        this.crashReporter.log(th);
    }

    /* renamed from: h */
    public /* synthetic */ Single mo11218h(EditorialViewModel editorialViewModel) {
        return loadReactionModel(editorialViewModel.getCardId(), editorialViewModel.getGroupId());
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo11163a(View.LifecycleEvent lifecycleEvent) {
        return setUpViewModelOnViewReady();
    }

    /* renamed from: b */
    public /* synthetic */ C5328b mo11178b(EditorialDownloadEvent editorialDownloadEvent, DownloadModel.Action action, EditorialViewModel editorialViewModel) {
        return downloadApp(editorialDownloadEvent).mo18588a(this.viewScheduler).mo18589a((C5377a) new C2579x3(this, editorialDownloadEvent, action, editorialViewModel));
    }

    /* renamed from: d */
    public /* synthetic */ void mo11201d(EditorialEvent editorialEvent) {
        if (isOnlyOneMediaVisible(editorialEvent.getFirstVisiblePosition(), editorialEvent.getLastVisibleItemPosition())) {
            this.view.manageMediaListDescriptionAnimationVisibility(editorialEvent);
        } else {
            this.view.setMediaListDescriptionsVisible(editorialEvent);
        }
    }

    /* renamed from: f */
    public /* synthetic */ C5368e mo11211f(View.LifecycleEvent lifecycleEvent) {
        return this.view.reactionsButtonLongPressed();
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo11161a(EditorialViewModel editorialViewModel) {
        return this.view.cancelDownload(editorialViewModel).mo18664b(new C2410c2(this)).mo18689g(new C2592z1(this)).mo18686f();
    }

    /* renamed from: b */
    public /* synthetic */ C5328b mo11177b(EditorialDownloadEvent editorialDownloadEvent) {
        return this.editorialManager.cancelDownload(editorialDownloadEvent.getMd5(), editorialDownloadEvent.getPackageName(), editorialDownloadEvent.getVerCode());
    }

    /* renamed from: e */
    public /* synthetic */ void mo11206e(EditorialDownloadEvent editorialDownloadEvent, DownloadModel.Action action, EditorialViewModel editorialViewModel) {
        this.editorialAnalytics.clickOnInstallButton(editorialDownloadEvent.getPackageName(), action.toString(), editorialViewModel.hasSplits(), editorialViewModel.hasAppc(), false, editorialViewModel.getRank(), (String) null, editorialViewModel.getStoreName(), editorialViewModel.getBottomCardObb() != null);
    }

    /* renamed from: c */
    public /* synthetic */ void mo11195c(Void voidR) {
        this.view.managePlaceHolderVisibity();
    }

    /* renamed from: c */
    public /* synthetic */ void mo11194c(Throwable th) {
        this.crashReporter.log(th);
    }

    /* renamed from: a */
    public /* synthetic */ void mo11167a(EditorialDownloadEvent editorialDownloadEvent) {
        this.editorialAnalytics.sendDownloadCancelEvent(editorialDownloadEvent.getPackageName());
    }

    /* renamed from: b */
    public /* synthetic */ C5328b mo11179b(EditorialDownloadEvent editorialDownloadEvent, Void voidR) {
        return this.editorialManager.resumeDownload(editorialDownloadEvent.getMd5(), editorialDownloadEvent.getPackageName(), editorialDownloadEvent.getAppId(), editorialDownloadEvent.getAction().toString());
    }

    /* renamed from: c */
    public /* synthetic */ void mo11193c(EditorialViewModel editorialViewModel) {
        this.editorialAnalytics.sendReactionButtonClickEvent();
        this.view.showReactionsPopup(editorialViewModel.getCardId(), editorialViewModel.getGroupId());
    }

    /* renamed from: d */
    public /* synthetic */ Single mo11196d(Void voidR) {
        return this.editorialManager.loadEditorialViewModel();
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo11164a(Void voidR) {
        return this.permissionManager.requestExternalStoragePermission(this.permissionService);
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo11158a(EditorialDownloadEvent editorialDownloadEvent, Void voidR) {
        return this.editorialManager.downloadApp(editorialDownloadEvent);
    }

    /* renamed from: e */
    public /* synthetic */ void mo11207e(Throwable th) {
        this.crashReporter.log(th);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo11159a(EditorialContent editorialContent) {
        C5368e<EditorialDownloadModel> a = this.editorialManager.loadDownloadModel(editorialContent.getMd5sum(), editorialContent.getPackageName(), editorialContent.getVerCode(), editorialContent.getPosition()).mo18644a(this.viewScheduler);
        EditorialView editorialView = this.view;
        editorialView.getClass();
        return a.mo18664b((C5378b<? super EditorialDownloadModel>) new C2582x6(editorialView));
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo11180b(EditorialContent editorialContent) {
        return this.editorialManager.loadDownloadModel(editorialContent.getMd5sum(), editorialContent.getPackageName(), editorialContent.getVerCode(), editorialContent.getPosition()).mo18681d(C2399b.f5126f).mo18669c().mo18687f(new C2507o3(this, editorialContent)).mo18644a(this.viewScheduler).mo18664b(new C2485l5(this, editorialContent));
    }

    /* renamed from: a */
    public /* synthetic */ void mo11166a(EditorialContent editorialContent, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        this.editorialAnalytics.sendNotEnoughSpaceErrorEvent(editorialContent.getMd5sum());
    }

    /* renamed from: b */
    public /* synthetic */ void mo11185b(EditorialContent editorialContent, EditorialDownloadModel editorialDownloadModel) {
        if (editorialDownloadModel.getDownloadState().equals(DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR)) {
            this.editorialNavigator.navigateToOutOfSpaceDialog(editorialContent.getSize(), editorialContent.getPackageName());
        } else {
            this.view.showDownloadError(editorialDownloadModel);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo11175a(String str) {
        this.view.openApp(str);
    }

    /* renamed from: a */
    public /* synthetic */ void mo11170a(ScrollEvent scrollEvent) {
        if (scrollEvent.getItemShown().booleanValue()) {
            this.view.removeBottomCardAnimation();
        } else if (!scrollEvent.getItemShown().booleanValue()) {
            this.view.addBottomCardAnimation();
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo11174a(Boolean bool) {
        if (bool.booleanValue()) {
            this.view.removeBottomCardAnimation();
        } else {
            this.view.addBottomCardAnimation();
        }
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo11183b(ReactionEvent reactionEvent) {
        return this.editorialManager.setReaction(reactionEvent.getCardId(), reactionEvent.getGroupId(), reactionEvent.getReactionType()).mo18567c().mo18681d(C2558u6.f5380f).mo18644a(this.viewScheduler).mo18664b(new C2561v1(this)).mo18681d(C2391a.f5117f).mo18692i(new C2404b4(this, reactionEvent));
    }

    /* renamed from: a */
    public /* synthetic */ void mo11176a(Throwable th) {
        this.crashReporter.log(th);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo11162a(EditorialViewModel editorialViewModel, Boolean bool) {
        if (!bool.booleanValue()) {
            return this.editorialManager.deleteReaction(editorialViewModel.getCardId(), editorialViewModel.getGroupId()).mo18567c().mo18664b(new C2578x2(this)).mo18681d(C2391a.f5117f).mo18692i(new C2596z5(this, editorialViewModel));
        }
        this.editorialAnalytics.sendReactionButtonClickEvent();
        this.view.showReactionsPopup(editorialViewModel.getCardId(), editorialViewModel.getGroupId());
        return C5368e.m10257c(new LoadReactionModel());
    }

    /* renamed from: b */
    public /* synthetic */ void mo11187b(ReactionsResponse reactionsResponse) {
        handleReactionsResponse(reactionsResponse, false);
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo11184b(Void voidR) {
        return this.editorialManager.loadEditorialViewModel().mo18567c();
    }

    /* renamed from: a */
    public /* synthetic */ void mo11173a(ReactionsResponse reactionsResponse) {
        handleReactionsResponse(reactionsResponse, true);
    }

    /* renamed from: a */
    public /* synthetic */ Single mo11155a(EditorialViewModel editorialViewModel, ReactionsResponse reactionsResponse) {
        return loadReactionModel(editorialViewModel.getCardId(), editorialViewModel.getGroupId());
    }

    /* renamed from: a */
    public /* synthetic */ void mo11172a(LoadReactionModel loadReactionModel) {
        this.view.showTopReactions(loadReactionModel.getMyReaction(), loadReactionModel.getTopReactionList(), loadReactionModel.getTotal());
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo11157a(EditorialDownloadEvent editorialDownloadEvent, Boolean bool) {
        return downloadApp(editorialDownloadEvent);
    }

    /* renamed from: a */
    public /* synthetic */ void mo11171a(ReactionEvent reactionEvent) {
        this.userFeedbackAnalytics.sendReactionEvent();
    }

    /* renamed from: a */
    public /* synthetic */ Single mo11156a(ReactionEvent reactionEvent, ReactionsResponse reactionsResponse) {
        return loadReactionModel(reactionEvent.getCardId(), reactionEvent.getGroupId());
    }
}
