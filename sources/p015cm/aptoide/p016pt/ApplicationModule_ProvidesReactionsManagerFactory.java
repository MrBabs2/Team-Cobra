package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.reactions.ReactionsManager;
import p015cm.aptoide.p016pt.reactions.network.ReactionsService;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesReactionsManagerFactory */
public final class ApplicationModule_ProvidesReactionsManagerFactory implements C10824b<ReactionsManager> {
    private final ApplicationModule module;
    private final Provider<ReactionsService> reactionsServiceProvider;

    public ApplicationModule_ProvidesReactionsManagerFactory(ApplicationModule applicationModule, Provider<ReactionsService> provider) {
        this.module = applicationModule;
        this.reactionsServiceProvider = provider;
    }

    public static ApplicationModule_ProvidesReactionsManagerFactory create(ApplicationModule applicationModule, Provider<ReactionsService> provider) {
        return new ApplicationModule_ProvidesReactionsManagerFactory(applicationModule, provider);
    }

    public static ReactionsManager providesReactionsManager(ApplicationModule applicationModule, ReactionsService reactionsService) {
        ReactionsManager providesReactionsManager = applicationModule.providesReactionsManager(reactionsService);
        C10825c.m36718a(providesReactionsManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesReactionsManager;
    }

    public ReactionsManager get() {
        return providesReactionsManager(this.module, this.reactionsServiceProvider.get());
    }
}
