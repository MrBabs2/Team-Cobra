package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.download.view.DownloadNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesDownloadNavigatorFactory */
public final class FragmentModule_ProvidesDownloadNavigatorFactory implements C10824b<DownloadNavigator> {
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final FragmentModule module;

    public FragmentModule_ProvidesDownloadNavigatorFactory(FragmentModule fragmentModule, Provider<FragmentNavigator> provider) {
        this.module = fragmentModule;
        this.fragmentNavigatorProvider = provider;
    }

    public static FragmentModule_ProvidesDownloadNavigatorFactory create(FragmentModule fragmentModule, Provider<FragmentNavigator> provider) {
        return new FragmentModule_ProvidesDownloadNavigatorFactory(fragmentModule, provider);
    }

    public static DownloadNavigator providesDownloadNavigator(FragmentModule fragmentModule, FragmentNavigator fragmentNavigator) {
        DownloadNavigator providesDownloadNavigator = fragmentModule.providesDownloadNavigator(fragmentNavigator);
        C10825c.m36718a(providesDownloadNavigator, "Cannot return null from a non-@Nullable @Provides method");
        return providesDownloadNavigator;
    }

    public DownloadNavigator get() {
        return providesDownloadNavigator(this.module, this.fragmentNavigatorProvider.get());
    }
}
