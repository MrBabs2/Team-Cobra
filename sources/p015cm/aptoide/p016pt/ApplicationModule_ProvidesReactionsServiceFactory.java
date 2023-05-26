package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.reactions.network.ReactionsRemoteService;
import p015cm.aptoide.p016pt.reactions.network.ReactionsService;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesReactionsServiceFactory */
public final class ApplicationModule_ProvidesReactionsServiceFactory implements C10824b<ReactionsService> {
    private final ApplicationModule module;
    private final Provider<ReactionsRemoteService.ServiceV8> reactionServiceV8Provider;

    public ApplicationModule_ProvidesReactionsServiceFactory(ApplicationModule applicationModule, Provider<ReactionsRemoteService.ServiceV8> provider) {
        this.module = applicationModule;
        this.reactionServiceV8Provider = provider;
    }

    public static ApplicationModule_ProvidesReactionsServiceFactory create(ApplicationModule applicationModule, Provider<ReactionsRemoteService.ServiceV8> provider) {
        return new ApplicationModule_ProvidesReactionsServiceFactory(applicationModule, provider);
    }

    public static ReactionsService providesReactionsService(ApplicationModule applicationModule, ReactionsRemoteService.ServiceV8 serviceV8) {
        ReactionsService providesReactionsService = applicationModule.providesReactionsService(serviceV8);
        C10825c.m36718a(providesReactionsService, "Cannot return null from a non-@Nullable @Provides method");
        return providesReactionsService;
    }

    public ReactionsService get() {
        return providesReactionsService(this.module, this.reactionServiceV8Provider.get());
    }
}
