package p015cm.aptoide.p016pt.view;

import p015cm.aptoide.p016pt.home.more.appcoins.EarnAppcListConfiguration;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesListAppsConfigurationFactory */
public final class FragmentModule_ProvidesListAppsConfigurationFactory implements C10824b<EarnAppcListConfiguration> {
    private final FragmentModule module;

    public FragmentModule_ProvidesListAppsConfigurationFactory(FragmentModule fragmentModule) {
        this.module = fragmentModule;
    }

    public static FragmentModule_ProvidesListAppsConfigurationFactory create(FragmentModule fragmentModule) {
        return new FragmentModule_ProvidesListAppsConfigurationFactory(fragmentModule);
    }

    public static EarnAppcListConfiguration providesListAppsConfiguration(FragmentModule fragmentModule) {
        EarnAppcListConfiguration providesListAppsConfiguration = fragmentModule.providesListAppsConfiguration();
        C10825c.m36718a(providesListAppsConfiguration, "Cannot return null from a non-@Nullable @Provides method");
        return providesListAppsConfiguration;
    }

    public EarnAppcListConfiguration get() {
        return providesListAppsConfiguration(this.module);
    }
}
