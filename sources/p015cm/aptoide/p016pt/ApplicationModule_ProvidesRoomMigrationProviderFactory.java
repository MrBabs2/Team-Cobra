package p015cm.aptoide.p016pt;

import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesRoomMigrationProviderFactory */
public final class ApplicationModule_ProvidesRoomMigrationProviderFactory implements C10824b<RoomMigrationProvider> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesRoomMigrationProviderFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesRoomMigrationProviderFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesRoomMigrationProviderFactory(applicationModule);
    }

    public static RoomMigrationProvider providesRoomMigrationProvider(ApplicationModule applicationModule) {
        RoomMigrationProvider providesRoomMigrationProvider = applicationModule.providesRoomMigrationProvider();
        C10825c.m36718a(providesRoomMigrationProvider, "Cannot return null from a non-@Nullable @Provides method");
        return providesRoomMigrationProvider;
    }

    public RoomMigrationProvider get() {
        return providesRoomMigrationProvider(this.module);
    }
}
