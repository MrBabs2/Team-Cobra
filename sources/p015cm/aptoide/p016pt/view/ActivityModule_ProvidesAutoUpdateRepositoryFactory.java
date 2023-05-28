package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.autoupdate.AutoUpdateRepository;
import p015cm.aptoide.p016pt.autoupdate.AutoUpdateService;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvidesAutoUpdateRepositoryFactory */
public final class ActivityModule_ProvidesAutoUpdateRepositoryFactory implements C10824b<AutoUpdateRepository> {
    private final Provider<AutoUpdateService> autoUpdateServiceProvider;
    private final ActivityModule module;

    public ActivityModule_ProvidesAutoUpdateRepositoryFactory(ActivityModule activityModule, Provider<AutoUpdateService> provider) {
        this.module = activityModule;
        this.autoUpdateServiceProvider = provider;
    }

    public static ActivityModule_ProvidesAutoUpdateRepositoryFactory create(ActivityModule activityModule, Provider<AutoUpdateService> provider) {
        return new ActivityModule_ProvidesAutoUpdateRepositoryFactory(activityModule, provider);
    }

    public static AutoUpdateRepository providesAutoUpdateRepository(ActivityModule activityModule, AutoUpdateService autoUpdateService) {
        AutoUpdateRepository providesAutoUpdateRepository = activityModule.providesAutoUpdateRepository(autoUpdateService);
        C10825c.m36718a(providesAutoUpdateRepository, "Cannot return null from a non-@Nullable @Provides method");
        return providesAutoUpdateRepository;
    }

    public AutoUpdateRepository get() {
        return providesAutoUpdateRepository(this.module, this.autoUpdateServiceProvider.get());
    }
}
