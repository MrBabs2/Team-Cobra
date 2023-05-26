package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.database.RoomExperimentMapper;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesRoomExperimentMapperFactory */
public final class ApplicationModule_ProvidesRoomExperimentMapperFactory implements C10824b<RoomExperimentMapper> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesRoomExperimentMapperFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesRoomExperimentMapperFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesRoomExperimentMapperFactory(applicationModule);
    }

    public static RoomExperimentMapper providesRoomExperimentMapper(ApplicationModule applicationModule) {
        RoomExperimentMapper providesRoomExperimentMapper = applicationModule.providesRoomExperimentMapper();
        C10825c.m36718a(providesRoomExperimentMapper, "Cannot return null from a non-@Nullable @Provides method");
        return providesRoomExperimentMapper;
    }

    public RoomExperimentMapper get() {
        return providesRoomExperimentMapper(this.module);
    }
}
