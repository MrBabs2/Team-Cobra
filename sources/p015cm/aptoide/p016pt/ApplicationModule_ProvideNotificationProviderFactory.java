package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.database.RoomNotificationPersistence;
import p015cm.aptoide.p016pt.notification.NotificationProvider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideNotificationProviderFactory */
public final class ApplicationModule_ProvideNotificationProviderFactory implements C10824b<NotificationProvider> {
    private final ApplicationModule module;
    private final Provider<RoomNotificationPersistence> notificationPersistenceProvider;

    public ApplicationModule_ProvideNotificationProviderFactory(ApplicationModule applicationModule, Provider<RoomNotificationPersistence> provider) {
        this.module = applicationModule;
        this.notificationPersistenceProvider = provider;
    }

    public static ApplicationModule_ProvideNotificationProviderFactory create(ApplicationModule applicationModule, Provider<RoomNotificationPersistence> provider) {
        return new ApplicationModule_ProvideNotificationProviderFactory(applicationModule, provider);
    }

    public static NotificationProvider provideNotificationProvider(ApplicationModule applicationModule, RoomNotificationPersistence roomNotificationPersistence) {
        NotificationProvider provideNotificationProvider = applicationModule.provideNotificationProvider(roomNotificationPersistence);
        C10825c.m36718a(provideNotificationProvider, "Cannot return null from a non-@Nullable @Provides method");
        return provideNotificationProvider;
    }

    public NotificationProvider get() {
        return provideNotificationProvider(this.module, this.notificationPersistenceProvider.get());
    }
}
