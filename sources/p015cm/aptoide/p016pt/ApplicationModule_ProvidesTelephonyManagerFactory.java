package p015cm.aptoide.p016pt;

import android.telephony.TelephonyManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesTelephonyManagerFactory */
public final class ApplicationModule_ProvidesTelephonyManagerFactory implements C10824b<TelephonyManager> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesTelephonyManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesTelephonyManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesTelephonyManagerFactory(applicationModule);
    }

    public static TelephonyManager providesTelephonyManager(ApplicationModule applicationModule) {
        TelephonyManager providesTelephonyManager = applicationModule.providesTelephonyManager();
        C10825c.m36718a(providesTelephonyManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesTelephonyManager;
    }

    public TelephonyManager get() {
        return providesTelephonyManager(this.module);
    }
}
