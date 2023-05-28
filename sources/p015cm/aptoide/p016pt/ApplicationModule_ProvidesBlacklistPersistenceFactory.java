package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p015cm.aptoide.p016pt.blacklist.BlacklistPersistence;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesBlacklistPersistenceFactory */
public final class ApplicationModule_ProvidesBlacklistPersistenceFactory implements C10824b<BlacklistPersistence> {
    private final ApplicationModule module;
    private final Provider<SharedPreferences> sharedPreferencesProvider;

    public ApplicationModule_ProvidesBlacklistPersistenceFactory(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        this.module = applicationModule;
        this.sharedPreferencesProvider = provider;
    }

    public static ApplicationModule_ProvidesBlacklistPersistenceFactory create(ApplicationModule applicationModule, Provider<SharedPreferences> provider) {
        return new ApplicationModule_ProvidesBlacklistPersistenceFactory(applicationModule, provider);
    }

    public static BlacklistPersistence providesBlacklistPersistence(ApplicationModule applicationModule, SharedPreferences sharedPreferences) {
        BlacklistPersistence providesBlacklistPersistence = applicationModule.providesBlacklistPersistence(sharedPreferences);
        C10825c.m36718a(providesBlacklistPersistence, "Cannot return null from a non-@Nullable @Provides method");
        return providesBlacklistPersistence;
    }

    public BlacklistPersistence get() {
        return providesBlacklistPersistence(this.module, this.sharedPreferencesProvider.get());
    }
}
