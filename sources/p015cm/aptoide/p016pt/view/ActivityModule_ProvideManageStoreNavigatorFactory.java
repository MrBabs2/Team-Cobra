package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.account.view.store.ManageStoreNavigator;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvideManageStoreNavigatorFactory */
public final class ActivityModule_ProvideManageStoreNavigatorFactory implements C10824b<ManageStoreNavigator> {
    private final Provider<BottomNavigationNavigator> bottomNavigationNavigatorProvider;
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final ActivityModule module;

    public ActivityModule_ProvideManageStoreNavigatorFactory(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<BottomNavigationNavigator> provider2) {
        this.module = activityModule;
        this.fragmentNavigatorProvider = provider;
        this.bottomNavigationNavigatorProvider = provider2;
    }

    public static ActivityModule_ProvideManageStoreNavigatorFactory create(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<BottomNavigationNavigator> provider2) {
        return new ActivityModule_ProvideManageStoreNavigatorFactory(activityModule, provider, provider2);
    }

    public static ManageStoreNavigator provideManageStoreNavigator(ActivityModule activityModule, FragmentNavigator fragmentNavigator, BottomNavigationNavigator bottomNavigationNavigator) {
        ManageStoreNavigator provideManageStoreNavigator = activityModule.provideManageStoreNavigator(fragmentNavigator, bottomNavigationNavigator);
        C10825c.m36718a(provideManageStoreNavigator, "Cannot return null from a non-@Nullable @Provides method");
        return provideManageStoreNavigator;
    }

    public ManageStoreNavigator get() {
        return provideManageStoreNavigator(this.module, this.fragmentNavigatorProvider.get(), this.bottomNavigationNavigatorProvider.get());
    }
}
