package p015cm.aptoide.p016pt;

import android.view.WindowManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.ApplicationModule_ProvideWindowManagerFactory */
public final class ApplicationModule_ProvideWindowManagerFactory implements C10824b<WindowManager> {
    private final ApplicationModule module;

    public ApplicationModule_ProvideWindowManagerFactory(ApplicationModule applicationModule) {
        this.module = applicationModule;
    }

    public static ApplicationModule_ProvideWindowManagerFactory create(ApplicationModule applicationModule) {
        return new ApplicationModule_ProvideWindowManagerFactory(applicationModule);
    }

    public static WindowManager provideWindowManager(ApplicationModule applicationModule) {
        WindowManager provideWindowManager = applicationModule.provideWindowManager();
        C10825c.m36718a(provideWindowManager, "Cannot return null from a non-@Nullable @Provides method");
        return provideWindowManager;
    }

    public WindowManager get() {
        return provideWindowManager(this.module);
    }
}
