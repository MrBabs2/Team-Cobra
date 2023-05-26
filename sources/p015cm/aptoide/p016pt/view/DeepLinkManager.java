package p015cm.aptoide.p016pt.view;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import p015cm.aptoide.accountmanager.Account;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.p016pt.AppShortcutsAnalytics;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.BuildConfig;
import p015cm.aptoide.p016pt.DeepLinkAnalytics;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p015cm.aptoide.p016pt.account.view.store.ManageStoreFragment;
import p015cm.aptoide.p016pt.account.view.store.ManageStoreViewModel;
import p015cm.aptoide.p016pt.ads.AdsRepository;
import p015cm.aptoide.p016pt.ads.MinimalAd;
import p015cm.aptoide.p016pt.app.AppNavigator;
import p015cm.aptoide.p016pt.app.view.AppCoinsInfoFragment;
import p015cm.aptoide.p016pt.app.view.AppViewFragment;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationNavigator;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.database.room.RoomStore;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetStoreWidgets;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Layout;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetStoreMeta;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.StoreContext;
import p015cm.aptoide.p016pt.editorial.EditorialFragment;
import p015cm.aptoide.p016pt.home.more.appcoins.EarnAppcListFragment;
import p015cm.aptoide.p016pt.install.InstallManager;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.notification.ReadyToInstallNotificationManager;
import p015cm.aptoide.p016pt.promotions.PromotionsFragment;
import p015cm.aptoide.p016pt.search.SearchNavigator;
import p015cm.aptoide.p016pt.search.analytics.SearchAnalytics;
import p015cm.aptoide.p016pt.search.analytics.SearchSource;
import p015cm.aptoide.p016pt.search.model.SearchQueryModel;
import p015cm.aptoide.p016pt.search.model.Source;
import p015cm.aptoide.p016pt.store.RoomStoreRepository;
import p015cm.aptoide.p016pt.store.StoreAnalytics;
import p015cm.aptoide.p016pt.store.StoreUtils;
import p015cm.aptoide.p016pt.store.StoreUtilsProxy;
import p015cm.aptoide.p016pt.store.view.StoreFragment;
import p015cm.aptoide.p016pt.store.view.StoreTabFragmentChooser;
import p015cm.aptoide.p016pt.themes.NewFeature;
import p015cm.aptoide.p016pt.themes.ThemeAnalytics;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.p124l.p125c.C5376a;
import p123rx.p126m.C5378b;
import p123rx.p128t.C5383b;

/* renamed from: cm.aptoide.pt.view.DeepLinkManager */
public class DeepLinkManager {
    private static final String APP_SHORTCUT = "App_Shortcut";
    public static final String DEEPLINK_KEY = "Deeplink";
    private static final String TAG = "cm.aptoide.pt.view.DeepLinkManager";
    private final AptoideAccountManager accountManager;
    private final AdsRepository adsRepository;
    private final AppNavigator appNavigator;
    private final AppShortcutsAnalytics appShortcutsAnalytics;
    private final BottomNavigationNavigator bottomNavigationNavigator;
    private final DeepLinkAnalytics deepLinkAnalytics;
    private final DeepLinkView deepLinkView;
    private final FragmentNavigator fragmentNavigator;
    private final InstallManager installManager;
    private final NavigationTracker navigationTracker;
    private final NewFeature newFeature;
    private final ReadyToInstallNotificationManager readyToInstallNotificationManager;
    private final SearchAnalytics searchAnalytics;
    private final SearchNavigator searchNavigator;
    private final SharedPreferences sharedPreferences;
    private final StoreAnalytics storeAnalytics;
    private final RoomStoreRepository storeRepository;
    private final StoreUtilsProxy storeUtilsProxy;
    private final C5383b subscriptions = new C5383b();
    private final ThemeAnalytics themeAnalytics;
    private final ThemeManager themeManager;

    /* renamed from: cm.aptoide.pt.view.DeepLinkManager$DeepLinkView */
    public interface DeepLinkView {
        void showStoreAlreadyAdded();

        void showStoreFollowed(String str);
    }

    /* renamed from: cm.aptoide.pt.view.DeepLinkManager$ShortcutDestinations */
    private static final class ShortcutDestinations {
        private static final String MY_STORE = "My_Store";
        private static final String MY_STORE_NOT_LOGGED_IN = "My_Store_Not_Logged_In";
        private static final String SEARCH = "Search";

        private ShortcutDestinations() {
        }
    }

    public DeepLinkManager(StoreUtilsProxy storeUtilsProxy2, FragmentNavigator fragmentNavigator2, BottomNavigationNavigator bottomNavigationNavigator2, SearchNavigator searchNavigator2, DeepLinkView deepLinkView2, SharedPreferences sharedPreferences2, RoomStoreRepository roomStoreRepository, NavigationTracker navigationTracker2, SearchAnalytics searchAnalytics2, AppShortcutsAnalytics appShortcutsAnalytics2, AptoideAccountManager aptoideAccountManager, DeepLinkAnalytics deepLinkAnalytics2, StoreAnalytics storeAnalytics2, AdsRepository adsRepository2, AppNavigator appNavigator2, InstallManager installManager2, NewFeature newFeature2, ThemeManager themeManager2, ThemeAnalytics themeAnalytics2, ReadyToInstallNotificationManager readyToInstallNotificationManager2) {
        this.storeUtilsProxy = storeUtilsProxy2;
        this.fragmentNavigator = fragmentNavigator2;
        this.bottomNavigationNavigator = bottomNavigationNavigator2;
        this.searchNavigator = searchNavigator2;
        this.deepLinkView = deepLinkView2;
        this.sharedPreferences = sharedPreferences2;
        this.storeRepository = roomStoreRepository;
        this.navigationTracker = navigationTracker2;
        this.searchAnalytics = searchAnalytics2;
        this.appShortcutsAnalytics = appShortcutsAnalytics2;
        this.accountManager = aptoideAccountManager;
        this.deepLinkAnalytics = deepLinkAnalytics2;
        this.storeAnalytics = storeAnalytics2;
        this.adsRepository = adsRepository2;
        this.appNavigator = appNavigator2;
        this.installManager = installManager2;
        this.newFeature = newFeature2;
        this.themeManager = themeManager2;
        this.themeAnalytics = themeAnalytics2;
        this.readyToInstallNotificationManager = readyToInstallNotificationManager2;
    }

    /* renamed from: a */
    static /* synthetic */ List m7529a(List list, Object obj) {
        return list;
    }

    private void appViewDeepLink(String str) {
        this.appNavigator.navigateWithMd5(str);
    }

    private void appViewDeepLinkAutoInstall(long j, String str) {
        this.appNavigator.navigateWithAppId(j, str, AppViewFragment.OpenType.OPEN_AND_INSTALL, "");
    }

    private void appViewDeepLinkUname(String str) {
        this.appNavigator.navigateWithUname(str);
    }

    private void appcAdsDeepLink() {
        this.fragmentNavigator.navigateTo(EarnAppcListFragment.Companion.newInstance("Earn AppCoins Credits", "appcoins-ads"), true);
    }

    private void appcInfoDeepLink() {
        this.fragmentNavigator.navigateTo(AppCoinsInfoFragment.newInstance(false), true);
    }

    /* renamed from: b */
    static /* synthetic */ String m7533b(String str, GetStoreMeta getStoreMeta) {
        return str;
    }

    /* renamed from: b */
    static /* synthetic */ void m7534b(Throwable th) {
        Logger instance = Logger.getInstance();
        String str = TAG;
        instance.mo12979e(str, "newrepoDeepLink: " + th);
        CrashReport.getInstance().log(th);
    }

    /* renamed from: c */
    static /* synthetic */ void m7535c(Throwable th) {
        Logger instance = Logger.getInstance();
        String str = TAG;
        instance.mo12979e(str, "pickAppDeepLink: " + th);
    }

    private void downloadNotificationDeepLink() {
        this.deepLinkAnalytics.downloadingUpdates();
        this.bottomNavigationNavigator.navigateToApps();
    }

    private void editorialDeepLinkFromCardId(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("cardId", str);
        EditorialFragment editorialFragment = new EditorialFragment();
        editorialFragment.setArguments(bundle);
        this.fragmentNavigator.navigateTo(editorialFragment, true);
    }

    private void editorialDeepLinkFromSlug(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("slug", str);
        EditorialFragment editorialFragment = new EditorialFragment();
        editorialFragment.setArguments(bundle);
        this.fragmentNavigator.navigateTo(editorialFragment, true);
    }

    private void fromHomeDeepLink() {
        this.bottomNavigationNavigator.navigateToHome();
    }

    private void genericDeepLink(Uri uri) {
        Event event = new Event();
        String queryParameter = uri.getQueryParameter("type");
        String queryParameter2 = uri.getQueryParameter("layout");
        String queryParameter3 = uri.getQueryParameter("name");
        String queryParameter4 = uri.getQueryParameter("action");
        if (validateDeepLinkRequiredArgs(queryParameter, queryParameter2, queryParameter3, queryParameter4)) {
            try {
                String decode = URLDecoder.decode(queryParameter4, "UTF-8");
                event.setAction(decode != null ? decode.replace(C2185V7.getHost(this.sharedPreferences), "") : null);
                event.setType(Event.Type.valueOf(queryParameter));
                event.setName(Event.Name.valueOf(queryParameter3));
                GetStoreWidgets.WSWidget.Data data = new GetStoreWidgets.WSWidget.Data();
                data.setLayout(Layout.valueOf(queryParameter2));
                event.setData(data);
                this.fragmentNavigator.navigateTo(AptoideApplication.getFragmentProvider().newStoreTabGridRecyclerFragment(event, uri.getQueryParameter("title"), uri.getQueryParameter(DeepLinkIntentReceiver.DeepLinksKeys.STORE_THEME), "", StoreContext.home, true, true), true);
            } catch (UnsupportedEncodingException | IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
    }

    private AppViewFragment.OpenType getOpenType(String str) {
        if (str == null) {
            return AppViewFragment.OpenType.OPEN_ONLY;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -2033901212:
                if (str.equals("open_with_install_popup")) {
                    c = 1;
                    break;
                }
                break;
            case -534321986:
                if (str.equals("open_and_install")) {
                    c = 0;
                    break;
                }
                break;
            case 1546195073:
                if (str.equals("open_only")) {
                    c = 4;
                    break;
                }
                break;
            case 2132954296:
                if (str.equals("apkfy_install_popup")) {
                    c = 2;
                    break;
                }
                break;
        }
        if (c == 0) {
            return AppViewFragment.OpenType.OPEN_AND_INSTALL;
        }
        if (c == 1) {
            return AppViewFragment.OpenType.OPEN_WITH_INSTALL_POPUP;
        }
        if (c != 2) {
            return AppViewFragment.OpenType.OPEN_ONLY;
        }
        return AppViewFragment.OpenType.APK_FY_INSTALL_POPUP;
    }

    private void goToAppsDownloadsSection() {
        this.bottomNavigationNavigator.navigateToApps();
    }

    private void myStoreDeepLink() {
        this.subscriptions.mo18721a(this.accountManager.accountStatus().mo18669c().mo18694j(C4645l0.f7898f).mo18644a(C5376a.m10346b()).mo18655a(new C4703v0(this), (C5378b<Throwable>) C4711z0.f7986f));
    }

    private C5328b navigateToStores() {
        BottomNavigationNavigator bottomNavigationNavigator2 = this.bottomNavigationNavigator;
        bottomNavigationNavigator2.getClass();
        return C5328b.m10169d(new C4589b1(bottomNavigationNavigator2));
    }

    private void newRepoDeepLink(Intent intent, ArrayList<String> arrayList, RoomStoreRepository roomStoreRepository) {
        if (arrayList != null) {
            this.subscriptions.mo18721a(C5368e.m10234a(arrayList).mo18687f(new C4653p0(this, roomStoreRepository)).mo18698l().mo18687f(new C4651o0(this, roomStoreRepository)).mo18655a(C4697s0.f7970f, (C5378b<Throwable>) C4699t0.f7972f));
            intent.removeExtra(DeepLinkIntentReceiver.DeepLinksTargets.NEW_REPO);
        }
    }

    private void newUpdatesDeepLink() {
        this.deepLinkAnalytics.newUpdatesNotification();
        this.bottomNavigationNavigator.navigateToApps();
    }

    private C5328b openStore(RoomStore roomStore) {
        return C5328b.m10169d(new C4655q0(this, roomStore));
    }

    private void openUserProfile(long j) {
        this.fragmentNavigator.navigateTo(StoreFragment.newInstance(j, BuildConfig.APTOIDE_THEME, StoreFragment.OpenType.GetHome), true);
    }

    private void pauseDownloadFromNotification(String str) {
        this.installManager.pauseInstall(str).mo18609d();
    }

    private void pickAppDeeplink() {
        this.subscriptions.mo18721a(this.adsRepository.getAdForShortcut().mo18655a(new C4643k0(this), (C5378b<Throwable>) C4705w0.f7978f));
    }

    private void promotionalDeeplink(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("cardId", str);
        EditorialFragment editorialFragment = new EditorialFragment();
        editorialFragment.setArguments(bundle);
        this.fragmentNavigator.navigateTo(editorialFragment, true);
    }

    private void promotionsDeepLink() {
        this.fragmentNavigator.navigateTo(new PromotionsFragment(), true);
    }

    private void searchDeepLink(String str, boolean z) {
        this.bottomNavigationNavigator.navigateToSearch(this.searchNavigator.resolveFragment(new SearchQueryModel(str, str, Source.DEEPLINK)));
        if (str != null && !str.isEmpty()) {
            this.searchAnalytics.searchStart(SearchSource.DEEP_LINK, false);
        } else if (z) {
            this.searchAnalytics.searchStart(SearchSource.SHORTCUT, false);
            this.appShortcutsAnalytics.shortcutNavigation(SearchAnalytics.SEARCH);
        } else {
            this.searchAnalytics.searchStart(SearchSource.WIDGET, false);
        }
    }

    private void sendFeatureAction(String str, String str2) {
        if (str.equals(this.newFeature.getId()) && str2.equals(this.newFeature.getActionId())) {
            this.themeManager.setThemeOption(ThemeManager.ThemeOption.DARK);
            this.themeManager.resetToBaseTheme();
            this.themeAnalytics.setDarkThemeUserProperty(this.themeManager.getDarkThemeMode());
        }
    }

    private boolean validateDeepLinkRequiredArgs(String str, String str2, String str3, String str4) {
        return !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4) && StoreTabFragmentChooser.validateAcceptedName(Event.Name.valueOf(str3));
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo15168a(RoomStoreRepository roomStoreRepository, String str) {
        return StoreUtils.isSubscribedStore(str, roomStoreRepository).mo18567c().mo18644a(C5376a.m10346b()).mo18687f(new C4709y0(this, str)).mo18694j(new C4649n0(str));
    }

    public void freeSubscriptions() {
        if (this.subscriptions.mo18723b() && !this.subscriptions.isUnsubscribed()) {
            this.subscriptions.unsubscribe();
        }
    }

    public boolean showDeepLink(Intent intent) {
        if (intent.hasExtra(DeepLinkIntentReceiver.DeepLinksTargets.APP_VIEW_FRAGMENT)) {
            if (intent.getBooleanExtra(DeepLinkIntentReceiver.DeepLinksKeys.FROM_NOTIFICATION_READY_TO_INSTALL, false)) {
                this.readyToInstallNotificationManager.setIsNotificationDisplayed(false);
                appViewDeepLinkAutoInstall(intent.getLongExtra("appId", -1), intent.getStringExtra("packageName"));
            } else if (intent.hasExtra("md5")) {
                appViewDeepLink(intent.getStringExtra("md5"));
            } else if (intent.hasExtra("appId")) {
                appViewDeepLink(intent.getLongExtra("appId", -1), intent.getStringExtra("packageName"), true, intent.getBooleanExtra(DeepLinkIntentReceiver.DeepLinksKeys.APK_FY, false), intent.getStringExtra(DeepLinkIntentReceiver.DeepLinksKeys.OEM_ID_KEY));
            } else if (intent.hasExtra("packageName")) {
                appViewDeepLink(intent.getStringExtra("packageName"), intent.getStringExtra("storeName"), intent.getStringExtra(DeepLinkIntentReceiver.DeepLinksKeys.OPEN_TYPE));
            } else if (intent.hasExtra(DeepLinkIntentReceiver.DeepLinksKeys.UNAME)) {
                appViewDeepLinkUname(intent.getStringExtra(DeepLinkIntentReceiver.DeepLinksKeys.UNAME));
            }
        } else if (intent.hasExtra(DeepLinkIntentReceiver.DeepLinksTargets.SEARCH_FRAGMENT)) {
            searchDeepLink(intent.getStringExtra("query"), intent.getBooleanExtra(DeepLinkIntentReceiver.FROM_SHORTCUT, false));
        } else if (intent.hasExtra(DeepLinkIntentReceiver.DeepLinksTargets.NEW_REPO)) {
            newRepoDeepLink(intent, intent.getExtras().getStringArrayList(DeepLinkIntentReceiver.DeepLinksTargets.NEW_REPO), this.storeRepository);
        } else if (intent.hasExtra(DeepLinkIntentReceiver.DeepLinksTargets.FROM_DOWNLOAD_NOTIFICATION)) {
            downloadNotificationDeepLink();
        } else if (intent.hasExtra(DeepLinkIntentReceiver.DeepLinksTargets.HOME_DEEPLINK)) {
            fromHomeDeepLink();
        } else if (intent.hasExtra(DeepLinkIntentReceiver.DeepLinksTargets.NEW_UPDATES)) {
            newUpdatesDeepLink();
        } else if (intent.hasExtra(DeepLinkIntentReceiver.DeepLinksTargets.APPS)) {
            if (intent.getBooleanExtra(DeepLinkIntentReceiver.DeepLinksKeys.FROM_NOTIFICATION_READY_TO_INSTALL, false)) {
                this.readyToInstallNotificationManager.setIsNotificationDisplayed(false);
                goToAppsDownloadsSection();
            }
        } else if (intent.hasExtra(DeepLinkIntentReceiver.DeepLinksTargets.GENERIC_DEEPLINK)) {
            genericDeepLink((Uri) intent.getParcelableExtra(DeepLinkIntentReceiver.DeepLinksKeys.URI));
        } else if (intent.hasExtra(DeepLinkIntentReceiver.DeepLinksTargets.USER_DEEPLINK)) {
            openUserProfile(intent.getLongExtra(DeepLinkIntentReceiver.DeepLinksTargets.USER_DEEPLINK, -1));
        } else if (intent.hasExtra(DeepLinkIntentReceiver.DeepLinksTargets.MY_STORE_DEEPLINK)) {
            myStoreDeepLink();
        } else if (intent.hasExtra(DeepLinkIntentReceiver.DeepLinksTargets.PICK_APP_DEEPLINK)) {
            pickAppDeeplink();
        } else if (intent.hasExtra(DeepLinkIntentReceiver.DeepLinksTargets.PROMOTIONS_DEEPLINK)) {
            promotionsDeepLink();
        } else if (intent.hasExtra(DeepLinkIntentReceiver.DeepLinksTargets.EDITORIAL_DEEPLINK)) {
            String stringExtra = intent.getStringExtra("cardId");
            String stringExtra2 = intent.getStringExtra("slug");
            if (stringExtra != null) {
                editorialDeepLinkFromCardId(stringExtra);
            } else if (stringExtra2 != null) {
                editorialDeepLinkFromSlug(stringExtra2);
            }
        } else if (intent.hasExtra(DeepLinkIntentReceiver.DeepLinksTargets.PROMOTIONAL_DEEPLINK)) {
            promotionalDeeplink(intent.getStringExtra("cardId"));
        } else if (intent.hasExtra(DeepLinkIntentReceiver.DeepLinksTargets.APPC_INFO_VIEW)) {
            appcInfoDeepLink();
        } else if (intent.hasExtra(DeepLinkIntentReceiver.DeepLinksTargets.APPC_ADS)) {
            appcAdsDeepLink();
        } else if (!intent.hasExtra(DeepLinkIntentReceiver.DeepLinksTargets.FEATURE)) {
            this.deepLinkAnalytics.launcher();
            return false;
        } else if (intent.hasExtra(DeepLinkIntentReceiver.DeepLinksKeys.f3452ID) && intent.hasExtra("action")) {
            sendFeatureAction(intent.getStringExtra(DeepLinkIntentReceiver.DeepLinksKeys.f3452ID), intent.getStringExtra("action"));
        }
        List<ScreenTagHistory> historyList = this.navigationTracker.getHistoryList();
        if (historyList == null || historyList.size() <= 0 || !historyList.get(historyList.size() - 1).getFragment().equals("Notification")) {
            this.navigationTracker.registerScreen(ScreenTagHistory.Builder.build(DEEPLINK_KEY));
        } else {
            this.navigationTracker.registerScreen(ScreenTagHistory.Builder.build("Notification"));
        }
        return true;
    }

    private void appViewDeepLink(long j, String str, boolean z, boolean z2, String str2) {
        AppViewFragment.OpenType openType;
        if (z2) {
            openType = AppViewFragment.OpenType.APK_FY_INSTALL_POPUP;
        } else if (z) {
            openType = AppViewFragment.OpenType.OPEN_WITH_INSTALL_POPUP;
        } else {
            openType = AppViewFragment.OpenType.OPEN_ONLY;
        }
        this.appNavigator.navigateWithAppId(j, str, openType, "", str2, false);
    }

    /* renamed from: b */
    static /* synthetic */ Account m7532b(Account account) {
        if (account.isLoggedIn()) {
            return account;
        }
        return null;
    }

    private void appViewDeepLink(String str, String str2, String str3) {
        this.appNavigator.navigateWithPackageAndStoreNames(str, str2, getOpenType(str3));
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo15170a(String str, Boolean bool) {
        if (bool.booleanValue()) {
            return C5368e.m10240a(new C4701u0(this));
        }
        return this.storeUtilsProxy.subscribeStoreObservable(str).mo18664b(new C4647m0(this, str));
    }

    /* renamed from: a */
    public /* synthetic */ GetStoreMeta mo15167a() throws Exception {
        this.deepLinkView.showStoreAlreadyAdded();
        return null;
    }

    /* renamed from: a */
    public /* synthetic */ void mo15175a(String str, GetStoreMeta getStoreMeta) {
        this.deepLinkView.showStoreFollowed(str);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo15169a(RoomStoreRepository roomStoreRepository, List list) {
        if (list.size() == 1) {
            return roomStoreRepository.get((String) list.get(0)).mo18568c(new C4707x0(this, list));
        }
        return navigateToStores().mo18610e().mo18694j(new C4657r0(list));
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo15171a(List list, RoomStore roomStore) {
        return openStore(roomStore).mo18593a(C5368e.m10257c(list));
    }

    /* renamed from: a */
    public /* synthetic */ void mo15174a(RoomStore roomStore) {
        this.fragmentNavigator.navigateTo(AptoideApplication.getFragmentProvider().newStoreFragment(roomStore.getStoreName(), roomStore.getTheme()), true);
    }

    /* renamed from: a */
    public /* synthetic */ void mo15172a(Account account) {
        if (account != null) {
            this.appShortcutsAnalytics.shortcutNavigation("My_Store");
            if (!account.hasStore()) {
                this.fragmentNavigator.navigateTo(ManageStoreFragment.newInstance(new ManageStoreViewModel(), true), true);
                return;
            }
            this.storeAnalytics.sendStoreOpenEvent(APP_SHORTCUT, account.getStore().getName(), false);
            this.fragmentNavigator.navigateTo(StoreFragment.newInstance(account.getStore().getName(), account.getStore().getTheme(), StoreFragment.OpenType.GetHome), true);
            return;
        }
        this.appShortcutsAnalytics.shortcutNavigation("My_Store_Not_Logged_In");
        this.bottomNavigationNavigator.navigateToStore();
    }

    /* renamed from: a */
    static /* synthetic */ void m7530a(Throwable th) {
        Logger instance = Logger.getInstance();
        String str = TAG;
        instance.mo12979e(str, "myStoreDeepLink: " + th);
    }

    /* renamed from: a */
    public /* synthetic */ void mo15173a(MinimalAd minimalAd) {
        appViewDeepLink(minimalAd.getAppId(), minimalAd.getPackageName(), false, false, (String) null);
    }
}
