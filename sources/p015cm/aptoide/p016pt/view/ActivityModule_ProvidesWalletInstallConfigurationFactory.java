package p015cm.aptoide.p016pt.view;

import p015cm.aptoide.p016pt.wallet.WalletInstallConfiguration;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvidesWalletInstallConfigurationFactory */
public final class ActivityModule_ProvidesWalletInstallConfigurationFactory implements C10824b<WalletInstallConfiguration> {
    private final ActivityModule module;

    public ActivityModule_ProvidesWalletInstallConfigurationFactory(ActivityModule activityModule) {
        this.module = activityModule;
    }

    public static ActivityModule_ProvidesWalletInstallConfigurationFactory create(ActivityModule activityModule) {
        return new ActivityModule_ProvidesWalletInstallConfigurationFactory(activityModule);
    }

    public static WalletInstallConfiguration providesWalletInstallConfiguration(ActivityModule activityModule) {
        WalletInstallConfiguration providesWalletInstallConfiguration = activityModule.providesWalletInstallConfiguration();
        C10825c.m36718a(providesWalletInstallConfiguration, "Cannot return null from a non-@Nullable @Provides method");
        return providesWalletInstallConfiguration;
    }

    public WalletInstallConfiguration get() {
        return providesWalletInstallConfiguration(this.module);
    }
}
