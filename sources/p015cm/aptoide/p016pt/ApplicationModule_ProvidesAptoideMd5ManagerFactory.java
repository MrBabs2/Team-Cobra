package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.appview.PreferencesPersister;
import p015cm.aptoide.p016pt.preferences.AptoideMd5Manager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAptoideMd5ManagerFactory */
public final class ApplicationModule_ProvidesAptoideMd5ManagerFactory implements C10824b<AptoideMd5Manager> {
    private final ApplicationModule module;
    private final Provider<PreferencesPersister> preferencesPersisterProvider;

    public ApplicationModule_ProvidesAptoideMd5ManagerFactory(ApplicationModule applicationModule, Provider<PreferencesPersister> provider) {
        this.module = applicationModule;
        this.preferencesPersisterProvider = provider;
    }

    public static ApplicationModule_ProvidesAptoideMd5ManagerFactory create(ApplicationModule applicationModule, Provider<PreferencesPersister> provider) {
        return new ApplicationModule_ProvidesAptoideMd5ManagerFactory(applicationModule, provider);
    }

    public static AptoideMd5Manager providesAptoideMd5Manager(ApplicationModule applicationModule, PreferencesPersister preferencesPersister) {
        AptoideMd5Manager providesAptoideMd5Manager = applicationModule.providesAptoideMd5Manager(preferencesPersister);
        C10825c.m36718a(providesAptoideMd5Manager, "Cannot return null from a non-@Nullable @Provides method");
        return providesAptoideMd5Manager;
    }

    public AptoideMd5Manager get() {
        return providesAptoideMd5Manager(this.module, this.preferencesPersisterProvider.get());
    }
}
