package p015cm.aptoide.p016pt.view;

import com.facebook.C6365d;
import com.google.android.gms.common.api.GoogleApiClient;
import javax.inject.Provider;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.account.view.AccountNavigator;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvideAccountNavigatorFactory */
public final class ActivityModule_ProvideAccountNavigatorFactory implements C10824b<AccountNavigator> {
    private final Provider<AccountAnalytics> accountAnalyticsProvider;
    private final Provider<AptoideAccountManager> accountManagerProvider;
    private final Provider<BottomNavigationNavigator> bottomNavigationNavigatorProvider;
    private final Provider<C6365d> callbackManagerProvider;
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final Provider<GoogleApiClient> googleApiClientProvider;
    private final ActivityModule module;
    private final Provider<ThemeManager> themeManagerProvider;

    public ActivityModule_ProvideAccountNavigatorFactory(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<AptoideAccountManager> provider2, Provider<C6365d> provider3, Provider<GoogleApiClient> provider4, Provider<AccountAnalytics> provider5, Provider<BottomNavigationNavigator> provider6, Provider<ThemeManager> provider7) {
        this.module = activityModule;
        this.fragmentNavigatorProvider = provider;
        this.accountManagerProvider = provider2;
        this.callbackManagerProvider = provider3;
        this.googleApiClientProvider = provider4;
        this.accountAnalyticsProvider = provider5;
        this.bottomNavigationNavigatorProvider = provider6;
        this.themeManagerProvider = provider7;
    }

    public static ActivityModule_ProvideAccountNavigatorFactory create(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<AptoideAccountManager> provider2, Provider<C6365d> provider3, Provider<GoogleApiClient> provider4, Provider<AccountAnalytics> provider5, Provider<BottomNavigationNavigator> provider6, Provider<ThemeManager> provider7) {
        return new ActivityModule_ProvideAccountNavigatorFactory(activityModule, provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static AccountNavigator provideAccountNavigator(ActivityModule activityModule, FragmentNavigator fragmentNavigator, AptoideAccountManager aptoideAccountManager, C6365d dVar, GoogleApiClient googleApiClient, AccountAnalytics accountAnalytics, BottomNavigationNavigator bottomNavigationNavigator, ThemeManager themeManager) {
        AccountNavigator provideAccountNavigator = activityModule.provideAccountNavigator(fragmentNavigator, aptoideAccountManager, dVar, googleApiClient, accountAnalytics, bottomNavigationNavigator, themeManager);
        C10825c.m36718a(provideAccountNavigator, "Cannot return null from a non-@Nullable @Provides method");
        return provideAccountNavigator;
    }

    public AccountNavigator get() {
        return provideAccountNavigator(this.module, this.fragmentNavigatorProvider.get(), this.accountManagerProvider.get(), this.callbackManagerProvider.get(), this.googleApiClientProvider.get(), this.accountAnalyticsProvider.get(), this.bottomNavigationNavigatorProvider.get(), this.themeManagerProvider.get());
    }
}
