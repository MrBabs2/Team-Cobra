package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.home.apps.UpdatesManager;
import p015cm.aptoide.p016pt.updates.UpdateRepository;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesUpdatesManagerFactory */
public final class ApplicationModule_ProvidesUpdatesManagerFactory implements C10824b<UpdatesManager> {
    private final ApplicationModule module;
    private final Provider<UpdateRepository> updateRepositoryProvider;

    public ApplicationModule_ProvidesUpdatesManagerFactory(ApplicationModule applicationModule, Provider<UpdateRepository> provider) {
        this.module = applicationModule;
        this.updateRepositoryProvider = provider;
    }

    public static ApplicationModule_ProvidesUpdatesManagerFactory create(ApplicationModule applicationModule, Provider<UpdateRepository> provider) {
        return new ApplicationModule_ProvidesUpdatesManagerFactory(applicationModule, provider);
    }

    public static UpdatesManager providesUpdatesManager(ApplicationModule applicationModule, UpdateRepository updateRepository) {
        UpdatesManager providesUpdatesManager = applicationModule.providesUpdatesManager(updateRepository);
        C10825c.m36718a(providesUpdatesManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesUpdatesManager;
    }

    public UpdatesManager get() {
        return providesUpdatesManager(this.module, this.updateRepositoryProvider.get());
    }
}
