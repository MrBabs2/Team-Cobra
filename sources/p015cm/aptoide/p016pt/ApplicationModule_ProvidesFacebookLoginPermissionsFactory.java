package p015cm.aptoide.p016pt;

import java.util.List;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvidesFacebookLoginPermissionsFactory */
public final class ApplicationModule_ProvidesFacebookLoginPermissionsFactory implements C10824b<List<String>> {
    private final ApplicationModule module;

    public ApplicationModule_ProvidesFacebookLoginPermissionsFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvidesFacebookLoginPermissionsFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvidesFacebookLoginPermissionsFactory(applicationModule);
    }

    public static List<String> providesFacebookLoginPermissions(ApplicationModule applicationModule) {
        List<String> providesFacebookLoginPermissions = applicationModule.providesFacebookLoginPermissions();
        C10825c.m36718a(providesFacebookLoginPermissions, "Cannot return null from a non-@Nullable @Provides method");
        return providesFacebookLoginPermissions;
    }

    public List<String> get() {
        return providesFacebookLoginPermissions(this.module);
    }
}
