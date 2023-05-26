package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.install.AppInstallerStatusReceiver;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAppInstallerStatusReceiverFactory */
public final class ApplicationModule_ProvidesAppInstallerStatusReceiverFactory implements C10824b<AppInstallerStatusReceiver> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAppInstallerStatusReceiverFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesAppInstallerStatusReceiverFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesAppInstallerStatusReceiverFactory(applicationModule);
    }

    public static AppInstallerStatusReceiver providesAppInstallerStatusReceiver(ApplicationModule applicationModule) {
        AppInstallerStatusReceiver providesAppInstallerStatusReceiver = applicationModule.providesAppInstallerStatusReceiver();
        C10825c.m36718a(providesAppInstallerStatusReceiver, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppInstallerStatusReceiver;
    }

    public AppInstallerStatusReceiver get() {
        return providesAppInstallerStatusReceiver(this.module);
    }
}
