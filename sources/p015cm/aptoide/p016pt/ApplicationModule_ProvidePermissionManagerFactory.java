package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.actions.PermissionManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidePermissionManagerFactory */
public final class ApplicationModule_ProvidePermissionManagerFactory implements C10824b<PermissionManager> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidePermissionManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidePermissionManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidePermissionManagerFactory(applicationModule);
    }

    public static PermissionManager providePermissionManager(ApplicationModule applicationModule) {
        PermissionManager providePermissionManager = applicationModule.providePermissionManager();
        C10825c.m36718a(providePermissionManager, "Cannot return null from a non-@Nullable @Provides method");
        return providePermissionManager;
    }

    public PermissionManager get() {
        return providePermissionManager(this.module);
    }
}
