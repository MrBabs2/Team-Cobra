package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import okhttp3.Interceptor;
import p015cm.aptoide.p016pt.account.AndroidAccountProvider;
import p015cm.aptoide.p016pt.networking.IdsRepository;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideUserAgentInterceptorFactory */
public final class ApplicationModule_ProvideUserAgentInterceptorFactory implements C10824b<Interceptor> {
    private final Provider<AndroidAccountProvider> androidAccountProvider;
    private final Provider<IdsRepository> idsRepositoryProvider;
    private final ApplicationModule module;
    private final Provider<String> partnerIdProvider;

    public ApplicationModule_ProvideUserAgentInterceptorFactory(ApplicationModule applicationModule, Provider<AndroidAccountProvider> provider, Provider<IdsRepository> provider2, Provider<String> provider3) {
        this.module = applicationModule;
        this.androidAccountProvider = provider;
        this.idsRepositoryProvider = provider2;
        this.partnerIdProvider = provider3;
    }

    public static ApplicationModule_ProvideUserAgentInterceptorFactory create(ApplicationModule applicationModule, Provider<AndroidAccountProvider> provider, Provider<IdsRepository> provider2, Provider<String> provider3) {
        return new ApplicationModule_ProvideUserAgentInterceptorFactory(applicationModule, provider, provider2, provider3);
    }

    public static Interceptor provideUserAgentInterceptor(ApplicationModule applicationModule, AndroidAccountProvider androidAccountProvider2, IdsRepository idsRepository, String str) {
        Interceptor provideUserAgentInterceptor = applicationModule.provideUserAgentInterceptor(androidAccountProvider2, idsRepository, str);
        C10825c.m36718a(provideUserAgentInterceptor, "Cannot return null from a non-@Nullable @Provides method");
        return provideUserAgentInterceptor;
    }

    public Interceptor get() {
        return provideUserAgentInterceptor(this.module, this.androidAccountProvider.get(), this.idsRepositoryProvider.get(), this.partnerIdProvider.get());
    }
}
