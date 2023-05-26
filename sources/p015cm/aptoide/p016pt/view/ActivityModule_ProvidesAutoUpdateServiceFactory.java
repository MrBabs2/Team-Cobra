package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.autoupdate.AutoUpdateService;
import p015cm.aptoide.p016pt.autoupdate.Service;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvidesAutoUpdateServiceFactory */
public final class ActivityModule_ProvidesAutoUpdateServiceFactory implements C10824b<AutoUpdateService> {
    private final Provider<Integer> clientSdkVersionProvider;
    private final ActivityModule module;
    private final Provider<String> packageNameProvider;
    private final Provider<Service> serviceProvider;

    public ActivityModule_ProvidesAutoUpdateServiceFactory(ActivityModule activityModule, Provider<Service> provider, Provider<String> provider2, Provider<Integer> provider3) {
        this.module = activityModule;
        this.serviceProvider = provider;
        this.packageNameProvider = provider2;
        this.clientSdkVersionProvider = provider3;
    }

    public static ActivityModule_ProvidesAutoUpdateServiceFactory create(ActivityModule activityModule, Provider<Service> provider, Provider<String> provider2, Provider<Integer> provider3) {
        return new ActivityModule_ProvidesAutoUpdateServiceFactory(activityModule, provider, provider2, provider3);
    }

    public static AutoUpdateService providesAutoUpdateService(ActivityModule activityModule, Service service, String str, int i) {
        AutoUpdateService providesAutoUpdateService = activityModule.providesAutoUpdateService(service, str, i);
        C10825c.m36718a(providesAutoUpdateService, "Cannot return null from a non-@Nullable @Provides method");
        return providesAutoUpdateService;
    }

    public AutoUpdateService get() {
        return providesAutoUpdateService(this.module, this.serviceProvider.get(), this.packageNameProvider.get(), this.clientSdkVersionProvider.get().intValue());
    }
}
