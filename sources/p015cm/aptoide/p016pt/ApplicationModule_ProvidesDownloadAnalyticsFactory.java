package p015cm.aptoide.p016pt;

import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesDownloadAnalyticsFactory */
public final class ApplicationModule_ProvidesDownloadAnalyticsFactory implements C10824b<DownloadAnalytics> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<ConnectivityManager> connectivityManagerProvider;
    private final ApplicationModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;
    private final Provider<TelephonyManager> providesSystemServiceProvider;

    public ApplicationModule_ProvidesDownloadAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2, Provider<ConnectivityManager> provider3, Provider<TelephonyManager> provider4) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
        this.navigationTrackerProvider = provider2;
        this.connectivityManagerProvider = provider3;
        this.providesSystemServiceProvider = provider4;
    }

    public static ApplicationModule_ProvidesDownloadAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2, Provider<ConnectivityManager> provider3, Provider<TelephonyManager> provider4) {
        return new ApplicationModule_ProvidesDownloadAnalyticsFactory(applicationModule, provider, provider2, provider3, provider4);
    }

    public static DownloadAnalytics providesDownloadAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager, NavigationTracker navigationTracker, ConnectivityManager connectivityManager, TelephonyManager telephonyManager) {
        DownloadAnalytics providesDownloadAnalytics = applicationModule.providesDownloadAnalytics(analyticsManager, navigationTracker, connectivityManager, telephonyManager);
        C10825c.m36718a(providesDownloadAnalytics, "Cannot return null from a non-@Nullable @Provides method");
        return providesDownloadAnalytics;
    }

    public DownloadAnalytics get() {
        return providesDownloadAnalytics(this.module, this.analyticsManagerProvider.get(), this.navigationTrackerProvider.get(), this.connectivityManagerProvider.get(), this.providesSystemServiceProvider.get());
    }
}
