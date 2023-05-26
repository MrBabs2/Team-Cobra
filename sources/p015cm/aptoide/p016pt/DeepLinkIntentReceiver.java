package p015cm.aptoide.p016pt;

import android.content.Intent;
import android.content.UriMatcher;
import android.content.pm.ShortcutManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.dataprovider.BuildConfig;
import p015cm.aptoide.p016pt.dataprovider.WebService;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilitySettingsProvider;
import p015cm.aptoide.p016pt.dataprovider.exception.AptoideWsV7Exception;
import p015cm.aptoide.p016pt.dataprovider.exception.NoNetworkConnectionException;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetApp;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.GetAppRequest;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;
import p015cm.aptoide.p016pt.downloadmanager.Constants;
import p015cm.aptoide.p016pt.link.AptoideInstall;
import p015cm.aptoide.p016pt.link.AptoideInstallParser;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.notification.ReadyToInstallNotificationManager;
import p015cm.aptoide.p016pt.reviews.RateAndReviewsFragment;
import p015cm.aptoide.p016pt.store.StoreUtils;
import p015cm.aptoide.p016pt.themes.NewFeature;
import p015cm.aptoide.p016pt.timeline.view.follow.TimeLineFollowFragment;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.utils.design.ShowMessage;
import p015cm.aptoide.p016pt.view.ActivityView;
import p015cm.aptoide.p016pt.wallet.WalletInstallActivity;

/* renamed from: cm.aptoide.pt.DeepLinkIntentReceiver */
public class DeepLinkIntentReceiver extends ActivityView {
    public static final String AUTHORITY = "cm.aptoide.pt";
    public static final int DEEPLINK_ID = 1;
    public static final String DEEP_LINK = "deeplink";
    public static final String FROM_SHORTCUT = "from_shortcut";
    public static final String SCHEDULE_DOWNLOADS = "schedule_downloads";
    public static final int SCHEDULE_DOWNLOADS_ID = 2;
    private static final String TAG = DeepLinkIntentReceiver.class.getSimpleName();
    private static final UriMatcher sURIMatcher;
    private AnalyticsManager analyticsManager;
    private DeepLinkAnalytics deepLinkAnalytics;
    private NavigationTracker navigationTracker;
    private NewFeature newFeature;
    private boolean shortcutNavigation;
    private final Class startClass = AptoideApplication.getActivityProvider().getMainActivityFragmentClass();

    /* renamed from: cm.aptoide.pt.DeepLinkIntentReceiver$DeepLinksKeys */
    public static class DeepLinksKeys {
        public static final String ACTION = "action";
        public static final String APK_FY = "APK_FY";
        public static final String APP_ID_KEY = "appId";
        public static final String APP_MD5_KEY = "md5";
        public static final String AUTH_TOKEN = "auth_token";
        public static final String CARD_ID = "cardId";
        public static final String FROM_NOTIFICATION_READY_TO_INSTALL = "notification_ready_to_install";

        /* renamed from: ID */
        public static final String f3452ID = "id";
        public static final String LAYOUT = "layout";
        public static final String NAME = "name";
        public static final String OEM_ID_KEY = "oemId";
        public static final String OPEN_TYPE = "open_type";
        public static final String PACKAGE_NAME_KEY = "packageName";
        public static final String SLUG = "slug";
        public static final String STORENAME_KEY = "storeName";
        public static final String STORE_THEME = "storetheme";
        public static final String TITLE = "title";
        public static final String TYPE = "type";
        public static final String UNAME = "uname";
        public static final String URI = "uri";
        public static final String WALLET_PACKAGE_NAME_KEY = "wallet_package_name";
    }

    /* renamed from: cm.aptoide.pt.DeepLinkIntentReceiver$DeepLinksTargets */
    public static class DeepLinksTargets {
        public static final String APPC_ADS = "appc_ads";
        public static final String APPC_INFO_VIEW = "appc_info_view";
        public static final String APPS = "apps";
        public static final String APP_VIEW_FRAGMENT = "appViewFragment";
        public static final String APTOIDE_AUTH = "aptoide_auth";
        public static final String EDITORIAL_DEEPLINK = "editorial";
        public static final String FEATURE = "feature";
        public static final String FROM_AD = "fromAd";
        public static final String FROM_DOWNLOAD_NOTIFICATION = "fromDownloadNotification";
        public static final String GENERIC_DEEPLINK = "generic_deeplink";
        public static final String HOME_DEEPLINK = "home_tab";
        public static final String MY_STORE_DEEPLINK = "my_store";
        public static final String NEW_REPO = "newrepo";
        public static final String NEW_UPDATES = "new_updates";
        public static final String PICK_APP_DEEPLINK = "pick_app_deeplink";
        public static final String PROMOTIONAL_DEEPLINK = "promotional";
        public static final String PROMOTIONS_DEEPLINK = "promotions";
        public static final String SEARCH_FRAGMENT = "searchFragment";
        public static final String TIMELINE_DEEPLINK = "apps_timeline";
        public static final String USER_DEEPLINK = "open_user_profile";
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        sURIMatcher = uriMatcher;
        uriMatcher.addURI("cm.aptoide.pt", DEEP_LINK, 1);
        sURIMatcher.addURI("cm.aptoide.pt", SCHEDULE_DOWNLOADS, 2);
    }

    private Intent dealWithAptoideAuthentication(String str) {
        return parseAptoideAuthUri(str.split("app.aptoide.com/auth/code/")[1].split("/")[0]);
    }

    private Intent dealWithAptoideRepo(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str.substring(14));
        return startWithRepo(StoreUtils.split((List<String>) arrayList));
    }

    private Intent dealWithAptoideSchema(Uri uri) {
        if ("getHome".equals(uri.getQueryParameter("name"))) {
            String queryParameter = uri.getQueryParameter(TimeLineFollowFragment.BundleKeys.USER_ID);
            if (queryParameter != null) {
                return openUserScreen(Long.valueOf(queryParameter));
            }
            return null;
        } else if ("getUserTimeline".equals(uri.getQueryParameter("name"))) {
            return startFromAppsTimeline(uri.getQueryParameter("cardId"));
        } else {
            if ("search".equals(uri.getQueryParameter("name"))) {
                return startFromSearch(uri.getQueryParameterNames().contains("keyword") ? uri.getQueryParameter("keyword") : "");
            } else if ("myStore".equals(uri.getQueryParameter("name"))) {
                return startFromMyStore();
            } else {
                if ("pickApp".equals(uri.getQueryParameter("name"))) {
                    return startFromPickApp();
                }
                if (DeepLinksTargets.PROMOTIONS_DEEPLINK.equals(uri.getQueryParameter("name"))) {
                    return startFromPromotions();
                }
                if ("CURATION_1".equals(uri.getQueryParameter("name")) && uri.getQueryParameter(DeepLinksKeys.f3452ID) != null) {
                    return startFromEditorialCard(uri.getQueryParameter(DeepLinksKeys.f3452ID));
                }
                if ("NEW_APP".equals(uri.getQueryParameter("name")) || "NEW_APP_VERSION".equals(uri.getQueryParameter("name"))) {
                    return startFromHome();
                }
                if (("IN_GAME_EVENT".equals(uri.getQueryParameter("name")) || "NEWS_ITEM".equals(uri.getQueryParameter("name"))) && uri.getQueryParameter(DeepLinksKeys.f3452ID) != null) {
                    return startFromPromotionalCard(uri.getQueryParameter(DeepLinksKeys.f3452ID));
                }
                if (DeepLinksTargets.APPC_INFO_VIEW.equals(uri.getQueryParameter("name"))) {
                    return startAppcInfoView();
                }
                if ("appcoins_ads".equals(uri.getQueryParameter("name"))) {
                    return startFromAppcAds();
                }
                if (sURIMatcher.match(uri) == 1) {
                    return startGenericDeepLink(uri);
                }
                return null;
            }
        }
    }

    private Intent dealWithAptoideWebsite(Uri uri) {
        String str;
        if (uri.getPath() == null || (!uri.getPath().contains("thank-you") && !uri.getPath().contains(DownloadAnalytics.RAKAM_DOWNLOAD_EVENT))) {
            if (uri.getPath() != null && uri.getPath().contains("group")) {
                this.deepLinkAnalytics.websiteFromBundlesWebPage();
                List<String> pathSegments = uri.getPathSegments();
                boolean contains = uri.getPath().contains(AccountAnalytics.STORE);
                String str2 = DeepLinksTargets.APPS;
                if (!contains) {
                    str = uri.getLastPathSegment();
                } else if (pathSegments == null || pathSegments.size() < 4) {
                    str = "";
                } else {
                    str = pathSegments.get(3);
                    str2 = pathSegments.get(1);
                }
                Logger instance = Logger.getInstance();
                String str3 = TAG;
                instance.mo12985v(str3, "aptoide web site: bundle: " + str);
                if (!TextUtils.isEmpty(str)) {
                    try {
                        StringBuilder sb = new StringBuilder();
                        sb.append("aptoide://cm.aptoide.pt/deeplink?name=listApps&layout=GRID&type=API&title=bundle&action=");
                        sb.append(URLEncoder.encode("https://ws75.aptoide.com/api/7/listApps/store_name=" + str2 + "/group_name=" + str + "/limit=30/sort=downloads7d", "utf-8"));
                        sb.append("&storetheme=default");
                        Uri parse = Uri.parse(sb.toString());
                        Logger instance2 = Logger.getInstance();
                        String str4 = TAG;
                        instance2.mo12985v(str4, "aptoide web site: bundle: " + parse.toString());
                        return dealWithAptoideSchema(parse);
                    } catch (Exception e) {
                        Logger.getInstance().mo12980e(TAG, "dealWithAptoideWebsite: ", e);
                        return null;
                    }
                }
            } else if (uri.getPath() != null && uri.getPath().contains(AccountAnalytics.STORE)) {
                this.deepLinkAnalytics.websiteFromStoreWebPage();
                Logger instance3 = Logger.getInstance();
                String str5 = TAG;
                instance3.mo12985v(str5, "aptoide web site: store: " + uri.getLastPathSegment());
                ArrayList arrayList = new ArrayList();
                arrayList.add(uri.getLastPathSegment());
                return startWithRepo(arrayList);
            } else if (uri.getPath() != null && uri.getPath().contains(DeepLinksTargets.EDITORIAL_DEEPLINK)) {
                return startEditorialFromSlug(uri.getPath().split("/")[2]);
            } else {
                if (uri.getPath() != null && uri.getPath().contains("using-appcoins")) {
                    return startAppcInfoView();
                }
                String[] split = uri.getHost().split("\\.");
                if (split != null && split.length == 4) {
                    this.deepLinkAnalytics.websiteFromAppViewWebPage();
                    Logger instance4 = Logger.getInstance();
                    String str6 = TAG;
                    instance4.mo12985v(str6, "aptoide web site: app view: " + split[0]);
                    return startAppView(split[0]);
                } else if (split != null && split.length == 3) {
                    this.deepLinkAnalytics.websiteFromHomeWebPage();
                    Logger instance5 = Logger.getInstance();
                    String str7 = TAG;
                    instance5.mo12985v(str7, "aptoide web site: home: " + split[0]);
                    return startFromHome();
                }
            }
            return null;
        }
        this.deepLinkAnalytics.websiteFromThankYouWebPage();
        String queryParameter = uri.getQueryParameter(RateAndReviewsFragment.BundleCons.APP_ID);
        Logger instance6 = Logger.getInstance();
        String str8 = TAG;
        instance6.mo12985v(str8, "aptoide thank you: app id: " + queryParameter);
        if (!TextUtils.isEmpty(queryParameter)) {
            return parseAptoideInstallUri(queryParameter);
        }
        String queryParameter2 = uri.getQueryParameter("package_uname");
        if (!TextUtils.isEmpty(queryParameter2)) {
            return parseAptoideInstallUri("uname=" + queryParameter2);
        }
        String queryParameter3 = uri.getQueryParameter(Constants.PACKAGE);
        if (TextUtils.isEmpty(queryParameter3)) {
            return null;
        }
        return parseAptoideInstallUri("package=" + queryParameter3);
    }

    private Intent dealWithGoogleHost(Uri uri) {
        String queryParameter = uri.getQueryParameter(DeepLinksKeys.f3452ID);
        if (queryParameter.contains("pname:")) {
            queryParameter = queryParameter.substring(6);
        } else if (queryParameter.contains("pub:")) {
            queryParameter = queryParameter.substring(4);
        }
        return startFromPackageName(queryParameter);
    }

    private Intent dealWithMarketSchema(String str, Uri uri) {
        String str2;
        if ("details".equalsIgnoreCase(uri.getHost())) {
            str2 = uri.getQueryParameter(DeepLinksKeys.f3452ID);
        } else if ("search".equalsIgnoreCase(uri.getHost())) {
            str2 = uri.getQueryParameter("q");
        } else {
            String str3 = str.split("&")[0];
            String[] split = str3.split("=");
            str2 = (split == null || split.length <= 1) ? "" : str3.split("=")[1];
            if (str2.contains("pname:")) {
                str2 = str2.substring(6);
            } else if (str2.contains("pub:")) {
                str2 = str2.substring(4);
            }
        }
        String queryParameter = uri.getQueryParameter("utm_source");
        String queryParameter2 = uri.getQueryParameter("app_source");
        if (queryParameter != null && isFromAppCoins(queryParameter) && "com.appcoins.wallet".equals(str2)) {
            this.deepLinkAnalytics.sendWalletDeepLinkEvent(queryParameter);
            if (queryParameter.equals("appcoinssdk")) {
                return startWalletInstallIntent(str2, queryParameter, queryParameter2);
            }
        }
        return startFromPackageName(str2);
    }

    private void dealWithShortcuts() {
        if (Build.VERSION.SDK_INT >= 25) {
            ShortcutManager shortcutManager = (ShortcutManager) getApplicationContext().getSystemService(ShortcutManager.class);
            Intent intent = getIntent();
            if (intent == null) {
                return;
            }
            if (intent.hasExtra("search")) {
                if (intent.getBooleanExtra("search", false)) {
                    this.shortcutNavigation = true;
                    if (shortcutManager != null) {
                        shortcutManager.reportShortcutUsed("search");
                    }
                }
            } else if (intent.hasExtra("timeline") && intent.getBooleanExtra("timeline", false)) {
                this.shortcutNavigation = true;
                if (shortcutManager != null) {
                    shortcutManager.reportShortcutUsed("timeline");
                }
            }
        }
    }

    private Intent dealWithWebservicesAptoide(String str) {
        Map<String, String> map;
        try {
            map = AptoideUtils.StringU.splitQuery(URI.create(str));
        } catch (UnsupportedEncodingException e) {
            CrashReport.getInstance().log(e);
            map = null;
        }
        if (map != null) {
            String str2 = null;
            for (Map.Entry next : map.entrySet()) {
                if (((String) next.getKey()).equals("uid")) {
                    str2 = (String) next.getValue();
                }
            }
            if (str2 != null) {
                try {
                    return startFromAppView(Long.parseLong(str2), (String) null, "open_with_install_popup", "no_origin");
                } catch (NumberFormatException e2) {
                    CrashReport.getInstance().log(e2);
                    CrashReport.getInstance().log(e2);
                    ShowMessage.asToast(getApplicationContext(), C1086R.string.simple_error_occured + str2);
                }
            }
        }
        return null;
    }

    private boolean isFromAppCoins(String str) {
        return str.equals("myappcoins") || str.equals("appcoinssdk");
    }

    private Intent openUserScreen(Long l) {
        Intent intent = new Intent(this, this.startClass);
        intent.putExtra(DeepLinksTargets.USER_DEEPLINK, l);
        return intent;
    }

    private Intent parseAptoideAuthUri(String str) {
        Intent intent = new Intent(this, this.startClass);
        intent.putExtra(DeepLinksTargets.APTOIDE_AUTH, true);
        intent.putExtra(DeepLinksKeys.AUTH_TOKEN, str);
        intent.setFlags(805306368);
        return intent;
    }

    private Intent parseAptoideInstallUri(String str) {
        AptoideInstall parse = new AptoideInstallParser().parse(str);
        if (parse.getAppId() > 0) {
            return startFromAppView(parse.getAppId(), parse.getPackageName(), parse.getOpenType(), parse.getOrigin());
        } else if (!TextUtils.isEmpty(parse.getUname())) {
            return startAppView(parse.getUname());
        } else {
            return startFromAppview(parse.getStoreName(), parse.getPackageName(), parse.getOpenType(), parse.getOrigin());
        }
    }

    private Intent parseFeatureUri(String str) {
        Intent intent = new Intent(this, this.startClass);
        intent.putExtra(DeepLinksTargets.FEATURE, true);
        if (str.contains("id=" + this.newFeature.getId())) {
            intent.putExtra(DeepLinksKeys.f3452ID, this.newFeature.getId());
            if (str.contains("action=" + this.newFeature.getActionId())) {
                intent.putExtra("action", this.newFeature.getActionId());
            }
        }
        return intent;
    }

    private Intent startAppcInfoView() {
        Intent intent = new Intent(this, this.startClass);
        intent.putExtra(DeepLinksTargets.APPC_INFO_VIEW, true);
        return intent;
    }

    private Intent startEditorialFromSlug(String str) {
        Intent intent = new Intent(this, this.startClass);
        intent.putExtra(DeepLinksTargets.EDITORIAL_DEEPLINK, true);
        intent.putExtra("slug", str);
        return intent;
    }

    private Intent startFromAppcAds() {
        Intent intent = new Intent(this, this.startClass);
        intent.putExtra(DeepLinksTargets.APPC_ADS, true);
        return intent;
    }

    private Intent startFromAppview(String str, String str2, String str3, String str4) {
        Intent intent = new Intent(this, this.startClass);
        intent.putExtra(DeepLinksTargets.APP_VIEW_FRAGMENT, true);
        intent.putExtra("packageName", str2);
        intent.putExtra("storeName", str);
        intent.putExtra(DeepLinksKeys.OPEN_TYPE, str3);
        if (str4 != null && str4.equals(ReadyToInstallNotificationManager.ORIGIN)) {
            intent.putExtra(DeepLinksKeys.FROM_NOTIFICATION_READY_TO_INSTALL, true);
        }
        intent.setFlags(805306368);
        return intent;
    }

    private Intent startFromEditorialCard(String str) {
        Intent intent = new Intent(this, this.startClass);
        intent.putExtra(DeepLinksTargets.EDITORIAL_DEEPLINK, true);
        intent.putExtra("cardId", str);
        return intent;
    }

    private Intent startFromMyStore() {
        Intent intent = new Intent(this, this.startClass);
        intent.putExtra(DeepLinksTargets.MY_STORE_DEEPLINK, true);
        return intent;
    }

    private Intent startFromPickApp() {
        Intent intent = new Intent(this, this.startClass);
        intent.putExtra(DeepLinksTargets.PICK_APP_DEEPLINK, true);
        return intent;
    }

    private Intent startFromPromotionalCard(String str) {
        Intent intent = new Intent(this, this.startClass);
        intent.putExtra(DeepLinksTargets.PROMOTIONAL_DEEPLINK, true);
        intent.putExtra("cardId", str);
        return intent;
    }

    private Intent startFromPromotions() {
        Intent intent = new Intent(this, this.startClass);
        intent.putExtra(DeepLinksTargets.PROMOTIONS_DEEPLINK, true);
        return intent;
    }

    private Intent startGenericDeepLink(Uri uri) {
        Intent intent = new Intent(this, this.startClass);
        intent.putExtra(DeepLinksTargets.GENERIC_DEEPLINK, true);
        intent.putExtra(DeepLinksKeys.URI, uri);
        return intent;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        Uri uri;
        super.onCreate(bundle);
        AptoideApplication aptoideApplication = (AptoideApplication) getApplicationContext();
        this.analyticsManager = aptoideApplication.getAnalyticsManager();
        NavigationTracker navigationTracker2 = aptoideApplication.getNavigationTracker();
        this.navigationTracker = navigationTracker2;
        this.deepLinkAnalytics = new DeepLinkAnalytics(this.analyticsManager, navigationTracker2);
        String dataString = getIntent().getDataString();
        this.shortcutNavigation = false;
        this.newFeature = aptoideApplication.getNewFeature();
        dealWithShortcuts();
        Intent intent = null;
        try {
            uri = Uri.parse(dataString);
        } catch (Exception e) {
            CrashReport.getInstance().log(e);
            uri = null;
        }
        if (!"aptoideauth".equalsIgnoreCase(uri.getScheme())) {
            this.deepLinkAnalytics.website(dataString);
            Logger.getInstance().mo12985v(TAG, "uri: " + dataString);
        }
        if (!(uri == null || uri.getHost() == null)) {
            if (uri.getHost().contains(BuildConfig.APTOIDE_WEB_SERVICES_HOST)) {
                intent = dealWithWebservicesAptoide(dataString);
            } else if (uri.getHost().contains("app.aptoide.com")) {
                intent = dealWithAptoideAuthentication(dataString);
            } else if (uri.getHost().contains("aptoide.com")) {
                intent = dealWithAptoideWebsite(uri);
            } else if ("aptoiderepo".equalsIgnoreCase(uri.getScheme())) {
                intent = dealWithAptoideRepo(dataString);
            } else if ("aptoidesearch".equalsIgnoreCase(uri.getScheme())) {
                intent = startFromPackageName(dataString.split("aptoidesearch://")[1]);
            } else if ("market".equalsIgnoreCase(uri.getScheme())) {
                intent = dealWithMarketSchema(dataString, uri);
            } else if (uri.getHost().contains("market.android.com")) {
                intent = startFromPackageName(uri.getQueryParameter(DeepLinksKeys.f3452ID));
            } else if (uri.getHost().contains("play.google.com") && uri.getPath().contains("store/apps/details")) {
                intent = dealWithGoogleHost(uri);
            } else if ("aptoideinstall".equalsIgnoreCase(uri.getScheme())) {
                intent = parseAptoideInstallUri(dataString.substring(17));
            } else if (uri.getHost().equals("cm.aptoide.pt") && uri.getPath().equals("/deeplink") && "aptoide".equalsIgnoreCase(uri.getScheme())) {
                intent = dealWithAptoideSchema(uri);
            } else if ("aptoidefeature".equalsIgnoreCase(uri.getScheme())) {
                intent = parseFeatureUri(uri.getHost());
            } else if ("aptoideauth".equalsIgnoreCase(uri.getScheme())) {
                intent = parseAptoideAuthUri(dataString.split("aptoideauth://")[1]);
            }
        }
        if (intent != null) {
            startActivity(intent);
        }
        this.deepLinkAnalytics.sendWebsite();
        finish();
    }

    public Intent startAppView(String str) {
        Intent intent = new Intent(this, this.startClass);
        intent.putExtra(DeepLinksTargets.APP_VIEW_FRAGMENT, true);
        intent.putExtra(DeepLinksKeys.UNAME, str);
        return intent;
    }

    public Intent startFromAppView(long j, String str, String str2, String str3) {
        Intent intent = new Intent(this, this.startClass);
        intent.putExtra(DeepLinksTargets.APP_VIEW_FRAGMENT, true);
        intent.putExtra("appId", j);
        intent.putExtra("packageName", str);
        intent.putExtra(DeepLinksKeys.OPEN_TYPE, str2);
        if (str3 != null && str3.equals(ReadyToInstallNotificationManager.ORIGIN)) {
            intent.putExtra(DeepLinksKeys.FROM_NOTIFICATION_READY_TO_INSTALL, true);
        }
        return intent;
    }

    public Intent startFromAppsTimeline(String str) {
        Intent intent = new Intent(this, this.startClass);
        intent.putExtra(DeepLinksTargets.TIMELINE_DEEPLINK, true);
        intent.putExtra("cardId", str);
        boolean z = this.shortcutNavigation;
        if (z) {
            intent.putExtra(FROM_SHORTCUT, z);
        }
        return intent;
    }

    public Intent startFromHome() {
        Intent intent = new Intent(this, this.startClass);
        intent.putExtra(DeepLinksTargets.HOME_DEEPLINK, true);
        return intent;
    }

    public Intent startFromPackageName(String str) {
        GetApp getApp;
        if (str != null) {
            try {
                getApp = (GetApp) GetAppRequest.m5252of(str, ((AptoideApplication) getApplicationContext()).getAccountSettingsBodyInterceptorPoolV7(), ((AptoideApplication) getApplicationContext()).getDefaultClient(), WebService.getDefaultConverter(), ((AptoideApplication) getApplicationContext()).getTokenInvalidator(), ((AptoideApplication) getApplicationContext()).getDefaultSharedPreferences(), new AppBundlesVisibilityManager(AptoideUtils.isMIUIwithAABFix(), AptoideUtils.isDeviceMIUI(), new AppBundlesVisibilitySettingsProvider(((AptoideApplication) getApplicationContext()).getDefaultSharedPreferences()))).observe().mo18695j().mo41034a();
            } catch (NoNetworkConnectionException unused) {
                return startFromHome();
            } catch (AptoideWsV7Exception unused2) {
                return startFromSearch(str);
            }
        } else {
            getApp = null;
        }
        if (getApp == null || !getApp.isOk()) {
            return startFromSearch(str);
        }
        return startFromAppView(str);
    }

    public Intent startFromSearch(String str) {
        Intent intent = new Intent(this, this.startClass);
        intent.putExtra(DeepLinksTargets.SEARCH_FRAGMENT, true);
        intent.putExtra("query", str);
        intent.putExtra(FROM_SHORTCUT, this.shortcutNavigation);
        return intent;
    }

    public Intent startWalletInstallIntent(String str, String str2, String str3) {
        Intent intent = new Intent(this, WalletInstallActivity.class);
        intent.putExtra(DeepLinksKeys.WALLET_PACKAGE_NAME_KEY, str);
        intent.putExtra("packageName", str3);
        intent.setFlags(268435456);
        return intent;
    }

    public Intent startWithRepo(ArrayList<String> arrayList) {
        Intent intent = new Intent(this, this.startClass);
        intent.putExtra(DeepLinksTargets.NEW_REPO, arrayList);
        this.deepLinkAnalytics.newRepo();
        return intent;
    }

    public Intent startFromAppView(String str) {
        Intent intent = new Intent(this, this.startClass);
        intent.putExtra(DeepLinksTargets.APP_VIEW_FRAGMENT, true);
        intent.putExtra("packageName", str);
        return intent;
    }
}
