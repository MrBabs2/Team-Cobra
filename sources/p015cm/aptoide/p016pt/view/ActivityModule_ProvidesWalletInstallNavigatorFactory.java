package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.wallet.WalletInstallNavigator;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvidesWalletInstallNavigatorFactory */
public final class ActivityModule_ProvidesWalletInstallNavigatorFactory implements C10824b<WalletInstallNavigator> {
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final ActivityModule module;

    public ActivityModule_ProvidesWalletInstallNavigatorFactory(ActivityModule activityModule, Provider<FragmentNavigator> provider) {
        this.module = activityModule;
        this.fragmentNavigatorProvider = provider;
    }

    public static ActivityModule_ProvidesWalletInstallNavigatorFactory create(ActivityModule activityModule, Provider<FragmentNavigator> provider) {
        return new ActivityModule_ProvidesWalletInstallNavigatorFactory(activityModule, provider);
    }

    public static WalletInstallNavigator providesWalletInstallNavigator(ActivityModule activityModule, FragmentNavigator fragmentNavigator) {
        WalletInstallNavigator providesWalletInstallNavigator = activityModule.providesWalletInstallNavigator(fragmentNavigator);
        C10825c.m36718a(providesWalletInstallNavigator, "Cannot return null from a non-@Nullable @Provides method");
        return providesWalletInstallNavigator;
    }

    public WalletInstallNavigator get() {
        return providesWalletInstallNavigator(this.module, this.fragmentNavigatorProvider.get());
    }
}
