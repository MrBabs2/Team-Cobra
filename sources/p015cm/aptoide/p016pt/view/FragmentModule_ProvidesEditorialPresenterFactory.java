package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.UserFeedbackAnalytics;
import p015cm.aptoide.p016pt.ads.MoPubAdsManager;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.editorial.EditorialAnalytics;
import p015cm.aptoide.p016pt.editorial.EditorialManager;
import p015cm.aptoide.p016pt.editorial.EditorialNavigator;
import p015cm.aptoide.p016pt.editorial.EditorialPresenter;
import p015cm.aptoide.p016pt.socialmedia.SocialMediaAnalytics;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesEditorialPresenterFactory */
public final class FragmentModule_ProvidesEditorialPresenterFactory implements C10824b<EditorialPresenter> {
    private final Provider<CrashReport> crashReportProvider;
    private final Provider<EditorialAnalytics> editorialAnalyticsProvider;
    private final Provider<EditorialManager> editorialManagerProvider;
    private final Provider<EditorialNavigator> editorialNavigatorProvider;
    private final Provider<MoPubAdsManager> moPubAdsManagerProvider;
    private final FragmentModule module;
    private final Provider<SocialMediaAnalytics> socialMediaAnalyticsProvider;
    private final Provider<UserFeedbackAnalytics> userFeedbackAnalyticsProvider;

    public FragmentModule_ProvidesEditorialPresenterFactory(FragmentModule fragmentModule, Provider<EditorialManager> provider, Provider<CrashReport> provider2, Provider<EditorialAnalytics> provider3, Provider<EditorialNavigator> provider4, Provider<UserFeedbackAnalytics> provider5, Provider<MoPubAdsManager> provider6, Provider<SocialMediaAnalytics> provider7) {
        this.module = fragmentModule;
        this.editorialManagerProvider = provider;
        this.crashReportProvider = provider2;
        this.editorialAnalyticsProvider = provider3;
        this.editorialNavigatorProvider = provider4;
        this.userFeedbackAnalyticsProvider = provider5;
        this.moPubAdsManagerProvider = provider6;
        this.socialMediaAnalyticsProvider = provider7;
    }

    public static FragmentModule_ProvidesEditorialPresenterFactory create(FragmentModule fragmentModule, Provider<EditorialManager> provider, Provider<CrashReport> provider2, Provider<EditorialAnalytics> provider3, Provider<EditorialNavigator> provider4, Provider<UserFeedbackAnalytics> provider5, Provider<MoPubAdsManager> provider6, Provider<SocialMediaAnalytics> provider7) {
        return new FragmentModule_ProvidesEditorialPresenterFactory(fragmentModule, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static EditorialPresenter providesEditorialPresenter(FragmentModule fragmentModule, EditorialManager editorialManager, CrashReport crashReport, EditorialAnalytics editorialAnalytics, EditorialNavigator editorialNavigator, UserFeedbackAnalytics userFeedbackAnalytics, MoPubAdsManager moPubAdsManager, SocialMediaAnalytics socialMediaAnalytics) {
        EditorialPresenter providesEditorialPresenter = fragmentModule.providesEditorialPresenter(editorialManager, crashReport, editorialAnalytics, editorialNavigator, userFeedbackAnalytics, moPubAdsManager, socialMediaAnalytics);
        C10825c.m36718a(providesEditorialPresenter, "Cannot return null from a non-@Nullable @Provides method");
        return providesEditorialPresenter;
    }

    public EditorialPresenter get() {
        return providesEditorialPresenter(this.module, this.editorialManagerProvider.get(), this.crashReportProvider.get(), this.editorialAnalyticsProvider.get(), this.editorialNavigatorProvider.get(), this.userFeedbackAnalyticsProvider.get(), this.moPubAdsManagerProvider.get(), this.socialMediaAnalyticsProvider.get());
    }
}
