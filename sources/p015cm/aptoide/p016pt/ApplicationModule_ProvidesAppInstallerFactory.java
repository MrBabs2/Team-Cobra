package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.install.AppInstallerStatusReceiver;
import p015cm.aptoide.p016pt.packageinstaller.AppInstaller;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAppInstallerFactory */
public final class ApplicationModule_ProvidesAppInstallerFactory implements C10824b<AppInstaller> {
    private final Provider<AppInstallerStatusReceiver> appInstallerStatusReceiverProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAppInstallerFactory(ApplicationModule applicationModule, Provider<AppInstallerStatusReceiver> provider) {
        this.module = applicationModule;
        this.appInstallerStatusReceiverProvider = provider;
    }

    public static ApplicationModule_ProvidesAppInstallerFactory create(ApplicationModule applicationModule, Provider<AppInstallerStatusReceiver> provider) {
        return new ApplicationModule_ProvidesAppInstallerFactory(applicationModule, provider);
    }

    public static AppInstaller providesAppInstaller(ApplicationModule applicationModule, AppInstallerStatusReceiver appInstallerStatusReceiver) {
        AppInstaller providesAppInstaller = applicationModule.providesAppInstaller(appInstallerStatusReceiver);
        C10825c.m36718a(providesAppInstaller, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppInstaller;
    }

    public AppInstaller get() {
        return providesAppInstaller(this.module, this.appInstallerStatusReceiverProvider.get());
    }
}
