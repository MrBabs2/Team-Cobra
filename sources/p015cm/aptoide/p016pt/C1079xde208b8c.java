package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.database.room.AptoideDatabase;
import p015cm.aptoide.p016pt.home.AppComingSoonRegistrationPersistence;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAppComingSoonRegistrationPersistenceFactory */
public final class C1079xde208b8c implements C10824b<AppComingSoonRegistrationPersistence> {
    private final Provider<AptoideDatabase> databaseProvider;
    private final ApplicationModule module;

    public C1079xde208b8c(ApplicationModule applicationModule, Provider<AptoideDatabase> provider) {
        this.module = applicationModule;
        this.databaseProvider = provider;
    }

    public static C1079xde208b8c create(ApplicationModule applicationModule, Provider<AptoideDatabase> provider) {
        return new C1079xde208b8c(applicationModule, provider);
    }

    public static AppComingSoonRegistrationPersistence providesAppComingSoonRegistrationPersistence(ApplicationModule applicationModule, AptoideDatabase aptoideDatabase) {
        AppComingSoonRegistrationPersistence providesAppComingSoonRegistrationPersistence = applicationModule.providesAppComingSoonRegistrationPersistence(aptoideDatabase);
        C10825c.m36718a(providesAppComingSoonRegistrationPersistence, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppComingSoonRegistrationPersistence;
    }

    public AppComingSoonRegistrationPersistence get() {
        return providesAppComingSoonRegistrationPersistence(this.module, this.databaseProvider.get());
    }
}
