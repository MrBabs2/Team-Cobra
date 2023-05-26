package p015cm.aptoide.p016pt.store.view;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.p016pt.install.AptoideInstalledAppsRepository;
import p015cm.aptoide.p016pt.store.RoomStoreRepository;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p015cm.aptoide.p016pt.store.StoreUtilsProxy;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.store.view.StoreTabWidgetsGridRecyclerFragment_MembersInjector */
public final class StoreTabWidgetsGridRecyclerFragment_MembersInjector implements C10822a<StoreTabWidgetsGridRecyclerFragment> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<AptoideInstalledAppsRepository> aptoideInstalledAppsRepositoryProvider;
    private final Provider<String> marketNameProvider;
    private final Provider<StoreCredentialsProvider> storeCredentialsProvider;
    private final Provider<RoomStoreRepository> storeRepositoryProvider;
    private final Provider<StoreUtilsProxy> storeUtilsProxyProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public StoreTabWidgetsGridRecyclerFragment_MembersInjector(Provider<RoomStoreRepository> provider, Provider<String> provider2, Provider<StoreUtilsProxy> provider3, Provider<AptoideInstalledAppsRepository> provider4, Provider<AnalyticsManager> provider5, Provider<ThemeManager> provider6, Provider<StoreCredentialsProvider> provider7) {
        this.storeRepositoryProvider = provider;
        this.marketNameProvider = provider2;
        this.storeUtilsProxyProvider = provider3;
        this.aptoideInstalledAppsRepositoryProvider = provider4;
        this.analyticsManagerProvider = provider5;
        this.themeManagerProvider = provider6;
        this.storeCredentialsProvider = provider7;
    }

    public static C10822a<StoreTabWidgetsGridRecyclerFragment> create(Provider<RoomStoreRepository> provider, Provider<String> provider2, Provider<StoreUtilsProxy> provider3, Provider<AptoideInstalledAppsRepository> provider4, Provider<AnalyticsManager> provider5, Provider<ThemeManager> provider6, Provider<StoreCredentialsProvider> provider7) {
        return new StoreTabWidgetsGridRecyclerFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static void injectAnalyticsManager(StoreTabWidgetsGridRecyclerFragment storeTabWidgetsGridRecyclerFragment, AnalyticsManager analyticsManager) {
        storeTabWidgetsGridRecyclerFragment.analyticsManager = analyticsManager;
    }

    public static void injectAptoideInstalledAppsRepository(StoreTabWidgetsGridRecyclerFragment storeTabWidgetsGridRecyclerFragment, AptoideInstalledAppsRepository aptoideInstalledAppsRepository) {
        storeTabWidgetsGridRecyclerFragment.aptoideInstalledAppsRepository = aptoideInstalledAppsRepository;
    }

    public static void injectMarketName(StoreTabWidgetsGridRecyclerFragment storeTabWidgetsGridRecyclerFragment, String str) {
        storeTabWidgetsGridRecyclerFragment.marketName = str;
    }

    public static void injectStoreCredentialsProvider(StoreTabWidgetsGridRecyclerFragment storeTabWidgetsGridRecyclerFragment, StoreCredentialsProvider storeCredentialsProvider2) {
        storeTabWidgetsGridRecyclerFragment.storeCredentialsProvider = storeCredentialsProvider2;
    }

    public static void injectStoreRepository(StoreTabWidgetsGridRecyclerFragment storeTabWidgetsGridRecyclerFragment, RoomStoreRepository roomStoreRepository) {
        storeTabWidgetsGridRecyclerFragment.storeRepository = roomStoreRepository;
    }

    public static void injectStoreUtilsProxy(StoreTabWidgetsGridRecyclerFragment storeTabWidgetsGridRecyclerFragment, StoreUtilsProxy storeUtilsProxy) {
        storeTabWidgetsGridRecyclerFragment.storeUtilsProxy = storeUtilsProxy;
    }

    public static void injectThemeManager(StoreTabWidgetsGridRecyclerFragment storeTabWidgetsGridRecyclerFragment, ThemeManager themeManager) {
        storeTabWidgetsGridRecyclerFragment.themeManager = themeManager;
    }

    public void injectMembers(StoreTabWidgetsGridRecyclerFragment storeTabWidgetsGridRecyclerFragment) {
        StoreTabGridRecyclerFragment_MembersInjector.injectStoreRepository(storeTabWidgetsGridRecyclerFragment, this.storeRepositoryProvider.get());
        StoreTabGridRecyclerFragment_MembersInjector.injectMarketName(storeTabWidgetsGridRecyclerFragment, this.marketNameProvider.get());
        injectStoreUtilsProxy(storeTabWidgetsGridRecyclerFragment, this.storeUtilsProxyProvider.get());
        injectAptoideInstalledAppsRepository(storeTabWidgetsGridRecyclerFragment, this.aptoideInstalledAppsRepositoryProvider.get());
        injectAnalyticsManager(storeTabWidgetsGridRecyclerFragment, this.analyticsManagerProvider.get());
        injectMarketName(storeTabWidgetsGridRecyclerFragment, this.marketNameProvider.get());
        injectThemeManager(storeTabWidgetsGridRecyclerFragment, this.themeManagerProvider.get());
        injectStoreCredentialsProvider(storeTabWidgetsGridRecyclerFragment, this.storeCredentialsProvider.get());
        injectStoreRepository(storeTabWidgetsGridRecyclerFragment, this.storeRepositoryProvider.get());
    }
}
