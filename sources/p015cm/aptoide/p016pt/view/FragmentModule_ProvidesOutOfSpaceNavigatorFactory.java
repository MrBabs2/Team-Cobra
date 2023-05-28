package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.download.view.outofspace.OutOfSpaceNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesOutOfSpaceNavigatorFactory */
public final class FragmentModule_ProvidesOutOfSpaceNavigatorFactory implements C10824b<OutOfSpaceNavigator> {
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final FragmentModule module;

    public FragmentModule_ProvidesOutOfSpaceNavigatorFactory(FragmentModule fragmentModule, Provider<FragmentNavigator> provider) {
        this.module = fragmentModule;
        this.fragmentNavigatorProvider = provider;
    }

    public static FragmentModule_ProvidesOutOfSpaceNavigatorFactory create(FragmentModule fragmentModule, Provider<FragmentNavigator> provider) {
        return new FragmentModule_ProvidesOutOfSpaceNavigatorFactory(fragmentModule, provider);
    }

    public static OutOfSpaceNavigator providesOutOfSpaceNavigator(FragmentModule fragmentModule, FragmentNavigator fragmentNavigator) {
        OutOfSpaceNavigator providesOutOfSpaceNavigator = fragmentModule.providesOutOfSpaceNavigator(fragmentNavigator);
        C10825c.m36718a(providesOutOfSpaceNavigator, "Cannot return null from a non-@Nullable @Provides method");
        return providesOutOfSpaceNavigator;
    }

    public OutOfSpaceNavigator get() {
        return providesOutOfSpaceNavigator(this.module, this.fragmentNavigatorProvider.get());
    }
}
