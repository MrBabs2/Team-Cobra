package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.blacklist.BlacklistManager;
import p015cm.aptoide.p016pt.home.Home;
import p015cm.aptoide.p016pt.home.bundles.BundlesRepository;
import p015cm.aptoide.p016pt.notification.ComingSoonNotificationManager;
import p015cm.aptoide.p016pt.promotions.PromotionsManager;
import p015cm.aptoide.p016pt.promotions.PromotionsPreferencesManager;
import p015cm.aptoide.p016pt.reactions.ReactionsManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesHomeFactory */
public final class FragmentModule_ProvidesHomeFactory implements C10824b<Home> {
    private final Provider<BlacklistManager> blacklistManagerProvider;
    private final Provider<BundlesRepository> bundlesRepositoryProvider;
    private final Provider<ComingSoonNotificationManager> comingSoonNotificationManagerProvider;
    private final FragmentModule module;
    private final Provider<PromotionsManager> promotionsManagerProvider;
    private final Provider<PromotionsPreferencesManager> promotionsPreferencesManagerProvider;
    private final Provider<String> promotionsTypeProvider;
    private final Provider<ReactionsManager> reactionsManagerProvider;

    public FragmentModule_ProvidesHomeFactory(FragmentModule fragmentModule, Provider<BundlesRepository> provider, Provider<PromotionsManager> provider2, Provider<PromotionsPreferencesManager> provider3, Provider<BlacklistManager> provider4, Provider<String> provider5, Provider<ReactionsManager> provider6, Provider<ComingSoonNotificationManager> provider7) {
        this.module = fragmentModule;
        this.bundlesRepositoryProvider = provider;
        this.promotionsManagerProvider = provider2;
        this.promotionsPreferencesManagerProvider = provider3;
        this.blacklistManagerProvider = provider4;
        this.promotionsTypeProvider = provider5;
        this.reactionsManagerProvider = provider6;
        this.comingSoonNotificationManagerProvider = provider7;
    }

    public static FragmentModule_ProvidesHomeFactory create(FragmentModule fragmentModule, Provider<BundlesRepository> provider, Provider<PromotionsManager> provider2, Provider<PromotionsPreferencesManager> provider3, Provider<BlacklistManager> provider4, Provider<String> provider5, Provider<ReactionsManager> provider6, Provider<ComingSoonNotificationManager> provider7) {
        return new FragmentModule_ProvidesHomeFactory(fragmentModule, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static Home providesHome(FragmentModule fragmentModule, BundlesRepository bundlesRepository, PromotionsManager promotionsManager, PromotionsPreferencesManager promotionsPreferencesManager, BlacklistManager blacklistManager, String str, ReactionsManager reactionsManager, ComingSoonNotificationManager comingSoonNotificationManager) {
        Home providesHome = fragmentModule.providesHome(bundlesRepository, promotionsManager, promotionsPreferencesManager, blacklistManager, str, reactionsManager, comingSoonNotificationManager);
        C10825c.m36718a(providesHome, "Cannot return null from a non-@Nullable @Provides method");
        return providesHome;
    }

    public Home get() {
        return providesHome(this.module, this.bundlesRepositoryProvider.get(), this.promotionsManagerProvider.get(), this.promotionsPreferencesManagerProvider.get(), this.blacklistManagerProvider.get(), this.promotionsTypeProvider.get(), this.reactionsManagerProvider.get(), this.comingSoonNotificationManagerProvider.get());
    }
}
