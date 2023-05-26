package p015cm.aptoide.p016pt;

import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesMyAccountManagerFactory */
public final class ApplicationModule_ProvidesMyAccountManagerFactory implements C10824b<MyAccountManager> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesMyAccountManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesMyAccountManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesMyAccountManagerFactory(applicationModule);
    }

    public static MyAccountManager providesMyAccountManager(ApplicationModule applicationModule) {
        MyAccountManager providesMyAccountManager = applicationModule.providesMyAccountManager();
        C10825c.m36718a(providesMyAccountManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesMyAccountManager;
    }

    public MyAccountManager get() {
        return providesMyAccountManager(this.module);
    }
}
