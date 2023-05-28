package p015cm.aptoide.p016pt.app.view;

import android.util.Pair;
import android.view.MenuItem;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p015cm.aptoide.accountmanager.Account;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.BuildConfig;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.account.view.AccountNavigator;
import p015cm.aptoide.p016pt.actions.PermissionManager;
import p015cm.aptoide.p016pt.actions.PermissionService;
import p015cm.aptoide.p016pt.ads.WalletAdsOfferManager;
import p015cm.aptoide.p016pt.ads.data.ApplicationAd;
import p015cm.aptoide.p016pt.ads.data.AptoideNativeAd;
import p015cm.aptoide.p016pt.app.AppModel;
import p015cm.aptoide.p016pt.app.AppViewAnalytics;
import p015cm.aptoide.p016pt.app.AppViewManager;
import p015cm.aptoide.p016pt.app.AppViewModel;
import p015cm.aptoide.p016pt.app.AppViewSimilarApp;
import p015cm.aptoide.p016pt.app.CampaignAnalytics;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.app.PromotionViewModel;
import p015cm.aptoide.p016pt.app.ReviewsViewModel;
import p015cm.aptoide.p016pt.app.SimilarAppsViewModel;
import p015cm.aptoide.p016pt.app.view.AppViewFragment;
import p015cm.aptoide.p016pt.app.view.screenshots.ScreenShotClickEvent;
import p015cm.aptoide.p016pt.app.view.similar.SimilarAppClickEvent;
import p015cm.aptoide.p016pt.app.view.similar.SimilarAppsBundle;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.download.InvalidAppException;
import p015cm.aptoide.p016pt.download.view.outofspace.OutOfSpaceNavigatorWrapper;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.presenter.Presenter;
import p015cm.aptoide.p016pt.presenter.View;
import p015cm.aptoide.p016pt.promotions.ClaimDialogResultWrapper;
import p015cm.aptoide.p016pt.promotions.Promotion;
import p015cm.aptoide.p016pt.promotions.PromotionsNavigator;
import p015cm.aptoide.p016pt.promotions.WalletApp;
import p015cm.aptoide.p016pt.search.model.SearchAdResult;
import p015cm.aptoide.p016pt.utils.GenericDialogs;
import p015cm.aptoide.p016pt.view.app.FlagsVote;
import p112n.p118g.p301a.p310c.C10706f;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.Single;
import p123rx.exceptions.OnErrorNotImplementedException;
import p123rx.p124l.p125c.C5376a;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;
import p123rx.schedulers.Schedulers;

/* renamed from: cm.aptoide.pt.app.view.AppViewPresenter */
public class AppViewPresenter implements Presenter {
    private static final String TAG = "AppViewPresenter";
    private static final long TIME_BETWEEN_SCROLL = 2000;
    private final AptoideAccountManager accountManager;
    private final AccountNavigator accountNavigator;
    private final AppViewAnalytics appViewAnalytics;
    private final AppViewManager appViewManager;
    private final AppViewNavigator appViewNavigator;
    private final CampaignAnalytics campaignAnalytics;
    private final CrashReport crashReport;
    private boolean openTypeAlreadyRegistered = false;
    private final PermissionManager permissionManager;
    private final PermissionService permissionService;
    private final PromotionsNavigator promotionsNavigator;
    private final AppViewView view;
    private final C5373h viewScheduler;

    /* renamed from: cm.aptoide.pt.app.view.AppViewPresenter$1 */
    static /* synthetic */ class C14361 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
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
                int[] r0 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action     // Catch:{ NoSuchFieldError -> 0x003e }
                cm.aptoide.pt.app.DownloadModel$Action r1 = p015cm.aptoide.p016pt.app.DownloadModel.Action.MIGRATE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.app.view.AppViewPresenter.C14361.<clinit>():void");
        }
    }

    public AppViewPresenter(AppViewView appViewView, AccountNavigator accountNavigator2, AppViewAnalytics appViewAnalytics2, CampaignAnalytics campaignAnalytics2, AppViewNavigator appViewNavigator2, AppViewManager appViewManager2, AptoideAccountManager aptoideAccountManager, C5373h hVar, CrashReport crashReport2, PermissionManager permissionManager2, PermissionService permissionService2, PromotionsNavigator promotionsNavigator2) {
        this.view = appViewView;
        this.accountNavigator = accountNavigator2;
        this.appViewAnalytics = appViewAnalytics2;
        this.campaignAnalytics = campaignAnalytics2;
        this.appViewNavigator = appViewNavigator2;
        this.appViewManager = appViewManager2;
        this.accountManager = aptoideAccountManager;
        this.viewScheduler = hVar;
        this.crashReport = crashReport2;
        this.permissionManager = permissionManager2;
        this.permissionService = permissionService2;
        this.promotionsNavigator = promotionsNavigator2;
    }

    /* renamed from: A */
    static /* synthetic */ void m4654A(AppModel appModel) {
    }

    /* renamed from: A */
    static /* synthetic */ void m4655A(Void voidR) {
    }

    /* renamed from: B */
    static /* synthetic */ void m4658B(Void voidR) {
    }

    /* renamed from: C */
    static /* synthetic */ void m4660C(AppModel appModel) {
    }

    /* renamed from: C */
    static /* synthetic */ void m4661C(Void voidR) {
    }

    /* renamed from: D */
    static /* synthetic */ void m4663D(AppModel appModel) {
    }

    /* renamed from: D */
    static /* synthetic */ void m4664D(Throwable th) {
    }

    /* renamed from: D */
    static /* synthetic */ void m4665D(Void voidR) {
    }

    /* renamed from: D0 */
    static /* synthetic */ Boolean m4666D0(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: E */
    static /* synthetic */ void m4668E(AppModel appModel) {
    }

    /* renamed from: F */
    static /* synthetic */ Boolean m4671F(Void voidR) {
        return true;
    }

    /* renamed from: F */
    static /* synthetic */ void m4672F(AppModel appModel) {
    }

    /* renamed from: F0 */
    static /* synthetic */ Boolean m4674F0(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: G */
    static /* synthetic */ void m4675G(AppModel appModel) {
    }

    /* renamed from: G */
    static /* synthetic */ void m4677G(Void voidR) {
    }

    /* renamed from: G0 */
    static /* synthetic */ Boolean m4678G0(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: H */
    static /* synthetic */ void m4679H(AppModel appModel) {
    }

    /* renamed from: H */
    static /* synthetic */ void m4680H(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: I */
    static /* synthetic */ void m4681I(AppModel appModel) {
    }

    /* renamed from: I */
    static /* synthetic */ void m4682I(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: J */
    static /* synthetic */ void m4683J(AppModel appModel) {
    }

    /* renamed from: L */
    static /* synthetic */ void m4687L(AppModel appModel) {
    }

    /* renamed from: L */
    static /* synthetic */ void m4688L(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: P */
    static /* synthetic */ SearchAdResult m4692P(Throwable th) {
        return null;
    }

    /* renamed from: Q */
    static /* synthetic */ void m4693Q(Throwable th) {
    }

    /* renamed from: R */
    static /* synthetic */ Boolean m4694R(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: S */
    static /* synthetic */ Boolean m4696S(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: S */
    static /* synthetic */ void m4697S(Throwable th) {
    }

    /* renamed from: T */
    static /* synthetic */ Boolean m4698T(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: T */
    static /* synthetic */ void m4699T(Throwable th) {
    }

    /* renamed from: a */
    static /* synthetic */ AppViewModel m4706a(AppViewModel appViewModel, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        return appViewModel;
    }

    /* renamed from: a */
    static /* synthetic */ AppViewModel m4707a(AppViewModel appViewModel, PromotionViewModel promotionViewModel) {
        return appViewModel;
    }

    /* renamed from: a */
    static /* synthetic */ AppViewModel m4708a(AppViewModel appViewModel, SearchAdResult searchAdResult) {
        return appViewModel;
    }

    /* renamed from: a */
    static /* synthetic */ AppViewModel m4709a(AppViewModel appViewModel, List list) {
        return appViewModel;
    }

    /* renamed from: a */
    static /* synthetic */ AppViewModel m4710a(AppViewModel appViewModel, C5368e eVar) {
        return appViewModel;
    }

    /* renamed from: a */
    static /* synthetic */ DownloadModel.Action m4711a(DownloadModel.Action action, Boolean bool) {
        return action;
    }

    /* renamed from: a */
    static /* synthetic */ PromotionViewModel m4712a(PromotionViewModel promotionViewModel, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        return promotionViewModel;
    }

    /* renamed from: a */
    static /* synthetic */ void m4720a(GenericDialogs.EResponse eResponse) {
    }

    /* renamed from: b */
    static /* synthetic */ AppViewModel m4722b(AppViewModel appViewModel, PromotionViewModel promotionViewModel) {
        return appViewModel;
    }

    /* renamed from: b */
    static /* synthetic */ AppViewModel m4723b(AppViewModel appViewModel, Boolean bool) {
        return appViewModel;
    }

    /* renamed from: b */
    static /* synthetic */ void m4729b(ReadMoreClickEvent readMoreClickEvent) {
    }

    /* renamed from: b */
    static /* synthetic */ void m4730b(ClaimDialogResultWrapper claimDialogResultWrapper) {
    }

    /* renamed from: b */
    static /* synthetic */ void m4731b(Object obj) {
    }

    /* renamed from: c */
    static /* synthetic */ void m4734c(Pair pair) {
    }

    /* renamed from: c */
    static /* synthetic */ void m4735c(DownloadModel downloadModel) {
    }

    /* renamed from: c */
    static /* synthetic */ void m4737c(Promotion promotion) {
    }

    /* renamed from: c */
    static /* synthetic */ void m4738c(String str) {
    }

    private void cancelDownload() {
        this.view.getLifecycleEvent().mo18681d(C1725o8.f4292f).mo18687f(new C1544e7(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1704n5.f4269f, (C5378b<Throwable>) C1673la.f4228f);
    }

    private void cancelPromotionDownload() {
        this.view.getLifecycleEvent().mo18681d(C1557f2.f4081f).mo18687f(new C1793s4(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1632j5.f4181f, (C5378b<Throwable>) C1776r5.f4355f);
    }

    private void claimApp() {
        this.view.getLifecycleEvent().mo18681d(C1508db.f4025f).mo18687f(new C1800sb(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1712nd.f4279f, (C5378b<Throwable>) C1778r7.f4357f);
    }

    /* renamed from: d */
    static /* synthetic */ Boolean m4740d(PromotionViewModel promotionViewModel) {
        return Boolean.valueOf(promotionViewModel.getWalletApp().getDownloadModel() != null && promotionViewModel.getWalletApp().getDownloadModel().hasError());
    }

    /* renamed from: d */
    static /* synthetic */ void m4741d(ScreenShotClickEvent screenShotClickEvent) {
    }

    /* renamed from: d */
    static /* synthetic */ void m4742d(WalletApp walletApp) {
    }

    /* renamed from: d */
    static /* synthetic */ void m4743d(Integer num) {
    }

    private C5328b downgradeApp(DownloadModel.Action action, AppModel appModel, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, boolean z) {
        return this.view.showDowngradeMessage().mo18681d(C1859vb.f4456f).mo18664b(new C1914ya(this)).mo18689g(new C1503d6(this, action, appModel, offerResponseStatus, z)).mo18696k();
    }

    private C5328b downloadApp(DownloadModel.Action action, AppModel appModel, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, boolean z) {
        return C5368e.m10248a(new C1631j4(this, action)).mo18644a(this.viewScheduler).mo18687f(new C1594h3(this, appModel, action, offerResponseStatus, z)).mo18696k();
    }

    private C5368e<DownloadModel> downloadInRange(int i, int i2) {
        return this.appViewManager.downloadStarted().mo18681d(C1907y3.f4508f).mo18681d(new C1708n9(i, i2)).mo18669c();
    }

    private C5328b downloadWallet(WalletApp walletApp) {
        return C5368e.m10248a(new C1675lc(this)).mo18644a(this.viewScheduler).mo18687f(new C1638jb(this, walletApp)).mo18687f(new C1565fa(this)).mo18644a(Schedulers.m10352io()).mo18689g(new C1780r9(this, walletApp)).mo18696k();
    }

    /* renamed from: e */
    static /* synthetic */ void m4746e(WalletApp walletApp) {
    }

    /* renamed from: f */
    static /* synthetic */ Boolean m4748f(Boolean bool) {
        return bool;
    }

    /* renamed from: f */
    static /* synthetic */ void m4749f(AppViewModel appViewModel) {
    }

    /* renamed from: f */
    static /* synthetic */ void m4750f(DownloadModel.Action action) {
    }

    /* renamed from: f */
    static /* synthetic */ void m4751f(ScreenShotClickEvent screenShotClickEvent) {
    }

    /* renamed from: g */
    static /* synthetic */ Boolean m4753g(Boolean bool) {
        return bool;
    }

    /* renamed from: g */
    static /* synthetic */ void m4754g(AppViewModel appViewModel) {
    }

    /* renamed from: h */
    static /* synthetic */ Boolean m4757h(Boolean bool) {
        return bool;
    }

    private void handleAdsLogic(SearchAdResult searchAdResult) {
        this.appViewManager.handleAdsLogic(searchAdResult);
        this.view.extractReferrer(searchAdResult);
    }

    private void handleApkfyDialogPositiveClick() {
        this.view.getLifecycleEvent().mo18681d(C1640jd.f4191f).mo18687f(new C1664l1(this)).mo18664b(new C1831u1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1718o1.f4285f, (C5378b<Throwable>) C1910y6.f4511f);
    }

    private void handleClickFlags() {
        this.view.getLifecycleEvent().mo18681d(C1648k3.f4199f).mo18687f(new C1924z2(this)).mo18664b(new C1898xc(this)).mo18687f(new C1463b2(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1566fb.f4093f, (C5378b<Throwable>) new C1748pd(this));
    }

    private void handleClickLoginSnack() {
        this.view.getLifecycleEvent().mo18681d(C1592h1.f4129f).mo18687f(new C1692mb(this)).mo18664b(new C1593h2(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1703n4.f4268f, (C5378b<Throwable>) new C1850v2(this));
    }

    private void handleClickOnAppcIabInfo() {
        this.view.getLifecycleEvent().mo18681d(C1669l6.f4224f).mo18687f(new C1894x8(this)).mo18664b(new C1602hb(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1759q6.f4333f, (C5378b<Throwable>) new C1620ib(this));
    }

    private void handleClickOnAppcInfo() {
        this.view.getLifecycleEvent().mo18681d(C1630j3.f4178f).mo18687f(new C1824tc(this)).mo18664b(new C1666l3(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1722o5.f4289f, (C5378b<Throwable>) new C1925z3(this));
    }

    private void handleClickOnBonusAppcFlair() {
        this.view.getLifecycleEvent().mo18681d(C1857v9.f4454f).mo18687f(new C1689m8(this)).mo18664b(new C1837u7(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1801sc.f4384f, (C5378b<Throwable>) new C1738p3(this));
    }

    private void handleClickOnCatappultCard() {
        C5368e<R> a = this.view.getLifecycleEvent().mo18681d(C1815t3.f4402f).mo18687f(new C1906y2(this)).mo18644a(this.viewScheduler).mo18664b(new C1762q9(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C1792s3 s3Var = C1792s3.f4375f;
        CrashReport crashReport2 = this.crashReport;
        crashReport2.getClass();
        a.mo18655a((C5378b<? super R>) s3Var, (C5378b<Throwable>) new C1441a(crashReport2));
    }

    private void handleClickOnDescriptionReadMore() {
        this.view.getLifecycleEvent().mo18681d(C1562f7.f4086f).mo18687f(new C1935zd(this)).mo18664b(new C1559f4(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1825td.f4413f, (C5378b<Throwable>) new C1729oc(this));
    }

    private void handleClickOnDeveloperEmail() {
        this.view.getLifecycleEvent().mo18681d(C1736p1.f4306f).mo18687f(new C1560f5(this)).mo18692i(new C1450a8(this)).mo18681d(C1745pa.f4318f).mo18664b(new C1639jc(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1485c6.f3996f, (C5378b<Throwable>) new C1905y1(this));
    }

    private void handleClickOnDeveloperPermissions() {
        this.view.getLifecycleEvent().mo18681d(C1467b6.f3975f).mo18687f(new C1874w8(this)).mo18692i(new C1889x3(this)).mo18664b(new C1740p5(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1693mc.f4257f, (C5378b<Throwable>) new C1672l9(this));
    }

    private void handleClickOnDeveloperPrivacy() {
        this.view.getLifecycleEvent().mo18681d(C1805sd.f4391f).mo18687f(new C1492cd(this)).mo18692i(new C1795s6(this)).mo18681d(C1909y5.f4510f).mo18664b(new C1445a3(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1646k1.f4197f, (C5378b<Throwable>) new C1755q2(this));
    }

    private void handleClickOnDeveloperWebsite() {
        this.view.getLifecycleEvent().mo18681d(C1540e3.f4064f).mo18687f(new C1580g7(this)).mo18692i(new C1558f3(this)).mo18681d(C1796s7.f4379f).mo18664b(new C1472bb(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1676ld.f4231f, (C5378b<Throwable>) new C1930z8(this));
    }

    private void handleClickOnFollowStore() {
        this.view.getLifecycleEvent().mo18681d(C1582g9.f4113f).mo18687f(new C1637ja(this)).mo18692i(new C1923z1(this)).mo18644a(this.viewScheduler).mo18689g(new C1658kd(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1684m3.f4244f, (C5378b<Throwable>) C1791s2.f4374f);
    }

    private void handleClickOnOtherVersions() {
        this.view.getLifecycleEvent().mo18681d(C1577g4.f4108f).mo18687f(new C1601ha(this)).mo18692i(new C1453ab(this)).mo18664b(new C1452aa(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1931z9.f4536f, (C5378b<Throwable>) new C1913y9(this));
    }

    private void handleClickOnRateApp() {
        this.view.getLifecycleEvent().mo18681d(C1583ga.f4114f).mo18687f(new C1775r4(this)).mo18692i(new C1671l8(this)).mo18644a(this.viewScheduler).mo18664b(new C1650k5(this)).mo18687f(new C1603hc(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1710nb.f4277f, (C5378b<Throwable>) new C1823tb(this));
    }

    private void handleClickOnRetry() {
        this.view.getLifecycleEvent().mo18681d(C1652k7.f4203f).mo18687f(new C1726o9(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1794s5.f4377f, (C5378b<Throwable>) new C1934zc(this));
    }

    private void handleClickOnScreenshot() {
        this.view.getLifecycleEvent().mo18681d(C1756q3.f4330f).mo18687f(new C1474bd(this)).mo18681d(C1842uc.f4437f).mo18664b(new C1619ia(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1670l7.f4225f, (C5378b<Throwable>) new C1896xa(this));
    }

    private void handleClickOnSimilarApps() {
        this.view.getLifecycleEvent().mo18681d(C1879wd.f4480f).mo18687f(new C1893x7(this)).mo18644a(this.viewScheduler).mo18687f(new C1742p7(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1635j8.f4185f, (C5378b<Throwable>) new C1567fc(this));
    }

    private void handleClickOnStoreLayout() {
        this.view.getLifecycleEvent().mo18681d(C1628j1.f4176f).mo18687f(new C1774r3(this)).mo18692i(new C1687m6(this)).mo18664b(new C1548eb(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1813t1.f4400f, (C5378b<Throwable>) new C1599h8(this));
    }

    private void handleClickOnToolbar() {
        this.view.getLifecycleEvent().mo18681d(C1838u8.f4432f).mo18687f(new C1584gb(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1721o4.f4288f, (C5378b<Throwable>) new C1746pb(this));
    }

    private void handleClickOnTopDonorsDonate() {
        this.view.getLifecycleEvent().mo18681d(C1486c7.f3997f).mo18687f(new C1908y4(this)).mo18692i(new C1446a4(this)).mo18664b(new C1760q7(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1448a6.f3949f, (C5378b<Throwable>) C1700n1.f4264f);
    }

    private void handleClickOnTrustedBadge() {
        this.view.getLifecycleEvent().mo18681d(C1613i4.f4160f).mo18687f(new C1873w7(this)).mo18692i(new C1501d4(this)).mo18664b(new C1723o6(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1464b3.f3972f, (C5378b<Throwable>) new C1818t6(this));
    }

    private void handleClickOnVideo() {
        this.view.getLifecycleEvent().mo18681d(C1819t7.f4406f).mo18687f(new C1858va(this)).mo18681d(C1574g1.f4105f).mo18664b(new C1739p4(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1629j2.f4177f, (C5378b<Throwable>) new C1541e4(this));
    }

    private void handleClickReadReviews() {
        this.view.getLifecycleEvent().mo18681d(C1471ba.f3979f).mo18687f(new C1549ec(this)).mo18692i(new C1545e8(this)).mo18664b(new C1647k2(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1539e2.f4063f, (C5378b<Throwable>) new C1656kb(this));
    }

    private void handleDismissWalletPromotion() {
        this.view.getLifecycleEvent().mo18681d(C1783rc.f4363f).mo18687f(new C1872w6(this)).mo18664b(new C1586gd(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1892x6.f4493f, (C5378b<Throwable>) C1595h4.f4136f);
    }

    private void handleDonateCardImpressions() {
        this.view.getLifecycleEvent().mo18681d(C1782rb.f4362f).mo18687f(new C1840ua(this)).mo18692i(new C1547ea(this)).mo18664b(new C1816t4(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1878wc.f4479f, (C5378b<Throwable>) C1585gc.f4116f);
    }

    private void handleDownloadingSimilarApp() {
        this.view.getLifecycleEvent().mo18681d(C1617i8.f4165f).mo18687f(new C1483c4(this)).mo18687f(new C1505d8(this)).mo18644a(this.viewScheduler).mo18664b(new C1707n8(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1636j9.f4186f, (C5378b<Throwable>) new C1488c9(this));
    }

    private void handleESkillsCardClick() {
        this.view.getLifecycleEvent().mo18681d(C1576g3.f4107f).mo18687f(new C1468b7(this)).mo18664b(new C1481c2(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1701n2.f4265f, (C5378b<Throwable>) C1618i9.f4166f);
    }

    private void handleInstallButtonClick() {
        this.view.getLifecycleEvent().mo18681d(C1744p9.f4317f).mo18687f(new C1622id(this)).mo18669c().mo18644a(this.viewScheduler).mo18687f(new C1564f9(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1543e6.f4067f, (C5378b<Throwable>) C1499d2.f4010f);
    }

    private void handleInstallWalletPromotion() {
        this.view.getLifecycleEvent().mo18681d(C1556f1.f4080f).mo18687f(new C1899xd(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1912y8.f4513f, (C5378b<Throwable>) C1653k8.f4204f);
    }

    private void handleOnSimilarAppsVisible() {
        this.view.getLifecycleEvent().mo18681d(C1694md.f4258f).mo18687f(new C1821t9(this)).mo18669c().mo18644a(Schedulers.m10352io()).mo18664b(new C1691ma(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1911y7.f4512f, (C5378b<Throwable>) new C1561f6(this));
    }

    private C5368e<Boolean> handleOpenAppViewDialogInput(AppModel appModel) {
        if (!this.openTypeAlreadyRegistered) {
            this.openTypeAlreadyRegistered = true;
            if (appModel.getOpenType() == AppViewFragment.OpenType.OPEN_AND_INSTALL) {
                return C5368e.m10257c(true);
            }
            if (appModel.getOpenType() == AppViewFragment.OpenType.OPEN_WITH_INSTALL_POPUP) {
                return this.view.showOpenAndInstallDialog(appModel.getMarketName(), appModel.getAppName()).mo18694j(C1832u2.f4424f);
            }
            if (appModel.getOpenType() == AppViewFragment.OpenType.APK_FY_INSTALL_POPUP) {
                return this.view.showOpenAndInstallApkFyDialog(appModel.getMarketName(), appModel.getAppName(), appModel.getAppc(), appModel.getRating().getAverage(), appModel.getIcon(), appModel.getPackageDownloads()).mo18694j(C1860vc.f4457f);
            }
        }
        return C5368e.m10257c(false);
    }

    private void handleOutOfSpaceDialogResult() {
        this.view.getLifecycleEvent().mo18681d(C1737p2.f4307f).mo18687f(new C1469b8(this)).mo18681d(C1484c5.f3995f).mo18687f(new C1724o7(this)).mo18686f().mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1490cb.f4001f, (C5378b<Throwable>) new C1843ud(this));
    }

    private void handlePromotionClaimResult() {
        this.view.getLifecycleEvent().mo18681d(C1654k9.f4205f).mo18687f(new C1579g6(this)).mo18681d(C1459ah.f3965f).mo18664b(new C1895x9(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1933zb.f4538f, (C5378b<Throwable>) C1705n6.f4270f);
    }

    private void handleReviewAutoScroll() {
        this.view.getLifecycleEvent().mo18681d(C1575g2.f4106f).mo18687f(new C1720o3(this)).mo18687f(new C1932za(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1868w2.f4467f, (C5378b<Throwable>) new C1817t5(this));
    }

    /* renamed from: i */
    static /* synthetic */ Boolean m4760i(Boolean bool) {
        return bool;
    }

    /* renamed from: j */
    static /* synthetic */ void m4762j(AppViewModel appViewModel) {
    }

    /* renamed from: j */
    static /* synthetic */ void m4763j(Boolean bool) {
    }

    /* renamed from: k */
    static /* synthetic */ void m4765k(Boolean bool) {
    }

    /* renamed from: l */
    static /* synthetic */ void m4767l(Boolean bool) {
    }

    private C5368e<AppViewModel> loadAppView() {
        return this.appViewManager.getAppViewModel().mo18556a(this.viewScheduler).mo18564b(new C1877wb(this)).mo18564b(new C1876wa(this)).mo18567c().mo18681d(C1604hd.f4146f).mo18687f(new C1890x4(this));
    }

    private C5368e<SearchAdResult> loadOrganicAds(AppViewModel appViewModel) {
        return Single.m10119a(appViewModel.getAppModel().getMinimalAd()).mo18556a(Schedulers.m10352io()).mo18559a(new C1500d3(this)).mo18571f(C1451a9.f3952f).mo18567c().mo18644a(this.viewScheduler);
    }

    private C5368e<AppViewModel> loadTopDonations(AppViewModel appViewModel) {
        return C5368e.m10257c(appViewModel.getAppModel()).mo18692i(new C1926z4(this, appViewModel));
    }

    private C5328b migrateApp(DownloadModel.Action action, AppModel appModel, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, boolean z) {
        return downloadApp(action, appModel, offerResponseStatus, false);
    }

    private C5368e<AppViewModel> observeDownloadErrors() {
        return C5368e.m10254b(this.view.installAppClick(), this.view.resumeDownload()).mo18687f(new C1822ta(this)).mo18664b(new C1550ed(this)).mo18687f(new C1578g5(this)).mo18686f();
    }

    private C5328b openInstalledApp(String str) {
        return C5328b.m10169d(new C1506d9(this, str));
    }

    private void pauseDownload() {
        this.view.getLifecycleEvent().mo18681d(C1856v8.f4453f).mo18687f(new C1610i1(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1682m1.f4242f, (C5378b<Throwable>) C1449a7.f3950f);
    }

    private void pauseWalletDownload() {
        this.view.getLifecycleEvent().mo18681d(C1772r1.f4351f).mo18687f(new C1600h9(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1686m5.f4246f, (C5378b<Throwable>) C1757q4.f4331f);
    }

    private void resumeDownload() {
        this.view.getLifecycleEvent().mo18681d(C1915yb.f4516f).mo18687f(new C1667l4(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1510dd.f4027f, (C5378b<Throwable>) C1487c8.f3998f);
    }

    private void resumeWalletDownload() {
        this.view.getLifecycleEvent().mo18681d(C1665l2.f4219f).mo18687f(new C1797s8(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1773r2.f4352f, (C5378b<Throwable>) C1502d5.f4013f);
    }

    private C5368e<Integer> scheduleAnimations(int i) {
        if (i > 1) {
            return C5368e.m10231a(0, i).mo18650a(new C1470b9(this));
        }
        Logger.getInstance().mo12987w(TAG, "Not enough top reviews to do paging animation.");
        return C5368e.m10265n();
    }

    /* access modifiers changed from: private */
    public void sendAppViewLoadAnalytics(AppViewModel appViewModel) {
        AppModel appModel = appViewModel.getAppModel();
        if (appModel.isFromEditorsChoice()) {
            this.appViewManager.sendEditorsAppOpenAnalytics(appModel.getPackageName(), appModel.getDeveloper().getName(), appModel.getMalware().getRank().name(), appModel.hasBilling(), appModel.hasAdvertising(), appModel.getEditorsChoice());
        } else {
            this.appViewManager.sendAppOpenAnalytics(appModel.getPackageName(), appModel.getDeveloper().getName(), appModel.getMalware().getRank().name(), appModel.hasBilling(), appModel.hasAdvertising());
        }
        if (appViewModel.getDownloadModel().getAction().equals(DownloadModel.Action.MIGRATE) && !this.appViewManager.isMigrationImpressionSent()) {
            this.appViewManager.setMigrationImpressionSent();
            this.appViewAnalytics.sendAppcMigrationAppOpen();
        }
    }

    private void sendSimilarAppInteractEvent(SimilarAppsViewModel similarAppsViewModel) {
        sendSimilarAppsAdImpressionEvent(similarAppsViewModel);
        this.appViewAnalytics.similarAppBundleImpression((ApplicationAd.Network) null, false);
    }

    private void sendSimilarAppcAppsImpressionEvent(SimilarAppsViewModel similarAppsViewModel) {
        if (similarAppsViewModel != null) {
            this.appViewAnalytics.similarAppcAppBundleImpression();
        }
    }

    private void sendSimilarAppsAdImpressionEvent(SimilarAppsViewModel similarAppsViewModel) {
        if (similarAppsViewModel != null && similarAppsViewModel.hasAd() && !similarAppsViewModel.hasRecordedAdImpression()) {
            similarAppsViewModel.setHasRecordedAdImpression(true);
            this.appViewAnalytics.similarAppBundleImpression(similarAppsViewModel.getAd().getNetwork(), true);
        }
    }

    /* access modifiers changed from: private */
    public void showAppView(AppViewModel appViewModel) {
        if (appViewModel.getAppModel().hasError()) {
            this.view.handleError(appViewModel.getAppModel().getError());
            return;
        }
        this.view.setInstallButton(appViewModel.getAppCoinsViewModel());
        this.view.showAppView(appViewModel.getAppModel());
        this.view.showDownloadAppModel(appViewModel.getDownloadModel(), appViewModel.getAppCoinsViewModel(), appViewModel.getAppModel().hasSplits());
        if (appViewModel.getAppCoinsViewModel().hasAdvertising() || appViewModel.getAppCoinsViewModel().hasBilling()) {
            this.view.setupAppcAppView(appViewModel.getAppCoinsViewModel().hasBilling(), appViewModel.getAppCoinsViewModel().getBonusAppcModel());
        }
        this.view.recoverScrollViewState();
    }

    /* access modifiers changed from: private */
    /* renamed from: sortSuggestedApps */
    public C5368e<List<SimilarAppsBundle>> mo7390b(AppModel appModel, List<SimilarAppsBundle> list) {
        return C5368e.m10257c(list).mo18694j(new C1841ub(list, appModel));
    }

    /* renamed from: t */
    static /* synthetic */ void m4776t(AppModel appModel) {
    }

    /* renamed from: u */
    static /* synthetic */ void m4778u(AppModel appModel) {
    }

    /* renamed from: u0 */
    static /* synthetic */ Boolean m4779u0(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    private C5368e<ReviewsViewModel> updateReviews(AppModel appModel) {
        return this.appViewManager.loadReviewsViewModel(appModel.getStore().getName(), appModel.getPackageName(), this.view.getLanguageFilter()).mo18556a(this.viewScheduler).mo18558a((C5378b<Throwable>) new C1835u5(this)).mo18564b(new C1917yd(this, appModel)).mo18567c();
    }

    private C5368e<List<SimilarAppsBundle>> updateSimilarAppsBundles(AppModel appModel) {
        return C5368e.m10257c(new ArrayList()).mo18687f(new C1747pc(this, appModel)).mo18687f(new C1634j7(this, appModel)).mo18687f(new C1473bc(this, appModel)).mo18644a(this.viewScheduler).mo18664b(new C1888x2(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: updateSuggestedAppcApps */
    public C5368e<List<SimilarAppsBundle>> mo7348a(AppModel appModel, List<SimilarAppsBundle> list) {
        return this.appViewManager.loadAppcSimilarAppsViewModel(appModel.getPackageName()).mo18569d(new C1779r8(list)).mo18567c();
    }

    /* access modifiers changed from: private */
    /* renamed from: updateSuggestedApps */
    public C5368e<List<SimilarAppsBundle>> mo7349a(AppModel appModel, List<SimilarAppsBundle> list) {
        return this.appViewManager.loadSimilarAppsViewModel(appModel.getPackageName(), appModel.getMedia().getKeywords()).mo18569d(new C1685m4(list)).mo18567c();
    }

    /* access modifiers changed from: private */
    public C5368e<AppViewModel> verifyNotEnoughSpaceError(AppViewModel appViewModel) {
        AppModel appModel = appViewModel.getAppModel();
        appViewModel.getDownloadModel();
        if (appViewModel.getDownloadModel().getDownloadState() == DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR) {
            return this.appViewManager.getAdsVisibilityStatus().mo18564b(new C1741p6(this, appModel)).mo18567c().mo18694j(new C1814t2(appViewModel));
        }
        return C5368e.m10257c(appViewModel);
    }

    /* renamed from: w */
    static /* synthetic */ void m4782w(AppModel appModel) {
    }

    /* renamed from: x */
    static /* synthetic */ void m4784x(AppModel appModel) {
    }

    /* renamed from: x0 */
    static /* synthetic */ Boolean m4785x0(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(lifecycleEvent == View.LifecycleEvent.CREATE);
    }

    /* renamed from: y */
    static /* synthetic */ void m4787y(Void voidR) {
    }

    /* renamed from: z */
    static /* synthetic */ void m4789z(AppModel appModel) {
    }

    /* renamed from: z */
    static /* synthetic */ void m4790z(Void voidR) {
    }

    /* renamed from: A */
    public /* synthetic */ void mo7312A(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: B */
    public /* synthetic */ void mo7314B(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: C */
    public /* synthetic */ void mo7316C(Throwable th) {
        this.view.hideReviews();
    }

    /* renamed from: D */
    public /* synthetic */ C5368e mo7317D(View.LifecycleEvent lifecycleEvent) {
        return C5368e.m10254b(this.view.installAppClick(), (C5368e<DownloadModel.Action>) this.view.apkfyDialogPositiveClick());
    }

    /* renamed from: E */
    public /* synthetic */ C5368e mo7318E(View.LifecycleEvent lifecycleEvent) {
        return this.view.eSkillsCardClick();
    }

    /* renamed from: G */
    public /* synthetic */ C5368e mo7320G(View.LifecycleEvent lifecycleEvent) {
        return loadAppView();
    }

    /* renamed from: J */
    public /* synthetic */ C5368e mo7323J(View.LifecycleEvent lifecycleEvent) {
        return C5368e.m10254b(this.view.scrollVisibleSimilarApps().mo18694j(C1799sa.f4382f), (C5368e<R>) this.view.similarAppsVisibilityFromInstallClick());
    }

    /* renamed from: K */
    public /* synthetic */ C5368e mo7324K(View.LifecycleEvent lifecycleEvent) {
        return this.appViewNavigator.outOfSpaceDialogResult();
    }

    /* renamed from: M */
    public /* synthetic */ C5368e mo7326M(View.LifecycleEvent lifecycleEvent) {
        return this.view.scrollReviewsResponse();
    }

    /* renamed from: N */
    public /* synthetic */ C5368e mo7327N(View.LifecycleEvent lifecycleEvent) {
        return this.view.pauseDownload().mo18692i(new C1839u9(this)).mo18664b(new C1765qc(this)).mo18689g(new C1754q1(this)).mo18686f();
    }

    /* renamed from: O */
    public /* synthetic */ C5368e mo7328O(View.LifecycleEvent lifecycleEvent) {
        return this.view.pausePromotionDownload().mo18689g(new C1466b5(this)).mo18686f();
    }

    /* renamed from: P */
    public /* synthetic */ C5368e mo7329P(View.LifecycleEvent lifecycleEvent) {
        return this.view.resumeDownload().mo18687f(new C1651k6(this)).mo18692i(new C1916yc(this)).mo18689g(new C1612i3(this));
    }

    /* renamed from: Q */
    public /* synthetic */ C5368e mo7330Q(View.LifecycleEvent lifecycleEvent) {
        return this.view.resumePromotionDownload().mo18687f(new C1507da(this));
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo7353a(OutOfSpaceNavigatorWrapper outOfSpaceNavigatorWrapper) {
        if (outOfSpaceNavigatorWrapper.getPackageName().equals("com.appcoins.wallet")) {
            return this.appViewManager.loadPromotionViewModel().mo18689g(new C1649k4(this));
        }
        return this.appViewManager.getAppViewModel().mo18567c().mo18689g(new C1849v1(this));
    }

    /* renamed from: c */
    public /* synthetic */ AppViewModel mo7404c(AppViewModel appViewModel, Throwable th) {
        th.printStackTrace();
        this.crashReport.log(th);
        return appViewModel;
    }

    /* renamed from: e */
    public /* synthetic */ void mo7430e(Boolean bool) {
        sendSimilarAppInteractEvent(this.appViewManager.getCachedSimilarAppsViewModel());
        sendSimilarAppcAppsImpressionEvent(this.appViewManager.getCachedAppcSimilarAppsViewModel());
    }

    /* renamed from: f */
    public /* synthetic */ void mo7434f(AppModel appModel) {
        this.view.navigateToDeveloperWebsite(appModel);
    }

    /* renamed from: g */
    public /* synthetic */ void mo7439g(Throwable th) {
        this.crashReport.log(th);
    }

    public C5368e<AppViewModel> handleAppViewOpenOptions(AppViewModel appViewModel) {
        return handleOpenAppViewDialogInput(appViewModel.getAppModel()).mo18681d(C1875w9.f4476f).mo18689g(new C1836u6(this, appViewModel.getAppModel(), appViewModel.getDownloadModel().getAction())).mo18679d(C5368e.m10257c(false)).mo18694j(new C1761q8(appViewModel)).mo18699l(new C1454ac(this, appViewModel));
    }

    public void handleFirstLoad() {
        this.view.getLifecycleEvent().mo18681d(C1655ka.f4206f).mo18664b(new C1509dc(this)).mo18687f(new C1777r6(this)).mo18641a(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).mo18655a(C1690m9.f4254f, (C5378b<Throwable>) new C1711nc(this));
    }

    /* renamed from: j */
    public /* synthetic */ void mo7454j(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: k */
    public /* synthetic */ C5368e mo7456k(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickedReadMore();
    }

    /* renamed from: l */
    public /* synthetic */ Single mo7459l(Void voidR) {
        return this.appViewManager.getAppModel();
    }

    public C5368e<AppViewModel> loadAds(AppViewModel appViewModel) {
        return this.appViewManager.registerAppsFlyerImpression(appViewModel.getAppModel().getPackageName()).mo18558a((C5378b<Throwable>) C1920yg.f4522f).mo18567c().mo18662b(Schedulers.m10352io()).mo18687f(new C1668l5(this, appViewModel)).mo18694j(new C1851v3(appViewModel)).mo18699l(new C1728ob(this, appViewModel));
    }

    public C5368e<AppViewModel> loadAppcPromotion(AppViewModel appViewModel) {
        return C5368e.m10257c(appViewModel.getAppModel()).mo18681d(C1538e1.f4062f).mo18687f(new C1542e5(this)).mo18644a(this.viewScheduler).mo18664b(new C1709na(this)).mo18694j(new C1887x1(appViewModel)).mo18699l(new C1598h7(this, appViewModel));
    }

    public C5368e<AppViewModel> loadOtherAppViewComponents(AppViewModel appViewModel) {
        return C5368e.m10256b(updateSimilarAppsBundles(appViewModel.getAppModel()), updateReviews(appViewModel.getAppModel()), new C1633j6(appViewModel)).mo18669c().mo18694j(new C1611i2(appViewModel));
    }

    /* renamed from: m */
    public /* synthetic */ C5368e mo7467m(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickDeveloperPermissions();
    }

    /* renamed from: n */
    public /* synthetic */ C5368e mo7471n(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickDeveloperPrivacy();
    }

    /* renamed from: o */
    public /* synthetic */ void mo7477o(Throwable th) {
        this.crashReport.log(th);
    }

    public C5368e<AppViewModel> observeDownloadApp() {
        return this.appViewManager.observeAppViewModel().mo18644a(this.viewScheduler).mo18664b(new C1444a2(this));
    }

    public C5368e<AppViewModel> observePromotionDownloadErrors(AppViewModel appViewModel) {
        return C5368e.m10254b(this.view.resumePromotionDownload(), (C5368e<WalletApp>) this.view.installWalletButtonClick()).mo18687f(new C1674lb(this)).mo18664b(new C1491cc(this)).mo18687f(new C1854v6(this)).mo18694j(new C1833u3(appViewModel)).mo18686f();
    }

    /* renamed from: p */
    public /* synthetic */ C5368e mo7481p(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickFollowStore();
    }

    public void present() {
        handleFirstLoad();
        handleReviewAutoScroll();
        handleClickOnScreenshot();
        handleClickOnVideo();
        handleClickOnDescriptionReadMore();
        handleClickOnDeveloperWebsite();
        handleClickOnDeveloperEmail();
        handleClickOnDeveloperPrivacy();
        handleClickOnDeveloperPermissions();
        handleClickOnStoreLayout();
        handleClickOnFollowStore();
        handleClickOnOtherVersions();
        handleClickOnTrustedBadge();
        handleClickOnRateApp();
        handleClickReadReviews();
        handleClickFlags();
        handleClickLoginSnack();
        handleClickOnAppcInfo();
        handleClickOnBonusAppcFlair();
        handleClickOnAppcIabInfo();
        handleClickOnSimilarApps();
        handleClickOnToolbar();
        handleClickOnRetry();
        handleClickOnCatappultCard();
        handleOnSimilarAppsVisible();
        handleInstallButtonClick();
        pauseDownload();
        resumeDownload();
        cancelDownload();
        handleApkfyDialogPositiveClick();
        handleClickOnTopDonorsDonate();
        handleDonateCardImpressions();
        handleDismissWalletPromotion();
        handleInstallWalletPromotion();
        claimApp();
        handlePromotionClaimResult();
        resumeWalletDownload();
        cancelPromotionDownload();
        pauseWalletDownload();
        handleDownloadingSimilarApp();
        handleOutOfSpaceDialogResult();
        handleESkillsCardClick();
    }

    /* renamed from: q */
    public /* synthetic */ C5368e mo7484q(AppModel appModel) {
        return this.appViewManager.loadPromotionViewModel();
    }

    /* renamed from: r */
    public /* synthetic */ Single mo7488r(Void voidR) {
        return this.appViewManager.getAppModel();
    }

    /* renamed from: s */
    public /* synthetic */ void mo7495s(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: t */
    public /* synthetic */ C5368e mo7497t(View.LifecycleEvent lifecycleEvent) {
        return this.view.getScreenshotClickEvent();
    }

    /* renamed from: u */
    public /* synthetic */ Single mo7499u(Void voidR) {
        return this.appViewManager.getAppModel();
    }

    /* renamed from: v */
    public /* synthetic */ void mo7504v(Void voidR) {
        this.appViewNavigator.navigateToESkillsSectionOnAppCoinsInfoView();
    }

    /* renamed from: w */
    public /* synthetic */ void mo7507w(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: x */
    public /* synthetic */ Single mo7508x(Void voidR) {
        return this.appViewManager.getAppViewModel();
    }

    /* renamed from: y */
    public /* synthetic */ void mo7512y(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: z */
    public /* synthetic */ void mo7514z(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: E */
    static /* synthetic */ Boolean m4667E(Void voidR) {
        return true;
    }

    /* renamed from: G */
    static /* synthetic */ void m4676G(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: K */
    static /* synthetic */ Boolean m4685K(AppModel appModel) {
        return Boolean.valueOf(appModel.hasBilling() || appModel.hasAdvertising());
    }

    /* renamed from: M */
    static /* synthetic */ void m4689M(Throwable th) {
        throw new IllegalStateException(th);
    }

    /* renamed from: R */
    static /* synthetic */ void m4695R(Throwable th) {
        throw new IllegalStateException(th);
    }

    /* renamed from: A */
    public /* synthetic */ C5368e mo7311A(View.LifecycleEvent lifecycleEvent) {
        return C5368e.m10254b(this.view.clickReviewsLayout(), this.view.clickReadAllReviews());
    }

    /* renamed from: C */
    public /* synthetic */ C5368e mo7315C(View.LifecycleEvent lifecycleEvent) {
        return this.view.installAppClick();
    }

    /* renamed from: F */
    public /* synthetic */ void mo7319F(View.LifecycleEvent lifecycleEvent) {
        this.view.showLoading();
    }

    /* renamed from: H */
    public /* synthetic */ C5368e mo7321H(View.LifecycleEvent lifecycleEvent) {
        return this.accountManager.accountStatus();
    }

    /* renamed from: I */
    public /* synthetic */ C5368e mo7322I(View.LifecycleEvent lifecycleEvent) {
        return this.view.installWalletButtonClick().mo18664b(new C1615i6(this)).mo18689g(new C1683m2(this)).mo18686f();
    }

    /* renamed from: L */
    public /* synthetic */ C5368e mo7325L(View.LifecycleEvent lifecycleEvent) {
        return this.promotionsNavigator.claimDialogResults();
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo7391b(AppViewModel appViewModel) {
        return C5368e.m10245a(loadAds(appViewModel), handleAppViewOpenOptions(appViewModel), loadAppcPromotion(appViewModel), observePromotionDownloadErrors(appViewModel), loadTopDonations(appViewModel), observeDownloadApp(), observeDownloadErrors(), loadOtherAppViewComponents(appViewModel));
    }

    /* renamed from: f */
    public /* synthetic */ void mo7436f(Void voidR) {
        this.appViewAnalytics.sendAppcInfoInteractEvent();
        this.appViewNavigator.navigateToAppCoinsInfo();
    }

    /* renamed from: g */
    public /* synthetic */ void mo7440g(Void voidR) {
        this.appViewAnalytics.sendAppcInfoInteractEvent();
        this.appViewNavigator.navigateToAppCoinsInfo();
    }

    /* renamed from: j */
    public /* synthetic */ Single mo7451j(Void voidR) {
        return this.appViewManager.getAppModel();
    }

    /* renamed from: k */
    public /* synthetic */ void mo7458k(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: l */
    public /* synthetic */ C5368e mo7460l(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickDeveloperEmail();
    }

    /* renamed from: m */
    public /* synthetic */ Single mo7466m(Void voidR) {
        return this.appViewManager.getAppModel();
    }

    /* renamed from: n */
    public /* synthetic */ Single mo7470n(Void voidR) {
        return this.appViewManager.getAppModel();
    }

    /* renamed from: o */
    public /* synthetic */ C5368e mo7475o(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickDeveloperWebsite();
    }

    /* renamed from: p */
    public /* synthetic */ void mo7482p(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: q */
    public /* synthetic */ void mo7487q(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: r */
    public /* synthetic */ C5368e mo7489r(View.LifecycleEvent lifecycleEvent) {
        return C5368e.m10243a(this.view.clickRateApp(), this.view.clickRateAppLarge(), this.view.clickRateAppLayout());
    }

    /* renamed from: s */
    public /* synthetic */ C5368e mo7494s(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickErrorRetry().mo18664b(new C1867w1(this)).mo18687f(new C1719o2(this)).mo18686f();
    }

    /* renamed from: t */
    public /* synthetic */ void mo7498t(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: u */
    public /* synthetic */ void mo7501u(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: v */
    public /* synthetic */ void mo7503v(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: w */
    public /* synthetic */ C5368e mo7506w(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickToolbar().mo18687f(new C1764qb(this));
    }

    /* renamed from: x */
    public /* synthetic */ void mo7510x(Throwable th) {
        this.crashReport.log(th);
        if (th instanceof InvalidAppException) {
            this.view.showInvalidAppInfoErrorDialog();
        } else {
            this.view.showGenericErrorDialog();
        }
    }

    /* renamed from: z */
    public /* synthetic */ C5368e mo7513z(View.LifecycleEvent lifecycleEvent) {
        return this.view.getScreenshotClickEvent();
    }

    /* renamed from: E */
    static /* synthetic */ void m4669E(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: F */
    static /* synthetic */ void m4673F(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: K */
    static /* synthetic */ void m4686K(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: c */
    public /* synthetic */ void mo7415c(PromotionViewModel promotionViewModel) {
        if (promotionViewModel.getWalletApp().getDownloadModel().getDownloadState().equals(DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR)) {
            this.appViewNavigator.navigateToOutOfSpaceDialog(promotionViewModel.getWalletApp().getSize(), promotionViewModel.getWalletApp().getPackageName());
        } else {
            this.view.showDownloadError(promotionViewModel.getWalletApp().getDownloadModel());
        }
    }

    /* renamed from: j */
    public /* synthetic */ C5368e mo7452j(AppModel appModel) {
        return this.view.showRateDialog(appModel.getAppName(), appModel.getPackageName(), appModel.getStore().getName());
    }

    /* renamed from: k */
    public /* synthetic */ Single mo7455k(Void voidR) {
        return this.appViewManager.getAppModel();
    }

    /* renamed from: l */
    public /* synthetic */ void mo7462l(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: m */
    public /* synthetic */ void mo7468m(AppModel appModel) {
        this.appViewAnalytics.sendBadgeClickEvent();
        this.view.showTrustedDialog(appModel);
    }

    /* renamed from: n */
    public /* synthetic */ void mo7472n(AppModel appModel) {
        this.appViewAnalytics.sendReadAllEvent();
        this.appViewNavigator.navigateToRateAndReview(appModel.getAppId(), appModel.getAppName(), appModel.getStore().getName(), appModel.getPackageName(), BuildConfig.APTOIDE_THEME);
    }

    /* renamed from: o */
    public /* synthetic */ Single mo7474o(Void voidR) {
        return this.appViewManager.getAppModel();
    }

    /* renamed from: p */
    public /* synthetic */ void mo7483p(Void voidR) {
        this.view.showLoading();
    }

    /* renamed from: q */
    public /* synthetic */ C5368e mo7485q(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickOtherVersions();
    }

    /* renamed from: t */
    public /* synthetic */ Single mo7496t(Void voidR) {
        return this.appViewManager.getAppModel();
    }

    /* renamed from: u */
    public /* synthetic */ C5368e mo7500u(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickSimilarApp();
    }

    /* renamed from: J */
    static /* synthetic */ void m4684J(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: O */
    static /* synthetic */ void m4691O(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: e */
    public /* synthetic */ void mo7431e(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: f */
    public /* synthetic */ void mo7435f(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: g */
    public /* synthetic */ C5368e mo7438g(View.LifecycleEvent lifecycleEvent) {
        return this.view.iabInfoClick();
    }

    /* renamed from: h */
    public /* synthetic */ C5368e mo7441h(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickGetAppcInfo();
    }

    /* renamed from: i */
    public /* synthetic */ C5368e mo7448i(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickBonusAppcFlair();
    }

    /* renamed from: k */
    public /* synthetic */ void mo7457k(AppModel appModel) {
        this.appViewAnalytics.sendStoreOpenEvent(appModel.getStore());
        this.appViewAnalytics.sendOpenStoreEvent();
        this.appViewNavigator.navigateToStore(appModel.getStore());
    }

    /* renamed from: l */
    public /* synthetic */ void mo7461l(AppModel appModel) {
        this.appViewAnalytics.sendDonateClickTopDonors();
        this.appViewNavigator.navigateToDonationsDialog(appModel.getPackageName(), TAG);
    }

    /* renamed from: o */
    public /* synthetic */ void mo7476o(AppModel appModel) {
        if (appModel.hasDonations()) {
            this.appViewAnalytics.sendDonateImpressionAfterInstall(appModel.getPackageName());
        }
    }

    /* renamed from: p */
    public /* synthetic */ C5328b mo7480p(AppModel appModel) {
        return openInstalledApp(appModel.getPackageName());
    }

    /* renamed from: q */
    public /* synthetic */ C5368e mo7486q(Void voidR) {
        return loadAppView();
    }

    /* renamed from: w */
    public /* synthetic */ Single mo7505w(Void voidR) {
        return this.appViewManager.getAppModel();
    }

    /* renamed from: B */
    public /* synthetic */ C5368e mo7313B(View.LifecycleEvent lifecycleEvent) {
        return this.view.dismissWalletPromotionClick();
    }

    /* renamed from: e */
    public /* synthetic */ void mo7432e(Void voidR) {
        this.appViewNavigator.navigateToAppCoinsInfo();
    }

    /* renamed from: f */
    public /* synthetic */ C5368e mo7433f(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickLoginSnack();
    }

    /* renamed from: g */
    public /* synthetic */ C5328b mo7437g(AppModel appModel) {
        if (appModel.isStoreFollowed()) {
            this.view.setFollowButton(true);
            this.appViewAnalytics.sendOpenStoreEvent();
            this.appViewNavigator.navigateToStore(appModel.getStore());
            return C5328b.m10170f();
        }
        this.view.setFollowButton(false);
        this.appViewAnalytics.sendFollowStoreEvent();
        this.view.displayStoreFollowedSnack(appModel.getStore().getName());
        return this.appViewManager.subscribeStore(appModel.getStore().getName());
    }

    /* renamed from: h */
    public /* synthetic */ void mo7443h(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: i */
    public /* synthetic */ Single mo7447i(Void voidR) {
        return this.appViewManager.getAppModel();
    }

    /* renamed from: m */
    public /* synthetic */ void mo7469m(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: r */
    public /* synthetic */ void mo7491r(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: y */
    public /* synthetic */ C5368e mo7511y(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickTrustedBadge();
    }

    /* renamed from: N */
    static /* synthetic */ void m4690N(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* renamed from: d */
    public /* synthetic */ C5368e mo7420d(DownloadModel.Action action) {
        return this.appViewManager.observeAppViewModel().mo18681d(C1897xb.f4498f).mo18669c();
    }

    /* renamed from: e */
    public /* synthetic */ void mo7429e(AppModel appModel) {
        this.view.navigateToDeveloperPrivacy(appModel);
    }

    /* renamed from: h */
    public /* synthetic */ void mo7442h(AppModel appModel) {
        this.appViewAnalytics.sendOtherVersionsEvent();
        this.appViewNavigator.navigateToOtherVersions(appModel.getAppName(), appModel.getIcon(), appModel.getPackageName());
    }

    /* renamed from: i */
    public /* synthetic */ void mo7450i(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: r */
    public /* synthetic */ void mo7490r(AppModel appModel) {
        this.appViewAnalytics.sendDownloadPauseEvent(appModel.getPackageName());
    }

    /* renamed from: s */
    public /* synthetic */ C5328b mo7493s(AppModel appModel) {
        return this.appViewManager.pauseDownload(appModel.getMd5());
    }

    /* renamed from: v */
    public /* synthetic */ C5368e mo7502v(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickStoreLayout();
    }

    /* renamed from: x */
    public /* synthetic */ C5368e mo7509x(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickTopDonorsDonateButton();
    }

    /* renamed from: e */
    public /* synthetic */ C5368e mo7428e(View.LifecycleEvent lifecycleEvent) {
        return C5368e.m10244a(this.view.clickVirusFlag(), this.view.clickLicenseFlag(), this.view.clickWorkingFlag(), this.view.clickFakeFlag());
    }

    /* renamed from: i */
    public /* synthetic */ void mo7449i(AppModel appModel) {
        this.appViewAnalytics.sendRateThisAppEvent();
    }

    /* renamed from: j */
    public /* synthetic */ C5368e mo7453j(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickCatappultCard();
    }

    /* renamed from: s */
    public /* synthetic */ Single mo7492s(Void voidR) {
        return this.appViewManager.getAppModel();
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo7341a(PromotionViewModel promotionViewModel) {
        return this.appViewManager.resumeDownload(promotionViewModel.getWalletApp().getMd5sum(), promotionViewModel.getWalletApp().getId(), promotionViewModel.getWalletApp().getDownloadModel().getAction(), promotionViewModel.getWalletApp().getTrustedBadge(), false);
    }

    /* renamed from: b */
    public /* synthetic */ AppViewModel mo7380b(AppViewModel appViewModel, Throwable th) {
        this.crashReport.log(th);
        return appViewModel;
    }

    /* renamed from: n */
    public /* synthetic */ void mo7473n(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: b */
    public /* synthetic */ Single mo7382b(SearchAdResult searchAdResult) {
        if (searchAdResult == null) {
            return this.appViewManager.loadAdsFromAppView().mo18564b(new C1581g8(this)).mo18558a((C5378b<Throwable>) new C1891x5(this));
        }
        return Single.m10119a(searchAdResult).mo18564b(new C1784rd(this, searchAdResult));
    }

    /* renamed from: d */
    public /* synthetic */ void mo7423d(AppViewModel appViewModel) {
        if (appViewModel.getDownloadModel().getDownloadState().equals(DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR)) {
            this.appViewNavigator.navigateToOutOfSpaceDialog(appViewModel.getAppModel().getSize(), appViewModel.getAppModel().getPackageName());
        } else {
            this.view.showDownloadError(appViewModel.getDownloadModel());
        }
    }

    /* access modifiers changed from: private */
    public C5368e<PromotionViewModel> verifyNotEnoughSpaceError(PromotionViewModel promotionViewModel) {
        WalletApp walletApp = promotionViewModel.getWalletApp();
        DownloadModel downloadModel = walletApp.getDownloadModel();
        if (downloadModel == null || downloadModel.getDownloadState() != DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR) {
            return C5368e.m10257c(promotionViewModel);
        }
        return this.appViewManager.getAdsVisibilityStatus().mo18564b(new C1871w5(this, walletApp)).mo18567c().mo18694j(new C1498d1(promotionViewModel));
    }

    /* renamed from: e */
    public /* synthetic */ C5368e mo7427e(DownloadModel.Action action) {
        return this.permissionManager.requestExternalStoragePermission(this.permissionService);
    }

    /* renamed from: h */
    public /* synthetic */ void mo7444h(Void voidR) {
        this.appViewNavigator.navigateToCatappultWebsite();
    }

    /* renamed from: e */
    public /* synthetic */ C5328b mo7426e(AppViewModel appViewModel) {
        return this.appViewManager.resumeDownload(appViewModel.getAppModel().getMd5(), appViewModel.getAppModel().getAppId(), appViewModel.getDownloadModel().getAction(), appViewModel.getAppModel().getMalware().getRank().toString(), appViewModel.getAppModel().getOpenType() == AppViewFragment.OpenType.APK_FY_INSTALL_POPUP).mo18605c();
    }

    /* renamed from: b */
    public /* synthetic */ void mo7396b(PromotionViewModel promotionViewModel) {
        if (promotionViewModel.getAppViewModel() != null) {
            DownloadModel downloadModel = promotionViewModel.getAppViewModel().getDownloadModel();
            AppModel appModel = promotionViewModel.getAppViewModel().getAppModel();
            Promotion.ClaimAction claimAction = Promotion.ClaimAction.INSTALL;
            if (downloadModel != null && downloadModel.getAction() == DownloadModel.Action.MIGRATE) {
                claimAction = Promotion.ClaimAction.MIGRATE;
            } else if (promotionViewModel.getAppViewModel().getMigrationModel().isMigrated() && downloadModel != null && downloadModel.getAction() == DownloadModel.Action.OPEN) {
                claimAction = Promotion.ClaimAction.MIGRATE;
            }
            Promotion claimablePromotion = this.appViewManager.getClaimablePromotion(promotionViewModel.getPromotions(), claimAction);
            if (claimablePromotion != null && appModel != null && downloadModel != null) {
                this.view.showAppcWalletPromotionView(claimablePromotion, promotionViewModel.getWalletApp(), claimAction, downloadModel);
                if (!this.appViewManager.isAppcPromotionImpressionSent()) {
                    this.appViewAnalytics.sendPromotionImpression(claimablePromotion.getPromotionId());
                    this.appViewManager.setAppcPromotionImpressionSent();
                }
                if (promotionViewModel.getWalletApp().isInstalled() && downloadModel.getAction() == DownloadModel.Action.OPEN) {
                    this.appViewManager.scheduleNotification(String.valueOf(claimablePromotion.getAppc()), appModel.getIcon(), appModel.getPackageName(), appModel.getStore().getName());
                }
            }
        }
    }

    /* renamed from: c */
    public /* synthetic */ void mo7414c(AppViewModel appViewModel) {
        this.view.showDownloadAppModel(appViewModel.getDownloadModel(), appViewModel.getAppCoinsViewModel(), appViewModel.getAppModel().hasSplits());
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo7336a(AppViewModel appViewModel) {
        return this.appViewManager.resumeDownload(appViewModel.getAppModel().getMd5(), appViewModel.getAppModel().getAppId(), appViewModel.getDownloadModel().getAction(), appViewModel.getAppModel().getMalware().getRank().toString(), appViewModel.getAppModel().getOpenType() == AppViewFragment.OpenType.APK_FY_INSTALL_POPUP);
    }

    /* renamed from: d */
    public /* synthetic */ void mo7424d(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: d */
    public /* synthetic */ void mo7422d(AppModel appModel) {
        this.view.navigateToDeveloperPermissions(appModel);
    }

    /* renamed from: c */
    public /* synthetic */ void mo7412c(AppModel appModel) {
        this.view.navigateToDeveloperEmail(appModel);
    }

    /* renamed from: d */
    public /* synthetic */ Single mo7418d(Boolean bool) {
        return this.appViewManager.getAppModel();
    }

    /* renamed from: c */
    public /* synthetic */ void mo7417c(Throwable th) {
        this.crashReport.log(th);
    }

    /* renamed from: d */
    public /* synthetic */ void mo7425d(Void voidR) {
        this.accountNavigator.navigateToAccountView(AccountAnalytics.AccountOrigins.APP_VIEW_FLAG);
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo7410c(Integer num) {
        return C5368e.m10257c(num).mo18658b((long) TIME_BETWEEN_SCROLL, TimeUnit.MILLISECONDS).mo18644a(C5376a.m10346b()).mo18664b(new C1730od(this));
    }

    /* renamed from: d */
    public /* synthetic */ C5328b mo7419d(AppModel appModel, DownloadModel.Action action, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        WalletAdsOfferManager.OfferResponseStatus offerResponseStatus2;
        DownloadModel.Action action2;
        AppModel appModel2;
        if (this.appViewManager.hasClaimablePromotion(Promotion.ClaimAction.MIGRATE)) {
            this.appViewAnalytics.sendAppcMigrationUpdateClick();
        }
        boolean z = true;
        this.appViewAnalytics.clickOnInstallButton(appModel.getPackageName(), appModel.getDeveloper().getName(), "UPDATE TO APPC", appModel.hasSplits(), appModel.hasBilling(), true, appModel.getMalware().getRank().name(), offerResponseStatus.toString().toLowerCase(), appModel.getOriginTag(), appModel.getStore().getName(), appModel.getOpenType() == AppViewFragment.OpenType.APK_FY_INSTALL_POPUP, appModel.getObb() != null);
        if (appModel.getOpenType() == AppViewFragment.OpenType.APK_FY_INSTALL_POPUP) {
            appModel2 = appModel;
            action2 = action;
            offerResponseStatus2 = offerResponseStatus;
        } else {
            appModel2 = appModel;
            action2 = action;
            offerResponseStatus2 = offerResponseStatus;
            z = false;
        }
        return migrateApp(action2, appModel2, offerResponseStatus2, z);
    }

    /* renamed from: c */
    public /* synthetic */ C5328b mo7405c(DownloadModel.Action action) {
        int i = C14361.$SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[action.ordinal()];
        if (i == 1 || i == 2) {
            return this.appViewManager.getAppModel().mo18566b(new C1706n7(this, action));
        }
        if (i == 3) {
            return this.appViewManager.getAppModel().mo18556a(this.viewScheduler).mo18566b(new C1798s9(this));
        }
        if (i == 4) {
            return this.appViewManager.getAppModel().mo18566b(new C1702n3(this, action));
        }
        if (i != 5) {
            return C5328b.m10163b((Throwable) new IllegalArgumentException("Invalid type of action"));
        }
        return this.appViewManager.getAppModel().mo18566b(new C1763qa(this, action));
    }

    /* renamed from: a */
    public /* synthetic */ Single mo7332a(AppViewModel appViewModel, AppModel appModel) {
        if (appModel.hasDonations()) {
            return this.appViewManager.getTopDonations(appModel.getPackageName()).mo18556a(this.viewScheduler).mo18564b(new C1758q5(this)).mo18569d(new C1870w4(appViewModel));
        }
        return Single.m10119a(appViewModel);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7379a(List list) {
        this.view.showDonations(list);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo7350a(AppViewModel appViewModel, Boolean bool) {
        return loadOrganicAds(appViewModel);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7372a(SearchAdResult searchAdResult) {
        this.appViewManager.setSearchAdResult(searchAdResult);
        handleAdsLogic(this.appViewManager.getSearchAdResult());
    }

    /* renamed from: a */
    public /* synthetic */ void mo7373a(SearchAdResult searchAdResult, SearchAdResult searchAdResult2) {
        handleAdsLogic(searchAdResult);
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo7335a(AppModel appModel, DownloadModel.Action action, Boolean bool) {
        return this.appViewManager.getAdsVisibilityStatus().mo18564b(new C1929z7(this, appModel, action)).mo18566b(new C1455ad(this, action, appModel));
    }

    /* renamed from: c */
    public /* synthetic */ C5328b mo7407c(DownloadModel.Action action, AppModel appModel, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        return downgradeApp(action, appModel, offerResponseStatus, appModel.getOpenType() == AppViewFragment.OpenType.APK_FY_INSTALL_POPUP).mo18589a((C5377a) new C1447a5(this, appModel, action, offerResponseStatus));
    }

    /* renamed from: d */
    public /* synthetic */ C5368e mo7421d(View.LifecycleEvent lifecycleEvent) {
        return this.view.apkfyDialogPositiveClick();
    }

    /* renamed from: a */
    public /* synthetic */ void mo7364a(AppModel appModel, DownloadModel.Action action, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        this.appViewAnalytics.clickOnInstallButton(appModel.getPackageName(), appModel.getDeveloper().getName(), action.toString(), appModel.hasSplits(), appModel.hasBilling(), action.equals(DownloadModel.Action.MIGRATE), appModel.getMalware().getRank().name(), offerResponseStatus.toString().toLowerCase(), appModel.getOriginTag(), appModel.getStore().getName(), appModel.getOpenType() == AppViewFragment.OpenType.APK_FY_INSTALL_POPUP, appModel.getObb() != null);
    }

    /* renamed from: b */
    public /* synthetic */ void mo7397b(ScreenShotClickEvent screenShotClickEvent) {
        this.appViewAnalytics.sendOpenVideoEvent();
        this.appViewNavigator.navigateToUri(screenShotClickEvent.getUri());
    }

    /* renamed from: c */
    public /* synthetic */ void mo7413c(AppModel appModel, DownloadModel.Action action, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        AppViewAnalytics appViewAnalytics2 = this.appViewAnalytics;
        String packageName = appModel.getPackageName();
        String name = appModel.getDeveloper().getName();
        String str = action.toString();
        boolean hasSplits = appModel.hasSplits();
        boolean hasBilling = appModel.hasBilling();
        String name2 = appModel.getMalware().getRank().name();
        String lowerCase = offerResponseStatus.toString().toLowerCase();
        String originTag = appModel.getOriginTag();
        String name3 = appModel.getStore().getName();
        boolean z = true;
        boolean z2 = appModel.getOpenType() == AppViewFragment.OpenType.APK_FY_INSTALL_POPUP;
        if (appModel.getObb() == null) {
            z = false;
        }
        appViewAnalytics2.clickOnInstallButton(packageName, name, str, hasSplits, hasBilling, false, name2, lowerCase, originTag, name3, z2, z);
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo7393b(FlagsVote.VoteType voteType) {
        return this.accountManager.accountStatus().mo18669c().mo18644a(this.viewScheduler).mo18687f(new C1482c3(this)).mo18681d(C1855v7.f4452f).mo18692i(new C1596h5(this)).mo18692i(new C1504d7(this, voteType)).mo18681d(C1597h6.f4138f).mo18644a(this.viewScheduler).mo18664b(new C1657kc(this, voteType));
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo7338a(DownloadModel.Action action, AppModel appModel, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        return downloadApp(action, appModel, offerResponseStatus, appModel.getOpenType() == AppViewFragment.OpenType.APK_FY_INSTALL_POPUP).mo18590a((C5378b<? super Throwable>) new C1546e9(this)).mo18598b();
    }

    /* renamed from: b */
    public /* synthetic */ void mo7402b(Throwable th) {
        this.view.enableFlags();
        this.crashReport.log(th);
    }

    /* renamed from: b */
    static /* synthetic */ Boolean m4724b(MenuItem menuItem, AppModel appModel) {
        return Boolean.valueOf(menuItem != null);
    }

    /* renamed from: c */
    public /* synthetic */ C5328b mo7406c(DownloadModel.Action action, AppModel appModel) {
        return this.appViewManager.getAdsVisibilityStatus().mo18556a(this.viewScheduler).mo18566b(new C1727oa(this, appModel, action));
    }

    /* renamed from: a */
    public /* synthetic */ void mo7378a(Throwable th) {
        if (th instanceof InvalidAppException) {
            this.view.showInvalidAppInfoErrorDialog();
        } else {
            this.view.showGenericErrorDialog();
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo7400b(Integer num) {
        this.view.scrollReviews(num);
    }

    /* renamed from: b */
    public /* synthetic */ void mo7403b(List list) {
        this.view.populateSimilar(list);
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo7409c(WalletApp walletApp) {
        return this.permissionManager.requestExternalStoragePermission(this.permissionService).mo18689g(new C1820t8(this, walletApp)).mo18686f();
    }

    /* renamed from: b */
    static /* synthetic */ List m4727b(List list, SimilarAppsViewModel similarAppsViewModel) {
        if (similarAppsViewModel.hasSimilarApps()) {
            list.add(new SimilarAppsBundle(similarAppsViewModel, SimilarAppsBundle.BundleType.APPS));
        }
        return list;
    }

    /* renamed from: a */
    public /* synthetic */ AppViewModel mo7331a(AppViewModel appViewModel, Throwable th) {
        this.crashReport.log(th);
        return appViewModel;
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo7359a(Object obj) {
        return this.appViewManager.loadPromotionViewModel().mo18681d(C1853v5.f4450f).mo18669c();
    }

    /* renamed from: b */
    public /* synthetic */ C5328b mo7384b(AppModel appModel) {
        return this.appViewManager.cancelDownload(appModel.getMd5(), appModel.getPackageName(), appModel.getVersionCode());
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo7408c(View.LifecycleEvent lifecycleEvent) {
        return this.view.claimAppClick().mo18687f(new C1927z5(this)).mo18686f();
    }

    /* renamed from: a */
    public /* synthetic */ void mo7363a(AppModel appModel, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        this.appViewAnalytics.sendNotEnoughSpaceErrorEvent(appModel.getMd5());
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo7389b(Account account) {
        return this.view.installAppClick().mo18689g(new C1834u4(this)).mo18649a((C5378b<? super Throwable>) new C1852v4(this)).mo18686f();
    }

    /* renamed from: c */
    public /* synthetic */ void mo7416c(Boolean bool) {
        this.appViewManager.allowRootInstall(bool);
    }

    /* renamed from: c */
    public /* synthetic */ C5368e mo7411c(Void voidR) {
        return this.permissionManager.requestExternalStoragePermission(this.permissionService);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7371a(WalletApp walletApp, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        this.appViewAnalytics.sendNotEnoughSpaceErrorEvent(walletApp.getMd5sum());
    }

    /* renamed from: b */
    public /* synthetic */ C5328b mo7386b(DownloadModel.Action action, AppModel appModel, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        return downloadApp(action, appModel, offerResponseStatus, appModel.getOpenType() == AppViewFragment.OpenType.APK_FY_INSTALL_POPUP).mo18588a(this.viewScheduler).mo18589a((C5377a) new C1563f8(this, appModel, action, offerResponseStatus));
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo7357a(Serializable serializable) {
        return downloadInRange(0, 100);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7366a(DownloadModel downloadModel) {
        this.view.showDownloadingSimilarApps(this.appViewManager.getCachedAppcSimilarAppsViewModel().hasSimilarApps() || this.appViewManager.getCachedSimilarAppsViewModel().hasSimilarApps());
    }

    /* renamed from: b */
    public /* synthetic */ void mo7395b(AppModel appModel, DownloadModel.Action action, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        String campaignUrl = appModel.getCampaignUrl();
        if (!campaignUrl.isEmpty()) {
            this.campaignAnalytics.sendCampaignConversionEvent(campaignUrl, appModel.getPackageName(), appModel.getVersionCode());
        }
        this.appViewAnalytics.clickOnInstallButton(appModel.getPackageName(), appModel.getDeveloper().getName(), action.toString(), appModel.hasSplits(), appModel.hasBilling(), false, appModel.getMalware().getRank().name(), offerResponseStatus.toString().toLowerCase(), appModel.getOriginTag(), appModel.getStore().getName(), appModel.getOpenType() == AppViewFragment.OpenType.APK_FY_INSTALL_POPUP, appModel.getObb() != null);
        if (this.appViewManager.hasClaimablePromotion(Promotion.ClaimAction.INSTALL)) {
            this.appViewAnalytics.sendInstallPromotionApp();
        }
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m4713a(int i, int i2, DownloadModel downloadModel) {
        return Boolean.valueOf(downloadModel.getProgress() >= i && downloadModel.getProgress() < i2);
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m4714a(C10706f fVar) {
        return true;
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo7358a(Integer num) {
        return scheduleAnimations(num.intValue());
    }

    /* renamed from: a */
    public /* synthetic */ void mo7368a(ScreenShotClickEvent screenShotClickEvent) {
        this.appViewAnalytics.sendOpenScreenshotEvent();
        this.appViewNavigator.navigateToScreenshots(screenShotClickEvent.getImagesUris(), screenShotClickEvent.getImagesIndex());
    }

    /* renamed from: a */
    public /* synthetic */ void mo7367a(ReadMoreClickEvent readMoreClickEvent) {
        this.appViewAnalytics.sendReadMoreEvent();
        this.appViewNavigator.navigateToDescriptionReadMore(readMoreClickEvent.getStoreName(), readMoreClickEvent.getDescription(), readMoreClickEvent.hasAppc());
    }

    /* renamed from: a */
    public /* synthetic */ void mo7374a(FlagsVote.VoteType voteType) {
        this.view.disableFlags();
    }

    /* renamed from: b */
    public /* synthetic */ C5328b mo7385b(DownloadModel.Action action, AppModel appModel) {
        return this.appViewManager.getAdsVisibilityStatus().mo18556a(this.viewScheduler).mo18566b(new C1766qd(this, action, appModel));
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo7346a(Account account) {
        if (account.isLoggedIn()) {
            return C5368e.m10257c(true);
        }
        this.view.enableFlags();
        this.view.displayNotLoggedInSnack();
        return C5368e.m10257c(false);
    }

    /* renamed from: b */
    public /* synthetic */ void mo7401b(String str) {
        this.view.openApp(str);
    }

    /* renamed from: b */
    public /* synthetic */ void mo7399b(Boolean bool) {
        this.appViewManager.allowRootInstall(bool);
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo7394b(Void voidR) {
        return this.permissionManager.requestExternalStoragePermission(this.permissionService);
    }

    /* renamed from: a */
    public /* synthetic */ Single mo7333a(FlagsVote.VoteType voteType, AppModel appModel) {
        return this.appViewManager.flagApk(appModel.getStore().getName(), appModel.getMd5(), voteType);
    }

    /* renamed from: b */
    public /* synthetic */ Single mo7381b(DownloadModel.Action action) {
        return this.appViewManager.getAppModel();
    }

    /* renamed from: b */
    public /* synthetic */ void mo7398b(Promotion promotion) {
        this.appViewAnalytics.sendClickOnNoThanksWallet(promotion.getPromotionId());
        this.view.dismissWalletPromotionView();
    }

    /* renamed from: a */
    public /* synthetic */ void mo7375a(FlagsVote.VoteType voteType, Boolean bool) {
        this.view.incrementFlags(voteType);
        this.view.showFlagVoteSubmittedMessage();
    }

    /* renamed from: b */
    public /* synthetic */ C5328b mo7383b(Pair pair) {
        return downloadWallet((WalletApp) pair.second);
    }

    /* renamed from: b */
    public /* synthetic */ C5328b mo7388b(WalletApp walletApp, Void voidR) {
        return this.appViewManager.resumeDownload(walletApp.getMd5sum(), walletApp.getId(), walletApp.getDownloadModel().getAction(), walletApp.getTrustedBadge(), false);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo7352a(SimilarAppClickEvent similarAppClickEvent) {
        String str;
        ApplicationAd.Network network;
        boolean z;
        AppViewSimilarApp similar = similarAppClickEvent.getSimilar();
        if (similar.isAd()) {
            z = true;
            network = similar.getAd().getNetwork();
            str = similar.getAd().getPackageName();
            if (similar.getAd().getNetwork() == ApplicationAd.Network.SERVER) {
                this.appViewNavigator.navigateToAd((AptoideNativeAd) similar.getAd(), similarAppClickEvent.getType().getDescription());
            }
        } else {
            str = similar.getApp().getPackageName();
            this.appViewNavigator.navigateToAppView(similar.getApp().getAppId(), str, similarAppClickEvent.getType().getDescription());
            z = false;
            network = null;
        }
        this.appViewAnalytics.sendSimilarAppsInteractEvent(similarAppClickEvent.getType().getDescription());
        this.appViewAnalytics.similarAppClick(similarAppClickEvent.getType(), network, str, similarAppClickEvent.getPosition(), z);
        return C5368e.m10257c(Boolean.valueOf(z));
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo7392b(View.LifecycleEvent lifecycleEvent) {
        return this.view.cancelPromotionDownload().mo18689g(new C1861vd(this)).mo18686f();
    }

    /* renamed from: b */
    public /* synthetic */ C5328b mo7387b(WalletApp walletApp) {
        return this.appViewManager.pauseDownload(walletApp.getMd5sum());
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo7345a(MenuItem menuItem) {
        return this.appViewManager.getAppModel().mo18567c().mo18681d(new C1928z6(menuItem)).mo18644a(this.viewScheduler).mo18664b(new C1614i5(this, menuItem));
    }

    /* renamed from: a */
    public /* synthetic */ void mo7361a(MenuItem menuItem, AppModel appModel) {
        switch (menuItem.getItemId()) {
            case C1086R.C1088id.menu_item_share:
                this.view.defaultShare(appModel.getAppName(), appModel.getWebUrls());
                return;
            case C1086R.C1088id.menu_remote_install:
                this.appViewAnalytics.sendRemoteInstallEvent();
                this.view.showShareOnTvDialog(appModel.getAppId());
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    static /* synthetic */ List m4715a(List list, AppModel appModel, List list2) {
        if (list.size() >= 2) {
            if (appModel.isAppCoinApp()) {
                if (((SimilarAppsBundle) list.get(0)).getType() == SimilarAppsBundle.BundleType.APPS) {
                    Collections.swap(list, 0, 1);
                }
            } else if (((SimilarAppsBundle) list.get(0)).getType() == SimilarAppsBundle.BundleType.APPC_APPS) {
                Collections.swap(list, 0, 1);
            }
        }
        return list;
    }

    /* renamed from: a */
    static /* synthetic */ List m4716a(List list, SimilarAppsViewModel similarAppsViewModel) {
        if (similarAppsViewModel.hasSimilarApps()) {
            list.add(new SimilarAppsBundle(similarAppsViewModel, SimilarAppsBundle.BundleType.APPC_APPS));
        }
        return list;
    }

    /* renamed from: a */
    public /* synthetic */ void mo7365a(AppModel appModel, ReviewsViewModel reviewsViewModel) {
        if (reviewsViewModel.hasError()) {
            this.view.hideReviews();
        } else {
            this.view.populateReviews(reviewsViewModel, appModel);
        }
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo7354a(View.LifecycleEvent lifecycleEvent) {
        return this.view.cancelDownload().mo18692i(new C1781ra(this)).mo18664b(new C1465b4(this)).mo18689g(new C1489ca(this)).mo18686f();
    }

    /* renamed from: a */
    public /* synthetic */ Single mo7334a(Void voidR) {
        return this.appViewManager.getAppModel();
    }

    /* renamed from: a */
    public /* synthetic */ void mo7362a(AppModel appModel) {
        this.appViewAnalytics.sendDownloadCancelEvent(appModel.getPackageName());
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo7337a(DownloadModel.Action action, AppModel appModel) {
        return this.appViewManager.getAdsVisibilityStatus().mo18566b(new C1743p8(this, action, appModel));
    }

    /* renamed from: a */
    public /* synthetic */ void mo7376a(Boolean bool) {
        this.view.showDowngradingMessage();
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo7339a(DownloadModel.Action action, AppModel appModel, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, boolean z, Boolean bool) {
        return downloadApp(action, appModel, offerResponseStatus, z);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo7351a(DownloadModel.Action action) {
        if (this.appViewManager.shouldShowRootInstallWarningPopup()) {
            return this.view.showRootInstallWarningPopup().mo18664b(new C1568fd(this)).mo18694j(new C1616i7(action));
        }
        return C5368e.m10257c(action);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo7347a(AppModel appModel, DownloadModel.Action action, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, boolean z, DownloadModel.Action action2) {
        return this.permissionManager.requestDownloadAccessWithWifiBypass(this.permissionService, appModel.getSize()).mo18687f(new C1621ic(this)).mo18644a(Schedulers.m10352io()).mo18689g(new C1688m7(this, action, appModel, offerResponseStatus, z));
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo7340a(DownloadModel.Action action, AppModel appModel, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus, boolean z, Void voidR) {
        return this.appViewManager.downloadApp(action, appModel.getAppId(), appModel.getMalware().getRank().name(), appModel.getEditorsChoice(), offerResponseStatus, z);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7377a(String str) {
        this.view.showApkfyElement(str);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7360a(Pair pair) {
        this.appViewAnalytics.sendInstallAppcWallet(((Promotion) pair.first).getPromotionId());
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo7342a(WalletApp walletApp) {
        return this.appViewManager.cancelDownload(walletApp.getMd5sum(), walletApp.getPackageName(), walletApp.getVersionCode());
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo7355a(Promotion promotion) {
        this.appViewAnalytics.sendClickOnClaimAppViewPromotion(promotion.getPromotionId());
        return this.appViewManager.getAppModel().mo18567c().mo18664b(new C1869w3(this, promotion));
    }

    /* renamed from: a */
    public /* synthetic */ void mo7370a(Promotion promotion, AppModel appModel) {
        this.promotionsNavigator.navigateToClaimDialog(appModel.getPackageName(), promotion.getPromotionId());
    }

    /* renamed from: a */
    public /* synthetic */ void mo7369a(ClaimDialogResultWrapper claimDialogResultWrapper) {
        this.appViewManager.unscheduleNotificationSync();
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo7344a() {
        if (this.appViewManager.shouldShowRootInstallWarningPopup()) {
            return this.view.showRootInstallWarningPopup().mo18664b(new C1790s1(this));
        }
        return C5368e.m10257c(null);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo7356a(WalletApp walletApp, Boolean bool) {
        return this.permissionManager.requestDownloadAccessWithWifiBypass(this.permissionService, walletApp.getSize());
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo7343a(WalletApp walletApp, Void voidR) {
        return this.appViewManager.downloadApp(walletApp);
    }
}
