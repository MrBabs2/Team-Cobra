package p015cm.aptoide.p016pt;

import com.aptoide.authenticationrx.AptoideAuthenticationRx;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAptoideAuthenticationFactory */
public final class ApplicationModule_ProvidesAptoideAuthenticationFactory implements C10824b<AptoideAuthenticationRx> {
    private final Provider<String> authenticationBaseHostProvider;
    private final ApplicationModule module;
    private final Provider<OkHttpClient> okHttpClientProvider;

    public ApplicationModule_ProvidesAptoideAuthenticationFactory(ApplicationModule applicationModule, Provider<String> provider, Provider<OkHttpClient> provider2) {
        this.module = applicationModule;
        this.authenticationBaseHostProvider = provider;
        this.okHttpClientProvider = provider2;
    }

    public static ApplicationModule_ProvidesAptoideAuthenticationFactory create(ApplicationModule applicationModule, Provider<String> provider, Provider<OkHttpClient> provider2) {
        return new ApplicationModule_ProvidesAptoideAuthenticationFactory(applicationModule, provider, provider2);
    }

    public static AptoideAuthenticationRx providesAptoideAuthentication(ApplicationModule applicationModule, String str, OkHttpClient okHttpClient) {
        AptoideAuthenticationRx providesAptoideAuthentication = applicationModule.providesAptoideAuthentication(str, okHttpClient);
        C10825c.m36718a(providesAptoideAuthentication, "Cannot return null from a non-@Nullable @Provides method");
        return providesAptoideAuthentication;
    }

    public AptoideAuthenticationRx get() {
        return providesAptoideAuthentication(this.module, this.authenticationBaseHostProvider.get(), this.okHttpClientProvider.get());
    }
}
