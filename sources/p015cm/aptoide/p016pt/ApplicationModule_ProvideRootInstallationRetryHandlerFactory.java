package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.install.InstallManager;
import p015cm.aptoide.p016pt.install.installer.RootInstallationRetryHandler;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideRootInstallationRetryHandlerFactory */
public final class ApplicationModule_ProvideRootInstallationRetryHandlerFactory implements C10824b<RootInstallationRetryHandler> {
    private final Provider<InstallManager> installManagerProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvideRootInstallationRetryHandlerFactory(ApplicationModule applicationModule, Provider<InstallManager> provider) {
        this.module = applicationModule;
        this.installManagerProvider = provider;
    }

    public static ApplicationModule_ProvideRootInstallationRetryHandlerFactory create(ApplicationModule applicationModule, Provider<InstallManager> provider) {
        return new ApplicationModule_ProvideRootInstallationRetryHandlerFactory(applicationModule, provider);
    }

    public static RootInstallationRetryHandler provideRootInstallationRetryHandler(ApplicationModule applicationModule, InstallManager installManager) {
        RootInstallationRetryHandler provideRootInstallationRetryHandler = applicationModule.provideRootInstallationRetryHandler(installManager);
        C10825c.m36718a(provideRootInstallationRetryHandler, "Cannot return null from a non-@Nullable @Provides method");
        return provideRootInstallationRetryHandler;
    }

    public RootInstallationRetryHandler get() {
        return provideRootInstallationRetryHandler(this.module, this.installManagerProvider.get());
    }
}
