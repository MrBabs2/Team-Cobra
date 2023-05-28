package p015cm.aptoide.p016pt.view;

import p015cm.aptoide.p016pt.orientation.ScreenOrientationManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvideScreenOrientationManagerFactory */
public final class ActivityModule_ProvideScreenOrientationManagerFactory implements C10824b<ScreenOrientationManager> {
    private final ActivityModule module;

    public ActivityModule_ProvideScreenOrientationManagerFactory(ActivityModule activityModule) {
        this.module = activityModule;
    }

    public static ActivityModule_ProvideScreenOrientationManagerFactory create(ActivityModule activityModule) {
        return new ActivityModule_ProvideScreenOrientationManagerFactory(activityModule);
    }

    public static ScreenOrientationManager provideScreenOrientationManager(ActivityModule activityModule) {
        ScreenOrientationManager provideScreenOrientationManager = activityModule.provideScreenOrientationManager();
        C10825c.m36718a(provideScreenOrientationManager, "Cannot return null from a non-@Nullable @Provides method");
        return provideScreenOrientationManager;
    }

    public ScreenOrientationManager get() {
        return provideScreenOrientationManager(this.module);
    }
}
