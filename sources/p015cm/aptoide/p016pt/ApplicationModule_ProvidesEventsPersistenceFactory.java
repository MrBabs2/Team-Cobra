package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.analytics.implementation.EventsPersistence;
import p015cm.aptoide.p016pt.database.RoomEventMapper;
import p015cm.aptoide.p016pt.database.room.AptoideDatabase;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesEventsPersistenceFactory */
public final class ApplicationModule_ProvidesEventsPersistenceFactory implements C10824b<EventsPersistence> {
    private final Provider<AptoideDatabase> aptoideDatabaseProvider;
    private final Provider<RoomEventMapper> mapperProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesEventsPersistenceFactory(ApplicationModule applicationModule, Provider<AptoideDatabase> provider, Provider<RoomEventMapper> provider2) {
        this.module = applicationModule;
        this.aptoideDatabaseProvider = provider;
        this.mapperProvider = provider2;
    }

    public static ApplicationModule_ProvidesEventsPersistenceFactory create(ApplicationModule applicationModule, Provider<AptoideDatabase> provider, Provider<RoomEventMapper> provider2) {
        return new ApplicationModule_ProvidesEventsPersistenceFactory(applicationModule, provider, provider2);
    }

    public static EventsPersistence providesEventsPersistence(ApplicationModule applicationModule, AptoideDatabase aptoideDatabase, RoomEventMapper roomEventMapper) {
        EventsPersistence providesEventsPersistence = applicationModule.providesEventsPersistence(aptoideDatabase, roomEventMapper);
        C10825c.m36718a(providesEventsPersistence, "Cannot return null from a non-@Nullable @Provides method");
        return providesEventsPersistence;
    }

    public EventsPersistence get() {
        return providesEventsPersistence(this.module, this.aptoideDatabaseProvider.get(), this.mapperProvider.get());
    }
}
