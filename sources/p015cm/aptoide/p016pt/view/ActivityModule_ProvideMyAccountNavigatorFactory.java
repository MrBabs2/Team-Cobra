package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.account.view.AccountNavigator;
import p015cm.aptoide.p016pt.app.AppNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.socialmedia.SocialMediaNavigator;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.view.settings.MyAccountNavigator;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvideMyAccountNavigatorFactory */
public final class ActivityModule_ProvideMyAccountNavigatorFactory implements C10824b<MyAccountNavigator> {
    private final Provider<AccountNavigator> accountNavigatorProvider;
    private final Provider<AppNavigator> appNavigatorProvider;
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final ActivityModule module;
    private final Provider<SocialMediaNavigator> socialMediaNavigatorProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public ActivityModule_ProvideMyAccountNavigatorFactory(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<AccountNavigator> provider2, Provider<AppNavigator> provider3, Provider<ThemeManager> provider4, Provider<SocialMediaNavigator> provider5) {
        this.module = activityModule;
        this.fragmentNavigatorProvider = provider;
        this.accountNavigatorProvider = provider2;
        this.appNavigatorProvider = provider3;
        this.themeManagerProvider = provider4;
        this.socialMediaNavigatorProvider = provider5;
    }

    public static ActivityModule_ProvideMyAccountNavigatorFactory create(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<AccountNavigator> provider2, Provider<AppNavigator> provider3, Provider<ThemeManager> provider4, Provider<SocialMediaNavigator> provider5) {
        return new ActivityModule_ProvideMyAccountNavigatorFactory(activityModule, provider, provider2, provider3, provider4, provider5);
    }

    public static MyAccountNavigator provideMyAccountNavigator(ActivityModule activityModule, FragmentNavigator fragmentNavigator, AccountNavigator accountNavigator, AppNavigator appNavigator, ThemeManager themeManager, SocialMediaNavigator socialMediaNavigator) {
        MyAccountNavigator provideMyAccountNavigator = activityModule.provideMyAccountNavigator(fragmentNavigator, accountNavigator, appNavigator, themeManager, socialMediaNavigator);
        C10825c.m36718a(provideMyAccountNavigator, "Cannot return null from a non-@Nullable @Provides method");
        return provideMyAccountNavigator;
    }

    public MyAccountNavigator get() {
        return provideMyAccountNavigator(this.module, this.fragmentNavigatorProvider.get(), this.accountNavigatorProvider.get(), this.appNavigatorProvider.get(), this.themeManagerProvider.get(), this.socialMediaNavigatorProvider.get());
    }
}
