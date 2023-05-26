package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.bonus.BonusAppcRemoteService;
import p015cm.aptoide.p016pt.bonus.BonusAppcService;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesBonusAppcServiceFactory */
public final class ApplicationModule_ProvidesBonusAppcServiceFactory implements C10824b<BonusAppcService> {
    private final ApplicationModule module;
    private final Provider<BonusAppcRemoteService.ServiceApi> serviceApiProvider;

    public ApplicationModule_ProvidesBonusAppcServiceFactory(ApplicationModule applicationModule, Provider<BonusAppcRemoteService.ServiceApi> provider) {
        this.module = applicationModule;
        this.serviceApiProvider = provider;
    }

    public static ApplicationModule_ProvidesBonusAppcServiceFactory create(ApplicationModule applicationModule, Provider<BonusAppcRemoteService.ServiceApi> provider) {
        return new ApplicationModule_ProvidesBonusAppcServiceFactory(applicationModule, provider);
    }

    public static BonusAppcService providesBonusAppcService(ApplicationModule applicationModule, BonusAppcRemoteService.ServiceApi serviceApi) {
        BonusAppcService providesBonusAppcService = applicationModule.providesBonusAppcService(serviceApi);
        C10825c.m36718a(providesBonusAppcService, "Cannot return null from a non-@Nullable @Provides method");
        return providesBonusAppcService;
    }

    public BonusAppcService get() {
        return providesBonusAppcService(this.module, this.serviceApiProvider.get());
    }
}
