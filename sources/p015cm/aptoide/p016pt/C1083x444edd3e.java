package p015cm.aptoide.p016pt;

import android.content.SharedPreferences;
import javax.inject.Provider;
import p015cm.aptoide.p016pt.app.aptoideinstall.AptoideInstallManager;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.notification.AptoideWorkerFactory;
import p015cm.aptoide.p016pt.sync.SyncScheduler;
import p015cm.aptoide.p016pt.sync.alarm.SyncStorage;
import p015cm.aptoide.p016pt.updates.UpdateRepository;
import p015cm.aptoide.p016pt.view.app.AppCenter;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesUpdatesNotificationWorkerFactoryFactory */
public final class C1083x444edd3e implements C10824b<AptoideWorkerFactory> {
    private final Provider<AppCenter> appCenterProvider;
    private final Provider<AptoideInstallManager> aptoideInstallManagerProvider;
    private final Provider<CrashReport> crashReportProvider;
    private final ApplicationModule module;
    private final Provider<SharedPreferences> sharedPreferencesProvider;
    private final Provider<SyncScheduler> syncSchedulerProvider;
    private final Provider<SyncStorage> syncStorageProvider;
    private final Provider<UpdateRepository> updateRepositoryProvider;

    public C1083x444edd3e(ApplicationModule applicationModule, Provider<UpdateRepository> provider, Provider<SharedPreferences> provider2, Provider<AptoideInstallManager> provider3, Provider<SyncScheduler> provider4, Provider<SyncStorage> provider5, Provider<CrashReport> provider6, Provider<AppCenter> provider7) {
        this.module = applicationModule;
        this.updateRepositoryProvider = provider;
        this.sharedPreferencesProvider = provider2;
        this.aptoideInstallManagerProvider = provider3;
        this.syncSchedulerProvider = provider4;
        this.syncStorageProvider = provider5;
        this.crashReportProvider = provider6;
        this.appCenterProvider = provider7;
    }

    public static C1083x444edd3e create(ApplicationModule applicationModule, Provider<UpdateRepository> provider, Provider<SharedPreferences> provider2, Provider<AptoideInstallManager> provider3, Provider<SyncScheduler> provider4, Provider<SyncStorage> provider5, Provider<CrashReport> provider6, Provider<AppCenter> provider7) {
        return new C1083x444edd3e(applicationModule, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static AptoideWorkerFactory providesUpdatesNotificationWorkerFactory(ApplicationModule applicationModule, UpdateRepository updateRepository, SharedPreferences sharedPreferences, AptoideInstallManager aptoideInstallManager, SyncScheduler syncScheduler, SyncStorage syncStorage, CrashReport crashReport, AppCenter appCenter) {
        AptoideWorkerFactory providesUpdatesNotificationWorkerFactory = applicationModule.providesUpdatesNotificationWorkerFactory(updateRepository, sharedPreferences, aptoideInstallManager, syncScheduler, syncStorage, crashReport, appCenter);
        C10825c.m36718a(providesUpdatesNotificationWorkerFactory, "Cannot return null from a non-@Nullable @Provides method");
        return providesUpdatesNotificationWorkerFactory;
    }

    public AptoideWorkerFactory get() {
        return providesUpdatesNotificationWorkerFactory(this.module, this.updateRepositoryProvider.get(), this.sharedPreferencesProvider.get(), this.aptoideInstallManagerProvider.get(), this.syncSchedulerProvider.get(), this.syncStorageProvider.get(), this.crashReportProvider.get(), this.appCenterProvider.get());
    }
}
