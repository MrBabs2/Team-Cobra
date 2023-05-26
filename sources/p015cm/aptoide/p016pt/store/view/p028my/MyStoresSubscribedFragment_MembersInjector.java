package p015cm.aptoide.p016pt.store.view.p028my;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.install.AptoideInstalledAppsRepository;
import p015cm.aptoide.p016pt.store.RoomStoreRepository;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p015cm.aptoide.p016pt.store.StoreUtilsProxy;
import p015cm.aptoide.p016pt.store.view.StoreTabGridRecyclerFragment_MembersInjector;
import p015cm.aptoide.p016pt.store.view.StoreTabWidgetsGridRecyclerFragment_MembersInjector;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.store.view.my.MyStoresSubscribedFragment_MembersInjector */
public final class MyStoresSubscribedFragment_MembersInjector implements C10822a<MyStoresSubscribedFragment> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<AptoideInstalledAppsRepository> aptoideInstalledAppsRepositoryProvider;
    private final Provider<String> marketNameProvider;
    private final Provider<NavigationTracker> navigationTrackerProvider;
    private final Provider<StoreCredentialsProvider> storeCredentialsProvider;
    private final Provider<RoomStoreRepository> storeRepositoryProvider;
    private final Provider<StoreUtilsProxy> storeUtilsProxyProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public MyStoresSubscribedFragment_MembersInjector(Provider<RoomStoreRepository> provider, Provider<String> provider2, Provider<StoreUtilsProxy> provider3, Provider<AptoideInstalledAppsRepository> provider4, Provider<AnalyticsManager> provider5, Provider<ThemeManager> provider6, Provider<StoreCredentialsProvider> provider7, Provider<NavigationTracker> provider8) {
        this.storeRepositoryProvider = provider;
        this.marketNameProvider = provider2;
        this.storeUtilsProxyProvider = provider3;
        this.aptoideInstalledAppsRepositoryProvider = provider4;
        this.analyticsManagerProvider = provider5;
        this.themeManagerProvider = provider6;
        this.storeCredentialsProvider = provider7;
        this.navigationTrackerProvider = provider8;
    }

    public static C10822a<MyStoresSubscribedFragment> create(Provider<RoomStoreRepository> provider, Provider<String> provider2, Provider<StoreUtilsProxy> provider3, Provider<AptoideInstalledAppsRepository> provider4, Provider<AnalyticsManager> provider5, Provider<ThemeManager> provider6, Provider<StoreCredentialsProvider> provider7, Provider<NavigationTracker> provider8) {
        return new MyStoresSubscribedFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static void injectAnalyticsManager(MyStoresSubscribedFragment myStoresSubscribedFragment, AnalyticsManager analyticsManager) {
        myStoresSubscribedFragment.analyticsManager = analyticsManager;
    }

    public static void injectNavigationTracker(MyStoresSubscribedFragment myStoresSubscribedFragment, NavigationTracker navigationTracker) {
        myStoresSubscribedFragment.navigationTracker = navigationTracker;
    }

    public static void injectStoreCredentialsProvider(MyStoresSubscribedFragment myStoresSubscribedFragment, StoreCredentialsProvider storeCredentialsProvider2) {
        myStoresSubscribedFragment.storeCredentialsProvider = storeCredentialsProvider2;
    }

    public static void injectStoreRepository(MyStoresSubscribedFragment myStoresSubscribedFragment, RoomStoreRepository roomStoreRepository) {
        myStoresSubscribedFragment.storeRepository = roomStoreRepository;
    }

    public static void injectStoreUtilsProxy(MyStoresSubscribedFragment myStoresSubscribedFragment, StoreUtilsProxy storeUtilsProxy) {
        myStoresSubscribedFragment.storeUtilsProxy = storeUtilsProxy;
    }

    public void injectMembers(MyStoresSubscribedFragment myStoresSubscribedFragment) {
        StoreTabGridRecyclerFragment_MembersInjector.injectStoreRepository(myStoresSubscribedFragment, this.storeRepositoryProvider.get());
        StoreTabGridRecyclerFragment_MembersInjector.injectMarketName(myStoresSubscribedFragment, this.marketNameProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreUtilsProxy(myStoresSubscribedFragment, this.storeUtilsProxyProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectAptoideInstalledAppsRepository(myStoresSubscribedFragment, this.aptoideInstalledAppsRepositoryProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectAnalyticsManager(myStoresSubscribedFragment, this.analyticsManagerProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectMarketName(myStoresSubscribedFragment, this.marketNameProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectThemeManager(myStoresSubscribedFragment, this.themeManagerProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreCredentialsProvider(myStoresSubscribedFragment, this.storeCredentialsProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreRepository(myStoresSubscribedFragment, this.storeRepositoryProvider.get());
        injectAnalyticsManager(myStoresSubscribedFragment, this.analyticsManagerProvider.get());
        injectNavigationTracker(myStoresSubscribedFragment, this.navigationTrackerProvider.get());
        injectStoreCredentialsProvider(myStoresSubscribedFragment, this.storeCredentialsProvider.get());
        injectStoreRepository(myStoresSubscribedFragment, this.storeRepositoryProvider.get());
        injectStoreUtilsProxy(myStoresSubscribedFragment, this.storeUtilsProxyProvider.get());
    }
}
