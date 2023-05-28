package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;
import p015cm.aptoide.p016pt.home.more.appcoins.EarnAppcListAnalytics;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvideEarnAppcListAnalyticsFactory */
public final class FragmentModule_ProvideEarnAppcListAnalyticsFactory implements C10824b<EarnAppcListAnalytics> {
    private final Provider<DownloadAnalytics> downloadAnalyticsProvider;
    private final FragmentModule module;

    public FragmentModule_ProvideEarnAppcListAnalyticsFactory(FragmentModule fragmentModule, Provider<DownloadAnalytics> provider) {
        this.module = fragmentModule;
        this.downloadAnalyticsProvider = provider;
    }

    public static FragmentModule_ProvideEarnAppcListAnalyticsFactory create(FragmentModule fragmentModule, Provider<DownloadAnalytics> provider) {
        return new FragmentModule_ProvideEarnAppcListAnalyticsFactory(fragmentModule, provider);
    }

    public static EarnAppcListAnalytics provideEarnAppcListAnalytics(FragmentModule fragmentModule, DownloadAnalytics downloadAnalytics) {
        EarnAppcListAnalytics provideEarnAppcListAnalytics = fragmentModule.provideEarnAppcListAnalytics(downloadAnalytics);
        C10825c.m36718a(provideEarnAppcListAnalytics, "Cannot return null from a non-@Nullable @Provides method");
        return provideEarnAppcListAnalytics;
    }

    public EarnAppcListAnalytics get() {
        return provideEarnAppcListAnalytics(this.module, this.downloadAnalyticsProvider.get());
    }
}
