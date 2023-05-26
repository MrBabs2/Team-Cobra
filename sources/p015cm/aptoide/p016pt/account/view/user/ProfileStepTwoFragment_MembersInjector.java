package p015cm.aptoide.p016pt.account.view.user;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.LoginSignupManager;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.util.MarketResourceFormatter;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.account.view.user.ProfileStepTwoFragment_MembersInjector */
public final class ProfileStepTwoFragment_MembersInjector implements C10822a<ProfileStepTwoFragment> {
    private final Provider<AccountAnalytics> accountAnalyticsProvider;
    private final Provider<LoginSignupManager> loginSignupManagerProvider;
    private final Provider<MarketResourceFormatter> marketResourceFormatterProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public ProfileStepTwoFragment_MembersInjector(Provider<AccountAnalytics> provider, Provider<LoginSignupManager> provider2, Provider<MarketResourceFormatter> provider3, Provider<ThemeManager> provider4) {
        this.accountAnalyticsProvider = provider;
        this.loginSignupManagerProvider = provider2;
        this.marketResourceFormatterProvider = provider3;
        this.themeManagerProvider = provider4;
    }

    public static C10822a<ProfileStepTwoFragment> create(Provider<AccountAnalytics> provider, Provider<LoginSignupManager> provider2, Provider<MarketResourceFormatter> provider3, Provider<ThemeManager> provider4) {
        return new ProfileStepTwoFragment_MembersInjector(provider, provider2, provider3, provider4);
    }

    public static void injectAccountAnalytics(ProfileStepTwoFragment profileStepTwoFragment, AccountAnalytics accountAnalytics) {
        profileStepTwoFragment.accountAnalytics = accountAnalytics;
    }

    public static void injectLoginSignupManager(ProfileStepTwoFragment profileStepTwoFragment, LoginSignupManager loginSignupManager) {
        profileStepTwoFragment.loginSignupManager = loginSignupManager;
    }

    public static void injectMarketResourceFormatter(ProfileStepTwoFragment profileStepTwoFragment, MarketResourceFormatter marketResourceFormatter) {
        profileStepTwoFragment.marketResourceFormatter = marketResourceFormatter;
    }

    public static void injectThemeManager(ProfileStepTwoFragment profileStepTwoFragment, ThemeManager themeManager) {
        profileStepTwoFragment.themeManager = themeManager;
    }

    public void injectMembers(ProfileStepTwoFragment profileStepTwoFragment) {
        injectAccountAnalytics(profileStepTwoFragment, this.accountAnalyticsProvider.get());
        injectLoginSignupManager(profileStepTwoFragment, this.loginSignupManagerProvider.get());
        injectMarketResourceFormatter(profileStepTwoFragment, this.marketResourceFormatterProvider.get());
        injectThemeManager(profileStepTwoFragment, this.themeManagerProvider.get());
    }
}
