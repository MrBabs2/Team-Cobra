package p015cm.aptoide.p016pt.permission;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.account.view.AccountNavigator;
import p015cm.aptoide.p016pt.navigator.ActivityResultNavigator_MembersInjector;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.permission.PermissionProviderActivity_MembersInjector */
public final class PermissionProviderActivity_MembersInjector implements C10822a<PermissionProviderActivity> {
    private final Provider<AccountNavigator> accountNavigatorProvider;
    private final Provider<String> marketNameProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public PermissionProviderActivity_MembersInjector(Provider<ThemeManager> provider, Provider<AccountNavigator> provider2, Provider<String> provider3) {
        this.themeManagerProvider = provider;
        this.accountNavigatorProvider = provider2;
        this.marketNameProvider = provider3;
    }

    public static C10822a<PermissionProviderActivity> create(Provider<ThemeManager> provider, Provider<AccountNavigator> provider2, Provider<String> provider3) {
        return new PermissionProviderActivity_MembersInjector(provider, provider2, provider3);
    }

    public void injectMembers(PermissionProviderActivity permissionProviderActivity) {
        ActivityResultNavigator_MembersInjector.injectThemeManager(permissionProviderActivity, this.themeManagerProvider.get());
        ActivityResultNavigator_MembersInjector.injectAccountNavigator(permissionProviderActivity, this.accountNavigatorProvider.get());
        ActivityResultNavigator_MembersInjector.injectMarketName(permissionProviderActivity, this.marketNameProvider.get());
    }
}
