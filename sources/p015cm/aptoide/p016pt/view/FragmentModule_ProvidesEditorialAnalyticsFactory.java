package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;
import p015cm.aptoide.p016pt.download.SplitAnalyticsMapper;
import p015cm.aptoide.p016pt.editorial.EditorialAnalytics;
import p015cm.aptoide.p016pt.install.InstallAnalytics;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesEditorialAnalyticsFactory */
public final class FragmentModule_ProvidesEditorialAnalyticsFactory implements C10824b<EditorialAnalytics> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<DownloadAnalytics> downloadAnalyticsProvider;
    private final Provider<InstallAnalytics> installAnalyticsProvider;
    private final FragmentModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;
    private final Provider<SplitAnalyticsMapper> splitAnalyticsMapperProvider;

    public FragmentModule_ProvidesEditorialAnalyticsFactory(FragmentModule fragmentModule, Provider<DownloadAnalytics> provider, Provider<AnalyticsManager> provider2, Provider<NavigationTracker> provider3, Provider<InstallAnalytics> provider4, Provider<SplitAnalyticsMapper> provider5) {
        this.module = fragmentModule;
        this.downloadAnalyticsProvider = provider;
        this.analyticsManagerProvider = provider2;
        this.navigationTrackerProvider = provider3;
        this.installAnalyticsProvider = provider4;
        this.splitAnalyticsMapperProvider = provider5;
    }

    public static FragmentModule_ProvidesEditorialAnalyticsFactory create(FragmentModule fragmentModule, Provider<DownloadAnalytics> provider, Provider<AnalyticsManager> provider2, Provider<NavigationTracker> provider3, Provider<InstallAnalytics> provider4, Provider<SplitAnalyticsMapper> provider5) {
        return new FragmentModule_ProvidesEditorialAnalyticsFactory(fragmentModule, provider, provider2, provider3, provider4, provider5);
    }

    public static EditorialAnalytics providesEditorialAnalytics(FragmentModule fragmentModule, DownloadAnalytics downloadAnalytics, AnalyticsManager analyticsManager, NavigationTracker navigationTracker, InstallAnalytics installAnalytics, SplitAnalyticsMapper splitAnalyticsMapper) {
        EditorialAnalytics providesEditorialAnalytics = fragmentModule.providesEditorialAnalytics(downloadAnalytics, analyticsManager, navigationTracker, installAnalytics, splitAnalyticsMapper);
        C10825c.m36718a(providesEditorialAnalytics, "Cannot return null from a non-@Nullable @Provides method");
        return providesEditorialAnalytics;
    }

    public EditorialAnalytics get() {
        return providesEditorialAnalytics(this.module, this.downloadAnalyticsProvider.get(), this.analyticsManagerProvider.get(), this.navigationTrackerProvider.get(), this.installAnalyticsProvider.get(), this.splitAnalyticsMapperProvider.get());
    }
}
