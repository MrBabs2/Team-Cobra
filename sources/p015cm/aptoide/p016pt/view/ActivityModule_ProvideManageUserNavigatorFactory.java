package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.account.view.user.ManageUserNavigator;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvideManageUserNavigatorFactory */
public final class ActivityModule_ProvideManageUserNavigatorFactory implements C10824b<ManageUserNavigator> {
    private final Provider<BottomNavigationNavigator> bottomNavigationNavigatorProvider;
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final ActivityModule module;

    public ActivityModule_ProvideManageUserNavigatorFactory(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<BottomNavigationNavigator> provider2) {
        this.module = activityModule;
        this.fragmentNavigatorProvider = provider;
        this.bottomNavigationNavigatorProvider = provider2;
    }

    public static ActivityModule_ProvideManageUserNavigatorFactory create(ActivityModule activityModule, Provider<FragmentNavigator> provider, Provider<BottomNavigationNavigator> provider2) {
        return new ActivityModule_ProvideManageUserNavigatorFactory(activityModule, provider, provider2);
    }

    public static ManageUserNavigator provideManageUserNavigator(ActivityModule activityModule, FragmentNavigator fragmentNavigator, BottomNavigationNavigator bottomNavigationNavigator) {
        ManageUserNavigator provideManageUserNavigator = activityModule.provideManageUserNavigator(fragmentNavigator, bottomNavigationNavigator);
        C10825c.m36718a(provideManageUserNavigator, "Cannot return null from a non-@Nullable @Provides method");
        return provideManageUserNavigator;
    }

    public ManageUserNavigator get() {
        return provideManageUserNavigator(this.module, this.fragmentNavigatorProvider.get(), this.bottomNavigationNavigatorProvider.get());
    }
}
