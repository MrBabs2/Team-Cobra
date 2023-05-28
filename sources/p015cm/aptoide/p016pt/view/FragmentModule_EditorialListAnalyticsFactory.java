package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.editorialList.EditorialListAnalytics;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_EditorialListAnalyticsFactory */
public final class FragmentModule_EditorialListAnalyticsFactory implements C10824b<EditorialListAnalytics> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final FragmentModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;

    public FragmentModule_EditorialListAnalyticsFactory(FragmentModule fragmentModule, Provider<NavigationTracker> provider, Provider<AnalyticsManager> provider2) {
        this.module = fragmentModule;
        this.navigationTrackerProvider = provider;
        this.analyticsManagerProvider = provider2;
    }

    public static FragmentModule_EditorialListAnalyticsFactory create(FragmentModule fragmentModule, Provider<NavigationTracker> provider, Provider<AnalyticsManager> provider2) {
        return new FragmentModule_EditorialListAnalyticsFactory(fragmentModule, provider, provider2);
    }

    public static EditorialListAnalytics editorialListAnalytics(FragmentModule fragmentModule, NavigationTracker navigationTracker, AnalyticsManager analyticsManager) {
        EditorialListAnalytics editorialListAnalytics = fragmentModule.editorialListAnalytics(navigationTracker, analyticsManager);
        C10825c.m36718a(editorialListAnalytics, "Cannot return null from a non-@Nullable @Provides method");
        return editorialListAnalytics;
    }

    public EditorialListAnalytics get() {
        return editorialListAnalytics(this.module, this.navigationTrackerProvider.get(), this.analyticsManagerProvider.get());
    }
}
