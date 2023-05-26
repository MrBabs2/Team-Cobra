package p015cm.aptoide.p016pt.permission;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.account.view.AccountNavigator;
import p015cm.aptoide.p016pt.navigator.ActivityResultNavigator_MembersInjector;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.permission.PermissionServiceActivity_MembersInjector */
public final class PermissionServiceActivity_MembersInjector implements C10822a<PermissionServiceActivity> {
    private final Provider<AccountNavigator> accountNavigatorProvider;
    private final Provider<String> marketNameProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public PermissionServiceActivity_MembersInjector(Provider<ThemeManager> provider, Provider<AccountNavigator> provider2, Provider<String> provider3) {
        this.themeManagerProvider = provider;
        this.accountNavigatorProvider = provider2;
        this.marketNameProvider = provider3;
    }

    public static C10822a<PermissionServiceActivity> create(Provider<ThemeManager> provider, Provider<AccountNavigator> provider2, Provider<String> provider3) {
        return new PermissionServiceActivity_MembersInjector(provider, provider2, provider3);
    }

    public void injectMembers(PermissionServiceActivity permissionServiceActivity) {
        ActivityResultNavigator_MembersInjector.injectThemeManager(permissionServiceActivity, this.themeManagerProvider.get());
        ActivityResultNavigator_MembersInjector.injectAccountNavigator(permissionServiceActivity, this.accountNavigatorProvider.get());
        ActivityResultNavigator_MembersInjector.injectMarketName(permissionServiceActivity, this.marketNameProvider.get());
    }
}
