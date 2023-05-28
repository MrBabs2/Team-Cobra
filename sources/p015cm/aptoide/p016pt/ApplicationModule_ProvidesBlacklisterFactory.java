package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.blacklist.BlacklistPersistence;
import p015cm.aptoide.p016pt.blacklist.Blacklister;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesBlacklisterFactory */
public final class ApplicationModule_ProvidesBlacklisterFactory implements C10824b<Blacklister> {
    private final Provider<BlacklistPersistence> blacklistPersistenceProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesBlacklisterFactory(ApplicationModule applicationModule, Provider<BlacklistPersistence> provider) {
        this.module = applicationModule;
        this.blacklistPersistenceProvider = provider;
    }

    public static ApplicationModule_ProvidesBlacklisterFactory create(ApplicationModule applicationModule, Provider<BlacklistPersistence> provider) {
        return new ApplicationModule_ProvidesBlacklisterFactory(applicationModule, provider);
    }

    public static Blacklister providesBlacklister(ApplicationModule applicationModule, BlacklistPersistence blacklistPersistence) {
        Blacklister providesBlacklister = applicationModule.providesBlacklister(blacklistPersistence);
        C10825c.m36718a(providesBlacklister, "Cannot return null from a non-@Nullable @Provides method");
        return providesBlacklister;
    }

    public Blacklister get() {
        return providesBlacklister(this.module, this.blacklistPersistenceProvider.get());
    }
}
