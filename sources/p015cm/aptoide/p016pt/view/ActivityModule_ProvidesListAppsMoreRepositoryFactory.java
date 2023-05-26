package p015cm.aptoide.p016pt.view;

import android.content.SharedPreferences;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.home.more.apps.ListAppsMoreRepository;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvidesListAppsMoreRepositoryFactory */
public final class ActivityModule_ProvidesListAppsMoreRepositoryFactory implements C10824b<ListAppsMoreRepository> {
    private final Provider<AppBundlesVisibilityManager> appBundlesVisibilityManagerProvider;
    private final Provider<BodyInterceptor<BaseBody>> baseBodyBodyInterceptorProvider;
    private final Provider<Converter.Factory> converterFactoryProvider;
    private final ActivityModule module;
    private final Provider<OkHttpClient> okHttpClientProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;
    private final Provider<StoreCredentialsProvider> storeCredentialsProvider;
    private final Provider<TokenInvalidator> tokenInvalidatorProvider;

    public ActivityModule_ProvidesListAppsMoreRepositoryFactory(ActivityModule activityModule, Provider<StoreCredentialsProvider> provider, Provider<OkHttpClient> provider2, Provider<BodyInterceptor<BaseBody>> provider3, Provider<TokenInvalidator> provider4, Provider<SharedPreferences> provider5, Provider<Converter.Factory> provider6, Provider<AppBundlesVisibilityManager> provider7) {
        this.module = activityModule;
        this.storeCredentialsProvider = provider;
        this.okHttpClientProvider = provider2;
        this.baseBodyBodyInterceptorProvider = provider3;
        this.tokenInvalidatorProvider = provider4;
        this.sharedPreferencesProvider = provider5;
        this.converterFactoryProvider = provider6;
        this.appBundlesVisibilityManagerProvider = provider7;
    }

    public static ActivityModule_ProvidesListAppsMoreRepositoryFactory create(ActivityModule activityModule, Provider<StoreCredentialsProvider> provider, Provider<OkHttpClient> provider2, Provider<BodyInterceptor<BaseBody>> provider3, Provider<TokenInvalidator> provider4, Provider<SharedPreferences> provider5, Provider<Converter.Factory> provider6, Provider<AppBundlesVisibilityManager> provider7) {
        return new ActivityModule_ProvidesListAppsMoreRepositoryFactory(activityModule, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static ListAppsMoreRepository providesListAppsMoreRepository(ActivityModule activityModule, StoreCredentialsProvider storeCredentialsProvider2, OkHttpClient okHttpClient, BodyInterceptor<BaseBody> bodyInterceptor, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, Converter.Factory factory, AppBundlesVisibilityManager appBundlesVisibilityManager) {
        ListAppsMoreRepository providesListAppsMoreRepository = activityModule.providesListAppsMoreRepository(storeCredentialsProvider2, okHttpClient, bodyInterceptor, tokenInvalidator, sharedPreferences, factory, appBundlesVisibilityManager);
        C10825c.m36718a(providesListAppsMoreRepository, "Cannot return null from a non-@Nullable @Provides method");
        return providesListAppsMoreRepository;
    }

    public ListAppsMoreRepository get() {
        return providesListAppsMoreRepository(this.module, this.storeCredentialsProvider.get(), this.okHttpClientProvider.get(), this.baseBodyBodyInterceptorProvider.get(), this.tokenInvalidatorProvider.get(), this.sharedPreferencesProvider.get(), this.converterFactoryProvider.get(), this.appBundlesVisibilityManagerProvider.get());
    }
}
