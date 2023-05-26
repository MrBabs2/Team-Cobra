package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.home.AppComingSoonRegistrationManager;
import p015cm.aptoide.p016pt.notification.ComingSoonNotificationManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesComingSoonNotificationManagerFactory */
public final class ApplicationModule_ProvidesComingSoonNotificationManagerFactory implements C10824b<ComingSoonNotificationManager> {
    private final Provider<AppComingSoonRegistrationManager> appComingSoonRegistrationManagerProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesComingSoonNotificationManagerFactory(ApplicationModule applicationModule, Provider<AppComingSoonRegistrationManager> provider) {
        this.module = applicationModule;
        this.appComingSoonRegistrationManagerProvider = provider;
    }

    public static ApplicationModule_ProvidesComingSoonNotificationManagerFactory create(ApplicationModule applicationModule, Provider<AppComingSoonRegistrationManager> provider) {
        return new ApplicationModule_ProvidesComingSoonNotificationManagerFactory(applicationModule, provider);
    }

    public static ComingSoonNotificationManager providesComingSoonNotificationManager(ApplicationModule applicationModule, AppComingSoonRegistrationManager appComingSoonRegistrationManager) {
        ComingSoonNotificationManager providesComingSoonNotificationManager = applicationModule.providesComingSoonNotificationManager(appComingSoonRegistrationManager);
        C10825c.m36718a(providesComingSoonNotificationManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesComingSoonNotificationManager;
    }

    public ComingSoonNotificationManager get() {
        return providesComingSoonNotificationManager(this.module, this.appComingSoonRegistrationManagerProvider.get());
    }
}
