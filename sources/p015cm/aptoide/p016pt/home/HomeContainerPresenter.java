package p015cm.aptoide.p016pt.home;

import p015cm.aptoide.accountmanager.Account;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.home.ChipManager;
import p015cm.aptoide.p016pt.home.HomeContainerFragment;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.presenter.View;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.Single;
import p123rx.exceptions.OnErrorNotImplementedException;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.home.HomeContainerPresenter */
public class HomeContainerPresenter implements Presenter {
    private final AptoideAccountManager accountManager;
    private final ChipManager chipManager;
    private final EskillsPreferencesManager eskillsPreferencesManager;
    private final Home home;
    private final HomeAnalytics homeAnalytics;
    private final HomeContainerNavigator homeContainerNavigator;
    private final HomeNavigator homeNavigator;
    private final HomeContainerView view;
    private final C5373h viewScheduler;

    /* renamed from: cm.aptoide.pt.home.HomeContainerPresenter$1 */
    static /* synthetic */ class C27061 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$home$HomeContainerFragment$ChipsEvents;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                cm.aptoide.pt.home.HomeContainerFragment$ChipsEvents[] r0 = p015cm.aptoide.p016pt.home.HomeContainerFragment.ChipsEvents.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$cm$aptoide$pt$home$HomeContainerFragment$ChipsEvents = r0
                cm.aptoide.pt.home.HomeContainerFragment$ChipsEvents r1 = p015cm.aptoide.p016pt.home.HomeContainerFragment.ChipsEvents.GAMES     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$cm$aptoide$pt$home$HomeContainerFragment$ChipsEvents     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.home.HomeContainerFragment$ChipsEvents r1 = p015cm.aptoide.p016pt.home.HomeContainerFragment.ChipsEvents.APPS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.home.HomeContainerPresenter.C27061.<clinit>():void");
        }
    }

    public HomeContainerPresenter(HomeContainerView homeContainerView, C5373h hVar, AptoideAccountManager aptoideAccountManager, HomeContainerNavigator homeContainerNavigator2, HomeNavigator homeNavigator2, HomeAnalytics homeAnalytics2, Home home2, ChipManager chipManager2, EskillsPreferencesManager eskillsPreferencesManager2) {
        this.view = homeContainerView;
        this.viewScheduler = hVar;
        this.accountManager = aptoideAccountManager;
        this.homeContainerNavigator = homeContainerNavigator2;
        this.homeNavigator = homeNavigator2;
        this.homeAnalytics = homeAnalytics2;
        this.home = home2;
        this.chipManager = chipManager2;
        this.eskillsPreferencesManager = eskillsPreferencesManager2;
    }

    /* renamed from: L */
    static /* synthetic */ void m5808L(View.LifecycleEvent lifecycleEvent) {
    }

    /* renamed from: b */
    static /* synthetic */ void m5809b(HomeContainerFragment.ChipsEvents chipsEvents) {
    }

    /* renamed from: c */
    static /* synthetic */ void m5811c(HomePromotionsWrapper homePromotionsWrapper) {
    }

    /* renamed from: c */
    static /* synthetic */ void m5812c(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: c */
    static /* synthetic */ void m5813c(Void voidR) {
    }

    /* renamed from: d */
    static /* synthetic */ void m5814d(Account account) {
    }

    /* renamed from: d */
    static /* synthetic */ void m5815d(Boolean bool) {
    }

    /* renamed from: d */
    static /* synthetic */ void m5817d(Void voidR) {
    }

    /* renamed from: e */
    static /* synthetic */ void m5818e(Boolean bool) {
    }

    /* renamed from: f */
    static /* synthetic */ void m5820f(Boolean bool) {
    }

    /* renamed from: f */
    static /* synthetic */ void m5821f(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* access modifiers changed from: private */
    /* renamed from: getUserAvatar */
    public C5368e<String> mo11628b(Account account) {
        return C5368e.m10257c((account == null || !account.isLoggedIn()) ? null : account.getAvatar());
    }

    private void handleBottomNavigationEvents() {
        this.view.getLifecycleEvent().mo18681d(C2861b1.f5713f).mo18687f(new C2714a3(this)).mo18644a(this.viewScheduler).mo18687f(new C2936c3(this)).mo18664b(new C3053l3(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C2962e3.f5895f, (C5378b<Throwable>) C3051l1.f5992f);
    }

    /* renamed from: j */
    static /* synthetic */ void m5826j(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: k */
    static /* synthetic */ void m5827k(String str) {
    }

    /* renamed from: m */
    static /* synthetic */ void m5831m(String str) {
    }

    /* renamed from: m */
    static /* synthetic */ void m5832m(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: n */
    static /* synthetic */ void m5834n(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: o */
    static /* synthetic */ void m5835o(String str) {
    }

    /* renamed from: q */
    static /* synthetic */ void m5839q(String str) {
    }

    /* renamed from: q */
    static /* synthetic */ void m5840q(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: r */
    static /* synthetic */ void m5842r(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: s */
    static /* synthetic */ void m5843s(String str) {
    }

    /* renamed from: u */
    static /* synthetic */ void m5847u(String str) {
    }

    /* renamed from: w */
    static /* synthetic */ void m5851w(String str) {
    }

    /* renamed from: y */
    static /* synthetic */ void m5855y(String str) {
    }

    /* renamed from: z */
    static /* synthetic */ void m5857z(String str) {
    }

    /* renamed from: a */
    public /* synthetic */ void mo11622a(HomeContainerFragment.ChipsEvents chipsEvents) {
        int i = C27061.$SwitchMap$cm$aptoide$pt$home$HomeContainerFragment$ChipsEvents[chipsEvents.ordinal()];
        if (i == 1) {
            this.homeContainerNavigator.loadGamesHomeContent();
        } else if (i != 2) {
            this.homeContainerNavigator.loadMainHomeContent();
        } else {
            this.homeContainerNavigator.loadAppsHomeContent();
        }
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo11629b(View.LifecycleEvent lifecycleEvent) {
        return this.homeNavigator.bottomNavigation();
    }

    public void checkForPromotionApps() {
        this.view.getLifecycleEvent().mo18681d(C3224y1.f6152f).mo18692i(new C3013i2(this)).mo18681d(C2957db.f5890f).mo18644a(this.viewScheduler).mo18664b(new C3064m1(this)).mo18681d(C3022ib.f5962f).mo18664b(new C2860b0(this)).mo18649a((C5378b<? super Throwable>) C2996gb.f5933f).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3115p0.f6041f, (C5378b<Throwable>) new C3139r0(this));
    }

    /* renamed from: d */
    public /* synthetic */ void mo11640d(String str) {
        this.homeAnalytics.sendPromotionsDialogDismissEvent();
        this.view.dismissPromotionsDialog();
    }

    /* renamed from: e */
    public /* synthetic */ void mo11642e(String str) {
        this.homeAnalytics.sendPromotionsDialogNavigateEvent();
        this.view.dismissPromotionsDialog();
        this.homeNavigator.navigateToPromotions();
    }

    /* renamed from: g */
    public /* synthetic */ C5328b mo11645g(String str) {
        return this.accountManager.updateTermsAndConditions();
    }

    /* renamed from: h */
    public /* synthetic */ C5368e mo11648h(View.LifecycleEvent lifecycleEvent) {
        return this.view.promotionsHomeDialogClicked();
    }

    public void handleClickOnAppsChip() {
        this.view.getLifecycleEvent().mo18681d(C3037k0.f5977f).mo18687f(new C3163t0(this)).mo18664b(new C3175u0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3026j2.f5966f, (C5378b<Throwable>) C2974f2.f5909f);
    }

    public void handleClickOnEskillsDialogCancel() {
        this.view.getLifecycleEvent().mo18681d(C2973f1.f5908f).mo18687f(new C3105o2(this)).mo18681d(C3235z0.f6163f).mo18664b(new C2999h1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3162t.f6088f, (C5378b<Throwable>) C2972f0.f5907f);
    }

    public void handleClickOnEskillsDialogNavigate() {
        this.view.getLifecycleEvent().mo18681d(C3014i3.f5953f).mo18687f(new C3187v0(this)).mo18681d(C2933c0.f5866f).mo18664b(new C3106o3(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3000h2.f5939f, (C5378b<Throwable>) C3104o1.f6030f);
    }

    public void handleClickOnGamesChip() {
        this.view.getLifecycleEvent().mo18681d(C3040k3.f5980f).mo18687f(new C3024j0(this)).mo18664b(new C3063m0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3234z.f6162f, (C5378b<Throwable>) C3153s2.f6079f);
    }

    public void handleClickOnPrivacyPolicy() {
        this.view.getLifecycleEvent().mo18681d(C3151s0.f6077f).mo18687f(new C3116p1(this)).mo18681d(C3177u2.f6103f).mo18664b(new C3128q1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3140r1.f6066f, (C5378b<Throwable>) C3174u.f6100f);
    }

    public void handleClickOnPromotionsDialogCancel() {
        this.view.getLifecycleEvent().mo18681d(C2987g2.f5924f).mo18687f(new C3094n3(this)).mo18681d(C3236z1.f6164f).mo18664b(new C3118p3(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C2998h0.f5937f, (C5378b<Throwable>) C3199w0.f6127f);
    }

    public void handleClickOnPromotionsDialogContinue() {
        this.view.getLifecycleEvent().mo18681d(C3130q3.f6056f).mo18687f(new C3164t1(this)).mo18681d(C3165t2.f6091f).mo18664b(new C2947d1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3039k2.f5979f, (C5378b<Throwable>) C3188v1.f6114f);
    }

    public void handleClickOnTermsAndConditions() {
        this.view.getLifecycleEvent().mo18681d(C3038k1.f5978f).mo18687f(new C3027j3(this)).mo18681d(C3211x0.f6139f).mo18664b(new C2988g3(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3001h3.f5940f, (C5378b<Throwable>) C3225y2.f6153f);
    }

    public void handleLoggedInAcceptTermsAndConditions() {
        this.view.getLifecycleEvent().mo18681d(C2863b3.f5715f).mo18687f(new C3198w(this)).mo18681d(C3061lb.f6002f).mo18681d(C2713a2.f5548f).mo18644a(this.viewScheduler).mo18664b(new C3103o0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3237z2.f6165f, (C5378b<Throwable>) C2934c1.f5867f);
    }

    public void handlePromotionsClick() {
        this.view.getLifecycleEvent().mo18681d(C3127q0.f6053f).mo18687f(new C2712a1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C2961e2.f5894f, (C5378b<Throwable>) C3201w2.f6129f);
    }

    public void handleTermsAndConditionsContinueClicked() {
        this.view.getLifecycleEvent().mo18681d(C3065m2.f6007f).mo18687f(new C2949d3(this)).mo18681d(C2986g1.f5923f).mo18689g(new C3011i0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3223y0.f6151f, (C5378b<Throwable>) C2948d2.f5881f);
    }

    public void handleTermsAndConditionsLogOutClicked() {
        this.view.getLifecycleEvent().mo18681d(C3141r2.f6067f).mo18687f(new C3066m3(this)).mo18681d(C3093n2.f6019f).mo18689g(new C3222y(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3092n1.f6018f, (C5378b<Throwable>) C3176u1.f6102f);
    }

    public void handleUserImageClick() {
        this.view.getLifecycleEvent().mo18681d(C3189v2.f6115f).mo18687f(new C3200w1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3025j1.f5965f, (C5378b<Throwable>) C2711a0.f5546f);
    }

    /* renamed from: i */
    public /* synthetic */ void mo11663i(String str) {
        if (str != null) {
            this.view.setUserImage(str);
        } else {
            this.view.setDefaultUserImage();
        }
        this.view.showAvatar();
    }

    /* renamed from: k */
    public /* synthetic */ C5368e mo11665k(View.LifecycleEvent lifecycleEvent) {
        return this.accountManager.accountStatus().mo18669c();
    }

    /* renamed from: l */
    public /* synthetic */ C5368e mo11666l(View.LifecycleEvent lifecycleEvent) {
        return this.view.toolbarPromotionsClick().mo18644a(this.viewScheduler).mo18664b(new C3212x1(this)).mo18686f();
    }

    public void loadMainHomeContent() {
        this.view.getLifecycleEvent().mo18681d(C2975f3.f5910f).mo18687f(new C3186v(this)).mo18664b(new C3050l0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C3052l2.f5993f, (C5378b<Throwable>) C3091n0.f6017f);
    }

    public void loadUserImage() {
        this.view.getLifecycleEvent().mo18681d(C2935c2.f5868f).mo18687f(new C3210x(this)).mo18687f(new C3117p2(this)).mo18644a(this.viewScheduler).mo18664b(new C3213x2(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C2946d0.f5879f, (C5378b<Throwable>) C3152s1.f6078f);
    }

    /* renamed from: o */
    public /* synthetic */ C5368e mo11671o(View.LifecycleEvent lifecycleEvent) {
        return this.view.toolbarUserClick().mo18644a(this.viewScheduler).mo18664b(new C3012i1(this)).mo18686f();
    }

    /* renamed from: p */
    public /* synthetic */ C5368e mo11672p(View.LifecycleEvent lifecycleEvent) {
        return this.view.isChipChecked();
    }

    public void present() {
        loadMainHomeContent();
        loadUserImage();
        handleUserImageClick();
        handlePromotionsClick();
        checkForPromotionApps();
        handleClickOnPromotionsDialogContinue();
        handleClickOnPromotionsDialogCancel();
        handleLoggedInAcceptTermsAndConditions();
        handleTermsAndConditionsContinueClicked();
        handleTermsAndConditionsLogOutClicked();
        handleClickOnTermsAndConditions();
        handleClickOnPrivacyPolicy();
        handleClickOnGamesChip();
        handleClickOnAppsChip();
        handleBottomNavigationEvents();
    }

    /* renamed from: s */
    public /* synthetic */ void mo11675s(View.LifecycleEvent lifecycleEvent) {
        this.eskillsPreferencesManager.setEskillsDialogShown();
        this.view.showEskillsHomeDialog();
    }

    public void showEskillsDialog() {
        this.view.getLifecycleEvent().mo18681d(C3129q2.f6055f).mo18644a(this.viewScheduler).mo18681d(new C2985g0(this)).mo18664b(new C2862b2(this)).mo18649a((C5378b<? super Throwable>) C2996gb.f5933f).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C2959e0.f5892f, (C5378b<Throwable>) new C2960e1(this));
    }

    /* renamed from: c */
    static /* synthetic */ Boolean m5810c(Account account) {
        return Boolean.valueOf(!account.acceptedPrivacyPolicy() || !account.acceptedTermsAndConditions());
    }

    /* renamed from: p */
    static /* synthetic */ void m5838p(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: f */
    public /* synthetic */ void mo11644f(String str) {
        this.homeNavigator.navigateToTermsAndConditions();
    }

    /* renamed from: g */
    public /* synthetic */ C5368e mo11646g(View.LifecycleEvent lifecycleEvent) {
        return this.view.gdprDialogClicked();
    }

    /* renamed from: h */
    public /* synthetic */ C5328b mo11647h(String str) {
        return this.accountManager.logout();
    }

    /* renamed from: m */
    public /* synthetic */ C5368e mo11669m(View.LifecycleEvent lifecycleEvent) {
        return this.view.gdprDialogClicked();
    }

    /* renamed from: n */
    public /* synthetic */ C5368e mo11670n(View.LifecycleEvent lifecycleEvent) {
        return this.view.gdprDialogClicked();
    }

    /* renamed from: q */
    public /* synthetic */ C5368e mo11673q(View.LifecycleEvent lifecycleEvent) {
        return this.accountManager.accountStatus();
    }

    /* renamed from: r */
    public /* synthetic */ Boolean mo11674r(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(this.eskillsPreferencesManager.shouldShowEskillsDialog());
    }

    /* renamed from: g */
    static /* synthetic */ void m5822g(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: h */
    static /* synthetic */ void m5823h(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: k */
    static /* synthetic */ void m5828k(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: b */
    public /* synthetic */ void mo11634b(Void voidR) {
        this.homeNavigator.navigateToMyAccount();
    }

    /* renamed from: c */
    public /* synthetic */ void mo11637c(String str) {
        this.homeNavigator.navigateToPrivacyPolicy();
    }

    /* renamed from: d */
    public /* synthetic */ C5368e mo11639d(View.LifecycleEvent lifecycleEvent) {
        return this.view.eskillsHomeDialogClicked();
    }

    /* renamed from: f */
    public /* synthetic */ C5368e mo11643f(View.LifecycleEvent lifecycleEvent) {
        return this.view.gamesChipClicked();
    }

    /* renamed from: j */
    public /* synthetic */ C5368e mo11664j(View.LifecycleEvent lifecycleEvent) {
        return this.view.gdprDialogClicked();
    }

    /* renamed from: d */
    static /* synthetic */ void m5816d(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: b */
    public /* synthetic */ void mo11630b(HomePromotionsWrapper homePromotionsWrapper) {
        this.homeAnalytics.sendPromotionsDialogImpressionEvent();
        this.home.setPromotionsDialogShown();
        this.view.showPromotionsHomeDialog(homePromotionsWrapper);
    }

    /* renamed from: c */
    public /* synthetic */ void mo11636c(Boolean bool) {
        if (bool.booleanValue()) {
            this.homeContainerNavigator.loadGamesHomeContent();
            this.chipManager.setCurrentChip(ChipManager.Chip.GAMES);
        } else {
            this.homeContainerNavigator.loadMainHomeContent();
            this.chipManager.setCurrentChip((ChipManager.Chip) null);
        }
        this.homeAnalytics.sendChipInteractEvent(ChipManager.Chip.GAMES.getName());
        this.homeAnalytics.sendChipHomeInteractEvent(ChipManager.Chip.GAMES.getName());
    }

    /* renamed from: e */
    public /* synthetic */ C5368e mo11641e(View.LifecycleEvent lifecycleEvent) {
        return this.view.eskillsHomeDialogClicked();
    }

    /* renamed from: i */
    public /* synthetic */ C5368e mo11662i(View.LifecycleEvent lifecycleEvent) {
        return this.view.promotionsHomeDialogClicked();
    }

    /* renamed from: e */
    static /* synthetic */ void m5819e(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: i */
    static /* synthetic */ void m5824i(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: o */
    static /* synthetic */ void m5836o(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo11620a(Integer num) {
        return this.homeContainerNavigator.navigateHome();
    }

    /* renamed from: l */
    static /* synthetic */ void m5830l(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: a */
    public /* synthetic */ void mo11624a(Boolean bool) {
        this.view.expandChips();
        if (bool.booleanValue()) {
            this.homeContainerNavigator.loadMainHomeContent();
            this.chipManager.setCurrentChip((ChipManager.Chip) null);
            this.view.uncheckChips();
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo11633b(Throwable th) {
        this.view.hidePromotionsIcon();
    }

    /* renamed from: b */
    public /* synthetic */ void mo11632b(String str) {
        this.homeNavigator.navigateToEskillsBundle(14169744);
    }

    /* renamed from: b */
    public /* synthetic */ void mo11631b(Boolean bool) {
        if (bool.booleanValue()) {
            this.homeContainerNavigator.loadAppsHomeContent();
            this.chipManager.setCurrentChip(ChipManager.Chip.APPS);
        } else {
            this.homeContainerNavigator.loadMainHomeContent();
            this.chipManager.setCurrentChip((ChipManager.Chip) null);
        }
        this.homeAnalytics.sendChipInteractEvent(ChipManager.Chip.APPS.getName());
        this.homeAnalytics.sendChipHomeInteractEvent(ChipManager.Chip.APPS.getName());
    }

    /* renamed from: a */
    public /* synthetic */ void mo11627a(Void voidR) {
        this.homeAnalytics.sendPromotionsIconClickEvent();
        this.homeNavigator.navigateToPromotions();
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo11635c(View.LifecycleEvent lifecycleEvent) {
        return this.view.appsChipClicked();
    }

    /* renamed from: a */
    public /* synthetic */ Single mo11619a(View.LifecycleEvent lifecycleEvent) {
        return this.home.hasPromotionApps();
    }

    /* renamed from: a */
    public /* synthetic */ void mo11623a(HomePromotionsWrapper homePromotionsWrapper) {
        this.view.showPromotionsHomeIcon(homePromotionsWrapper);
        this.homeAnalytics.sendPromotionsImpressionEvent();
    }

    /* renamed from: a */
    public /* synthetic */ void mo11626a(Throwable th) {
        this.view.hidePromotionsIcon();
    }

    /* renamed from: a */
    public /* synthetic */ void mo11625a(String str) {
        this.view.dismissEskillsDialog();
    }

    /* renamed from: a */
    public /* synthetic */ void mo11621a(Account account) {
        this.view.showTermsAndConditionsDialog();
    }
}
