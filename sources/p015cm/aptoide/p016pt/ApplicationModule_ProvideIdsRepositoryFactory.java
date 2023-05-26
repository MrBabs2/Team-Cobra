package p015cm.aptoide.p016pt;

import android.content.ContentResolver;
import android.content.SharedPreferences;
import javax.inject.Provider;
import p015cm.aptoide.p016pt.networking.IdsRepository;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideIdsRepositoryFactory */
public final class ApplicationModule_ProvideIdsRepositoryFactory implements C10824b<IdsRepository> {
    private final Provider<ContentResolver> contentResolverProvider;
    private final Provider<SharedPreferences> defaultSharedPreferencesProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvideIdsRepositoryFactory(ApplicationModule applicationModule, Provider<SharedPreferences> provider, Provider<ContentResolver> provider2) {
        this.module = applicationModule;
        this.defaultSharedPreferencesProvider = provider;
        this.contentResolverProvider = provider2;
    }

    public static ApplicationModule_ProvideIdsRepositoryFactory create(ApplicationModule applicationModule, Provider<SharedPreferences> provider, Provider<ContentResolver> provider2) {
        return new ApplicationModule_ProvideIdsRepositoryFactory(applicationModule, provider, provider2);
    }

    public static IdsRepository provideIdsRepository(ApplicationModule applicationModule, SharedPreferences sharedPreferences, ContentResolver contentResolver) {
        IdsRepository provideIdsRepository = applicationModule.provideIdsRepository(sharedPreferences, contentResolver);
        C10825c.m36718a(provideIdsRepository, "Cannot return null from a non-@Nullable @Provides method");
        return provideIdsRepository;
    }

    public IdsRepository get() {
        return provideIdsRepository(this.module, this.defaultSharedPreferencesProvider.get(), this.contentResolverProvider.get());
    }
}
