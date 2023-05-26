package p015cm.aptoide.p016pt.store.view;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7EndlessResponse;
import p015cm.aptoide.p016pt.install.AptoideInstalledAppsRepository;
import p015cm.aptoide.p016pt.store.RoomStoreRepository;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p015cm.aptoide.p016pt.store.StoreUtilsProxy;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.store.view.GetStoreEndlessFragment_MembersInjector */
public final class GetStoreEndlessFragment_MembersInjector<T extends BaseV7EndlessResponse> implements C10822a<GetStoreEndlessFragment<T>> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<AptoideInstalledAppsRepository> aptoideInstalledAppsRepositoryProvider;
    private final Provider<String> marketNameProvider;
    private final Provider<StoreCredentialsProvider> storeCredentialsProvider;
    private final Provider<RoomStoreRepository> storeRepositoryProvider;
    private final Provider<StoreUtilsProxy> storeUtilsProxyProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public GetStoreEndlessFragment_MembersInjector(Provider<RoomStoreRepository> provider, Provider<String> provider2, Provider<StoreUtilsProxy> provider3, Provider<AptoideInstalledAppsRepository> provider4, Provider<AnalyticsManager> provider5, Provider<ThemeManager> provider6, Provider<StoreCredentialsProvider> provider7) {
        this.storeRepositoryProvider = provider;
        this.marketNameProvider = provider2;
        this.storeUtilsProxyProvider = provider3;
        this.aptoideInstalledAppsRepositoryProvider = provider4;
        this.analyticsManagerProvider = provider5;
        this.themeManagerProvider = provider6;
        this.storeCredentialsProvider = provider7;
    }

    public static <T extends BaseV7EndlessResponse> C10822a<GetStoreEndlessFragment<T>> create(Provider<RoomStoreRepository> provider, Provider<String> provider2, Provider<StoreUtilsProxy> provider3, Provider<AptoideInstalledAppsRepository> provider4, Provider<AnalyticsManager> provider5, Provider<ThemeManager> provider6, Provider<StoreCredentialsProvider> provider7) {
        return new GetStoreEndlessFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public void injectMembers(GetStoreEndlessFragment<T> getStoreEndlessFragment) {
        StoreTabGridRecyclerFragment_MembersInjector.injectStoreRepository(getStoreEndlessFragment, this.storeRepositoryProvider.get());
        StoreTabGridRecyclerFragment_MembersInjector.injectMarketName(getStoreEndlessFragment, this.marketNameProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreUtilsProxy(getStoreEndlessFragment, this.storeUtilsProxyProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectAptoideInstalledAppsRepository(getStoreEndlessFragment, this.aptoideInstalledAppsRepositoryProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectAnalyticsManager(getStoreEndlessFragment, this.analyticsManagerProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectMarketName(getStoreEndlessFragment, this.marketNameProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectThemeManager(getStoreEndlessFragment, this.themeManagerProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreCredentialsProvider(getStoreEndlessFragment, this.storeCredentialsProvider.get());
        StoreTabWidgetsGridRecyclerFragment_MembersInjector.injectStoreRepository(getStoreEndlessFragment, this.storeRepositoryProvider.get());
    }
}
