package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.notification.UpdatesNotificationManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesUpdatesNotificationManagerFactory */
public final class ApplicationModule_ProvidesUpdatesNotificationManagerFactory implements C10824b<UpdatesNotificationManager> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesUpdatesNotificationManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesUpdatesNotificationManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesUpdatesNotificationManagerFactory(applicationModule);
    }

    public static UpdatesNotificationManager providesUpdatesNotificationManager(ApplicationModule applicationModule) {
        UpdatesNotificationManager providesUpdatesNotificationManager = applicationModule.providesUpdatesNotificationManager();
        C10825c.m36718a(providesUpdatesNotificationManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesUpdatesNotificationManager;
    }

    public UpdatesNotificationManager get() {
        return providesUpdatesNotificationManager(this.module);
    }
}
