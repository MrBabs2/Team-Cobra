package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.database.RoomInstallationMapper;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesRoomInstallationMapperFactory */
public final class ApplicationModule_ProvidesRoomInstallationMapperFactory implements C10824b<RoomInstallationMapper> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesRoomInstallationMapperFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesRoomInstallationMapperFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesRoomInstallationMapperFactory(applicationModule);
    }

    public static RoomInstallationMapper providesRoomInstallationMapper(ApplicationModule applicationModule) {
        RoomInstallationMapper providesRoomInstallationMapper = applicationModule.providesRoomInstallationMapper();
        C10825c.m36718a(providesRoomInstallationMapper, "Cannot return null from a non-@Nullable @Provides method");
        return providesRoomInstallationMapper;
    }

    public RoomInstallationMapper get() {
        return providesRoomInstallationMapper(this.module);
    }
}
