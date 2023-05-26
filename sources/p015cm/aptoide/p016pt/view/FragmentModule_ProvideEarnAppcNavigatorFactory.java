package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.home.more.appcoins.EarnAppcNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvideEarnAppcNavigatorFactory */
public final class FragmentModule_ProvideEarnAppcNavigatorFactory implements C10824b<EarnAppcNavigator> {
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final FragmentModule module;

    public FragmentModule_ProvideEarnAppcNavigatorFactory(FragmentModule fragmentModule, Provider<FragmentNavigator> provider) {
        this.module = fragmentModule;
        this.fragmentNavigatorProvider = provider;
    }

    public static FragmentModule_ProvideEarnAppcNavigatorFactory create(FragmentModule fragmentModule, Provider<FragmentNavigator> provider) {
        return new FragmentModule_ProvideEarnAppcNavigatorFactory(fragmentModule, provider);
    }

    public static EarnAppcNavigator provideEarnAppcNavigator(FragmentModule fragmentModule, FragmentNavigator fragmentNavigator) {
        EarnAppcNavigator provideEarnAppcNavigator = fragmentModule.provideEarnAppcNavigator(fragmentNavigator);
        C10825c.m36718a(provideEarnAppcNavigator, "Cannot return null from a non-@Nullable @Provides method");
        return provideEarnAppcNavigator;
    }

    public EarnAppcNavigator get() {
        return provideEarnAppcNavigator(this.module, this.fragmentNavigatorProvider.get());
    }
}
