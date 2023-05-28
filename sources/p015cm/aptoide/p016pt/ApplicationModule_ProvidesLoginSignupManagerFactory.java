package p015cm.aptoide.p016pt;

import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesLoginSignupManagerFactory */
public final class ApplicationModule_ProvidesLoginSignupManagerFactory implements C10824b<LoginSignupManager> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesLoginSignupManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesLoginSignupManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesLoginSignupManagerFactory(applicationModule);
    }

    public static LoginSignupManager providesLoginSignupManager(ApplicationModule applicationModule) {
        LoginSignupManager providesLoginSignupManager = applicationModule.providesLoginSignupManager();
        C10825c.m36718a(providesLoginSignupManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesLoginSignupManager;
    }

    public LoginSignupManager get() {
        return providesLoginSignupManager(this.module);
    }
}
