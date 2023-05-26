package p015cm.aptoide.p016pt.view;

import androidx.fragment.app.C0462h;
import java.util.Map;
import javax.inject.Provider;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.navigator.Result;
import p112n.p118g.p119b.C5303a;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvideMainFragmentNavigatorFactory */
public final class ActivityModule_ProvideMainFragmentNavigatorFactory implements C10824b<FragmentNavigator> {
    private final Provider<C0462h> fragmentManagerProvider;
    private final Provider<Map<Integer, Result>> fragmentResultMapProvider;
    private final Provider<C5303a<Map<Integer, Result>>> fragmentResultRelayProvider;
    private final ActivityModule module;

    public ActivityModule_ProvideMainFragmentNavigatorFactory(ActivityModule activityModule, Provider<Map<Integer, Result>> provider, Provider<C5303a<Map<Integer, Result>>> provider2, Provider<C0462h> provider3) {
        this.module = activityModule;
        this.fragmentResultMapProvider = provider;
        this.fragmentResultRelayProvider = provider2;
        this.fragmentManagerProvider = provider3;
    }

    public static ActivityModule_ProvideMainFragmentNavigatorFactory create(ActivityModule activityModule, Provider<Map<Integer, Result>> provider, Provider<C5303a<Map<Integer, Result>>> provider2, Provider<C0462h> provider3) {
        return new ActivityModule_ProvideMainFragmentNavigatorFactory(activityModule, provider, provider2, provider3);
    }

    public static FragmentNavigator provideMainFragmentNavigator(ActivityModule activityModule, Map<Integer, Result> map, C5303a<Map<Integer, Result>> aVar, C0462h hVar) {
        FragmentNavigator provideMainFragmentNavigator = activityModule.provideMainFragmentNavigator(map, aVar, hVar);
        C10825c.m36718a(provideMainFragmentNavigator, "Cannot return null from a non-@Nullable @Provides method");
        return provideMainFragmentNavigator;
    }

    public FragmentNavigator get() {
        return provideMainFragmentNavigator(this.module, this.fragmentResultMapProvider.get(), this.fragmentResultRelayProvider.get(), this.fragmentManagerProvider.get());
    }
}
