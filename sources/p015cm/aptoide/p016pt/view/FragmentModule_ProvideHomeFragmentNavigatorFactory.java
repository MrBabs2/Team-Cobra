package p015cm.aptoide.p016pt.view;

import java.util.Map;
import javax.inject.Provider;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.navigator.Result;
import p112n.p118g.p119b.C5303a;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvideHomeFragmentNavigatorFactory */
public final class FragmentModule_ProvideHomeFragmentNavigatorFactory implements C10824b<FragmentNavigator> {
    private final Provider<Map<Integer, Result>> fragmentResultMapProvider;
    private final Provider<C5303a<Map<Integer, Result>>> fragmentResultRelayProvider;
    private final FragmentModule module;

    public FragmentModule_ProvideHomeFragmentNavigatorFactory(FragmentModule fragmentModule, Provider<Map<Integer, Result>> provider, Provider<C5303a<Map<Integer, Result>>> provider2) {
        this.module = fragmentModule;
        this.fragmentResultMapProvider = provider;
        this.fragmentResultRelayProvider = provider2;
    }

    public static FragmentModule_ProvideHomeFragmentNavigatorFactory create(FragmentModule fragmentModule, Provider<Map<Integer, Result>> provider, Provider<C5303a<Map<Integer, Result>>> provider2) {
        return new FragmentModule_ProvideHomeFragmentNavigatorFactory(fragmentModule, provider, provider2);
    }

    public static FragmentNavigator provideHomeFragmentNavigator(FragmentModule fragmentModule, Map<Integer, Result> map, C5303a<Map<Integer, Result>> aVar) {
        FragmentNavigator provideHomeFragmentNavigator = fragmentModule.provideHomeFragmentNavigator(map, aVar);
        C10825c.m36718a(provideHomeFragmentNavigator, "Cannot return null from a non-@Nullable @Provides method");
        return provideHomeFragmentNavigator;
    }

    public FragmentNavigator get() {
        return provideHomeFragmentNavigator(this.module, this.fragmentResultMapProvider.get(), this.fragmentResultRelayProvider.get());
    }
}
