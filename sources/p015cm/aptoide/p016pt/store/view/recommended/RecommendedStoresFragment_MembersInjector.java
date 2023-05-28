package p015cm.aptoide.p016pt.store.view.recommended;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.p016pt.install.AptoideInstalledAppsRepository;
import p015cm.aptoide.p016pt.store.RoomStoreRepository;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p015cm.aptoide.p016pt.store.StoreUtilsProxy;
import p015cm.aptoide.p016pt.store.view.StoreTabGridRecyclerFragment_MembersInjector;
import p015cm.aptoide.p016pt.store.view.StoreTabWidgetsGridRecyclerFragment_MembersInjector;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.store.view.recommended.RecommendedStoresFragment_MembersInjector */
public final class RecommendedStoresFragment_MembersInjector implements C10822a<RecommendedStoresFragment> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<AptoideInstalledAppsRepository> aptoideInstalledAppsRepositoryProvider;
    private final Provider<String> marketNameProvider;
    private final Provider<StoreCredentialsProvider> storeCredentialsProvider;
    private final Provider<RoomStoreRepository> storeRepositoryProvider;
    private final Provider<StoreUtilsProxy> storeUtilsProxyProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public RecommendedStoresFragment_MembersInjector(Provider<RoomStoreRepository> provider, Provider<String> provider2, Provider<StoreUtilsProxy> provider3, Provider<AptoideInstalledAppsRepository> provider4, Provider<AnalyticsManager> provider5, Provider<ThemeManager> provider6, Provider<StoreCredentialsProvider> provider7) {
        this.storeRepositoryProvider = provider;
        this.marketNameProvider = provider2;
        this.storeUtilsProxyProvider = provider3;
        this.aptoideInstalledAppsRepositoryProvider = provider4;
        this.analyticsManagerProvider = provider5;
        this.themeManagerProvider = provider6;
        this.storeCredentialsProvider = provider7;
    }

    public static C10822a<RecommendedStoresFragment> create(Provider<RoomStoreRepository> provider, Provider<String> provider2, Provider<StoreUtilsProxy> provider3, Provider<AptoideInstalledAppsRepository> provider4, Provider<AnalyticsManager> provider5, Provider<ThemeManager> provider6, Provider<StoreCredentialsProvider> provider7) {
        return new RecommendedStoresFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static void injectStoreCredentialsProvider(RecommendedStoresFragment recommendedStoresFragment, StoreCredentialsProvider storeCredentialsProvider2) {
        recommendedStoresFragment.storeCredentialsProvider = storeCredentialsProvider2;
    }

    public static void injectStoreRepository(RecommendedStoresFragment recommendedStoresFragment, RoomStoreRepository roomStoreRepository) {
        recommendedStoresFragment.storeRepository = roomStoreRepository;
    }

    public static void injectStoreUtilsProxy(RecommendedStoresFragment recommendedStoresFragment, StoreUtilsProxy storeUtilsProxy) {
        recommendedStoresFragment.storeUtilsProxy = storeUtilsProxy;
    }

    public void injectMembers(RecommendedStoresFragment recommendedStoresFragment) {
        StoreTabGridRecyclerFragment_MembersInjector.injectStoreRepository(recommendedStoresFragment, this.storeRepositoryProvider.get());
        StoreTabGridRecyclerFragment_MembersInjector.injectMarketName(recommendedStoresFragment, this.marketNameProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreUtilsProxy(recommendedStoresFragment, this.storeUtilsProxyProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectAptoideInstalledAppsRepository(recommendedStoresFragment, this.aptoideInstalledAppsRepositoryProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectAnalyticsManager(recommendedStoresFragment, this.analyticsManagerProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectMarketName(recommendedStoresFragment, this.marketNameProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectThemeManager(recommendedStoresFragment, this.themeManagerProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreCredentialsProvider(recommendedStoresFragment, this.storeCredentialsProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreRepository(recommendedStoresFragment, this.storeRepositoryProvider.get());
        injectStoreCredentialsProvider(recommendedStoresFragment, this.storeCredentialsProvider.get());
        injectStoreRepository(recommendedStoresFragment, this.storeRepositoryProvider.get());
        injectStoreUtilsProxy(recommendedStoresFragment, this.storeUtilsProxyProvider.get());
    }
}
