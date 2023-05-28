package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.reactions.network.ReactionsRemoteService;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;
import retrofit2.Retrofit;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesReactionsServiceV8Factory */
public final class ApplicationModule_ProvidesReactionsServiceV8Factory implements C10824b<ReactionsRemoteService.ServiceV8> {
    private final ApplicationModule module;
    private final Provider<Retrofit> retrofitProvider;

    public ApplicationModule_ProvidesReactionsServiceV8Factory(ApplicationModule applicationModule, Provider<Retrofit> provider) {
        this.module = applicationModule;
        this.retrofitProvider = provider;
    }

    public static ApplicationModule_ProvidesReactionsServiceV8Factory create(ApplicationModule applicationModule, Provider<Retrofit> provider) {
        return new ApplicationModule_ProvidesReactionsServiceV8Factory(applicationModule, provider);
    }

    public static ReactionsRemoteService.ServiceV8 providesReactionsServiceV8(ApplicationModule applicationModule, Retrofit retrofit) {
        ReactionsRemoteService.ServiceV8 providesReactionsServiceV8 = applicationModule.providesReactionsServiceV8(retrofit);
        C10825c.m36718a(providesReactionsServiceV8, "Cannot return null from a non-@Nullable @Provides method");
        return providesReactionsServiceV8;
    }

    public ReactionsRemoteService.ServiceV8 get() {
        return providesReactionsServiceV8(this.module, this.retrofitProvider.get());
    }
}
