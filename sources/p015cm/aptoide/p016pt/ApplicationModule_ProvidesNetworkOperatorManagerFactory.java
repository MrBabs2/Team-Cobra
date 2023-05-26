package p015cm.aptoide.p016pt;

import android.telephony.TelephonyManager;
import javax.inject.Provider;
import p015cm.aptoide.p016pt.dataprovider.NetworkOperatorManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesNetworkOperatorManagerFactory */
public final class ApplicationModule_ProvidesNetworkOperatorManagerFactory implements C10824b<NetworkOperatorManager> {
    private final ApplicationModule module;
    private final Provider<TelephonyManager> telephonyManagerProvider;

    public ApplicationModule_ProvidesNetworkOperatorManagerFactory(ApplicationModule applicationModule, Provider<TelephonyManager> provider) {
        this.module = applicationModule;
        this.telephonyManagerProvider = provider;
    }

    public static ApplicationModule_ProvidesNetworkOperatorManagerFactory create(ApplicationModule applicationModule, Provider<TelephonyManager> provider) {
        return new ApplicationModule_ProvidesNetworkOperatorManagerFactory(applicationModule, provider);
    }

    public static NetworkOperatorManager providesNetworkOperatorManager(ApplicationModule applicationModule, TelephonyManager telephonyManager) {
        NetworkOperatorManager providesNetworkOperatorManager = applicationModule.providesNetworkOperatorManager(telephonyManager);
        C10825c.m36718a(providesNetworkOperatorManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesNetworkOperatorManager;
    }

    public NetworkOperatorManager get() {
        return providesNetworkOperatorManager(this.module, this.telephonyManagerProvider.get());
    }
}
