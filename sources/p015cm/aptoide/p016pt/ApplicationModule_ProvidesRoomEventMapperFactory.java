package p015cm.aptoide.p016pt;

import com.fasterxml.jackson.databind.ObjectMapper;
import javax.inject.Provider;
import p015cm.aptoide.p016pt.database.RoomEventMapper;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesRoomEventMapperFactory */
public final class ApplicationModule_ProvidesRoomEventMapperFactory implements C10824b<RoomEventMapper> {
    private final ApplicationModule module;
    private final Provider<ObjectMapper> objectMapperProvider;

    public ApplicationModule_ProvidesRoomEventMapperFactory(ApplicationModule applicationModule, Provider<ObjectMapper> provider) {
        this.module = applicationModule;
        this.objectMapperProvider = provider;
    }

    public static ApplicationModule_ProvidesRoomEventMapperFactory create(ApplicationModule applicationModule, Provider<ObjectMapper> provider) {
        return new ApplicationModule_ProvidesRoomEventMapperFactory(applicationModule, provider);
    }

    public static RoomEventMapper providesRoomEventMapper(ApplicationModule applicationModule, ObjectMapper objectMapper) {
        RoomEventMapper providesRoomEventMapper = applicationModule.providesRoomEventMapper(objectMapper);
        C10825c.m36718a(providesRoomEventMapper, "Cannot return null from a non-@Nullable @Provides method");
        return providesRoomEventMapper;
    }

    public RoomEventMapper get() {
        return providesRoomEventMapper(this.module, this.objectMapperProvider.get());
    }
}
