package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.AppCoinsManager;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.install.InstallManager;
import p015cm.aptoide.p016pt.socialmedia.SocialMediaAnalytics;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesAppCoinsInfoPresenterFactory */
public final class FragmentModule_ProvidesAppCoinsInfoPresenterFactory implements C10824b<AppCoinsInfoPresenter> {
    private final Provider<AppCoinsInfoNavigator> appCoinsInfoNavigatorProvider;
    private final Provider<AppCoinsManager> appCoinsManagerProvider;
    private final Provider<CrashReport> crashReportProvider;
    private final Provider<InstallManager> installManagerProvider;
    private final FragmentModule module;
    private final Provider<SocialMediaAnalytics> socialMediaAnalyticsProvider;

    public FragmentModule_ProvidesAppCoinsInfoPresenterFactory(FragmentModule fragmentModule, Provider<AppCoinsInfoNavigator> provider, Provider<InstallManager> provider2, Provider<CrashReport> provider3, Provider<SocialMediaAnalytics> provider4, Provider<AppCoinsManager> provider5) {
        this.module = fragmentModule;
        this.appCoinsInfoNavigatorProvider = provider;
        this.installManagerProvider = provider2;
        this.crashReportProvider = provider3;
        this.socialMediaAnalyticsProvider = provider4;
        this.appCoinsManagerProvider = provider5;
    }

    public static FragmentModule_ProvidesAppCoinsInfoPresenterFactory create(FragmentModule fragmentModule, Provider<AppCoinsInfoNavigator> provider, Provider<InstallManager> provider2, Provider<CrashReport> provider3, Provider<SocialMediaAnalytics> provider4, Provider<AppCoinsManager> provider5) {
        return new FragmentModule_ProvidesAppCoinsInfoPresenterFactory(fragmentModule, provider, provider2, provider3, provider4, provider5);
    }

    public static AppCoinsInfoPresenter providesAppCoinsInfoPresenter(FragmentModule fragmentModule, AppCoinsInfoNavigator appCoinsInfoNavigator, InstallManager installManager, CrashReport crashReport, SocialMediaAnalytics socialMediaAnalytics, AppCoinsManager appCoinsManager) {
        AppCoinsInfoPresenter providesAppCoinsInfoPresenter = fragmentModule.providesAppCoinsInfoPresenter(appCoinsInfoNavigator, installManager, crashReport, socialMediaAnalytics, appCoinsManager);
        C10825c.m36718a(providesAppCoinsInfoPresenter, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppCoinsInfoPresenter;
    }

    public AppCoinsInfoPresenter get() {
        return providesAppCoinsInfoPresenter(this.module, this.appCoinsInfoNavigatorProvider.get(), this.installManagerProvider.get(), this.crashReportProvider.get(), this.socialMediaAnalyticsProvider.get(), this.appCoinsManagerProvider.get());
    }
}
