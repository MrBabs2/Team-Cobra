package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.install.InstallManager;
import p015cm.aptoide.p016pt.notification.ReadyToInstallNotificationManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesReadyToInstallNotificationManagerFactory */
public final class C1080xa0c4ceda implements C10824b<ReadyToInstallNotificationManager> {
    private final Provider<InstallManager> installManagerProvider;
    private final ApplicationModule module;

    public C1080xa0c4ceda(ApplicationModule applicationModule, Provider<InstallManager> provider) {
        this.module = applicationModule;
        this.installManagerProvider = provider;
    }

    public static C1080xa0c4ceda create(ApplicationModule applicationModule, Provider<InstallManager> provider) {
        return new C1080xa0c4ceda(applicationModule, provider);
    }

    public static ReadyToInstallNotificationManager providesReadyToInstallNotificationManager(ApplicationModule applicationModule, InstallManager installManager) {
        ReadyToInstallNotificationManager providesReadyToInstallNotificationManager = applicationModule.providesReadyToInstallNotificationManager(installManager);
        C10825c.m36718a(providesReadyToInstallNotificationManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesReadyToInstallNotificationManager;
    }

    public ReadyToInstallNotificationManager get() {
        return providesReadyToInstallNotificationManager(this.module, this.installManagerProvider.get());
    }
}
