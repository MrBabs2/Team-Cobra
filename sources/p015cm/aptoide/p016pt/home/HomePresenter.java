package p015cm.aptoide.p016pt.home;

import android.util.Pair;
import java.util.Collections;
import java.util.List;
import p015cm.aptoide.p016pt.UserFeedbackAnalytics;
import p015cm.aptoide.p016pt.ads.data.ApplicationAd;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.home.bundles.HomeBundlesModel;
import p015cm.aptoide.p016pt.home.bundles.ads.AdHomeEvent;
import p015cm.aptoide.p016pt.home.bundles.ads.AdMapper;
import p015cm.aptoide.p016pt.home.bundles.ads.SearchAdNavigationResult;
import p015cm.aptoide.p016pt.home.bundles.apps.RewardApp;
import p015cm.aptoide.p016pt.home.bundles.base.ActionBundle;
import p015cm.aptoide.p016pt.home.bundles.base.AppComingSoonPromotionalBundle;
import p015cm.aptoide.p016pt.home.bundles.base.AppHomeEvent;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p015cm.aptoide.p016pt.home.bundles.base.PromotionalBundle;
import p015cm.aptoide.p016pt.home.bundles.editorial.EditorialHomeEvent;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.reactions.ReactionsHomeEvent;
import p015cm.aptoide.p016pt.reactions.network.ReactionsResponse;
import p015cm.aptoide.p016pt.view.app.Application;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.Single;
import p123rx.exceptions.OnErrorNotImplementedException;
import p123rx.p124l.p125c.C5376a;
import p123rx.p126m.C5378b;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.home.HomePresenter */
public class HomePresenter implements Presenter {
    private final AdMapper adMapper;
    private final CrashReport crashReporter;
    private final Home home;
    private final HomeAnalytics homeAnalytics;
    private final HomeNavigator homeNavigator;
    private final UserFeedbackAnalytics userFeedbackAnalytics;
    private final HomeView view;
    private final C5373h viewScheduler;

    /* renamed from: cm.aptoide.pt.home.HomePresenter$1 */
    static /* synthetic */ class C27071 {
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
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.home.HomePresenter.C27071.<clinit>():void");
        }
    }

    public HomePresenter(HomeView homeView, Home home2, C5373h hVar, CrashReport crashReport, HomeNavigator homeNavigator2, AdMapper adMapper2, HomeAnalytics homeAnalytics2, UserFeedbackAnalytics userFeedbackAnalytics2) {
        this.view = homeView;
        this.home = home2;
        this.viewScheduler = hVar;
        this.crashReporter = crashReport;
        this.homeNavigator = homeNavigator2;
        this.adMapper = adMapper2;
        this.homeAnalytics = homeAnalytics2;
        this.userFeedbackAnalytics = userFeedbackAnalytics2;
    }

    /* renamed from: A */
    static /* synthetic */ Boolean m5923A(HomeEvent homeEvent) {
        return Boolean.valueOf((homeEvent.getBundle() instanceof PromotionalBundle) && homeEvent.getBundle().getType().isPromotional());
    }

    /* renamed from: B */
    static /* synthetic */ void m5926B(HomeEvent homeEvent) {
    }

    /* renamed from: C */
    static /* synthetic */ Boolean m5927C(HomeEvent homeEvent) {
        return Boolean.valueOf((homeEvent.getBundle() instanceof ActionBundle) && homeEvent.getBundle().getType().isPromotional());
    }

    /* renamed from: D */
    static /* synthetic */ void m5930D(HomeEvent homeEvent) {
    }

    /* renamed from: L */
    static /* synthetic */ Boolean m5938L(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: b */
    static /* synthetic */ void m5957b(SearchAdNavigationResult searchAdNavigationResult) {
    }

    /* renamed from: c */
    static /* synthetic */ void m5960c(List list) {
    }

    /* renamed from: d */
    static /* synthetic */ Boolean m5962d(HomeBundle homeBundle) {
        return Boolean.valueOf(homeBundle.getType() == HomeBundle.BundleType.EDITORIAL);
    }

    /* renamed from: d */
    static /* synthetic */ void m5963d(ActionBundle actionBundle) {
    }

    /* renamed from: d */
    static /* synthetic */ void m5964d(AppHomeEvent appHomeEvent) {
    }

    /* renamed from: d */
    static /* synthetic */ void m5965d(EditorialHomeEvent editorialHomeEvent) {
    }

    /* renamed from: d */
    static /* synthetic */ void m5966d(List list) {
    }

    /* renamed from: e */
    static /* synthetic */ void m5969e(ActionBundle actionBundle) {
    }

    /* renamed from: e */
    static /* synthetic */ void m5970e(AppComingSoonPromotionalBundle appComingSoonPromotionalBundle) {
    }

    /* renamed from: e */
    static /* synthetic */ void m5971e(EditorialHomeEvent editorialHomeEvent) {
    }

    /* renamed from: e */
    static /* synthetic */ void m5973e(List list) {
    }

    /* renamed from: f */
    static /* synthetic */ Boolean m5974f(ActionBundle actionBundle) {
        return Boolean.valueOf(actionBundle.getActionItem() != null);
    }

    /* renamed from: f */
    static /* synthetic */ void m5977f(AppComingSoonPromotionalBundle appComingSoonPromotionalBundle) {
    }

    /* renamed from: f */
    static /* synthetic */ void m5978f(AppHomeEvent appHomeEvent) {
    }

    /* renamed from: f */
    static /* synthetic */ void m5980f(Void voidR) {
    }

    /* renamed from: f */
    static /* synthetic */ void m5981f(List list) {
    }

    /* renamed from: g */
    static /* synthetic */ void m5983g(EditorialHomeEvent editorialHomeEvent) {
    }

    /* renamed from: g */
    static /* synthetic */ void m5985g(List list) {
    }

    /* renamed from: h */
    static /* synthetic */ void m5987h(List list) {
    }

    /* access modifiers changed from: private */
    public void handleBundlesResult(HomeBundlesModel homeBundlesModel) {
        if (homeBundlesModel.hasErrors()) {
            handleError(homeBundlesModel.getError());
        } else if (!homeBundlesModel.isLoading()) {
            this.view.showBundles(homeBundlesModel.getList());
            this.view.hideLoading();
        }
    }

    private void handleCancelNotifyMeAppComingSoonClick() {
        this.view.getLifecycleEvent().mo18681d(C3137qa.f6063f).mo18687f(new C3119p4(this)).mo18681d(C2991g6.f5928f).mo18694j(C3184u9.f6110f).mo18664b(new C3216x5(this)).mo18694j(C3109o6.f6035f).mo18687f(new C2719a8(this)).mo18644a(C5376a.m10346b()).mo18664b(new C2866b6(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3122p7.f6048f, (C5378b<Throwable>) C2996gb.f5933f);
    }

    private void handleEditorialCardClick() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C3230y7.f6158f).mo18687f(new C3209wa(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C3057l7 l7Var = C3057l7.f5998f;
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        a.mo18655a((C5378b<? super R>) l7Var, (C5378b<Throwable>) new C2932c(crashReport));
    }

    private void handleError(HomeBundlesModel.Error error) {
        int i = C27071.$SwitchMap$cm$aptoide$pt$home$bundles$HomeBundlesModel$Error[error.ordinal()];
        if (i == 1) {
            this.view.showNetworkError();
        } else if (i == 2) {
            this.view.showGenericError();
        }
    }

    private void handleInstallWalletOfferClick() {
        this.view.getLifecycleEvent().mo18681d(C3059l9.f6000f).mo18687f(new C2868b8(this)).mo18644a(this.viewScheduler).mo18664b(new C3073ma(this)).mo18694j(C2859b.f5711f).mo18681d(C3070m7.f6012f).mo18638a(ActionBundle.class).mo18664b(new C3169t6(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3172t9.f6098f, (C5378b<Throwable>) C2938c5.f5871f);
    }

    private void handleLoadMoreError() {
        this.view.showLoadMoreError();
    }

    private void handleLoadMoreErrorRetry() {
        this.view.getLifecycleEvent().mo18681d(C3055l5.f5996f).mo18687f(new C3240z5(this)).mo18664b(new C2716a5(this)).mo18664b(new C3195v8(this)).mo18687f(new C2940c7(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3208w9.f6136f, (C5378b<Throwable>) new C3193v6(this));
    }

    private void handlePromotionalClick() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C3005h7.f5944f).mo18687f(new C3034ja(this)).mo18681d(C3042k5.f5982f).mo18664b(new C3047ka(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C3032j8 j8Var = C3032j8.f5972f;
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        a.mo18655a((C5378b<? super R>) j8Var, (C5378b<Throwable>) new C2932c(crashReport));
        C5368e<R> a2 = this.view.getLifecycleEvent().mo18681d(C2942c9.f5875f).mo18687f(new C3161sa(this)).mo18681d(C3203w4.f6131f).mo18664b(new C3242z7(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C3125pa paVar = C3125pa.f6051f;
        CrashReport crashReport2 = this.crashReporter;
        crashReport2.getClass();
        a2.mo18655a((C5378b<? super R>) paVar, (C5378b<Throwable>) new C2932c(crashReport2));
    }

    private void handleReactionsResponse(ReactionsResponse reactionsResponse, boolean z) {
        if (reactionsResponse.wasSuccess()) {
            if (z) {
                this.homeAnalytics.sendDeleteEvent();
            } else {
                this.homeAnalytics.sendReactedEvent();
            }
        } else if (reactionsResponse.reactionsExceeded()) {
            this.view.showLogInDialog();
        } else if (reactionsResponse.wasNetworkError()) {
            this.view.showNetworkErrorToast();
        } else if (reactionsResponse.wasGeneralError()) {
            this.view.showGenericErrorToast();
        }
    }

    /* renamed from: i */
    static /* synthetic */ void m5989i(List list) {
    }

    private C5368e<HomeBundlesModel> loadFreshBundles() {
        return this.home.loadFreshHomeBundles().mo18681d(C2970eb.f5904f).mo18644a(this.viewScheduler).mo18664b(new C2995ga(this));
    }

    private C5368e<List<HomeBundle>> loadFreshBundlesAndReactions() {
        return loadFreshBundles().mo18669c().mo18691h(C3245za.f6173f).mo18681d(C3006h8.f5945f).mo18681d(C2718a7.f5553f).mo18638a(ActionBundle.class).mo18692i(new C2951d5(this));
    }

    private C5368e<HomeBundlesModel> loadHome() {
        C5368e<R> a = this.home.loadHomeBundles().mo18638a(HomeBundlesModel.class).mo18644a(this.viewScheduler);
        HomeView homeView = this.view;
        homeView.getClass();
        return a.mo18664b((C5378b<? super R>) new C3009hb(homeView)).mo18681d(C2970eb.f5904f).mo18644a(this.viewScheduler).mo18664b(new C3069m6(this));
    }

    private C5368e<List<HomeBundle>> loadHomeAndReactions() {
        return loadHome().mo18687f(new C3046k9(this));
    }

    private Single<HomeBundlesModel> loadNextBundles() {
        return this.home.loadNextHomeBundles().mo18681d(C2970eb.f5904f).mo18700m().mo18556a(this.viewScheduler).mo18564b(new C3056l6(this));
    }

    private C5368e<List<HomeBundle>> loadNextBundlesAndReactions() {
        return loadNextBundles().mo18567c().mo18691h(C3245za.f6173f).mo18681d(C3043k6.f5983f).mo18681d(C3007h9.f5946f).mo18638a(ActionBundle.class).mo18692i(new C3243z8(this));
    }

    private Single<List<HomeBundle>> loadReactionModel(String str, String str2, HomeBundlesModel homeBundlesModel) {
        return this.home.loadReactionModel(str, str2, homeBundlesModel).mo18556a(this.viewScheduler).mo18564b(new C3185ua(this));
    }

    /* renamed from: q */
    static /* synthetic */ void m5997q(HomeEvent homeEvent) {
    }

    /* access modifiers changed from: private */
    public C5368e<List<HomeBundle>> singlePressReactionButtonAction(EditorialHomeEvent editorialHomeEvent) {
        return this.home.isFirstReaction(editorialHomeEvent.getCardId(), editorialHomeEvent.getGroupId()).mo18568c(new C3196v9(this, editorialHomeEvent));
    }

    /* renamed from: u */
    static /* synthetic */ void m6001u(HomeEvent homeEvent) {
    }

    /* renamed from: v */
    static /* synthetic */ void m6002v(HomeEvent homeEvent) {
    }

    /* renamed from: w */
    static /* synthetic */ void m6003w(HomeEvent homeEvent) {
    }

    /* renamed from: x */
    static /* synthetic */ void m6004x(HomeEvent homeEvent) {
    }

    /* renamed from: b */
    public /* synthetic */ void mo11756b(EditorialHomeEvent editorialHomeEvent) {
        this.homeAnalytics.sendReactionButtonClickEvent();
        this.view.showReactionsPopup(editorialHomeEvent.getCardId(), editorialHomeEvent.getGroupId(), editorialHomeEvent.getBundlePosition());
    }

    /* renamed from: c */
    public /* synthetic */ void mo11769c(Throwable th) {
        this.crashReporter.log(th);
    }

    /* renamed from: g */
    public /* synthetic */ void mo11782g(HomeEvent homeEvent) {
        this.homeAnalytics.sendActionItemTapOnCardInteractEvent(homeEvent.getBundle().getTag(), homeEvent.getBundlePosition());
    }

    /* renamed from: h */
    public /* synthetic */ void mo11784h(HomeEvent homeEvent) {
        this.homeAnalytics.sendActionItemTapOnCardInteractEvent(homeEvent.getBundle().getTag(), homeEvent.getBundlePosition());
        this.homeNavigator.navigateToAppCoinsInformationView();
    }

    public void handleActionBundlesImpression() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C3181u6.f6107f).mo18687f(new C2943ca(this)).mo18681d(C2966e7.f5899f).mo18664b(new C3157s6(this)).mo18681d(C3167t4.f6093f).mo18694j(C2859b.f5711f).mo18638a(ActionBundle.class);
        Home home2 = this.home;
        home2.getClass();
        a.mo18689g((C5379n<? super R, ? extends C5328b>) new C3035jb(home2)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3134q7.f6060f, (C5378b<Throwable>) new C3098n7(this));
    }

    public void handleAdClick() {
        this.view.getLifecycleEvent().mo18681d(C3149ra.f6075f).mo18687f(new C3020i9(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3244z9.f6172f, (C5378b<Throwable>) C3231y8.f6159f);
    }

    public void handleAppClick() {
        this.view.getLifecycleEvent().mo18681d(C3004h6.f5943f).mo18687f(new C3096n5(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3120p5.f6046f, (C5378b<Throwable>) C3227y4.f6155f);
    }

    public void handleBottomReached() {
        this.view.getLifecycleEvent().mo18681d(C3170t7.f6096f).mo18687f(new C3204w5(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C2994g9.f5931f, (C5378b<Throwable>) C3197va.f6125f);
    }

    public void handleBundleScrolledRight() {
        this.view.getLifecycleEvent().mo18681d(C3099n8.f6025f).mo18687f(new C3218x7(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3239z4.f6167f, (C5378b<Throwable>) C3132q5.f6058f);
    }

    public void handleDismissClick() {
        this.view.getLifecycleEvent().mo18681d(C3160s9.f6086f).mo18687f(new C2939c6(this)).mo18681d(C2941c8.f5874f).mo18664b(new C2964e5(this)).mo18687f(new C3217x6(this)).mo18644a(this.viewScheduler).mo18664b(new C3072m9(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3143r4.f6069f, (C5378b<Throwable>) C3168t5.f6094f);
    }

    public void handleESkillsKnowMoreClick() {
        this.view.getLifecycleEvent().mo18681d(C2979f7.f5914f).mo18687f(new C3144r5(this)).mo18644a(this.viewScheduler).mo18664b(new C3121p6(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3097n6.f6023f, (C5378b<Throwable>) C3136q9.f6062f);
    }

    public void handleKnowMoreClick() {
        this.view.getLifecycleEvent().mo18681d(C2869b9.f5721f).mo18687f(new C2980f8(this)).mo18644a(this.viewScheduler).mo18664b(new C2968e9(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3131q4.f6057f, (C5378b<Throwable>) C2993g8.f5930f);
    }

    public void handleLongPressedReactionButton() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C3221xa.f6149f).mo18687f(new C3133q6(this)).mo18664b(new C3233ya(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2982fa faVar = C2982fa.f5917f;
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        a.mo18655a((C5378b<? super R>) faVar, (C5378b<Throwable>) new C2932c(crashReport));
    }

    public void handleMoreClick() {
        this.view.getLifecycleEvent().mo18681d(C3030j6.f5970f).mo18687f(new C2865b5(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3182u7.f6108f, (C5378b<Throwable>) C3100n9.f6026f);
    }

    public void handleNotifyMeAppComingSoonClick() {
        this.view.getLifecycleEvent().mo18681d(C2953d7.f5886f).mo18687f(new C3205w6(this)).mo18681d(C2956da.f5889f).mo18694j(C3179u4.f6105f).mo18664b(new C2992g7(this)).mo18694j(C2870ba.f5722f).mo18687f(new C2965e6(this)).mo18644a(C5376a.m10346b()).mo18664b(new C2867b7(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3191v4.f6117f, (C5378b<Throwable>) C2996gb.f5933f);
    }

    public void handlePromotionalImpression() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C3108o5.f6034f).mo18687f(new C2720a9(this)).mo18681d(C3008ha.f5947f).mo18664b(new C3148r9(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C3219x8 x8Var = C3219x8.f6147f;
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        a.mo18655a((C5378b<? super R>) x8Var, (C5378b<Throwable>) new C2932c(crashReport));
        C5368e<R> a2 = this.view.getLifecycleEvent().mo18681d(C3215x4.f6143f).mo18687f(new C3031j7(this)).mo18681d(C3194v7.f6121f).mo18664b(new C3145r6(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C3156s5 s5Var = C3156s5.f6082f;
        CrashReport crashReport2 = this.crashReporter;
        crashReport2.getClass();
        a2.mo18655a((C5378b<? super R>) s5Var, (C5378b<Throwable>) new C2932c(crashReport2));
    }

    public void handlePullToRefresh() {
        this.view.getLifecycleEvent().mo18681d(C3173ta.f6099f).mo18687f(new C2721aa(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C2967e8.f5900f, (C5378b<Throwable>) C3229y6.f6157f);
    }

    public void handleReactionButtonClick() {
        this.view.getLifecycleEvent().mo18681d(C3045k8.f5985f).mo18687f(new C3071m8(this)).mo18644a(this.viewScheduler).mo18687f(new C2977f5(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3033j9.f5973f, (C5378b<Throwable>) new C3018i7(this));
    }

    public void handleRetryClick() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C3232y9.f6160f).mo18687f(new C3158s7(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C3058l8 l8Var = C3058l8.f5999f;
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        a.mo18655a((C5378b<? super R>) l8Var, (C5378b<Throwable>) new C2932c(crashReport));
    }

    public void handleSnackLogInClick() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C3113oa.f6039f).mo18687f(new C3135q8(this)).mo18664b(new C2717a6(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C3044k7 k7Var = C3044k7.f5984f;
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        a.mo18655a((C5378b<? super R>) k7Var, (C5378b<Throwable>) new C2932c(crashReport));
    }

    public void handleUserReaction() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C3241z6.f6169f).mo18687f(new C2955d9(this)).mo18664b(new C3124p9(this)).mo18687f(new C3112o9(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C2990g5 g5Var = C2990g5.f5927f;
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        a.mo18655a((C5378b<? super R>) g5Var, (C5378b<Throwable>) new C2932c(crashReport));
    }

    /* renamed from: i */
    public /* synthetic */ void mo11803i(HomeEvent homeEvent) {
        this.view.removeLoadMoreError();
    }

    /* renamed from: j */
    public /* synthetic */ void mo11805j(HomeEvent homeEvent) {
        this.view.showLoadMore();
    }

    /* renamed from: k */
    public /* synthetic */ C5368e mo11806k(HomeEvent homeEvent) {
        return loadNextBundlesAndReactions();
    }

    /* renamed from: l */
    public /* synthetic */ C5368e mo11808l(View.LifecycleEvent lifecycleEvent) {
        return this.view.onLoadMoreRetryClicked();
    }

    /* renamed from: m */
    public /* synthetic */ C5368e mo11810m(View.LifecycleEvent lifecycleEvent) {
        return this.view.reactionButtonLongPress();
    }

    /* renamed from: n */
    public /* synthetic */ void mo11813n(HomeEvent homeEvent) {
        ActionBundle actionBundle = (ActionBundle) homeEvent.getBundle();
        if (actionBundle.getActionItem() != null) {
            this.homeAnalytics.sendPromotionalArticleImpressionEvent(actionBundle.getType().name(), actionBundle.getActionItem().getCardId());
        }
    }

    public void onCreateLoadBundles() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C3159s8.f6085f).mo18644a(this.viewScheduler).mo18664b(new C3228y5(this)).mo18687f(new C3017i6(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C3019i8 i8Var = C3019i8.f5958f;
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        a.mo18655a((C5378b<? super R>) i8Var, (C5378b<Throwable>) new C2932c(crashReport));
    }

    /* renamed from: p */
    public /* synthetic */ C5368e mo11816p(View.LifecycleEvent lifecycleEvent) {
        return this.view.appClicked();
    }

    public void present() {
        onCreateLoadBundles();
        handleAppClick();
        handleAdClick();
        handleMoreClick();
        handleBottomReached();
        handlePullToRefresh();
        handleRetryClick();
        handleBundleScrolledRight();
        handleKnowMoreClick();
        handleDismissClick();
        handleActionBundlesImpression();
        handleEditorialCardClick();
        handleInstallWalletOfferClick();
        handleReactionButtonClick();
        handleLongPressedReactionButton();
        handleUserReaction();
        handleSnackLogInClick();
        handleLoadMoreErrorRetry();
        handlePromotionalImpression();
        handlePromotionalClick();
        handleESkillsKnowMoreClick();
        handleNotifyMeAppComingSoonClick();
        handleCancelNotifyMeAppComingSoonClick();
    }

    /* renamed from: q */
    public /* synthetic */ C5368e mo11817q(View.LifecycleEvent lifecycleEvent) {
        return this.view.editorialCardClicked();
    }

    /* renamed from: r */
    public /* synthetic */ C5368e mo11818r(View.LifecycleEvent lifecycleEvent) {
        return this.view.visibleBundles();
    }

    /* renamed from: s */
    public /* synthetic */ C5368e mo11819s(View.LifecycleEvent lifecycleEvent) {
        return this.view.visibleBundles();
    }

    /* renamed from: u */
    public /* synthetic */ C5368e mo11821u(View.LifecycleEvent lifecycleEvent) {
        return this.view.reactionsButtonClicked();
    }

    /* renamed from: v */
    public /* synthetic */ C5368e mo11822v(View.LifecycleEvent lifecycleEvent) {
        return this.view.retryClicked().mo18644a(this.viewScheduler).mo18664b(new C3171t8(this)).mo18687f(new C3029j5(this)).mo18686f();
    }

    /* renamed from: w */
    public /* synthetic */ C5368e mo11823w(View.LifecycleEvent lifecycleEvent) {
        return this.view.snackLogInClick();
    }

    /* renamed from: x */
    public /* synthetic */ C5368e mo11824x(View.LifecycleEvent lifecycleEvent) {
        return this.view.reactionClicked();
    }

    /* renamed from: y */
    public /* synthetic */ void mo11825y(View.LifecycleEvent lifecycleEvent) {
        this.view.showLoading();
    }

    /* renamed from: z */
    public /* synthetic */ C5368e mo11826z(View.LifecycleEvent lifecycleEvent) {
        return loadHomeAndReactions();
    }

    /* renamed from: f */
    static /* synthetic */ Boolean m5975f(HomeBundle homeBundle) {
        return Boolean.valueOf(homeBundle.getType() == HomeBundle.BundleType.EDITORIAL);
    }

    /* renamed from: i */
    static /* synthetic */ void m5988i(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: k */
    static /* synthetic */ void m5991k(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: l */
    static /* synthetic */ void m5992l(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: p */
    static /* synthetic */ Boolean m5996p(HomeEvent homeEvent) {
        return Boolean.valueOf(homeEvent.getBundle().getType().equals(HomeBundle.BundleType.INFO_BUNDLE) || homeEvent.getBundle().getType().equals(HomeBundle.BundleType.WALLET_ADS_OFFER));
    }

    /* renamed from: s */
    static /* synthetic */ Pair m5999s(HomeEvent homeEvent) {
        return new Pair(Integer.valueOf(homeEvent.getBundlePosition()), (AppComingSoonPromotionalBundle) homeEvent.getBundle());
    }

    /* renamed from: z */
    static /* synthetic */ Pair m6006z(HomeEvent homeEvent) {
        return new Pair(Integer.valueOf(homeEvent.getBundlePosition()), (AppComingSoonPromotionalBundle) homeEvent.getBundle());
    }

    /* renamed from: a */
    public /* synthetic */ void mo11738a(ActionBundle actionBundle) {
        this.view.sendDeeplinkToWalletAppView(actionBundle.getActionItem().getUrl());
    }

    /* renamed from: d */
    public /* synthetic */ void mo11775d(Throwable th) {
        this.crashReporter.log(th);
    }

    /* renamed from: j */
    public /* synthetic */ C5368e mo11804j(View.LifecycleEvent lifecycleEvent) {
        return this.view.walletOfferCardInstallWalletClick();
    }

    /* renamed from: m */
    public /* synthetic */ void mo11811m(HomeEvent homeEvent) {
        HomeBundle bundle = homeEvent.getBundle();
        this.homeAnalytics.sendPromotionalAppImpressionEvent(bundle.getType().name(), ((PromotionalBundle) bundle).getApp().getPackageName());
        this.homeAnalytics.sendPromotionalAppHomeInteractImpressionEvent(bundle.getTag(), homeEvent.getBundlePosition());
    }

    /* renamed from: o */
    public /* synthetic */ C5368e mo11814o(View.LifecycleEvent lifecycleEvent) {
        return this.view.notifyMeClicked();
    }

    /* renamed from: t */
    public /* synthetic */ C5368e mo11820t(View.LifecycleEvent lifecycleEvent) {
        return this.view.refreshes().mo18664b(new C3180u5(this)).mo18687f(new C3183u8(this)).mo18686f();
    }

    /* renamed from: f */
    static /* synthetic */ Boolean m5976f(EditorialHomeEvent editorialHomeEvent) {
        return Boolean.valueOf((editorialHomeEvent.getBundle() instanceof ActionBundle) && editorialHomeEvent.getBundle().getType().isPromotional());
    }

    /* renamed from: j */
    static /* synthetic */ void m5990j(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: c */
    public /* synthetic */ Single mo11761c(ActionBundle actionBundle) {
        return loadReactionModel(actionBundle.getActionItem().getCardId(), actionBundle.getActionItem().getType());
    }

    /* renamed from: d */
    public /* synthetic */ C5368e mo11771d(HomeEvent homeEvent) {
        return this.home.remove((ActionBundle) homeEvent.getBundle()).mo18593a(C5368e.m10257c(homeEvent));
    }

    /* renamed from: e */
    public /* synthetic */ void mo11778e(Void voidR) {
        this.homeNavigator.navigateToLogIn();
    }

    /* renamed from: i */
    public /* synthetic */ C5368e mo11802i(View.LifecycleEvent lifecycleEvent) {
        return this.view.editorialCardClicked().mo18644a(this.viewScheduler).mo18664b(new C2981f9(this)).mo18686f();
    }

    /* renamed from: k */
    public /* synthetic */ C5368e mo11807k(View.LifecycleEvent lifecycleEvent) {
        return this.view.infoBundleKnowMoreClicked();
    }

    /* renamed from: l */
    public /* synthetic */ void mo11809l(HomeEvent homeEvent) {
        this.homeAnalytics.sendTapOnMoreInteractEvent(homeEvent.getBundlePosition(), homeEvent.getBundle().getTag(), homeEvent.getBundle().getContent().size());
    }

    private Single<List<HomeBundle>> loadReactionModel(String str, String str2) {
        return this.home.loadReactionModel(str, str2).mo18556a(this.viewScheduler).mo18564b(new C3206w7(this));
    }

    /* renamed from: e */
    public /* synthetic */ void mo11777e(HomeEvent homeEvent) {
        this.view.hideBundle(homeEvent.getBundlePosition());
    }

    /* renamed from: e */
    static /* synthetic */ void m5972e(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: a */
    public /* synthetic */ void mo11746a(List list) {
        this.view.updateEditorialCards();
    }

    /* renamed from: b */
    public /* synthetic */ void mo11760b(List list) {
        this.view.updateEditorialCards();
    }

    /* renamed from: d */
    public /* synthetic */ C5368e mo11772d(View.LifecycleEvent lifecycleEvent) {
        return this.view.reachesBottom().mo18681d(new C2978f6(this)).mo18644a(this.viewScheduler).mo18664b(new C3016i5(this)).mo18687f(new C3111o8(this)).mo18686f();
    }

    /* renamed from: g */
    public /* synthetic */ C5368e mo11781g(View.LifecycleEvent lifecycleEvent) {
        return this.view.dismissBundleClicked();
    }

    /* renamed from: h */
    public /* synthetic */ C5368e mo11783h(View.LifecycleEvent lifecycleEvent) {
        return this.view.eSkillsKnowMoreClick();
    }

    /* renamed from: g */
    static /* synthetic */ void m5984g(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: h */
    static /* synthetic */ void m5986h(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: a */
    public /* synthetic */ Single mo11728a(HomeBundlesModel homeBundlesModel, ActionBundle actionBundle) {
        return loadReactionModel(actionBundle.getActionItem().getCardId(), actionBundle.getActionItem().getType(), homeBundlesModel);
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo11748b(HomeBundlesModel homeBundlesModel) {
        return C5368e.m10234a(homeBundlesModel.getList()).mo18681d(C2954d8.f5887f).mo18681d(C3207w8.f6135f).mo18638a(ActionBundle.class).mo18681d(C3147r8.f6073f).mo18692i(new C3021ia(this, homeBundlesModel));
    }

    /* renamed from: e */
    public /* synthetic */ C5368e mo11776e(View.LifecycleEvent lifecycleEvent) {
        C5368e<HomeEvent> b = this.view.bundleScrolled().mo18664b(new C3110o7(this));
        CrashReport crashReport = this.crashReporter;
        crashReport.getClass();
        return b.mo18649a((C5378b<? super Throwable>) new C2932c(crashReport)).mo18686f();
    }

    /* renamed from: c */
    public /* synthetic */ void mo11766c(AppHomeEvent appHomeEvent) {
        HomeBundle bundle = appHomeEvent.getBundle();
        this.homeAnalytics.sendPromotionalAppClickEvent(bundle.getType().name(), ((PromotionalBundle) bundle).getApp().getPackageName());
    }

    /* renamed from: f */
    public /* synthetic */ void mo11780f(HomeEvent homeEvent) {
        this.homeAnalytics.sendActionItemTapOnCardInteractEvent(homeEvent.getBundle().getTag(), homeEvent.getBundlePosition());
        this.homeNavigator.navigateToESkillsSectionInAppCoinsInfoView();
    }

    /* renamed from: n */
    public /* synthetic */ C5368e mo11812n(View.LifecycleEvent lifecycleEvent) {
        C5368e<HomeEvent> a = this.view.moreClicked().mo18664b(new C3220x9(this)).mo18644a(this.viewScheduler);
        HomeNavigator homeNavigator2 = this.homeNavigator;
        homeNavigator2.getClass();
        return a.mo18664b((C5378b<? super HomeEvent>) new C2944cb(homeNavigator2)).mo18686f();
    }

    /* renamed from: m */
    static /* synthetic */ void m5993m(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo11733a(View.LifecycleEvent lifecycleEvent) {
        return this.view.visibleBundles();
    }

    /* renamed from: f */
    static /* synthetic */ void m5979f(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: a */
    public /* synthetic */ void mo11740a(HomeEvent homeEvent) {
        if (homeEvent.getBundle().getType().equals(HomeBundle.BundleType.INFO_BUNDLE) || homeEvent.getBundle().getType().equals(HomeBundle.BundleType.WALLET_ADS_OFFER) || homeEvent.getBundle().getType().isPromotional()) {
            this.homeAnalytics.sendActionItemImpressionEvent(homeEvent.getBundle().getTag(), homeEvent.getBundlePosition());
            return;
        }
        ActionBundle actionBundle = (ActionBundle) homeEvent.getBundle();
        if (actionBundle.getActionItem() != null) {
            this.homeAnalytics.sendEditorialImpressionEvent(actionBundle.getTag(), homeEvent.getBundlePosition(), actionBundle.getActionItem().getCardId());
            this.homeAnalytics.sendActionItemEditorialImpressionEvent(actionBundle.getTag(), homeEvent.getBundlePosition(), actionBundle.getActionItem().getCardId());
        }
    }

    /* renamed from: d */
    public /* synthetic */ C5368e mo11773d(Void voidR) {
        return loadNextBundlesAndReactions();
    }

    /* renamed from: b */
    static /* synthetic */ Boolean m5956b(HomeBundle homeBundle) {
        return Boolean.valueOf(homeBundle.getType() == HomeBundle.BundleType.EDITORIAL);
    }

    /* renamed from: d */
    static /* synthetic */ AppComingSoonPromotionalBundle m5961d(Pair pair) {
        return (AppComingSoonPromotionalBundle) pair.second;
    }

    /* renamed from: n */
    static /* synthetic */ void m5994n(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: c */
    public /* synthetic */ void mo11768c(EditorialHomeEvent editorialHomeEvent) {
        HomeBundle bundle = editorialHomeEvent.getBundle();
        this.homeAnalytics.sendPromotionalArticleClickEvent(bundle.getType().name(), ((ActionBundle) bundle).getActionItem().getCardId());
    }

    /* renamed from: f */
    public /* synthetic */ C5368e mo11779f(View.LifecycleEvent lifecycleEvent) {
        return this.view.cancelNotifyMeClicked();
    }

    /* renamed from: b */
    public /* synthetic */ Single mo11747b(ActionBundle actionBundle) {
        return loadReactionModel(actionBundle.getActionItem().getCardId(), actionBundle.getActionItem().getType());
    }

    /* renamed from: d */
    public /* synthetic */ void mo11774d(AppComingSoonPromotionalBundle appComingSoonPromotionalBundle) {
        this.view.updateAppComingSoonStatus(appComingSoonPromotionalBundle, true);
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo11750b(ReactionsHomeEvent reactionsHomeEvent) {
        return this.home.setReaction(reactionsHomeEvent.getCardId(), reactionsHomeEvent.getGroupId(), reactionsHomeEvent.getReaction()).mo18567c().mo18681d(C2983fb.f5918f).mo18644a(this.viewScheduler).mo18664b(new C3123p8(this)).mo18681d(C2710a.f5545f).mo18692i(new C3192v5(this, reactionsHomeEvent));
    }

    /* renamed from: c */
    public /* synthetic */ void mo11767c(HomeEvent homeEvent) {
        this.homeAnalytics.sendActionItemDismissInteractEvent(homeEvent.getBundle().getTag(), homeEvent.getBundlePosition());
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo11763c(View.LifecycleEvent lifecycleEvent) {
        return this.view.appClicked().mo18664b(new C3155s4(this)).mo18644a(this.viewScheduler).mo18664b(new C2952d6(this)).mo18686f();
    }

    /* renamed from: b */
    public /* synthetic */ void mo11754b(AppHomeEvent appHomeEvent) {
        Application app = appHomeEvent.getApp();
        if (appHomeEvent.getBundle().getType().equals(HomeBundle.BundleType.EDITORS)) {
            this.homeNavigator.navigateWithEditorsPosition(appHomeEvent.getApp().getAppId(), appHomeEvent.getApp().getPackageName(), "", "", appHomeEvent.getApp().getTag(), String.valueOf(appHomeEvent.getAppPosition()));
        } else if (appHomeEvent.getBundle().getType().equals(HomeBundle.BundleType.APPCOINS_ADS)) {
            RewardApp rewardApp = (RewardApp) app;
            this.homeAnalytics.convertAppcAdClick(rewardApp.getClickUrl());
            this.homeNavigator.navigateWithDownloadUrlAndReward(rewardApp.getAppId(), rewardApp.getPackageName(), rewardApp.getTag(), rewardApp.getDownloadUrl(), (float) rewardApp.getReward().getAppc());
        } else if (appHomeEvent.getBundle().getType().equals(HomeBundle.BundleType.ESKILLS)) {
            this.homeNavigator.navigateToEskillsAppView(app.getAppId(), app.getPackageName(), app.getTag());
        } else {
            this.homeNavigator.navigateToAppView(app.getAppId(), app.getPackageName(), app.getTag());
        }
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo11764c(Object obj) {
        return loadNextBundlesAndReactions();
    }

    /* renamed from: c */
    public /* synthetic */ void mo11765c(HomeBundlesModel homeBundlesModel) {
        this.homeAnalytics.sendLoadMoreInteractEvent();
        if (homeBundlesModel.hasErrors()) {
            handleLoadMoreError();
        } else if (!homeBundlesModel.isLoading()) {
            this.view.showMoreHomeBundles(homeBundlesModel.getList());
            this.view.hideLoading();
        }
        this.view.hideShowMore();
    }

    /* renamed from: a */
    public /* synthetic */ void mo11744a(Throwable th) {
        this.crashReporter.log(th);
    }

    /* renamed from: a */
    public /* synthetic */ void mo11742a(ReactionsHomeEvent reactionsHomeEvent) {
        this.userFeedbackAnalytics.sendReactionEvent();
    }

    /* renamed from: a */
    public /* synthetic */ void mo11743a(ReactionsResponse reactionsResponse) {
        handleReactionsResponse(reactionsResponse, false);
    }

    /* renamed from: a */
    public /* synthetic */ Single mo11730a(ReactionsHomeEvent reactionsHomeEvent, ReactionsResponse reactionsResponse) {
        return loadReactionModel(reactionsHomeEvent.getCardId(), reactionsHomeEvent.getGroupId());
    }

    /* renamed from: c */
    public /* synthetic */ void mo11770c(Void voidR) {
        this.view.showLoading();
    }

    /* renamed from: a */
    public /* synthetic */ void mo11739a(AppHomeEvent appHomeEvent) {
        this.homeAnalytics.sendTapOnAppInteractEvent((double) appHomeEvent.getApp().getRating(), appHomeEvent.getApp().getPackageName(), appHomeEvent.getAppPosition(), appHomeEvent.getBundlePosition(), appHomeEvent.getBundle().getTag(), appHomeEvent.getBundle().getContent().size());
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo11762c(AppComingSoonPromotionalBundle appComingSoonPromotionalBundle) {
        return this.home.setupAppComingSoonNotification(appComingSoonPromotionalBundle.getActionItem().getPackageName()).mo18593a(C5368e.m10257c(appComingSoonPromotionalBundle));
    }

    /* renamed from: c */
    static /* synthetic */ AppComingSoonPromotionalBundle m5958c(Pair pair) {
        return (AppComingSoonPromotionalBundle) pair.second;
    }

    /* renamed from: a */
    public /* synthetic */ void mo11741a(EditorialHomeEvent editorialHomeEvent) {
        this.homeAnalytics.sendEditorialInteractEvent(editorialHomeEvent.getBundle().getTag(), editorialHomeEvent.getBundlePosition(), editorialHomeEvent.getCardId());
        this.homeAnalytics.sendActionItemTapOnCardInteractEvent(editorialHomeEvent.getBundle().getTag(), editorialHomeEvent.getBundlePosition(), editorialHomeEvent.getCardId());
        this.homeNavigator.navigateToEditorial(editorialHomeEvent.getCardId());
    }

    /* renamed from: a */
    public /* synthetic */ void mo11736a(AdHomeEvent adHomeEvent) {
        this.homeAnalytics.sendAdClickEvent(adHomeEvent.getAdClick().getAd().getStars().intValue(), adHomeEvent.getAdClick().getAd().getPackageName(), adHomeEvent.getBundlePosition(), adHomeEvent.getBundle().getTag(), adHomeEvent.getType(), ApplicationAd.Network.SERVER);
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo11749b(View.LifecycleEvent lifecycleEvent) {
        C5368e<R> j = this.view.adClicked().mo18664b(new C3146r7(this)).mo18694j(C3068m5.f6010f);
        AdMapper adMapper2 = this.adMapper;
        adMapper2.getClass();
        return j.mo18694j(new C3048kb(adMapper2)).mo18644a(this.viewScheduler).mo18649a((C5378b<? super Throwable>) new C3101na(this)).mo18664b(new C3003h5(this)).mo18686f();
    }

    /* renamed from: a */
    public /* synthetic */ void mo11737a(SearchAdNavigationResult searchAdNavigationResult) {
        this.homeNavigator.navigateToAppView(searchAdNavigationResult.getTag(), searchAdNavigationResult.getSearchAdResult());
    }

    /* renamed from: b */
    public /* synthetic */ void mo11759b(Throwable th) {
        Logger.getInstance().mo12981e(HomePresenter.class.getCanonicalName(), th);
    }

    /* renamed from: a */
    public /* synthetic */ Boolean mo11727a(Object obj) {
        return Boolean.valueOf(this.home.hasMore());
    }

    /* renamed from: a */
    public /* synthetic */ void mo11745a(Void voidR) {
        this.homeAnalytics.sendPullRefreshInteractEvent();
    }

    /* renamed from: a */
    public /* synthetic */ void mo11735a(HomeBundlesModel homeBundlesModel) {
        this.view.hideRefresh();
        if (homeBundlesModel.hasErrors()) {
            handleError(homeBundlesModel.getError());
        } else if (!homeBundlesModel.isLoading()) {
            this.view.showBundles(homeBundlesModel.getList());
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo11755b(HomeEvent homeEvent) {
        this.homeAnalytics.sendScrollRightInteractEvent(homeEvent.getBundlePosition(), homeEvent.getBundle().getTag(), homeEvent.getBundle().getContent().size());
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo11732a(EditorialHomeEvent editorialHomeEvent, Boolean bool) {
        if (!bool.booleanValue()) {
            return this.home.deleteReaction(editorialHomeEvent.getCardId(), editorialHomeEvent.getGroupId()).mo18567c().mo18664b(new C3060la(this)).mo18681d(C2710a.f5545f).mo18692i(new C2969ea(this, editorialHomeEvent));
        }
        this.homeAnalytics.sendReactionButtonClickEvent();
        this.view.showReactionsPopup(editorialHomeEvent.getCardId(), editorialHomeEvent.getGroupId(), editorialHomeEvent.getBundlePosition());
        return C5368e.m10257c(Collections.emptyList());
    }

    /* renamed from: b */
    public /* synthetic */ void mo11758b(Object obj) {
        this.view.showLoadMore();
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo11751b(Void voidR) {
        return loadFreshBundlesAndReactions();
    }

    /* renamed from: b */
    public /* synthetic */ void mo11757b(ReactionsResponse reactionsResponse) {
        handleReactionsResponse(reactionsResponse, true);
    }

    /* renamed from: b */
    public /* synthetic */ void mo11752b(Pair pair) {
        this.homeAnalytics.sendPromotionalArticleClickEvent(((AppComingSoonPromotionalBundle) pair.second).getType().name(), ((AppComingSoonPromotionalBundle) pair.second).getActionItem().getCardId());
        this.homeAnalytics.sendActionItemTapOnCardInteractEvent(((AppComingSoonPromotionalBundle) pair.second).getTag(), ((Integer) pair.first).intValue(), ((AppComingSoonPromotionalBundle) pair.second).getActionItem().getCardId());
    }

    /* renamed from: a */
    public /* synthetic */ Single mo11729a(EditorialHomeEvent editorialHomeEvent, ReactionsResponse reactionsResponse) {
        return loadReactionModel(editorialHomeEvent.getCardId(), editorialHomeEvent.getGroupId());
    }

    /* renamed from: b */
    public /* synthetic */ void mo11753b(AppComingSoonPromotionalBundle appComingSoonPromotionalBundle) {
        this.view.updateAppComingSoonStatus(appComingSoonPromotionalBundle, false);
    }

    /* renamed from: a */
    public /* synthetic */ void mo11734a(Pair pair) {
        this.homeAnalytics.sendPromotionalArticleClickEvent(((AppComingSoonPromotionalBundle) pair.second).getType().name(), ((AppComingSoonPromotionalBundle) pair.second).getActionItem().getCardId());
        this.homeAnalytics.sendActionItemTapOnCardInteractEvent(((AppComingSoonPromotionalBundle) pair.second).getTag(), ((Integer) pair.first).intValue(), ((AppComingSoonPromotionalBundle) pair.second).getActionItem().getCardId());
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo11731a(AppComingSoonPromotionalBundle appComingSoonPromotionalBundle) {
        return this.home.cancelAppComingSoonNotification(appComingSoonPromotionalBundle.getActionItem().getPackageName()).mo18593a(C5368e.m10257c(appComingSoonPromotionalBundle));
    }
}
