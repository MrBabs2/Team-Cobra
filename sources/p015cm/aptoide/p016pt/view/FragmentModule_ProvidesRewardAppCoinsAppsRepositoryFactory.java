package p015cm.aptoide.p016pt.view;

import android.content.SharedPreferences;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.install.InstallManager;
import p015cm.aptoide.p016pt.repository.request.RewardAppCoinsAppsRepository;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesRewardAppCoinsAppsRepositoryFactory */
public final class FragmentModule_ProvidesRewardAppCoinsAppsRepositoryFactory implements C10824b<RewardAppCoinsAppsRepository> {
    private final Provider<AppBundlesVisibilityManager> appBundlesVisibilityManagerProvider;
    private final Provider<BodyInterceptor<BaseBody>> baseBodyBodyInterceptorProvider;
    private final Provider<InstallManager> installManagerProvider;
    private final FragmentModule module;
    private final Provider<OkHttpClient> okHttpClientProvider;
    private final Provider<SharedPreferences> sharedPreferencesProvider;
    private final Provider<TokenInvalidator> tokenInvalidatorProvider;

    public FragmentModule_ProvidesRewardAppCoinsAppsRepositoryFactory(FragmentModule fragmentModule, Provider<OkHttpClient> provider, Provider<BodyInterceptor<BaseBody>> provider2, Provider<TokenInvalidator> provider3, Provider<SharedPreferences> provider4, Provider<InstallManager> provider5, Provider<AppBundlesVisibilityManager> provider6) {
        this.module = fragmentModule;
        this.okHttpClientProvider = provider;
        this.baseBodyBodyInterceptorProvider = provider2;
        this.tokenInvalidatorProvider = provider3;
        this.sharedPreferencesProvider = provider4;
        this.installManagerProvider = provider5;
        this.appBundlesVisibilityManagerProvider = provider6;
    }

    public static FragmentModule_ProvidesRewardAppCoinsAppsRepositoryFactory create(FragmentModule fragmentModule, Provider<OkHttpClient> provider, Provider<BodyInterceptor<BaseBody>> provider2, Provider<TokenInvalidator> provider3, Provider<SharedPreferences> provider4, Provider<InstallManager> provider5, Provider<AppBundlesVisibilityManager> provider6) {
        return new FragmentModule_ProvidesRewardAppCoinsAppsRepositoryFactory(fragmentModule, provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static RewardAppCoinsAppsRepository providesRewardAppCoinsAppsRepository(FragmentModule fragmentModule, OkHttpClient okHttpClient, BodyInterceptor<BaseBody> bodyInterceptor, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, InstallManager installManager, AppBundlesVisibilityManager appBundlesVisibilityManager) {
        RewardAppCoinsAppsRepository providesRewardAppCoinsAppsRepository = fragmentModule.providesRewardAppCoinsAppsRepository(okHttpClient, bodyInterceptor, tokenInvalidator, sharedPreferences, installManager, appBundlesVisibilityManager);
        C10825c.m36718a(providesRewardAppCoinsAppsRepository, "Cannot return null from a non-@Nullable @Provides method");
        return providesRewardAppCoinsAppsRepository;
    }

    public RewardAppCoinsAppsRepository get() {
        return providesRewardAppCoinsAppsRepository(this.module, this.okHttpClientProvider.get(), this.baseBodyBodyInterceptorProvider.get(), this.tokenInvalidatorProvider.get(), this.sharedPreferencesProvider.get(), this.installManagerProvider.get(), this.appBundlesVisibilityManagerProvider.get());
    }
}
