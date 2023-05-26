package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.database.RoomInstallationPersistence;
import p015cm.aptoide.p016pt.database.room.AptoideDatabase;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesInstallationAccessorFactory */
public final class ApplicationModule_ProvidesInstallationAccessorFactory implements C10824b<RoomInstallationPersistence> {
    private final Provider<AptoideDatabase> databaseProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesInstallationAccessorFactory(ApplicationModule applicationModule, Provider<AptoideDatabase> provider) {
        this.module = applicationModule;
        this.databaseProvider = provider;
    }

    public static ApplicationModule_ProvidesInstallationAccessorFactory create(ApplicationModule applicationModule, Provider<AptoideDatabase> provider) {
        return new ApplicationModule_ProvidesInstallationAccessorFactory(applicationModule, provider);
    }

    public static RoomInstallationPersistence providesInstallationAccessor(ApplicationModule applicationModule, AptoideDatabase aptoideDatabase) {
        RoomInstallationPersistence providesInstallationAccessor = applicationModule.providesInstallationAccessor(aptoideDatabase);
        C10825c.m36718a(providesInstallationAccessor, "Cannot return null from a non-@Nullable @Provides method");
        return providesInstallationAccessor;
    }

    public RoomInstallationPersistence get() {
        return providesInstallationAccessor(this.module, this.databaseProvider.get());
    }
}
