package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.navigator.ExternalNavigator;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvidesExternalNavigatorFactory */
public final class ActivityModule_ProvidesExternalNavigatorFactory implements C10824b<ExternalNavigator> {
    private final ActivityModule module;
    private final Provider<ThemeManager> themeManagerProvider;

    public ActivityModule_ProvidesExternalNavigatorFactory(ActivityModule activityModule, Provider<ThemeManager> provider) {
        this.module = activityModule;
        this.themeManagerProvider = provider;
    }

    public static ActivityModule_ProvidesExternalNavigatorFactory create(ActivityModule activityModule, Provider<ThemeManager> provider) {
        return new ActivityModule_ProvidesExternalNavigatorFactory(activityModule, provider);
    }

    public static ExternalNavigator providesExternalNavigator(ActivityModule activityModule, ThemeManager themeManager) {
        ExternalNavigator providesExternalNavigator = activityModule.providesExternalNavigator(themeManager);
        C10825c.m36718a(providesExternalNavigator, "Cannot return null from a non-@Nullable @Provides method");
        return providesExternalNavigator;
    }

    public ExternalNavigator get() {
        return providesExternalNavigator(this.module, this.themeManagerProvider.get());
    }
}
