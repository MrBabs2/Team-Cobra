package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.download.OemidProvider;
import p015cm.aptoide.p016pt.search.SearchRepository;
import p015cm.aptoide.p016pt.store.RoomStoreRepository;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesSearchRepositoryFactory */
public final class ApplicationModule_ProvidesSearchRepositoryFactory implements C10824b<SearchRepository> {
    private final Provider<AppBundlesVisibilityManager> appBundlesVisibilityManagerProvider;
    private final Provider<BodyInterceptor<BaseBody>> baseBodyBodyInterceptorProvider;
    private final Provider<Converter.Factory> converterFactoryProvider;
    private final ApplicationModule module;
    private final Provider<OemidProvider> oemidProvider;
    private final Provider<OkHttpClient> okHttpClientProvider;
    private final Provider<RoomStoreRepository> roomStoreRepositoryProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;
    private final Provider<TokenInvalidator> tokenInvalidatorProvider;

    public ApplicationModule_ProvidesSearchRepositoryFactory(ApplicationModule applicationModule, Provider<RoomStoreRepository> provider, Provider<BodyInterceptor<BaseBody>> provider2, Provider<SharedPreferences> provider3, Provider<TokenInvalidator> provider4, Provider<OkHttpClient> provider5, Provider<Converter.Factory> provider6, Provider<AppBundlesVisibilityManager> provider7, Provider<OemidProvider> provider8) {
        this.module = applicationModule;
        this.roomStoreRepositoryProvider = provider;
        this.baseBodyBodyInterceptorProvider = provider2;
        this.sharedPreferencesProvider = provider3;
        this.tokenInvalidatorProvider = provider4;
        this.okHttpClientProvider = provider5;
        this.converterFactoryProvider = provider6;
        this.appBundlesVisibilityManagerProvider = provider7;
        this.oemidProvider = provider8;
    }

    public static ApplicationModule_ProvidesSearchRepositoryFactory create(ApplicationModule applicationModule, Provider<RoomStoreRepository> provider, Provider<BodyInterceptor<BaseBody>> provider2, Provider<SharedPreferences> provider3, Provider<TokenInvalidator> provider4, Provider<OkHttpClient> provider5, Provider<Converter.Factory> provider6, Provider<AppBundlesVisibilityManager> provider7, Provider<OemidProvider> provider8) {
        return new ApplicationModule_ProvidesSearchRepositoryFactory(applicationModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static SearchRepository providesSearchRepository(ApplicationModule applicationModule, RoomStoreRepository roomStoreRepository, BodyInterceptor<BaseBody> bodyInterceptor, SharedPreferences sharedPreferences, TokenInvalidator tokenInvalidator, OkHttpClient okHttpClient, Converter.Factory factory, AppBundlesVisibilityManager appBundlesVisibilityManager, OemidProvider oemidProvider2) {
        SearchRepository providesSearchRepository = applicationModule.providesSearchRepository(roomStoreRepository, bodyInterceptor, sharedPreferences, tokenInvalidator, okHttpClient, factory, appBundlesVisibilityManager, oemidProvider2);
        C10825c.m36718a(providesSearchRepository, "Cannot return null from a non-@Nullable @Provides method");
        return providesSearchRepository;
    }

    public SearchRepository get() {
        return providesSearchRepository(this.module, this.roomStoreRepositoryProvider.get(), this.baseBodyBodyInterceptorProvider.get(), this.sharedPreferencesProvider.get(), this.tokenInvalidatorProvider.get(), this.okHttpClientProvider.get(), this.converterFactoryProvider.get(), this.appBundlesVisibilityManagerProvider.get(), this.oemidProvider.get());
    }
}
