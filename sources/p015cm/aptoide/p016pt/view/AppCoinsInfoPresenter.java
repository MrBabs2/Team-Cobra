package p015cm.aptoide.p016pt.view;

import p015cm.aptoide.aptoideviews.socialmedia.SocialMediaView;
import p015cm.aptoide.p016pt.AppCoinsManager;
import p015cm.aptoide.p016pt.app.view.AppCoinsInfoView;
import p015cm.aptoide.p016pt.bonus.BonusAppcModel;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.editorial.ScrollEvent;
import p015cm.aptoide.p016pt.install.InstallManager;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.socialmedia.SocialMediaAnalytics;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.Single;
import p123rx.p126m.C5378b;
import p322p.p323a.p324a.p325a.C10832d;

/* renamed from: cm.aptoide.pt.view.AppCoinsInfoPresenter */
public class AppCoinsInfoPresenter implements Presenter {
    private final AppCoinsInfoNavigator appCoinsInfoNavigator;
    private final AppCoinsManager appCoinsManager;
    private final String appcWalletPackageName;
    private final CrashReport crashReport;
    private final InstallManager installManager;
    private final boolean shouldNavigateToESkills;
    private final SocialMediaAnalytics socialMediaAnalytics;
    private final AppCoinsInfoView view;
    private final C5373h viewScheduler;

    public AppCoinsInfoPresenter(AppCoinsInfoView appCoinsInfoView, AppCoinsInfoNavigator appCoinsInfoNavigator2, InstallManager installManager2, CrashReport crashReport2, String str, C5373h hVar, SocialMediaAnalytics socialMediaAnalytics2, AppCoinsManager appCoinsManager2, boolean z) {
        this.view = appCoinsInfoView;
        this.appCoinsInfoNavigator = appCoinsInfoNavigator2;
        this.installManager = installManager2;
        this.crashReport = crashReport2;
        this.appcWalletPackageName = str;
        this.viewScheduler = hVar;
        this.socialMediaAnalytics = socialMediaAnalytics2;
        this.appCoinsManager = appCoinsManager2;
        this.shouldNavigateToESkills = z;
    }

    /* renamed from: b */
    static /* synthetic */ void m7495b(SocialMediaView.SocialMediaType socialMediaType) {
    }

    /* renamed from: b */
    static /* synthetic */ void m7496b(ScrollEvent scrollEvent) {
    }

    /* renamed from: b */
    static /* synthetic */ void m7497b(Boolean bool) {
    }

    /* renamed from: c */
    static /* synthetic */ void m7498c(BonusAppcModel bonusAppcModel) {
    }

    /* renamed from: c */
    static /* synthetic */ void m7499c(Boolean bool) {
    }

    /* renamed from: e */
    static /* synthetic */ void m7500e(Void voidR) {
    }

    /* renamed from: f */
    static /* synthetic */ void m7501f(Void voidR) {
    }

    /* renamed from: g */
    static /* synthetic */ void m7502g(Void voidR) {
    }

    private void handleBonusPercentage() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C4641j0.f7894f).mo18692i(new C4648n(this)).mo18644a(this.viewScheduler).mo18664b(new C4590c(this)).mo18664b(new C4639i0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C4702v vVar = C4702v.f7975f;
        CrashReport crashReport2 = this.crashReport;
        crashReport2.getClass();
        a.mo18655a((C5378b<? super R>) vVar, (C5378b<Throwable>) new C4496a(crashReport2));
    }

    private void handleClickOnCatappultDevButton() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C4588b0.f7823f).mo18687f(new C4621f0(this)).mo18644a(this.viewScheduler).mo18664b(new C4635g0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C4698t tVar = C4698t.f7971f;
        CrashReport crashReport2 = this.crashReport;
        crashReport2.getClass();
        a.mo18655a((C5378b<? super R>) tVar, (C5378b<Throwable>) new C4496a(crashReport2));
    }

    private void handleOpenESkills() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C4637h0.f7890f).mo18687f(new C4706x(this)).mo18664b(new C4634g(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C4636h hVar = C4636h.f7889f;
        CrashReport crashReport2 = this.crashReport;
        crashReport2.getClass();
        a.mo18655a((C5378b<? super R>) hVar, (C5378b<Throwable>) new C4496a(crashReport2));
    }

    private void handleSocialMediaPromotionClick() {
        this.view.getLifecycleEvent().mo18681d(C4654q.f7910f).mo18687f(new C4640j(this)).mo18664b(new C4497a0(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C4598d0.f7829f, (C5378b<Throwable>) new C4618e(this));
    }

    /* renamed from: a */
    public /* synthetic */ Single mo15117a(View.LifecycleEvent lifecycleEvent) {
        return C10832d.m36727a(this.appCoinsManager.getBonusAppc());
    }

    /* renamed from: b */
    public /* synthetic */ void mo15125b(BonusAppcModel bonusAppcModel) {
        if (this.shouldNavigateToESkills) {
            this.view.focusOnESkillsSection();
        }
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo15128c(Void voidR) {
        return this.installManager.isInstalled(this.appcWalletPackageName);
    }

    /* renamed from: d */
    public /* synthetic */ void mo15130d(Void voidR) {
        this.appCoinsInfoNavigator.navigateToESkills();
    }

    /* renamed from: e */
    public /* synthetic */ C5368e mo15131e(View.LifecycleEvent lifecycleEvent) {
        return C5368e.m10254b(this.view.installButtonClick(), this.view.cardViewClick());
    }

    /* renamed from: f */
    public /* synthetic */ C5368e mo15132f(View.LifecycleEvent lifecycleEvent) {
        return this.view.eSkillsClick();
    }

    /* renamed from: g */
    public /* synthetic */ C5368e mo15133g(View.LifecycleEvent lifecycleEvent) {
        return this.view.appItemVisibilityChanged();
    }

    /* renamed from: h */
    public /* synthetic */ C5368e mo15134h(View.LifecycleEvent lifecycleEvent) {
        return this.view.socialMediaClick();
    }

    public void handleButtonText() {
        C5368e<R> f = this.view.getLifecycleEvent().mo18681d(C4650o.f7904f).mo18687f(new C4619e0(this));
        AppCoinsInfoView appCoinsInfoView = this.view;
        appCoinsInfoView.getClass();
        C5368e<R> a = f.mo18664b((C5378b<? super R>) new C4592c1(appCoinsInfoView)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C4620f fVar = C4620f.f7875f;
        CrashReport crashReport2 = this.crashReport;
        crashReport2.getClass();
        a.mo18655a((C5378b<? super R>) fVar, (C5378b<Throwable>) new C4496a(crashReport2));
    }

    public void handleClickOnAppcWalletLink() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C4708y.f7982f).mo18687f(new C4597d(this)).mo18664b(new C4646m(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C4704w wVar = C4704w.f7977f;
        CrashReport crashReport2 = this.crashReport;
        crashReport2.getClass();
        a.mo18655a((C5378b<? super R>) wVar, (C5378b<Throwable>) new C4496a(crashReport2));
    }

    public void handleClickOnInstallButton() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C4696s.f7969f).mo18687f(new C4700u(this)).mo18687f(new C4642k(this)).mo18644a(this.viewScheduler).mo18664b(new C4710z(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C4638i iVar = C4638i.f7891f;
        CrashReport crashReport2 = this.crashReport;
        crashReport2.getClass();
        a.mo18655a((C5378b<? super R>) iVar, (C5378b<Throwable>) new C4496a(crashReport2));
    }

    public void handlePlaceHolderVisibilityChange() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C4656r.f7913f).mo18687f(new C4652p(this)).mo18664b(new C4644l(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C4591c0 c0Var = C4591c0.f7826f;
        CrashReport crashReport2 = this.crashReport;
        crashReport2.getClass();
        a.mo18655a((C5378b<? super R>) c0Var, (C5378b<Throwable>) new C4496a(crashReport2));
    }

    public void present() {
        handleClickOnAppcWalletLink();
        handleClickOnCatappultDevButton();
        handleClickOnInstallButton();
        handleButtonText();
        handlePlaceHolderVisibilityChange();
        handleSocialMediaPromotionClick();
        handleBonusPercentage();
        handleOpenESkills();
    }

    /* renamed from: a */
    public /* synthetic */ void mo15119a(BonusAppcModel bonusAppcModel) {
        if (bonusAppcModel.getHasBonusAppc()) {
            this.view.setBonusAppc(bonusAppcModel.getBonusPercentage());
        } else {
            this.view.setNoBonusAppcView();
        }
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo15127c(View.LifecycleEvent lifecycleEvent) {
        return this.view.appCoinsWalletLinkClick();
    }

    /* renamed from: d */
    public /* synthetic */ C5368e mo15129d(View.LifecycleEvent lifecycleEvent) {
        return this.view.catappultButtonClick();
    }

    /* renamed from: b */
    public /* synthetic */ void mo15126b(Void voidR) {
        this.appCoinsInfoNavigator.navigateToCatappultWebsite();
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo15124b(View.LifecycleEvent lifecycleEvent) {
        return this.installManager.isInstalled(this.appcWalletPackageName);
    }

    /* renamed from: a */
    public /* synthetic */ void mo15118a(SocialMediaView.SocialMediaType socialMediaType) {
        this.appCoinsInfoNavigator.navigateToSocialMedia(socialMediaType);
        this.socialMediaAnalytics.sendPromoteSocialMediaClickEvent(socialMediaType);
    }

    /* renamed from: a */
    public /* synthetic */ void mo15122a(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: a */
    public /* synthetic */ void mo15120a(ScrollEvent scrollEvent) {
        if (scrollEvent.getItemShown().booleanValue()) {
            this.view.removeBottomCardAnimation();
        } else if (!scrollEvent.getItemShown().booleanValue()) {
            this.view.addBottomCardAnimation();
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo15121a(Boolean bool) {
        if (bool.booleanValue()) {
            this.view.openApp(this.appcWalletPackageName);
        } else {
            this.appCoinsInfoNavigator.navigateToAppCoinsWallet();
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo15123a(Void voidR) {
        this.appCoinsInfoNavigator.navigateToAppCoinsWallet();
    }
}
