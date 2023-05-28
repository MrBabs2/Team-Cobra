package p015cm.aptoide.p016pt.store.view.p028my;

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

/* renamed from: cm.aptoide.pt.store.view.my.MyStoresFragment_MembersInjector */
public final class MyStoresFragment_MembersInjector implements C10822a<MyStoresFragment> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<AptoideInstalledAppsRepository> aptoideInstalledAppsRepositoryProvider;
    private final Provider<String> marketNameProvider;
    private final Provider<MyStoresPresenter> myStoresPresenterProvider;
    private final Provider<StoreCredentialsProvider> storeCredentialsProvider;
    private final Provider<RoomStoreRepository> storeRepositoryProvider;
    private final Provider<StoreUtilsProxy> storeUtilsProxyProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public MyStoresFragment_MembersInjector(Provider<RoomStoreRepository> provider, Provider<String> provider2, Provider<StoreUtilsProxy> provider3, Provider<AptoideInstalledAppsRepository> provider4, Provider<AnalyticsManager> provider5, Provider<ThemeManager> provider6, Provider<StoreCredentialsProvider> provider7, Provider<MyStoresPresenter> provider8) {
        this.storeRepositoryProvider = provider;
        this.marketNameProvider = provider2;
        this.storeUtilsProxyProvider = provider3;
        this.aptoideInstalledAppsRepositoryProvider = provider4;
        this.analyticsManagerProvider = provider5;
        this.themeManagerProvider = provider6;
        this.storeCredentialsProvider = provider7;
        this.myStoresPresenterProvider = provider8;
    }

    public static C10822a<MyStoresFragment> create(Provider<RoomStoreRepository> provider, Provider<String> provider2, Provider<StoreUtilsProxy> provider3, Provider<AptoideInstalledAppsRepository> provider4, Provider<AnalyticsManager> provider5, Provider<ThemeManager> provider6, Provider<StoreCredentialsProvider> provider7, Provider<MyStoresPresenter> provider8) {
        return new MyStoresFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static void injectMyStoresPresenter(MyStoresFragment myStoresFragment, MyStoresPresenter myStoresPresenter) {
        myStoresFragment.myStoresPresenter = myStoresPresenter;
    }

    public static void injectStoreRepository(MyStoresFragment myStoresFragment, RoomStoreRepository roomStoreRepository) {
        myStoresFragment.storeRepository = roomStoreRepository;
    }

    public void injectMembers(MyStoresFragment myStoresFragment) {
        StoreTabGridRecyclerFragment_MembersInjector.injectStoreRepository(myStoresFragment, this.storeRepositoryProvider.get());
        StoreTabGridRecyclerFragment_MembersInjector.injectMarketName(myStoresFragment, this.marketNameProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreUtilsProxy(myStoresFragment, this.storeUtilsProxyProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectAptoideInstalledAppsRepository(myStoresFragment, this.aptoideInstalledAppsRepositoryProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectAnalyticsManager(myStoresFragment, this.analyticsManagerProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectMarketName(myStoresFragment, this.marketNameProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectThemeManager(myStoresFragment, this.themeManagerProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreCredentialsProvider(myStoresFragment, this.storeCredentialsProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreRepository(myStoresFragment, this.storeRepositoryProvider.get());
        injectMyStoresPresenter(myStoresFragment, this.myStoresPresenterProvider.get());
        injectStoreRepository(myStoresFragment, this.storeRepositoryProvider.get());
    }
}
