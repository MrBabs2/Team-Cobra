package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.database.room.AptoideDatabase;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAptoideDataBaseFactory */
public final class ApplicationModule_ProvidesAptoideDataBaseFactory implements C10824b<AptoideDatabase> {
    private final ApplicationModule module;
    private final Provider<RoomMigrationProvider> roomMigrationProvider;

    public ApplicationModule_ProvidesAptoideDataBaseFactory(ApplicationModule applicationModule, Provider<RoomMigrationProvider> provider) {
        this.module = applicationModule;
        this.roomMigrationProvider = provider;
    }

    public static ApplicationModule_ProvidesAptoideDataBaseFactory create(ApplicationModule applicationModule, Provider<RoomMigrationProvider> provider) {
        return new ApplicationModule_ProvidesAptoideDataBaseFactory(applicationModule, provider);
    }

    public static AptoideDatabase providesAptoideDataBase(ApplicationModule applicationModule, RoomMigrationProvider roomMigrationProvider2) {
        AptoideDatabase providesAptoideDataBase = applicationModule.providesAptoideDataBase(roomMigrationProvider2);
        C10825c.m36718a(providesAptoideDataBase, "Cannot return null from a non-@Nullable @Provides method");
        return providesAptoideDataBase;
    }

    public AptoideDatabase get() {
        return providesAptoideDataBase(this.module, this.roomMigrationProvider.get());
    }
}
