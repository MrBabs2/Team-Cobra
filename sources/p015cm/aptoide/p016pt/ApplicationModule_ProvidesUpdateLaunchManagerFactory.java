package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesUpdateLaunchManagerFactory */
public final class ApplicationModule_ProvidesUpdateLaunchManagerFactory implements C10824b<UpdateLaunchManager> {
    private final Provider<FollowedStoresManager> followedStoresManagerProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesUpdateLaunchManagerFactory(ApplicationModule applicationModule, Provider<FollowedStoresManager> provider) {
        this.module = applicationModule;
        this.followedStoresManagerProvider = provider;
    }

    public static ApplicationModule_ProvidesUpdateLaunchManagerFactory create(ApplicationModule applicationModule, Provider<FollowedStoresManager> provider) {
        return new ApplicationModule_ProvidesUpdateLaunchManagerFactory(applicationModule, provider);
    }

    public static UpdateLaunchManager providesUpdateLaunchManager(ApplicationModule applicationModule, FollowedStoresManager followedStoresManager) {
        UpdateLaunchManager providesUpdateLaunchManager = applicationModule.providesUpdateLaunchManager(followedStoresManager);
        C10825c.m36718a(providesUpdateLaunchManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesUpdateLaunchManager;
    }

    public UpdateLaunchManager get() {
        return providesUpdateLaunchManager(this.module, this.followedStoresManagerProvider.get());
    }
}
