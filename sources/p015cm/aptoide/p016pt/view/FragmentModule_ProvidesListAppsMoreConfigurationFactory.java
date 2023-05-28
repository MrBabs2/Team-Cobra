package p015cm.aptoide.p016pt.view;

import p015cm.aptoide.p016pt.home.more.apps.ListAppsConfiguration;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesListAppsMoreConfigurationFactory */
public final class FragmentModule_ProvidesListAppsMoreConfigurationFactory implements C10824b<ListAppsConfiguration> {
    private final FragmentModule module;

    public FragmentModule_ProvidesListAppsMoreConfigurationFactory(FragmentModule fragmentModule) {
        this.module = fragmentModule;
    }

    public static FragmentModule_ProvidesListAppsMoreConfigurationFactory create(FragmentModule fragmentModule) {
        return new FragmentModule_ProvidesListAppsMoreConfigurationFactory(fragmentModule);
    }

    public static ListAppsConfiguration providesListAppsMoreConfiguration(FragmentModule fragmentModule) {
        ListAppsConfiguration providesListAppsMoreConfiguration = fragmentModule.providesListAppsMoreConfiguration();
        C10825c.m36718a(providesListAppsMoreConfiguration, "Cannot return null from a non-@Nullable @Provides method");
        return providesListAppsMoreConfiguration;
    }

    public ListAppsConfiguration get() {
        return providesListAppsMoreConfiguration(this.module);
    }
}
