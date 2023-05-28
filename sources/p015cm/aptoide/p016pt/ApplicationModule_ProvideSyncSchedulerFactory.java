package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.sync.SyncScheduler;
import p015cm.aptoide.p016pt.sync.alarm.SyncStorage;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideSyncSchedulerFactory */
public final class ApplicationModule_ProvideSyncSchedulerFactory implements C10824b<SyncScheduler> {
    private final ApplicationModule module;
    private final Provider<SyncStorage> syncStorageProvider;

    public ApplicationModule_ProvideSyncSchedulerFactory(ApplicationModule applicationModule, Provider<SyncStorage> provider) {
        this.module = applicationModule;
        this.syncStorageProvider = provider;
    }

    public static ApplicationModule_ProvideSyncSchedulerFactory create(ApplicationModule applicationModule, Provider<SyncStorage> provider) {
        return new ApplicationModule_ProvideSyncSchedulerFactory(applicationModule, provider);
    }

    public static SyncScheduler provideSyncScheduler(ApplicationModule applicationModule, SyncStorage syncStorage) {
        SyncScheduler provideSyncScheduler = applicationModule.provideSyncScheduler(syncStorage);
        C10825c.m36718a(provideSyncScheduler, "Cannot return null from a non-@Nullable @Provides method");
        return provideSyncScheduler;
    }

    public SyncScheduler get() {
        return provideSyncScheduler(this.module, this.syncStorageProvider.get());
    }
}
