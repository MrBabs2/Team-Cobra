package p015cm.aptoide.p016pt;

import com.google.android.gms.common.api.GoogleApiClient;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideGoogleApiClientFactory */
public final class ApplicationModule_ProvideGoogleApiClientFactory implements C10824b<GoogleApiClient> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideGoogleApiClientFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideGoogleApiClientFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideGoogleApiClientFactory(applicationModule);
    }

    public static GoogleApiClient provideGoogleApiClient(ApplicationModule applicationModule) {
        GoogleApiClient provideGoogleApiClient = applicationModule.provideGoogleApiClient();
        C10825c.m36718a(provideGoogleApiClient, "Cannot return null from a non-@Nullable @Provides method");
        return provideGoogleApiClient;
    }

    public GoogleApiClient get() {
        return provideGoogleApiClient(this.module);
    }
}
