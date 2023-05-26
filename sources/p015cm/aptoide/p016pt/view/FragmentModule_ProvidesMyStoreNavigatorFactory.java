package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationMapper;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.store.view.p028my.MyStoresNavigator;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesMyStoreNavigatorFactory */
public final class FragmentModule_ProvidesMyStoreNavigatorFactory implements C10824b<MyStoresNavigator> {
    private final Provider<BottomNavigationMapper> bottomNavigationMapperProvider;
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final FragmentModule module;

    public FragmentModule_ProvidesMyStoreNavigatorFactory(FragmentModule fragmentModule, Provider<FragmentNavigator> provider, Provider<BottomNavigationMapper> provider2) {
        this.module = fragmentModule;
        this.fragmentNavigatorProvider = provider;
        this.bottomNavigationMapperProvider = provider2;
    }

    public static FragmentModule_ProvidesMyStoreNavigatorFactory create(FragmentModule fragmentModule, Provider<FragmentNavigator> provider, Provider<BottomNavigationMapper> provider2) {
        return new FragmentModule_ProvidesMyStoreNavigatorFactory(fragmentModule, provider, provider2);
    }

    public static MyStoresNavigator providesMyStoreNavigator(FragmentModule fragmentModule, FragmentNavigator fragmentNavigator, BottomNavigationMapper bottomNavigationMapper) {
        MyStoresNavigator providesMyStoreNavigator = fragmentModule.providesMyStoreNavigator(fragmentNavigator, bottomNavigationMapper);
        C10825c.m36718a(providesMyStoreNavigator, "Cannot return null from a non-@Nullable @Provides method");
        return providesMyStoreNavigator;
    }

    public MyStoresNavigator get() {
        return providesMyStoreNavigator(this.module, this.fragmentNavigatorProvider.get(), this.bottomNavigationMapperProvider.get());
    }
}
