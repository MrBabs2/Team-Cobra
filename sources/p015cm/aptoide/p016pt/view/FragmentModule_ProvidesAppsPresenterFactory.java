package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.home.apps.AppsManager;
import p015cm.aptoide.p016pt.home.apps.AppsNavigator;
import p015cm.aptoide.p016pt.home.apps.AppsPresenter;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesAppsPresenterFactory */
public final class FragmentModule_ProvidesAppsPresenterFactory implements C10824b<AppsPresenter> {
    private final Provider<AppsManager> appsManagerProvider;
    private final Provider<AppsNavigator> appsNavigatorProvider;
    private final Provider<AptoideAccountManager> aptoideAccountManagerProvider;
    private final FragmentModule module;

    public FragmentModule_ProvidesAppsPresenterFactory(FragmentModule fragmentModule, Provider<AppsManager> provider, Provider<AptoideAccountManager> provider2, Provider<AppsNavigator> provider3) {
        this.module = fragmentModule;
        this.appsManagerProvider = provider;
        this.aptoideAccountManagerProvider = provider2;
        this.appsNavigatorProvider = provider3;
    }

    public static FragmentModule_ProvidesAppsPresenterFactory create(FragmentModule fragmentModule, Provider<AppsManager> provider, Provider<AptoideAccountManager> provider2, Provider<AppsNavigator> provider3) {
        return new FragmentModule_ProvidesAppsPresenterFactory(fragmentModule, provider, provider2, provider3);
    }

    public static AppsPresenter providesAppsPresenter(FragmentModule fragmentModule, AppsManager appsManager, AptoideAccountManager aptoideAccountManager, AppsNavigator appsNavigator) {
        AppsPresenter providesAppsPresenter = fragmentModule.providesAppsPresenter(appsManager, aptoideAccountManager, appsNavigator);
        C10825c.m36718a(providesAppsPresenter, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppsPresenter;
    }

    public AppsPresenter get() {
        return providesAppsPresenter(this.module, this.appsManagerProvider.get(), this.aptoideAccountManagerProvider.get(), this.appsNavigatorProvider.get());
    }
}
