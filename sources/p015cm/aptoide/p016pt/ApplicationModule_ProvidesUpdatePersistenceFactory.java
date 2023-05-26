package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.database.room.AptoideDatabase;
import p015cm.aptoide.p016pt.updates.UpdatePersistence;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesUpdatePersistenceFactory */
public final class ApplicationModule_ProvidesUpdatePersistenceFactory implements C10824b<UpdatePersistence> {
    private final Provider<AptoideDatabase> databaseProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesUpdatePersistenceFactory(ApplicationModule applicationModule, Provider<AptoideDatabase> provider) {
        this.module = applicationModule;
        this.databaseProvider = provider;
    }

    public static ApplicationModule_ProvidesUpdatePersistenceFactory create(ApplicationModule applicationModule, Provider<AptoideDatabase> provider) {
        return new ApplicationModule_ProvidesUpdatePersistenceFactory(applicationModule, provider);
    }

    public static UpdatePersistence providesUpdatePersistence(ApplicationModule applicationModule, AptoideDatabase aptoideDatabase) {
        UpdatePersistence providesUpdatePersistence = applicationModule.providesUpdatePersistence(aptoideDatabase);
        C10825c.m36718a(providesUpdatePersistence, "Cannot return null from a non-@Nullable @Provides method");
        return providesUpdatePersistence;
    }

    public UpdatePersistence get() {
        return providesUpdatePersistence(this.module, this.databaseProvider.get());
    }
}
