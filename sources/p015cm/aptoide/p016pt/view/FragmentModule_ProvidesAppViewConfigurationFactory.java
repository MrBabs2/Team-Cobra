package p015cm.aptoide.p016pt.view;

import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesAppViewConfigurationFactory */
public final class FragmentModule_ProvidesAppViewConfigurationFactory implements C10824b<AppViewConfiguration> {
    private final FragmentModule module;

    public FragmentModule_ProvidesAppViewConfigurationFactory(FragmentModule fragmentModule) {
        this.module = fragmentModule;
    }

    public static FragmentModule_ProvidesAppViewConfigurationFactory create(FragmentModule fragmentModule) {
        return new FragmentModule_ProvidesAppViewConfigurationFactory(fragmentModule);
    }

    public static AppViewConfiguration providesAppViewConfiguration(FragmentModule fragmentModule) {
        AppViewConfiguration providesAppViewConfiguration = fragmentModule.providesAppViewConfiguration();
        C10825c.m36718a(providesAppViewConfiguration, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppViewConfiguration;
    }

    public AppViewConfiguration get() {
        return providesAppViewConfiguration(this.module);
    }
}
