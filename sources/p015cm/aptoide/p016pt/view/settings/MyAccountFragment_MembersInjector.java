package p015cm.aptoide.p016pt.view.settings;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.MyAccountManager;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.socialmedia.SocialMediaAnalytics;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.view.settings.MyAccountFragment_MembersInjector */
public final class MyAccountFragment_MembersInjector implements C10822a<MyAccountFragment> {
    private final Provider<AccountAnalytics> accountAnalyticsProvider;
    private final Provider<String> marketNameProvider;
    private final Provider<MyAccountManager> myAccountManagerProvider;
    private final Provider<MyAccountNavigator> myAccountNavigatorProvider;
    private final Provider<SocialMediaAnalytics> socialMediaAnalyticsProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public MyAccountFragment_MembersInjector(Provider<MyAccountNavigator> provider, Provider<AccountAnalytics> provider2, Provider<MyAccountManager> provider3, Provider<String> provider4, Provider<ThemeManager> provider5, Provider<SocialMediaAnalytics> provider6) {
        this.myAccountNavigatorProvider = provider;
        this.accountAnalyticsProvider = provider2;
        this.myAccountManagerProvider = provider3;
        this.marketNameProvider = provider4;
        this.themeManagerProvider = provider5;
        this.socialMediaAnalyticsProvider = provider6;
    }

    public static C10822a<MyAccountFragment> create(Provider<MyAccountNavigator> provider, Provider<AccountAnalytics> provider2, Provider<MyAccountManager> provider3, Provider<String> provider4, Provider<ThemeManager> provider5, Provider<SocialMediaAnalytics> provider6) {
        return new MyAccountFragment_MembersInjector(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static void injectAccountAnalytics(MyAccountFragment myAccountFragment, AccountAnalytics accountAnalytics) {
        myAccountFragment.accountAnalytics = accountAnalytics;
    }

    public static void injectMarketName(MyAccountFragment myAccountFragment, String str) {
        myAccountFragment.marketName = str;
    }

    public static void injectMyAccountManager(MyAccountFragment myAccountFragment, MyAccountManager myAccountManager) {
        myAccountFragment.myAccountManager = myAccountManager;
    }

    public static void injectMyAccountNavigator(MyAccountFragment myAccountFragment, MyAccountNavigator myAccountNavigator) {
        myAccountFragment.myAccountNavigator = myAccountNavigator;
    }

    public static void injectSocialMediaAnalytics(MyAccountFragment myAccountFragment, SocialMediaAnalytics socialMediaAnalytics) {
        myAccountFragment.socialMediaAnalytics = socialMediaAnalytics;
    }

    public static void injectThemeManager(MyAccountFragment myAccountFragment, ThemeManager themeManager) {
        myAccountFragment.themeManager = themeManager;
    }

    public void injectMembers(MyAccountFragment myAccountFragment) {
        injectMyAccountNavigator(myAccountFragment, this.myAccountNavigatorProvider.get());
        injectAccountAnalytics(myAccountFragment, this.accountAnalyticsProvider.get());
        injectMyAccountManager(myAccountFragment, this.myAccountManagerProvider.get());
        injectMarketName(myAccountFragment, this.marketNameProvider.get());
        injectThemeManager(myAccountFragment, this.themeManagerProvider.get());
        injectSocialMediaAnalytics(myAccountFragment, this.socialMediaAnalyticsProvider.get());
    }
}
