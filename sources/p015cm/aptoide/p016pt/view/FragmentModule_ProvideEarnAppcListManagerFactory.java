package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.home.more.appcoins.EarnAppcListManager;
import p015cm.aptoide.p016pt.wallet.WalletAppProvider;
import p015cm.aptoide.p016pt.wallet.WalletInstallManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvideEarnAppcListManagerFactory */
public final class FragmentModule_ProvideEarnAppcListManagerFactory implements C10824b<EarnAppcListManager> {
    private final FragmentModule module;
    private final Provider<WalletAppProvider> walletAppProvider;
    private final Provider<WalletInstallManager> walletInstallManagerProvider;

    public FragmentModule_ProvideEarnAppcListManagerFactory(FragmentModule fragmentModule, Provider<WalletAppProvider> provider, Provider<WalletInstallManager> provider2) {
        this.module = fragmentModule;
        this.walletAppProvider = provider;
        this.walletInstallManagerProvider = provider2;
    }

    public static FragmentModule_ProvideEarnAppcListManagerFactory create(FragmentModule fragmentModule, Provider<WalletAppProvider> provider, Provider<WalletInstallManager> provider2) {
        return new FragmentModule_ProvideEarnAppcListManagerFactory(fragmentModule, provider, provider2);
    }

    public static EarnAppcListManager provideEarnAppcListManager(FragmentModule fragmentModule, WalletAppProvider walletAppProvider2, WalletInstallManager walletInstallManager) {
        EarnAppcListManager provideEarnAppcListManager = fragmentModule.provideEarnAppcListManager(walletAppProvider2, walletInstallManager);
        C10825c.m36718a(provideEarnAppcListManager, "Cannot return null from a non-@Nullable @Provides method");
        return provideEarnAppcListManager;
    }

    public EarnAppcListManager get() {
        return provideEarnAppcListManager(this.module, this.walletAppProvider.get(), this.walletInstallManagerProvider.get());
    }
}
