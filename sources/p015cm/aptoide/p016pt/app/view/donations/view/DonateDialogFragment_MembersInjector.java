package p015cm.aptoide.p016pt.app.view.donations.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.app.AppNavigator;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;
import p015cm.aptoide.p016pt.app.view.donations.WalletService;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.view.fragment.BaseDialogFragment_MembersInjector;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.app.view.donations.view.DonateDialogFragment_MembersInjector */
public final class DonateDialogFragment_MembersInjector implements C10822a<DonateDialogFragment> {
    private final Provider<AppNavigator> appNavigatorProvider;
    private final Provider<DonationsAnalytics> donationsAnalyticsProvider;
    private final Provider<ThemeManager> themeManagerProvider;
    private final Provider<WalletService> walletServiceProvider;

    public DonateDialogFragment_MembersInjector(Provider<ThemeManager> provider, Provider<WalletService> provider2, Provider<AppNavigator> provider3, Provider<DonationsAnalytics> provider4) {
        this.themeManagerProvider = provider;
        this.walletServiceProvider = provider2;
        this.appNavigatorProvider = provider3;
        this.donationsAnalyticsProvider = provider4;
    }

    public static C10822a<DonateDialogFragment> create(Provider<ThemeManager> provider, Provider<WalletService> provider2, Provider<AppNavigator> provider3, Provider<DonationsAnalytics> provider4) {
        return new DonateDialogFragment_MembersInjector(provider, provider2, provider3, provider4);
    }

    public static void injectAppNavigator(DonateDialogFragment donateDialogFragment, AppNavigator appNavigator) {
        donateDialogFragment.appNavigator = appNavigator;
    }

    public static void injectDonationsAnalytics(DonateDialogFragment donateDialogFragment, DonationsAnalytics donationsAnalytics) {
        donateDialogFragment.donationsAnalytics = donationsAnalytics;
    }

    public static void injectWalletService(DonateDialogFragment donateDialogFragment, WalletService walletService) {
        donateDialogFragment.walletService = walletService;
    }

    public void injectMembers(DonateDialogFragment donateDialogFragment) {
        BaseDialogFragment_MembersInjector.injectThemeManager(donateDialogFragment, this.themeManagerProvider.get());
        injectWalletService(donateDialogFragment, this.walletServiceProvider.get());
        injectAppNavigator(donateDialogFragment, this.appNavigatorProvider.get());
        injectDonationsAnalytics(donateDialogFragment, this.donationsAnalyticsProvider.get());
    }
}
