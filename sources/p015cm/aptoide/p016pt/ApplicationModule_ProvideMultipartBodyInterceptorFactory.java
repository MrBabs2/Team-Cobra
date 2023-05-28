package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.RequestBodyFactory;
import p015cm.aptoide.p016pt.networking.AuthenticationPersistence;
import p015cm.aptoide.p016pt.networking.IdsRepository;
import p015cm.aptoide.p016pt.networking.MultipartBodyInterceptor;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideMultipartBodyInterceptorFactory */
public final class ApplicationModule_ProvideMultipartBodyInterceptorFactory implements C10824b<MultipartBodyInterceptor> {
    private final Provider<AuthenticationPersistence> authenticationPersistenceProvider;
    private final Provider<IdsRepository> idsRepositoryProvider;
    private final ApplicationModule module;
    private final Provider<RequestBodyFactory> requestBodyFactoryProvider;

    public ApplicationModule_ProvideMultipartBodyInterceptorFactory(ApplicationModule applicationModule, Provider<IdsRepository> provider, Provider<AuthenticationPersistence> provider2, Provider<RequestBodyFactory> provider3) {
        this.module = applicationModule;
        this.idsRepositoryProvider = provider;
        this.authenticationPersistenceProvider = provider2;
        this.requestBodyFactoryProvider = provider3;
    }

    public static ApplicationModule_ProvideMultipartBodyInterceptorFactory create(ApplicationModule applicationModule, Provider<IdsRepository> provider, Provider<AuthenticationPersistence> provider2, Provider<RequestBodyFactory> provider3) {
        return new ApplicationModule_ProvideMultipartBodyInterceptorFactory(applicationModule, provider, provider2, provider3);
    }

    public static MultipartBodyInterceptor provideMultipartBodyInterceptor(ApplicationModule applicationModule, IdsRepository idsRepository, AuthenticationPersistence authenticationPersistence, RequestBodyFactory requestBodyFactory) {
        MultipartBodyInterceptor provideMultipartBodyInterceptor = applicationModule.provideMultipartBodyInterceptor(idsRepository, authenticationPersistence, requestBodyFactory);
        C10825c.m36718a(provideMultipartBodyInterceptor, "Cannot return null from a non-@Nullable @Provides method");
        return provideMultipartBodyInterceptor;
    }

    public MultipartBodyInterceptor get() {
        return provideMultipartBodyInterceptor(this.module, this.idsRepositoryProvider.get(), this.authenticationPersistenceProvider.get(), this.requestBodyFactoryProvider.get());
    }
}
