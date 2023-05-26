package p015cm.aptoide.p016pt;

import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import javax.inject.Provider;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.install.InstallAnalytics;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideInstallAnalyticsFactory */
public final class ApplicationModule_ProvideInstallAnalyticsFactory implements C10824b<InstallAnalytics> {
    private final Provider<AnalyticsManager> analyticsManagerProvider;
    private final Provider<ConnectivityManager> connectivityManagerProvider;
    private final ApplicationModule module;
    private final Provider<NavigationTracker> navigationTrackerProvider;
    private final Provider<TelephonyManager> telephonyManagerProvider;

    public ApplicationModule_ProvideInstallAnalyticsFactory(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2, Provider<ConnectivityManager> provider3, Provider<TelephonyManager> provider4) {
        this.module = applicationModule;
        this.analyticsManagerProvider = provider;
        this.navigationTrackerProvider = provider2;
        this.connectivityManagerProvider = provider3;
        this.telephonyManagerProvider = provider4;
    }

    public static ApplicationModule_ProvideInstallAnalyticsFactory create(ApplicationModule applicationModule, Provider<AnalyticsManager> provider, Provider<NavigationTracker> provider2, Provider<ConnectivityManager> provider3, Provider<TelephonyManager> provider4) {
        return new ApplicationModule_ProvideInstallAnalyticsFactory(applicationModule, provider, provider2, provider3, provider4);
    }

    public static InstallAnalytics provideInstallAnalytics(ApplicationModule applicationModule, AnalyticsManager analyticsManager, NavigationTracker navigationTracker, ConnectivityManager connectivityManager, TelephonyManager telephonyManager) {
        InstallAnalytics provideInstallAnalytics = applicationModule.provideInstallAnalytics(analyticsManager, navigationTracker, connectivityManager, telephonyManager);
        C10825c.m36718a(provideInstallAnalytics, "Cannot return null from a non-@Nullable @Provides method");
        return provideInstallAnalytics;
    }

    public InstallAnalytics get() {
        return provideInstallAnalytics(this.module, this.analyticsManagerProvider.get(), this.navigationTrackerProvider.get(), this.connectivityManagerProvider.get(), this.telephonyManagerProvider.get());
    }
}
