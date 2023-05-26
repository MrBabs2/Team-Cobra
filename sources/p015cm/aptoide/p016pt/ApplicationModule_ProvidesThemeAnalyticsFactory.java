package p015cm.aptoide.p016pt;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.p016pt.themes.ThemeAnalytics;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesThemeAnalyticsFactory */
public final class ApplicationModule_ProvidesThemeAnalyticsFactory implements C10824b<ThemeAnalytics> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final ApplicationModule module;

    public ApplicationModule_ProvidesThemeAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
    }

    public static ApplicationModule_ProvidesThemeAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider) {
        return new ApplicationModule_ProvidesThemeAnalyticsFactory(applicationModule, provider);
    }

    public static ThemeAnalytics providesThemeAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager) {
        ThemeAnalytics providesThemeAnalytics = applicationModule.providesThemeAnalytics(analyticsManager);
        C10825c.m36718a(providesThemeAnalytics, "Cannot return null from a non-@Nullable @Provides method");
        return providesThemeAnalytics;
    }

    public ThemeAnalytics get() {
        return providesThemeAnalytics(this.module, this.analyticsManagerProvider.get());
    }
}
