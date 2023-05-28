package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.app.FlagManager;
import p015cm.aptoide.p016pt.app.FlagService;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesFlagManagerFactory */
public final class FragmentModule_ProvidesFlagManagerFactory implements C10824b<FlagManager> {
    private final Provider<FlagService> flagServiceProvider;
    private final FragmentModule module;

    public FragmentModule_ProvidesFlagManagerFactory(FragmentModule fragmentModule, Provider<FlagService> provider) {
        this.module = fragmentModule;
        this.flagServiceProvider = provider;
    }

    public static FragmentModule_ProvidesFlagManagerFactory create(FragmentModule fragmentModule, Provider<FlagService> provider) {
        return new FragmentModule_ProvidesFlagManagerFactory(fragmentModule, provider);
    }

    public static FlagManager providesFlagManager(FragmentModule fragmentModule, FlagService flagService) {
        FlagManager providesFlagManager = fragmentModule.providesFlagManager(flagService);
        C10825c.m36718a(providesFlagManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesFlagManager;
    }

    public FlagManager get() {
        return providesFlagManager(this.module, this.flagServiceProvider.get());
    }
}
