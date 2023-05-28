package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.aab.DynamicSplitsManager;
import p015cm.aptoide.p016pt.ads.MoPubAdsManager;
import p015cm.aptoide.p016pt.app.DownloadStateParser;
import p015cm.aptoide.p016pt.download.DownloadFactory;
import p015cm.aptoide.p016pt.download.SplitAnalyticsMapper;
import p015cm.aptoide.p016pt.editorial.EditorialAnalytics;
import p015cm.aptoide.p016pt.editorial.EditorialManager;
import p015cm.aptoide.p016pt.editorial.EditorialRepository;
import p015cm.aptoide.p016pt.install.InstallAnalytics;
import p015cm.aptoide.p016pt.install.InstallManager;
import p015cm.aptoide.p016pt.notification.NotificationAnalytics;
import p015cm.aptoide.p016pt.reactions.ReactionsManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesEditorialManagerFactory */
public final class FragmentModule_ProvidesEditorialManagerFactory implements C10824b<EditorialManager> {
    private final Provider<DownloadFactory> downloadFactoryProvider;
    private final Provider<DownloadStateParser> downloadStateParserProvider;
    private final Provider<DynamicSplitsManager> dynamicSplitsManagerProvider;
    private final Provider<EditorialAnalytics> editorialAnalyticsProvider;
    private final Provider<EditorialRepository> editorialRepositoryProvider;
    private final Provider<InstallAnalytics> installAnalyticsProvider;
    private final Provider<InstallManager> installManagerProvider;
    private final Provider<MoPubAdsManager> moPubAdsManagerProvider;
    private final FragmentModule module;
    private final Provider<NotificationAnalytics> notificationAnalyticsProvider;
    private final Provider<ReactionsManager> reactionsManagerProvider;
    private final Provider<SplitAnalyticsMapper> splitAnalyticsMapperProvider;

    public FragmentModule_ProvidesEditorialManagerFactory(FragmentModule fragmentModule, Provider<EditorialRepository> provider, Provider<InstallManager> provider2, Provider<DownloadFactory> provider3, Provider<DownloadStateParser> provider4, Provider<NotificationAnalytics> provider5, Provider<InstallAnalytics> provider6, Provider<EditorialAnalytics> provider7, Provider<ReactionsManager> provider8, Provider<MoPubAdsManager> provider9, Provider<DynamicSplitsManager> provider10, Provider<SplitAnalyticsMapper> provider11) {
        this.module = fragmentModule;
        this.editorialRepositoryProvider = provider;
        this.installManagerProvider = provider2;
        this.downloadFactoryProvider = provider3;
        this.downloadStateParserProvider = provider4;
        this.notificationAnalyticsProvider = provider5;
        this.installAnalyticsProvider = provider6;
        this.editorialAnalyticsProvider = provider7;
        this.reactionsManagerProvider = provider8;
        this.moPubAdsManagerProvider = provider9;
        this.dynamicSplitsManagerProvider = provider10;
        this.splitAnalyticsMapperProvider = provider11;
    }

    public static FragmentModule_ProvidesEditorialManagerFactory create(FragmentModule fragmentModule, Provider<EditorialRepository> provider, Provider<InstallManager> provider2, Provider<DownloadFactory> provider3, Provider<DownloadStateParser> provider4, Provider<NotificationAnalytics> provider5, Provider<InstallAnalytics> provider6, Provider<EditorialAnalytics> provider7, Provider<ReactionsManager> provider8, Provider<MoPubAdsManager> provider9, Provider<DynamicSplitsManager> provider10, Provider<SplitAnalyticsMapper> provider11) {
        return new FragmentModule_ProvidesEditorialManagerFactory(fragmentModule, provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static EditorialManager providesEditorialManager(FragmentModule fragmentModule, EditorialRepository editorialRepository, InstallManager installManager, DownloadFactory downloadFactory, DownloadStateParser downloadStateParser, NotificationAnalytics notificationAnalytics, InstallAnalytics installAnalytics, EditorialAnalytics editorialAnalytics, ReactionsManager reactionsManager, MoPubAdsManager moPubAdsManager, DynamicSplitsManager dynamicSplitsManager, SplitAnalyticsMapper splitAnalyticsMapper) {
        EditorialManager providesEditorialManager = fragmentModule.providesEditorialManager(editorialRepository, installManager, downloadFactory, downloadStateParser, notificationAnalytics, installAnalytics, editorialAnalytics, reactionsManager, moPubAdsManager, dynamicSplitsManager, splitAnalyticsMapper);
        C10825c.m36718a(providesEditorialManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesEditorialManager;
    }

    public EditorialManager get() {
        return providesEditorialManager(this.module, this.editorialRepositoryProvider.get(), this.installManagerProvider.get(), this.downloadFactoryProvider.get(), this.downloadStateParserProvider.get(), this.notificationAnalyticsProvider.get(), this.installAnalyticsProvider.get(), this.editorialAnalyticsProvider.get(), this.reactionsManagerProvider.get(), this.moPubAdsManagerProvider.get(), this.dynamicSplitsManagerProvider.get(), this.splitAnalyticsMapperProvider.get());
    }
}
