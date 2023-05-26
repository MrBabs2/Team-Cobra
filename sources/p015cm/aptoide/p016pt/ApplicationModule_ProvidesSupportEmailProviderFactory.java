package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.view.settings.SupportEmailProvider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesSupportEmailProviderFactory */
public final class ApplicationModule_ProvidesSupportEmailProviderFactory implements C10824b<SupportEmailProvider> {
    private final ApplicationModule module;
    private final Provider<String> supportEmailProvider;

    public ApplicationModule_ProvidesSupportEmailProviderFactory(ApplicationModule applicationModule, Provider<String> provider) {
        this.module = applicationModule;
        this.supportEmailProvider = provider;
    }

    public static ApplicationModule_ProvidesSupportEmailProviderFactory create(ApplicationModule applicationModule, Provider<String> provider) {
        return new ApplicationModule_ProvidesSupportEmailProviderFactory(applicationModule, provider);
    }

    public static SupportEmailProvider providesSupportEmailProvider(ApplicationModule applicationModule, String str) {
        SupportEmailProvider providesSupportEmailProvider = applicationModule.providesSupportEmailProvider(str);
        C10825c.m36718a(providesSupportEmailProvider, "Cannot return null from a non-@Nullable @Provides method");
        return providesSupportEmailProvider;
    }

    public SupportEmailProvider get() {
        return providesSupportEmailProvider(this.module, this.supportEmailProvider.get());
    }
}
