package p015cm.aptoide.p016pt;

import com.google.android.gms.safetynet.SafetyNetClient;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesSafetyNetClientFactory */
public final class ApplicationModule_ProvidesSafetyNetClientFactory implements C10824b<SafetyNetClient> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesSafetyNetClientFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesSafetyNetClientFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesSafetyNetClientFactory(applicationModule);
    }

    public static SafetyNetClient providesSafetyNetClient(ApplicationModule applicationModule) {
        SafetyNetClient providesSafetyNetClient = applicationModule.providesSafetyNetClient();
        C10825c.m36718a(providesSafetyNetClient, "Cannot return null from a non-@Nullable @Provides method");
        return providesSafetyNetClient;
    }

    public SafetyNetClient get() {
        return providesSafetyNetClient(this.module);
    }
}
