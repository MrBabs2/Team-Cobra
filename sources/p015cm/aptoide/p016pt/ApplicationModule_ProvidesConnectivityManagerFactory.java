package p015cm.aptoide.p016pt;

import android.net.ConnectivityManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesConnectivityManagerFactory */
public final class ApplicationModule_ProvidesConnectivityManagerFactory implements C10824b<ConnectivityManager> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesConnectivityManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesConnectivityManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesConnectivityManagerFactory(applicationModule);
    }

    public static ConnectivityManager providesConnectivityManager(ApplicationModule applicationModule) {
        ConnectivityManager providesConnectivityManager = applicationModule.providesConnectivityManager();
        C10825c.m36718a(providesConnectivityManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesConnectivityManager;
    }

    public ConnectivityManager get() {
        return providesConnectivityManager(this.module);
    }
}
