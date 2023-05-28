package p015cm.aptoide.p016pt.view;

import p015cm.aptoide.p016pt.themes.ThemeManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvidesThemeManagerFactory */
public final class ActivityModule_ProvidesThemeManagerFactory implements C10824b<ThemeManager> {
    private final ActivityModule module;

    public ActivityModule_ProvidesThemeManagerFactory(ActivityModule activityModule) {
        this.module = activityModule;
    }

    public static ActivityModule_ProvidesThemeManagerFactory create(ActivityModule activityModule) {
        return new ActivityModule_ProvidesThemeManagerFactory(activityModule);
    }

    public static ThemeManager providesThemeManager(ActivityModule activityModule) {
        ThemeManager providesThemeManager = activityModule.providesThemeManager();
        C10825c.m36718a(providesThemeManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesThemeManager;
    }

    public ThemeManager get() {
        return providesThemeManager(this.module);
    }
}
