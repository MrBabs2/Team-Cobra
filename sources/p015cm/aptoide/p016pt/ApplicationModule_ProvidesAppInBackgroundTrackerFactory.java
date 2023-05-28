package p015cm.aptoide.p016pt;

import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesAppInBackgroundTrackerFactory */
public final class ApplicationModule_ProvidesAppInBackgroundTrackerFactory implements C10824b<AppInBackgroundTracker> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesAppInBackgroundTrackerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesAppInBackgroundTrackerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesAppInBackgroundTrackerFactory(applicationModule);
    }

    public static AppInBackgroundTracker providesAppInBackgroundTracker(ApplicationModule applicationModule) {
        AppInBackgroundTracker providesAppInBackgroundTracker = applicationModule.providesAppInBackgroundTracker();
        C10825c.m36718a(providesAppInBackgroundTracker, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppInBackgroundTracker;
    }

    public AppInBackgroundTracker get() {
        return providesAppInBackgroundTracker(this.module);
    }
}
