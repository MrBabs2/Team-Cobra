package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.blacklist.BlacklistManager;
import p015cm.aptoide.p016pt.blacklist.BlacklistUnitMapper;
import p015cm.aptoide.p016pt.blacklist.Blacklister;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesBlacklistManagerFactory */
public final class ApplicationModule_ProvidesBlacklistManagerFactory implements C10824b<BlacklistManager> {
    private final Provider<BlacklistUnitMapper> blacklistUnitMapperProvider;
    private final Provider<Blacklister> blacklisterProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesBlacklistManagerFactory(ApplicationModule applicationModule, Provider<Blacklister> provider, Provider<BlacklistUnitMapper> provider2) {
        this.module = applicationModule;
        this.blacklisterProvider = provider;
        this.blacklistUnitMapperProvider = provider2;
    }

    public static ApplicationModule_ProvidesBlacklistManagerFactory create(ApplicationModule applicationModule, Provider<Blacklister> provider, Provider<BlacklistUnitMapper> provider2) {
        return new ApplicationModule_ProvidesBlacklistManagerFactory(applicationModule, provider, provider2);
    }

    public static BlacklistManager providesBlacklistManager(ApplicationModule applicationModule, Blacklister blacklister, BlacklistUnitMapper blacklistUnitMapper) {
        BlacklistManager providesBlacklistManager = applicationModule.providesBlacklistManager(blacklister, blacklistUnitMapper);
        C10825c.m36718a(providesBlacklistManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesBlacklistManager;
    }

    public BlacklistManager get() {
        return providesBlacklistManager(this.module, this.blacklisterProvider.get(), this.blacklistUnitMapperProvider.get());
    }
}
