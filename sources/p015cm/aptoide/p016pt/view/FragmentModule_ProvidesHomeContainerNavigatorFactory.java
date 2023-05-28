package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.home.HomeContainerNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesHomeContainerNavigatorFactory */
public final class FragmentModule_ProvidesHomeContainerNavigatorFactory implements C10824b<HomeContainerNavigator> {
    private final Provider<FragmentNavigator> childFragmentNavigatorProvider;
    private final FragmentModule module;

    public FragmentModule_ProvidesHomeContainerNavigatorFactory(FragmentModule fragmentModule, Provider<FragmentNavigator> provider) {
        this.module = fragmentModule;
        this.childFragmentNavigatorProvider = provider;
    }

    public static FragmentModule_ProvidesHomeContainerNavigatorFactory create(FragmentModule fragmentModule, Provider<FragmentNavigator> provider) {
        return new FragmentModule_ProvidesHomeContainerNavigatorFactory(fragmentModule, provider);
    }

    public static HomeContainerNavigator providesHomeContainerNavigator(FragmentModule fragmentModule, FragmentNavigator fragmentNavigator) {
        HomeContainerNavigator providesHomeContainerNavigator = fragmentModule.providesHomeContainerNavigator(fragmentNavigator);
        C10825c.m36718a(providesHomeContainerNavigator, "Cannot return null from a non-@Nullable @Provides method");
        return providesHomeContainerNavigator;
    }

    public HomeContainerNavigator get() {
        return providesHomeContainerNavigator(this.module, this.childFragmentNavigatorProvider.get());
    }
}
