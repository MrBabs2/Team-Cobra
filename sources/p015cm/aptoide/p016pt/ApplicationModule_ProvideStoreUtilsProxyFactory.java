package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.store.RoomStoreRepository;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p015cm.aptoide.p016pt.store.StoreUtilsProxy;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideStoreUtilsProxyFactory */
public final class ApplicationModule_ProvideStoreUtilsProxyFactory implements C10824b<StoreUtilsProxy> {
    private final Provider<AptoideAccountManager> accountManagerProvider;
    private final Provider<BodyInterceptor<BaseBody>> bodyInterceptorProvider;
    private final Provider<OkHttpClient> httpClientProvider;
    private final ApplicationModule module;
    private final Provider<SharedPreferences> sharedPreferencesProvider;
    private final Provider<StoreCredentialsProvider> storeCredentialsProvider;
    private final Provider<RoomStoreRepository> storeRepositoryProvider;
    private final Provider<TokenInvalidator> tokenInvalidatorProvider;

    public ApplicationModule_ProvideStoreUtilsProxyFactory(ApplicationModule applicationModule, Provider<AptoideAccountManager> provider, Provider<RoomStoreRepository> provider2, Provider<OkHttpClient> provider3, Provider<SharedPreferences> provider4, Provider<TokenInvalidator> provider5, Provider<BodyInterceptor<BaseBody>> provider6, Provider<StoreCredentialsProvider> provider7) {
        this.module = applicationModule;
        this.accountManagerProvider = provider;
        this.storeRepositoryProvider = provider2;
        this.httpClientProvider = provider3;
        this.sharedPreferencesProvider = provider4;
        this.tokenInvalidatorProvider = provider5;
        this.bodyInterceptorProvider = provider6;
        this.storeCredentialsProvider = provider7;
    }

    public static ApplicationModule_ProvideStoreUtilsProxyFactory create(ApplicationModule applicationModule, Provider<AptoideAccountManager> provider, Provider<RoomStoreRepository> provider2, Provider<OkHttpClient> provider3, Provider<SharedPreferences> provider4, Provider<TokenInvalidator> provider5, Provider<BodyInterceptor<BaseBody>> provider6, Provider<StoreCredentialsProvider> provider7) {
        return new ApplicationModule_ProvideStoreUtilsProxyFactory(applicationModule, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static StoreUtilsProxy provideStoreUtilsProxy(ApplicationModule applicationModule, AptoideAccountManager aptoideAccountManager, RoomStoreRepository roomStoreRepository, OkHttpClient okHttpClient, SharedPreferences sharedPreferences, TokenInvalidator tokenInvalidator, BodyInterceptor<BaseBody> bodyInterceptor, StoreCredentialsProvider storeCredentialsProvider2) {
        StoreUtilsProxy provideStoreUtilsProxy = applicationModule.provideStoreUtilsProxy(aptoideAccountManager, roomStoreRepository, okHttpClient, sharedPreferences, tokenInvalidator, bodyInterceptor, storeCredentialsProvider2);
        C10825c.m36718a(provideStoreUtilsProxy, "Cannot return null from a non-@Nullable @Provides method");
        return provideStoreUtilsProxy;
    }

    public StoreUtilsProxy get() {
        return provideStoreUtilsProxy(this.module, this.accountManagerProvider.get(), this.storeRepositoryProvider.get(), this.httpClientProvider.get(), this.sharedPreferencesProvider.get(), this.tokenInvalidatorProvider.get(), this.bodyInterceptorProvider.get(), this.storeCredentialsProvider.get());
    }
}
