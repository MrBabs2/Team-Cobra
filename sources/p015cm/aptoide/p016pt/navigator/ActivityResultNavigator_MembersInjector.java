package p015cm.aptoide.p016pt.navigator;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.account.view.AccountNavigator;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.navigator.ActivityResultNavigator_MembersInjector */
public final class ActivityResultNavigator_MembersInjector implements C10822a<ActivityResultNavigator> {
    private final Provider<AccountNavigator> accountNavigatorProvider;
    private final Provider<String> marketNameProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public ActivityResultNavigator_MembersInjector(Provider<ThemeManager> provider, Provider<AccountNavigator> provider2, Provider<String> provider3) {
        this.themeManagerProvider = provider;
        this.accountNavigatorProvider = provider2;
        this.marketNameProvider = provider3;
    }

    public static C10822a<ActivityResultNavigator> create(Provider<ThemeManager> provider, Provider<AccountNavigator> provider2, Provider<String> provider3) {
        return new ActivityResultNavigator_MembersInjector(provider, provider2, provider3);
    }

    public static void injectAccountNavigator(ActivityResultNavigator activityResultNavigator, AccountNavigator accountNavigator) {
        activityResultNavigator.accountNavigator = accountNavigator;
    }

    public static void injectMarketName(ActivityResultNavigator activityResultNavigator, String str) {
        activityResultNavigator.marketName = str;
    }

    public static void injectThemeManager(ActivityResultNavigator activityResultNavigator, ThemeManager themeManager) {
        activityResultNavigator.themeManager = themeManager;
    }

    public void injectMembers(ActivityResultNavigator activityResultNavigator) {
        injectThemeManager(activityResultNavigator, this.themeManagerProvider.get());
        injectAccountNavigator(activityResultNavigator, this.accountNavigatorProvider.get());
        injectMarketName(activityResultNavigator, this.marketNameProvider.get());
    }
}
