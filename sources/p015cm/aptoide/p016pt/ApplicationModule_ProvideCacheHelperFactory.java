package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p015cm.aptoide.p016pt.file.CacheHelper;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideCacheHelperFactory */
public final class ApplicationModule_ProvideCacheHelperFactory implements C10824b<CacheHelper> {
    private final Provider<String> cachePathProvider;
    private final Provider<SharedPreferences> defaultSharedPreferencesProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvideCacheHelperFactory(ApplicationModule applicationModule, Provider<SharedPreferences> provider, Provider<String> provider2) {
        this.module = applicationModule;
        this.defaultSharedPreferencesProvider = provider;
        this.cachePathProvider = provider2;
    }

    public static ApplicationModule_ProvideCacheHelperFactory create(ApplicationModule applicationModule, Provider<SharedPreferences> provider, Provider<String> provider2) {
        return new ApplicationModule_ProvideCacheHelperFactory(applicationModule, provider, provider2);
    }

    public static CacheHelper provideCacheHelper(ApplicationModule applicationModule, SharedPreferences sharedPreferences, String str) {
        CacheHelper provideCacheHelper = applicationModule.provideCacheHelper(sharedPreferences, str);
        C10825c.m36718a(provideCacheHelper, "Cannot return null from a non-@Nullable @Provides method");
        return provideCacheHelper;
    }

    public CacheHelper get() {
        return provideCacheHelper(this.module, this.defaultSharedPreferencesProvider.get(), this.cachePathProvider.get());
    }
}
