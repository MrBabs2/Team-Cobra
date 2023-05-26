package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.networking.IdsRepository;
import p015cm.aptoide.p016pt.root.RootAvailabilityManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesFirstLaunchManagerFactory */
public final class ApplicationModule_ProvidesFirstLaunchManagerFactory implements C10824b<FirstLaunchManager> {
    private final Provider<AptoideAccountManager> aptoideAccountManagerProvider;
    private final Provider<SharedPreferences> defaultSharedPreferencesProvider;
    private final Provider<FollowedStoresManager> followedStoresManagerProvider;
    private final Provider<IdsRepository> idsRepositoryProvider;
    private final ApplicationModule module;
    private final Provider<RootAvailabilityManager> rootAvailabilityManagerProvider;
    private final Provider<AptoideShortcutManager> shortcutManagerProvider;

    public ApplicationModule_ProvidesFirstLaunchManagerFactory(ApplicationModule applicationModule, Provider<SharedPreferences> provider, Provider<IdsRepository> provider2, Provider<FollowedStoresManager> provider3, Provider<RootAvailabilityManager> provider4, Provider<AptoideAccountManager> provider5, Provider<AptoideShortcutManager> provider6) {
        this.module = applicationModule;
        this.defaultSharedPreferencesProvider = provider;
        this.idsRepositoryProvider = provider2;
        this.followedStoresManagerProvider = provider3;
        this.rootAvailabilityManagerProvider = provider4;
        this.aptoideAccountManagerProvider = provider5;
        this.shortcutManagerProvider = provider6;
    }

    public static ApplicationModule_ProvidesFirstLaunchManagerFactory create(ApplicationModule applicationModule, Provider<SharedPreferences> provider, Provider<IdsRepository> provider2, Provider<FollowedStoresManager> provider3, Provider<RootAvailabilityManager> provider4, Provider<AptoideAccountManager> provider5, Provider<AptoideShortcutManager> provider6) {
        return new ApplicationModule_ProvidesFirstLaunchManagerFactory(applicationModule, provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static FirstLaunchManager providesFirstLaunchManager(ApplicationModule applicationModule, SharedPreferences sharedPreferences, IdsRepository idsRepository, FollowedStoresManager followedStoresManager, RootAvailabilityManager rootAvailabilityManager, AptoideAccountManager aptoideAccountManager, AptoideShortcutManager aptoideShortcutManager) {
        FirstLaunchManager providesFirstLaunchManager = applicationModule.providesFirstLaunchManager(sharedPreferences, idsRepository, followedStoresManager, rootAvailabilityManager, aptoideAccountManager, aptoideShortcutManager);
        C10825c.m36718a(providesFirstLaunchManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesFirstLaunchManager;
    }

    public FirstLaunchManager get() {
        return providesFirstLaunchManager(this.module, this.defaultSharedPreferencesProvider.get(), this.idsRepositoryProvider.get(), this.followedStoresManagerProvider.get(), this.rootAvailabilityManagerProvider.get(), this.aptoideAccountManagerProvider.get(), this.shortcutManagerProvider.get());
    }
}
