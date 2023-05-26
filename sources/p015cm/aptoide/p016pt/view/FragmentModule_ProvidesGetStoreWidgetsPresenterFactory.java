package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.app.view.MoreBundleManager;
import p015cm.aptoide.p016pt.app.view.MoreBundlePresenter;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.home.ChipManager;
import p015cm.aptoide.p016pt.home.HomeAnalytics;
import p015cm.aptoide.p016pt.home.HomeNavigator;
import p015cm.aptoide.p016pt.home.bundles.ads.AdMapper;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesGetStoreWidgetsPresenterFactory */
public final class FragmentModule_ProvidesGetStoreWidgetsPresenterFactory implements C10824b<MoreBundlePresenter> {
    private final Provider<AdMapper> adMapperProvider;
    private final Provider<BundleEvent> bundleEventProvider;
    private final Provider<ChipManager> chipManagerProvider;
    private final Provider<CrashReport> crashReportProvider;
    private final Provider<HomeAnalytics> homeAnalyticsProvider;
    private final Provider<HomeNavigator> homeNavigatorProvider;
    private final FragmentModule module;
    private final Provider<MoreBundleManager> moreBundleManagerProvider;

    public FragmentModule_ProvidesGetStoreWidgetsPresenterFactory(FragmentModule fragmentModule, Provider<MoreBundleManager> provider, Provider<CrashReport> provider2, Provider<HomeNavigator> provider3, Provider<AdMapper> provider4, Provider<BundleEvent> provider5, Provider<HomeAnalytics> provider6, Provider<ChipManager> provider7) {
        this.module = fragmentModule;
        this.moreBundleManagerProvider = provider;
        this.crashReportProvider = provider2;
        this.homeNavigatorProvider = provider3;
        this.adMapperProvider = provider4;
        this.bundleEventProvider = provider5;
        this.homeAnalyticsProvider = provider6;
        this.chipManagerProvider = provider7;
    }

    public static FragmentModule_ProvidesGetStoreWidgetsPresenterFactory create(FragmentModule fragmentModule, Provider<MoreBundleManager> provider, Provider<CrashReport> provider2, Provider<HomeNavigator> provider3, Provider<AdMapper> provider4, Provider<BundleEvent> provider5, Provider<HomeAnalytics> provider6, Provider<ChipManager> provider7) {
        return new FragmentModule_ProvidesGetStoreWidgetsPresenterFactory(fragmentModule, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static MoreBundlePresenter providesGetStoreWidgetsPresenter(FragmentModule fragmentModule, MoreBundleManager moreBundleManager, CrashReport crashReport, HomeNavigator homeNavigator, AdMapper adMapper, BundleEvent bundleEvent, HomeAnalytics homeAnalytics, ChipManager chipManager) {
        MoreBundlePresenter providesGetStoreWidgetsPresenter = fragmentModule.providesGetStoreWidgetsPresenter(moreBundleManager, crashReport, homeNavigator, adMapper, bundleEvent, homeAnalytics, chipManager);
        C10825c.m36718a(providesGetStoreWidgetsPresenter, "Cannot return null from a non-@Nullable @Provides method");
        return providesGetStoreWidgetsPresenter;
    }

    public MoreBundlePresenter get() {
        return providesGetStoreWidgetsPresenter(this.module, this.moreBundleManagerProvider.get(), this.crashReportProvider.get(), this.homeNavigatorProvider.get(), this.adMapperProvider.get(), this.bundleEventProvider.get(), this.homeAnalyticsProvider.get(), this.chipManagerProvider.get());
    }
}
